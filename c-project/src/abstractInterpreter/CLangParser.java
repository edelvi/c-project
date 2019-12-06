// Generated from C:/Users/Aice/IdeaProjects/c-project/src\CLang.g4 by ANTLR 4.7.2
package abstractInterpreter;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, WHILE=38, 
		IF=39, ELSE=40, FOR=41, CONST=42, PRINTF=43, SCANF=44, INT_CONSTANT=45, 
		CHAR_CONSTANT=46, STRING_LITERAL=47, FLOAT_CONSTANT=48, TYPE=49, INCLUDE=50, 
		FLAGS=51, WIDTH=52, PRECI=53, INT=54, FLOAT=55, VOID=56, DOUBLE=57, CHAR=58, 
		SHORT=59, LONG=60, BREAK=61, CONTINUE=62, INC_OPERATOR=63, DEC_OPERATOR=64, 
		ID=65, PATH=66, LINE_COMMENT=67, MULTILINE_COMMENT=68, WS=69;
	public static final int
		RULE_program = 0, RULE_include = 1, RULE_definition = 2, RULE_declaration = 3, 
		RULE_varWithExpDeclaration = 4, RULE_varWithoutExpDeclaration = 5, RULE_functionDeclaration = 6, 
		RULE_functionDefinition = 7, RULE_parameterList = 8, RULE_parameterDeclaration = 9, 
		RULE_typeList = 10, RULE_statement = 11, RULE_compoundStatement = 12, 
		RULE_returnStatement = 13, RULE_breakStatement = 14, RULE_printfStatement = 15, 
		RULE_scanfStatement = 16, RULE_argumentScanf = 17, RULE_expressionList = 18, 
		RULE_expression = 19, RULE_constant = 20, RULE_functionCall = 21, RULE_assignmentExpression = 22, 
		RULE_unaryExpression = 23, RULE_arrayIndexExpression = 24, RULE_assignmentOperator = 25, 
		RULE_conditionalExpression = 26, RULE_ifStatement = 27, RULE_whileStatement = 28, 
		RULE_forStatement = 29, RULE_unaryOperator = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "include", "definition", "declaration", "varWithExpDeclaration", 
			"varWithoutExpDeclaration", "functionDeclaration", "functionDefinition", 
			"parameterList", "parameterDeclaration", "typeList", "statement", "compoundStatement", 
			"returnStatement", "breakStatement", "printfStatement", "scanfStatement", 
			"argumentScanf", "expressionList", "expression", "constant", "functionCall", 
			"assignmentExpression", "unaryExpression", "arrayIndexExpression", "assignmentOperator", 
			"conditionalExpression", "ifStatement", "whileStatement", "forStatement", 
			"unaryOperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'<'", "'>'", "','", "';'", "'['", "']'", "'='", "'('", 
			"')'", "'{'", "'}'", "'return'", "'&'", "'*'", "'/'", "'%'", "'+'", "'-'", 
			"'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'*='", "'/='", "'%='", 
			"'+='", "'-='", "'&='", "'^='", "'|='", "'?'", "':'", "'~'", "'!'", "'while'", 
			"'if'", "'else'", "'for'", "'const'", "'printf'", "'scanf'", null, null, 
			null, null, null, "'#include'", null, null, null, "'int'", "'float'", 
			"'void'", "'double'", "'char'", "'short'", "'long'", "'break'", "'continue'", 
			"'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "WHILE", "IF", "ELSE", "FOR", "CONST", "PRINTF", "SCANF", 
			"INT_CONSTANT", "CHAR_CONSTANT", "STRING_LITERAL", "FLOAT_CONSTANT", 
			"TYPE", "INCLUDE", "FLAGS", "WIDTH", "PRECI", "INT", "FLOAT", "VOID", 
			"DOUBLE", "CHAR", "SHORT", "LONG", "BREAK", "CONTINUE", "INC_OPERATOR", 
			"DEC_OPERATOR", "ID", "PATH", "LINE_COMMENT", "MULTILINE_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "CLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUDE) {
				{
				{
				setState(62);
				include();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				definition();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TYPE || _la==VOID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(CLangParser.INCLUDE, 0); }
		public TerminalNode ID() { return getToken(CLangParser.ID, 0); }
		public TerminalNode PATH() { return getToken(CLangParser.PATH, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_include);
		int _la;
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(INCLUDE);
				setState(74);
				match(T__0);
				setState(75);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==PATH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(76);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(INCLUDE);
				setState(78);
				match(T__1);
				setState(79);
				match(PATH);
				setState(80);
				match(T__2);
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

	public static class DefinitionContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				declaration();
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclarationContext extends DeclarationContext {
		public TerminalNode TYPE() { return getToken(CLangParser.TYPE, 0); }
		public List<VarWithExpDeclarationContext> varWithExpDeclaration() {
			return getRuleContexts(VarWithExpDeclarationContext.class);
		}
		public VarWithExpDeclarationContext varWithExpDeclaration(int i) {
			return getRuleContext(VarWithExpDeclarationContext.class,i);
		}
		public List<VarWithoutExpDeclarationContext> varWithoutExpDeclaration() {
			return getRuleContexts(VarWithoutExpDeclarationContext.class);
		}
		public VarWithoutExpDeclarationContext varWithoutExpDeclaration(int i) {
			return getRuleContext(VarWithoutExpDeclarationContext.class,i);
		}
		public VarDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDeclarationContext extends DeclarationContext {
		public TerminalNode TYPE() { return getToken(CLangParser.TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(CLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CLangParser.ID, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new VarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(TYPE);
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(89);
					varWithExpDeclaration();
					}
					break;
				case 2:
					{
					setState(90);
					varWithoutExpDeclaration();
					}
					break;
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(93);
					match(T__3);
					setState(96);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(94);
						varWithoutExpDeclaration();
						}
						break;
					case 2:
						{
						setState(95);
						varWithExpDeclaration();
						}
						break;
					}
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				match(T__4);
				}
				break;
			case 2:
				_localctx = new ArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(TYPE);
				setState(106);
				match(ID);
				setState(107);
				match(T__5);
				setState(108);
				expression(0);
				setState(109);
				match(T__6);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(110);
					match(T__3);
					setState(111);
					match(ID);
					setState(112);
					match(T__5);
					setState(113);
					expression(0);
					setState(114);
					match(T__6);
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				match(T__4);
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

	public static class VarWithExpDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CLangParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarWithExpDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varWithExpDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitVarWithExpDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarWithExpDeclarationContext varWithExpDeclaration() throws RecognitionException {
		VarWithExpDeclarationContext _localctx = new VarWithExpDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varWithExpDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(ID);
			setState(126);
			match(T__7);
			setState(127);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarWithoutExpDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CLangParser.ID, 0); }
		public VarWithoutExpDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varWithoutExpDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitVarWithoutExpDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarWithoutExpDeclarationContext varWithoutExpDeclaration() throws RecognitionException {
		VarWithoutExpDeclarationContext _localctx = new VarWithoutExpDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varWithoutExpDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CLangParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(CLangParser.TYPE, 0); }
		public TerminalNode VOID() { return getToken(CLangParser.VOID, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==VOID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(132);
			match(ID);
			setState(133);
			match(T__8);
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(134);
				parameterList();
				}
				break;
			case 2:
				{
				setState(135);
				typeList();
				}
				break;
			}
			setState(138);
			match(T__9);
			setState(139);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CLangParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(CLangParser.TYPE, 0); }
		public TerminalNode VOID() { return getToken(CLangParser.VOID, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==VOID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(142);
			match(ID);
			setState(143);
			match(T__8);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(144);
				parameterList();
				}
			}

			setState(147);
			match(T__9);
			setState(148);
			match(T__10);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (T__8 - 9)) | (1L << (T__10 - 9)) | (1L << (T__12 - 9)) | (1L << (T__17 - 9)) | (1L << (T__18 - 9)) | (1L << (T__35 - 9)) | (1L << (T__36 - 9)) | (1L << (WHILE - 9)) | (1L << (IF - 9)) | (1L << (FOR - 9)) | (1L << (PRINTF - 9)) | (1L << (SCANF - 9)) | (1L << (INT_CONSTANT - 9)) | (1L << (CHAR_CONSTANT - 9)) | (1L << (STRING_LITERAL - 9)) | (1L << (FLOAT_CONSTANT - 9)) | (1L << (TYPE - 9)) | (1L << (BREAK - 9)) | (1L << (CONTINUE - 9)) | (1L << (INC_OPERATOR - 9)) | (1L << (DEC_OPERATOR - 9)) | (1L << (ID - 9)))) != 0)) {
				{
				{
				setState(149);
				statement();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			parameterDeclaration();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(158);
				match(T__3);
				setState(159);
				parameterDeclaration();
				}
				}
				setState(164);
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

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(CLangParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(CLangParser.ID, 0); }
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(TYPE);
			setState(166);
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

	public static class TypeListContext extends ParserRuleContext {
		public List<TerminalNode> TYPE() { return getTokens(CLangParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(CLangParser.TYPE, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(TYPE);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(169);
				match(T__3);
				setState(170);
				match(TYPE);
				}
				}
				setState(175);
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

	public static class StatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public PrintfStatementContext printfStatement() {
			return getRuleContext(PrintfStatementContext.class,0);
		}
		public ScanfStatementContext scanfStatement() {
			return getRuleContext(ScanfStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				compoundStatement();
				}
				break;
			case T__8:
			case T__17:
			case T__18:
			case T__35:
			case T__36:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
			case STRING_LITERAL:
			case FLOAT_CONSTANT:
			case INC_OPERATOR:
			case DEC_OPERATOR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				expression(0);
				setState(178);
				match(T__4);
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				declaration();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				whileStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				forStatement();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				returnStatement();
				setState(185);
				match(T__4);
				}
				break;
			case BREAK:
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(187);
				breakStatement();
				setState(188);
				match(T__4);
				}
				break;
			case PRINTF:
				enterOuterAlt(_localctx, 9);
				{
				setState(190);
				printfStatement();
				setState(191);
				match(T__4);
				}
				break;
			case SCANF:
				enterOuterAlt(_localctx, 10);
				{
				setState(193);
				scanfStatement();
				setState(194);
				match(T__4);
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_compoundStatement);
		int _la;
		try {
			int _alt;
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(T__10);
				setState(199);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(T__10);
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(201);
					statement();
					}
					}
					setState(204); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (T__8 - 9)) | (1L << (T__10 - 9)) | (1L << (T__12 - 9)) | (1L << (T__17 - 9)) | (1L << (T__18 - 9)) | (1L << (T__35 - 9)) | (1L << (T__36 - 9)) | (1L << (WHILE - 9)) | (1L << (IF - 9)) | (1L << (FOR - 9)) | (1L << (PRINTF - 9)) | (1L << (SCANF - 9)) | (1L << (INT_CONSTANT - 9)) | (1L << (CHAR_CONSTANT - 9)) | (1L << (STRING_LITERAL - 9)) | (1L << (FLOAT_CONSTANT - 9)) | (1L << (TYPE - 9)) | (1L << (BREAK - 9)) | (1L << (CONTINUE - 9)) | (1L << (INC_OPERATOR - 9)) | (1L << (DEC_OPERATOR - 9)) | (1L << (ID - 9)))) != 0) );
				setState(206);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(T__10);
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(209);
					declaration();
					}
					}
					setState(212); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TYPE );
				setState(214);
				match(T__11);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				match(T__10);
				setState(218); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(217);
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(220); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(222);
					statement();
					}
					}
					setState(225); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (T__8 - 9)) | (1L << (T__10 - 9)) | (1L << (T__12 - 9)) | (1L << (T__17 - 9)) | (1L << (T__18 - 9)) | (1L << (T__35 - 9)) | (1L << (T__36 - 9)) | (1L << (WHILE - 9)) | (1L << (IF - 9)) | (1L << (FOR - 9)) | (1L << (PRINTF - 9)) | (1L << (SCANF - 9)) | (1L << (INT_CONSTANT - 9)) | (1L << (CHAR_CONSTANT - 9)) | (1L << (STRING_LITERAL - 9)) | (1L << (FLOAT_CONSTANT - 9)) | (1L << (TYPE - 9)) | (1L << (BREAK - 9)) | (1L << (CONTINUE - 9)) | (1L << (INC_OPERATOR - 9)) | (1L << (DEC_OPERATOR - 9)) | (1L << (ID - 9)))) != 0) );
				setState(227);
				match(T__11);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__12);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (T__8 - 9)) | (1L << (T__17 - 9)) | (1L << (T__18 - 9)) | (1L << (T__35 - 9)) | (1L << (T__36 - 9)) | (1L << (INT_CONSTANT - 9)) | (1L << (CHAR_CONSTANT - 9)) | (1L << (STRING_LITERAL - 9)) | (1L << (FLOAT_CONSTANT - 9)) | (1L << (INC_OPERATOR - 9)) | (1L << (DEC_OPERATOR - 9)) | (1L << (ID - 9)))) != 0)) {
				{
				setState(232);
				expression(0);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(CLangParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(CLangParser.CONTINUE, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !(_la==BREAK || _la==CONTINUE) ) {
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

	public static class PrintfStatementContext extends ParserRuleContext {
		public TerminalNode PRINTF() { return getToken(CLangParser.PRINTF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printfStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitPrintfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintfStatementContext printfStatement() throws RecognitionException {
		PrintfStatementContext _localctx = new PrintfStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_printfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(PRINTF);
			setState(238);
			match(T__8);
			setState(239);
			expression(0);
			setState(240);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScanfStatementContext extends ParserRuleContext {
		public TerminalNode SCANF() { return getToken(CLangParser.SCANF, 0); }
		public ArgumentScanfContext argumentScanf() {
			return getRuleContext(ArgumentScanfContext.class,0);
		}
		public ScanfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanfStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitScanfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanfStatementContext scanfStatement() throws RecognitionException {
		ScanfStatementContext _localctx = new ScanfStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_scanfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(SCANF);
			setState(243);
			match(T__8);
			setState(244);
			argumentScanf();
			setState(245);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentScanfContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CLangParser.ID, i);
		}
		public ArgumentScanfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentScanf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitArgumentScanf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentScanfContext argumentScanf() throws RecognitionException {
		ArgumentScanfContext _localctx = new ArgumentScanfContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_argumentScanf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(247);
				match(T__13);
				}
			}

			setState(250);
			match(ID);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(251);
				match(T__3);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(252);
					match(T__13);
					}
				}

				setState(255);
				match(ID);
				}
				}
				setState(260);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			expression(0);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(262);
				match(T__3);
				setState(263);
				expression(0);
				}
				}
				setState(268);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprUnaryOpContext extends ExpressionContext {
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public TerminalNode ID() { return getToken(CLangParser.ID, 0); }
		public ExprUnaryOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitExprUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAritContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprAritContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitExprArit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAndContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFunctionCallContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExprFunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitExprFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCntContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ExprCntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitExprCnt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprRelContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprRelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitExprRel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprOrContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitExprOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprArrayIndexContext extends ExpressionContext {
		public ArrayIndexExpressionContext arrayIndexExpression() {
			return getRuleContext(ArrayIndexExpressionContext.class,0);
		}
		public ExprArrayIndexContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitExprArrayIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParenthesisContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprParenthesisContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitExprParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAssignmentContext extends ExpressionContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExprAssignmentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitExprAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIdContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(CLangParser.ID, 0); }
		public ExprIdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitExprId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				_localctx = new ExprParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(270);
				match(T__8);
				setState(271);
				expression(0);
				setState(272);
				match(T__9);
				}
				break;
			case 2:
				{
				_localctx = new ExprFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274);
				functionCall();
				}
				break;
			case 3:
				{
				_localctx = new ExprAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(275);
				assignmentExpression();
				}
				break;
			case 4:
				{
				_localctx = new ExprArrayIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(276);
				arrayIndexExpression();
				}
				break;
			case 5:
				{
				_localctx = new ExprUnaryOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(277);
				unaryOperator();
				setState(278);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new ExprUnaryOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(280);
				match(ID);
				setState(281);
				unaryOperator();
				}
				break;
			case 7:
				{
				_localctx = new ExprCntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(282);
				constant();
				}
				break;
			case 8:
				{
				_localctx = new ExprIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(304);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExprAritContext(new ExpressionContext(_parentctx, _parentState));
						((ExprAritContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(286);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(287);
						((ExprAritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
							((ExprAritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(288);
						((ExprAritContext)_localctx).right = expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprAritContext(new ExpressionContext(_parentctx, _parentState));
						((ExprAritContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(289);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(290);
						((ExprAritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((ExprAritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(291);
						((ExprAritContext)_localctx).right = expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprRelContext(new ExpressionContext(_parentctx, _parentState));
						((ExprRelContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(292);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(293);
						((ExprRelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__19) | (1L << T__20))) != 0)) ) {
							((ExprRelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(294);
						((ExprRelContext)_localctx).right = expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprRelContext(new ExpressionContext(_parentctx, _parentState));
						((ExprRelContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(295);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(296);
						((ExprRelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
							((ExprRelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(297);
						((ExprRelContext)_localctx).right = expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ExprAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(298);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(299);
						match(T__23);
						setState(300);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new ExprOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(301);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(302);
						match(T__24);
						setState(303);
						expression(6);
						}
						break;
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FloatCntContext extends ConstantContext {
		public TerminalNode FLOAT_CONSTANT() { return getToken(CLangParser.FLOAT_CONSTANT, 0); }
		public FloatCntContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitFloatCnt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharCntContext extends ConstantContext {
		public TerminalNode CHAR_CONSTANT() { return getToken(CLangParser.CHAR_CONSTANT, 0); }
		public CharCntContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitCharCnt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntCntContext extends ConstantContext {
		public TerminalNode INT_CONSTANT() { return getToken(CLangParser.INT_CONSTANT, 0); }
		public IntCntContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitIntCnt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrLCntContext extends ConstantContext {
		public TerminalNode STRING_LITERAL() { return getToken(CLangParser.STRING_LITERAL, 0); }
		public StrLCntContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitStrLCnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constant);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_CONSTANT:
				_localctx = new IntCntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(INT_CONSTANT);
				}
				break;
			case CHAR_CONSTANT:
				_localctx = new CharCntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				match(CHAR_CONSTANT);
				}
				break;
			case FLOAT_CONSTANT:
				_localctx = new FloatCntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				match(FLOAT_CONSTANT);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StrLCntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
				match(STRING_LITERAL);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CLangParser.ID, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(ID);
			setState(316);
			match(T__8);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (T__8 - 9)) | (1L << (T__17 - 9)) | (1L << (T__18 - 9)) | (1L << (T__35 - 9)) | (1L << (T__36 - 9)) | (1L << (INT_CONSTANT - 9)) | (1L << (CHAR_CONSTANT - 9)) | (1L << (STRING_LITERAL - 9)) | (1L << (FLOAT_CONSTANT - 9)) | (1L << (INC_OPERATOR - 9)) | (1L << (DEC_OPERATOR - 9)) | (1L << (ID - 9)))) != 0)) {
				{
				setState(317);
				expressionList();
				}
			}

			setState(320);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
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
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			unaryExpression();
			setState(323);
			assignmentOperator();
			setState(324);
			expression(0);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ID() { return getToken(CLangParser.ID, 0); }
		public ArrayIndexExpressionContext arrayIndexExpression() {
			return getRuleContext(ArrayIndexExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unaryExpression);
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				arrayIndexExpression();
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

	public static class ArrayIndexExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CLangParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayIndexExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndexExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitArrayIndexExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIndexExpressionContext arrayIndexExpression() throws RecognitionException {
		ArrayIndexExpressionContext _localctx = new ArrayIndexExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arrayIndexExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(ID);
			setState(331);
			match(T__5);
			setState(332);
			expression(0);
			setState(333);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
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
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assignmentOperator);
		try {
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(T__7);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 4);
				{
				setState(338);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 5);
				{
				setState(339);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 6);
				{
				setState(340);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 7);
				{
				setState(341);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 8);
				{
				setState(342);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 9);
				{
				setState(343);
				match(T__32);
				}
				break;
			case T__8:
			case T__17:
			case T__18:
			case T__35:
			case T__36:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
			case STRING_LITERAL:
			case FLOAT_CONSTANT:
			case INC_OPERATOR:
			case DEC_OPERATOR:
			case ID:
				enterOuterAlt(_localctx, 10);
				{
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_conditionalExpression);
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				expression(0);
				setState(349);
				match(T__33);
				setState(350);
				expression(0);
				setState(351);
				match(T__34);
				setState(352);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CLangParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CLangParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(IF);
			setState(357);
			match(T__8);
			setState(358);
			expression(0);
			setState(359);
			match(T__9);
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(360);
				match(T__4);
				}
				break;
			case T__8:
			case T__10:
			case T__12:
			case T__17:
			case T__18:
			case T__35:
			case T__36:
			case WHILE:
			case IF:
			case FOR:
			case PRINTF:
			case SCANF:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
			case STRING_LITERAL:
			case FLOAT_CONSTANT:
			case TYPE:
			case BREAK:
			case CONTINUE:
			case INC_OPERATOR:
			case DEC_OPERATOR:
			case ID:
				{
				setState(361);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(364);
				match(ELSE);
				setState(367);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(365);
					match(T__4);
					}
					break;
				case T__8:
				case T__10:
				case T__12:
				case T__17:
				case T__18:
				case T__35:
				case T__36:
				case WHILE:
				case IF:
				case FOR:
				case PRINTF:
				case SCANF:
				case INT_CONSTANT:
				case CHAR_CONSTANT:
				case STRING_LITERAL:
				case FLOAT_CONSTANT:
				case TYPE:
				case BREAK:
				case CONTINUE:
				case INC_OPERATOR:
				case DEC_OPERATOR:
				case ID:
					{
					setState(366);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CLangParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(WHILE);
			setState(372);
			match(T__8);
			setState(373);
			expression(0);
			setState(374);
			match(T__9);
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(375);
				match(T__4);
				}
				break;
			case T__8:
			case T__10:
			case T__12:
			case T__17:
			case T__18:
			case T__35:
			case T__36:
			case WHILE:
			case IF:
			case FOR:
			case PRINTF:
			case SCANF:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
			case STRING_LITERAL:
			case FLOAT_CONSTANT:
			case TYPE:
			case BREAK:
			case CONTINUE:
			case INC_OPERATOR:
			case DEC_OPERATOR:
			case ID:
				{
				setState(376);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CLangParser.FOR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(FOR);
			setState(380);
			match(T__8);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (T__8 - 9)) | (1L << (T__17 - 9)) | (1L << (T__18 - 9)) | (1L << (T__35 - 9)) | (1L << (T__36 - 9)) | (1L << (INT_CONSTANT - 9)) | (1L << (CHAR_CONSTANT - 9)) | (1L << (STRING_LITERAL - 9)) | (1L << (FLOAT_CONSTANT - 9)) | (1L << (INC_OPERATOR - 9)) | (1L << (DEC_OPERATOR - 9)) | (1L << (ID - 9)))) != 0)) {
				{
				setState(381);
				expressionList();
				}
			}

			setState(384);
			match(T__4);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (T__8 - 9)) | (1L << (T__17 - 9)) | (1L << (T__18 - 9)) | (1L << (T__35 - 9)) | (1L << (T__36 - 9)) | (1L << (INT_CONSTANT - 9)) | (1L << (CHAR_CONSTANT - 9)) | (1L << (STRING_LITERAL - 9)) | (1L << (FLOAT_CONSTANT - 9)) | (1L << (INC_OPERATOR - 9)) | (1L << (DEC_OPERATOR - 9)) | (1L << (ID - 9)))) != 0)) {
				{
				setState(385);
				expression(0);
				}
			}

			setState(388);
			match(T__4);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (T__8 - 9)) | (1L << (T__17 - 9)) | (1L << (T__18 - 9)) | (1L << (T__35 - 9)) | (1L << (T__36 - 9)) | (1L << (INT_CONSTANT - 9)) | (1L << (CHAR_CONSTANT - 9)) | (1L << (STRING_LITERAL - 9)) | (1L << (FLOAT_CONSTANT - 9)) | (1L << (INC_OPERATOR - 9)) | (1L << (DEC_OPERATOR - 9)) | (1L << (ID - 9)))) != 0)) {
				{
				setState(389);
				expression(0);
				}
			}

			setState(392);
			match(T__9);
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(393);
				match(T__4);
				}
				break;
			case T__8:
			case T__10:
			case T__12:
			case T__17:
			case T__18:
			case T__35:
			case T__36:
			case WHILE:
			case IF:
			case FOR:
			case PRINTF:
			case SCANF:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
			case STRING_LITERAL:
			case FLOAT_CONSTANT:
			case TYPE:
			case BREAK:
			case CONTINUE:
			case INC_OPERATOR:
			case DEC_OPERATOR:
			case ID:
				{
				setState(394);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode INC_OPERATOR() { return getToken(CLangParser.INC_OPERATOR, 0); }
		public TerminalNode DEC_OPERATOR() { return getToken(CLangParser.DEC_OPERATOR, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_la = _input.LA(1);
			if ( !(((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (T__17 - 18)) | (1L << (T__18 - 18)) | (1L << (T__35 - 18)) | (1L << (T__36 - 18)) | (1L << (INC_OPERATOR - 18)) | (1L << (DEC_OPERATOR - 18)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u0192\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\2\6\2H\n\2\r\2\16\2I\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3T\n\3\3\4\3\4\3\4\5\4Y\n\4\3\5\3\5\3\5\5\5^\n\5\3\5\3\5"+
		"\3\5\5\5c\n\5\7\5e\n\5\f\5\16\5h\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5w\n\5\f\5\16\5z\13\5\3\5\3\5\5\5~\n\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u008b\n\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\5\t\u0094\n\t\3\t\3\t\3\t\7\t\u0099\n\t\f\t\16\t\u009c\13\t\3"+
		"\t\3\t\3\n\3\n\3\n\7\n\u00a3\n\n\f\n\16\n\u00a6\13\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\7\f\u00ae\n\f\f\f\16\f\u00b1\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c7\n\r\3"+
		"\16\3\16\3\16\3\16\6\16\u00cd\n\16\r\16\16\16\u00ce\3\16\3\16\3\16\3\16"+
		"\6\16\u00d5\n\16\r\16\16\16\u00d6\3\16\3\16\3\16\3\16\6\16\u00dd\n\16"+
		"\r\16\16\16\u00de\3\16\6\16\u00e2\n\16\r\16\16\16\u00e3\3\16\3\16\5\16"+
		"\u00e8\n\16\3\17\3\17\5\17\u00ec\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\23\5\23\u00fb\n\23\3\23\3\23\3\23\5\23"+
		"\u0100\n\23\3\23\7\23\u0103\n\23\f\23\16\23\u0106\13\23\3\24\3\24\3\24"+
		"\7\24\u010b\n\24\f\24\16\24\u010e\13\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u011f\n\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u0133\n\25\f\25\16\25\u0136\13\25\3\26\3\26\3\26\3\26"+
		"\5\26\u013c\n\26\3\27\3\27\3\27\5\27\u0141\n\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\5\31\u014b\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u015c\n\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u0165\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u016d\n\35\3\35\3\35\3\35\5\35\u0172\n\35\5\35\u0174\n\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\5\36\u017c\n\36\3\37\3\37\3\37\5\37\u0181\n\37\3\37"+
		"\3\37\5\37\u0185\n\37\3\37\3\37\5\37\u0189\n\37\3\37\3\37\3\37\5\37\u018e"+
		"\n\37\3 \3 \3 \2\3(!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>\2\n\3\2CD\4\2\63\63::\3\2?@\3\2\21\23\3\2\24\25\4\2\4\5"+
		"\26\27\3\2\30\31\5\2\24\25&\'AB\2\u01bb\2C\3\2\2\2\4S\3\2\2\2\6X\3\2\2"+
		"\2\b}\3\2\2\2\n\177\3\2\2\2\f\u0083\3\2\2\2\16\u0085\3\2\2\2\20\u008f"+
		"\3\2\2\2\22\u009f\3\2\2\2\24\u00a7\3\2\2\2\26\u00aa\3\2\2\2\30\u00c6\3"+
		"\2\2\2\32\u00e7\3\2\2\2\34\u00e9\3\2\2\2\36\u00ed\3\2\2\2 \u00ef\3\2\2"+
		"\2\"\u00f4\3\2\2\2$\u00fa\3\2\2\2&\u0107\3\2\2\2(\u011e\3\2\2\2*\u013b"+
		"\3\2\2\2,\u013d\3\2\2\2.\u0144\3\2\2\2\60\u014a\3\2\2\2\62\u014c\3\2\2"+
		"\2\64\u015b\3\2\2\2\66\u0164\3\2\2\28\u0166\3\2\2\2:\u0175\3\2\2\2<\u017d"+
		"\3\2\2\2>\u018f\3\2\2\2@B\5\4\3\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2"+
		"\2\2DG\3\2\2\2EC\3\2\2\2FH\5\6\4\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2"+
		"\2\2J\3\3\2\2\2KL\7\64\2\2LM\7\3\2\2MN\t\2\2\2NT\7\3\2\2OP\7\64\2\2PQ"+
		"\7\4\2\2QR\7D\2\2RT\7\5\2\2SK\3\2\2\2SO\3\2\2\2T\5\3\2\2\2UY\5\20\t\2"+
		"VY\5\16\b\2WY\5\b\5\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\7\3\2\2\2Z]\7\63"+
		"\2\2[^\5\n\6\2\\^\5\f\7\2][\3\2\2\2]\\\3\2\2\2^f\3\2\2\2_b\7\6\2\2`c\5"+
		"\f\7\2ac\5\n\6\2b`\3\2\2\2ba\3\2\2\2ce\3\2\2\2d_\3\2\2\2eh\3\2\2\2fd\3"+
		"\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7\7\2\2j~\3\2\2\2kl\7\63\2\2lm"+
		"\7C\2\2mn\7\b\2\2no\5(\25\2ox\7\t\2\2pq\7\6\2\2qr\7C\2\2rs\7\b\2\2st\5"+
		"(\25\2tu\7\t\2\2uw\3\2\2\2vp\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3"+
		"\2\2\2zx\3\2\2\2{|\7\7\2\2|~\3\2\2\2}Z\3\2\2\2}k\3\2\2\2~\t\3\2\2\2\177"+
		"\u0080\7C\2\2\u0080\u0081\7\n\2\2\u0081\u0082\5(\25\2\u0082\13\3\2\2\2"+
		"\u0083\u0084\7C\2\2\u0084\r\3\2\2\2\u0085\u0086\t\3\2\2\u0086\u0087\7"+
		"C\2\2\u0087\u008a\7\13\2\2\u0088\u008b\5\22\n\2\u0089\u008b\5\26\f\2\u008a"+
		"\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008d\7\f\2\2\u008d\u008e\7\7\2\2\u008e\17\3\2\2\2\u008f\u0090"+
		"\t\3\2\2\u0090\u0091\7C\2\2\u0091\u0093\7\13\2\2\u0092\u0094\5\22\n\2"+
		"\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096"+
		"\7\f\2\2\u0096\u009a\7\r\2\2\u0097\u0099\5\30\r\2\u0098\u0097\3\2\2\2"+
		"\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7\16\2\2\u009e\21\3\2\2\2\u009f"+
		"\u00a4\5\24\13\2\u00a0\u00a1\7\6\2\2\u00a1\u00a3\5\24\13\2\u00a2\u00a0"+
		"\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\23\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\63\2\2\u00a8\u00a9\7C\2"+
		"\2\u00a9\25\3\2\2\2\u00aa\u00af\7\63\2\2\u00ab\u00ac\7\6\2\2\u00ac\u00ae"+
		"\7\63\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2"+
		"\u00af\u00b0\3\2\2\2\u00b0\27\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00c7"+
		"\5\32\16\2\u00b3\u00b4\5(\25\2\u00b4\u00b5\7\7\2\2\u00b5\u00c7\3\2\2\2"+
		"\u00b6\u00c7\5\b\5\2\u00b7\u00c7\58\35\2\u00b8\u00c7\5:\36\2\u00b9\u00c7"+
		"\5<\37\2\u00ba\u00bb\5\34\17\2\u00bb\u00bc\7\7\2\2\u00bc\u00c7\3\2\2\2"+
		"\u00bd\u00be\5\36\20\2\u00be\u00bf\7\7\2\2\u00bf\u00c7\3\2\2\2\u00c0\u00c1"+
		"\5 \21\2\u00c1\u00c2\7\7\2\2\u00c2\u00c7\3\2\2\2\u00c3\u00c4\5\"\22\2"+
		"\u00c4\u00c5\7\7\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00b2\3\2\2\2\u00c6\u00b3"+
		"\3\2\2\2\u00c6\u00b6\3\2\2\2\u00c6\u00b7\3\2\2\2\u00c6\u00b8\3\2\2\2\u00c6"+
		"\u00b9\3\2\2\2\u00c6\u00ba\3\2\2\2\u00c6\u00bd\3\2\2\2\u00c6\u00c0\3\2"+
		"\2\2\u00c6\u00c3\3\2\2\2\u00c7\31\3\2\2\2\u00c8\u00c9\7\r\2\2\u00c9\u00e8"+
		"\7\16\2\2\u00ca\u00cc\7\r\2\2\u00cb\u00cd\5\30\r\2\u00cc\u00cb\3\2\2\2"+
		"\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d1\7\16\2\2\u00d1\u00e8\3\2\2\2\u00d2\u00d4\7\r\2\2"+
		"\u00d3\u00d5\5\b\5\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7\16\2\2"+
		"\u00d9\u00e8\3\2\2\2\u00da\u00dc\7\r\2\2\u00db\u00dd\5\b\5\2\u00dc\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e1\3\2\2\2\u00e0\u00e2\5\30\r\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3"+
		"\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\7\16\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00c8\3\2\2\2\u00e7\u00ca\3"+
		"\2\2\2\u00e7\u00d2\3\2\2\2\u00e7\u00da\3\2\2\2\u00e8\33\3\2\2\2\u00e9"+
		"\u00eb\7\17\2\2\u00ea\u00ec\5(\25\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3"+
		"\2\2\2\u00ec\35\3\2\2\2\u00ed\u00ee\t\4\2\2\u00ee\37\3\2\2\2\u00ef\u00f0"+
		"\7-\2\2\u00f0\u00f1\7\13\2\2\u00f1\u00f2\5(\25\2\u00f2\u00f3\7\f\2\2\u00f3"+
		"!\3\2\2\2\u00f4\u00f5\7.\2\2\u00f5\u00f6\7\13\2\2\u00f6\u00f7\5$\23\2"+
		"\u00f7\u00f8\7\f\2\2\u00f8#\3\2\2\2\u00f9\u00fb\7\20\2\2\u00fa\u00f9\3"+
		"\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0104\7C\2\2\u00fd"+
		"\u00ff\7\6\2\2\u00fe\u0100\7\20\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\7C\2\2\u0102\u00fd\3\2\2\2\u0103"+
		"\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105%\3\2\2\2"+
		"\u0106\u0104\3\2\2\2\u0107\u010c\5(\25\2\u0108\u0109\7\6\2\2\u0109\u010b"+
		"\5(\25\2\u010a\u0108\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\'\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\b\25\1"+
		"\2\u0110\u0111\7\13\2\2\u0111\u0112\5(\25\2\u0112\u0113\7\f\2\2\u0113"+
		"\u011f\3\2\2\2\u0114\u011f\5,\27\2\u0115\u011f\5.\30\2\u0116\u011f\5\62"+
		"\32\2\u0117\u0118\5> \2\u0118\u0119\7C\2\2\u0119\u011f\3\2\2\2\u011a\u011b"+
		"\7C\2\2\u011b\u011f\5> \2\u011c\u011f\5*\26\2\u011d\u011f\7C\2\2\u011e"+
		"\u010f\3\2\2\2\u011e\u0114\3\2\2\2\u011e\u0115\3\2\2\2\u011e\u0116\3\2"+
		"\2\2\u011e\u0117\3\2\2\2\u011e\u011a\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011d\3\2\2\2\u011f\u0134\3\2\2\2\u0120\u0121\f\f\2\2\u0121\u0122\t\5"+
		"\2\2\u0122\u0133\5(\25\r\u0123\u0124\f\13\2\2\u0124\u0125\t\6\2\2\u0125"+
		"\u0133\5(\25\f\u0126\u0127\f\n\2\2\u0127\u0128\t\7\2\2\u0128\u0133\5("+
		"\25\13\u0129\u012a\f\t\2\2\u012a\u012b\t\b\2\2\u012b\u0133\5(\25\n\u012c"+
		"\u012d\f\b\2\2\u012d\u012e\7\32\2\2\u012e\u0133\5(\25\t\u012f\u0130\f"+
		"\7\2\2\u0130\u0131\7\33\2\2\u0131\u0133\5(\25\b\u0132\u0120\3\2\2\2\u0132"+
		"\u0123\3\2\2\2\u0132\u0126\3\2\2\2\u0132\u0129\3\2\2\2\u0132\u012c\3\2"+
		"\2\2\u0132\u012f\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135)\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u013c\7/\2\2\u0138"+
		"\u013c\7\60\2\2\u0139\u013c\7\62\2\2\u013a\u013c\7\61\2\2\u013b\u0137"+
		"\3\2\2\2\u013b\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c"+
		"+\3\2\2\2\u013d\u013e\7C\2\2\u013e\u0140\7\13\2\2\u013f\u0141\5&\24\2"+
		"\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143"+
		"\7\f\2\2\u0143-\3\2\2\2\u0144\u0145\5\60\31\2\u0145\u0146\5\64\33\2\u0146"+
		"\u0147\5(\25\2\u0147/\3\2\2\2\u0148\u014b\7C\2\2\u0149\u014b\5\62\32\2"+
		"\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b\61\3\2\2\2\u014c\u014d"+
		"\7C\2\2\u014d\u014e\7\b\2\2\u014e\u014f\5(\25\2\u014f\u0150\7\t\2\2\u0150"+
		"\63\3\2\2\2\u0151\u015c\7\n\2\2\u0152\u015c\7\34\2\2\u0153\u015c\7\35"+
		"\2\2\u0154\u015c\7\36\2\2\u0155\u015c\7\37\2\2\u0156\u015c\7 \2\2\u0157"+
		"\u015c\7!\2\2\u0158\u015c\7\"\2\2\u0159\u015c\7#\2\2\u015a\u015c\3\2\2"+
		"\2\u015b\u0151\3\2\2\2\u015b\u0152\3\2\2\2\u015b\u0153\3\2\2\2\u015b\u0154"+
		"\3\2\2\2\u015b\u0155\3\2\2\2\u015b\u0156\3\2\2\2\u015b\u0157\3\2\2\2\u015b"+
		"\u0158\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c\65\3\2\2"+
		"\2\u015d\u0165\5(\25\2\u015e\u015f\5(\25\2\u015f\u0160\7$\2\2\u0160\u0161"+
		"\5(\25\2\u0161\u0162\7%\2\2\u0162\u0163\5\66\34\2\u0163\u0165\3\2\2\2"+
		"\u0164\u015d\3\2\2\2\u0164\u015e\3\2\2\2\u0165\67\3\2\2\2\u0166\u0167"+
		"\7)\2\2\u0167\u0168\7\13\2\2\u0168\u0169\5(\25\2\u0169\u016c\7\f\2\2\u016a"+
		"\u016d\7\7\2\2\u016b\u016d\5\30\r\2\u016c\u016a\3\2\2\2\u016c\u016b\3"+
		"\2\2\2\u016d\u0173\3\2\2\2\u016e\u0171\7*\2\2\u016f\u0172\7\7\2\2\u0170"+
		"\u0172\5\30\r\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172\u0174\3"+
		"\2\2\2\u0173\u016e\3\2\2\2\u0173\u0174\3\2\2\2\u01749\3\2\2\2\u0175\u0176"+
		"\7(\2\2\u0176\u0177\7\13\2\2\u0177\u0178\5(\25\2\u0178\u017b\7\f\2\2\u0179"+
		"\u017c\7\7\2\2\u017a\u017c\5\30\r\2\u017b\u0179\3\2\2\2\u017b\u017a\3"+
		"\2\2\2\u017c;\3\2\2\2\u017d\u017e\7+\2\2\u017e\u0180\7\13\2\2\u017f\u0181"+
		"\5&\24\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0184\7\7\2\2\u0183\u0185\5(\25\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185\u0186\3\2\2\2\u0186\u0188\7\7\2\2\u0187\u0189\5(\25\2\u0188"+
		"\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018d\7\f"+
		"\2\2\u018b\u018e\7\7\2\2\u018c\u018e\5\30\r\2\u018d\u018b\3\2\2\2\u018d"+
		"\u018c\3\2\2\2\u018e=\3\2\2\2\u018f\u0190\t\t\2\2\u0190?\3\2\2\2+CISX"+
		"]bfx}\u008a\u0093\u009a\u00a4\u00af\u00c6\u00ce\u00d6\u00de\u00e3\u00e7"+
		"\u00eb\u00fa\u00ff\u0104\u010c\u011e\u0132\u0134\u013b\u0140\u014a\u015b"+
		"\u0164\u016c\u0171\u0173\u017b\u0180\u0184\u0188\u018d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}