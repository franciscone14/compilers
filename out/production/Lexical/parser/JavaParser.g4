parser grammar JavaParser;

options {
    tokenVocab='../scanner/JavaLexer';
}

//Programs
compilationUnit: packageDeclaration? importDeclarations? typeDeclarations?;

//Declarations
packageDeclaration: PACKAGE packageName;

importDeclarations: IMPORT importDeclaration PONTOV;

importDeclaration: typeName | packageName (PONTO MULT)?;

typeDeclarations: typeDeclaration+;

typeDeclaration: classDeclaration | interfaceDeclaration;

classDeclaration: classModifiers? CLASS ID superRule? interfaces? classBody;

classModifiers: classModifier (classModifier)*;

classModifier: PUBLIC | ABSTRACT | FINAL;

superRule: EXTENDS classType;

interfaces: IMPLEMENTS interfaceTypeList;

interfaceTypeList: interfaceType (VIRGULA interfaceType)*;

classBody: ACH classBodyDeclarations? FCH;

classBodyDeclarations: classBodyDeclaration | classBodyDeclarations classBodyDeclaration;

classBodyDeclaration: classMemberDeclaration | staticInitializer | constructorDeclaration;

classMemberDeclaration: fieldDeclaration | methodDeclaration;

staticInitializer: STATIC block;

constructorDeclaration: constructorModifiers? constructorDeclarator throwsRule? constructorBody;

constructorModifiers: constructorModifier | constructorModifiers constructorModifier;

constructorModifier: PUBLIC | PROTECTED | PRIVATE;

constructorDeclarator: ID AP formalParameterList? FP;

formalParameterList: type variableDeclaratorId (VIRGULA type variableDeclaratorId)*;

formalParameter: type variableDeclaratorId;

throwsRule: THROWS classTypeList;

classTypeList: classType (VIRGULA classType)*;

constructorBody: ACH explicitConstructorInvocation? blockStatements? FCH;

explicitConstructorInvocation: THIS AP argumentlist? FP | SUPER AP argumentlist? FP;

fieldDeclaration: fieldModifiers? type variableDeclarators PONTOV;

fieldModifiers: fieldModifier+;

fieldModifier: PUBLIC | PROTECTED | PRIVATE | STATIC | FINAL | TRANSIENT | VOLATILE;

variableDeclarators: variableDeclarator (VIRGULA variableDeclarator)*;

variableDeclarator: variableDeclaratorId | variableDeclaratorId IGUAL_ATRIB variableInitializer;

variableDeclaratorId: ID (AC FC)*;

variableInitializer: expression | arrayInitializer;

methodDeclaration: methodHeader methodBody;

methodHeader: methodModifiers? resultType methodDeclarator throwsRule?;

resultType: type | VOID;

methodModifiers: methodModifier | methodModifiers methodModifier;

methodModifier: PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | FINAL | SYNCHRONIZED | NATIVE;

methodDeclarator: ID AP formalParameterList? FP;

methodBody: block | ;

interfaceDeclaration: interfaceModifiers? INTERFACE ID extendsInterfaces? interfaceBody;

interfaceModifiers: interfaceModifier+;

interfaceModifier: PUBLIC | ABSTRACT;

extendsInterfaces: EXTENDS interfaceType (VIRGULA interfaceType)+;

interfaceBody: ACH interfaceMemberDeclarations? FCH;

interfaceMemberDeclarations: interfaceMemberDeclaration+;

interfaceMemberDeclaration: constantDeclaration | abstractMethodDeclaration;

constantDeclaration: constantModifiers type variableDeclarator;

constantModifiers: PUBLIC | STATIC | FINAL;

abstractMethodDeclaration: abstractMethodModifiers? resultType methodDeclarator throwsRule?;

abstractMethodModifiers: abstractMethodModifier | abstractMethodModifiers abstractMethodModifier;

abstractMethodModifier: PUBLIC | ABSTRACT;

arrayInitializer: ACH variableInitializers? VIRGULA? FCH;

variableInitializers: variableInitializer (VIRGULA variableInitializer)*;

// Types
type: primitiveType | referenceType (AC FC)*;
primitiveType: numericType | LOGICAL;

numericType: integralType | FLOAT;

integralType: BYTE | SHORT | INT | LONG | CHAR;

referenceType: classOrInterfaceType;

classOrInterfaceType: classType | interfaceType;

classType: typeName;

interfaceType: typeName;

// Blocks and Commands

block: ACH blockStatements? FCH;
blockStatements: blockStatement+;

blockStatement: localVariableDeclarationStatement PONTOV | statement PONTOV;

localVariableDeclarationStatement: localVariableDeclaration;

localVariableDeclaration: type variableDeclarators;

statement: 
    statementWithoutTrailingSubstatement | 
    labeledStatement | ifThenStatement | 
    ifThenElseStatement | whileStatement | forStatement;

statementNoShortIf: 
    statementWithoutTrailingSubstatement | 
    labeledStatementNoShortIf | 
    ifThenElseStatementNoShortIf | 
    whileStatementNoShortIf | forStatementNoShortIf;

statementWithoutTrailingSubstatement: 
    block | expressionStatement | 
    switchStatement | doStatement | 
    breakStatement | continueStatement | 
    returnStatement | synchronizedStatement | 
    throwsRuleStatement | tryStatement;

labeledStatement: 
    ID DOIS_PONTOS statement;

labeledStatementNoShortIf: ID DOIS_PONTOS statementNoShortIf;

expressionStatement: statementExpression;

statementExpression: assignment | preIncrementExpression | 
    postincrementExpression | preDecrementExpression | 
    postdecrementExpression | methodInvocation | 
    classInstanceCreationExpression;

ifThenStatement: IF AP expression FP statement;

ifThenElseStatement: IF AP expression FP statementNoShortIf ELSE statement;

ifThenElseStatementNoShortIf: IF AP expression FP statementNoShortIf ELSE statementNoShortIf;

switchStatement: SWITCH AP expression FP switchBlock;

switchBlock: ACH switchBlockStatementGroups? switchLabels? FCH;

switchBlockStatementGroups: switchBlockStatementGroup+;

switchBlockStatementGroup: switchLabels blockStatements;

switchLabels: switchLabel;

switchLabel: (CASE constantExpression DOIS_PONTOS)+ | DEFAULT DOIS_PONTOS;

whileStatement: WHILE AP expression FP statement;

whileStatementNoShortIf: WHILE AP expression FP statementNoShortIf;

doStatement: DO statement WHILE AP expression FP;

forStatement: FOR AP forInit? PONTOV expression? PONTOV forUpdate? FP statement;

forStatementNoShortIf: FOR AP forInit? PONTOV expression? PONTOV forUpdate? FP statementNoShortIf;

forInit: statementExpressionList | localVariableDeclaration;

forUpdate: statementExpressionList;

statementExpressionList: statementExpression (VIRGULA statementExpression)*;

breakStatement: BREAK ID? ;

continueStatement: CONTINUE ID? ;

returnStatement: RETURN expression? ;

throwsRuleStatement: THROW expression;

synchronizedStatement: SYNCHRONIZED AP expression FP block;

tryStatement: TRY block catches | TRY block catches? finallyRule;

catches: catchClause;

catchClause: (CATCH AP formalParameter FP block)+;

finallyRule: FINALLY block;

// Expressions
constantExpression: expression;

expression: assignmentExpression;

assignmentExpression: conditionalExpression | assignment;

assignment: leftHandSide assignmentOperator assignmentExpression;

leftHandSide: expressionName | fieldAccess | arrayAccess;

assignmentOperator: 
    IGUAL_ATRIB |
    MULT_ATRIB | 
    DIV_ATRIB | 
    MOD_ATRIB | 
    ADD_ATRIB | 
    BIT_LEFT_ATRIB | 
    BIT_RIGHT_ATRIB | 
    U_BIT_RIGHT_ATRIB | 
    AND_ATRIB | 
    XOR_ATRIB | 
    OR_ATRIB;

conditionalExpression: 
    conditionalOrExpression | 
    conditionalOrExpression INTERROGACAO expression DOIS_PONTOS conditionalExpression;

conditionalOrExpression: conditionalAndExpression (OR conditionalAndExpression)*;

conditionalAndExpression: inclusiveOrExpression (AND inclusiveOrExpression)*;

inclusiveOrExpression: exclusiveOrExpression;

exclusiveOrExpression: andExpression (CARET andExpression)*;

andExpression: equalityExpression (BITAND equalityExpression)*;

equalityExpression: 
    relationalExpression | equalityExpression IGUAL relationalExpression | 
    equalityExpression DIF relationalExpression;

relationalExpression: shiftExpression 
    (MENOR shiftExpression | MAIOR shiftExpression | 
    MENOR_IGUAL shiftExpression | MAIOR_IGUAL shiftExpression | INSTANCEOF referenceType)*;

shiftExpression: additiveExpression 
    ((SHIFT_LEFT additiveExpression) | (SHIFT_RIGHT additiveExpression) | 
    (U_SHIFT_RIGHT additiveExpression))*;

additiveExpression: multiplicativeExpression (ADD multiplicativeExpression | SUB multiplicativeExpression)*;

multiplicativeExpression: unaryExpression 
    (MULT unaryExpression | DIV unaryExpression | MOD unaryExpression)*;

castExpression: AP primitiveType FP unaryExpression | 
    AP referenceType FP unaryExpressionNotPlusMinus;

unaryExpression: preIncrementExpression | preDecrementExpression | 
ADD unaryExpression | SUB unaryExpression | unaryExpressionNotPlusMinus;

preDecrementExpression: DEC unaryExpression;

preIncrementExpression: INC unaryExpression;

unaryExpressionNotPlusMinus: postfixExpression | NOT unaryExpression | 
    EXCLAMACAO unaryExpression | castExpression;

postdecrementExpression: postfixExpression DEC;

postincrementExpression: postfixExpression INC;

postfixExpression: primary | expressionName; //| postincrementExpression | postdecrementExpression;

methodInvocation: methodName AP argumentlist? FP | 
    SUPER PONTO ID AP argumentlist? FP;
    //primary PONTO ID AP argumentlist? FP |

fieldAccess: primary PONTO ID | superRule PONTO ID;

primary: primaryNoNewArray | arrayCreationExpression;

primaryNoNewArray: literal | THIS | AP expression FP | 
    classInstanceCreationExpression;
    //| fieldAccess | methodInvocation | arrayAccess;

classInstanceCreationExpression: NEW classType AP argumentlist? FP;

argumentlist: expression (VIRGULA expression)*;

arrayCreationExpression: NEW primitiveType dimExprs dims? | 
    NEW classOrInterfaceType dimExprs dims?;

dimExprs: dimExpr+;

dimExpr: AC expression FC;

dims: (AC FC)+;

arrayAccess: expressionName AC expression FC | primaryNoNewArray AC expression FC;

//Tokens

packageName: ID (PONTO ID)*;

typeName: ID | packageName PONTO ID;

simpleTypeName: ID;

expressionName: ID | ambiguousName PONTO ID;

methodName: ID | ambiguousName PONTO ID;

ambiguousName: ID (PONTO ID)*;

literal: integerLiteral | floatingPointLiteral | booleanLiteral | characterLiteral | 
stringLiteral | nullLiteral;

integerLiteral: decimalIntegerLiteral | hexIntegerLiteral | octalIntegerLiteral;

decimalIntegerLiteral: decimalNumeral INTEGER_TYPE_SUFFIX?;

hexIntegerLiteral: HEX_NUMERAL INTEGER_TYPE_SUFFIX?;

octalIntegerLiteral: OCTAL_NUMERAL INTEGER_TYPE_SUFFIX?;

decimalNumeral: NUMERO;

digits: DIGITO+;

floatingPointLiteral: digits PONTO digits? exponentPart? floatTypeSuffix?;

exponentPart: exponentIndicator signedInteger;

exponentIndicator: EXP;

signedInteger: sign? digits;

sign: ADD | SUB;

floatTypeSuffix: FLOAT_S;

booleanLiteral: LOGICAL;

characterLiteral:  ASPAS LETRA  ASPAS; 

// <single character>: <input character> except ' and \

stringLiteral: STRING;

// <string characters>: <string character> | <string characters> <string character>

// <string character>: <input character> except " and \ | <escape character>

nullLiteral: NULL;
