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
		RULE_typeList = 10, RULE_statementCombination = 11, RULE_statement = 12, 
		RULE_compoundStatement = 13, RULE_declarCombination = 14, RULE_returnStatement = 15, 
		RULE_breakStatement = 16, RULE_printfStatement = 17, RULE_scanfStatement = 18, 
		RULE_argumentScanf = 19, RULE_expressionList = 20, RULE_expression = 21, 
		RULE_constant = 22, RULE_functionCall = 23, RULE_assignmentExpression = 24, 
		RULE_unaryExpression = 25, RULE_arrayIndexExpression = 26, RULE_assignmentOperator = 27, 
		RULE_conditionalExpression = 28, RULE_ifStatement = 29, RULE_whileStatement = 30, 
		RULE_forStatement = 31, RULE_condExpression = 32, RULE_iterExpression = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "include", "definition", "declaration", "varWithExpDeclaration", 
			"varWithoutExpDeclaration", "functionDeclaration", "functionDefinition", 
			"parameterList", "parameterDeclaration", "typeList", "statementCombination", 
			"statement", "compoundStatement", "declarCombination", "returnStatement", 
			"breakStatement", "printfStatement", "scanfStatement", "argumentScanf", 
			"expressionList", "expression", "constant", "functionCall", "assignmentExpression", 
			"unaryExpression", "arrayIndexExpression", "assignmentOperator", "conditionalExpression", 
			"ifStatement", "whileStatement", "forStatement", "condExpression", "iterExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'<'", "'>'", "','", "';'", "'['", "']'", "'='", "'('", 
			"')'", "'{'", "'}'", "'return'", "'&'", "'*'", "'/'", "'%'", "'+'", "'-'", 
			"'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'~'", "'!'", "'*='", 
			"'/='", "'%='", "'+='", "'-='", "'&='", "'^='", "'|='", "'?'", "':'", 
			"'while'", "'if'", "'else'", "'for'", "'const'", "'printf'", "'scanf'", 
			null, null, null, null, null, "'#include'", null, null, null, "'int'", 
			"'float'", "'void'", "'double'", "'char'", "'short'", "'long'", "'break'", 
			"'continue'", "'++'", "'--'"
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
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUDE) {
				{
				{
				setState(68);
				include();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				definition();
				}
				}
				setState(77); 
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
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(INCLUDE);
				setState(80);
				match(T__0);
				setState(81);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==PATH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(82);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(INCLUDE);
				setState(84);
				match(T__1);
				setState(85);
				match(PATH);
				setState(86);
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
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new VarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(TYPE);
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(95);
					varWithExpDeclaration();
					}
					break;
				case 2:
					{
					setState(96);
					varWithoutExpDeclaration();
					}
					break;
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(99);
					match(T__3);
					setState(102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(100);
						varWithoutExpDeclaration();
						}
						break;
					case 2:
						{
						setState(101);
						varWithExpDeclaration();
						}
						break;
					}
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(109);
				match(T__4);
				}
				break;
			case 2:
				_localctx = new ArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(TYPE);
				setState(112);
				match(ID);
				setState(113);
				match(T__5);
				setState(114);
				expression(0);
				setState(115);
				match(T__6);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(116);
					match(T__3);
					setState(117);
					match(ID);
					setState(118);
					match(T__5);
					setState(119);
					expression(0);
					setState(120);
					match(T__6);
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
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
			setState(131);
			match(ID);
			setState(132);
			match(T__7);
			setState(133);
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
			setState(135);
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
			setState(137);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==VOID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(138);
			match(ID);
			setState(139);
			match(T__8);
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(140);
				parameterList();
				}
				break;
			case 2:
				{
				setState(141);
				typeList();
				}
				break;
			}
			setState(144);
			match(T__9);
			setState(145);
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
		public StatementCombinationContext statementCombination() {
			return getRuleContext(StatementCombinationContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(CLangParser.TYPE, 0); }
		public TerminalNode VOID() { return getToken(CLangParser.VOID, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
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
			setState(147);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==VOID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(148);
			match(ID);
			setState(149);
			match(T__8);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(150);
				parameterList();
				}
			}

			setState(153);
			match(T__9);
			setState(154);
			match(T__10);
			setState(155);
			statementCombination();
			setState(156);
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
			setState(158);
			parameterDeclaration();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(159);
				match(T__3);
				setState(160);
				parameterDeclaration();
				}
				}
				setState(165);
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
			setState(166);
			match(TYPE);
			setState(167);
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
			setState(169);
			match(TYPE);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(170);
				match(T__3);
				setState(171);
				match(TYPE);
				}
				}
				setState(176);
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

	public static class StatementCombinationContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementCombinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementCombination; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitStatementCombination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementCombinationContext statementCombination() throws RecognitionException {
		StatementCombinationContext _localctx = new StatementCombinationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statementCombination);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (T__8 - 9)) | (1L << (T__10 - 9)) | (1L << (T__12 - 9)) | (1L << (T__17 - 9)) | (1L << (T__18 - 9)) | (1L << (T__25 - 9)) | (1L << (T__26 - 9)) | (1L << (WHILE - 9)) | (1L << (IF - 9)) | (1L << (FOR - 9)) | (1L << (PRINTF - 9)) | (1L << (SCANF - 9)) | (1L << (INT_CONSTANT - 9)) | (1L << (CHAR_CONSTANT - 9)) | (1L << (STRING_LITERAL - 9)) | (1L << (FLOAT_CONSTANT - 9)) | (1L << (TYPE - 9)) | (1L << (BREAK - 9)) | (1L << (CONTINUE - 9)) | (1L << (INC_OPERATOR - 9)) | (1L << (DEC_OPERATOR - 9)) | (1L << (ID - 9)))) != 0)) {
				{
				{
				setState(177);
				statement();
				}
				}
				setState(182);
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
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				compoundStatement();
				}
				break;
			case T__8:
			case T__17:
			case T__18:
			case T__25:
			case T__26:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
			case STRING_LITERAL:
			case FLOAT_CONSTANT:
			case INC_OPERATOR:
			case DEC_OPERATOR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				expression(0);
				setState(185);
				match(T__4);
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				declaration();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				whileStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(190);
				forStatement();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 7);
				{
				setState(191);
				returnStatement();
				setState(192);
				match(T__4);
				}
				break;
			case BREAK:
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(194);
				breakStatement();
				setState(195);
				match(T__4);
				}
				break;
			case PRINTF:
				enterOuterAlt(_localctx, 9);
				{
				setState(197);
				printfStatement();
				setState(198);
				match(T__4);
				}
				break;
			case SCANF:
				enterOuterAlt(_localctx, 10);
				{
				setState(200);
				scanfStatement();
				setState(201);
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
		public StatementCombinationContext statementCombination() {
			return getRuleContext(StatementCombinationContext.class,0);
		}
		public DeclarCombinationContext declarCombination() {
			return getRuleContext(DeclarCombinationContext.class,0);
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
		enterRule(_localctx, 26, RULE_compoundStatement);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(T__10);
				setState(206);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(T__10);
				setState(208);
				statementCombination();
				setState(209);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(T__10);
				setState(212);
				declarCombination();
				setState(213);
				match(T__11);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				match(T__10);
				setState(216);
				declarCombination();
				setState(217);
				statementCombination();
				setState(218);
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

	public static class DeclarCombinationContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarCombinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarCombination; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitDeclarCombination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarCombinationContext declarCombination() throws RecognitionException {
		DeclarCombinationContext _localctx = new DeclarCombinationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declarCombination);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(222);
					declaration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(225); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 30, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__12);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (T__8 - 9)) | (1L << (T__17 - 9)) | (1L << (T__18 - 9)) | (1L << (T__25 - 9)) | (1L << (T__26 - 9)) | (1L << (INT_CONSTANT - 9)) | (1L << (CHAR_CONSTANT - 9)) | (1L << (STRING_LITERAL - 9)) | (1L << (FLOAT_CONSTANT - 9)) | (1L << (INC_OPERATOR - 9)) | (1L << (DEC_OPERATOR - 9)) | (1L << (ID - 9)))) != 0)) {
				{
				setState(228);
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
		enterRule(_localctx, 32, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
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
		enterRule(_localctx, 34, RULE_printfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(PRINTF);
			setState(234);
			match(T__8);
			setState(235);
			expression(0);
			setState(236);
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
		enterRule(_localctx, 36, RULE_scanfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(SCANF);
			setState(239);
			match(T__8);
			setState(240);
			argumentScanf();
			setState(241);
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
		enterRule(_localctx, 38, RULE_argumentScanf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(243);
				match(T__13);
				}
			}

			setState(246);
			match(ID);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(247);
				match(T__3);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(248);
					match(T__13);
					}
				}

				setState(251);
				match(ID);
				}
				}
				setState(256);
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
		enterRule(_localctx, 40, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			expression(0);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(258);
				match(T__3);
				setState(259);
				expression(0);
				}
				}
				setState(264);
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
	public static class ExprUnaryOpPostContext extends ExpressionContext {
		public Token unaryOperator;
		public TerminalNode ID() { return getToken(CLangParser.ID, 0); }
		public TerminalNode INC_OPERATOR() { return getToken(CLangParser.INC_OPERATOR, 0); }
		public TerminalNode DEC_OPERATOR() { return getToken(CLangParser.DEC_OPERATOR, 0); }
		public ExprUnaryOpPostContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitExprUnaryOpPost(this);
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
	public static class ExprUnaryOpPreContext extends ExpressionContext {
		public Token unaryOperator;
		public TerminalNode ID() { return getToken(CLangParser.ID, 0); }
		public TerminalNode INC_OPERATOR() { return getToken(CLangParser.INC_OPERATOR, 0); }
		public TerminalNode DEC_OPERATOR() { return getToken(CLangParser.DEC_OPERATOR, 0); }
		public ExprUnaryOpPreContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitExprUnaryOpPre(this);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new ExprParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(266);
				match(T__8);
				setState(267);
				expression(0);
				setState(268);
				match(T__9);
				}
				break;
			case 2:
				{
				_localctx = new ExprFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				functionCall();
				}
				break;
			case 3:
				{
				_localctx = new ExprArrayIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271);
				arrayIndexExpression();
				}
				break;
			case 4:
				{
				_localctx = new ExprUnaryOpPostContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272);
				((ExprUnaryOpPostContext)_localctx).unaryOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (T__17 - 18)) | (1L << (T__18 - 18)) | (1L << (T__25 - 18)) | (1L << (T__26 - 18)) | (1L << (INC_OPERATOR - 18)) | (1L << (DEC_OPERATOR - 18)))) != 0)) ) {
					((ExprUnaryOpPostContext)_localctx).unaryOperator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(273);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new ExprUnaryOpPreContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274);
				match(ID);
				setState(275);
				((ExprUnaryOpPreContext)_localctx).unaryOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC_OPERATOR || _la==DEC_OPERATOR) ) {
					((ExprUnaryOpPreContext)_localctx).unaryOperator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				{
				_localctx = new ExprCntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(276);
				constant();
				}
				break;
			case 7:
				{
				_localctx = new ExprIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(277);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new ExprAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(278);
				assignmentExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(299);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExprAritContext(new ExpressionContext(_parentctx, _parentState));
						((ExprAritContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(281);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(282);
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
						setState(283);
						((ExprAritContext)_localctx).right = expression(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprAritContext(new ExpressionContext(_parentctx, _parentState));
						((ExprAritContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(284);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(285);
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
						setState(286);
						((ExprAritContext)_localctx).right = expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprRelContext(new ExpressionContext(_parentctx, _parentState));
						((ExprRelContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(287);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(288);
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
						setState(289);
						((ExprRelContext)_localctx).right = expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprRelContext(new ExpressionContext(_parentctx, _parentState));
						((ExprRelContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(290);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(291);
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
						setState(292);
						((ExprRelContext)_localctx).right = expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExprAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(293);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(294);
						match(T__23);
						setState(295);
						expression(8);
						}
						break;
					case 6:
						{
						_localctx = new ExprOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(296);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(297);
						match(T__24);
						setState(298);
						expression(7);
						}
						break;
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 44, RULE_constant);
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_CONSTANT:
				_localctx = new IntCntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(INT_CONSTANT);
				}
				break;
			case CHAR_CONSTANT:
				_localctx = new CharCntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(CHAR_CONSTANT);
				}
				break;
			case FLOAT_CONSTANT:
				_localctx = new FloatCntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				match(FLOAT_CONSTANT);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StrLCntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
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
		enterRule(_localctx, 46, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(ID);
			setState(311);
			match(T__8);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (T__8 - 9)) | (1L << (T__17 - 9)) | (1L << (T__18 - 9)) | (1L << (T__25 - 9)) | (1L << (T__26 - 9)) | (1L << (INT_CONSTANT - 9)) | (1L << (CHAR_CONSTANT - 9)) | (1L << (STRING_LITERAL - 9)) | (1L << (FLOAT_CONSTANT - 9)) | (1L << (INC_OPERATOR - 9)) | (1L << (DEC_OPERATOR - 9)) | (1L << (ID - 9)))) != 0)) {
				{
				setState(312);
				expressionList();
				}
			}

			setState(315);
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
		enterRule(_localctx, 48, RULE_assignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			unaryExpression();
			setState(318);
			assignmentOperator();
			setState(319);
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
		enterRule(_localctx, 50, RULE_unaryExpression);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
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
		enterRule(_localctx, 52, RULE_arrayIndexExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(ID);
			setState(326);
			match(T__5);
			setState(327);
			expression(0);
			setState(328);
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
		enterRule(_localctx, 54, RULE_assignmentOperator);
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(T__7);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 4);
				{
				setState(333);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 5);
				{
				setState(334);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 6);
				{
				setState(335);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 7);
				{
				setState(336);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 8);
				{
				setState(337);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 9);
				{
				setState(338);
				match(T__34);
				}
				break;
			case T__8:
			case T__17:
			case T__18:
			case T__25:
			case T__26:
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
		enterRule(_localctx, 56, RULE_conditionalExpression);
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				expression(0);
				setState(344);
				match(T__35);
				setState(345);
				expression(0);
				setState(346);
				match(T__36);
				setState(347);
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
		enterRule(_localctx, 58, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(IF);
			setState(352);
			match(T__8);
			setState(353);
			expression(0);
			setState(354);
			match(T__9);
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(355);
				match(T__4);
				}
				break;
			case T__8:
			case T__10:
			case T__12:
			case T__17:
			case T__18:
			case T__25:
			case T__26:
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
				setState(356);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(359);
				match(ELSE);
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
				case T__25:
				case T__26:
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
		enterRule(_localctx, 60, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(WHILE);
			setState(367);
			match(T__8);
			setState(368);
			expression(0);
			setState(369);
			match(T__9);
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(370);
				match(T__4);
				}
				break;
			case T__8:
			case T__10:
			case T__12:
			case T__17:
			case T__18:
			case T__25:
			case T__26:
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
				setState(371);
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
		public CondExpressionContext condExpression() {
			return getRuleContext(CondExpressionContext.class,0);
		}
		public IterExpressionContext iterExpression() {
			return getRuleContext(IterExpressionContext.class,0);
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
		enterRule(_localctx, 62, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(FOR);
			setState(375);
			match(T__8);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (T__8 - 9)) | (1L << (T__17 - 9)) | (1L << (T__18 - 9)) | (1L << (T__25 - 9)) | (1L << (T__26 - 9)) | (1L << (INT_CONSTANT - 9)) | (1L << (CHAR_CONSTANT - 9)) | (1L << (STRING_LITERAL - 9)) | (1L << (FLOAT_CONSTANT - 9)) | (1L << (INC_OPERATOR - 9)) | (1L << (DEC_OPERATOR - 9)) | (1L << (ID - 9)))) != 0)) {
				{
				setState(376);
				expressionList();
				}
			}

			setState(379);
			match(T__4);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (T__8 - 9)) | (1L << (T__17 - 9)) | (1L << (T__18 - 9)) | (1L << (T__25 - 9)) | (1L << (T__26 - 9)) | (1L << (INT_CONSTANT - 9)) | (1L << (CHAR_CONSTANT - 9)) | (1L << (STRING_LITERAL - 9)) | (1L << (FLOAT_CONSTANT - 9)) | (1L << (INC_OPERATOR - 9)) | (1L << (DEC_OPERATOR - 9)) | (1L << (ID - 9)))) != 0)) {
				{
				setState(380);
				condExpression();
				}
			}

			setState(383);
			match(T__4);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (T__8 - 9)) | (1L << (T__17 - 9)) | (1L << (T__18 - 9)) | (1L << (T__25 - 9)) | (1L << (T__26 - 9)) | (1L << (INT_CONSTANT - 9)) | (1L << (CHAR_CONSTANT - 9)) | (1L << (STRING_LITERAL - 9)) | (1L << (FLOAT_CONSTANT - 9)) | (1L << (INC_OPERATOR - 9)) | (1L << (DEC_OPERATOR - 9)) | (1L << (ID - 9)))) != 0)) {
				{
				setState(384);
				iterExpression();
				}
			}

			setState(387);
			match(T__9);
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(388);
				match(T__4);
				}
				break;
			case T__8:
			case T__10:
			case T__12:
			case T__17:
			case T__18:
			case T__25:
			case T__26:
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
				setState(389);
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

	public static class CondExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CondExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitCondExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondExpressionContext condExpression() throws RecognitionException {
		CondExpressionContext _localctx = new CondExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_condExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
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

	public static class IterExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IterExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLangVisitor ) return ((CLangVisitor<? extends T>)visitor).visitIterExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterExpressionContext iterExpression() throws RecognitionException {
		IterExpressionContext _localctx = new IterExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_iterExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u018f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\6\2N\n\2\r\2\16\2O\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Z\n\3\3\4\3\4\3\4\5\4_\n\4\3\5\3\5\3"+
		"\5\5\5d\n\5\3\5\3\5\3\5\5\5i\n\5\7\5k\n\5\f\5\16\5n\13\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5}\n\5\f\5\16\5\u0080\13\5\3"+
		"\5\3\5\5\5\u0084\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u0091"+
		"\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u009a\n\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\7\n\u00a4\n\n\f\n\16\n\u00a7\13\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\7\f\u00af\n\f\f\f\16\f\u00b2\13\f\3\r\7\r\u00b5\n\r\f\r\16\r\u00b8\13"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ce\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00df\n\17"+
		"\3\20\6\20\u00e2\n\20\r\20\16\20\u00e3\3\21\3\21\5\21\u00e8\n\21\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\5\25\u00f7"+
		"\n\25\3\25\3\25\3\25\5\25\u00fc\n\25\3\25\7\25\u00ff\n\25\f\25\16\25\u0102"+
		"\13\25\3\26\3\26\3\26\7\26\u0107\n\26\f\26\16\26\u010a\13\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u011a"+
		"\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\7\27\u012e\n\27\f\27\16\27\u0131\13\27\3\30"+
		"\3\30\3\30\3\30\5\30\u0137\n\30\3\31\3\31\3\31\5\31\u013c\n\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\33\3\33\5\33\u0146\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0157\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0160\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u0168\n\37\3\37\3\37\3\37\5\37\u016d\n\37\5\37\u016f\n"+
		"\37\3 \3 \3 \3 \3 \3 \5 \u0177\n \3!\3!\3!\5!\u017c\n!\3!\3!\5!\u0180"+
		"\n!\3!\3!\5!\u0184\n!\3!\3!\3!\5!\u0189\n!\3\"\3\"\3#\3#\3#\2\3,$\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\13\3"+
		"\2CD\4\2\63\63::\3\2?@\5\2\24\25\34\35AB\3\2AB\3\2\21\23\3\2\24\25\4\2"+
		"\4\5\26\27\3\2\30\31\2\u01b2\2I\3\2\2\2\4Y\3\2\2\2\6^\3\2\2\2\b\u0083"+
		"\3\2\2\2\n\u0085\3\2\2\2\f\u0089\3\2\2\2\16\u008b\3\2\2\2\20\u0095\3\2"+
		"\2\2\22\u00a0\3\2\2\2\24\u00a8\3\2\2\2\26\u00ab\3\2\2\2\30\u00b6\3\2\2"+
		"\2\32\u00cd\3\2\2\2\34\u00de\3\2\2\2\36\u00e1\3\2\2\2 \u00e5\3\2\2\2\""+
		"\u00e9\3\2\2\2$\u00eb\3\2\2\2&\u00f0\3\2\2\2(\u00f6\3\2\2\2*\u0103\3\2"+
		"\2\2,\u0119\3\2\2\2.\u0136\3\2\2\2\60\u0138\3\2\2\2\62\u013f\3\2\2\2\64"+
		"\u0145\3\2\2\2\66\u0147\3\2\2\28\u0156\3\2\2\2:\u015f\3\2\2\2<\u0161\3"+
		"\2\2\2>\u0170\3\2\2\2@\u0178\3\2\2\2B\u018a\3\2\2\2D\u018c\3\2\2\2FH\5"+
		"\4\3\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2LN\5"+
		"\6\4\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\3\3\2\2\2QR\7\64\2\2R"+
		"S\7\3\2\2ST\t\2\2\2TZ\7\3\2\2UV\7\64\2\2VW\7\4\2\2WX\7D\2\2XZ\7\5\2\2"+
		"YQ\3\2\2\2YU\3\2\2\2Z\5\3\2\2\2[_\5\20\t\2\\_\5\16\b\2]_\5\b\5\2^[\3\2"+
		"\2\2^\\\3\2\2\2^]\3\2\2\2_\7\3\2\2\2`c\7\63\2\2ad\5\n\6\2bd\5\f\7\2ca"+
		"\3\2\2\2cb\3\2\2\2dl\3\2\2\2eh\7\6\2\2fi\5\f\7\2gi\5\n\6\2hf\3\2\2\2h"+
		"g\3\2\2\2ik\3\2\2\2je\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2"+
		"nl\3\2\2\2op\7\7\2\2p\u0084\3\2\2\2qr\7\63\2\2rs\7C\2\2st\7\b\2\2tu\5"+
		",\27\2u~\7\t\2\2vw\7\6\2\2wx\7C\2\2xy\7\b\2\2yz\5,\27\2z{\7\t\2\2{}\3"+
		"\2\2\2|v\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2"+
		"\2\u0080~\3\2\2\2\u0081\u0082\7\7\2\2\u0082\u0084\3\2\2\2\u0083`\3\2\2"+
		"\2\u0083q\3\2\2\2\u0084\t\3\2\2\2\u0085\u0086\7C\2\2\u0086\u0087\7\n\2"+
		"\2\u0087\u0088\5,\27\2\u0088\13\3\2\2\2\u0089\u008a\7C\2\2\u008a\r\3\2"+
		"\2\2\u008b\u008c\t\3\2\2\u008c\u008d\7C\2\2\u008d\u0090\7\13\2\2\u008e"+
		"\u0091\5\22\n\2\u008f\u0091\5\26\f\2\u0090\u008e\3\2\2\2\u0090\u008f\3"+
		"\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\f\2\2\u0093"+
		"\u0094\7\7\2\2\u0094\17\3\2\2\2\u0095\u0096\t\3\2\2\u0096\u0097\7C\2\2"+
		"\u0097\u0099\7\13\2\2\u0098\u009a\5\22\n\2\u0099\u0098\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\f\2\2\u009c\u009d\7\r\2\2\u009d"+
		"\u009e\5\30\r\2\u009e\u009f\7\16\2\2\u009f\21\3\2\2\2\u00a0\u00a5\5\24"+
		"\13\2\u00a1\u00a2\7\6\2\2\u00a2\u00a4\5\24\13\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\23\3\2\2"+
		"\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\63\2\2\u00a9\u00aa\7C\2\2\u00aa\25"+
		"\3\2\2\2\u00ab\u00b0\7\63\2\2\u00ac\u00ad\7\6\2\2\u00ad\u00af\7\63\2\2"+
		"\u00ae\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1"+
		"\3\2\2\2\u00b1\27\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\5\32\16\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\31\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ce\5\34\17\2\u00ba"+
		"\u00bb\5,\27\2\u00bb\u00bc\7\7\2\2\u00bc\u00ce\3\2\2\2\u00bd\u00ce\5\b"+
		"\5\2\u00be\u00ce\5<\37\2\u00bf\u00ce\5> \2\u00c0\u00ce\5@!\2\u00c1\u00c2"+
		"\5 \21\2\u00c2\u00c3\7\7\2\2\u00c3\u00ce\3\2\2\2\u00c4\u00c5\5\"\22\2"+
		"\u00c5\u00c6\7\7\2\2\u00c6\u00ce\3\2\2\2\u00c7\u00c8\5$\23\2\u00c8\u00c9"+
		"\7\7\2\2\u00c9\u00ce\3\2\2\2\u00ca\u00cb\5&\24\2\u00cb\u00cc\7\7\2\2\u00cc"+
		"\u00ce\3\2\2\2\u00cd\u00b9\3\2\2\2\u00cd\u00ba\3\2\2\2\u00cd\u00bd\3\2"+
		"\2\2\u00cd\u00be\3\2\2\2\u00cd\u00bf\3\2\2\2\u00cd\u00c0\3\2\2\2\u00cd"+
		"\u00c1\3\2\2\2\u00cd\u00c4\3\2\2\2\u00cd\u00c7\3\2\2\2\u00cd\u00ca\3\2"+
		"\2\2\u00ce\33\3\2\2\2\u00cf\u00d0\7\r\2\2\u00d0\u00df\7\16\2\2\u00d1\u00d2"+
		"\7\r\2\2\u00d2\u00d3\5\30\r\2\u00d3\u00d4\7\16\2\2\u00d4\u00df\3\2\2\2"+
		"\u00d5\u00d6\7\r\2\2\u00d6\u00d7\5\36\20\2\u00d7\u00d8\7\16\2\2\u00d8"+
		"\u00df\3\2\2\2\u00d9\u00da\7\r\2\2\u00da\u00db\5\36\20\2\u00db\u00dc\5"+
		"\30\r\2\u00dc\u00dd\7\16\2\2\u00dd\u00df\3\2\2\2\u00de\u00cf\3\2\2\2\u00de"+
		"\u00d1\3\2\2\2\u00de\u00d5\3\2\2\2\u00de\u00d9\3\2\2\2\u00df\35\3\2\2"+
		"\2\u00e0\u00e2\5\b\5\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\37\3\2\2\2\u00e5\u00e7\7\17\2\2\u00e6"+
		"\u00e8\5,\27\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8!\3\2\2\2"+
		"\u00e9\u00ea\t\4\2\2\u00ea#\3\2\2\2\u00eb\u00ec\7-\2\2\u00ec\u00ed\7\13"+
		"\2\2\u00ed\u00ee\5,\27\2\u00ee\u00ef\7\f\2\2\u00ef%\3\2\2\2\u00f0\u00f1"+
		"\7.\2\2\u00f1\u00f2\7\13\2\2\u00f2\u00f3\5(\25\2\u00f3\u00f4\7\f\2\2\u00f4"+
		"\'\3\2\2\2\u00f5\u00f7\7\20\2\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2"+
		"\2\u00f7\u00f8\3\2\2\2\u00f8\u0100\7C\2\2\u00f9\u00fb\7\6\2\2\u00fa\u00fc"+
		"\7\20\2\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2"+
		"\u00fd\u00ff\7C\2\2\u00fe\u00f9\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101)\3\2\2\2\u0102\u0100\3\2\2\2\u0103"+
		"\u0108\5,\27\2\u0104\u0105\7\6\2\2\u0105\u0107\5,\27\2\u0106\u0104\3\2"+
		"\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"+\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\b\27\1\2\u010c\u010d\7\13\2"+
		"\2\u010d\u010e\5,\27\2\u010e\u010f\7\f\2\2\u010f\u011a\3\2\2\2\u0110\u011a"+
		"\5\60\31\2\u0111\u011a\5\66\34\2\u0112\u0113\t\5\2\2\u0113\u011a\7C\2"+
		"\2\u0114\u0115\7C\2\2\u0115\u011a\t\6\2\2\u0116\u011a\5.\30\2\u0117\u011a"+
		"\7C\2\2\u0118\u011a\5\62\32\2\u0119\u010b\3\2\2\2\u0119\u0110\3\2\2\2"+
		"\u0119\u0111\3\2\2\2\u0119\u0112\3\2\2\2\u0119\u0114\3\2\2\2\u0119\u0116"+
		"\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u012f\3\2\2\2\u011b"+
		"\u011c\f\r\2\2\u011c\u011d\t\7\2\2\u011d\u012e\5,\27\16\u011e\u011f\f"+
		"\f\2\2\u011f\u0120\t\b\2\2\u0120\u012e\5,\27\r\u0121\u0122\f\13\2\2\u0122"+
		"\u0123\t\t\2\2\u0123\u012e\5,\27\f\u0124\u0125\f\n\2\2\u0125\u0126\t\n"+
		"\2\2\u0126\u012e\5,\27\13\u0127\u0128\f\t\2\2\u0128\u0129\7\32\2\2\u0129"+
		"\u012e\5,\27\n\u012a\u012b\f\b\2\2\u012b\u012c\7\33\2\2\u012c\u012e\5"+
		",\27\t\u012d\u011b\3\2\2\2\u012d\u011e\3\2\2\2\u012d\u0121\3\2\2\2\u012d"+
		"\u0124\3\2\2\2\u012d\u0127\3\2\2\2\u012d\u012a\3\2\2\2\u012e\u0131\3\2"+
		"\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130-\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0132\u0137\7/\2\2\u0133\u0137\7\60\2\2\u0134\u0137\7\62\2\2"+
		"\u0135\u0137\7\61\2\2\u0136\u0132\3\2\2\2\u0136\u0133\3\2\2\2\u0136\u0134"+
		"\3\2\2\2\u0136\u0135\3\2\2\2\u0137/\3\2\2\2\u0138\u0139\7C\2\2\u0139\u013b"+
		"\7\13\2\2\u013a\u013c\5*\26\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2"+
		"\u013c\u013d\3\2\2\2\u013d\u013e\7\f\2\2\u013e\61\3\2\2\2\u013f\u0140"+
		"\5\64\33\2\u0140\u0141\58\35\2\u0141\u0142\5,\27\2\u0142\63\3\2\2\2\u0143"+
		"\u0146\7C\2\2\u0144\u0146\5\66\34\2\u0145\u0143\3\2\2\2\u0145\u0144\3"+
		"\2\2\2\u0146\65\3\2\2\2\u0147\u0148\7C\2\2\u0148\u0149\7\b\2\2\u0149\u014a"+
		"\5,\27\2\u014a\u014b\7\t\2\2\u014b\67\3\2\2\2\u014c\u0157\7\n\2\2\u014d"+
		"\u0157\7\36\2\2\u014e\u0157\7\37\2\2\u014f\u0157\7 \2\2\u0150\u0157\7"+
		"!\2\2\u0151\u0157\7\"\2\2\u0152\u0157\7#\2\2\u0153\u0157\7$\2\2\u0154"+
		"\u0157\7%\2\2\u0155\u0157\3\2\2\2\u0156\u014c\3\2\2\2\u0156\u014d\3\2"+
		"\2\2\u0156\u014e\3\2\2\2\u0156\u014f\3\2\2\2\u0156\u0150\3\2\2\2\u0156"+
		"\u0151\3\2\2\2\u0156\u0152\3\2\2\2\u0156\u0153\3\2\2\2\u0156\u0154\3\2"+
		"\2\2\u0156\u0155\3\2\2\2\u01579\3\2\2\2\u0158\u0160\5,\27\2\u0159\u015a"+
		"\5,\27\2\u015a\u015b\7&\2\2\u015b\u015c\5,\27\2\u015c\u015d\7\'\2\2\u015d"+
		"\u015e\5:\36\2\u015e\u0160\3\2\2\2\u015f\u0158\3\2\2\2\u015f\u0159\3\2"+
		"\2\2\u0160;\3\2\2\2\u0161\u0162\7)\2\2\u0162\u0163\7\13\2\2\u0163\u0164"+
		"\5,\27\2\u0164\u0167\7\f\2\2\u0165\u0168\7\7\2\2\u0166\u0168\5\32\16\2"+
		"\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168\u016e\3\2\2\2\u0169\u016c"+
		"\7*\2\2\u016a\u016d\7\7\2\2\u016b\u016d\5\32\16\2\u016c\u016a\3\2\2\2"+
		"\u016c\u016b\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u0169\3\2\2\2\u016e\u016f"+
		"\3\2\2\2\u016f=\3\2\2\2\u0170\u0171\7(\2\2\u0171\u0172\7\13\2\2\u0172"+
		"\u0173\5,\27\2\u0173\u0176\7\f\2\2\u0174\u0177\7\7\2\2\u0175\u0177\5\32"+
		"\16\2\u0176\u0174\3\2\2\2\u0176\u0175\3\2\2\2\u0177?\3\2\2\2\u0178\u0179"+
		"\7+\2\2\u0179\u017b\7\13\2\2\u017a\u017c\5*\26\2\u017b\u017a\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\7\7\2\2\u017e\u0180\5B"+
		"\"\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0183\7\7\2\2\u0182\u0184\5D#\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2"+
		"\2\u0184\u0185\3\2\2\2\u0185\u0188\7\f\2\2\u0186\u0189\7\7\2\2\u0187\u0189"+
		"\5\32\16\2\u0188\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189A\3\2\2\2\u018a"+
		"\u018b\5,\27\2\u018bC\3\2\2\2\u018c\u018d\5,\27\2\u018dE\3\2\2\2(IOY^"+
		"chl~\u0083\u0090\u0099\u00a5\u00b0\u00b6\u00cd\u00de\u00e3\u00e7\u00f6"+
		"\u00fb\u0100\u0108\u0119\u012d\u012f\u0136\u013b\u0145\u0156\u015f\u0167"+
		"\u016c\u016e\u0176\u017b\u017f\u0183\u0188";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}