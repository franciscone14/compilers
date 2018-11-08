package main;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main (String[] args) throws IOException {
        //A classe de entrada é passada como um argumento na chamada do java
        //Para executar na linha de comando faça: java -jar Lexical.jar "/home/path/Class.java"
        //Para testar na IDE, va em Run->Edit Configurations->Program Arguments e coloque o caminho,
        //para a pasta lo campo entre aspas EX: "/home/user/Teste.java"
        String fileName = "/home/franciscone/Teste.java";

        FileReader lexerTokens = new FileReader("src/main/JavaLexer.tokens");
        BufferedReader br = new BufferedReader(lexerTokens);

        String line;
        Hashtable<String, Integer> types = new Hashtable<String, Integer>();
        while((line = br.readLine()) != null){
            String[] values = line.split("=");
            types.put(values[0], Integer.parseInt(values[values.length - 1]));
        }

        //Criar o arquivo
        File file = new File(fileName);
        //Criar o buffer de leitura do arquivo
        FileInputStream fis = null;

        fis = new FileInputStream(file);
        //Cria a classe do ANTLR para ler o arquivo
        ANTLRInputStream input = new ANTLRInputStream(fis);
        //Cria a classe do analisador sintatico gerado pelo ANTLR (Gerada pelo arquivo JavaLexer.g4)
        JavaLexer scanner = new JavaLexer(input);
        //Cria a classe que recebe os tokens analisados
        CommonTokenStream allTokensGenerated = new CommonTokenStream(scanner);
        int data = allTokensGenerated.getNumberOfOnChannelTokens();
        List<Token> geral = allTokensGenerated.getTokens();

        //Chamada do metodo que lê os tokens e gera o arquivo .dot para criar o automato
        // a chamada allTokensGenerated.getTokens retorna uma List<Token>
        boolean compiled = true;
        for (Token token: geral){
            //54 é o identificador do tipo erro
            if(token.getType() == types.get("ERRO")){
                //System.out.print(token.getText());
                System.out.print("ERRO na linha: " + token.getLine() + " coluna: " + token.getCharPositionInLine() + "\n");
                compiled = false;
            }
        }
        if(compiled){
            Main.generateAutomata(allTokensGenerated.getTokens());
            Main.createSymbolsTable(allTokensGenerated.getTokens(), types);
        }
        else{
            System.out.println("Compilação falhou !");
        }

        JavaParser parser = new JavaParser(allTokensGenerated);
        parser.setBuildParseTree(true);

        JavaParserBaseVisitor visitor = new JavaParserBaseVisitor();
        JavaParser.CompilationUnitContext tree = parser.compilationUnit();
        System.out.println(tree.toStringTree(parser));
//
//        JavaParserBaseListener printer = new JavaParserBaseListener();
//        ParseTreeWalker.DEFAULT.walk(printer, tree);
    }

    //Metodo para criar a tabela de simbolos
    public static void createSymbolsTable(List<Token> listOfTokens, Hashtable<String, Integer> types){
        //Hash que representa a tabela
        Hashtable<Integer, String> symbolsTable = new Hashtable<Integer, String>();

        //É gerado um numero inteiro aleatorio para simular o endereço de memória na Hash
        Random random = new Random();
        int baseAddress = random.nextInt(1000000);
        int cont = 0;

        //Array de tokens usando uma classe token personalizada
        ArrayList<MyToken> tokens = new ArrayList<MyToken>();

        for (Token token: listOfTokens){

		    /*
		    Se o tipo do token for ID(53), String(52) ou Numero(3) e o valor NÂO ESTIVER na tabela de simbolos,
		    o valor é adicionado a tabela e inserido na lista.
		     */
            if(((token.getType() == types.get("ID")) || (token.getType() == types.get("STRING")) || (token.getType() == types.get("NUMERO"))) && (!symbolsTable.contains(token.getText()))){
                symbolsTable.put((baseAddress + cont), token.getText()); //Insere na Hash
                //Cria um novo token com base na varivel token do for
                MyToken t = new MyToken(String.valueOf(token.getType()),String.valueOf(baseAddress + cont));
                cont++;
                tokens.add(t);
            }
			/*
		    Se o tipo do token for ID(53), String(52) ou Numero(3) e o valor ESTIVER na tabela de simbolos,
		    o valor do endereço é buscado e atribuido ao Token
		     */
            else if(((token.getType() == types.get("ID")) || (token.getType() == types.get("STRING")) || (token.getType() == types.get("NUMERO"))) && (symbolsTable.contains(token.getText()))){
                int addr = 0;
                boolean notFound = true;

                for(int i = 0; i <= cont && notFound; i++){
                    if(symbolsTable.get(baseAddress + i).equals(token.getText())){
                        addr = baseAddress + i;
                        notFound = false;
                    }
                }
                MyToken t = new MyToken(String.valueOf(token.getType()),String.valueOf(addr));
                tokens.add(t);
            }
            //Se o valor for um outro tipo de Token a unica operação feita é adicionar na lista
            else {
                MyToken t = new MyToken(String.valueOf(token.getType()), String.valueOf(token.getText()));
                tokens.add(t);
            }
        }
        //Cria o arquivo com as Tabelas
        FileWriter fr = null;
        BufferedWriter bw = null;
        try {
            fr = new FileWriter("table_tokens.txt");
            bw = new BufferedWriter(fr);
            //Cabecalho da tabela de simbolos
            bw.write("Tabela de simbolos:\n");
            bw.write("ADDR\tVALUE\n");
            //Escreve os valores na tabela de simbolos
            for(int i = 0; i <= cont; i++){
                bw.write((baseAddress + i) + "\t" + symbolsTable.get((baseAddress + i))+"\n");
            }
            //Cabecalho tabela de tokens
            bw.write("\n\nTokens:\n");
            bw.write("TIPO\tVALOR\n");
            //Escreve cada Token
            for (MyToken t: tokens){
                bw.write(t.getType() + "\t" + t.getValue()+"\n");
            }
            bw.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    /*
    Metodo usado pelo meotodo generateAutmata para procurar uma substring existente no automato
    e aproveitar os estados ja criados

    Foi criada uma Classe AutomataToken para representar o token no automato e facilitar a manipulação
    dos dados
     */
    private static int searchToken(ArrayList<AutomataToken> list, String value){
        //Variaveis de controle
        int returnValue = -1;
        int preTam = -1;
        boolean notFound = true;

        //Percorre a lista de tokens ja adicionados no automato e procura uma correspondencia
        for(int i = 0; i < list.size(); i++){
            notFound = true;
            for (int j = 0; j < value.length() && notFound; j++){
                int indexStr = list.get(i).getValue().indexOf(value.substring(0, value.length() - j));
                if ((indexStr == 0) && ((value.length() - j) > preTam)){
                    preTam = value.length() - j;
                    returnValue = i;
                    notFound = false;
                }
            }
        }
        return returnValue;
    }

    //Gera o automato no formato .dot
    private static void generateAutomata(@NotNull List<Token> tokens){
        //Cabecalho do automato
        String header = "digraph G { \n ";
        //Estados finais
        String finalStates = "\tnode [shape = doublecircle];\n";
        //Lista de tokens do tipo automato
        ArrayList<AutomataToken> list = new ArrayList<AutomataToken>();
        //Corpo que define as transições de estado do automato
        String data = "\tnode [shape = circle]; \n";
        int cont = 0;

        for(Token token: tokens){
            if(token.getType() != -1){
                int QI = 0; //Estado inicial token

                //Index que define se existe uma substring para o token no automato
                int index = Main.searchToken(list, token.getText());
                if(index != -1){
                    //Pega o valor encontrado na lista
                    String text = list.get(index).getValue();

                    //Variaveis de controle
                    boolean notFound = true;
                    int tokenSize = token.getText().length();
                    int pos = 0, i = 0;

                    //Procura a posição do automato
                    for(i = 0; i < tokenSize && notFound; i++){
                        pos = text.indexOf(token.getText().substring(0, tokenSize - i));
                        if(pos != -1) notFound = false;
                    }
                    QI = list.get(index).getLastQ() - ((list.get(index).getValue().length() - tokenSize) + i - 1);

                    if(i != 1) i--;
                    data += "\tQ" + QI + " -> Q" + (cont + 1) + " [label=\"" + token.getText().charAt((tokenSize - i)) + "\"];\n";
                    cont++;
                    for(int j = ((tokenSize - i) + 1); j < token.getText().length(); j++) {
                        data += "\tQ" + cont + " -> Q" + (cont + 1) + " [label=\"" + token.getText().charAt(j) + "\"];\n";
                        cont++;
                    }
                    AutomataToken t = new AutomataToken(token.getText(), QI, cont);
                    list.add(t);

                }else{
                    if(token.getText().charAt(0) == '"')
                        data += "\tQ" + QI + " -> Q" + (cont + 1) + " [label=\"\\" + token.getText().charAt(0) + "\"];\n";
                    else
                        data += "\tQ" + QI + " -> Q" + (cont + 1) + " [label=\"" + token.getText().charAt(0) + "\"];\n";
                    cont++;
                    for(int i = 1; i < token.getText().length(); i++) {
                        if(token.getText().charAt(i) == '"')
                            data += "\tQ" + cont + " -> Q" + (cont + 1) + " [label=\"\\" + token.getText().charAt(i) + "\"];\n";
                        else
                            data += "\tQ" + cont + " -> Q" + (cont + 1) + " [label=\"" + token.getText().charAt(i) + "\"];\n";
                        cont++;
                    }

                    AutomataToken t = new AutomataToken(token.getText(), QI, cont);
                    list.add(t);
                }
                finalStates += "\t\tQ" + cont + ";\n";
            }
        }
        try {
            FileWriter fr = new FileWriter("automata.dot");
            BufferedWriter bw = new BufferedWriter(fr);
            bw.write(header);
            bw.write(finalStates);
            bw.write(data);
            bw.write("}");
            bw.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        //Executa o comando que gerar o automato com base no arquivo .dot
        try{
            Process p = Runtime.getRuntime().exec("dot -Tpng automata.dot -o automato.png");
            System.out.println("Automato gerado com sucesso !");
        } catch(IOException ex){
            System.out.println("Erro ao gerar o automato: " + ex.getMessage());
        }
    }
}
