// Generated from /home/franciscone/Faculdade/Codigos/compilers/compiler/src/parser/JavaParser.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

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
		RETURN=88, TRY=89, CATCH=90, FINALLY=91, TRUE=92, FALSE=93, NULL=94, STRING=95, 
		ID=96, ERRO=97, SYNCHRONIZED=98, DIF=99, U_SHIFT_RIGHT=100, MOD=101, NOT=102, 
		INTEGER_TYPE_SUFFIX=103, HEX_NUMERAL=104, OCTAL_NUMERAL=105, EXP=106, 
		FLOAT_S=107, ASPAS=108, LETRA=109;
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
		RULE_unaryExpressionNotPlusMinus = 122, RULE_postDecrementExpression = 123, 
		RULE_postIncrementExpression = 124, RULE_postFixExpression = 125, RULE_methodInvocation = 126, 
		RULE_fieldAccess = 127, RULE_primary = 128, RULE_primaryNoNewArray = 129, 
		RULE_classInstanceCreationExpression = 130, RULE_argumentlist = 131, RULE_arrayCreationExpression = 132, 
		RULE_dimExprs = 133, RULE_dimExpr = 134, RULE_dims = 135, RULE_arrayAccess = 136, 
		RULE_packageName = 137, RULE_typeName = 138, RULE_simpleTypeName = 139, 
		RULE_expressionName = 140, RULE_methodName = 141, RULE_ambiguousName = 142, 
		RULE_literal = 143, RULE_integerLiteral = 144, RULE_decimalIntegerLiteral = 145, 
		RULE_hexIntegerLiteral = 146, RULE_octalIntegerLiteral = 147, RULE_digits = 148, 
		RULE_floatingPointLiteral = 149, RULE_exponentPart = 150, RULE_exponentIndicator = 151, 
		RULE_signedInteger = 152, RULE_sign = 153, RULE_floatTypeSuffix = 154, 
		RULE_characterLiteral = 155, RULE_stringLiteral = 156, RULE_booleanLiteral = 157, 
		RULE_nullLiteral = 158;
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
		"unaryExpressionNotPlusMinus", "postDecrementExpression", "postIncrementExpression", 
		"postFixExpression", "methodInvocation", "fieldAccess", "primary", "primaryNoNewArray", 
		"classInstanceCreationExpression", "argumentlist", "arrayCreationExpression", 
		"dimExprs", "dimExpr", "dims", "arrayAccess", "packageName", "typeName", 
		"simpleTypeName", "expressionName", "methodName", "ambiguousName", "literal", 
		"integerLiteral", "decimalIntegerLiteral", "hexIntegerLiteral", "octalIntegerLiteral", 
		"digits", "floatingPointLiteral", "exponentPart", "exponentIndicator", 
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
		"'return'", "'try'", "'catch'", "'finally'", null, null, "'null'"
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
		"RETURN", "TRY", "CATCH", "FINALLY", "TRUE", "FALSE", "NULL", "STRING", 
		"ID", "ERRO", "SYNCHRONIZED", "DIF", "U_SHIFT_RIGHT", "MOD", "NOT", "INTEGER_TYPE_SUFFIX", 
		"HEX_NUMERAL", "OCTAL_NUMERAL", "EXP", "FLOAT_S", "ASPAS", "LETRA"
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
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(318);
				packageDeclaration();
				}
			}

			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(321);
				importDeclarations();
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << ABSTRACT) | (1L << FINAL) | (1L << PUBLIC) | (1L << INTERFACE))) != 0)) {
				{
				setState(327);
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
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(PACKAGE);
			setState(331);
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
	}

	public final ImportDeclarationsContext importDeclarations() throws RecognitionException {
		ImportDeclarationsContext _localctx = new ImportDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(IMPORT);
			setState(334);
			importDeclaration();
			setState(335);
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
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importDeclaration);
		int _la;
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				typeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				packageName();
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PONTO) {
					{
					setState(339);
					match(PONTO);
					setState(340);
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
	}

	public final TypeDeclarationsContext typeDeclarations() throws RecognitionException {
		TypeDeclarationsContext _localctx = new TypeDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(345);
				typeDeclaration();
				}
				}
				setState(348); 
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
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeDeclaration);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
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
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PUBLIC))) != 0)) {
				{
				setState(354);
				classModifiers();
				}
			}

			setState(357);
			match(CLASS);
			setState(358);
			match(ID);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(359);
				superRule();
				}
			}

			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(362);
				interfaces();
				}
			}

			setState(365);
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
	}

	public final ClassModifiersContext classModifiers() throws RecognitionException {
		ClassModifiersContext _localctx = new ClassModifiersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			classModifier();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PUBLIC))) != 0)) {
				{
				{
				setState(368);
				classModifier();
				}
				}
				setState(373);
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
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
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
	}

	public final SuperRuleContext superRule() throws RecognitionException {
		SuperRuleContext _localctx = new SuperRuleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_superRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(EXTENDS);
			setState(377);
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
	}

	public final InterfacesContext interfaces() throws RecognitionException {
		InterfacesContext _localctx = new InterfacesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(IMPLEMENTS);
			setState(380);
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
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			interfaceType();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(383);
				match(VIRGULA);
				setState(384);
				interfaceType();
				}
				}
				setState(389);
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
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(ACH);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT) | (1L << BYTE) | (1L << INT) | (1L << LONG) | (1L << CHAR) | (1L << FLOAT) | (1L << LOGICAL) | (1L << ABSTRACT) | (1L << FINAL) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << VOID) | (1L << NATIVE))) != 0) || _la==ID || _la==SYNCHRONIZED) {
				{
				setState(391);
				classBodyDeclarations(0);
				}
			}

			setState(394);
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
			setState(397);
			classBodyDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(403);
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
					setState(399);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(400);
					classBodyDeclaration();
					}
					} 
				}
				setState(405);
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
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classBodyDeclaration);
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				classMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				staticInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
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
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classMemberDeclaration);
		try {
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
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
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(STATIC);
			setState(416);
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
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED))) != 0)) {
				{
				setState(418);
				constructorModifiers(0);
				}
			}

			setState(421);
			constructorDeclarator();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(422);
				throwsRule();
				}
			}

			setState(425);
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
			setState(428);
			constructorModifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(434);
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
					setState(430);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(431);
					constructorModifier();
					}
					} 
				}
				setState(436);
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
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constructorModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
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
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(ID);
			setState(440);
			match(AP);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT) | (1L << BYTE) | (1L << INT) | (1L << LONG) | (1L << CHAR) | (1L << FLOAT) | (1L << LOGICAL))) != 0) || _la==ID) {
				{
				setState(441);
				formalParameterList();
				}
			}

			setState(444);
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
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			type();
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AC) {
				{
				setState(447);
				match(AC);
				setState(448);
				match(FC);
				}
			}

			setState(451);
			variableDeclaratorId();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(452);
				match(VIRGULA);
				setState(453);
				type();
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AC) {
					{
					setState(454);
					match(AC);
					setState(455);
					match(FC);
					}
				}

				setState(458);
				variableDeclaratorId();
				}
				}
				setState(464);
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
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			type();
			setState(466);
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
	}

	public final ThrowsRuleContext throwsRule() throws RecognitionException {
		ThrowsRuleContext _localctx = new ThrowsRuleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_throwsRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(THROWS);
			setState(469);
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
	}

	public final ClassTypeListContext classTypeList() throws RecognitionException {
		ClassTypeListContext _localctx = new ClassTypeListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_classTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			classType();
			setState(476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(472);
					match(VIRGULA);
					setState(473);
					classType();
					}
					} 
				}
				setState(478);
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
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(ACH);
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(480);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << SHORT) | (1L << BYTE) | (1L << INT) | (1L << LONG) | (1L << CHAR) | (1L << FLOAT) | (1L << LOGICAL) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << SUPER) | (1L << THROW) | (1L << INC) | (1L << DEC))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ACH - 67)) | (1L << (AP - 67)) | (1L << (IF - 67)) | (1L << (SWITCH - 67)) | (1L << (DO - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (BREAK - 67)) | (1L << (CONTINUE - 67)) | (1L << (RETURN - 67)) | (1L << (TRY - 67)) | (1L << (TRUE - 67)) | (1L << (FALSE - 67)) | (1L << (NULL - 67)) | (1L << (ID - 67)) | (1L << (SYNCHRONIZED - 67)) | (1L << (HEX_NUMERAL - 67)) | (1L << (OCTAL_NUMERAL - 67)) | (1L << (ASPAS - 67)))) != 0)) {
				{
				setState(483);
				blockStatements();
				}
			}

			setState(486);
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
		public TerminalNode PONTOV() { return getToken(JavaParser.PONTOV, 0); }
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				match(THIS);
				setState(489);
				match(AP);
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (AP - 69)) | (1L << (EXCLAMACAO - 69)) | (1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (NULL - 69)) | (1L << (ID - 69)) | (1L << (NOT - 69)) | (1L << (HEX_NUMERAL - 69)) | (1L << (OCTAL_NUMERAL - 69)) | (1L << (ASPAS - 69)))) != 0)) {
					{
					setState(490);
					argumentlist();
					}
				}

				setState(493);
				match(FP);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				match(SUPER);
				setState(495);
				match(AP);
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (AP - 69)) | (1L << (EXCLAMACAO - 69)) | (1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (NULL - 69)) | (1L << (ID - 69)) | (1L << (NOT - 69)) | (1L << (HEX_NUMERAL - 69)) | (1L << (OCTAL_NUMERAL - 69)) | (1L << (ASPAS - 69)))) != 0)) {
					{
					setState(496);
					argumentlist();
					}
				}

				setState(499);
				match(FP);
				setState(500);
				match(PONTOV);
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
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) {
				{
				setState(503);
				fieldModifiers();
				}
			}

			setState(506);
			type();
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AC) {
				{
				setState(507);
				match(AC);
				setState(508);
				match(FC);
				}
			}

			setState(511);
			variableDeclarators();
			setState(512);
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
	}

	public final FieldModifiersContext fieldModifiers() throws RecognitionException {
		FieldModifiersContext _localctx = new FieldModifiersContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fieldModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(514);
				fieldModifier();
				}
				}
				setState(517); 
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
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fieldModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
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
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			variableDeclarator();
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(522);
				match(VIRGULA);
				setState(523);
				variableDeclarator();
				}
				}
				setState(528);
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
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variableDeclarator);
		try {
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				variableDeclaratorId();
				setState(531);
				match(IGUAL_ATRIB);
				setState(532);
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
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(ID);
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AC) {
				{
				{
				setState(537);
				match(AC);
				setState(538);
				match(FC);
				}
				}
				setState(543);
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
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableInitializer);
		try {
			setState(546);
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
			case NULL:
			case ID:
			case NOT:
			case HEX_NUMERAL:
			case OCTAL_NUMERAL:
			case ASPAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				expression();
				}
				break;
			case ACH:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
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
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			methodHeader();
			setState(549);
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
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_methodHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << NATIVE))) != 0) || _la==SYNCHRONIZED) {
				{
				setState(551);
				methodModifiers(0);
				}
			}

			setState(554);
			resultType();
			setState(555);
			methodDeclarator();
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(556);
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
	}

	public final ResultTypeContext resultType() throws RecognitionException {
		ResultTypeContext _localctx = new ResultTypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_resultType);
		int _la;
		try {
			setState(565);
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
				setState(559);
				type();
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AC) {
					{
					setState(560);
					match(AC);
					setState(561);
					match(FC);
					}
				}

				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
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
			setState(568);
			methodModifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(574);
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
					setState(570);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(571);
					methodModifier();
					}
					} 
				}
				setState(576);
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
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_methodModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
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
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(ID);
			setState(580);
			match(AP);
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT) | (1L << BYTE) | (1L << INT) | (1L << LONG) | (1L << CHAR) | (1L << FLOAT) | (1L << LOGICAL))) != 0) || _la==ID) {
				{
				setState(581);
				formalParameterList();
				}
			}

			setState(584);
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
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_methodBody);
		try {
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
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
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT || _la==PUBLIC) {
				{
				setState(590);
				interfaceModifiers();
				}
			}

			setState(593);
			match(INTERFACE);
			setState(594);
			match(ID);
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(595);
				extendsInterfaces();
				}
			}

			setState(598);
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
	}

	public final InterfaceModifiersContext interfaceModifiers() throws RecognitionException {
		InterfaceModifiersContext _localctx = new InterfaceModifiersContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_interfaceModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(600);
				interfaceModifier();
				}
				}
				setState(603); 
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
	}

	public final InterfaceModifierContext interfaceModifier() throws RecognitionException {
		InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_interfaceModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
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
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_extendsInterfaces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(EXTENDS);
			setState(608);
			interfaceType();
			setState(611); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(609);
				match(VIRGULA);
				setState(610);
				interfaceType();
				}
				}
				setState(613); 
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
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(ACH);
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT) | (1L << BYTE) | (1L << INT) | (1L << LONG) | (1L << CHAR) | (1L << FLOAT) | (1L << LOGICAL) | (1L << ABSTRACT) | (1L << FINAL) | (1L << PUBLIC) | (1L << STATIC) | (1L << VOID))) != 0) || _la==ID) {
				{
				setState(616);
				interfaceMemberDeclarations();
				}
			}

			setState(619);
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
	}

	public final InterfaceMemberDeclarationsContext interfaceMemberDeclarations() throws RecognitionException {
		InterfaceMemberDeclarationsContext _localctx = new InterfaceMemberDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_interfaceMemberDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(621);
				interfaceMemberDeclaration();
				}
				}
				setState(624); 
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
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_interfaceMemberDeclaration);
		try {
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
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
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_constantDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			constantModifiers();
			setState(631);
			type();
			setState(632);
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
	}

	public final ConstantModifiersContext constantModifiers() throws RecognitionException {
		ConstantModifiersContext _localctx = new ConstantModifiersContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_constantModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
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
	}

	public final AbstractMethodDeclarationContext abstractMethodDeclaration() throws RecognitionException {
		AbstractMethodDeclarationContext _localctx = new AbstractMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_abstractMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT || _la==PUBLIC) {
				{
				setState(636);
				abstractMethodModifiers(0);
				}
			}

			setState(639);
			resultType();
			setState(640);
			methodDeclarator();
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(641);
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
			setState(645);
			abstractMethodModifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(651);
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
					setState(647);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(648);
					abstractMethodModifier();
					}
					} 
				}
				setState(653);
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
	}

	public final AbstractMethodModifierContext abstractMethodModifier() throws RecognitionException {
		AbstractMethodModifierContext _localctx = new AbstractMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_abstractMethodModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
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
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(ACH);
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ACH - 67)) | (1L << (AP - 67)) | (1L << (EXCLAMACAO - 67)) | (1L << (TRUE - 67)) | (1L << (FALSE - 67)) | (1L << (NULL - 67)) | (1L << (ID - 67)) | (1L << (NOT - 67)) | (1L << (HEX_NUMERAL - 67)) | (1L << (OCTAL_NUMERAL - 67)) | (1L << (ASPAS - 67)))) != 0)) {
				{
				setState(657);
				variableInitializers();
				}
			}

			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(660);
				match(VIRGULA);
				}
			}

			setState(663);
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
	}

	public final VariableInitializersContext variableInitializers() throws RecognitionException {
		VariableInitializersContext _localctx = new VariableInitializersContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_variableInitializers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			variableInitializer();
			setState(670);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(666);
					match(VIRGULA);
					setState(667);
					variableInitializer();
					}
					} 
				}
				setState(672);
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_type);
		try {
			int _alt;
			setState(682);
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
				setState(673);
				primitiveType();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				referenceType();
				setState(679);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(675);
						match(AC);
						setState(676);
						match(FC);
						}
						} 
					}
					setState(681);
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
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_primitiveType);
		try {
			setState(686);
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
				setState(684);
				numericType();
				}
				break;
			case LOGICAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
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
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_numericType);
		try {
			setState(690);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHORT:
			case BYTE:
			case INT:
			case LONG:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				integralType();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
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
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
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
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_referenceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
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
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_classOrInterfaceType);
		try {
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
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
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_classType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
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
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(ACH);
			setState(706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << SHORT) | (1L << BYTE) | (1L << INT) | (1L << LONG) | (1L << CHAR) | (1L << FLOAT) | (1L << LOGICAL) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << SUPER) | (1L << THROW) | (1L << INC) | (1L << DEC))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ACH - 67)) | (1L << (AP - 67)) | (1L << (IF - 67)) | (1L << (SWITCH - 67)) | (1L << (DO - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (BREAK - 67)) | (1L << (CONTINUE - 67)) | (1L << (RETURN - 67)) | (1L << (TRY - 67)) | (1L << (TRUE - 67)) | (1L << (FALSE - 67)) | (1L << (NULL - 67)) | (1L << (ID - 67)) | (1L << (SYNCHRONIZED - 67)) | (1L << (HEX_NUMERAL - 67)) | (1L << (OCTAL_NUMERAL - 67)) | (1L << (ASPAS - 67)))) != 0)) {
				{
				setState(705);
				blockStatements();
				}
			}

			setState(708);
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
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(710);
				blockStatement();
				}
				}
				setState(713); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << SHORT) | (1L << BYTE) | (1L << INT) | (1L << LONG) | (1L << CHAR) | (1L << FLOAT) | (1L << LOGICAL) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << SUPER) | (1L << THROW) | (1L << INC) | (1L << DEC))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ACH - 67)) | (1L << (AP - 67)) | (1L << (IF - 67)) | (1L << (SWITCH - 67)) | (1L << (DO - 67)) | (1L << (WHILE - 67)) | (1L << (FOR - 67)) | (1L << (BREAK - 67)) | (1L << (CONTINUE - 67)) | (1L << (RETURN - 67)) | (1L << (TRY - 67)) | (1L << (TRUE - 67)) | (1L << (FALSE - 67)) | (1L << (NULL - 67)) | (1L << (ID - 67)) | (1L << (SYNCHRONIZED - 67)) | (1L << (HEX_NUMERAL - 67)) | (1L << (OCTAL_NUMERAL - 67)) | (1L << (ASPAS - 67)))) != 0) );
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
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_blockStatement);
		try {
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(715);
				localVariableDeclarationStatement();
				setState(716);
				match(PONTOV);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(718);
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
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
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
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			type();
			setState(724);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_statement);
		try {
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(726);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(727);
				labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(728);
				ifThenStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(729);
				ifThenElseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(730);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(731);
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
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_statementNoShortIf);
		try {
			setState(739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				labeledStatementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(736);
				ifThenElseStatementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(737);
				whileStatementNoShortIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(738);
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
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(751);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACH:
				enterOuterAlt(_localctx, 1);
				{
				setState(741);
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
			case NULL:
			case ID:
			case HEX_NUMERAL:
			case OCTAL_NUMERAL:
			case ASPAS:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				expressionStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(743);
				switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(744);
				doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 5);
				{
				setState(745);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(746);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(747);
				returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(748);
				synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 9);
				{
				setState(749);
				throwsRuleStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 10);
				{
				setState(750);
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
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(ID);
			setState(754);
			match(DOIS_PONTOS);
			setState(755);
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
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(ID);
			setState(758);
			match(DOIS_PONTOS);
			setState(759);
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
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
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
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public TerminalNode PONTOV() { return getToken(JavaParser.PONTOV, 0); }
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_statementExpression);
		try {
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				preIncrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(765);
				postIncrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(766);
				preDecrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(767);
				postDecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(768);
				methodInvocation();
				setState(769);
				match(PONTOV);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(771);
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
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(IF);
			setState(775);
			match(AP);
			setState(776);
			expression();
			setState(777);
			match(FP);
			setState(778);
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
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(IF);
			setState(781);
			match(AP);
			setState(782);
			expression();
			setState(783);
			match(FP);
			setState(784);
			statementNoShortIf();
			setState(785);
			match(ELSE);
			setState(786);
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
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			match(IF);
			setState(789);
			match(AP);
			setState(790);
			expression();
			setState(791);
			match(FP);
			setState(792);
			statementNoShortIf();
			setState(793);
			match(ELSE);
			setState(794);
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
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(SWITCH);
			setState(797);
			match(AP);
			setState(798);
			expression();
			setState(799);
			match(FP);
			setState(800);
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
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_switchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(ACH);
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(803);
				switchBlockStatementGroups();
				}
				break;
			}
			setState(807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE || _la==DEFAULT) {
				{
				setState(806);
				switchLabels();
				}
			}

			setState(809);
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
	}

	public final SwitchBlockStatementGroupsContext switchBlockStatementGroups() throws RecognitionException {
		SwitchBlockStatementGroupsContext _localctx = new SwitchBlockStatementGroupsContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_switchBlockStatementGroups);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(812); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(811);
					switchBlockStatementGroup();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(814); 
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
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			switchLabels();
			setState(817);
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
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_switchLabels);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
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
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_switchLabel);
		int _la;
		try {
			setState(831);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(825); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(821);
					match(CASE);
					setState(822);
					constantExpression();
					setState(823);
					match(DOIS_PONTOS);
					}
					}
					setState(827); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CASE );
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(829);
				match(DEFAULT);
				setState(830);
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
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(WHILE);
			setState(834);
			match(AP);
			setState(835);
			expression();
			setState(836);
			match(FP);
			setState(837);
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
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			match(WHILE);
			setState(840);
			match(AP);
			setState(841);
			expression();
			setState(842);
			match(FP);
			setState(843);
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
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(DO);
			setState(846);
			statement();
			setState(847);
			match(WHILE);
			setState(848);
			match(AP);
			setState(849);
			expression();
			setState(850);
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
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(FOR);
			setState(853);
			match(AP);
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << SHORT) | (1L << BYTE) | (1L << INT) | (1L << LONG) | (1L << CHAR) | (1L << FLOAT) | (1L << LOGICAL) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << SUPER) | (1L << INC) | (1L << DEC))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (AP - 69)) | (1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (NULL - 69)) | (1L << (ID - 69)) | (1L << (HEX_NUMERAL - 69)) | (1L << (OCTAL_NUMERAL - 69)) | (1L << (ASPAS - 69)))) != 0)) {
				{
				setState(854);
				forInit();
				}
			}

			setState(857);
			match(PONTOV);
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (AP - 69)) | (1L << (EXCLAMACAO - 69)) | (1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (NULL - 69)) | (1L << (ID - 69)) | (1L << (NOT - 69)) | (1L << (HEX_NUMERAL - 69)) | (1L << (OCTAL_NUMERAL - 69)) | (1L << (ASPAS - 69)))) != 0)) {
				{
				setState(858);
				expression();
				}
			}

			setState(861);
			match(PONTOV);
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << SUPER) | (1L << INC) | (1L << DEC))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (AP - 69)) | (1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (NULL - 69)) | (1L << (ID - 69)) | (1L << (HEX_NUMERAL - 69)) | (1L << (OCTAL_NUMERAL - 69)) | (1L << (ASPAS - 69)))) != 0)) {
				{
				setState(862);
				forUpdate();
				}
			}

			setState(865);
			match(FP);
			setState(866);
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
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_forStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			match(FOR);
			setState(869);
			match(AP);
			setState(871);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(870);
				forInit();
				}
				break;
			}
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(873);
				expression();
				}
				break;
			}
			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << SUPER) | (1L << INC) | (1L << DEC))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (AP - 69)) | (1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (NULL - 69)) | (1L << (ID - 69)) | (1L << (HEX_NUMERAL - 69)) | (1L << (OCTAL_NUMERAL - 69)) | (1L << (ASPAS - 69)))) != 0)) {
				{
				setState(876);
				forUpdate();
				}
			}

			setState(879);
			match(FP);
			setState(880);
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
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_forInit);
		try {
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(882);
				statementExpressionList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(883);
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
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
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
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			statementExpression();
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(889);
				match(VIRGULA);
				setState(890);
				statementExpression();
				}
				}
				setState(895);
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
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			match(BREAK);
			setState(898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(897);
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
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			match(CONTINUE);
			setState(902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(901);
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
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			match(RETURN);
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(905);
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
	}

	public final ThrowsRuleStatementContext throwsRuleStatement() throws RecognitionException {
		ThrowsRuleStatementContext _localctx = new ThrowsRuleStatementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_throwsRuleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			match(THROW);
			setState(909);
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
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			match(SYNCHRONIZED);
			setState(912);
			match(AP);
			setState(913);
			expression();
			setState(914);
			match(FP);
			setState(915);
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
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_tryStatement);
		int _la;
		try {
			setState(928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(917);
				match(TRY);
				setState(918);
				block();
				setState(919);
				catches();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(921);
				match(TRY);
				setState(922);
				block();
				setState(924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(923);
					catches();
					}
				}

				setState(926);
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
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_catches);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
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
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(932);
				match(CATCH);
				setState(933);
				match(AP);
				setState(934);
				formalParameter();
				setState(935);
				match(FP);
				setState(936);
				block();
				}
				}
				setState(940); 
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
	}

	public final FinallyRuleContext finallyRule() throws RecognitionException {
		FinallyRuleContext _localctx = new FinallyRuleContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_finallyRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			match(FINALLY);
			setState(943);
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
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
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
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_assignmentExpression);
		try {
			setState(951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(949);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
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
		public TerminalNode PONTOV() { return getToken(JavaParser.PONTOV, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			leftHandSide();
			setState(954);
			assignmentOperator();
			setState(955);
			assignmentExpression();
			setState(956);
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
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_leftHandSide);
		try {
			setState(961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(958);
				expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(959);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(960);
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
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
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
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_conditionalExpression);
		try {
			setState(972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(965);
				conditionalOrExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(966);
				conditionalOrExpression();
				setState(967);
				match(INTERROGACAO);
				setState(968);
				expression();
				setState(969);
				match(DOIS_PONTOS);
				setState(970);
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
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			conditionalAndExpression();
			setState(979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(975);
				match(OR);
				setState(976);
				conditionalAndExpression();
				}
				}
				setState(981);
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
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			inclusiveOrExpression();
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(983);
				match(AND);
				setState(984);
				inclusiveOrExpression();
				}
				}
				setState(989);
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
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_inclusiveOrExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
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
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			andExpression();
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(993);
				match(CARET);
				setState(994);
				andExpression();
				}
				}
				setState(999);
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
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			equalityExpression(0);
			setState(1005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(1001);
				match(BITAND);
				setState(1002);
				equalityExpression(0);
				}
				}
				setState(1007);
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
			setState(1009);
			relationalExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1019);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1017);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(1011);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1012);
						match(IGUAL);
						setState(1013);
						relationalExpression();
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(1014);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1015);
						match(DIF);
						setState(1016);
						relationalExpression();
						}
						break;
					}
					} 
				}
				setState(1021);
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
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_relationalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			shiftExpression();
			setState(1035);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1033);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MENOR:
						{
						setState(1023);
						match(MENOR);
						setState(1024);
						shiftExpression();
						}
						break;
					case MAIOR:
						{
						setState(1025);
						match(MAIOR);
						setState(1026);
						shiftExpression();
						}
						break;
					case MENOR_IGUAL:
						{
						setState(1027);
						match(MENOR_IGUAL);
						setState(1028);
						shiftExpression();
						}
						break;
					case MAIOR_IGUAL:
						{
						setState(1029);
						match(MAIOR_IGUAL);
						setState(1030);
						shiftExpression();
						}
						break;
					case INSTANCEOF:
						{
						setState(1031);
						match(INSTANCEOF);
						setState(1032);
						referenceType();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1037);
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
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			additiveExpression();
			setState(1047);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1045);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SHIFT_LEFT:
						{
						{
						setState(1039);
						match(SHIFT_LEFT);
						setState(1040);
						additiveExpression();
						}
						}
						break;
					case SHIFT_RIGHT:
						{
						{
						setState(1041);
						match(SHIFT_RIGHT);
						setState(1042);
						additiveExpression();
						}
						}
						break;
					case U_SHIFT_RIGHT:
						{
						{
						setState(1043);
						match(U_SHIFT_RIGHT);
						setState(1044);
						additiveExpression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1049);
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
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			multiplicativeExpression();
			setState(1057);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1055);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ADD:
						{
						setState(1051);
						match(ADD);
						setState(1052);
						multiplicativeExpression();
						}
						break;
					case SUB:
						{
						setState(1053);
						match(SUB);
						setState(1054);
						multiplicativeExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1059);
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
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			unaryExpression();
			setState(1069);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1067);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MULT:
						{
						setState(1061);
						match(MULT);
						setState(1062);
						unaryExpression();
						}
						break;
					case DIV:
						{
						setState(1063);
						match(DIV);
						setState(1064);
						unaryExpression();
						}
						break;
					case MOD:
						{
						setState(1065);
						match(MOD);
						setState(1066);
						unaryExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1071);
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
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_castExpression);
		try {
			setState(1082);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1072);
				match(AP);
				setState(1073);
				primitiveType();
				setState(1074);
				match(FP);
				setState(1075);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1077);
				match(AP);
				setState(1078);
				referenceType();
				setState(1079);
				match(FP);
				setState(1080);
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
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_unaryExpression);
		try {
			setState(1091);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1084);
				preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1085);
				preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(1086);
				match(ADD);
				setState(1087);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(1088);
				match(SUB);
				setState(1089);
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
			case NULL:
			case ID:
			case NOT:
			case HEX_NUMERAL:
			case OCTAL_NUMERAL:
			case ASPAS:
				enterOuterAlt(_localctx, 5);
				{
				setState(1090);
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
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			match(DEC);
			setState(1094);
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
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			match(INC);
			setState(1097);
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
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(1105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1099);
				postFixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1100);
				match(NOT);
				setState(1101);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1102);
				match(EXCLAMACAO);
				setState(1103);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1104);
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

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostFixExpressionContext postFixExpression() {
			return getRuleContext(PostFixExpressionContext.class,0);
		}
		public TerminalNode DEC() { return getToken(JavaParser.DEC, 0); }
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			postFixExpression();
			setState(1108);
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
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			postFixExpression();
			setState(1111);
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
		public PostFixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postFixExpression; }
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
				setState(1113);
				primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1114);
				expressionName();
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (AP - 69)) | (1L << (EXCLAMACAO - 69)) | (1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (NULL - 69)) | (1L << (ID - 69)) | (1L << (NOT - 69)) | (1L << (HEX_NUMERAL - 69)) | (1L << (OCTAL_NUMERAL - 69)) | (1L << (ASPAS - 69)))) != 0)) {
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (AP - 69)) | (1L << (EXCLAMACAO - 69)) | (1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (NULL - 69)) | (1L << (ID - 69)) | (1L << (NOT - 69)) | (1L << (HEX_NUMERAL - 69)) | (1L << (OCTAL_NUMERAL - 69)) | (1L << (ASPAS - 69)))) != 0)) {
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
			case NULL:
			case ID:
			case HEX_NUMERAL:
			case OCTAL_NUMERAL:
			case ASPAS:
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
			case NULL:
			case ID:
			case HEX_NUMERAL:
			case OCTAL_NUMERAL:
			case ASPAS:
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NEW) | (1L << EXTENDS) | (1L << THIS) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (AP - 69)) | (1L << (EXCLAMACAO - 69)) | (1L << (TRUE - 69)) | (1L << (FALSE - 69)) | (1L << (NULL - 69)) | (1L << (ID - 69)) | (1L << (NOT - 69)) | (1L << (HEX_NUMERAL - 69)) | (1L << (OCTAL_NUMERAL - 69)) | (1L << (ASPAS - 69)))) != 0)) {
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
		public TerminalNode NUMERO() { return getToken(JavaParser.NUMERO, 0); }
		public TerminalNode INTEGER_TYPE_SUFFIX() { return getToken(JavaParser.INTEGER_TYPE_SUFFIX, 0); }
		public DecimalIntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalIntegerLiteral; }
	}

	public final DecimalIntegerLiteralContext decimalIntegerLiteral() throws RecognitionException {
		DecimalIntegerLiteralContext _localctx = new DecimalIntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_decimalIntegerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			match(NUMERO);
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

	public static class DigitsContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(JavaParser.NUMERO, 0); }
		public DigitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digits; }
	}

	public final DigitsContext digits() throws RecognitionException {
		DigitsContext _localctx = new DigitsContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_digits);
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
	}

	public final FloatingPointLiteralContext floatingPointLiteral() throws RecognitionException {
		FloatingPointLiteralContext _localctx = new FloatingPointLiteralContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_floatingPointLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			digits();
			setState(1281);
			match(PONTO);
			setState(1283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1282);
				digits();
				}
				break;
			}
			setState(1286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1285);
				exponentPart();
				}
				break;
			}
			setState(1289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1288);
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
	}

	public final ExponentPartContext exponentPart() throws RecognitionException {
		ExponentPartContext _localctx = new ExponentPartContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_exponentPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
			exponentIndicator();
			setState(1292);
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
	}

	public final ExponentIndicatorContext exponentIndicator() throws RecognitionException {
		ExponentIndicatorContext _localctx = new ExponentIndicatorContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_exponentIndicator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
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
	}

	public final SignedIntegerContext signedInteger() throws RecognitionException {
		SignedIntegerContext _localctx = new SignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_signedInteger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADD || _la==SUB) {
				{
				setState(1296);
				sign();
				}
			}

			setState(1299);
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
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
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
	}

	public final FloatTypeSuffixContext floatTypeSuffix() throws RecognitionException {
		FloatTypeSuffixContext _localctx = new FloatTypeSuffixContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_floatTypeSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
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
	}

	public final CharacterLiteralContext characterLiteral() throws RecognitionException {
		CharacterLiteralContext _localctx = new CharacterLiteralContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			match(ASPAS);
			setState(1306);
			match(LETRA);
			setState(1307);
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
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
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
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
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
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1313);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3o\u0526\4\2\t\2\4"+
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
		"\t\u00a0\3\2\5\2\u0142\n\2\3\2\7\2\u0145\n\2\f\2\16\2\u0148\13\2\3\2\5"+
		"\2\u014b\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u0158\n\5"+
		"\5\5\u015a\n\5\3\6\6\6\u015d\n\6\r\6\16\6\u015e\3\7\3\7\5\7\u0163\n\7"+
		"\3\b\5\b\u0166\n\b\3\b\3\b\3\b\5\b\u016b\n\b\3\b\5\b\u016e\n\b\3\b\3\b"+
		"\3\t\3\t\7\t\u0174\n\t\f\t\16\t\u0177\13\t\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\7\r\u0184\n\r\f\r\16\r\u0187\13\r\3\16\3\16\5\16"+
		"\u018b\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u0194\n\17\f\17\16"+
		"\17\u0197\13\17\3\20\3\20\3\20\5\20\u019c\n\20\3\21\3\21\5\21\u01a0\n"+
		"\21\3\22\3\22\3\22\3\23\5\23\u01a6\n\23\3\23\3\23\5\23\u01aa\n\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u01b3\n\24\f\24\16\24\u01b6\13\24"+
		"\3\25\3\25\3\26\3\26\3\26\5\26\u01bd\n\26\3\26\3\26\3\27\3\27\3\27\5\27"+
		"\u01c4\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u01cb\n\27\3\27\3\27\7\27\u01cf"+
		"\n\27\f\27\16\27\u01d2\13\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\7\32\u01dd\n\32\f\32\16\32\u01e0\13\32\3\33\3\33\5\33\u01e4\n\33\3"+
		"\33\5\33\u01e7\n\33\3\33\3\33\3\34\3\34\3\34\5\34\u01ee\n\34\3\34\3\34"+
		"\3\34\3\34\5\34\u01f4\n\34\3\34\3\34\5\34\u01f8\n\34\3\35\5\35\u01fb\n"+
		"\35\3\35\3\35\3\35\5\35\u0200\n\35\3\35\3\35\3\35\3\36\6\36\u0206\n\36"+
		"\r\36\16\36\u0207\3\37\3\37\3 \3 \3 \7 \u020f\n \f \16 \u0212\13 \3!\3"+
		"!\3!\3!\3!\5!\u0219\n!\3\"\3\"\3\"\7\"\u021e\n\"\f\"\16\"\u0221\13\"\3"+
		"#\3#\5#\u0225\n#\3$\3$\3$\3%\5%\u022b\n%\3%\3%\3%\5%\u0230\n%\3&\3&\3"+
		"&\5&\u0235\n&\3&\5&\u0238\n&\3\'\3\'\3\'\3\'\3\'\7\'\u023f\n\'\f\'\16"+
		"\'\u0242\13\'\3(\3(\3)\3)\3)\5)\u0249\n)\3)\3)\3*\3*\5*\u024f\n*\3+\5"+
		"+\u0252\n+\3+\3+\3+\5+\u0257\n+\3+\3+\3,\6,\u025c\n,\r,\16,\u025d\3-\3"+
		"-\3.\3.\3.\3.\6.\u0266\n.\r.\16.\u0267\3/\3/\5/\u026c\n/\3/\3/\3\60\6"+
		"\60\u0271\n\60\r\60\16\60\u0272\3\61\3\61\5\61\u0277\n\61\3\62\3\62\3"+
		"\62\3\62\3\63\3\63\3\64\5\64\u0280\n\64\3\64\3\64\3\64\5\64\u0285\n\64"+
		"\3\65\3\65\3\65\3\65\3\65\7\65\u028c\n\65\f\65\16\65\u028f\13\65\3\66"+
		"\3\66\3\67\3\67\5\67\u0295\n\67\3\67\5\67\u0298\n\67\3\67\3\67\38\38\3"+
		"8\78\u029f\n8\f8\168\u02a2\138\39\39\39\39\79\u02a8\n9\f9\169\u02ab\13"+
		"9\59\u02ad\n9\3:\3:\5:\u02b1\n:\3;\3;\5;\u02b5\n;\3<\3<\3=\3=\3>\3>\5"+
		">\u02bd\n>\3?\3?\3@\3@\3A\3A\5A\u02c5\nA\3A\3A\3B\6B\u02ca\nB\rB\16B\u02cb"+
		"\3C\3C\3C\3C\5C\u02d2\nC\3D\3D\3E\3E\3E\3F\3F\3F\3F\3F\3F\5F\u02df\nF"+
		"\3G\3G\3G\3G\3G\5G\u02e6\nG\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u02f2\nH"+
		"\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u0307\nL"+
		"\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3P"+
		"\3P\3P\3P\3P\3P\3Q\3Q\5Q\u0327\nQ\3Q\5Q\u032a\nQ\3Q\3Q\3R\6R\u032f\nR"+
		"\rR\16R\u0330\3S\3S\3S\3T\3T\3U\3U\3U\3U\6U\u033c\nU\rU\16U\u033d\3U\3"+
		"U\5U\u0342\nU\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3"+
		"X\3Y\3Y\3Y\5Y\u035a\nY\3Y\3Y\5Y\u035e\nY\3Y\3Y\5Y\u0362\nY\3Y\3Y\3Y\3"+
		"Z\3Z\3Z\5Z\u036a\nZ\3Z\5Z\u036d\nZ\3Z\5Z\u0370\nZ\3Z\3Z\3Z\3[\3[\5[\u0377"+
		"\n[\3\\\3\\\3]\3]\3]\7]\u037e\n]\f]\16]\u0381\13]\3^\3^\5^\u0385\n^\3"+
		"_\3_\5_\u0389\n_\3`\3`\5`\u038d\n`\3a\3a\3a\3b\3b\3b\3b\3b\3b\3c\3c\3"+
		"c\3c\3c\3c\3c\5c\u039f\nc\3c\3c\5c\u03a3\nc\3d\3d\3e\3e\3e\3e\3e\3e\6"+
		"e\u03ad\ne\re\16e\u03ae\3f\3f\3f\3g\3g\3h\3h\3i\3i\5i\u03ba\ni\3j\3j\3"+
		"j\3j\3j\3k\3k\3k\5k\u03c4\nk\3l\3l\3m\3m\3m\3m\3m\3m\3m\5m\u03cf\nm\3"+
		"n\3n\3n\7n\u03d4\nn\fn\16n\u03d7\13n\3o\3o\3o\7o\u03dc\no\fo\16o\u03df"+
		"\13o\3p\3p\3q\3q\3q\7q\u03e6\nq\fq\16q\u03e9\13q\3r\3r\3r\7r\u03ee\nr"+
		"\fr\16r\u03f1\13r\3s\3s\3s\3s\3s\3s\3s\3s\3s\7s\u03fc\ns\fs\16s\u03ff"+
		"\13s\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\7t\u040c\nt\ft\16t\u040f\13t\3u"+
		"\3u\3u\3u\3u\3u\3u\7u\u0418\nu\fu\16u\u041b\13u\3v\3v\3v\3v\3v\7v\u0422"+
		"\nv\fv\16v\u0425\13v\3w\3w\3w\3w\3w\3w\3w\7w\u042e\nw\fw\16w\u0431\13"+
		"w\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\5x\u043d\nx\3y\3y\3y\3y\3y\3y\3y\5y\u0446"+
		"\ny\3z\3z\3z\3{\3{\3{\3|\3|\3|\3|\3|\3|\5|\u0454\n|\3}\3}\3}\3~\3~\3~"+
		"\3\177\3\177\5\177\u045e\n\177\3\u0080\3\u0080\3\u0080\5\u0080\u0463\n"+
		"\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080"+
		"\u046c\n\u0080\3\u0080\5\u0080\u046f\n\u0080\3\u0081\3\u0081\3\u0081\3"+
		"\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u0479\n\u0081\3\u0082\3"+
		"\u0082\5\u0082\u047d\n\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3"+
		"\u0083\3\u0083\5\u0083\u0486\n\u0083\3\u0084\3\u0084\3\u0084\3\u0084\5"+
		"\u0084\u048c\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\7\u0085\u0493"+
		"\n\u0085\f\u0085\16\u0085\u0496\13\u0085\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\5\u0086\u049c\n\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u04a2\n"+
		"\u0086\5\u0086\u04a4\n\u0086\3\u0087\6\u0087\u04a7\n\u0087\r\u0087\16"+
		"\u0087\u04a8\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\6\u0089\u04b1"+
		"\n\u0089\r\u0089\16\u0089\u04b2\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u04bf\n\u008a\3\u008b"+
		"\3\u008b\3\u008b\7\u008b\u04c4\n\u008b\f\u008b\16\u008b\u04c7\13\u008b"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u04ce\n\u008c\3\u008d"+
		"\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u04d7\n\u008e"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u04de\n\u008f\3\u0090"+
		"\3\u0090\3\u0090\7\u0090\u04e3\n\u0090\f\u0090\16\u0090\u04e6\13\u0090"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u04ee\n\u0091"+
		"\3\u0092\3\u0092\3\u0092\5\u0092\u04f3\n\u0092\3\u0093\3\u0093\5\u0093"+
		"\u04f7\n\u0093\3\u0094\3\u0094\5\u0094\u04fb\n\u0094\3\u0095\3\u0095\5"+
		"\u0095\u04ff\n\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\5\u0097\u0506"+
		"\n\u0097\3\u0097\5\u0097\u0509\n\u0097\3\u0097\5\u0097\u050c\n\u0097\3"+
		"\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u009a\5\u009a\u0514\n\u009a\3"+
		"\u009a\3\u009a\3\u009b\3\u009b\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009e\3\u009e\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\2\7\34"+
		"&Lh\u00e4\u00a1\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118"+
		"\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130"+
		"\u0132\u0134\u0136\u0138\u013a\u013c\u013e\2\f\3\2\24\26\3\2\26\30\5\2"+
		"\25\30\33\33\36\37\6\2\24\30\33\33$$dd\4\2\24\24\26\26\4\2\25\26\33\33"+
		"\3\2\6\n\3\2&\60\3\2\63\64\3\2^_\2\u0535\2\u0141\3\2\2\2\4\u014c\3\2\2"+
		"\2\6\u014f\3\2\2\2\b\u0159\3\2\2\2\n\u015c\3\2\2\2\f\u0162\3\2\2\2\16"+
		"\u0165\3\2\2\2\20\u0171\3\2\2\2\22\u0178\3\2\2\2\24\u017a\3\2\2\2\26\u017d"+
		"\3\2\2\2\30\u0180\3\2\2\2\32\u0188\3\2\2\2\34\u018e\3\2\2\2\36\u019b\3"+
		"\2\2\2 \u019f\3\2\2\2\"\u01a1\3\2\2\2$\u01a5\3\2\2\2&\u01ad\3\2\2\2(\u01b7"+
		"\3\2\2\2*\u01b9\3\2\2\2,\u01c0\3\2\2\2.\u01d3\3\2\2\2\60\u01d6\3\2\2\2"+
		"\62\u01d9\3\2\2\2\64\u01e1\3\2\2\2\66\u01f7\3\2\2\28\u01fa\3\2\2\2:\u0205"+
		"\3\2\2\2<\u0209\3\2\2\2>\u020b\3\2\2\2@\u0218\3\2\2\2B\u021a\3\2\2\2D"+
		"\u0224\3\2\2\2F\u0226\3\2\2\2H\u022a\3\2\2\2J\u0237\3\2\2\2L\u0239\3\2"+
		"\2\2N\u0243\3\2\2\2P\u0245\3\2\2\2R\u024e\3\2\2\2T\u0251\3\2\2\2V\u025b"+
		"\3\2\2\2X\u025f\3\2\2\2Z\u0261\3\2\2\2\\\u0269\3\2\2\2^\u0270\3\2\2\2"+
		"`\u0276\3\2\2\2b\u0278\3\2\2\2d\u027c\3\2\2\2f\u027f\3\2\2\2h\u0286\3"+
		"\2\2\2j\u0290\3\2\2\2l\u0292\3\2\2\2n\u029b\3\2\2\2p\u02ac\3\2\2\2r\u02b0"+
		"\3\2\2\2t\u02b4\3\2\2\2v\u02b6\3\2\2\2x\u02b8\3\2\2\2z\u02bc\3\2\2\2|"+
		"\u02be\3\2\2\2~\u02c0\3\2\2\2\u0080\u02c2\3\2\2\2\u0082\u02c9\3\2\2\2"+
		"\u0084\u02d1\3\2\2\2\u0086\u02d3\3\2\2\2\u0088\u02d5\3\2\2\2\u008a\u02de"+
		"\3\2\2\2\u008c\u02e5\3\2\2\2\u008e\u02f1\3\2\2\2\u0090\u02f3\3\2\2\2\u0092"+
		"\u02f7\3\2\2\2\u0094\u02fb\3\2\2\2\u0096\u0306\3\2\2\2\u0098\u0308\3\2"+
		"\2\2\u009a\u030e\3\2\2\2\u009c\u0316\3\2\2\2\u009e\u031e\3\2\2\2\u00a0"+
		"\u0324\3\2\2\2\u00a2\u032e\3\2\2\2\u00a4\u0332\3\2\2\2\u00a6\u0335\3\2"+
		"\2\2\u00a8\u0341\3\2\2\2\u00aa\u0343\3\2\2\2\u00ac\u0349\3\2\2\2\u00ae"+
		"\u034f\3\2\2\2\u00b0\u0356\3\2\2\2\u00b2\u0366\3\2\2\2\u00b4\u0376\3\2"+
		"\2\2\u00b6\u0378\3\2\2\2\u00b8\u037a\3\2\2\2\u00ba\u0382\3\2\2\2\u00bc"+
		"\u0386\3\2\2\2\u00be\u038a\3\2\2\2\u00c0\u038e\3\2\2\2\u00c2\u0391\3\2"+
		"\2\2\u00c4\u03a2\3\2\2\2\u00c6\u03a4\3\2\2\2\u00c8\u03ac\3\2\2\2\u00ca"+
		"\u03b0\3\2\2\2\u00cc\u03b3\3\2\2\2\u00ce\u03b5\3\2\2\2\u00d0\u03b9\3\2"+
		"\2\2\u00d2\u03bb\3\2\2\2\u00d4\u03c3\3\2\2\2\u00d6\u03c5\3\2\2\2\u00d8"+
		"\u03ce\3\2\2\2\u00da\u03d0\3\2\2\2\u00dc\u03d8\3\2\2\2\u00de\u03e0\3\2"+
		"\2\2\u00e0\u03e2\3\2\2\2\u00e2\u03ea\3\2\2\2\u00e4\u03f2\3\2\2\2\u00e6"+
		"\u0400\3\2\2\2\u00e8\u0410\3\2\2\2\u00ea\u041c\3\2\2\2\u00ec\u0426\3\2"+
		"\2\2\u00ee\u043c\3\2\2\2\u00f0\u0445\3\2\2\2\u00f2\u0447\3\2\2\2\u00f4"+
		"\u044a\3\2\2\2\u00f6\u0453\3\2\2\2\u00f8\u0455\3\2\2\2\u00fa\u0458\3\2"+
		"\2\2\u00fc\u045d\3\2\2\2\u00fe\u046e\3\2\2\2\u0100\u0478\3\2\2\2\u0102"+
		"\u047c\3\2\2\2\u0104\u0485\3\2\2\2\u0106\u0487\3\2\2\2\u0108\u048f\3\2"+
		"\2\2\u010a\u04a3\3\2\2\2\u010c\u04a6\3\2\2\2\u010e\u04aa\3\2\2\2\u0110"+
		"\u04b0\3\2\2\2\u0112\u04be\3\2\2\2\u0114\u04c0\3\2\2\2\u0116\u04cd\3\2"+
		"\2\2\u0118\u04cf\3\2\2\2\u011a\u04d6\3\2\2\2\u011c\u04dd\3\2\2\2\u011e"+
		"\u04df\3\2\2\2\u0120\u04ed\3\2\2\2\u0122\u04f2\3\2\2\2\u0124\u04f4\3\2"+
		"\2\2\u0126\u04f8\3\2\2\2\u0128\u04fc\3\2\2\2\u012a\u0500\3\2\2\2\u012c"+
		"\u0502\3\2\2\2\u012e\u050d\3\2\2\2\u0130\u0510\3\2\2\2\u0132\u0513\3\2"+
		"\2\2\u0134\u0517\3\2\2\2\u0136\u0519\3\2\2\2\u0138\u051b\3\2\2\2\u013a"+
		"\u051f\3\2\2\2\u013c\u0521\3\2\2\2\u013e\u0523\3\2\2\2\u0140\u0142\5\4"+
		"\3\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0146\3\2\2\2\u0143"+
		"\u0145\5\6\4\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2"+
		"\2\2\u0146\u0147\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0149"+
		"\u014b\5\n\6\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\3\3\2\2\2"+
		"\u014c\u014d\7\16\2\2\u014d\u014e\5\u0114\u008b\2\u014e\5\3\2\2\2\u014f"+
		"\u0150\7\17\2\2\u0150\u0151\5\b\5\2\u0151\u0152\7N\2\2\u0152\7\3\2\2\2"+
		"\u0153\u015a\5\u0116\u008c\2\u0154\u0157\5\u0114\u008b\2\u0155\u0156\7"+
		"I\2\2\u0156\u0158\7\65\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u015a\3\2\2\2\u0159\u0153\3\2\2\2\u0159\u0154\3\2\2\2\u015a\t\3\2\2\2"+
		"\u015b\u015d\5\f\7\2\u015c\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015f\13\3\2\2\2\u0160\u0163\5\16\b\2\u0161"+
		"\u0163\5T+\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163\r\3\2\2\2\u0164"+
		"\u0166\5\20\t\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3"+
		"\2\2\2\u0167\u0168\7\23\2\2\u0168\u016a\7b\2\2\u0169\u016b\5\24\13\2\u016a"+
		"\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016e\5\26"+
		"\f\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0170\5\32\16\2\u0170\17\3\2\2\2\u0171\u0175\5\22\n\2\u0172\u0174\5\22"+
		"\n\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\21\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\t\2\2"+
		"\2\u0179\23\3\2\2\2\u017a\u017b\7\31\2\2\u017b\u017c\5|?\2\u017c\25\3"+
		"\2\2\2\u017d\u017e\7\32\2\2\u017e\u017f\5\30\r\2\u017f\27\3\2\2\2\u0180"+
		"\u0185\5~@\2\u0181\u0182\7O\2\2\u0182\u0184\5~@\2\u0183\u0181\3\2\2\2"+
		"\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\31"+
		"\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u018a\7E\2\2\u0189\u018b\5\34\17\2"+
		"\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d"+
		"\7F\2\2\u018d\33\3\2\2\2\u018e\u018f\b\17\1\2\u018f\u0190\5\36\20\2\u0190"+
		"\u0195\3\2\2\2\u0191\u0192\f\3\2\2\u0192\u0194\5\36\20\2\u0193\u0191\3"+
		"\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\35\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019c\5 \21\2\u0199\u019c\5\"\22"+
		"\2\u019a\u019c\5$\23\2\u019b\u0198\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019a"+
		"\3\2\2\2\u019c\37\3\2\2\2\u019d\u01a0\58\35\2\u019e\u01a0\5F$\2\u019f"+
		"\u019d\3\2\2\2\u019f\u019e\3\2\2\2\u01a0!\3\2\2\2\u01a1\u01a2\7\33\2\2"+
		"\u01a2\u01a3\5\u0080A\2\u01a3#\3\2\2\2\u01a4\u01a6\5&\24\2\u01a5\u01a4"+
		"\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\5*\26\2\u01a8"+
		"\u01aa\5\60\31\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3"+
		"\2\2\2\u01ab\u01ac\5\64\33\2\u01ac%\3\2\2\2\u01ad\u01ae\b\24\1\2\u01ae"+
		"\u01af\5(\25\2\u01af\u01b4\3\2\2\2\u01b0\u01b1\f\3\2\2\u01b1\u01b3\5("+
		"\25\2\u01b2\u01b0\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\'\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b8\t\3\2\2"+
		"\u01b8)\3\2\2\2\u01b9\u01ba\7b\2\2\u01ba\u01bc\7G\2\2\u01bb\u01bd\5,\27"+
		"\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf"+
		"\7H\2\2\u01bf+\3\2\2\2\u01c0\u01c3\5p9\2\u01c1\u01c2\7C\2\2\u01c2\u01c4"+
		"\7D\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"\u01d0\5B\"\2\u01c6\u01c7\7O\2\2\u01c7\u01ca\5p9\2\u01c8\u01c9\7C\2\2"+
		"\u01c9\u01cb\7D\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc"+
		"\3\2\2\2\u01cc\u01cd\5B\"\2\u01cd\u01cf\3\2\2\2\u01ce\u01c6\3\2\2\2\u01cf"+
		"\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1-\3\2\2\2"+
		"\u01d2\u01d0\3\2\2\2\u01d3\u01d4\5p9\2\u01d4\u01d5\5B\"\2\u01d5/\3\2\2"+
		"\2\u01d6\u01d7\7!\2\2\u01d7\u01d8\5\62\32\2\u01d8\61\3\2\2\2\u01d9\u01de"+
		"\5|?\2\u01da\u01db\7O\2\2\u01db\u01dd\5|?\2\u01dc\u01da\3\2\2\2\u01dd"+
		"\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\63\3\2\2"+
		"\2\u01e0\u01de\3\2\2\2\u01e1\u01e3\7E\2\2\u01e2\u01e4\5\66\34\2\u01e3"+
		"\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e7\5\u0082"+
		"B\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"\u01e9\7F\2\2\u01e9\65\3\2\2\2\u01ea\u01eb\7\34\2\2\u01eb\u01ed\7G\2\2"+
		"\u01ec\u01ee\5\u0108\u0085\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u01ef\3\2\2\2\u01ef\u01f8\7H\2\2\u01f0\u01f1\7\35\2\2\u01f1\u01f3\7G"+
		"\2\2\u01f2\u01f4\5\u0108\u0085\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2"+
		"\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\7H\2\2\u01f6\u01f8\7N\2\2\u01f7\u01ea"+
		"\3\2\2\2\u01f7\u01f0\3\2\2\2\u01f8\67\3\2\2\2\u01f9\u01fb\5:\36\2\u01fa"+
		"\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01ff\5p"+
		"9\2\u01fd\u01fe\7C\2\2\u01fe\u0200\7D\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200"+
		"\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\5> \2\u0202\u0203\7N\2\2\u0203"+
		"9\3\2\2\2\u0204\u0206\5<\37\2\u0205\u0204\3\2\2\2\u0206\u0207\3\2\2\2"+
		"\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208;\3\2\2\2\u0209\u020a\t"+
		"\4\2\2\u020a=\3\2\2\2\u020b\u0210\5@!\2\u020c\u020d\7O\2\2\u020d\u020f"+
		"\5@!\2\u020e\u020c\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211?\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0219\5B\"\2\u0214"+
		"\u0215\5B\"\2\u0215\u0216\7&\2\2\u0216\u0217\5D#\2\u0217\u0219\3\2\2\2"+
		"\u0218\u0213\3\2\2\2\u0218\u0214\3\2\2\2\u0219A\3\2\2\2\u021a\u021f\7"+
		"b\2\2\u021b\u021c\7C\2\2\u021c\u021e\7D\2\2\u021d\u021b\3\2\2\2\u021e"+
		"\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220C\3\2\2\2"+
		"\u0221\u021f\3\2\2\2\u0222\u0225\5\u00ceh\2\u0223\u0225\5l\67\2\u0224"+
		"\u0222\3\2\2\2\u0224\u0223\3\2\2\2\u0225E\3\2\2\2\u0226\u0227\5H%\2\u0227"+
		"\u0228\5R*\2\u0228G\3\2\2\2\u0229\u022b\5L\'\2\u022a\u0229\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\5J&\2\u022d\u022f\5P)\2"+
		"\u022e\u0230\5\60\31\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230I"+
		"\3\2\2\2\u0231\u0234\5p9\2\u0232\u0233\7C\2\2\u0233\u0235\7D\2\2\u0234"+
		"\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0238\7\""+
		"\2\2\u0237\u0231\3\2\2\2\u0237\u0236\3\2\2\2\u0238K\3\2\2\2\u0239\u023a"+
		"\b\'\1\2\u023a\u023b\5N(\2\u023b\u0240\3\2\2\2\u023c\u023d\f\3\2\2\u023d"+
		"\u023f\5N(\2\u023e\u023c\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2"+
		"\2\u0240\u0241\3\2\2\2\u0241M\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0244"+
		"\t\5\2\2\u0244O\3\2\2\2\u0245\u0246\7b\2\2\u0246\u0248\7G\2\2\u0247\u0249"+
		"\5,\27\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\u024b\7H\2\2\u024bQ\3\2\2\2\u024c\u024f\5\u0080A\2\u024d\u024f\3\2\2"+
		"\2\u024e\u024c\3\2\2\2\u024e\u024d\3\2\2\2\u024fS\3\2\2\2\u0250\u0252"+
		"\5V,\2\u0251\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0254\7%\2\2\u0254\u0256\7b\2\2\u0255\u0257\5Z.\2\u0256\u0255\3\2\2\2"+
		"\u0256\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\5\\/\2\u0259U\3\2"+
		"\2\2\u025a\u025c\5X-\2\u025b\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025b"+
		"\3\2\2\2\u025d\u025e\3\2\2\2\u025eW\3\2\2\2\u025f\u0260\t\6\2\2\u0260"+
		"Y\3\2\2\2\u0261\u0262\7\31\2\2\u0262\u0265\5~@\2\u0263\u0264\7O\2\2\u0264"+
		"\u0266\5~@\2\u0265\u0263\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0265\3\2\2"+
		"\2\u0267\u0268\3\2\2\2\u0268[\3\2\2\2\u0269\u026b\7E\2\2\u026a\u026c\5"+
		"^\60\2\u026b\u026a\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\3\2\2\2\u026d"+
		"\u026e\7F\2\2\u026e]\3\2\2\2\u026f\u0271\5`\61\2\u0270\u026f\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273_\3\2\2\2"+
		"\u0274\u0277\5b\62\2\u0275\u0277\5f\64\2\u0276\u0274\3\2\2\2\u0276\u0275"+
		"\3\2\2\2\u0277a\3\2\2\2\u0278\u0279\5d\63\2\u0279\u027a\5p9\2\u027a\u027b"+
		"\5@!\2\u027bc\3\2\2\2\u027c\u027d\t\7\2\2\u027de\3\2\2\2\u027e\u0280\5"+
		"h\65\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2\2\2\u0281"+
		"\u0282\5J&\2\u0282\u0284\5P)\2\u0283\u0285\5\60\31\2\u0284\u0283\3\2\2"+
		"\2\u0284\u0285\3\2\2\2\u0285g\3\2\2\2\u0286\u0287\b\65\1\2\u0287\u0288"+
		"\5j\66\2\u0288\u028d\3\2\2\2\u0289\u028a\f\3\2\2\u028a\u028c\5j\66\2\u028b"+
		"\u0289\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2"+
		"\2\2\u028ei\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0291\t\6\2\2\u0291k\3\2"+
		"\2\2\u0292\u0294\7E\2\2\u0293\u0295\5n8\2\u0294\u0293\3\2\2\2\u0294\u0295"+
		"\3\2\2\2\u0295\u0297\3\2\2\2\u0296\u0298\7O\2\2\u0297\u0296\3\2\2\2\u0297"+
		"\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\7F\2\2\u029am\3\2\2\2\u029b"+
		"\u02a0\5D#\2\u029c\u029d\7O\2\2\u029d\u029f\5D#\2\u029e\u029c\3\2\2\2"+
		"\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1o\3"+
		"\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02ad\5r:\2\u02a4\u02a9\5x=\2\u02a5\u02a6"+
		"\7C\2\2\u02a6\u02a8\7D\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9"+
		"\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2"+
		"\2\2\u02ac\u02a3\3\2\2\2\u02ac\u02a4\3\2\2\2\u02adq\3\2\2\2\u02ae\u02b1"+
		"\5t;\2\u02af\u02b1\7\f\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02af\3\2\2\2\u02b1"+
		"s\3\2\2\2\u02b2\u02b5\5v<\2\u02b3\u02b5\7\13\2\2\u02b4\u02b2\3\2\2\2\u02b4"+
		"\u02b3\3\2\2\2\u02b5u\3\2\2\2\u02b6\u02b7\t\b\2\2\u02b7w\3\2\2\2\u02b8"+
		"\u02b9\5z>\2\u02b9y\3\2\2\2\u02ba\u02bd\5|?\2\u02bb\u02bd\5~@\2\u02bc"+
		"\u02ba\3\2\2\2\u02bc\u02bb\3\2\2\2\u02bd{\3\2\2\2\u02be\u02bf\5\u0116"+
		"\u008c\2\u02bf}\3\2\2\2\u02c0\u02c1\5\u0116\u008c\2\u02c1\177\3\2\2\2"+
		"\u02c2\u02c4\7E\2\2\u02c3\u02c5\5\u0082B\2\u02c4\u02c3\3\2\2\2\u02c4\u02c5"+
		"\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\7F\2\2\u02c7\u0081\3\2\2\2\u02c8"+
		"\u02ca\5\u0084C\2\u02c9\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02c9"+
		"\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u0083\3\2\2\2\u02cd\u02ce\5\u0086D"+
		"\2\u02ce\u02cf\7N\2\2\u02cf\u02d2\3\2\2\2\u02d0\u02d2\5\u008aF\2\u02d1"+
		"\u02cd\3\2\2\2\u02d1\u02d0\3\2\2\2\u02d2\u0085\3\2\2\2\u02d3\u02d4\5\u0088"+
		"E\2\u02d4\u0087\3\2\2\2\u02d5\u02d6\5p9\2\u02d6\u02d7\5> \2\u02d7\u0089"+
		"\3\2\2\2\u02d8\u02df\5\u008eH\2\u02d9\u02df\5\u0090I\2\u02da\u02df\5\u0098"+
		"M\2\u02db\u02df\5\u009aN\2\u02dc\u02df\5\u00aaV\2\u02dd\u02df\5\u00b0"+
		"Y\2\u02de\u02d8\3\2\2\2\u02de\u02d9\3\2\2\2\u02de\u02da\3\2\2\2\u02de"+
		"\u02db\3\2\2\2\u02de\u02dc\3\2\2\2\u02de\u02dd\3\2\2\2\u02df\u008b\3\2"+
		"\2\2\u02e0\u02e6\5\u008eH\2\u02e1\u02e6\5\u0092J\2\u02e2\u02e6\5\u009c"+
		"O\2\u02e3\u02e6\5\u00acW\2\u02e4\u02e6\5\u00b2Z\2\u02e5\u02e0\3\2\2\2"+
		"\u02e5\u02e1\3\2\2\2\u02e5\u02e2\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5\u02e4"+
		"\3\2\2\2\u02e6\u008d\3\2\2\2\u02e7\u02f2\5\u0080A\2\u02e8\u02f2\5\u0094"+
		"K\2\u02e9\u02f2\5\u009eP\2\u02ea\u02f2\5\u00aeX\2\u02eb\u02f2\5\u00ba"+
		"^\2\u02ec\u02f2\5\u00bc_\2\u02ed\u02f2\5\u00be`\2\u02ee\u02f2\5\u00c2"+
		"b\2\u02ef\u02f2\5\u00c0a\2\u02f0\u02f2\5\u00c4c\2\u02f1\u02e7\3\2\2\2"+
		"\u02f1\u02e8\3\2\2\2\u02f1\u02e9\3\2\2\2\u02f1\u02ea\3\2\2\2\u02f1\u02eb"+
		"\3\2\2\2\u02f1\u02ec\3\2\2\2\u02f1\u02ed\3\2\2\2\u02f1\u02ee\3\2\2\2\u02f1"+
		"\u02ef\3\2\2\2\u02f1\u02f0\3\2\2\2\u02f2\u008f\3\2\2\2\u02f3\u02f4\7b"+
		"\2\2\u02f4\u02f5\7L\2\2\u02f5\u02f6\5\u008aF\2\u02f6\u0091\3\2\2\2\u02f7"+
		"\u02f8\7b\2\2\u02f8\u02f9\7L\2\2\u02f9\u02fa\5\u008cG\2\u02fa\u0093\3"+
		"\2\2\2\u02fb\u02fc\5\u0096L\2\u02fc\u0095\3\2\2\2\u02fd\u0307\5\u00d2"+
		"j\2\u02fe\u0307\5\u00f4{\2\u02ff\u0307\5\u00fa~\2\u0300\u0307\5\u00f2"+
		"z\2\u0301\u0307\5\u00f8}\2\u0302\u0303\5\u00fe\u0080\2\u0303\u0304\7N"+
		"\2\2\u0304\u0307\3\2\2\2\u0305\u0307\5\u0106\u0084\2\u0306\u02fd\3\2\2"+
		"\2\u0306\u02fe\3\2\2\2\u0306\u02ff\3\2\2\2\u0306\u0300\3\2\2\2\u0306\u0301"+
		"\3\2\2\2\u0306\u0302\3\2\2\2\u0306\u0305\3\2\2\2\u0307\u0097\3\2\2\2\u0308"+
		"\u0309\7P\2\2\u0309\u030a\7G\2\2\u030a\u030b\5\u00ceh\2\u030b\u030c\7"+
		"H\2\2\u030c\u030d\5\u008aF\2\u030d\u0099\3\2\2\2\u030e\u030f\7P\2\2\u030f"+
		"\u0310\7G\2\2\u0310\u0311\5\u00ceh\2\u0311\u0312\7H\2\2\u0312\u0313\5"+
		"\u008cG\2\u0313\u0314\7Q\2\2\u0314\u0315\5\u008aF\2\u0315\u009b\3\2\2"+
		"\2\u0316\u0317\7P\2\2\u0317\u0318\7G\2\2\u0318\u0319\5\u00ceh\2\u0319"+
		"\u031a\7H\2\2\u031a\u031b\5\u008cG\2\u031b\u031c\7Q\2\2\u031c\u031d\5"+
		"\u008cG\2\u031d\u009d\3\2\2\2\u031e\u031f\7T\2\2\u031f\u0320\7G\2\2\u0320"+
		"\u0321\5\u00ceh\2\u0321\u0322\7H\2\2\u0322\u0323\5\u00a0Q\2\u0323\u009f"+
		"\3\2\2\2\u0324\u0326\7E\2\2\u0325\u0327\5\u00a2R\2\u0326\u0325\3\2\2\2"+
		"\u0326\u0327\3\2\2\2\u0327\u0329\3\2\2\2\u0328\u032a\5\u00a6T\2\u0329"+
		"\u0328\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\7F"+
		"\2\2\u032c\u00a1\3\2\2\2\u032d\u032f\5\u00a4S\2\u032e\u032d\3\2\2\2\u032f"+
		"\u0330\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u00a3\3\2"+
		"\2\2\u0332\u0333\5\u00a6T\2\u0333\u0334\5\u0082B\2\u0334\u00a5\3\2\2\2"+
		"\u0335\u0336\5\u00a8U\2\u0336\u00a7\3\2\2\2\u0337\u0338\7R\2\2\u0338\u0339"+
		"\5\u00ccg\2\u0339\u033a\7L\2\2\u033a\u033c\3\2\2\2\u033b\u0337\3\2\2\2"+
		"\u033c\u033d\3\2\2\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0342"+
		"\3\2\2\2\u033f\u0340\7S\2\2\u0340\u0342\7L\2\2\u0341\u033b\3\2\2\2\u0341"+
		"\u033f\3\2\2\2\u0342\u00a9\3\2\2\2\u0343\u0344\7V\2\2\u0344\u0345\7G\2"+
		"\2\u0345\u0346\5\u00ceh\2\u0346\u0347\7H\2\2\u0347\u0348\5\u008aF\2\u0348"+
		"\u00ab\3\2\2\2\u0349\u034a\7V\2\2\u034a\u034b\7G\2\2\u034b\u034c\5\u00ce"+
		"h\2\u034c\u034d\7H\2\2\u034d\u034e\5\u008cG\2\u034e\u00ad\3\2\2\2\u034f"+
		"\u0350\7U\2\2\u0350\u0351\5\u008aF\2\u0351\u0352\7V\2\2\u0352\u0353\7"+
		"G\2\2\u0353\u0354\5\u00ceh\2\u0354\u0355\7H\2\2\u0355\u00af\3\2\2\2\u0356"+
		"\u0357\7W\2\2\u0357\u0359\7G\2\2\u0358\u035a\5\u00b4[\2\u0359\u0358\3"+
		"\2\2\2\u0359\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035d\7N\2\2\u035c"+
		"\u035e\5\u00ceh\2\u035d\u035c\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u035f"+
		"\3\2\2\2\u035f\u0361\7N\2\2\u0360\u0362\5\u00b6\\\2\u0361\u0360\3\2\2"+
		"\2\u0361\u0362\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0364\7H\2\2\u0364\u0365"+
		"\5\u008aF\2\u0365\u00b1\3\2\2\2\u0366\u0367\7W\2\2\u0367\u0369\7G\2\2"+
		"\u0368\u036a\5\u00b4[\2\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a"+
		"\u036c\3\2\2\2\u036b\u036d\5\u00ceh\2\u036c\u036b\3\2\2\2\u036c\u036d"+
		"\3\2\2\2\u036d\u036f\3\2\2\2\u036e\u0370\5\u00b6\\\2\u036f\u036e\3\2\2"+
		"\2\u036f\u0370\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0372\7H\2\2\u0372\u0373"+
		"\5\u008cG\2\u0373\u00b3\3\2\2\2\u0374\u0377\5\u00b8]\2\u0375\u0377\5\u0088"+
		"E\2\u0376\u0374\3\2\2\2\u0376\u0375\3\2\2\2\u0377\u00b5\3\2\2\2\u0378"+
		"\u0379\5\u0096L\2\u0379\u00b7\3\2\2\2\u037a\u037f\5\u0096L\2\u037b\u037c"+
		"\7O\2\2\u037c\u037e\5\u0096L\2\u037d\u037b\3\2\2\2\u037e\u0381\3\2\2\2"+
		"\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u00b9\3\2\2\2\u0381\u037f"+
		"\3\2\2\2\u0382\u0384\7X\2\2\u0383\u0385\7b\2\2\u0384\u0383\3\2\2\2\u0384"+
		"\u0385\3\2\2\2\u0385\u00bb\3\2\2\2\u0386\u0388\7Y\2\2\u0387\u0389\7b\2"+
		"\2\u0388\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u00bd\3\2\2\2\u038a\u038c"+
		"\7Z\2\2\u038b\u038d\5\u00ceh\2\u038c\u038b\3\2\2\2\u038c\u038d\3\2\2\2"+
		"\u038d\u00bf\3\2\2\2\u038e\u038f\7 \2\2\u038f\u0390\5\u00ceh\2\u0390\u00c1"+
		"\3\2\2\2\u0391\u0392\7d\2\2\u0392\u0393\7G\2\2\u0393\u0394\5\u00ceh\2"+
		"\u0394\u0395\7H\2\2\u0395\u0396\5\u0080A\2\u0396\u00c3\3\2\2\2\u0397\u0398"+
		"\7[\2\2\u0398\u0399\5\u0080A\2\u0399\u039a\5\u00c6d\2\u039a\u03a3\3\2"+
		"\2\2\u039b\u039c\7[\2\2\u039c\u039e\5\u0080A\2\u039d\u039f\5\u00c6d\2"+
		"\u039e\u039d\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1"+
		"\5\u00caf\2\u03a1\u03a3\3\2\2\2\u03a2\u0397\3\2\2\2\u03a2\u039b\3\2\2"+
		"\2\u03a3\u00c5\3\2\2\2\u03a4\u03a5\5\u00c8e\2\u03a5\u00c7\3\2\2\2\u03a6"+
		"\u03a7\7\\\2\2\u03a7\u03a8\7G\2\2\u03a8\u03a9\5.\30\2\u03a9\u03aa\7H\2"+
		"\2\u03aa\u03ab\5\u0080A\2\u03ab\u03ad\3\2\2\2\u03ac\u03a6\3\2\2\2\u03ad"+
		"\u03ae\3\2\2\2\u03ae\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u00c9\3\2"+
		"\2\2\u03b0\u03b1\7]\2\2\u03b1\u03b2\5\u0080A\2\u03b2\u00cb\3\2\2\2\u03b3"+
		"\u03b4\5\u00ceh\2\u03b4\u00cd\3\2\2\2\u03b5\u03b6\5\u00d0i\2\u03b6\u00cf"+
		"\3\2\2\2\u03b7\u03ba\5\u00d8m\2\u03b8\u03ba\5\u00d2j\2\u03b9\u03b7\3\2"+
		"\2\2\u03b9\u03b8\3\2\2\2\u03ba\u00d1\3\2\2\2\u03bb\u03bc\5\u00d4k\2\u03bc"+
		"\u03bd\5\u00d6l\2\u03bd\u03be\5\u00d0i\2\u03be\u03bf\7N\2\2\u03bf\u00d3"+
		"\3\2\2\2\u03c0\u03c4\5\u011a\u008e\2\u03c1\u03c4\5\u0100\u0081\2\u03c2"+
		"\u03c4\5\u0112\u008a\2\u03c3\u03c0\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c3\u03c2"+
		"\3\2\2\2\u03c4\u00d5\3\2\2\2\u03c5\u03c6\t\t\2\2\u03c6\u00d7\3\2\2\2\u03c7"+
		"\u03cf\5\u00dan\2\u03c8\u03c9\5\u00dan\2\u03c9\u03ca\7J\2\2\u03ca\u03cb"+
		"\5\u00ceh\2\u03cb\u03cc\7L\2\2\u03cc\u03cd\5\u00d8m\2\u03cd\u03cf\3\2"+
		"\2\2\u03ce\u03c7\3\2\2\2\u03ce\u03c8\3\2\2\2\u03cf\u00d9\3\2\2\2\u03d0"+
		"\u03d5\5\u00dco\2\u03d1\u03d2\7\67\2\2\u03d2\u03d4\5\u00dco\2\u03d3\u03d1"+
		"\3\2\2\2\u03d4\u03d7\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6"+
		"\u00db\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d8\u03dd\5\u00dep\2\u03d9\u03da"+
		"\78\2\2\u03da\u03dc\5\u00dep\2\u03db\u03d9\3\2\2\2\u03dc\u03df\3\2\2\2"+
		"\u03dd\u03db\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u00dd\3\2\2\2\u03df\u03dd"+
		"\3\2\2\2\u03e0\u03e1\5\u00e0q\2\u03e1\u00df\3\2\2\2\u03e2\u03e7\5\u00e2"+
		"r\2\u03e3\u03e4\7@\2\2\u03e4\u03e6\5\u00e2r\2\u03e5\u03e3\3\2\2\2\u03e6"+
		"\u03e9\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u00e1\3\2"+
		"\2\2\u03e9\u03e7\3\2\2\2\u03ea\u03ef\5\u00e4s\2\u03eb\u03ec\7>\2\2\u03ec"+
		"\u03ee\5\u00e4s\2\u03ed\u03eb\3\2\2\2\u03ee\u03f1\3\2\2\2\u03ef\u03ed"+
		"\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u00e3\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f2"+
		"\u03f3\bs\1\2\u03f3\u03f4\5\u00e6t\2\u03f4\u03fd\3\2\2\2\u03f5\u03f6\f"+
		"\4\2\2\u03f6\u03f7\79\2\2\u03f7\u03fc\5\u00e6t\2\u03f8\u03f9\f\3\2\2\u03f9"+
		"\u03fa\7e\2\2\u03fa\u03fc\5\u00e6t\2\u03fb\u03f5\3\2\2\2\u03fb\u03f8\3"+
		"\2\2\2\u03fc\u03ff\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe"+
		"\u00e5\3\2\2\2\u03ff\u03fd\3\2\2\2\u0400\u040d\5\u00e8u\2\u0401\u0402"+
		"\7<\2\2\u0402\u040c\5\u00e8u\2\u0403\u0404\7=\2\2\u0404\u040c\5\u00e8"+
		"u\2\u0405\u0406\7;\2\2\u0406\u040c\5\u00e8u\2\u0407\u0408\7:\2\2\u0408"+
		"\u040c\5\u00e8u\2\u0409\u040a\7\21\2\2\u040a\u040c\5x=\2\u040b\u0401\3"+
		"\2\2\2\u040b\u0403\3\2\2\2\u040b\u0405\3\2\2\2\u040b\u0407\3\2\2\2\u040b"+
		"\u0409\3\2\2\2\u040c\u040f\3\2\2\2\u040d\u040b\3\2\2\2\u040d\u040e\3\2"+
		"\2\2\u040e\u00e7\3\2\2\2\u040f\u040d\3\2\2\2\u0410\u0419\5\u00eav\2\u0411"+
		"\u0412\7B\2\2\u0412\u0418\5\u00eav\2\u0413\u0414\7A\2\2\u0414\u0418\5"+
		"\u00eav\2\u0415\u0416\7f\2\2\u0416\u0418\5\u00eav\2\u0417\u0411\3\2\2"+
		"\2\u0417\u0413\3\2\2\2\u0417\u0415\3\2\2\2\u0418\u041b\3\2\2\2\u0419\u0417"+
		"\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u00e9\3\2\2\2\u041b\u0419\3\2\2\2\u041c"+
		"\u0423\5\u00ecw\2\u041d\u041e\7\63\2\2\u041e\u0422\5\u00ecw\2\u041f\u0420"+
		"\7\64\2\2\u0420\u0422\5\u00ecw\2\u0421\u041d\3\2\2\2\u0421\u041f\3\2\2"+
		"\2\u0422\u0425\3\2\2\2\u0423\u0421\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u00eb"+
		"\3\2\2\2\u0425\u0423\3\2\2\2\u0426\u042f\5\u00f0y\2\u0427\u0428\7\65\2"+
		"\2\u0428\u042e\5\u00f0y\2\u0429\u042a\7\66\2\2\u042a\u042e\5\u00f0y\2"+
		"\u042b\u042c\7g\2\2\u042c\u042e\5\u00f0y\2\u042d\u0427\3\2\2\2\u042d\u0429"+
		"\3\2\2\2\u042d\u042b\3\2\2\2\u042e\u0431\3\2\2\2\u042f\u042d\3\2\2\2\u042f"+
		"\u0430\3\2\2\2\u0430\u00ed\3\2\2\2\u0431\u042f\3\2\2\2\u0432\u0433\7G"+
		"\2\2\u0433\u0434\5r:\2\u0434\u0435\7H\2\2\u0435\u0436\5\u00f0y\2\u0436"+
		"\u043d\3\2\2\2\u0437\u0438\7G\2\2\u0438\u0439\5x=\2\u0439\u043a\7H\2\2"+
		"\u043a\u043b\5\u00f6|\2\u043b\u043d\3\2\2\2\u043c\u0432\3\2\2\2\u043c"+
		"\u0437\3\2\2\2\u043d\u00ef\3\2\2\2\u043e\u0446\5\u00f4{\2\u043f\u0446"+
		"\5\u00f2z\2\u0440\u0441\7\63\2\2\u0441\u0446\5\u00f0y\2\u0442\u0443\7"+
		"\64\2\2\u0443\u0446\5\u00f0y\2\u0444\u0446\5\u00f6|\2\u0445\u043e\3\2"+
		"\2\2\u0445\u043f\3\2\2\2\u0445\u0440\3\2\2\2\u0445\u0442\3\2\2\2\u0445"+
		"\u0444\3\2\2\2\u0446\u00f1\3\2\2\2\u0447\u0448\7\62\2\2\u0448\u0449\5"+
		"\u00f0y\2\u0449\u00f3\3\2\2\2\u044a\u044b\7\61\2\2\u044b\u044c\5\u00f0"+
		"y\2\u044c\u00f5\3\2\2\2\u044d\u0454\5\u00fc\177\2\u044e\u044f\7h\2\2\u044f"+
		"\u0454\5\u00f0y\2\u0450\u0451\7K\2\2\u0451\u0454\5\u00f0y\2\u0452\u0454"+
		"\5\u00eex\2\u0453\u044d\3\2\2\2\u0453\u044e\3\2\2\2\u0453\u0450\3\2\2"+
		"\2\u0453\u0452\3\2\2\2\u0454\u00f7\3\2\2\2\u0455\u0456\5\u00fc\177\2\u0456"+
		"\u0457\7\62\2\2\u0457\u00f9\3\2\2\2\u0458\u0459\5\u00fc\177\2\u0459\u045a"+
		"\7\61\2\2\u045a\u00fb\3\2\2\2\u045b\u045e\5\u0102\u0082\2\u045c\u045e"+
		"\5\u011a\u008e\2\u045d\u045b\3\2\2\2\u045d\u045c\3\2\2\2\u045e\u00fd\3"+
		"\2\2\2\u045f\u0460\5\u011c\u008f\2\u0460\u0462\7G\2\2\u0461\u0463\5\u0108"+
		"\u0085\2\u0462\u0461\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0464\3\2\2\2\u0464"+
		"\u0465\7H\2\2\u0465\u046f\3\2\2\2\u0466\u0467\7\35\2\2\u0467\u0468\7I"+
		"\2\2\u0468\u0469\7b\2\2\u0469\u046b\7G\2\2\u046a\u046c\5\u0108\u0085\2"+
		"\u046b\u046a\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046f"+
		"\7H\2\2\u046e\u045f\3\2\2\2\u046e\u0466\3\2\2\2\u046f\u00ff\3\2\2\2\u0470"+
		"\u0471\5\u0102\u0082\2\u0471\u0472\7I\2\2\u0472\u0473\7b\2\2\u0473\u0479"+
		"\3\2\2\2\u0474\u0475\5\24\13\2\u0475\u0476\7I\2\2\u0476\u0477\7b\2\2\u0477"+
		"\u0479\3\2\2\2\u0478\u0470\3\2\2\2\u0478\u0474\3\2\2\2\u0479\u0101\3\2"+
		"\2\2\u047a\u047d\5\u0104\u0083\2\u047b\u047d\5\u010a\u0086\2\u047c\u047a"+
		"\3\2\2\2\u047c\u047b\3\2\2\2\u047d\u0103\3\2\2\2\u047e\u0486\5\u0120\u0091"+
		"\2\u047f\u0486\7\34\2\2\u0480\u0481\7G\2\2\u0481\u0482\5\u00ceh\2\u0482"+
		"\u0483\7H\2\2\u0483\u0486\3\2\2\2\u0484\u0486\5\u0106\u0084\2\u0485\u047e"+
		"\3\2\2\2\u0485\u047f\3\2\2\2\u0485\u0480\3\2\2\2\u0485\u0484\3\2\2\2\u0486"+
		"\u0105\3\2\2\2\u0487\u0488\7\r\2\2\u0488\u0489\5|?\2\u0489\u048b\7G\2"+
		"\2\u048a\u048c\5\u0108\u0085\2\u048b\u048a\3\2\2\2\u048b\u048c\3\2\2\2"+
		"\u048c\u048d\3\2\2\2\u048d\u048e\7H\2\2\u048e\u0107\3\2\2\2\u048f\u0494"+
		"\5\u00ceh\2\u0490\u0491\7O\2\2\u0491\u0493\5\u00ceh\2\u0492\u0490\3\2"+
		"\2\2\u0493\u0496\3\2\2\2\u0494\u0492\3\2\2\2\u0494\u0495\3\2\2\2\u0495"+
		"\u0109\3\2\2\2\u0496\u0494\3\2\2\2\u0497\u0498\7\r\2\2\u0498\u0499\5r"+
		":\2\u0499\u049b\5\u010c\u0087\2\u049a\u049c\5\u0110\u0089\2\u049b\u049a"+
		"\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u04a4\3\2\2\2\u049d\u049e\7\r\2\2\u049e"+
		"\u049f\5z>\2\u049f\u04a1\5\u010c\u0087\2\u04a0\u04a2\5\u0110\u0089\2\u04a1"+
		"\u04a0\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a4\3\2\2\2\u04a3\u0497\3\2"+
		"\2\2\u04a3\u049d\3\2\2\2\u04a4\u010b\3\2\2\2\u04a5\u04a7\5\u010e\u0088"+
		"\2\u04a6\u04a5\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a8\u04a9"+
		"\3\2\2\2\u04a9\u010d\3\2\2\2\u04aa\u04ab\7C\2\2\u04ab\u04ac\5\u00ceh\2"+
		"\u04ac\u04ad\7D\2\2\u04ad\u010f\3\2\2\2\u04ae\u04af\7C\2\2\u04af\u04b1"+
		"\7D\2\2\u04b0\u04ae\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b2"+
		"\u04b3\3\2\2\2\u04b3\u0111\3\2\2\2\u04b4\u04b5\5\u011a\u008e\2\u04b5\u04b6"+
		"\7C\2\2\u04b6\u04b7\5\u00ceh\2\u04b7\u04b8\7D\2\2\u04b8\u04bf\3\2\2\2"+
		"\u04b9\u04ba\5\u0104\u0083\2\u04ba\u04bb\7C\2\2\u04bb\u04bc\5\u00ceh\2"+
		"\u04bc\u04bd\7D\2\2\u04bd\u04bf\3\2\2\2\u04be\u04b4\3\2\2\2\u04be\u04b9"+
		"\3\2\2\2\u04bf\u0113\3\2\2\2\u04c0\u04c5\7b\2\2\u04c1\u04c2\7I\2\2\u04c2"+
		"\u04c4\7b\2\2\u04c3\u04c1\3\2\2\2\u04c4\u04c7\3\2\2\2\u04c5\u04c3\3\2"+
		"\2\2\u04c5\u04c6\3\2\2\2\u04c6\u0115\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c8"+
		"\u04ce\7b\2\2\u04c9\u04ca\5\u0114\u008b\2\u04ca\u04cb\7I\2\2\u04cb\u04cc"+
		"\7b\2\2\u04cc\u04ce\3\2\2\2\u04cd\u04c8\3\2\2\2\u04cd\u04c9\3\2\2\2\u04ce"+
		"\u0117\3\2\2\2\u04cf\u04d0\7b\2\2\u04d0\u0119\3\2\2\2\u04d1\u04d7\7b\2"+
		"\2\u04d2\u04d3\5\u011e\u0090\2\u04d3\u04d4\7I\2\2\u04d4\u04d5\7b\2\2\u04d5"+
		"\u04d7\3\2\2\2\u04d6\u04d1\3\2\2\2\u04d6\u04d2\3\2\2\2\u04d7\u011b\3\2"+
		"\2\2\u04d8\u04de\7b\2\2\u04d9\u04da\5\u011e\u0090\2\u04da\u04db\7I\2\2"+
		"\u04db\u04dc\7b\2\2\u04dc\u04de\3\2\2\2\u04dd\u04d8\3\2\2\2\u04dd\u04d9"+
		"\3\2\2\2\u04de\u011d\3\2\2\2\u04df\u04e4\7b\2\2\u04e0\u04e1\7I\2\2\u04e1"+
		"\u04e3\7b\2\2\u04e2\u04e0\3\2\2\2\u04e3\u04e6\3\2\2\2\u04e4\u04e2\3\2"+
		"\2\2\u04e4\u04e5\3\2\2\2\u04e5\u011f\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e7"+
		"\u04ee\5\u0122\u0092\2\u04e8\u04ee\5\u012c\u0097\2\u04e9\u04ee\5\u013c"+
		"\u009f\2\u04ea\u04ee\5\u0138\u009d\2\u04eb\u04ee\5\u013a\u009e\2\u04ec"+
		"\u04ee\5\u013e\u00a0\2\u04ed\u04e7\3\2\2\2\u04ed\u04e8\3\2\2\2\u04ed\u04e9"+
		"\3\2\2\2\u04ed\u04ea\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ed\u04ec\3\2\2\2\u04ee"+
		"\u0121\3\2\2\2\u04ef\u04f3\5\u0124\u0093\2\u04f0\u04f3\5\u0126\u0094\2"+
		"\u04f1\u04f3\5\u0128\u0095\2\u04f2\u04ef\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f2"+
		"\u04f1\3\2\2\2\u04f3\u0123\3\2\2\2\u04f4\u04f6\7\5\2\2\u04f5\u04f7\7i"+
		"\2\2\u04f6\u04f5\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u0125\3\2\2\2\u04f8"+
		"\u04fa\7j\2\2\u04f9\u04fb\7i\2\2\u04fa\u04f9\3\2\2\2\u04fa\u04fb\3\2\2"+
		"\2\u04fb\u0127\3\2\2\2\u04fc\u04fe\7k\2\2\u04fd\u04ff\7i\2\2\u04fe\u04fd"+
		"\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0129\3\2\2\2\u0500\u0501\7\5\2\2\u0501"+
		"\u012b\3\2\2\2\u0502\u0503\5\u012a\u0096\2\u0503\u0505\7I\2\2\u0504\u0506"+
		"\5\u012a\u0096\2\u0505\u0504\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0508\3"+
		"\2\2\2\u0507\u0509\5\u012e\u0098\2\u0508\u0507\3\2\2\2\u0508\u0509\3\2"+
		"\2\2\u0509\u050b\3\2\2\2\u050a\u050c\5\u0136\u009c\2\u050b\u050a\3\2\2"+
		"\2\u050b\u050c\3\2\2\2\u050c\u012d\3\2\2\2\u050d\u050e\5\u0130\u0099\2"+
		"\u050e\u050f\5\u0132\u009a\2\u050f\u012f\3\2\2\2\u0510\u0511\7l\2\2\u0511"+
		"\u0131\3\2\2\2\u0512\u0514\5\u0134\u009b\2\u0513\u0512\3\2\2\2\u0513\u0514"+
		"\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0516\5\u012a\u0096\2\u0516\u0133\3"+
		"\2\2\2\u0517\u0518\t\n\2\2\u0518\u0135\3\2\2\2\u0519\u051a\7m\2\2\u051a"+
		"\u0137\3\2\2\2\u051b\u051c\7n\2\2\u051c\u051d\7o\2\2\u051d\u051e\7n\2"+
		"\2\u051e\u0139\3\2\2\2\u051f\u0520\7b\2\2\u0520\u013b\3\2\2\2\u0521\u0522"+
		"\t\13\2\2\u0522\u013d\3\2\2\2\u0523\u0524\7`\2\2\u0524\u013f\3\2\2\2\u008a"+
		"\u0141\u0146\u014a\u0157\u0159\u015e\u0162\u0165\u016a\u016d\u0175\u0185"+
		"\u018a\u0195\u019b\u019f\u01a5\u01a9\u01b4\u01bc\u01c3\u01ca\u01d0\u01de"+
		"\u01e3\u01e6\u01ed\u01f3\u01f7\u01fa\u01ff\u0207\u0210\u0218\u021f\u0224"+
		"\u022a\u022f\u0234\u0237\u0240\u0248\u024e\u0251\u0256\u025d\u0267\u026b"+
		"\u0272\u0276\u027f\u0284\u028d\u0294\u0297\u02a0\u02a9\u02ac\u02b0\u02b4"+
		"\u02bc\u02c4\u02cb\u02d1\u02de\u02e5\u02f1\u0306\u0326\u0329\u0330\u033d"+
		"\u0341\u0359\u035d\u0361\u0369\u036c\u036f\u0376\u037f\u0384\u0388\u038c"+
		"\u039e\u03a2\u03ae\u03b9\u03c3\u03ce\u03d5\u03dd\u03e7\u03ef\u03fb\u03fd"+
		"\u040b\u040d\u0417\u0419\u0421\u0423\u042d\u042f\u043c\u0445\u0453\u045d"+
		"\u0462\u046b\u046e\u0478\u047c\u0485\u048b\u0494\u049b\u04a1\u04a3\u04a8"+
		"\u04b2\u04be\u04c5\u04cd\u04d6\u04dd\u04e4\u04ed\u04f2\u04f6\u04fa\u04fe"+
		"\u0505\u0508\u050b\u0513";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}