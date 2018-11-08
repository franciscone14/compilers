// Generated from /home/franciscone/Faculdade/Codigos/compilers/compiler/src/parser/JavaParser.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ESPACO=1, COMENTARIO=2, NUMERO=3, SHORT=4, BYTE=5, INT=6, LONG=7, CHAR=8, 
		FLOAT=9, LOGICAL=10, NEW=11, PACKAGE=12, IMPORT=13, CONST=14, INSTANCEOF=15, 
		GOTO=16, CLASS=17, ABSTRACT=18, FINAL=19, PUBLIC=20, PRIVATE=21, PROTECTED=22, 
		EXTENDS=23, IMPLEMENTS=24, STATIC=25, THIS=26, SUPER=27, TRANSIENT=28, 
		VOLATILE=29, THROW=30, THROWS=31, VOID=32, SYNCHNOZED=33, NATIVE=34, INTERFACE=35, 
		IGUAL_ATRIB=36, MULT_ATRIB=37, DIV_ATRIB=38, MOD_ATRIB=39, ADD_ATRIB=40, 
		BIT_LEFT_ATRIB=41, BIT_RIGHT_ATRIB=42, U_BIT_RIGHT_ATRIB=43, AND_ATRIB=44, 
		XOR_ATRIB=45, OR_ATRIB=46, INC=47, DEC=48, ADD=49, SUB=50, MULT=51, DIV=52, 
		OR=53, AND=54, IGUAL=55, MAIOR_IGUAL=56, MENOR_IGUAL=57, MENOR=58, MAIOR=59, 
		BITAND=60, BITOR=61, CARET=62, SHIFT_RIGHT=63, SHIFT_LEFT=64, AC=65, FC=66, 
		ACH=67, FCH=68, AP=69, FP=70, PONTO=71, INTERROGACAO=72, EXCLAMACAO=73, 
		DOIS_PONTOS=74, ARROBA=75, PONTOV=76, VIRGULA=77, IF=78, ELSE=79, CASE=80, 
		DEFAULT=81, SWITCH=82, DO=83, WHILE=84, FOR=85, BREAK=86, CONTINUE=87, 
		RETURN=88, TRY=89, CATCH=90, FINALLY=91, TRUE=92, FALSE=93, STRING=94, 
		ID=95, ERRO=96, SYNCHRONIZED=97, DIF=98, U_SHIFT_RIGHT=99, MOD=100, NOT=101, 
		INTEGER_TYPE_SUFFIX=102, HEX_NUMERAL=103, OCTAL_NUMERAL=104, EXP=105, 
		FLOAT_S=106, ASPAS=107, LETRA=108, NULL=109;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclarations = 2, 
		RULE_importDeclaration = 3, RULE_typeDeclarations = 4, RULE_typeDeclaration = 5, 
		RULE_classDeclaration = 6, RULE_classModifiers = 7, RULE_classModifier = 8, 
		RULE_superRule = 9, RULE_interfaces = 10, RULE_interfaceTypeList = 11, 
		RULE_classBody = 12, RULE_classBodyDeclarations = 13, RULE_classBodyDeclaration = 14, 
		RULE_classMemberDeclaration = 15, RULE_staticInitializer = 16, RULE_constructorDeclaration = 17, 
		RULE_constructorModifiers = 18, RULE_constructorModifier = 19, RULE_constructorDeclarator = 20, 
		RULE_formalParameterList = 21, RULE_formalParameter = 22, RULE_throwsRule = 23, 
		RULE_classTypeList = 24, RULE_constructorBody = 25, RULE_explicitConstructorInvocation = 26, 
		RULE_fieldDeclaration = 27, RULE_fieldModifiers = 28, RULE_fieldModifier = 29, 
		RULE_variableDeclarators = 30, RULE_variableDeclarator = 31, RULE_variableDeclaratorId = 32, 
		RULE_variableInitializer = 33, RULE_methodDeclaration = 34, RULE_methodHeader = 35, 
		RULE_resultType = 36, RULE_methodModifiers = 37, RULE_methodModifier = 38, 
		RULE_methodDeclarator = 39, RULE_methodBody = 40, RULE_interfaceDeclaration = 41, 
		RULE_interfaceModifiers = 42, RULE_interfaceModifier = 43, RULE_extendsInterfaces = 44, 
		RULE_interfaceBody = 45, RULE_interfaceMemberDeclarations = 46, RULE_interfaceMemberDeclaration = 47, 
		RULE_constantDeclaration = 48, RULE_constantModifiers = 49, RULE_abstractMethodDeclaration = 50, 
		RULE_abstractMethodModifiers = 51, RULE_abstractMethodModifier = 52, RULE_arrayInitializer = 53, 
		RULE_variableInitializers = 54, RULE_type = 55, RULE_primitiveType = 56, 
		RULE_numericType = 57, RULE_integralType = 58, RULE_referenceType = 59, 
		RULE_classOrInterfaceType = 60, RULE_classType = 61, RULE_interfaceType = 62, 
		RULE_block = 63, RULE_blockStatements = 64, RULE_blockStatement = 65, 
		RULE_localVariableDeclarationStatement = 66, RULE_localVariableDeclaration = 67, 
		RULE_statement = 68, RULE_statementNoShortIf = 69, RULE_statementWithoutTrailingSubstatement = 70, 
		RULE_labeledStatement = 71, RULE_labeledStatementNoShortIf = 72, RULE_expressionStatement = 73, 
		RULE_statementExpression = 74, RULE_ifThenStatement = 75, RULE_ifThenElseStatement = 76, 
		RULE_ifThenElseStatementNoShortIf = 77, RULE_switchStatement = 78, RULE_switchBlock = 79, 
		RULE_switchBlockStatementGroups = 80, RULE_switchBlockStatementGroup = 81, 
		RULE_switchLabels = 82, RULE_switchLabel = 83, RULE_whileStatement = 84, 
		RULE_whileStatementNoShortIf = 85, RULE_doStatement = 86, RULE_forStatement = 87, 
		RULE_forStatementNoShortIf = 88, RULE_forInit = 89, RULE_forUpdate = 90, 
		RULE_statementExpressionList = 91, RULE_breakStatement = 92, RULE_continueStatement = 93, 
		RULE_returnStatement = 94, RULE_throwsRuleStatement = 95, RULE_synchronizedStatement = 96, 
		RULE_tryStatement = 97, RULE_catches = 98, RULE_catchClause = 99, RULE_finallyRule = 100, 
		RULE_constantExpression = 101, RULE_expression = 102, RULE_assignmentExpression = 103, 
		RULE_assignment = 104, RULE_leftHandSide = 105, RULE_assignmentOperator = 106, 
		RULE_conditionalExpression = 107, RULE_conditionalOrExpression = 108, 
		RULE_conditionalAndExpression = 109, RULE_inclusiveOrExpression = 110, 
		RULE_exclusiveOrExpression = 111, RULE_andExpression = 112, RULE_equalityExpression = 113, 
		RULE_relationalExpression = 114, RULE_shiftExpression = 115, RULE_additiveExpression = 116, 
		RULE_multiplicativeExpression = 117, RULE_castExpression = 118, RULE_unaryExpression = 119, 
		RULE_preDecrementExpression = 120, RULE_preIncrementExpression = 121, 
		RULE_unaryExpressionNotPlusMinus = 122, RULE_postdecrementExpression = 123, 
		RULE_postIncrementExpression = 124, RULE_postFixExpression = 125, RULE_methodInvocation = 126, 
		RULE_fieldAccess = 127, RULE_primary = 128, RULE_primaryNoNewArray = 129, 
		RULE_classInstanceCreationExpression = 130, RULE_argumentlist = 131, RULE_arrayCreationExpression = 132, 
		RULE_dimExprs = 133, RULE_dimExpr = 134, RULE_dims = 135, RULE_arrayAccess = 136, 
		RULE_packageName = 137, RULE_typeName = 138, RULE_simpleTypeName = 139, 
		RULE_expressionName = 140, RULE_methodName = 141, RULE_ambiguousName = 142, 
		RULE_literal = 143, RULE_integerLiteral = 144, RULE_decimalIntegerLiteral = 145, 
		RULE_hexIntegerLiteral = 146, RULE_octalIntegerLiteral = 147, RULE_decimalNumeral = 148, 
		RULE_digits = 149, RULE_floatingPointLiteral = 150, RULE_exponentPart = 151, 
		RULE_exponentIndicator = 152, RULE_signedInteger = 153, RULE_sign = 154, 
		RULE_floatTypeSuffix = 155, RULE_characterLiteral = 156, RULE_stringLiteral = 157, 
		RULE_booleanLiteral = 158, RULE_nullLiteral = 159;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclarations", "importDeclaration", 
		"typeDeclarations", "typeDeclaration", "classDeclaration", "classModifiers", 
		"classModifier", "superRule", "interfaces", "interfaceTypeList", "classBody", 
		"classBodyDeclarations", "classBodyDeclaration", "classMemberDeclaration", 
		"staticInitializer", "constructorDeclaration", "constructorModifiers", 
		"constructorModifier", "constructorDeclarator", "formalParameterList", 
		"formalParameter", "throwsRule", "classTypeList", "constructorBody", "explicitConstructorInvocation", 
		"fieldDeclaration", "fieldModifiers", "fieldModifier", "variableDeclarators", 
		"variableDeclarator", "variableDeclaratorId", "variableInitializer", "methodDeclaration", 
		"methodHeader", "resultType", "methodModifiers", "methodModifier", "methodDeclarator", 
		"methodBody", "interfaceDeclaration", "interfaceModifiers", "interfaceModifier", 
		"extendsInterfaces", "interfaceBody", "interfaceMemberDeclarations", "interfaceMemberDeclaration", 
		"constantDeclaration", "constantModifiers", "abstractMethodDeclaration", 
		"abstractMethodModifiers", "abstractMethodModifier", "arrayInitializer", 
		"variableInitializers", "type", "primitiveType", "numericType", "integralType", 
		"referenceType", "classOrInterfaceType", "classType", "interfaceType", 
		"block", "blockStatements", "blockStatement", "localVariableDeclarationStatement", 
		"localVariableDeclaration", "statement", "statementNoShortIf", "statementWithoutTrailingSubstatement", 
		"labeledStatement", "labeledStatementNoShortIf", "expressionStatement", 
		"statementExpression", "ifThenStatement", "ifThenElseStatement", "ifThenElseStatementNoShortIf", 
		"switchStatement", "switchBlock", "switchBlockStatementGroups", "switchBlockStatementGroup", 
		"switchLabels", "switchLabel", "whileStatement", "whileStatementNoShortIf", 
		"doStatement", "forStatement", "forStatementNoShortIf", "forInit", "forUpdate", 
		"statementExpressionList", "breakStatement", "continueStatement", "returnStatement", 
		"throwsRuleStatement", "synchronizedStatement", "tryStatement", "catches", 
		"catchClause", "finallyRule", "constantExpression", "expression", "assignmentExpression", 
		"assignment", "leftHandSide", "assignmentOperator", "conditionalExpression", 
		"conditionalOrExpression", "conditionalAndExpression", "inclusiveOrExpression", 
		"exclusiveOrExpression", "andExpression", "equalityExpression", "relationalExpression", 
		"shiftExpression", "additiveExpression", "multiplicativeExpression", "castExpression", 
		"unaryExpression", "preDecrementExpression", "preIncrementExpression", 
		"unaryExpressionNotPlusMinus", "postdecrementExpression", "postIncrementExpression", 
		"postFixExpression", "methodInvocation", "fieldAccess", "primary", "primaryNoNewArray", 
		"classInstanceCreationExpression", "argumentlist", "arrayCreationExpression", 
		"dimExprs", "dimExpr", "dims", "arrayAccess", "packageName", "typeName", 
		"simpleTypeName", "expressionName", "methodName", "ambiguousName", "literal", 
		"integerLiteral", "decimalIntegerLiteral", "hexIntegerLiteral", "octalIntegerLiteral", 
		"decimalNumeral", "digits", "floatingPointLiteral", "exponentPart", "exponentIndicator", 
		"signedInteger", "sign", "floatTypeSuffix", "characterLiteral", "stringLiteral", 
		"booleanLiteral", "nullLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'short'", "'byte'", "'int'", "'long'", "'char'", 
		null, "'boolean'", "'new'", "'package'", "'import'", "'const'", "'instanceof'", 
		"'goto'", "'class'", "'abstract'", "'final'", "'public'", "'private'", 
		"'protected'", "'extends'", "'implements'", "'static'", "'this'", "'super'", 
		"'transient'", "'volatile'", "'throw'", "'throws'", "'void'", "'synchronized'", 
		"'native'", "'interface'", "'='", "'*='", "'/='", "'%='", "'+='", "'<<='", 
		"'>>='", "'>>>='", "'&='", "'^='", "'|='", "'++'", "'--'", "'+'", "'-'", 
		"'*'", "'/'", "'||'", "'&&'", "'=='", "'>='", "'<='", "'<'", "'>'", "'&'", 
		"'|'", "'^'", "'>>'", "'<<'", "'['", "']'", "'{'", "'}'", "'('", "')'", 
		"'.'", "'?'", "'!'", "':'", "'@'", "';'", "','", "'if'", "'else'", "'case'", 
		"'default'", "'switch'", "'do'", "'while'", "'for'", "'break'", "'continue'", 
		"'return'", "'try'", "'catch'", "'finally'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ESPACO", "COMENTARIO", "NUMERO", "SHORT", "BYTE", "INT", "LONG", 
		"CHAR", "FLOAT", "LOGICAL", "NEW", "PACKAGE", "IMPORT", "CONST", "INSTANCEOF", 
		"GOTO", "CLASS", "ABSTRACT", "FINAL", "PUBLIC", "PRIVATE", "PROTECTED", 
		"EXTENDS", "IMPLEMENTS", "STATIC", "THIS", "SUPER", "TRANSIENT", "VOLATILE", 
		"THROW", "THROWS", "VOID", "SYNCHNOZED", "NATIVE", "INTERFACE", "IGUAL_ATRIB", 
		"MULT_ATRIB", "DIV_ATRIB", "MOD_ATRIB", "ADD_ATRIB", "BIT_LEFT_ATRIB", 
		"BIT_RIGHT_ATRIB", "U_BIT_RIGHT_ATRIB", "AND_ATRIB", "XOR_ATRIB", "OR_ATRIB", 
		"INC", "DEC", "ADD", "SUB", "MULT", "DIV", "OR", "AND", "IGUAL", "MAIOR_IGUAL", 
		"MENOR_IGUAL", "MENOR", "MAIOR", "BITAND", "BITOR", "CARET", "SHIFT_RIGHT", 
		"SHIFT_LEFT", "AC", "FC", "ACH", "FCH", "AP", "FP", "PONTO", "INTERROGACAO", 
		"EXCLAMACAO", "DOIS_PONTOS", "ARROBA", "PONTOV", "VIRGULA", "IF", "ELSE", 
		"CASE", "DEFAULT", "SWITCH", "DO", "WHILE", "FOR", "BREAK", "CONTINUE", 
		"RETURN", "TRY", "CATCH", "FINALLY", "TRUE", "FALSE", "STRING", "ID", 
		"ERRO", "SYNCHRONIZED", "DIF", "U_SHIFT_RIGHT", "MOD", "NOT", "INTEGER_TYPE_SUFFIX", 
		"HEX_NUMERAL", "OCTAL_NUMERAL", "EXP", "FLOAT_S", "ASPAS", "LETRA", "NULL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JavaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationsContext> importDeclarations() {
			return getRuleContexts(ImportDeclarationsContext.class);
		}
		public ImportDeclarationsContext importDeclarations(int i) {
			return getRuleContext(ImportDeclarationsContext.class,i);
		}
		public TypeDeclarationsContext typeDeclarations() {
			return getRuleContext(TypeDeclarationsContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(320);
				packageDeclaration();
				}
			}

			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(323);
				importDeclarations();
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << ABSTRACT) | (1L << FINAL) | (1L << PUBLIC) | (1L << INTERFACE))) != 0)) {
				{
				setState(329);
				typeDeclarations();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(JavaParser.PACKAGE, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(PACKAGE);
			setState(333);
			packageName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationsContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JavaParser.IMPORT, 0); }
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public TerminalNode PONTOV() { return getToken(JavaParser.PONTOV, 0); }
		public ImportDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterImportDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitImportDeclarations(this);
		}
	}

	public final ImportDeclarationsContext importDeclarations() throws RecognitionException {
		ImportDeclarationsContext _localctx = new ImportDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(IMPORT);
			setState(336);
			importDeclaration();
			setState(337);
			match(PONTOV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(JavaParser.PONTO, 0); }
		public TerminalNode MULT() { return getToken(JavaParser.MULT, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importDeclaration);
		int _la;
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				typeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				packageName();
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PONTO) {
					{
					setState(341);
					match(PONTO);
					setState(342);
					match(MULT);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationsContext extends ParserRuleContext {
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public TypeDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeDeclarations(this);
		}
	}

	public final TypeDeclarationsContext typeDeclarations() throws RecognitionException {
		TypeDeclarationsContext _localctx = new TypeDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(347);
				typeDeclaration();
				}
				}
				setState(350); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << ABSTRACT) | (1L << FINAL) | (1L << PUBLIC) | (1L << INTERFACE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeDeclaration);
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				interfaceDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassModifiersContext classModifiers() {
			return getRuleContext(ClassModifiersContext.class,0);
		}
		public SuperRuleContext superRule() {
			return getRuleContext(SuperRuleContext.class,0);
		}
		public InterfacesContext interfaces() {
			return getRuleContext(InterfacesContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PUBLIC))) != 0)) {
				{
				setState(356);
				classModifiers();
				}
			}

			setState(359);
			match(CLASS);
			setState(360);
			match(ID);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(361);
				superRule();
				}
			}

			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(364);
				interfaces();
				}
			}

			setState(367);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifiersContext extends ParserRuleContext {
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public ClassModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassModifiers(this);
		}
	}

	public final ClassModifiersContext classModifiers() throws RecognitionException {
		ClassModifiersContext _localctx = new ClassModifiersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			classModifier();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PUBLIC))) != 0)) {
				{
				{
				setState(370);
				classModifier();
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassModifier(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PUBLIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperRuleContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SuperRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSuperRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSuperRule(this);
		}
	}

	public final SuperRuleContext superRule() throws RecognitionException {
		SuperRuleContext _localctx = new SuperRuleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_superRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(EXTENDS);
			setState(379);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfacesContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public InterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaces(this);
		}
	}

	public final InterfacesContext interfaces() throws RecognitionException {
		InterfacesContext _localctx = new InterfacesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(IMPLEMENTS);
			setState(382);
			interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeListContext extends ParserRuleContext {
		public List<InterfaceTypeContext> interfaceType() {
			return getRuleContexts(InterfaceTypeContext.class);
		}
		public InterfaceTypeContext interfaceType(int i) {
			return getRuleContext(InterfaceTypeContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(JavaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(JavaParser.VIRGULA, i);
		}
		public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceTypeList(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			interfaceType();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(385);
				match(VIRGULA);
				setState(386);
				interfaceType();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode ACH() { return getToken(JavaParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(JavaParser.FCH, 0); }
		public ClassBodyDeclarationsContext classBodyDeclarations() {
			return getRuleContext(ClassBodyDeclarationsContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(ACH);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT) | (1L << BYTE) | (1L << INT) | (1L << LONG) | (1L << CHAR) | (1L << FLOAT) | (1L << LOGICAL) | (1L << ABSTRACT) | (1L << FINAL) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << VOID) | (1L << NATIVE))) != 0) || _la==ID || _la==SYNCHRONIZED) {
				{
				setState(393);
				classBodyDeclarations(0);
				}
			}

			setState(396);
			match(FCH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationsContext extends ParserRuleContext {
		public ClassBodyDeclarationContext classBodyDeclaration() {
			return getRuleContext(ClassBodyDeclarationContext.class,0);
		}
		public ClassBodyDeclarationsContext classBodyDeclarations() {
			return getRuleContext(ClassBodyDeclarationsContext.class,0);
		}
		public ClassBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassBodyDeclarations(this);
		}
	}

	public final ClassBodyDeclarationsContext classBodyDeclarations() throws RecognitionException {
		return classBodyDeclarations(0);
	}

	private ClassBodyDeclarationsContext classBodyDeclarations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ClassBodyDeclarationsContext _localctx = new ClassBodyDeclarationsContext(_ctx, _parentState);
		ClassBodyDeclarationsContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_classBodyDeclarations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(399);
			classBodyDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ClassBodyDeclarationsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_classBodyDeclarations);
					setState(401);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(402);
					classBodyDeclaration();
					}
					} 
				}
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classBodyDeclaration);
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				classMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				staticInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(410);
				constructorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassMemberDeclaration(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classMemberDeclaration);
		try {
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				methodDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticInitializerContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterStaticInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitStaticInitializer(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(STATIC);
			setState(418);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public ConstructorModifiersContext constructorModifiers() {
			return getRuleContext(ConstructorModifiersContext.class,0);
		}
		public ThrowsRuleContext throwsRule() {
			return getRuleContext(ThrowsRuleContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(420);
				constructorModifiers(0);
				}
			}

			setState(423);
			constructorDeclarator();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(424);
				throwsRule();
				}
			}

			setState(427);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorModifiersContext extends ParserRuleContext {
		public ConstructorModifierContext constructorModifier() {
			return getRuleContext(ConstructorModifierContext.class,0);
		}
		public ConstructorModifiersContext constructorModifiers() {
			return getRuleContext(ConstructorModifiersContext.class,0);
		}
		public ConstructorModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterConstructorModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitConstructorModifiers(this);
		}
	}

	public final ConstructorModifiersContext constructorModifiers() throws RecognitionException {
		return constructorModifiers(0);
	}

	private ConstructorModifiersContext constructorModifiers(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConstructorModifiersContext _localctx = new ConstructorModifiersContext(_ctx, _parentState);
		ConstructorModifiersContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_constructorModifiers, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(430);
			constructorModifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstructorModifiersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constructorModifiers);
					setState(432);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(433);
					constructorModifier();
					}
					} 
				}
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstructorModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaParser.PRIVATE, 0); }
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterConstructorModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitConstructorModifier(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constructorModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterConstructorDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitConstructorDeclarator(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(ID);
			setState(442);
			match(AP);
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT) | (1L << BYTE) | (1L << INT) | (1L << LONG) | (1L << CHAR) | (1L << FLOAT) | (1L << LOGICAL))) != 0) || _la==ID) {
				{
				setState(443);
				formalParameterList();
				}
			}

			setState(446);
			match(FP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<VariableDeclaratorIdContext> variableDeclaratorId() {
			return getRuleContexts(VariableDeclaratorIdContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId(int i) {
			return getRuleContext(VariableDeclaratorIdContext.class,i);
		}
		public List<TerminalNode> AC() { return getTokens(JavaParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(JavaParser.AC, i);
		}
		public List<TerminalNode> FC() { return getTokens(JavaParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(JavaParser.FC, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(JavaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(JavaParser.VIRGULA, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			type();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AC) {
				{
				setState(449);
				match(AC);
				setState(450);
				match(FC);
				}
			}

			setState(453);
			variableDeclaratorId();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(454);
				match(VIRGULA);
				setState(455);
				type();
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AC) {
					{
					setState(456);
					match(AC);
					setState(457);
					match(FC);
					}
				}

				setState(460);
				variableDeclaratorId();
				}
				}
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			type();
			setState(468);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowsRuleContext extends ParserRuleContext {
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public ClassTypeListContext classTypeList() {
			return getRuleContext(ClassTypeListContext.class,0);
		}
		public ThrowsRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwsRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterThrowsRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitThrowsRule(this);
		}
	}

	public final ThrowsRuleContext throwsRule() throws RecognitionException {
		ThrowsRuleContext _localctx = new ThrowsRuleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_throwsRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(THROWS);
			setState(471);
			classTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeListContext extends ParserRuleContext {
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(JavaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(JavaParser.VIRGULA, i);
		}
		public ClassTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassTypeList(this);
		}
	}

	public final ClassTypeListContext classTypeList() throws RecognitionException {
		ClassTypeListContext _localctx = new ClassTypeListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_classTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			classType();
			setState(478);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(474);
					match(VIRGULA);
					setState(475);
					classType();
					}
					} 
				}
				setState(480);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public TerminalNode ACH() { return getToken(JavaParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(JavaParser.FCH, 0); }
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(ACH);
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(482);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << SHORT) | (1L << BYTE) | (1L << INT) | (1L << LONG) | (1L << CHAR) | (1L << FLOAT) | (1L << LOGICAL) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << SUPER) | (1L << THROW) | (1L << INC) | (1L << DEC))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ACH - 67)) | (1L << (AP - 67)) | (1L << (IF - 67)) | (1L << (SWITCH - 67)) | (1L << (DO - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (BREAK - 67)) | (1L << (CONTINUE - 67)) | (1L << (RETURN - 67)) | (1L << (TRY - 67)) | (1L << (TRUE - 67)) | (1L << (FALSE - 67)) | (1L << (ID - 67)) | (1L << (SYNCHRONIZED - 67)) | (1L << (HEX_NUMERAL - 67)) | (1L << (OCTAL_NUMERAL - 67)) | (1L << (ASPAS - 67)) | (1L << (NULL - 67)))) != 0)) {
				{
				setState(485);
				blockStatements();
				}
			}

			setState(488);
			match(FCH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExplicitConstructorInvocation(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				match(THIS);
				setState(491);
				match(AP);
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (AP - 69)) | (1L << (EXCLAMACAO - 69)) | (1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (ID - 69)) | (1L << (NOT - 69)) | (1L << (HEX_NUMERAL - 69)) | (1L << (OCTAL_NUMERAL - 69)) | (1L << (ASPAS - 69)) | (1L << (NULL - 69)))) != 0)) {
					{
					setState(492);
					argumentlist();
					}
				}

				setState(495);
				match(FP);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				match(SUPER);
				setState(497);
				match(AP);
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (AP - 69)) | (1L << (EXCLAMACAO - 69)) | (1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (ID - 69)) | (1L << (NOT - 69)) | (1L << (HEX_NUMERAL - 69)) | (1L << (OCTAL_NUMERAL - 69)) | (1L << (ASPAS - 69)) | (1L << (NULL - 69)))) != 0)) {
					{
					setState(498);
					argumentlist();
					}
				}

				setState(501);
				match(FP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode PONTOV() { return getToken(JavaParser.PONTOV, 0); }
		public FieldModifiersContext fieldModifiers() {
			return getRuleContext(FieldModifiersContext.class,0);
		}
		public TerminalNode AC() { return getToken(JavaParser.AC, 0); }
		public TerminalNode FC() { return getToken(JavaParser.FC, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) {
				{
				setState(504);
				fieldModifiers();
				}
			}

			setState(507);
			type();
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AC) {
				{
				setState(508);
				match(AC);
				setState(509);
				match(FC);
				}
			}

			setState(512);
			variableDeclarators();
			setState(513);
			match(PONTOV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldModifiersContext extends ParserRuleContext {
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public FieldModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFieldModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFieldModifiers(this);
		}
	}

	public final FieldModifiersContext fieldModifiers() throws RecognitionException {
		FieldModifiersContext _localctx = new FieldModifiersContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fieldModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(515);
				fieldModifier();
				}
				}
				setState(518); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public TerminalNode TRANSIENT() { return getToken(JavaParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(JavaParser.VOLATILE, 0); }
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFieldModifier(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fieldModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(JavaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(JavaParser.VIRGULA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			variableDeclarator();
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(523);
				match(VIRGULA);
				setState(524);
				variableDeclarator();
				}
				}
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode IGUAL_ATRIB() { return getToken(JavaParser.IGUAL_ATRIB, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variableDeclarator);
		try {
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				variableDeclaratorId();
				setState(532);
				match(IGUAL_ATRIB);
				setState(533);
				variableInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public List<TerminalNode> AC() { return getTokens(JavaParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(JavaParser.AC, i);
		}
		public List<TerminalNode> FC() { return getTokens(JavaParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(JavaParser.FC, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(ID);
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AC) {
				{
				{
				setState(538);
				match(AC);
				setState(539);
				match(FC);
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableInitializer);
		try {
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
			case NEW:
			case EXTENDS:
			case THIS:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AP:
			case EXCLAMACAO:
			case TRUE:
			case FALSE:
			case ID:
			case NOT:
			case HEX_NUMERAL:
			case OCTAL_NUMERAL:
			case ASPAS:
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				expression();
				}
				break;
			case ACH:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				arrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			methodHeader();
			setState(550);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public MethodModifiersContext methodModifiers() {
			return getRuleContext(MethodModifiersContext.class,0);
		}
		public ThrowsRuleContext throwsRule() {
			return getRuleContext(ThrowsRuleContext.class,0);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMethodHeader(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_methodHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << NATIVE))) != 0) || _la==SYNCHRONIZED) {
				{
				setState(552);
				methodModifiers(0);
				}
			}

			setState(555);
			resultType();
			setState(556);
			methodDeclarator();
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(557);
				throwsRule();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode AC() { return getToken(JavaParser.AC, 0); }
		public TerminalNode FC() { return getToken(JavaParser.FC, 0); }
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public ResultTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterResultType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitResultType(this);
		}
	}

	public final ResultTypeContext resultType() throws RecognitionException {
		ResultTypeContext _localctx = new ResultTypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_resultType);
		int _la;
		try {
			setState(566);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHORT:
			case BYTE:
			case INT:
			case LONG:
			case CHAR:
			case FLOAT:
			case LOGICAL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				type();
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AC) {
					{
					setState(561);
					match(AC);
					setState(562);
					match(FC);
					}
				}

				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodModifiersContext extends ParserRuleContext {
		public MethodModifierContext methodModifier() {
			return getRuleContext(MethodModifierContext.class,0);
		}
		public MethodModifiersContext methodModifiers() {
			return getRuleContext(MethodModifiersContext.class,0);
		}
		public MethodModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMethodModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMethodModifiers(this);
		}
	}

	public final MethodModifiersContext methodModifiers() throws RecognitionException {
		return methodModifiers(0);
	}

	private MethodModifiersContext methodModifiers(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MethodModifiersContext _localctx = new MethodModifiersContext(_ctx, _parentState);
		MethodModifiersContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_methodModifiers, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(569);
			methodModifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(575);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MethodModifiersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_methodModifiers);
					setState(571);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(572);
					methodModifier();
					}
					} 
				}
				setState(577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MethodModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
		public TerminalNode NATIVE() { return getToken(JavaParser.NATIVE, 0); }
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMethodModifier(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_methodModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << NATIVE))) != 0) || _la==SYNCHRONIZED) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMethodDeclarator(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(ID);
			setState(581);
			match(AP);
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT) | (1L << BYTE) | (1L << INT) | (1L << LONG) | (1L << CHAR) | (1L << FLOAT) | (1L << LOGICAL))) != 0) || _la==ID) {
				{
				setState(582);
				formalParameterList();
				}
			}

			setState(585);
			match(FP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_methodBody);
		try {
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public InterfaceModifiersContext interfaceModifiers() {
			return getRuleContext(InterfaceModifiersContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT || _la==PUBLIC) {
				{
				setState(591);
				interfaceModifiers();
				}
			}

			setState(594);
			match(INTERFACE);
			setState(595);
			match(ID);
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(596);
				extendsInterfaces();
				}
			}

			setState(599);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceModifiersContext extends ParserRuleContext {
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public InterfaceModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceModifiers(this);
		}
	}

	public final InterfaceModifiersContext interfaceModifiers() throws RecognitionException {
		InterfaceModifiersContext _localctx = new InterfaceModifiersContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_interfaceModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(601);
				interfaceModifier();
				}
				}
				setState(604); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ABSTRACT || _la==PUBLIC );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public InterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceModifier(this);
		}
	}

	public final InterfaceModifierContext interfaceModifier() throws RecognitionException {
		InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_interfaceModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			_la = _input.LA(1);
			if ( !(_la==ABSTRACT || _la==PUBLIC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public List<InterfaceTypeContext> interfaceType() {
			return getRuleContexts(InterfaceTypeContext.class);
		}
		public InterfaceTypeContext interfaceType(int i) {
			return getRuleContext(InterfaceTypeContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(JavaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(JavaParser.VIRGULA, i);
		}
		public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExtendsInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExtendsInterfaces(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_extendsInterfaces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(EXTENDS);
			setState(609);
			interfaceType();
			setState(612); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(610);
				match(VIRGULA);
				setState(611);
				interfaceType();
				}
				}
				setState(614); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VIRGULA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode ACH() { return getToken(JavaParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(JavaParser.FCH, 0); }
		public InterfaceMemberDeclarationsContext interfaceMemberDeclarations() {
			return getRuleContext(InterfaceMemberDeclarationsContext.class,0);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(ACH);
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT) | (1L << BYTE) | (1L << INT) | (1L << LONG) | (1L << CHAR) | (1L << FLOAT) | (1L << LOGICAL) | (1L << ABSTRACT) | (1L << FINAL) | (1L << PUBLIC) | (1L << STATIC) | (1L << VOID))) != 0) || _la==ID) {
				{
				setState(617);
				interfaceMemberDeclarations();
				}
			}

			setState(620);
			match(FCH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationsContext extends ParserRuleContext {
		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class,i);
		}
		public InterfaceMemberDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceMemberDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceMemberDeclarations(this);
		}
	}

	public final InterfaceMemberDeclarationsContext interfaceMemberDeclarations() throws RecognitionException {
		InterfaceMemberDeclarationsContext _localctx = new InterfaceMemberDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_interfaceMemberDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(622);
				interfaceMemberDeclaration();
				}
				}
				setState(625); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT) | (1L << BYTE) | (1L << INT) | (1L << LONG) | (1L << CHAR) | (1L << FLOAT) | (1L << LOGICAL) | (1L << ABSTRACT) | (1L << FINAL) | (1L << PUBLIC) | (1L << STATIC) | (1L << VOID))) != 0) || _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public AbstractMethodDeclarationContext abstractMethodDeclaration() {
			return getRuleContext(AbstractMethodDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_interfaceMemberDeclaration);
		try {
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				abstractMethodDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public ConstantModifiersContext constantModifiers() {
			return getRuleContext(ConstantModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitConstantDeclaration(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_constantDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			constantModifiers();
			setState(632);
			type();
			setState(633);
			variableDeclarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantModifiersContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public ConstantModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterConstantModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitConstantModifiers(this);
		}
	}

	public final ConstantModifiersContext constantModifiers() throws RecognitionException {
		ConstantModifiersContext _localctx = new ConstantModifiersContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_constantModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractMethodDeclarationContext extends ParserRuleContext {
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public AbstractMethodModifiersContext abstractMethodModifiers() {
			return getRuleContext(AbstractMethodModifiersContext.class,0);
		}
		public ThrowsRuleContext throwsRule() {
			return getRuleContext(ThrowsRuleContext.class,0);
		}
		public AbstractMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAbstractMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAbstractMethodDeclaration(this);
		}
	}

	public final AbstractMethodDeclarationContext abstractMethodDeclaration() throws RecognitionException {
		AbstractMethodDeclarationContext _localctx = new AbstractMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_abstractMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT || _la==PUBLIC) {
				{
				setState(637);
				abstractMethodModifiers(0);
				}
			}

			setState(640);
			resultType();
			setState(641);
			methodDeclarator();
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(642);
				throwsRule();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractMethodModifiersContext extends ParserRuleContext {
		public AbstractMethodModifierContext abstractMethodModifier() {
			return getRuleContext(AbstractMethodModifierContext.class,0);
		}
		public AbstractMethodModifiersContext abstractMethodModifiers() {
			return getRuleContext(AbstractMethodModifiersContext.class,0);
		}
		public AbstractMethodModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractMethodModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAbstractMethodModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAbstractMethodModifiers(this);
		}
	}

	public final AbstractMethodModifiersContext abstractMethodModifiers() throws RecognitionException {
		return abstractMethodModifiers(0);
	}

	private AbstractMethodModifiersContext abstractMethodModifiers(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AbstractMethodModifiersContext _localctx = new AbstractMethodModifiersContext(_ctx, _parentState);
		AbstractMethodModifiersContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_abstractMethodModifiers, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(646);
			abstractMethodModifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(652);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AbstractMethodModifiersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_abstractMethodModifiers);
					setState(648);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(649);
					abstractMethodModifier();
					}
					} 
				}
				setState(654);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AbstractMethodModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public AbstractMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAbstractMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAbstractMethodModifier(this);
		}
	}

	public final AbstractMethodModifierContext abstractMethodModifier() throws RecognitionException {
		AbstractMethodModifierContext _localctx = new AbstractMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_abstractMethodModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_la = _input.LA(1);
			if ( !(_la==ABSTRACT || _la==PUBLIC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode ACH() { return getToken(JavaParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(JavaParser.FCH, 0); }
		public VariableInitializersContext variableInitializers() {
			return getRuleContext(VariableInitializersContext.class,0);
		}
		public TerminalNode VIRGULA() { return getToken(JavaParser.VIRGULA, 0); }
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			match(ACH);
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ACH - 67)) | (1L << (AP - 67)) | (1L << (EXCLAMACAO - 67)) | (1L << (TRUE - 67)) | (1L << (FALSE - 67)) | (1L << (ID - 67)) | (1L << (NOT - 67)) | (1L << (HEX_NUMERAL - 67)) | (1L << (OCTAL_NUMERAL - 67)) | (1L << (ASPAS - 67)) | (1L << (NULL - 67)))) != 0)) {
				{
				setState(658);
				variableInitializers();
				}
			}

			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(661);
				match(VIRGULA);
				}
			}

			setState(664);
			match(FCH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializersContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(JavaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(JavaParser.VIRGULA, i);
		}
		public VariableInitializersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableInitializers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableInitializers(this);
		}
	}

	public final VariableInitializersContext variableInitializers() throws RecognitionException {
		VariableInitializersContext _localctx = new VariableInitializersContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_variableInitializers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			variableInitializer();
			setState(671);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(667);
					match(VIRGULA);
					setState(668);
					variableInitializer();
					}
					} 
				}
				setState(673);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public List<TerminalNode> AC() { return getTokens(JavaParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(JavaParser.AC, i);
		}
		public List<TerminalNode> FC() { return getTokens(JavaParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(JavaParser.FC, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_type);
		try {
			int _alt;
			setState(683);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHORT:
			case BYTE:
			case INT:
			case LONG:
			case CHAR:
			case FLOAT:
			case LOGICAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				primitiveType();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(675);
				referenceType();
				setState(680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(676);
						match(AC);
						setState(677);
						match(FC);
						}
						} 
					}
					setState(682);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(JavaParser.LOGICAL, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_primitiveType);
		try {
			setState(687);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHORT:
			case BYTE:
			case INT:
			case LONG:
			case CHAR:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				numericType();
				}
				break;
			case LOGICAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				match(LOGICAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(JavaParser.FLOAT, 0); }
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitNumericType(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_numericType);
		try {
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHORT:
			case BYTE:
			case INT:
			case LONG:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				integralType();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				match(FLOAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegralTypeContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(JavaParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(JavaParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode LONG() { return getToken(JavaParser.LONG, 0); }
		public TerminalNode CHAR() { return getToken(JavaParser.CHAR, 0); }
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterIntegralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitIntegralType(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT) | (1L << BYTE) | (1L << INT) | (1L << LONG) | (1L << CHAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitReferenceType(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_referenceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_classOrInterfaceType);
		try {
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(698);
				interfaceType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_classType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceType(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode ACH() { return getToken(JavaParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(JavaParser.FCH, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			match(ACH);
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << SHORT) | (1L << BYTE) | (1L << INT) | (1L << LONG) | (1L << CHAR) | (1L << FLOAT) | (1L << LOGICAL) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << SUPER) | (1L << THROW) | (1L << INC) | (1L << DEC))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ACH - 67)) | (1L << (AP - 67)) | (1L << (IF - 67)) | (1L << (SWITCH - 67)) | (1L << (DO - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (BREAK - 67)) | (1L << (CONTINUE - 67)) | (1L << (RETURN - 67)) | (1L << (TRY - 67)) | (1L << (TRUE - 67)) | (1L << (FALSE - 67)) | (1L << (ID - 67)) | (1L << (SYNCHRONIZED - 67)) | (1L << (HEX_NUMERAL - 67)) | (1L << (OCTAL_NUMERAL - 67)) | (1L << (ASPAS - 67)) | (1L << (NULL - 67)))) != 0)) {
				{
				setState(706);
				blockStatements();
				}
			}

			setState(709);
			match(FCH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitBlockStatements(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(711);
				blockStatement();
				}
				}
				setState(714); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << SHORT) | (1L << BYTE) | (1L << INT) | (1L << LONG) | (1L << CHAR) | (1L << FLOAT) | (1L << LOGICAL) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << SUPER) | (1L << THROW) | (1L << INC) | (1L << DEC))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ACH - 67)) | (1L << (AP - 67)) | (1L << (IF - 67)) | (1L << (SWITCH - 67)) | (1L << (DO - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (BREAK - 67)) | (1L << (CONTINUE - 67)) | (1L << (RETURN - 67)) | (1L << (TRY - 67)) | (1L << (TRUE - 67)) | (1L << (FALSE - 67)) | (1L << (ID - 67)) | (1L << (SYNCHRONIZED - 67)) | (1L << (HEX_NUMERAL - 67)) | (1L << (OCTAL_NUMERAL - 67)) | (1L << (ASPAS - 67)) | (1L << (NULL - 67)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public TerminalNode PONTOV() { return getToken(JavaParser.PONTOV, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_blockStatement);
		try {
			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				localVariableDeclarationStatement();
				setState(717);
				match(PONTOV);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			localVariableDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			type();
			setState(725);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class,0);
		}
		public IfThenElseStatementContext ifThenElseStatement() {
			return getRuleContext(IfThenElseStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_statement);
		try {
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(727);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(728);
				labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(729);
				ifThenStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(730);
				ifThenElseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(731);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(732);
				forStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
			return getRuleContext(IfThenElseStatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext whileStatementNoShortIf() {
			return getRuleContext(WhileStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class,0);
		}
		public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitStatementNoShortIf(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_statementNoShortIf);
		try {
			setState(740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(736);
				labeledStatementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(737);
				ifThenElseStatementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(738);
				whileStatementNoShortIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(739);
				forStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public ThrowsRuleStatementContext throwsRuleStatement() {
			return getRuleContext(ThrowsRuleStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitStatementWithoutTrailingSubstatement(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(752);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACH:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				block();
				}
				break;
			case NUMERO:
			case NEW:
			case EXTENDS:
			case THIS:
			case SUPER:
			case INC:
			case DEC:
			case AP:
			case TRUE:
			case FALSE:
			case ID:
			case HEX_NUMERAL:
			case OCTAL_NUMERAL:
			case ASPAS:
			case NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				expressionStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(744);
				switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(745);
				doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 5);
				{
				setState(746);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(747);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(748);
				returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(749);
				synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 9);
				{
				setState(750);
				throwsRuleStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 10);
				{
				setState(751);
				tryStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(JavaParser.DOIS_PONTOS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(ID);
			setState(755);
			match(DOIS_PONTOS);
			setState(756);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(JavaParser.DOIS_PONTOS, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLabeledStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLabeledStatementNoShortIf(this);
		}
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(ID);
			setState(759);
			match(DOIS_PONTOS);
			setState(760);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			statementExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public PostdecrementExpressionContext postdecrementExpression() {
			return getRuleContext(PostdecrementExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_statementExpression);
		try {
			setState(771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				preIncrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(766);
				postIncrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(767);
				preDecrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(768);
				postdecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(769);
				methodInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(770);
				classInstanceCreationExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JavaParser.IF, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterIfThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitIfThenStatement(this);
		}
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(IF);
			setState(774);
			match(AP);
			setState(775);
			expression();
			setState(776);
			match(FP);
			setState(777);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JavaParser.IF, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(JavaParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterIfThenElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitIfThenElseStatement(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			match(IF);
			setState(780);
			match(AP);
			setState(781);
			expression();
			setState(782);
			match(FP);
			setState(783);
			statementNoShortIf();
			setState(784);
			match(ELSE);
			setState(785);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JavaParser.IF, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}
		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JavaParser.ELSE, 0); }
		public IfThenElseStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterIfThenElseStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitIfThenElseStatementNoShortIf(this);
		}
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(IF);
			setState(788);
			match(AP);
			setState(789);
			expression();
			setState(790);
			match(FP);
			setState(791);
			statementNoShortIf();
			setState(792);
			match(ELSE);
			setState(793);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(JavaParser.SWITCH, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(SWITCH);
			setState(796);
			match(AP);
			setState(797);
			expression();
			setState(798);
			match(FP);
			setState(799);
			switchBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public TerminalNode ACH() { return getToken(JavaParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(JavaParser.FCH, 0); }
		public SwitchBlockStatementGroupsContext switchBlockStatementGroups() {
			return getRuleContext(SwitchBlockStatementGroupsContext.class,0);
		}
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_switchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(ACH);
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(802);
				switchBlockStatementGroups();
				}
				break;
			}
			setState(806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE || _la==DEFAULT) {
				{
				setState(805);
				switchLabels();
				}
			}

			setState(808);
			match(FCH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupsContext extends ParserRuleContext {
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public SwitchBlockStatementGroupsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroups; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSwitchBlockStatementGroups(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSwitchBlockStatementGroups(this);
		}
	}

	public final SwitchBlockStatementGroupsContext switchBlockStatementGroups() throws RecognitionException {
		SwitchBlockStatementGroupsContext _localctx = new SwitchBlockStatementGroupsContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_switchBlockStatementGroups);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(811); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(810);
					switchBlockStatementGroup();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(813); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			switchLabels();
			setState(816);
			blockStatements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelsContext extends ParserRuleContext {
		public SwitchLabelContext switchLabel() {
			return getRuleContext(SwitchLabelContext.class,0);
		}
		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSwitchLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSwitchLabels(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_switchLabels);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			switchLabel();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public List<TerminalNode> CASE() { return getTokens(JavaParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(JavaParser.CASE, i);
		}
		public List<ConstantExpressionContext> constantExpression() {
			return getRuleContexts(ConstantExpressionContext.class);
		}
		public ConstantExpressionContext constantExpression(int i) {
			return getRuleContext(ConstantExpressionContext.class,i);
		}
		public List<TerminalNode> DOIS_PONTOS() { return getTokens(JavaParser.DOIS_PONTOS); }
		public TerminalNode DOIS_PONTOS(int i) {
			return getToken(JavaParser.DOIS_PONTOS, i);
		}
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_switchLabel);
		int _la;
		try {
			setState(830);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(824); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(820);
					match(CASE);
					setState(821);
					constantExpression();
					setState(822);
					match(DOIS_PONTOS);
					}
					}
					setState(826); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CASE );
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				match(DEFAULT);
				setState(829);
				match(DOIS_PONTOS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(WHILE);
			setState(833);
			match(AP);
			setState(834);
			expression();
			setState(835);
			match(FP);
			setState(836);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterWhileStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitWhileStatementNoShortIf(this);
		}
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(WHILE);
			setState(839);
			match(AP);
			setState(840);
			expression();
			setState(841);
			match(FP);
			setState(842);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(JavaParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitDoStatement(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(DO);
			setState(845);
			statement();
			setState(846);
			match(WHILE);
			setState(847);
			match(AP);
			setState(848);
			expression();
			setState(849);
			match(FP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JavaParser.FOR, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public List<TerminalNode> PONTOV() { return getTokens(JavaParser.PONTOV); }
		public TerminalNode PONTOV(int i) {
			return getToken(JavaParser.PONTOV, i);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			match(FOR);
			setState(852);
			match(AP);
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << SHORT) | (1L << BYTE) | (1L << INT) | (1L << LONG) | (1L << CHAR) | (1L << FLOAT) | (1L << LOGICAL) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << SUPER) | (1L << INC) | (1L << DEC))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (AP - 69)) | (1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (ID - 69)) | (1L << (HEX_NUMERAL - 69)) | (1L << (OCTAL_NUMERAL - 69)) | (1L << (ASPAS - 69)) | (1L << (NULL - 69)))) != 0)) {
				{
				setState(853);
				forInit();
				}
			}

			setState(856);
			match(PONTOV);
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (AP - 69)) | (1L << (EXCLAMACAO - 69)) | (1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (ID - 69)) | (1L << (NOT - 69)) | (1L << (HEX_NUMERAL - 69)) | (1L << (OCTAL_NUMERAL - 69)) | (1L << (ASPAS - 69)) | (1L << (NULL - 69)))) != 0)) {
				{
				setState(857);
				expression();
				}
			}

			setState(860);
			match(PONTOV);
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << SUPER) | (1L << INC) | (1L << DEC))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (AP - 69)) | (1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (ID - 69)) | (1L << (HEX_NUMERAL - 69)) | (1L << (OCTAL_NUMERAL - 69)) | (1L << (ASPAS - 69)) | (1L << (NULL - 69)))) != 0)) {
				{
				setState(861);
				forUpdate();
				}
			}

			setState(864);
			match(FP);
			setState(865);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JavaParser.FOR, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitForStatementNoShortIf(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_forStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			match(FOR);
			setState(868);
			match(AP);
			setState(870);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(869);
				forInit();
				}
				break;
			}
			setState(873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(872);
				expression();
				}
				break;
			}
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << SUPER) | (1L << INC) | (1L << DEC))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (AP - 69)) | (1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (ID - 69)) | (1L << (HEX_NUMERAL - 69)) | (1L << (OCTAL_NUMERAL - 69)) | (1L << (ASPAS - 69)) | (1L << (NULL - 69)))) != 0)) {
				{
				setState(875);
				forUpdate();
				}
			}

			setState(878);
			match(FP);
			setState(879);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_forInit);
		try {
			setState(883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(881);
				statementExpressionList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(882);
				localVariableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			statementExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionListContext extends ParserRuleContext {
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(JavaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(JavaParser.VIRGULA, i);
		}
		public StatementExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterStatementExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitStatementExpressionList(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			statementExpression();
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(888);
				match(VIRGULA);
				setState(889);
				statementExpression();
				}
				}
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(JavaParser.BREAK, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			match(BREAK);
			setState(897);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(896);
				match(ID);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(JavaParser.CONTINUE, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			match(CONTINUE);
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(900);
				match(ID);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JavaParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			match(RETURN);
			setState(905);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(904);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowsRuleStatementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(JavaParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowsRuleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwsRuleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterThrowsRuleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitThrowsRuleStatement(this);
		}
	}

	public final ThrowsRuleStatementContext throwsRuleStatement() throws RecognitionException {
		ThrowsRuleStatementContext _localctx = new ThrowsRuleStatementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_throwsRuleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			match(THROW);
			setState(908);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSynchronizedStatement(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(SYNCHRONIZED);
			setState(911);
			match(AP);
			setState(912);
			expression();
			setState(913);
			match(FP);
			setState(914);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(JavaParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public FinallyRuleContext finallyRule() {
			return getRuleContext(FinallyRuleContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_tryStatement);
		int _la;
		try {
			setState(927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(916);
				match(TRY);
				setState(917);
				block();
				setState(918);
				catches();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(920);
				match(TRY);
				setState(921);
				block();
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(922);
					catches();
					}
				}

				setState(925);
				finallyRule();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchesContext extends ParserRuleContext {
		public CatchClauseContext catchClause() {
			return getRuleContext(CatchClauseContext.class,0);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCatches(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_catches);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			catchClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public List<TerminalNode> CATCH() { return getTokens(JavaParser.CATCH); }
		public TerminalNode CATCH(int i) {
			return getToken(JavaParser.CATCH, i);
		}
		public List<TerminalNode> AP() { return getTokens(JavaParser.AP); }
		public TerminalNode AP(int i) {
			return getToken(JavaParser.AP, i);
		}
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> FP() { return getTokens(JavaParser.FP); }
		public TerminalNode FP(int i) {
			return getToken(JavaParser.FP, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(931);
				match(CATCH);
				setState(932);
				match(AP);
				setState(933);
				formalParameter();
				setState(934);
				match(FP);
				setState(935);
				block();
				}
				}
				setState(939); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CATCH );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyRuleContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(JavaParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFinallyRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFinallyRule(this);
		}
	}

	public final FinallyRuleContext finallyRule() throws RecognitionException {
		FinallyRuleContext _localctx = new FinallyRuleContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_finallyRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			match(FINALLY);
			setState(942);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			assignmentExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_assignmentExpression);
		try {
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(948);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(949);
				assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			leftHandSide();
			setState(953);
			assignmentOperator();
			setState(954);
			assignmentExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftHandSideContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLeftHandSide(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_leftHandSide);
		try {
			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(956);
				expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(957);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(958);
				arrayAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode IGUAL_ATRIB() { return getToken(JavaParser.IGUAL_ATRIB, 0); }
		public TerminalNode MULT_ATRIB() { return getToken(JavaParser.MULT_ATRIB, 0); }
		public TerminalNode DIV_ATRIB() { return getToken(JavaParser.DIV_ATRIB, 0); }
		public TerminalNode MOD_ATRIB() { return getToken(JavaParser.MOD_ATRIB, 0); }
		public TerminalNode ADD_ATRIB() { return getToken(JavaParser.ADD_ATRIB, 0); }
		public TerminalNode BIT_LEFT_ATRIB() { return getToken(JavaParser.BIT_LEFT_ATRIB, 0); }
		public TerminalNode BIT_RIGHT_ATRIB() { return getToken(JavaParser.BIT_RIGHT_ATRIB, 0); }
		public TerminalNode U_BIT_RIGHT_ATRIB() { return getToken(JavaParser.U_BIT_RIGHT_ATRIB, 0); }
		public TerminalNode AND_ATRIB() { return getToken(JavaParser.AND_ATRIB, 0); }
		public TerminalNode XOR_ATRIB() { return getToken(JavaParser.XOR_ATRIB, 0); }
		public TerminalNode OR_ATRIB() { return getToken(JavaParser.OR_ATRIB, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL_ATRIB) | (1L << MULT_ATRIB) | (1L << DIV_ATRIB) | (1L << MOD_ATRIB) | (1L << ADD_ATRIB) | (1L << BIT_LEFT_ATRIB) | (1L << BIT_RIGHT_ATRIB) | (1L << U_BIT_RIGHT_ATRIB) | (1L << AND_ATRIB) | (1L << XOR_ATRIB) | (1L << OR_ATRIB))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode INTERROGACAO() { return getToken(JavaParser.INTERROGACAO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(JavaParser.DOIS_PONTOS, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_conditionalExpression);
		try {
			setState(970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(963);
				conditionalOrExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
				conditionalOrExpression();
				setState(965);
				match(INTERROGACAO);
				setState(966);
				expression();
				setState(967);
				match(DOIS_PONTOS);
				setState(968);
				conditionalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
		}
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(JavaParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(JavaParser.OR, i);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitConditionalOrExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			conditionalAndExpression();
			setState(977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(973);
				match(OR);
				setState(974);
				conditionalAndExpression();
				}
				}
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(JavaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(JavaParser.AND, i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitConditionalAndExpression(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			inclusiveOrExpression();
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(981);
				match(AND);
				setState(982);
				inclusiveOrExpression();
				}
				}
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_inclusiveOrExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			exclusiveOrExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(JavaParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(JavaParser.CARET, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			andExpression();
			setState(995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(991);
				match(CARET);
				setState(992);
				andExpression();
				}
				}
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(JavaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(JavaParser.BITAND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			equalityExpression(0);
			setState(1003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(999);
				match(BITAND);
				setState(1000);
				equalityExpression(0);
				}
				}
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(JavaParser.IGUAL, 0); }
		public TerminalNode DIF() { return getToken(JavaParser.DIF, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 226;
		enterRecursionRule(_localctx, 226, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1007);
			relationalExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1017);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1015);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(1009);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1010);
						match(IGUAL);
						setState(1011);
						relationalExpression();
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(1012);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1013);
						match(DIF);
						setState(1014);
						relationalExpression();
						}
						break;
					}
					} 
				}
				setState(1019);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<TerminalNode> MENOR() { return getTokens(JavaParser.MENOR); }
		public TerminalNode MENOR(int i) {
			return getToken(JavaParser.MENOR, i);
		}
		public List<TerminalNode> MAIOR() { return getTokens(JavaParser.MAIOR); }
		public TerminalNode MAIOR(int i) {
			return getToken(JavaParser.MAIOR, i);
		}
		public List<TerminalNode> MENOR_IGUAL() { return getTokens(JavaParser.MENOR_IGUAL); }
		public TerminalNode MENOR_IGUAL(int i) {
			return getToken(JavaParser.MENOR_IGUAL, i);
		}
		public List<TerminalNode> MAIOR_IGUAL() { return getTokens(JavaParser.MAIOR_IGUAL); }
		public TerminalNode MAIOR_IGUAL(int i) {
			return getToken(JavaParser.MAIOR_IGUAL, i);
		}
		public List<TerminalNode> INSTANCEOF() { return getTokens(JavaParser.INSTANCEOF); }
		public TerminalNode INSTANCEOF(int i) {
			return getToken(JavaParser.INSTANCEOF, i);
		}
		public List<ReferenceTypeContext> referenceType() {
			return getRuleContexts(ReferenceTypeContext.class);
		}
		public ReferenceTypeContext referenceType(int i) {
			return getRuleContext(ReferenceTypeContext.class,i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_relationalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			shiftExpression();
			setState(1033);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1031);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MENOR:
						{
						setState(1021);
						match(MENOR);
						setState(1022);
						shiftExpression();
						}
						break;
					case MAIOR:
						{
						setState(1023);
						match(MAIOR);
						setState(1024);
						shiftExpression();
						}
						break;
					case MENOR_IGUAL:
						{
						setState(1025);
						match(MENOR_IGUAL);
						setState(1026);
						shiftExpression();
						}
						break;
					case MAIOR_IGUAL:
						{
						setState(1027);
						match(MAIOR_IGUAL);
						setState(1028);
						shiftExpression();
						}
						break;
					case INSTANCEOF:
						{
						setState(1029);
						match(INSTANCEOF);
						setState(1030);
						referenceType();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1035);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> SHIFT_LEFT() { return getTokens(JavaParser.SHIFT_LEFT); }
		public TerminalNode SHIFT_LEFT(int i) {
			return getToken(JavaParser.SHIFT_LEFT, i);
		}
		public List<TerminalNode> SHIFT_RIGHT() { return getTokens(JavaParser.SHIFT_RIGHT); }
		public TerminalNode SHIFT_RIGHT(int i) {
			return getToken(JavaParser.SHIFT_RIGHT, i);
		}
		public List<TerminalNode> U_SHIFT_RIGHT() { return getTokens(JavaParser.U_SHIFT_RIGHT); }
		public TerminalNode U_SHIFT_RIGHT(int i) {
			return getToken(JavaParser.U_SHIFT_RIGHT, i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			additiveExpression();
			setState(1045);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1043);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SHIFT_LEFT:
						{
						{
						setState(1037);
						match(SHIFT_LEFT);
						setState(1038);
						additiveExpression();
						}
						}
						break;
					case SHIFT_RIGHT:
						{
						{
						setState(1039);
						match(SHIFT_RIGHT);
						setState(1040);
						additiveExpression();
						}
						}
						break;
					case U_SHIFT_RIGHT:
						{
						{
						setState(1041);
						match(U_SHIFT_RIGHT);
						setState(1042);
						additiveExpression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1047);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(JavaParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(JavaParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(JavaParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(JavaParser.SUB, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			multiplicativeExpression();
			setState(1055);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1053);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ADD:
						{
						setState(1049);
						match(ADD);
						setState(1050);
						multiplicativeExpression();
						}
						break;
					case SUB:
						{
						setState(1051);
						match(SUB);
						setState(1052);
						multiplicativeExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1057);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(JavaParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(JavaParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(JavaParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(JavaParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(JavaParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(JavaParser.MOD, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			unaryExpression();
			setState(1067);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1065);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MULT:
						{
						setState(1059);
						match(MULT);
						setState(1060);
						unaryExpression();
						}
						break;
					case DIV:
						{
						setState(1061);
						match(DIV);
						setState(1062);
						unaryExpression();
						}
						break;
					case MOD:
						{
						setState(1063);
						match(MOD);
						setState(1064);
						unaryExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1069);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_castExpression);
		try {
			setState(1080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1070);
				match(AP);
				setState(1071);
				primitiveType();
				setState(1072);
				match(FP);
				setState(1073);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1075);
				match(AP);
				setState(1076);
				referenceType();
				setState(1077);
				match(FP);
				setState(1078);
				unaryExpressionNotPlusMinus();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(JavaParser.ADD, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(JavaParser.SUB, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_unaryExpression);
		try {
			setState(1089);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1082);
				preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1083);
				preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(1084);
				match(ADD);
				setState(1085);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(1086);
				match(SUB);
				setState(1087);
				unaryExpression();
				}
				break;
			case NUMERO:
			case NEW:
			case THIS:
			case AP:
			case EXCLAMACAO:
			case TRUE:
			case FALSE:
			case ID:
			case NOT:
			case HEX_NUMERAL:
			case OCTAL_NUMERAL:
			case ASPAS:
			case NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1088);
				unaryExpressionNotPlusMinus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(JavaParser.DEC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPreDecrementExpression(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			match(DEC);
			setState(1092);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(JavaParser.INC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPreIncrementExpression(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			match(INC);
			setState(1095);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public PostFixExpressionContext postFixExpression() {
			return getRuleContext(PostFixExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(JavaParser.NOT, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode EXCLAMACAO() { return getToken(JavaParser.EXCLAMACAO, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(1103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1097);
				postFixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1098);
				match(NOT);
				setState(1099);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1100);
				match(EXCLAMACAO);
				setState(1101);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1102);
				castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostdecrementExpressionContext extends ParserRuleContext {
		public PostFixExpressionContext postFixExpression() {
			return getRuleContext(PostFixExpressionContext.class,0);
		}
		public TerminalNode DEC() { return getToken(JavaParser.DEC, 0); }
		public PostdecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postdecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPostdecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPostdecrementExpression(this);
		}
	}

	public final PostdecrementExpressionContext postdecrementExpression() throws RecognitionException {
		PostdecrementExpressionContext _localctx = new PostdecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_postdecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			postFixExpression();
			setState(1106);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostFixExpressionContext postFixExpression() {
			return getRuleContext(PostFixExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(JavaParser.INC, 0); }
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPostIncrementExpression(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			postFixExpression();
			setState(1109);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostFixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode PONTOV() { return getToken(JavaParser.PONTOV, 0); }
		public PostFixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postFixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPostFixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPostFixExpression(this);
		}
	}

	public final PostFixExpressionContext postFixExpression() throws RecognitionException {
		PostFixExpressionContext _localctx = new PostFixExpressionContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_postFixExpression);
		try {
			setState(1115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1111);
				primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1112);
				expressionName();
				setState(1113);
				match(PONTOV);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public TerminalNode PONTO() { return getToken(JavaParser.PONTO, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMethodInvocation(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_methodInvocation);
		int _la;
		try {
			setState(1132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1117);
				methodName();
				setState(1118);
				match(AP);
				setState(1120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (AP - 69)) | (1L << (EXCLAMACAO - 69)) | (1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (ID - 69)) | (1L << (NOT - 69)) | (1L << (HEX_NUMERAL - 69)) | (1L << (OCTAL_NUMERAL - 69)) | (1L << (ASPAS - 69)) | (1L << (NULL - 69)))) != 0)) {
					{
					setState(1119);
					argumentlist();
					}
				}

				setState(1122);
				match(FP);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1124);
				match(SUPER);
				setState(1125);
				match(PONTO);
				setState(1126);
				match(ID);
				setState(1127);
				match(AP);
				setState(1129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (AP - 69)) | (1L << (EXCLAMACAO - 69)) | (1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (ID - 69)) | (1L << (NOT - 69)) | (1L << (HEX_NUMERAL - 69)) | (1L << (OCTAL_NUMERAL - 69)) | (1L << (ASPAS - 69)) | (1L << (NULL - 69)))) != 0)) {
					{
					setState(1128);
					argumentlist();
					}
				}

				setState(1131);
				match(FP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccessContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(JavaParser.PONTO, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public SuperRuleContext superRule() {
			return getRuleContext(SuperRuleContext.class,0);
		}
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFieldAccess(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_fieldAccess);
		try {
			setState(1142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
			case NEW:
			case THIS:
			case AP:
			case TRUE:
			case FALSE:
			case ID:
			case HEX_NUMERAL:
			case OCTAL_NUMERAL:
			case ASPAS:
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1134);
				primary();
				setState(1135);
				match(PONTO);
				setState(1136);
				match(ID);
				}
				break;
			case EXTENDS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1138);
				superRule();
				setState(1139);
				match(PONTO);
				setState(1140);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoNewArrayContext primaryNoNewArray() {
			return getRuleContext(PrimaryNoNewArrayContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_primary);
		try {
			setState(1146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1144);
				primaryNoNewArray();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1145);
				arrayCreationExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPrimaryNoNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPrimaryNoNewArray(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_primaryNoNewArray);
		try {
			setState(1155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
			case TRUE:
			case FALSE:
			case ID:
			case HEX_NUMERAL:
			case OCTAL_NUMERAL:
			case ASPAS:
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1148);
				literal();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1149);
				match(THIS);
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1150);
				match(AP);
				setState(1151);
				expression();
				setState(1152);
				match(FP);
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(1154);
				classInstanceCreationExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassInstanceCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassInstanceCreationExpression(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_classInstanceCreationExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157);
			match(NEW);
			setState(1158);
			classType();
			setState(1159);
			match(AP);
			setState(1161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (AP - 69)) | (1L << (EXCLAMACAO - 69)) | (1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (ID - 69)) | (1L << (NOT - 69)) | (1L << (HEX_NUMERAL - 69)) | (1L << (OCTAL_NUMERAL - 69)) | (1L << (ASPAS - 69)) | (1L << (NULL - 69)))) != 0)) {
				{
				setState(1160);
				argumentlist();
				}
			}

			setState(1163);
			match(FP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentlistContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(JavaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(JavaParser.VIRGULA, i);
		}
		public ArgumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArgumentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArgumentlist(this);
		}
	}

	public final ArgumentlistContext argumentlist() throws RecognitionException {
		ArgumentlistContext _localctx = new ArgumentlistContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_argumentlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			expression();
			setState(1170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(1166);
				match(VIRGULA);
				setState(1167);
				expression();
				}
				}
				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArrayCreationExpression(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_arrayCreationExpression);
		try {
			setState(1185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1173);
				match(NEW);
				setState(1174);
				primitiveType();
				setState(1175);
				dimExprs();
				setState(1177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(1176);
					dims();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1179);
				match(NEW);
				setState(1180);
				classOrInterfaceType();
				setState(1181);
				dimExprs();
				setState(1183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1182);
					dims();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprsContext extends ParserRuleContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitDimExprs(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1188); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1187);
					dimExpr();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1190); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprContext extends ParserRuleContext {
		public TerminalNode AC() { return getToken(JavaParser.AC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FC() { return getToken(JavaParser.FC, 0); }
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterDimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitDimExpr(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_dimExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			match(AC);
			setState(1193);
			expression();
			setState(1194);
			match(FC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimsContext extends ParserRuleContext {
		public List<TerminalNode> AC() { return getTokens(JavaParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(JavaParser.AC, i);
		}
		public List<TerminalNode> FC() { return getTokens(JavaParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(JavaParser.FC, i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitDims(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_dims);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1198); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1196);
					match(AC);
					setState(1197);
					match(FC);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1200); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode AC() { return getToken(JavaParser.AC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FC() { return getToken(JavaParser.FC, 0); }
		public PrimaryNoNewArrayContext primaryNoNewArray() {
			return getRuleContext(PrimaryNoNewArrayContext.class,0);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArrayAccess(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_arrayAccess);
		try {
			setState(1212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1202);
				expressionName();
				setState(1203);
				match(AC);
				setState(1204);
				expression();
				setState(1205);
				match(FC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1207);
				primaryNoNewArray();
				setState(1208);
				match(AC);
				setState(1209);
				expression();
				setState(1210);
				match(FC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageNameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaParser.ID, i);
		}
		public List<TerminalNode> PONTO() { return getTokens(JavaParser.PONTO); }
		public TerminalNode PONTO(int i) {
			return getToken(JavaParser.PONTO, i);
		}
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPackageName(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		PackageNameContext _localctx = new PackageNameContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_packageName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			match(ID);
			setState(1219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1215);
					match(PONTO);
					setState(1216);
					match(ID);
					}
					} 
				}
				setState(1221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(JavaParser.PONTO, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_typeName);
		try {
			setState(1227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1222);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1223);
				packageName();
				setState(1224);
				match(PONTO);
				setState(1225);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSimpleTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSimpleTypeName(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(JavaParser.PONTO, 0); }
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExpressionName(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_expressionName);
		try {
			setState(1236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1231);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1232);
				ambiguousName();
				setState(1233);
				match(PONTO);
				setState(1234);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(JavaParser.PONTO, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMethodName(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_methodName);
		try {
			setState(1243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1238);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1239);
				ambiguousName();
				setState(1240);
				match(PONTO);
				setState(1241);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbiguousNameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaParser.ID, i);
		}
		public List<TerminalNode> PONTO() { return getTokens(JavaParser.PONTO); }
		public TerminalNode PONTO(int i) {
			return getToken(JavaParser.PONTO, i);
		}
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAmbiguousName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAmbiguousName(this);
		}
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_ambiguousName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			match(ID);
			setState(1250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1246);
					match(PONTO);
					setState(1247);
					match(ID);
					}
					} 
				}
				setState(1252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatingPointLiteralContext floatingPointLiteral() {
			return getRuleContext(FloatingPointLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public CharacterLiteralContext characterLiteral() {
			return getRuleContext(CharacterLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_literal);
		try {
			setState(1259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1253);
				integerLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1254);
				floatingPointLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1255);
				booleanLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1256);
				characterLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1257);
				stringLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1258);
				nullLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public DecimalIntegerLiteralContext decimalIntegerLiteral() {
			return getRuleContext(DecimalIntegerLiteralContext.class,0);
		}
		public HexIntegerLiteralContext hexIntegerLiteral() {
			return getRuleContext(HexIntegerLiteralContext.class,0);
		}
		public OctalIntegerLiteralContext octalIntegerLiteral() {
			return getRuleContext(OctalIntegerLiteralContext.class,0);
		}
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_integerLiteral);
		try {
			setState(1264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1261);
				decimalIntegerLiteral();
				}
				break;
			case HEX_NUMERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1262);
				hexIntegerLiteral();
				}
				break;
			case OCTAL_NUMERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1263);
				octalIntegerLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalIntegerLiteralContext extends ParserRuleContext {
		public DecimalNumeralContext decimalNumeral() {
			return getRuleContext(DecimalNumeralContext.class,0);
		}
		public TerminalNode INTEGER_TYPE_SUFFIX() { return getToken(JavaParser.INTEGER_TYPE_SUFFIX, 0); }
		public DecimalIntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalIntegerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterDecimalIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitDecimalIntegerLiteral(this);
		}
	}

	public final DecimalIntegerLiteralContext decimalIntegerLiteral() throws RecognitionException {
		DecimalIntegerLiteralContext _localctx = new DecimalIntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_decimalIntegerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			decimalNumeral();
			setState(1268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1267);
				match(INTEGER_TYPE_SUFFIX);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HexIntegerLiteralContext extends ParserRuleContext {
		public TerminalNode HEX_NUMERAL() { return getToken(JavaParser.HEX_NUMERAL, 0); }
		public TerminalNode INTEGER_TYPE_SUFFIX() { return getToken(JavaParser.INTEGER_TYPE_SUFFIX, 0); }
		public HexIntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexIntegerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterHexIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitHexIntegerLiteral(this);
		}
	}

	public final HexIntegerLiteralContext hexIntegerLiteral() throws RecognitionException {
		HexIntegerLiteralContext _localctx = new HexIntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_hexIntegerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			match(HEX_NUMERAL);
			setState(1272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1271);
				match(INTEGER_TYPE_SUFFIX);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OctalIntegerLiteralContext extends ParserRuleContext {
		public TerminalNode OCTAL_NUMERAL() { return getToken(JavaParser.OCTAL_NUMERAL, 0); }
		public TerminalNode INTEGER_TYPE_SUFFIX() { return getToken(JavaParser.INTEGER_TYPE_SUFFIX, 0); }
		public OctalIntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octalIntegerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterOctalIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitOctalIntegerLiteral(this);
		}
	}

	public final OctalIntegerLiteralContext octalIntegerLiteral() throws RecognitionException {
		OctalIntegerLiteralContext _localctx = new OctalIntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_octalIntegerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			match(OCTAL_NUMERAL);
			setState(1276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1275);
				match(INTEGER_TYPE_SUFFIX);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalNumeralContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(JavaParser.NUMERO, 0); }
		public DecimalNumeralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalNumeral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterDecimalNumeral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitDecimalNumeral(this);
		}
	}

	public final DecimalNumeralContext decimalNumeral() throws RecognitionException {
		DecimalNumeralContext _localctx = new DecimalNumeralContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_decimalNumeral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1278);
			match(NUMERO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitsContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(JavaParser.NUMERO, 0); }
		public DigitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterDigits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitDigits(this);
		}
	}

	public final DigitsContext digits() throws RecognitionException {
		DigitsContext _localctx = new DigitsContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_digits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			match(NUMERO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointLiteralContext extends ParserRuleContext {
		public List<DigitsContext> digits() {
			return getRuleContexts(DigitsContext.class);
		}
		public DigitsContext digits(int i) {
			return getRuleContext(DigitsContext.class,i);
		}
		public TerminalNode PONTO() { return getToken(JavaParser.PONTO, 0); }
		public ExponentPartContext exponentPart() {
			return getRuleContext(ExponentPartContext.class,0);
		}
		public FloatTypeSuffixContext floatTypeSuffix() {
			return getRuleContext(FloatTypeSuffixContext.class,0);
		}
		public FloatingPointLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFloatingPointLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFloatingPointLiteral(this);
		}
	}

	public final FloatingPointLiteralContext floatingPointLiteral() throws RecognitionException {
		FloatingPointLiteralContext _localctx = new FloatingPointLiteralContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_floatingPointLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1282);
			digits();
			setState(1283);
			match(PONTO);
			setState(1285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1284);
				digits();
				}
				break;
			}
			setState(1288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1287);
				exponentPart();
				}
				break;
			}
			setState(1291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1290);
				floatTypeSuffix();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExponentPartContext extends ParserRuleContext {
		public ExponentIndicatorContext exponentIndicator() {
			return getRuleContext(ExponentIndicatorContext.class,0);
		}
		public SignedIntegerContext signedInteger() {
			return getRuleContext(SignedIntegerContext.class,0);
		}
		public ExponentPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponentPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExponentPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExponentPart(this);
		}
	}

	public final ExponentPartContext exponentPart() throws RecognitionException {
		ExponentPartContext _localctx = new ExponentPartContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_exponentPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			exponentIndicator();
			setState(1294);
			signedInteger();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExponentIndicatorContext extends ParserRuleContext {
		public TerminalNode EXP() { return getToken(JavaParser.EXP, 0); }
		public ExponentIndicatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponentIndicator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExponentIndicator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExponentIndicator(this);
		}
	}

	public final ExponentIndicatorContext exponentIndicator() throws RecognitionException {
		ExponentIndicatorContext _localctx = new ExponentIndicatorContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_exponentIndicator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			match(EXP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedIntegerContext extends ParserRuleContext {
		public DigitsContext digits() {
			return getRuleContext(DigitsContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public SignedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSignedInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSignedInteger(this);
		}
	}

	public final SignedIntegerContext signedInteger() throws RecognitionException {
		SignedIntegerContext _localctx = new SignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_signedInteger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADD || _la==SUB) {
				{
				setState(1298);
				sign();
				}
			}

			setState(1301);
			digits();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(JavaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JavaParser.SUB, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatTypeSuffixContext extends ParserRuleContext {
		public TerminalNode FLOAT_S() { return getToken(JavaParser.FLOAT_S, 0); }
		public FloatTypeSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatTypeSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFloatTypeSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFloatTypeSuffix(this);
		}
	}

	public final FloatTypeSuffixContext floatTypeSuffix() throws RecognitionException {
		FloatTypeSuffixContext _localctx = new FloatTypeSuffixContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_floatTypeSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			match(FLOAT_S);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterLiteralContext extends ParserRuleContext {
		public List<TerminalNode> ASPAS() { return getTokens(JavaParser.ASPAS); }
		public TerminalNode ASPAS(int i) {
			return getToken(JavaParser.ASPAS, i);
		}
		public TerminalNode LETRA() { return getToken(JavaParser.LETRA, 0); }
		public CharacterLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCharacterLiteral(this);
		}
	}

	public final CharacterLiteralContext characterLiteral() throws RecognitionException {
		CharacterLiteralContext _localctx = new CharacterLiteralContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1307);
			match(ASPAS);
			setState(1308);
			match(LETRA);
			setState(1309);
			match(ASPAS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(JavaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JavaParser.FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitBooleanLiteral(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1313);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullLiteralContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(JavaParser.NULL, 0); }
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitNullLiteral(this);
		}
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return classBodyDeclarations_sempred((ClassBodyDeclarationsContext)_localctx, predIndex);
		case 18:
			return constructorModifiers_sempred((ConstructorModifiersContext)_localctx, predIndex);
		case 37:
			return methodModifiers_sempred((MethodModifiersContext)_localctx, predIndex);
		case 51:
			return abstractMethodModifiers_sempred((AbstractMethodModifiersContext)_localctx, predIndex);
		case 113:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean classBodyDeclarations_sempred(ClassBodyDeclarationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean constructorModifiers_sempred(ConstructorModifiersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean methodModifiers_sempred(MethodModifiersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean abstractMethodModifiers_sempred(AbstractMethodModifiersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3o\u0528\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\3\2\5\2\u0144\n\2\3\2\7\2\u0147\n\2\f\2\16\2"+
		"\u014a\13\2\3\2\5\2\u014d\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\5\5\u015a\n\5\5\5\u015c\n\5\3\6\6\6\u015f\n\6\r\6\16\6\u0160\3\7"+
		"\3\7\5\7\u0165\n\7\3\b\5\b\u0168\n\b\3\b\3\b\3\b\5\b\u016d\n\b\3\b\5\b"+
		"\u0170\n\b\3\b\3\b\3\t\3\t\7\t\u0176\n\t\f\t\16\t\u0179\13\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u0186\n\r\f\r\16\r\u0189\13"+
		"\r\3\16\3\16\5\16\u018d\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u0196"+
		"\n\17\f\17\16\17\u0199\13\17\3\20\3\20\3\20\5\20\u019e\n\20\3\21\3\21"+
		"\5\21\u01a2\n\21\3\22\3\22\3\22\3\23\5\23\u01a8\n\23\3\23\3\23\5\23\u01ac"+
		"\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u01b5\n\24\f\24\16\24\u01b8"+
		"\13\24\3\25\3\25\3\26\3\26\3\26\5\26\u01bf\n\26\3\26\3\26\3\27\3\27\3"+
		"\27\5\27\u01c6\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u01cd\n\27\3\27\3\27"+
		"\7\27\u01d1\n\27\f\27\16\27\u01d4\13\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\7\32\u01df\n\32\f\32\16\32\u01e2\13\32\3\33\3\33\5\33"+
		"\u01e6\n\33\3\33\5\33\u01e9\n\33\3\33\3\33\3\34\3\34\3\34\5\34\u01f0\n"+
		"\34\3\34\3\34\3\34\3\34\5\34\u01f6\n\34\3\34\5\34\u01f9\n\34\3\35\5\35"+
		"\u01fc\n\35\3\35\3\35\3\35\5\35\u0201\n\35\3\35\3\35\3\35\3\36\6\36\u0207"+
		"\n\36\r\36\16\36\u0208\3\37\3\37\3 \3 \3 \7 \u0210\n \f \16 \u0213\13"+
		" \3!\3!\3!\3!\3!\5!\u021a\n!\3\"\3\"\3\"\7\"\u021f\n\"\f\"\16\"\u0222"+
		"\13\"\3#\3#\5#\u0226\n#\3$\3$\3$\3%\5%\u022c\n%\3%\3%\3%\5%\u0231\n%\3"+
		"&\3&\3&\5&\u0236\n&\3&\5&\u0239\n&\3\'\3\'\3\'\3\'\3\'\7\'\u0240\n\'\f"+
		"\'\16\'\u0243\13\'\3(\3(\3)\3)\3)\5)\u024a\n)\3)\3)\3*\3*\5*\u0250\n*"+
		"\3+\5+\u0253\n+\3+\3+\3+\5+\u0258\n+\3+\3+\3,\6,\u025d\n,\r,\16,\u025e"+
		"\3-\3-\3.\3.\3.\3.\6.\u0267\n.\r.\16.\u0268\3/\3/\5/\u026d\n/\3/\3/\3"+
		"\60\6\60\u0272\n\60\r\60\16\60\u0273\3\61\3\61\5\61\u0278\n\61\3\62\3"+
		"\62\3\62\3\62\3\63\3\63\3\64\5\64\u0281\n\64\3\64\3\64\3\64\5\64\u0286"+
		"\n\64\3\65\3\65\3\65\3\65\3\65\7\65\u028d\n\65\f\65\16\65\u0290\13\65"+
		"\3\66\3\66\3\67\3\67\5\67\u0296\n\67\3\67\5\67\u0299\n\67\3\67\3\67\3"+
		"8\38\38\78\u02a0\n8\f8\168\u02a3\138\39\39\39\39\79\u02a9\n9\f9\169\u02ac"+
		"\139\59\u02ae\n9\3:\3:\5:\u02b2\n:\3;\3;\5;\u02b6\n;\3<\3<\3=\3=\3>\3"+
		">\5>\u02be\n>\3?\3?\3@\3@\3A\3A\5A\u02c6\nA\3A\3A\3B\6B\u02cb\nB\rB\16"+
		"B\u02cc\3C\3C\3C\3C\5C\u02d3\nC\3D\3D\3E\3E\3E\3F\3F\3F\3F\3F\3F\5F\u02e0"+
		"\nF\3G\3G\3G\3G\3G\5G\u02e7\nG\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u02f3"+
		"\nH\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3L\3L\3L\3L\3L\3L\3L\5L\u0306\nL\3M"+
		"\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3P\3P"+
		"\3P\3P\3P\3P\3Q\3Q\5Q\u0326\nQ\3Q\5Q\u0329\nQ\3Q\3Q\3R\6R\u032e\nR\rR"+
		"\16R\u032f\3S\3S\3S\3T\3T\3U\3U\3U\3U\6U\u033b\nU\rU\16U\u033c\3U\3U\5"+
		"U\u0341\nU\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\3"+
		"Y\3Y\3Y\5Y\u0359\nY\3Y\3Y\5Y\u035d\nY\3Y\3Y\5Y\u0361\nY\3Y\3Y\3Y\3Z\3"+
		"Z\3Z\5Z\u0369\nZ\3Z\5Z\u036c\nZ\3Z\5Z\u036f\nZ\3Z\3Z\3Z\3[\3[\5[\u0376"+
		"\n[\3\\\3\\\3]\3]\3]\7]\u037d\n]\f]\16]\u0380\13]\3^\3^\5^\u0384\n^\3"+
		"_\3_\5_\u0388\n_\3`\3`\5`\u038c\n`\3a\3a\3a\3b\3b\3b\3b\3b\3b\3c\3c\3"+
		"c\3c\3c\3c\3c\5c\u039e\nc\3c\3c\5c\u03a2\nc\3d\3d\3e\3e\3e\3e\3e\3e\6"+
		"e\u03ac\ne\re\16e\u03ad\3f\3f\3f\3g\3g\3h\3h\3i\3i\5i\u03b9\ni\3j\3j\3"+
		"j\3j\3k\3k\3k\5k\u03c2\nk\3l\3l\3m\3m\3m\3m\3m\3m\3m\5m\u03cd\nm\3n\3"+
		"n\3n\7n\u03d2\nn\fn\16n\u03d5\13n\3o\3o\3o\7o\u03da\no\fo\16o\u03dd\13"+
		"o\3p\3p\3q\3q\3q\7q\u03e4\nq\fq\16q\u03e7\13q\3r\3r\3r\7r\u03ec\nr\fr"+
		"\16r\u03ef\13r\3s\3s\3s\3s\3s\3s\3s\3s\3s\7s\u03fa\ns\fs\16s\u03fd\13"+
		"s\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\7t\u040a\nt\ft\16t\u040d\13t\3u\3u"+
		"\3u\3u\3u\3u\3u\7u\u0416\nu\fu\16u\u0419\13u\3v\3v\3v\3v\3v\7v\u0420\n"+
		"v\fv\16v\u0423\13v\3w\3w\3w\3w\3w\3w\3w\7w\u042c\nw\fw\16w\u042f\13w\3"+
		"x\3x\3x\3x\3x\3x\3x\3x\3x\3x\5x\u043b\nx\3y\3y\3y\3y\3y\3y\3y\5y\u0444"+
		"\ny\3z\3z\3z\3{\3{\3{\3|\3|\3|\3|\3|\3|\5|\u0452\n|\3}\3}\3}\3~\3~\3~"+
		"\3\177\3\177\3\177\3\177\5\177\u045e\n\177\3\u0080\3\u0080\3\u0080\5\u0080"+
		"\u0463\n\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\5\u0080\u046c\n\u0080\3\u0080\5\u0080\u046f\n\u0080\3\u0081\3\u0081\3"+
		"\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u0479\n\u0081\3"+
		"\u0082\3\u0082\5\u0082\u047d\n\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3"+
		"\u0083\3\u0083\3\u0083\5\u0083\u0486\n\u0083\3\u0084\3\u0084\3\u0084\3"+
		"\u0084\5\u0084\u048c\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\7"+
		"\u0085\u0493\n\u0085\f\u0085\16\u0085\u0496\13\u0085\3\u0086\3\u0086\3"+
		"\u0086\3\u0086\5\u0086\u049c\n\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5"+
		"\u0086\u04a2\n\u0086\5\u0086\u04a4\n\u0086\3\u0087\6\u0087\u04a7\n\u0087"+
		"\r\u0087\16\u0087\u04a8\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089"+
		"\6\u0089\u04b1\n\u0089\r\u0089\16\u0089\u04b2\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u04bf"+
		"\n\u008a\3\u008b\3\u008b\3\u008b\7\u008b\u04c4\n\u008b\f\u008b\16\u008b"+
		"\u04c7\13\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u04ce"+
		"\n\u008c\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e"+
		"\u04d7\n\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u04de\n"+
		"\u008f\3\u0090\3\u0090\3\u0090\7\u0090\u04e3\n\u0090\f\u0090\16\u0090"+
		"\u04e6\13\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091"+
		"\u04ee\n\u0091\3\u0092\3\u0092\3\u0092\5\u0092\u04f3\n\u0092\3\u0093\3"+
		"\u0093\5\u0093\u04f7\n\u0093\3\u0094\3\u0094\5\u0094\u04fb\n\u0094\3\u0095"+
		"\3\u0095\5\u0095\u04ff\n\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0098"+
		"\3\u0098\3\u0098\5\u0098\u0508\n\u0098\3\u0098\5\u0098\u050b\n\u0098\3"+
		"\u0098\5\u0098\u050e\n\u0098\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3"+
		"\u009b\5\u009b\u0516\n\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009d\3"+
		"\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u00a0\3\u00a0"+
		"\3\u00a1\3\u00a1\3\u00a1\2\7\34&Lh\u00e4\u00a2\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124"+
		"\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c"+
		"\u013e\u0140\2\f\3\2\24\26\3\2\26\30\5\2\25\30\33\33\36\37\6\2\24\30\33"+
		"\33$$cc\4\2\24\24\26\26\4\2\25\26\33\33\3\2\6\n\3\2&\60\3\2\63\64\3\2"+
		"^_\2\u0536\2\u0143\3\2\2\2\4\u014e\3\2\2\2\6\u0151\3\2\2\2\b\u015b\3\2"+
		"\2\2\n\u015e\3\2\2\2\f\u0164\3\2\2\2\16\u0167\3\2\2\2\20\u0173\3\2\2\2"+
		"\22\u017a\3\2\2\2\24\u017c\3\2\2\2\26\u017f\3\2\2\2\30\u0182\3\2\2\2\32"+
		"\u018a\3\2\2\2\34\u0190\3\2\2\2\36\u019d\3\2\2\2 \u01a1\3\2\2\2\"\u01a3"+
		"\3\2\2\2$\u01a7\3\2\2\2&\u01af\3\2\2\2(\u01b9\3\2\2\2*\u01bb\3\2\2\2,"+
		"\u01c2\3\2\2\2.\u01d5\3\2\2\2\60\u01d8\3\2\2\2\62\u01db\3\2\2\2\64\u01e3"+
		"\3\2\2\2\66\u01f8\3\2\2\28\u01fb\3\2\2\2:\u0206\3\2\2\2<\u020a\3\2\2\2"+
		">\u020c\3\2\2\2@\u0219\3\2\2\2B\u021b\3\2\2\2D\u0225\3\2\2\2F\u0227\3"+
		"\2\2\2H\u022b\3\2\2\2J\u0238\3\2\2\2L\u023a\3\2\2\2N\u0244\3\2\2\2P\u0246"+
		"\3\2\2\2R\u024f\3\2\2\2T\u0252\3\2\2\2V\u025c\3\2\2\2X\u0260\3\2\2\2Z"+
		"\u0262\3\2\2\2\\\u026a\3\2\2\2^\u0271\3\2\2\2`\u0277\3\2\2\2b\u0279\3"+
		"\2\2\2d\u027d\3\2\2\2f\u0280\3\2\2\2h\u0287\3\2\2\2j\u0291\3\2\2\2l\u0293"+
		"\3\2\2\2n\u029c\3\2\2\2p\u02ad\3\2\2\2r\u02b1\3\2\2\2t\u02b5\3\2\2\2v"+
		"\u02b7\3\2\2\2x\u02b9\3\2\2\2z\u02bd\3\2\2\2|\u02bf\3\2\2\2~\u02c1\3\2"+
		"\2\2\u0080\u02c3\3\2\2\2\u0082\u02ca\3\2\2\2\u0084\u02d2\3\2\2\2\u0086"+
		"\u02d4\3\2\2\2\u0088\u02d6\3\2\2\2\u008a\u02df\3\2\2\2\u008c\u02e6\3\2"+
		"\2\2\u008e\u02f2\3\2\2\2\u0090\u02f4\3\2\2\2\u0092\u02f8\3\2\2\2\u0094"+
		"\u02fc\3\2\2\2\u0096\u0305\3\2\2\2\u0098\u0307\3\2\2\2\u009a\u030d\3\2"+
		"\2\2\u009c\u0315\3\2\2\2\u009e\u031d\3\2\2\2\u00a0\u0323\3\2\2\2\u00a2"+
		"\u032d\3\2\2\2\u00a4\u0331\3\2\2\2\u00a6\u0334\3\2\2\2\u00a8\u0340\3\2"+
		"\2\2\u00aa\u0342\3\2\2\2\u00ac\u0348\3\2\2\2\u00ae\u034e\3\2\2\2\u00b0"+
		"\u0355\3\2\2\2\u00b2\u0365\3\2\2\2\u00b4\u0375\3\2\2\2\u00b6\u0377\3\2"+
		"\2\2\u00b8\u0379\3\2\2\2\u00ba\u0381\3\2\2\2\u00bc\u0385\3\2\2\2\u00be"+
		"\u0389\3\2\2\2\u00c0\u038d\3\2\2\2\u00c2\u0390\3\2\2\2\u00c4\u03a1\3\2"+
		"\2\2\u00c6\u03a3\3\2\2\2\u00c8\u03ab\3\2\2\2\u00ca\u03af\3\2\2\2\u00cc"+
		"\u03b2\3\2\2\2\u00ce\u03b4\3\2\2\2\u00d0\u03b8\3\2\2\2\u00d2\u03ba\3\2"+
		"\2\2\u00d4\u03c1\3\2\2\2\u00d6\u03c3\3\2\2\2\u00d8\u03cc\3\2\2\2\u00da"+
		"\u03ce\3\2\2\2\u00dc\u03d6\3\2\2\2\u00de\u03de\3\2\2\2\u00e0\u03e0\3\2"+
		"\2\2\u00e2\u03e8\3\2\2\2\u00e4\u03f0\3\2\2\2\u00e6\u03fe\3\2\2\2\u00e8"+
		"\u040e\3\2\2\2\u00ea\u041a\3\2\2\2\u00ec\u0424\3\2\2\2\u00ee\u043a\3\2"+
		"\2\2\u00f0\u0443\3\2\2\2\u00f2\u0445\3\2\2\2\u00f4\u0448\3\2\2\2\u00f6"+
		"\u0451\3\2\2\2\u00f8\u0453\3\2\2\2\u00fa\u0456\3\2\2\2\u00fc\u045d\3\2"+
		"\2\2\u00fe\u046e\3\2\2\2\u0100\u0478\3\2\2\2\u0102\u047c\3\2\2\2\u0104"+
		"\u0485\3\2\2\2\u0106\u0487\3\2\2\2\u0108\u048f\3\2\2\2\u010a\u04a3\3\2"+
		"\2\2\u010c\u04a6\3\2\2\2\u010e\u04aa\3\2\2\2\u0110\u04b0\3\2\2\2\u0112"+
		"\u04be\3\2\2\2\u0114\u04c0\3\2\2\2\u0116\u04cd\3\2\2\2\u0118\u04cf\3\2"+
		"\2\2\u011a\u04d6\3\2\2\2\u011c\u04dd\3\2\2\2\u011e\u04df\3\2\2\2\u0120"+
		"\u04ed\3\2\2\2\u0122\u04f2\3\2\2\2\u0124\u04f4\3\2\2\2\u0126\u04f8\3\2"+
		"\2\2\u0128\u04fc\3\2\2\2\u012a\u0500\3\2\2\2\u012c\u0502\3\2\2\2\u012e"+
		"\u0504\3\2\2\2\u0130\u050f\3\2\2\2\u0132\u0512\3\2\2\2\u0134\u0515\3\2"+
		"\2\2\u0136\u0519\3\2\2\2\u0138\u051b\3\2\2\2\u013a\u051d\3\2\2\2\u013c"+
		"\u0521\3\2\2\2\u013e\u0523\3\2\2\2\u0140\u0525\3\2\2\2\u0142\u0144\5\4"+
		"\3\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0148\3\2\2\2\u0145"+
		"\u0147\5\6\4\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2"+
		"\2\2\u0148\u0149\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014b"+
		"\u014d\5\n\6\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\3\3\2\2\2"+
		"\u014e\u014f\7\16\2\2\u014f\u0150\5\u0114\u008b\2\u0150\5\3\2\2\2\u0151"+
		"\u0152\7\17\2\2\u0152\u0153\5\b\5\2\u0153\u0154\7N\2\2\u0154\7\3\2\2\2"+
		"\u0155\u015c\5\u0116\u008c\2\u0156\u0159\5\u0114\u008b\2\u0157\u0158\7"+
		"I\2\2\u0158\u015a\7\65\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015c\3\2\2\2\u015b\u0155\3\2\2\2\u015b\u0156\3\2\2\2\u015c\t\3\2\2\2"+
		"\u015d\u015f\5\f\7\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\13\3\2\2\2\u0162\u0165\5\16\b\2\u0163"+
		"\u0165\5T+\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165\r\3\2\2\2\u0166"+
		"\u0168\5\20\t\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3"+
		"\2\2\2\u0169\u016a\7\23\2\2\u016a\u016c\7a\2\2\u016b\u016d\5\24\13\2\u016c"+
		"\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u0170\5\26"+
		"\f\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0172\5\32\16\2\u0172\17\3\2\2\2\u0173\u0177\5\22\n\2\u0174\u0176\5\22"+
		"\n\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\21\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\t\2\2"+
		"\2\u017b\23\3\2\2\2\u017c\u017d\7\31\2\2\u017d\u017e\5|?\2\u017e\25\3"+
		"\2\2\2\u017f\u0180\7\32\2\2\u0180\u0181\5\30\r\2\u0181\27\3\2\2\2\u0182"+
		"\u0187\5~@\2\u0183\u0184\7O\2\2\u0184\u0186\5~@\2\u0185\u0183\3\2\2\2"+
		"\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\31"+
		"\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018c\7E\2\2\u018b\u018d\5\34\17\2"+
		"\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f"+
		"\7F\2\2\u018f\33\3\2\2\2\u0190\u0191\b\17\1\2\u0191\u0192\5\36\20\2\u0192"+
		"\u0197\3\2\2\2\u0193\u0194\f\3\2\2\u0194\u0196\5\36\20\2\u0195\u0193\3"+
		"\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\35\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019e\5 \21\2\u019b\u019e\5\"\22"+
		"\2\u019c\u019e\5$\23\2\u019d\u019a\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019c"+
		"\3\2\2\2\u019e\37\3\2\2\2\u019f\u01a2\58\35\2\u01a0\u01a2\5F$\2\u01a1"+
		"\u019f\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2!\3\2\2\2\u01a3\u01a4\7\33\2\2"+
		"\u01a4\u01a5\5\u0080A\2\u01a5#\3\2\2\2\u01a6\u01a8\5&\24\2\u01a7\u01a6"+
		"\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\5*\26\2\u01aa"+
		"\u01ac\5\60\31\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3"+
		"\2\2\2\u01ad\u01ae\5\64\33\2\u01ae%\3\2\2\2\u01af\u01b0\b\24\1\2\u01b0"+
		"\u01b1\5(\25\2\u01b1\u01b6\3\2\2\2\u01b2\u01b3\f\3\2\2\u01b3\u01b5\5("+
		"\25\2\u01b4\u01b2\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\'\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01ba\t\3\2\2"+
		"\u01ba)\3\2\2\2\u01bb\u01bc\7a\2\2\u01bc\u01be\7G\2\2\u01bd\u01bf\5,\27"+
		"\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1"+
		"\7H\2\2\u01c1+\3\2\2\2\u01c2\u01c5\5p9\2\u01c3\u01c4\7C\2\2\u01c4\u01c6"+
		"\7D\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01d2\5B\"\2\u01c8\u01c9\7O\2\2\u01c9\u01cc\5p9\2\u01ca\u01cb\7C\2\2"+
		"\u01cb\u01cd\7D\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce"+
		"\3\2\2\2\u01ce\u01cf\5B\"\2\u01cf\u01d1\3\2\2\2\u01d0\u01c8\3\2\2\2\u01d1"+
		"\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3-\3\2\2\2"+
		"\u01d4\u01d2\3\2\2\2\u01d5\u01d6\5p9\2\u01d6\u01d7\5B\"\2\u01d7/\3\2\2"+
		"\2\u01d8\u01d9\7!\2\2\u01d9\u01da\5\62\32\2\u01da\61\3\2\2\2\u01db\u01e0"+
		"\5|?\2\u01dc\u01dd\7O\2\2\u01dd\u01df\5|?\2\u01de\u01dc\3\2\2\2\u01df"+
		"\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\63\3\2\2"+
		"\2\u01e2\u01e0\3\2\2\2\u01e3\u01e5\7E\2\2\u01e4\u01e6\5\66\34\2\u01e5"+
		"\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e9\5\u0082"+
		"B\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01eb\7F\2\2\u01eb\65\3\2\2\2\u01ec\u01ed\7\34\2\2\u01ed\u01ef\7G\2\2"+
		"\u01ee\u01f0\5\u0108\u0085\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01f9\7H\2\2\u01f2\u01f3\7\35\2\2\u01f3\u01f5\7G"+
		"\2\2\u01f4\u01f6\5\u0108\u0085\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2"+
		"\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\7H\2\2\u01f8\u01ec\3\2\2\2\u01f8\u01f2"+
		"\3\2\2\2\u01f9\67\3\2\2\2\u01fa\u01fc\5:\36\2\u01fb\u01fa\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0200\5p9\2\u01fe\u01ff\7C\2"+
		"\2\u01ff\u0201\7D\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202"+
		"\3\2\2\2\u0202\u0203\5> \2\u0203\u0204\7N\2\2\u02049\3\2\2\2\u0205\u0207"+
		"\5<\37\2\u0206\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0206\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209;\3\2\2\2\u020a\u020b\t\4\2\2\u020b=\3\2\2\2\u020c"+
		"\u0211\5@!\2\u020d\u020e\7O\2\2\u020e\u0210\5@!\2\u020f\u020d\3\2\2\2"+
		"\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212?\3"+
		"\2\2\2\u0213\u0211\3\2\2\2\u0214\u021a\5B\"\2\u0215\u0216\5B\"\2\u0216"+
		"\u0217\7&\2\2\u0217\u0218\5D#\2\u0218\u021a\3\2\2\2\u0219\u0214\3\2\2"+
		"\2\u0219\u0215\3\2\2\2\u021aA\3\2\2\2\u021b\u0220\7a\2\2\u021c\u021d\7"+
		"C\2\2\u021d\u021f\7D\2\2\u021e\u021c\3\2\2\2\u021f\u0222\3\2\2\2\u0220"+
		"\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221C\3\2\2\2\u0222\u0220\3\2\2\2"+
		"\u0223\u0226\5\u00ceh\2\u0224\u0226\5l\67\2\u0225\u0223\3\2\2\2\u0225"+
		"\u0224\3\2\2\2\u0226E\3\2\2\2\u0227\u0228\5H%\2\u0228\u0229\5R*\2\u0229"+
		"G\3\2\2\2\u022a\u022c\5L\'\2\u022b\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022d\u022e\5J&\2\u022e\u0230\5P)\2\u022f\u0231\5\60\31"+
		"\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231I\3\2\2\2\u0232\u0235"+
		"\5p9\2\u0233\u0234\7C\2\2\u0234\u0236\7D\2\2\u0235\u0233\3\2\2\2\u0235"+
		"\u0236\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0239\7\"\2\2\u0238\u0232\3\2"+
		"\2\2\u0238\u0237\3\2\2\2\u0239K\3\2\2\2\u023a\u023b\b\'\1\2\u023b\u023c"+
		"\5N(\2\u023c\u0241\3\2\2\2\u023d\u023e\f\3\2\2\u023e\u0240\5N(\2\u023f"+
		"\u023d\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2"+
		"\2\2\u0242M\3\2\2\2\u0243\u0241\3\2\2\2\u0244\u0245\t\5\2\2\u0245O\3\2"+
		"\2\2\u0246\u0247\7a\2\2\u0247\u0249\7G\2\2\u0248\u024a\5,\27\2\u0249\u0248"+
		"\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\7H\2\2\u024c"+
		"Q\3\2\2\2\u024d\u0250\5\u0080A\2\u024e\u0250\3\2\2\2\u024f\u024d\3\2\2"+
		"\2\u024f\u024e\3\2\2\2\u0250S\3\2\2\2\u0251\u0253\5V,\2\u0252\u0251\3"+
		"\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\7%\2\2\u0255"+
		"\u0257\7a\2\2\u0256\u0258\5Z.\2\u0257\u0256\3\2\2\2\u0257\u0258\3\2\2"+
		"\2\u0258\u0259\3\2\2\2\u0259\u025a\5\\/\2\u025aU\3\2\2\2\u025b\u025d\5"+
		"X-\2\u025c\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025c\3\2\2\2\u025e"+
		"\u025f\3\2\2\2\u025fW\3\2\2\2\u0260\u0261\t\6\2\2\u0261Y\3\2\2\2\u0262"+
		"\u0263\7\31\2\2\u0263\u0266\5~@\2\u0264\u0265\7O\2\2\u0265\u0267\5~@\2"+
		"\u0266\u0264\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269"+
		"\3\2\2\2\u0269[\3\2\2\2\u026a\u026c\7E\2\2\u026b\u026d\5^\60\2\u026c\u026b"+
		"\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\7F\2\2\u026f"+
		"]\3\2\2\2\u0270\u0272\5`\61\2\u0271\u0270\3\2\2\2\u0272\u0273\3\2\2\2"+
		"\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274_\3\2\2\2\u0275\u0278\5"+
		"b\62\2\u0276\u0278\5f\64\2\u0277\u0275\3\2\2\2\u0277\u0276\3\2\2\2\u0278"+
		"a\3\2\2\2\u0279\u027a\5d\63\2\u027a\u027b\5p9\2\u027b\u027c\5@!\2\u027c"+
		"c\3\2\2\2\u027d\u027e\t\7\2\2\u027ee\3\2\2\2\u027f\u0281\5h\65\2\u0280"+
		"\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\5J"+
		"&\2\u0283\u0285\5P)\2\u0284\u0286\5\60\31\2\u0285\u0284\3\2\2\2\u0285"+
		"\u0286\3\2\2\2\u0286g\3\2\2\2\u0287\u0288\b\65\1\2\u0288\u0289\5j\66\2"+
		"\u0289\u028e\3\2\2\2\u028a\u028b\f\3\2\2\u028b\u028d\5j\66\2\u028c\u028a"+
		"\3\2\2\2\u028d\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f"+
		"i\3\2\2\2\u0290\u028e\3\2\2\2\u0291\u0292\t\6\2\2\u0292k\3\2\2\2\u0293"+
		"\u0295\7E\2\2\u0294\u0296\5n8\2\u0295\u0294\3\2\2\2\u0295\u0296\3\2\2"+
		"\2\u0296\u0298\3\2\2\2\u0297\u0299\7O\2\2\u0298\u0297\3\2\2\2\u0298\u0299"+
		"\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\7F\2\2\u029bm\3\2\2\2\u029c\u02a1"+
		"\5D#\2\u029d\u029e\7O\2\2\u029e\u02a0\5D#\2\u029f\u029d\3\2\2\2\u02a0"+
		"\u02a3\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2o\3\2\2\2"+
		"\u02a3\u02a1\3\2\2\2\u02a4\u02ae\5r:\2\u02a5\u02aa\5x=\2\u02a6\u02a7\7"+
		"C\2\2\u02a7\u02a9\7D\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa"+
		"\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ae\3\2\2\2\u02ac\u02aa\3\2"+
		"\2\2\u02ad\u02a4\3\2\2\2\u02ad\u02a5\3\2\2\2\u02aeq\3\2\2\2\u02af\u02b2"+
		"\5t;\2\u02b0\u02b2\7\f\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b0\3\2\2\2\u02b2"+
		"s\3\2\2\2\u02b3\u02b6\5v<\2\u02b4\u02b6\7\13\2\2\u02b5\u02b3\3\2\2\2\u02b5"+
		"\u02b4\3\2\2\2\u02b6u\3\2\2\2\u02b7\u02b8\t\b\2\2\u02b8w\3\2\2\2\u02b9"+
		"\u02ba\5z>\2\u02bay\3\2\2\2\u02bb\u02be\5|?\2\u02bc\u02be\5~@\2\u02bd"+
		"\u02bb\3\2\2\2\u02bd\u02bc\3\2\2\2\u02be{\3\2\2\2\u02bf\u02c0\5\u0116"+
		"\u008c\2\u02c0}\3\2\2\2\u02c1\u02c2\5\u0116\u008c\2\u02c2\177\3\2\2\2"+
		"\u02c3\u02c5\7E\2\2\u02c4\u02c6\5\u0082B\2\u02c5\u02c4\3\2\2\2\u02c5\u02c6"+
		"\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\7F\2\2\u02c8\u0081\3\2\2\2\u02c9"+
		"\u02cb\5\u0084C\2\u02ca\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02ca"+
		"\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u0083\3\2\2\2\u02ce\u02cf\5\u0086D"+
		"\2\u02cf\u02d0\7N\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02d3\5\u008aF\2\u02d2"+
		"\u02ce\3\2\2\2\u02d2\u02d1\3\2\2\2\u02d3\u0085\3\2\2\2\u02d4\u02d5\5\u0088"+
		"E\2\u02d5\u0087\3\2\2\2\u02d6\u02d7\5p9\2\u02d7\u02d8\5> \2\u02d8\u0089"+
		"\3\2\2\2\u02d9\u02e0\5\u008eH\2\u02da\u02e0\5\u0090I\2\u02db\u02e0\5\u0098"+
		"M\2\u02dc\u02e0\5\u009aN\2\u02dd\u02e0\5\u00aaV\2\u02de\u02e0\5\u00b0"+
		"Y\2\u02df\u02d9\3\2\2\2\u02df\u02da\3\2\2\2\u02df\u02db\3\2\2\2\u02df"+
		"\u02dc\3\2\2\2\u02df\u02dd\3\2\2\2\u02df\u02de\3\2\2\2\u02e0\u008b\3\2"+
		"\2\2\u02e1\u02e7\5\u008eH\2\u02e2\u02e7\5\u0092J\2\u02e3\u02e7\5\u009c"+
		"O\2\u02e4\u02e7\5\u00acW\2\u02e5\u02e7\5\u00b2Z\2\u02e6\u02e1\3\2\2\2"+
		"\u02e6\u02e2\3\2\2\2\u02e6\u02e3\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e5"+
		"\3\2\2\2\u02e7\u008d\3\2\2\2\u02e8\u02f3\5\u0080A\2\u02e9\u02f3\5\u0094"+
		"K\2\u02ea\u02f3\5\u009eP\2\u02eb\u02f3\5\u00aeX\2\u02ec\u02f3\5\u00ba"+
		"^\2\u02ed\u02f3\5\u00bc_\2\u02ee\u02f3\5\u00be`\2\u02ef\u02f3\5\u00c2"+
		"b\2\u02f0\u02f3\5\u00c0a\2\u02f1\u02f3\5\u00c4c\2\u02f2\u02e8\3\2\2\2"+
		"\u02f2\u02e9\3\2\2\2\u02f2\u02ea\3\2\2\2\u02f2\u02eb\3\2\2\2\u02f2\u02ec"+
		"\3\2\2\2\u02f2\u02ed\3\2\2\2\u02f2\u02ee\3\2\2\2\u02f2\u02ef\3\2\2\2\u02f2"+
		"\u02f0\3\2\2\2\u02f2\u02f1\3\2\2\2\u02f3\u008f\3\2\2\2\u02f4\u02f5\7a"+
		"\2\2\u02f5\u02f6\7L\2\2\u02f6\u02f7\5\u008aF\2\u02f7\u0091\3\2\2\2\u02f8"+
		"\u02f9\7a\2\2\u02f9\u02fa\7L\2\2\u02fa\u02fb\5\u008cG\2\u02fb\u0093\3"+
		"\2\2\2\u02fc\u02fd\5\u0096L\2\u02fd\u0095\3\2\2\2\u02fe\u0306\5\u00d2"+
		"j\2\u02ff\u0306\5\u00f4{\2\u0300\u0306\5\u00fa~\2\u0301\u0306\5\u00f2"+
		"z\2\u0302\u0306\5\u00f8}\2\u0303\u0306\5\u00fe\u0080\2\u0304\u0306\5\u0106"+
		"\u0084\2\u0305\u02fe\3\2\2\2\u0305\u02ff\3\2\2\2\u0305\u0300\3\2\2\2\u0305"+
		"\u0301\3\2\2\2\u0305\u0302\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0304\3\2"+
		"\2\2\u0306\u0097\3\2\2\2\u0307\u0308\7P\2\2\u0308\u0309\7G\2\2\u0309\u030a"+
		"\5\u00ceh\2\u030a\u030b\7H\2\2\u030b\u030c\5\u008aF\2\u030c\u0099\3\2"+
		"\2\2\u030d\u030e\7P\2\2\u030e\u030f\7G\2\2\u030f\u0310\5\u00ceh\2\u0310"+
		"\u0311\7H\2\2\u0311\u0312\5\u008cG\2\u0312\u0313\7Q\2\2\u0313\u0314\5"+
		"\u008aF\2\u0314\u009b\3\2\2\2\u0315\u0316\7P\2\2\u0316\u0317\7G\2\2\u0317"+
		"\u0318\5\u00ceh\2\u0318\u0319\7H\2\2\u0319\u031a\5\u008cG\2\u031a\u031b"+
		"\7Q\2\2\u031b\u031c\5\u008cG\2\u031c\u009d\3\2\2\2\u031d\u031e\7T\2\2"+
		"\u031e\u031f\7G\2\2\u031f\u0320\5\u00ceh\2\u0320\u0321\7H\2\2\u0321\u0322"+
		"\5\u00a0Q\2\u0322\u009f\3\2\2\2\u0323\u0325\7E\2\2\u0324\u0326\5\u00a2"+
		"R\2\u0325\u0324\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0328\3\2\2\2\u0327"+
		"\u0329\5\u00a6T\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a"+
		"\3\2\2\2\u032a\u032b\7F\2\2\u032b\u00a1\3\2\2\2\u032c\u032e\5\u00a4S\2"+
		"\u032d\u032c\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330"+
		"\3\2\2\2\u0330\u00a3\3\2\2\2\u0331\u0332\5\u00a6T\2\u0332\u0333\5\u0082"+
		"B\2\u0333\u00a5\3\2\2\2\u0334\u0335\5\u00a8U\2\u0335\u00a7\3\2\2\2\u0336"+
		"\u0337\7R\2\2\u0337\u0338\5\u00ccg\2\u0338\u0339\7L\2\2\u0339\u033b\3"+
		"\2\2\2\u033a\u0336\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033a\3\2\2\2\u033c"+
		"\u033d\3\2\2\2\u033d\u0341\3\2\2\2\u033e\u033f\7S\2\2\u033f\u0341\7L\2"+
		"\2\u0340\u033a\3\2\2\2\u0340\u033e\3\2\2\2\u0341\u00a9\3\2\2\2\u0342\u0343"+
		"\7V\2\2\u0343\u0344\7G\2\2\u0344\u0345\5\u00ceh\2\u0345\u0346\7H\2\2\u0346"+
		"\u0347\5\u008aF\2\u0347\u00ab\3\2\2\2\u0348\u0349\7V\2\2\u0349\u034a\7"+
		"G\2\2\u034a\u034b\5\u00ceh\2\u034b\u034c\7H\2\2\u034c\u034d\5\u008cG\2"+
		"\u034d\u00ad\3\2\2\2\u034e\u034f\7U\2\2\u034f\u0350\5\u008aF\2\u0350\u0351"+
		"\7V\2\2\u0351\u0352\7G\2\2\u0352\u0353\5\u00ceh\2\u0353\u0354\7H\2\2\u0354"+
		"\u00af\3\2\2\2\u0355\u0356\7W\2\2\u0356\u0358\7G\2\2\u0357\u0359\5\u00b4"+
		"[\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035a\3\2\2\2\u035a"+
		"\u035c\7N\2\2\u035b\u035d\5\u00ceh\2\u035c\u035b\3\2\2\2\u035c\u035d\3"+
		"\2\2\2\u035d\u035e\3\2\2\2\u035e\u0360\7N\2\2\u035f\u0361\5\u00b6\\\2"+
		"\u0360\u035f\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0363"+
		"\7H\2\2\u0363\u0364\5\u008aF\2\u0364\u00b1\3\2\2\2\u0365\u0366\7W\2\2"+
		"\u0366\u0368\7G\2\2\u0367\u0369\5\u00b4[\2\u0368\u0367\3\2\2\2\u0368\u0369"+
		"\3\2\2\2\u0369\u036b\3\2\2\2\u036a\u036c\5\u00ceh\2\u036b\u036a\3\2\2"+
		"\2\u036b\u036c\3\2\2\2\u036c\u036e\3\2\2\2\u036d\u036f\5\u00b6\\\2\u036e"+
		"\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0371\7H"+
		"\2\2\u0371\u0372\5\u008cG\2\u0372\u00b3\3\2\2\2\u0373\u0376\5\u00b8]\2"+
		"\u0374\u0376\5\u0088E\2\u0375\u0373\3\2\2\2\u0375\u0374\3\2\2\2\u0376"+
		"\u00b5\3\2\2\2\u0377\u0378\5\u0096L\2\u0378\u00b7\3\2\2\2\u0379\u037e"+
		"\5\u0096L\2\u037a\u037b\7O\2\2\u037b\u037d\5\u0096L\2\u037c\u037a\3\2"+
		"\2\2\u037d\u0380\3\2\2\2\u037e\u037c\3\2\2\2\u037e\u037f\3\2\2\2\u037f"+
		"\u00b9\3\2\2\2\u0380\u037e\3\2\2\2\u0381\u0383\7X\2\2\u0382\u0384\7a\2"+
		"\2\u0383\u0382\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u00bb\3\2\2\2\u0385\u0387"+
		"\7Y\2\2\u0386\u0388\7a\2\2\u0387\u0386\3\2\2\2\u0387\u0388\3\2\2\2\u0388"+
		"\u00bd\3\2\2\2\u0389\u038b\7Z\2\2\u038a\u038c\5\u00ceh\2\u038b\u038a\3"+
		"\2\2\2\u038b\u038c\3\2\2\2\u038c\u00bf\3\2\2\2\u038d\u038e\7 \2\2\u038e"+
		"\u038f\5\u00ceh\2\u038f\u00c1\3\2\2\2\u0390\u0391\7c\2\2\u0391\u0392\7"+
		"G\2\2\u0392\u0393\5\u00ceh\2\u0393\u0394\7H\2\2\u0394\u0395\5\u0080A\2"+
		"\u0395\u00c3\3\2\2\2\u0396\u0397\7[\2\2\u0397\u0398\5\u0080A\2\u0398\u0399"+
		"\5\u00c6d\2\u0399\u03a2\3\2\2\2\u039a\u039b\7[\2\2\u039b\u039d\5\u0080"+
		"A\2\u039c\u039e\5\u00c6d\2\u039d\u039c\3\2\2\2\u039d\u039e\3\2\2\2\u039e"+
		"\u039f\3\2\2\2\u039f\u03a0\5\u00caf\2\u03a0\u03a2\3\2\2\2\u03a1\u0396"+
		"\3\2\2\2\u03a1\u039a\3\2\2\2\u03a2\u00c5\3\2\2\2\u03a3\u03a4\5\u00c8e"+
		"\2\u03a4\u00c7\3\2\2\2\u03a5\u03a6\7\\\2\2\u03a6\u03a7\7G\2\2\u03a7\u03a8"+
		"\5.\30\2\u03a8\u03a9\7H\2\2\u03a9\u03aa\5\u0080A\2\u03aa\u03ac\3\2\2\2"+
		"\u03ab\u03a5\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ae"+
		"\3\2\2\2\u03ae\u00c9\3\2\2\2\u03af\u03b0\7]\2\2\u03b0\u03b1\5\u0080A\2"+
		"\u03b1\u00cb\3\2\2\2\u03b2\u03b3\5\u00ceh\2\u03b3\u00cd\3\2\2\2\u03b4"+
		"\u03b5\5\u00d0i\2\u03b5\u00cf\3\2\2\2\u03b6\u03b9\5\u00d8m\2\u03b7\u03b9"+
		"\5\u00d2j\2\u03b8\u03b6\3\2\2\2\u03b8\u03b7\3\2\2\2\u03b9\u00d1\3\2\2"+
		"\2\u03ba\u03bb\5\u00d4k\2\u03bb\u03bc\5\u00d6l\2\u03bc\u03bd\5\u00d0i"+
		"\2\u03bd\u00d3\3\2\2\2\u03be\u03c2\5\u011a\u008e\2\u03bf\u03c2\5\u0100"+
		"\u0081\2\u03c0\u03c2\5\u0112\u008a\2\u03c1\u03be\3\2\2\2\u03c1\u03bf\3"+
		"\2\2\2\u03c1\u03c0\3\2\2\2\u03c2\u00d5\3\2\2\2\u03c3\u03c4\t\t\2\2\u03c4"+
		"\u00d7\3\2\2\2\u03c5\u03cd\5\u00dan\2\u03c6\u03c7\5\u00dan\2\u03c7\u03c8"+
		"\7J\2\2\u03c8\u03c9\5\u00ceh\2\u03c9\u03ca\7L\2\2\u03ca\u03cb\5\u00d8"+
		"m\2\u03cb\u03cd\3\2\2\2\u03cc\u03c5\3\2\2\2\u03cc\u03c6\3\2\2\2\u03cd"+
		"\u00d9\3\2\2\2\u03ce\u03d3\5\u00dco\2\u03cf\u03d0\7\67\2\2\u03d0\u03d2"+
		"\5\u00dco\2\u03d1\u03cf\3\2\2\2\u03d2\u03d5\3\2\2\2\u03d3\u03d1\3\2\2"+
		"\2\u03d3\u03d4\3\2\2\2\u03d4\u00db\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d6\u03db"+
		"\5\u00dep\2\u03d7\u03d8\78\2\2\u03d8\u03da\5\u00dep\2\u03d9\u03d7\3\2"+
		"\2\2\u03da\u03dd\3\2\2\2\u03db\u03d9\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc"+
		"\u00dd\3\2\2\2\u03dd\u03db\3\2\2\2\u03de\u03df\5\u00e0q\2\u03df\u00df"+
		"\3\2\2\2\u03e0\u03e5\5\u00e2r\2\u03e1\u03e2\7@\2\2\u03e2\u03e4\5\u00e2"+
		"r\2\u03e3\u03e1\3\2\2\2\u03e4\u03e7\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e5"+
		"\u03e6\3\2\2\2\u03e6\u00e1\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e8\u03ed\5\u00e4"+
		"s\2\u03e9\u03ea\7>\2\2\u03ea\u03ec\5\u00e4s\2\u03eb\u03e9\3\2\2\2\u03ec"+
		"\u03ef\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u00e3\3\2"+
		"\2\2\u03ef\u03ed\3\2\2\2\u03f0\u03f1\bs\1\2\u03f1\u03f2\5\u00e6t\2\u03f2"+
		"\u03fb\3\2\2\2\u03f3\u03f4\f\4\2\2\u03f4\u03f5\79\2\2\u03f5\u03fa\5\u00e6"+
		"t\2\u03f6\u03f7\f\3\2\2\u03f7\u03f8\7d\2\2\u03f8\u03fa\5\u00e6t\2\u03f9"+
		"\u03f3\3\2\2\2\u03f9\u03f6\3\2\2\2\u03fa\u03fd\3\2\2\2\u03fb\u03f9\3\2"+
		"\2\2\u03fb\u03fc\3\2\2\2\u03fc\u00e5\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fe"+
		"\u040b\5\u00e8u\2\u03ff\u0400\7<\2\2\u0400\u040a\5\u00e8u\2\u0401\u0402"+
		"\7=\2\2\u0402\u040a\5\u00e8u\2\u0403\u0404\7;\2\2\u0404\u040a\5\u00e8"+
		"u\2\u0405\u0406\7:\2\2\u0406\u040a\5\u00e8u\2\u0407\u0408\7\21\2\2\u0408"+
		"\u040a\5x=\2\u0409\u03ff\3\2\2\2\u0409\u0401\3\2\2\2\u0409\u0403\3\2\2"+
		"\2\u0409\u0405\3\2\2\2\u0409\u0407\3\2\2\2\u040a\u040d\3\2\2\2\u040b\u0409"+
		"\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u00e7\3\2\2\2\u040d\u040b\3\2\2\2\u040e"+
		"\u0417\5\u00eav\2\u040f\u0410\7B\2\2\u0410\u0416\5\u00eav\2\u0411\u0412"+
		"\7A\2\2\u0412\u0416\5\u00eav\2\u0413\u0414\7e\2\2\u0414\u0416\5\u00ea"+
		"v\2\u0415\u040f\3\2\2\2\u0415\u0411\3\2\2\2\u0415\u0413\3\2\2\2\u0416"+
		"\u0419\3\2\2\2\u0417\u0415\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u00e9\3\2"+
		"\2\2\u0419\u0417\3\2\2\2\u041a\u0421\5\u00ecw\2\u041b\u041c\7\63\2\2\u041c"+
		"\u0420\5\u00ecw\2\u041d\u041e\7\64\2\2\u041e\u0420\5\u00ecw\2\u041f\u041b"+
		"\3\2\2\2\u041f\u041d\3\2\2\2\u0420\u0423\3\2\2\2\u0421\u041f\3\2\2\2\u0421"+
		"\u0422\3\2\2\2\u0422\u00eb\3\2\2\2\u0423\u0421\3\2\2\2\u0424\u042d\5\u00f0"+
		"y\2\u0425\u0426\7\65\2\2\u0426\u042c\5\u00f0y\2\u0427\u0428\7\66\2\2\u0428"+
		"\u042c\5\u00f0y\2\u0429\u042a\7f\2\2\u042a\u042c\5\u00f0y\2\u042b\u0425"+
		"\3\2\2\2\u042b\u0427\3\2\2\2\u042b\u0429\3\2\2\2\u042c\u042f\3\2\2\2\u042d"+
		"\u042b\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u00ed\3\2\2\2\u042f\u042d\3\2"+
		"\2\2\u0430\u0431\7G\2\2\u0431\u0432\5r:\2\u0432\u0433\7H\2\2\u0433\u0434"+
		"\5\u00f0y\2\u0434\u043b\3\2\2\2\u0435\u0436\7G\2\2\u0436\u0437\5x=\2\u0437"+
		"\u0438\7H\2\2\u0438\u0439\5\u00f6|\2\u0439\u043b\3\2\2\2\u043a\u0430\3"+
		"\2\2\2\u043a\u0435\3\2\2\2\u043b\u00ef\3\2\2\2\u043c\u0444\5\u00f4{\2"+
		"\u043d\u0444\5\u00f2z\2\u043e\u043f\7\63\2\2\u043f\u0444\5\u00f0y\2\u0440"+
		"\u0441\7\64\2\2\u0441\u0444\5\u00f0y\2\u0442\u0444\5\u00f6|\2\u0443\u043c"+
		"\3\2\2\2\u0443\u043d\3\2\2\2\u0443\u043e\3\2\2\2\u0443\u0440\3\2\2\2\u0443"+
		"\u0442\3\2\2\2\u0444\u00f1\3\2\2\2\u0445\u0446\7\62\2\2\u0446\u0447\5"+
		"\u00f0y\2\u0447\u00f3\3\2\2\2\u0448\u0449\7\61\2\2\u0449\u044a\5\u00f0"+
		"y\2\u044a\u00f5\3\2\2\2\u044b\u0452\5\u00fc\177\2\u044c\u044d\7g\2\2\u044d"+
		"\u0452\5\u00f0y\2\u044e\u044f\7K\2\2\u044f\u0452\5\u00f0y\2\u0450\u0452"+
		"\5\u00eex\2\u0451\u044b\3\2\2\2\u0451\u044c\3\2\2\2\u0451\u044e\3\2\2"+
		"\2\u0451\u0450\3\2\2\2\u0452\u00f7\3\2\2\2\u0453\u0454\5\u00fc\177\2\u0454"+
		"\u0455\7\62\2\2\u0455\u00f9\3\2\2\2\u0456\u0457\5\u00fc\177\2\u0457\u0458"+
		"\7\61\2\2\u0458\u00fb\3\2\2\2\u0459\u045e\5\u0102\u0082\2\u045a\u045b"+
		"\5\u011a\u008e\2\u045b\u045c\7N\2\2\u045c\u045e\3\2\2\2\u045d\u0459\3"+
		"\2\2\2\u045d\u045a\3\2\2\2\u045e\u00fd\3\2\2\2\u045f\u0460\5\u011c\u008f"+
		"\2\u0460\u0462\7G\2\2\u0461\u0463\5\u0108\u0085\2\u0462\u0461\3\2\2\2"+
		"\u0462\u0463\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u0465\7H\2\2\u0465\u046f"+
		"\3\2\2\2\u0466\u0467\7\35\2\2\u0467\u0468\7I\2\2\u0468\u0469\7a\2\2\u0469"+
		"\u046b\7G\2\2\u046a\u046c\5\u0108\u0085\2\u046b\u046a\3\2\2\2\u046b\u046c"+
		"\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046f\7H\2\2\u046e\u045f\3\2\2\2\u046e"+
		"\u0466\3\2\2\2\u046f\u00ff\3\2\2\2\u0470\u0471\5\u0102\u0082\2\u0471\u0472"+
		"\7I\2\2\u0472\u0473\7a\2\2\u0473\u0479\3\2\2\2\u0474\u0475\5\24\13\2\u0475"+
		"\u0476\7I\2\2\u0476\u0477\7a\2\2\u0477\u0479\3\2\2\2\u0478\u0470\3\2\2"+
		"\2\u0478\u0474\3\2\2\2\u0479\u0101\3\2\2\2\u047a\u047d\5\u0104\u0083\2"+
		"\u047b\u047d\5\u010a\u0086\2\u047c\u047a\3\2\2\2\u047c\u047b\3\2\2\2\u047d"+
		"\u0103\3\2\2\2\u047e\u0486\5\u0120\u0091\2\u047f\u0486\7\34\2\2\u0480"+
		"\u0481\7G\2\2\u0481\u0482\5\u00ceh\2\u0482\u0483\7H\2\2\u0483\u0486\3"+
		"\2\2\2\u0484\u0486\5\u0106\u0084\2\u0485\u047e\3\2\2\2\u0485\u047f\3\2"+
		"\2\2\u0485\u0480\3\2\2\2\u0485\u0484\3\2\2\2\u0486\u0105\3\2\2\2\u0487"+
		"\u0488\7\r\2\2\u0488\u0489\5|?\2\u0489\u048b\7G\2\2\u048a\u048c\5\u0108"+
		"\u0085\2\u048b\u048a\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048d\3\2\2\2\u048d"+
		"\u048e\7H\2\2\u048e\u0107\3\2\2\2\u048f\u0494\5\u00ceh\2\u0490\u0491\7"+
		"O\2\2\u0491\u0493\5\u00ceh\2\u0492\u0490\3\2\2\2\u0493\u0496\3\2\2\2\u0494"+
		"\u0492\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0109\3\2\2\2\u0496\u0494\3\2"+
		"\2\2\u0497\u0498\7\r\2\2\u0498\u0499\5r:\2\u0499\u049b\5\u010c\u0087\2"+
		"\u049a\u049c\5\u0110\u0089\2\u049b\u049a\3\2\2\2\u049b\u049c\3\2\2\2\u049c"+
		"\u04a4\3\2\2\2\u049d\u049e\7\r\2\2\u049e\u049f\5z>\2\u049f\u04a1\5\u010c"+
		"\u0087\2\u04a0\u04a2\5\u0110\u0089\2\u04a1\u04a0\3\2\2\2\u04a1\u04a2\3"+
		"\2\2\2\u04a2\u04a4\3\2\2\2\u04a3\u0497\3\2\2\2\u04a3\u049d\3\2\2\2\u04a4"+
		"\u010b\3\2\2\2\u04a5\u04a7\5\u010e\u0088\2\u04a6\u04a5\3\2\2\2\u04a7\u04a8"+
		"\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u010d\3\2\2\2\u04aa"+
		"\u04ab\7C\2\2\u04ab\u04ac\5\u00ceh\2\u04ac\u04ad\7D\2\2\u04ad\u010f\3"+
		"\2\2\2\u04ae\u04af\7C\2\2\u04af\u04b1\7D\2\2\u04b0\u04ae\3\2\2\2\u04b1"+
		"\u04b2\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u0111\3\2"+
		"\2\2\u04b4\u04b5\5\u011a\u008e\2\u04b5\u04b6\7C\2\2\u04b6\u04b7\5\u00ce"+
		"h\2\u04b7\u04b8\7D\2\2\u04b8\u04bf\3\2\2\2\u04b9\u04ba\5\u0104\u0083\2"+
		"\u04ba\u04bb\7C\2\2\u04bb\u04bc\5\u00ceh\2\u04bc\u04bd\7D\2\2\u04bd\u04bf"+
		"\3\2\2\2\u04be\u04b4\3\2\2\2\u04be\u04b9\3\2\2\2\u04bf\u0113\3\2\2\2\u04c0"+
		"\u04c5\7a\2\2\u04c1\u04c2\7I\2\2\u04c2\u04c4\7a\2\2\u04c3\u04c1\3\2\2"+
		"\2\u04c4\u04c7\3\2\2\2\u04c5\u04c3\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u0115"+
		"\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c8\u04ce\7a\2\2\u04c9\u04ca\5\u0114\u008b"+
		"\2\u04ca\u04cb\7I\2\2\u04cb\u04cc\7a\2\2\u04cc\u04ce\3\2\2\2\u04cd\u04c8"+
		"\3\2\2\2\u04cd\u04c9\3\2\2\2\u04ce\u0117\3\2\2\2\u04cf\u04d0\7a\2\2\u04d0"+
		"\u0119\3\2\2\2\u04d1\u04d7\7a\2\2\u04d2\u04d3\5\u011e\u0090\2\u04d3\u04d4"+
		"\7I\2\2\u04d4\u04d5\7a\2\2\u04d5\u04d7\3\2\2\2\u04d6\u04d1\3\2\2\2\u04d6"+
		"\u04d2\3\2\2\2\u04d7\u011b\3\2\2\2\u04d8\u04de\7a\2\2\u04d9\u04da\5\u011e"+
		"\u0090\2\u04da\u04db\7I\2\2\u04db\u04dc\7a\2\2\u04dc\u04de\3\2\2\2\u04dd"+
		"\u04d8\3\2\2\2\u04dd\u04d9\3\2\2\2\u04de\u011d\3\2\2\2\u04df\u04e4\7a"+
		"\2\2\u04e0\u04e1\7I\2\2\u04e1\u04e3\7a\2\2\u04e2\u04e0\3\2\2\2\u04e3\u04e6"+
		"\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u011f\3\2\2\2\u04e6"+
		"\u04e4\3\2\2\2\u04e7\u04ee\5\u0122\u0092\2\u04e8\u04ee\5\u012e\u0098\2"+
		"\u04e9\u04ee\5\u013e\u00a0\2\u04ea\u04ee\5\u013a\u009e\2\u04eb\u04ee\5"+
		"\u013c\u009f\2\u04ec\u04ee\5\u0140\u00a1\2\u04ed\u04e7\3\2\2\2\u04ed\u04e8"+
		"\3\2\2\2\u04ed\u04e9\3\2\2\2\u04ed\u04ea\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ed"+
		"\u04ec\3\2\2\2\u04ee\u0121\3\2\2\2\u04ef\u04f3\5\u0124\u0093\2\u04f0\u04f3"+
		"\5\u0126\u0094\2\u04f1\u04f3\5\u0128\u0095\2\u04f2\u04ef\3\2\2\2\u04f2"+
		"\u04f0\3\2\2\2\u04f2\u04f1\3\2\2\2\u04f3\u0123\3\2\2\2\u04f4\u04f6\5\u012a"+
		"\u0096\2\u04f5\u04f7\7h\2\2\u04f6\u04f5\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7"+
		"\u0125\3\2\2\2\u04f8\u04fa\7i\2\2\u04f9\u04fb\7h\2\2\u04fa\u04f9\3\2\2"+
		"\2\u04fa\u04fb\3\2\2\2\u04fb\u0127\3\2\2\2\u04fc\u04fe\7j\2\2\u04fd\u04ff"+
		"\7h\2\2\u04fe\u04fd\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0129\3\2\2\2\u0500"+
		"\u0501\7\5\2\2\u0501\u012b\3\2\2\2\u0502\u0503\7\5\2\2\u0503\u012d\3\2"+
		"\2\2\u0504\u0505\5\u012c\u0097\2\u0505\u0507\7I\2\2\u0506\u0508\5\u012c"+
		"\u0097\2\u0507\u0506\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u050a\3\2\2\2\u0509"+
		"\u050b\5\u0130\u0099\2\u050a\u0509\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050d"+
		"\3\2\2\2\u050c\u050e\5\u0138\u009d\2\u050d\u050c\3\2\2\2\u050d\u050e\3"+
		"\2\2\2\u050e\u012f\3\2\2\2\u050f\u0510\5\u0132\u009a\2\u0510\u0511\5\u0134"+
		"\u009b\2\u0511\u0131\3\2\2\2\u0512\u0513\7k\2\2\u0513\u0133\3\2\2\2\u0514"+
		"\u0516\5\u0136\u009c\2\u0515\u0514\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0517"+
		"\3\2\2\2\u0517\u0518\5\u012c\u0097\2\u0518\u0135\3\2\2\2\u0519\u051a\t"+
		"\n\2\2\u051a\u0137\3\2\2\2\u051b\u051c\7l\2\2\u051c\u0139\3\2\2\2\u051d"+
		"\u051e\7m\2\2\u051e\u051f\7n\2\2\u051f\u0520\7m\2\2\u0520\u013b\3\2\2"+
		"\2\u0521\u0522\7a\2\2\u0522\u013d\3\2\2\2\u0523\u0524\t\13\2\2\u0524\u013f"+
		"\3\2\2\2\u0525\u0526\7o\2\2\u0526\u0141\3\2\2\2\u008a\u0143\u0148\u014c"+
		"\u0159\u015b\u0160\u0164\u0167\u016c\u016f\u0177\u0187\u018c\u0197\u019d"+
		"\u01a1\u01a7\u01ab\u01b6\u01be\u01c5\u01cc\u01d2\u01e0\u01e5\u01e8\u01ef"+
		"\u01f5\u01f8\u01fb\u0200\u0208\u0211\u0219\u0220\u0225\u022b\u0230\u0235"+
		"\u0238\u0241\u0249\u024f\u0252\u0257\u025e\u0268\u026c\u0273\u0277\u0280"+
		"\u0285\u028e\u0295\u0298\u02a1\u02aa\u02ad\u02b1\u02b5\u02bd\u02c5\u02cc"+
		"\u02d2\u02df\u02e6\u02f2\u0305\u0325\u0328\u032f\u033c\u0340\u0358\u035c"+
		"\u0360\u0368\u036b\u036e\u0375\u037e\u0383\u0387\u038b\u039d\u03a1\u03ad"+
		"\u03b8\u03c1\u03cc\u03d3\u03db\u03e5\u03ed\u03f9\u03fb\u0409\u040b\u0415"+
		"\u0417\u041f\u0421\u042b\u042d\u043a\u0443\u0451\u045d\u0462\u046b\u046e"+
		"\u0478\u047c\u0485\u048b\u0494\u049b\u04a1\u04a3\u04a8\u04b2\u04be\u04c5"+
		"\u04cd\u04d6\u04dd\u04e4\u04ed\u04f2\u04f6\u04fa\u04fe\u0507\u050a\u050d"+
		"\u0515";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}