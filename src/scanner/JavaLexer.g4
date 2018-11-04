lexer grammar JavaLexer;

/* Lexer Rules */
fragment
LETRA: ('a'..'z' | 'A'..'Z');
fragment
DIGITO: '0'..'9';

ESPACO: ('\t' | ' ' | '\r' | '\n' | '\u000C')+ -> skip;
COMENTARIO: '//' (~('\n' | '\r'))* -> skip;

NUMERO: (DIGITO)(DIGITO)*;

SHORT: 'short';
BYTE: 'byte';
INT: 'int';
LONG: 'long';
CHAR: 'char';

FLOAT: 'float' | 'double';
LOGICAL: 'boolean';
NEW: 'new';
PACKAGE: 'package';
IMPORT: 'import';
CONST: 'const';
INSTANCEOF: 'instanceof';
GOTO: 'goto';
CLASS: 'class';
ABSTRACT: 'abstract';
FINAL: 'final';
PUBLIC: 'public';
PRIVATE: 'private';
PROTECTED: 'protected';
EXTENDS: 'extends';
IMPLEMENTS: 'implements';
STATIC: 'static';
THIS: 'this';
SUPER: 'super';
TRANSIENT: 'transient';
VOLATILE: 'volatile';
THROW: 'throw';
THROWS: 'throws';
VOID: 'void';
SYNCHNOZED: 'synchronized';
NATIVE: 'native';
INTERFACE: 'interface';

//OPERADORES DE ATRIBUIÇÃO
IGUAL_ATRIB: '='; 
MULT_ATRIB: '*='; 
DIV_ATRIB: '/='; 
MOD_ATRIB: '%='; 
ADD_ATRIB: '+='; 
BIT_LEFT_ATRIB: '<<='; 
BIT_RIGHT_ATRIB: '>>='; 
U_BIT_RIGHT_ATRIB: '>>>='; 
AND_ATRIB: '&='; 
XOR_ATRIB: '^='; 
OR_ATRIB: '|=';

//OPERADORES ARIMETICOS
ADD: '+';
SUB: '-';
MULT: '*';
DIV: '/';

//OPERADORES CONDICIONAIS
OR: '||';
AND: '&&';
IGUAL: '==';
MAIOR_IGUAL: '>=';
MENOR_IGUAL: '<=';
BITAND: '&';
BITOR: '|';
CARET: '^';
//OPERADORES DE DESLOCAMENTO DE BITS
SHIFT_RIGHT: '>>';
SHIFT_LEFT: '<<';

//SIMBOLOS ADICIONAIS
AC: '[';
FC: ']';
ACH: '{';
FCH: '}';
AP: '(';
FP: ')';
PONTO: '.';
INTERROGACAO: '?';
EXCLAMACAO: '!';
DOIS_PONTOS: ':'; 
ARROBA: '@';
PONTOV: ';';

fragment
SIMBOLOS: INTERROGACAO | EXCLAMACAO | DOIS_PONTOS | ARROBA | PONTOV;

//CONDICOES
IF: 'if';
ELSE: 'else';
CASE: 'case';
DEFAULT: 'default';
SWITCH: 'switch';

//REPETICAO
DO: 'do';
WHILE: 'while';
FOR: 'for';

//INTERRUPCAO
BREAK: 'break'; 
CONTINUE: 'continue'; 
RETURN: 'return';

//EXCECAO
TRY: 'try';
CATCH: 'catch';
FINALLY: 'finally';


STRING: ('"')((LETRA | ' ' | DIGITO | SIMBOLOS)*)('"');
ID: LETRA (LETRA|DIGITO|'_')*;

ERRO: ((DIGITO)((DIGITO)|(LETRA)|(SIMBOLOS))*);