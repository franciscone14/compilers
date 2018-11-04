parser grammar JavaParser;

options {
    tokenVocab='../scanner/JavaLexer';
}

//Programs
compilationUnit: packageDeclaration? importDeclarations? typeDeclarations?;

//Declarations
packageDeclaration: PACKAGE packageName;

importDeclarations: importDeclaration | importDeclarations importDeclaration;

importDeclaration: IMPORT typeName | IMPORT packageName '.*';

typeDeclarations: typeDeclaration (typeDeclaration)*;

typeDeclaration: classDeclaration | interfaceDeclaration | ;

classDeclaration: classModifiers? CLASS ID super? interfaces? classBody;

classModifiers: classModifier (classModifier)*;

classModifier: PUBLIC | ABSTRACT | FINAL;

super: EXTENDS classType;

interfaces: IMPLEMENTS interfaceTypeList;

interfaceTypeList: interfaceType (',' interfaceType)*;

classBody: '{' classBodyDeclarations? '}';

classBodyDeclarations: classBodyDeclaration | classBodyDeclarations classBodyDeclaration;

classBodyDeclaration: classMemberDeclaration | staticInitializer | constructorDeclaration;

classMemberDeclaration: fieldDeclaration | methodDeclaration;

staticInitializer: STATIC block;

constructorDeclaration: constructorModifiers? constructorDeclarator throwsRule? constructorBody;

constructorModifiers: constructorModifier | constructorModifiers constructorModifier;

constructorModifier: PUBLIC | PROTECTED | PRIVATE;

constructorDeclarator: ID '(' formalParameterList? ')';

formalParameterList: formalParameter (',' formalParameter)*;

formalParameter: type variableDeclaratorId;

throwsRule: THROWS classTypeList;

classTypeList: classType (',' classType)*;

constructorBody: '{' explicitConstructorInvocation? blockStatements? '}';

explicitConstructorInvocation: THIS '(' argumentlist? ')' | SUPER '(' argumentlist? ')';

fieldDeclaration: fieldModifiers? type variableDeclarators;

fieldModifiers: fieldModifier+;

fieldModifier: PUBLIC | PROTECTED | PRIVATE | STATIC | FINAL | TRANSIENT | VOLATILE;

variableDeclarators: variableDeclarator (',' variableDeclarator)*;

variableDeclarator: variableDeclaratorId | variableDeclaratorId = variableInitializer;

variableDeclaratorId: ID | variableDeclaratorId '[' ']';

variableInitializer: expression | arrayInitializer;

methodDeclaration: methodHeader methodBody;

methodHeader: methodModifiers? resultType methodDeclarator throwsRule?;

resultType: type | VOID;

methodModifiers: methodModifier | methodModifiers methodModifier;

methodModifier: PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | FINAL | SYNCHRONIZED | NATIVE;

methodDeclarator: ID '(' formalParameterList? ')';

methodBody: block | ;

interfaceDeclaration: interfaceModifiers? INTERFACE ID extendsInterfaces? interfaceBody;

interfaceModifiers: interfaceModifier+;

interfaceModifier: PUBLIC | ABSTRACT;

extendsInterfaces: EXTENDS interfaceType (',' interfaceType)+;

interfaceBody: '{' interfaceMemberDeclarations? '}';

interfaceMemberDeclarations: interfaceMemberDeclaration+;

interfaceMemberDeclaration: constantDeclaration | abstractMethodDeclaration;

constantDeclaration: constantModifiers type variableDeclarator;

constantModifiers: PUBLIC | STATIC | FINAL;

abstractMethodDeclaration: abstractMethodModifiers? resultType methodDeclarator throwsRule?;

abstractMethodModifiers: abstractMethodModifier | abstractMethodModifiers abstractMethodModifier;

abstractMethodModifier: PUBLIC | ABSTRACT;

arrayInitializer: '{' variableInitializers? ','? '}';

variableInitializers: variableInitializer (',' variableInitializer)*;

// Types
type: primitiveType | referenceType;
primitiveType: numericType | LOGICAL;

numericType: integralType | FLOAT;

integralType: BYTE | SHORT | INT | LONG | CHAR;

referenceType: classOrInterfaceType | arraType;

classOrInterfaceType: classType | interfaceType;

classType: typeName;

interfaceType: typeName;

arraType: type '[' ']';

// Blocks and Commands

block: '{' blockStatements? '}';
blockStatements: blockStatement+;

blockStatement: localVariableDeclarationStatement | statement;

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
    block | emptyStatement | expressionStatement | 
    switchStatement | doStatement | 
    breakStatement | continueStatement | 
    returnStatement | synchronizedStatement | 
    throwsRuleStatement | tryStatement;

emptyStatement: ;

labeledStatement: 
    ID ':' statement;

labeledStatementNoShortIf: ID ':' statementNoShortIf;

expressionStatement: statementExpression;

statementExpression: assignment | preIncrementExpression | 
    postincrementExpression | preDecrementExpression | 
    postdecrementExpression | methodInvocation | 
    classInstanceCreationExpression;

ifThenStatement: IF '(' expression ')' statement;

ifThenElseStatement: IF '(' expression ')' statementNoShortIf ELSE statement;

ifThenElseStatementNoShortIf: IF '(' expression ')' statementNoShortIf ELSE statementNoShortIf;

switchStatement: SWITCH '(' expression ')' switchBlock;

switchBlock: '{' switchBlockStatementGroups? switchLabels? '}';

switchBlockStatementGroups: switchBlockStatementGroup+;

switchBlockStatementGroup: switchLabels blockStatements;

switchLabels: switchLabel;

switchLabel: (CASE constantExpression ':')+ | DEFAULT ':';

whileStatement: WHILE '(' expression ')' statement;

whileStatementNoShortIf: WHILE '(' expression ')' statementNoShortIf;

doStatement: DO statement WHILE '(' expression ')';

forStatement: FOR '(' forInit? ';' expression? ';' forUpdate? ')' statement;

forStatementNoShortIf: FOR '(' forInit? ';' expression? ';' forUpdate? ')' statementNoShortIf;

forInit: statementExpressionList | localVariableDeclaration;

forUpdate: statementExpressionList;

statementExpressionList: statementExpression (',' statementExpression)*;

breakStatement: BREAK ID? ;

continueStatement: CONTINUE ID? ;

returnStatement: RETURN expression? ;

throwsRuleStatement: THROW expression;

synchronizedStatement: SYNCHRONIZED '(' expression ')' block;

tryStatement: TRY block catches | TRY block catches? finallyRule;

catches: catchClause;

catchClause: (CATCH '(' formalParameter ')' block)+;

finallyRule: FINALLY block;

// Expressions
constantExpression: expression;

expression: assignmentExpression;

assignmentExpression: conditionalExpression | assignment;

assignment: leftHandSide assignmentOperator assignmentExpression;

leftHandSide: expressionName | fieldAccess | arrayAccess;

assignmentOperator: 
    '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '>>>=' | '&=' | '^=' | '|=';

conditionalExpression: 
    conditionalOrExpression | conditionalOrExpression '?' expression ':' conditionalExpression;

conditionalOrExpression: conditionalAndExpression ('||' conditionalAndExpression)*;

conditionalAndExpression: inclusiveOrExpression ('&&' inclusiveOrExpression)*;

inclusiveOrExpression: exclusiveOrExpression;

exclusiveOrExpression: andExpression ('^' andExpression)*;

andExpression: equalityExpression ('&' equalityExpression)*;

equalityExpression: 
    relationalExpression | equalityExpression '==' relationalExpression | 
    equalityExpression '!=' relationalExpression;

relationalExpression: shiftExpression 
    ('<' shiftExpression | '>' shiftExpression | 
    '<=' shiftExpression |'>=' shiftExpression | INSTANCEOF referenceType)*;

shiftExpression: additiveExpression 
    (('<<' additiveExpression) | ('>>' additiveExpression) | ('>>>' additiveExpression))*;

additiveExpression: multiplicativeExpression ('+' multiplicativeExpression | '-' multiplicativeExpression)*;

multiplicativeExpression: unaryExpression 
    ('*' unaryExpression | '/' unaryExpression | '%' unaryExpression)*;

castExpression: '(' primitiveType ')' unaryExpression | 
    '(' referenceType ')' unaryExpressionNotPlusMinus;

unaryExpression: preIncrementExpression | preDecrementExpression | 
'+' unaryExpression | '-' unaryExpression | unaryExpressionNotPlusMinus;

preDecrementExpression: '--' unaryExpression;

preIncrementExpression: '++' unaryExpression;

unaryExpressionNotPlusMinus: postfixExpression | '~' unaryExpression | 
    '!' unaryExpression | castExpression;

postdecrementExpression: postfixExpression '--';

postincrementExpression: postfixExpression '++';

postfixExpression: primary | expressionName | postincrementExpression | postdecrementExpression;

methodInvocation: methodName '(' argumentlist? ')' | 
    primary '.' ID '(' argumentlist? ')' | SUPER '.' ID '(' argumentlist? ')';

fieldAccess: primary '.' ID | super '.' ID;

primary: primaryNoNewArray | arrayCreationExpression;

primaryNoNewArray: literal | THIS | '(' expression ')' | 
    classInstanceCreationExpression | fieldAccess | methodInvocation | arrayAccess;

classInstanceCreationExpression: NEW classType '(' argumentlist? ')';

argumentlist: expression (',' expression)*;

arrayCreationExpression: NEW primitiveType dimExprs dims? | 
    NEW classOrInterfaceType dimExprs dims?;

dimExprs: dimExpr+;

dimExpr: '[' expression ']';

dims: ('[' ']')+;

arrayAccess: expressionName '[' expression ']' | primaryNoNewArray '[' expression ']';

//Tokens

packageName: ID ('.' ID)*;

typeName: ID | packageName '.' ID;

simpleTypeName: ID;

expressionName: ID | ambiguousName '.' ID;

methodName: ID | ambiguousName '.' ID;

ambiguousName: ID ('.' ID)*;

literal: integerLiteral | floatingPointLiteral | booleanLiteral | characterLiteral | 
stringLiteral | nullLiteral;

integerLiteral: decimalIntegerLiteral | hexIntegerLiteral | octalIntegerLiteral;

decimalIntegerLiteral: decimalNumeral integerTypeSuffix?;

hexIntegerLiteral: hexNumeral integerTypeSuffix?;

octalIntegerLiteral: octalNumeral integerTypeSuffix?;

integerTypeSuffix: 'l' | 'L';

decimalNumeral: '0' | nonZeroDigit digits?;

digits: digit+;

digit: '0' | nonZeroDigit;

nonZeroDigit: '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';

hexNumeral: ('0' 'x' hexDigit | '0' 'X' hexDigit) hexDigit*;

hexDigit : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' |
     '8' | '9' | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F';

octalNumeral: '0' octalDigit+;

octalDigit: '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7';

floatingPointLiteral: digits '.' digits? exponentPart? floatTypeSuffix?;

exponentPart: exponentIndicator signedInteger;

exponentIndicator: 'e' | 'E';

signedInteger: sign? digits;

sign: '+' | '-';

floatTypeSuffix: 'f' | 'F' | 'd' | 'D';

booleanLiteral: 'true' | 'false';

characterLiteral:  '\'' LETRA  '\''; 

// <single character>: <input character> except ' and \

stringLiteral: STRING;

// <string characters>: <string character> | <string characters> <string character>

// <string character>: <input character> except " and \ | <escape character>

nullLiteral: NULL;
