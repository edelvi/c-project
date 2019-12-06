// Generated from C:/Users/Aice/IdeaProjects/c-project/src\CLang.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		WHILE=39, IF=40, ELSE=41, FOR=42, CONST=43, PRINTF=44, SCANF=45, FORMAT_STR=46, 
		SPECIF=47, SPECIF_FLAGS=48, SPECIF_FLAGS_WIDTH=49, SPECIF_FLAGS_WIDTH_PRECI=50, 
		SPECIF_FLAGS_WIDTH_PRECI_LEN=51, COMMON_STR=52, CONSTANT=53, INT_CONSTANT=54, 
		CHAR_CONSTANT=55, STRING_LITERAL=56, FLOAT_CONSTANT=57, TYPE=58, INCLUDE=59, 
		FLAGS=60, WIDTH=61, PRECI=62, INT=63, FLOAT=64, VOID=65, DOUBLE=66, CHAR=67, 
		SHORT=68, LONG=69, BREAK=70, CONTINUE=71, INC_OPERATOR=72, DEC_OPERATOR=73, 
		ID=74, PATH=75, LINE_COMMENT=76, MULTILINE_COMMENT=77, WS=78;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "WHILE", "IF", "ELSE", "FOR", 
			"CONST", "PRINTF", "SCANF", "FORMAT_STR", "SPECIF", "SPECIF_FLAGS", "SPECIF_FLAGS_WIDTH", 
			"SPECIF_FLAGS_WIDTH_PRECI", "SPECIF_FLAGS_WIDTH_PRECI_LEN", "COMMON_STR", 
			"CONSTANT", "INT_CONSTANT", "CHAR_CONSTANT", "STRING_LITERAL", "FLOAT_CONSTANT", 
			"TYPE", "INCLUDE", "FLAGS", "WIDTH", "PRECI", "INT", "FLOAT", "VOID", 
			"DOUBLE", "CHAR", "SHORT", "LONG", "BREAK", "CONTINUE", "INC_OPERATOR", 
			"DEC_OPERATOR", "ID", "PATH", "PC", "NU", "AS", "Z", "LEN", "SPEC", "O_WS", 
			"ESC", "EXTENSION", "FRAC_PART", "FLOAT_WITH_E", "OCT_CONSTANT", "HEX_CONSTANT", 
			"DEC_CONSTANT", "SIGN", "FLOAT_SUFFIX", "COMMENT", "DIGIT", "DIGITS", 
			"HEX_DIGIT", "LETTER", "LET_DIGIT", "STR_OUT", "LINE_COMMENT", "MULTILINE_COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'<'", "'>'", "'='", "','", "';'", "'['", "']'", "'('", 
			"')'", "'{'", "'}'", "'return'", "'&'", "'*'", "'/'", "'%'", "'+'", "'-'", 
			"'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "' ]'", "'*='", "'/='", 
			"'%='", "'+='", "'-='", "'&='", "'^='", "'|='", "'?'", "':'", "'~'", 
			"'!'", "'while'", "'if'", "'else'", "'for'", "'const'", "'printf'", "'scanf'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'#include'", null, null, null, "'int'", "'float'", "'void'", "'double'", 
			"'char'", "'short'", "'long'", "'break'", "'continue'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "WHILE", "IF", "ELSE", "FOR", "CONST", "PRINTF", "SCANF", 
			"FORMAT_STR", "SPECIF", "SPECIF_FLAGS", "SPECIF_FLAGS_WIDTH", "SPECIF_FLAGS_WIDTH_PRECI", 
			"SPECIF_FLAGS_WIDTH_PRECI_LEN", "COMMON_STR", "CONSTANT", "INT_CONSTANT", 
			"CHAR_CONSTANT", "STRING_LITERAL", "FLOAT_CONSTANT", "TYPE", "INCLUDE", 
			"FLAGS", "WIDTH", "PRECI", "INT", "FLOAT", "VOID", "DOUBLE", "CHAR", 
			"SHORT", "LONG", "BREAK", "CONTINUE", "INC_OPERATOR", "DEC_OPERATOR", 
			"ID", "PATH", "LINE_COMMENT", "MULTILINE_COMMENT", "WS"
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


	public CLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2P\u02f3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\""+
		"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3"+
		")\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3"+
		".\3.\3.\3.\3.\3.\3/\3/\5/\u0155\n/\3/\6/\u0158\n/\r/\16/\u0159\3/\5/\u015d"+
		"\n/\3/\3/\3/\3/\5/\u0163\n/\3/\6/\u0166\n/\r/\16/\u0167\3/\5/\u016b\n"+
		"/\3/\3/\3/\3/\5/\u0171\n/\3/\6/\u0174\n/\r/\16/\u0175\3/\5/\u0179\n/\3"+
		"/\3/\3/\3/\5/\u017f\n/\3/\6/\u0182\n/\r/\16/\u0183\3/\5/\u0187\n/\3/\3"+
		"/\3/\3/\5/\u018d\n/\3/\6/\u0190\n/\r/\16/\u0191\3/\5/\u0195\n/\3/\3/\5"+
		"/\u0199\n/\3\60\3\60\3\60\3\61\3\61\5\61\u01a0\n\61\3\61\3\61\3\62\3\62"+
		"\5\62\u01a6\n\62\3\62\5\62\u01a9\n\62\3\62\3\62\3\63\3\63\5\63\u01af\n"+
		"\63\3\63\5\63\u01b2\n\63\3\63\5\63\u01b5\n\63\3\63\3\63\3\64\3\64\5\64"+
		"\u01bb\n\64\3\64\5\64\u01be\n\64\3\64\5\64\u01c1\n\64\3\64\5\64\u01c4"+
		"\n\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\5\66\u01d0\n\66"+
		"\3\67\3\67\3\67\5\67\u01d5\n\67\38\38\58\u01d9\n8\38\38\38\39\39\39\7"+
		"9\u01e1\n9\f9\169\u01e4\139\39\39\3:\5:\u01e9\n:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\5:\u01f5\n:\3:\5:\u01f8\n:\3;\3;\3;\3;\3;\3;\5;\u0200\n;\3<"+
		"\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\5=\u020e\n=\3>\3>\5>\u0212\n>\3?\3?"+
		"\3?\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C"+
		"\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3H"+
		"\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\7K\u0254\nK\fK\16K\u0257"+
		"\13K\3L\3L\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\5R\u0269\nR\3S\3"+
		"S\3T\3T\3T\3T\3T\3T\5T\u0273\nT\3U\3U\3U\3V\6V\u0279\nV\rV\16V\u027a\3"+
		"V\6V\u027e\nV\rV\16V\u027f\3V\3V\5V\u0284\nV\3V\6V\u0287\nV\rV\16V\u0288"+
		"\5V\u028b\nV\3W\6W\u028e\nW\rW\16W\u028f\3W\3W\5W\u0294\nW\3W\6W\u0297"+
		"\nW\rW\16W\u0298\3X\3X\6X\u029d\nX\rX\16X\u029e\3Y\3Y\3Y\3Y\5Y\u02a5\n"+
		"Y\3Y\6Y\u02a8\nY\rY\16Y\u02a9\3Z\3Z\3[\3[\3\\\3\\\3]\3]\5]\u02b4\n]\3"+
		"^\3^\3_\6_\u02b9\n_\r_\16_\u02ba\3`\3`\6`\u02bf\n`\r`\16`\u02c0\3a\3a"+
		"\3b\3b\5b\u02c7\nb\3c\3c\7c\u02cb\nc\fc\16c\u02ce\13c\3d\3d\3d\3d\7d\u02d4"+
		"\nd\fd\16d\u02d7\13d\3d\5d\u02da\nd\3d\3d\5d\u02de\nd\3d\3d\3e\3e\3e\3"+
		"e\7e\u02e6\ne\fe\16e\u02e9\13e\3e\3e\3e\3e\3e\3f\3f\3f\3f\6\u01e2\u02cc"+
		"\u02d5\u02e7\2g\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099\2\u009b\2\u009d"+
		"\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af"+
		"\2\u00b1\2\u00b3\2\u00b5\2\u00b7\2\u00b9\2\u00bb\2\u00bd\2\u00bf\2\u00c1"+
		"\2\u00c3\2\u00c5\2\u00c7N\u00c9O\u00cbP\3\2\f\5\2NNjjnn\13\2GGIIZZeik"+
		"kpruuwwzz\b\2$$^^ddppttvv\4\2GGgg\4\2--//\6\2HHNNhhnn\3\2\62;\4\2CHch"+
		"\4\2C\\c|\5\2\13\f\17\17\"\"\2\u0327\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9"+
		"\3\2\2\2\2\u00cb\3\2\2\2\3\u00cd\3\2\2\2\5\u00cf\3\2\2\2\7\u00d1\3\2\2"+
		"\2\t\u00d3\3\2\2\2\13\u00d5\3\2\2\2\r\u00d7\3\2\2\2\17\u00d9\3\2\2\2\21"+
		"\u00db\3\2\2\2\23\u00dd\3\2\2\2\25\u00df\3\2\2\2\27\u00e1\3\2\2\2\31\u00e3"+
		"\3\2\2\2\33\u00e5\3\2\2\2\35\u00ec\3\2\2\2\37\u00ee\3\2\2\2!\u00f0\3\2"+
		"\2\2#\u00f2\3\2\2\2%\u00f4\3\2\2\2\'\u00f6\3\2\2\2)\u00f8\3\2\2\2+\u00fb"+
		"\3\2\2\2-\u00fe\3\2\2\2/\u0101\3\2\2\2\61\u0104\3\2\2\2\63\u0107\3\2\2"+
		"\2\65\u010a\3\2\2\2\67\u010d\3\2\2\29\u0110\3\2\2\2;\u0113\3\2\2\2=\u0116"+
		"\3\2\2\2?\u0119\3\2\2\2A\u011c\3\2\2\2C\u011f\3\2\2\2E\u0122\3\2\2\2G"+
		"\u0125\3\2\2\2I\u0127\3\2\2\2K\u0129\3\2\2\2M\u012b\3\2\2\2O\u012d\3\2"+
		"\2\2Q\u0133\3\2\2\2S\u0136\3\2\2\2U\u013b\3\2\2\2W\u013f\3\2\2\2Y\u0145"+
		"\3\2\2\2[\u014c\3\2\2\2]\u0198\3\2\2\2_\u019a\3\2\2\2a\u019d\3\2\2\2c"+
		"\u01a3\3\2\2\2e\u01ac\3\2\2\2g\u01b8\3\2\2\2i\u01c7\3\2\2\2k\u01cf\3\2"+
		"\2\2m\u01d4\3\2\2\2o\u01d6\3\2\2\2q\u01dd\3\2\2\2s\u01e8\3\2\2\2u\u01ff"+
		"\3\2\2\2w\u0201\3\2\2\2y\u020d\3\2\2\2{\u0211\3\2\2\2}\u0213\3\2\2\2\177"+
		"\u0216\3\2\2\2\u0081\u021a\3\2\2\2\u0083\u0220\3\2\2\2\u0085\u0225\3\2"+
		"\2\2\u0087\u022c\3\2\2\2\u0089\u0231\3\2\2\2\u008b\u0237\3\2\2\2\u008d"+
		"\u023c\3\2\2\2\u008f\u0242\3\2\2\2\u0091\u024b\3\2\2\2\u0093\u024e\3\2"+
		"\2\2\u0095\u0251\3\2\2\2\u0097\u0258\3\2\2\2\u0099\u025c\3\2\2\2\u009b"+
		"\u025e\3\2\2\2\u009d\u0260\3\2\2\2\u009f\u0262\3\2\2\2\u00a1\u0264\3\2"+
		"\2\2\u00a3\u0268\3\2\2\2\u00a5\u026a\3\2\2\2\u00a7\u0272\3\2\2\2\u00a9"+
		"\u0274\3\2\2\2\u00ab\u028a\3\2\2\2\u00ad\u028d\3\2\2\2\u00af\u029a\3\2"+
		"\2\2\u00b1\u02a4\3\2\2\2\u00b3\u02ab\3\2\2\2\u00b5\u02ad\3\2\2\2\u00b7"+
		"\u02af\3\2\2\2\u00b9\u02b3\3\2\2\2\u00bb\u02b5\3\2\2\2\u00bd\u02b8\3\2"+
		"\2\2\u00bf\u02be\3\2\2\2\u00c1\u02c2\3\2\2\2\u00c3\u02c6\3\2\2\2\u00c5"+
		"\u02cc\3\2\2\2\u00c7\u02cf\3\2\2\2\u00c9\u02e1\3\2\2\2\u00cb\u02ef\3\2"+
		"\2\2\u00cd\u00ce\7$\2\2\u00ce\4\3\2\2\2\u00cf\u00d0\7>\2\2\u00d0\6\3\2"+
		"\2\2\u00d1\u00d2\7@\2\2\u00d2\b\3\2\2\2\u00d3\u00d4\7?\2\2\u00d4\n\3\2"+
		"\2\2\u00d5\u00d6\7.\2\2\u00d6\f\3\2\2\2\u00d7\u00d8\7=\2\2\u00d8\16\3"+
		"\2\2\2\u00d9\u00da\7]\2\2\u00da\20\3\2\2\2\u00db\u00dc\7_\2\2\u00dc\22"+
		"\3\2\2\2\u00dd\u00de\7*\2\2\u00de\24\3\2\2\2\u00df\u00e0\7+\2\2\u00e0"+
		"\26\3\2\2\2\u00e1\u00e2\7}\2\2\u00e2\30\3\2\2\2\u00e3\u00e4\7\177\2\2"+
		"\u00e4\32\3\2\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7"+
		"v\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7p\2\2\u00eb\34"+
		"\3\2\2\2\u00ec\u00ed\7(\2\2\u00ed\36\3\2\2\2\u00ee\u00ef\7,\2\2\u00ef"+
		" \3\2\2\2\u00f0\u00f1\7\61\2\2\u00f1\"\3\2\2\2\u00f2\u00f3\7\'\2\2\u00f3"+
		"$\3\2\2\2\u00f4\u00f5\7-\2\2\u00f5&\3\2\2\2\u00f6\u00f7\7/\2\2\u00f7("+
		"\3\2\2\2\u00f8\u00f9\7@\2\2\u00f9\u00fa\7?\2\2\u00fa*\3\2\2\2\u00fb\u00fc"+
		"\7>\2\2\u00fc\u00fd\7?\2\2\u00fd,\3\2\2\2\u00fe\u00ff\7?\2\2\u00ff\u0100"+
		"\7?\2\2\u0100.\3\2\2\2\u0101\u0102\7#\2\2\u0102\u0103\7?\2\2\u0103\60"+
		"\3\2\2\2\u0104\u0105\7(\2\2\u0105\u0106\7(\2\2\u0106\62\3\2\2\2\u0107"+
		"\u0108\7~\2\2\u0108\u0109\7~\2\2\u0109\64\3\2\2\2\u010a\u010b\7\"\2\2"+
		"\u010b\u010c\7_\2\2\u010c\66\3\2\2\2\u010d\u010e\7,\2\2\u010e\u010f\7"+
		"?\2\2\u010f8\3\2\2\2\u0110\u0111\7\61\2\2\u0111\u0112\7?\2\2\u0112:\3"+
		"\2\2\2\u0113\u0114\7\'\2\2\u0114\u0115\7?\2\2\u0115<\3\2\2\2\u0116\u0117"+
		"\7-\2\2\u0117\u0118\7?\2\2\u0118>\3\2\2\2\u0119\u011a\7/\2\2\u011a\u011b"+
		"\7?\2\2\u011b@\3\2\2\2\u011c\u011d\7(\2\2\u011d\u011e\7?\2\2\u011eB\3"+
		"\2\2\2\u011f\u0120\7`\2\2\u0120\u0121\7?\2\2\u0121D\3\2\2\2\u0122\u0123"+
		"\7~\2\2\u0123\u0124\7?\2\2\u0124F\3\2\2\2\u0125\u0126\7A\2\2\u0126H\3"+
		"\2\2\2\u0127\u0128\7<\2\2\u0128J\3\2\2\2\u0129\u012a\7\u0080\2\2\u012a"+
		"L\3\2\2\2\u012b\u012c\7#\2\2\u012cN\3\2\2\2\u012d\u012e\7y\2\2\u012e\u012f"+
		"\7j\2\2\u012f\u0130\7k\2\2\u0130\u0131\7n\2\2\u0131\u0132\7g\2\2\u0132"+
		"P\3\2\2\2\u0133\u0134\7k\2\2\u0134\u0135\7h\2\2\u0135R\3\2\2\2\u0136\u0137"+
		"\7g\2\2\u0137\u0138\7n\2\2\u0138\u0139\7u\2\2\u0139\u013a\7g\2\2\u013a"+
		"T\3\2\2\2\u013b\u013c\7h\2\2\u013c\u013d\7q\2\2\u013d\u013e\7t\2\2\u013e"+
		"V\3\2\2\2\u013f\u0140\7e\2\2\u0140\u0141\7q\2\2\u0141\u0142\7p\2\2\u0142"+
		"\u0143\7u\2\2\u0143\u0144\7v\2\2\u0144X\3\2\2\2\u0145\u0146\7r\2\2\u0146"+
		"\u0147\7t\2\2\u0147\u0148\7k\2\2\u0148\u0149\7p\2\2\u0149\u014a\7v\2\2"+
		"\u014a\u014b\7h\2\2\u014bZ\3\2\2\2\u014c\u014d\7u\2\2\u014d\u014e\7e\2"+
		"\2\u014e\u014f\7c\2\2\u014f\u0150\7p\2\2\u0150\u0151\7h\2\2\u0151\\\3"+
		"\2\2\2\u0152\u0154\7$\2\2\u0153\u0155\5\u00c5c\2\u0154\u0153\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0158\5_\60\2\u0157\u0156\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015c\3\2\2\2\u015b\u015d\5\u00c5c\2\u015c\u015b\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\7$\2\2\u015f\u0199\3\2\2\2\u0160"+
		"\u0162\7$\2\2\u0161\u0163\5\u00c5c\2\u0162\u0161\3\2\2\2\u0162\u0163\3"+
		"\2\2\2\u0163\u0165\3\2\2\2\u0164\u0166\5a\61\2\u0165\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2"+
		"\2\2\u0169\u016b\5\u00c5c\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016d\7$\2\2\u016d\u0199\3\2\2\2\u016e\u0170\7$\2"+
		"\2\u016f\u0171\5\u00c5c\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0173\3\2\2\2\u0172\u0174\5c\62\2\u0173\u0172\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177"+
		"\u0179\5\u00c5c\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a"+
		"\3\2\2\2\u017a\u017b\7$\2\2\u017b\u0199\3\2\2\2\u017c\u017e\7$\2\2\u017d"+
		"\u017f\5\u00c5c\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181"+
		"\3\2\2\2\u0180\u0182\5e\63\2\u0181\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0187\5\u00c5"+
		"c\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u0189\7$\2\2\u0189\u0199\3\2\2\2\u018a\u018c\7$\2\2\u018b\u018d\5\u00c5"+
		"c\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e"+
		"\u0190\5g\64\2\u018f\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u018f\3\2"+
		"\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193\u0195\5\u00c5c\2\u0194"+
		"\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\7$"+
		"\2\2\u0197\u0199\3\2\2\2\u0198\u0152\3\2\2\2\u0198\u0160\3\2\2\2\u0198"+
		"\u016e\3\2\2\2\u0198\u017c\3\2\2\2\u0198\u018a\3\2\2\2\u0199^\3\2\2\2"+
		"\u019a\u019b\5\u0099M\2\u019b\u019c\5\u00a3R\2\u019c`\3\2\2\2\u019d\u019f"+
		"\5\u0099M\2\u019e\u01a0\5y=\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2"+
		"\u01a0\u01a1\3\2\2\2\u01a1\u01a2\5\u00a3R\2\u01a2b\3\2\2\2\u01a3\u01a5"+
		"\5\u0099M\2\u01a4\u01a6\5y=\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2"+
		"\u01a6\u01a8\3\2\2\2\u01a7\u01a9\5{>\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9"+
		"\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\5\u00a3R\2\u01abd\3\2\2\2\u01ac"+
		"\u01ae\5\u0099M\2\u01ad\u01af\5y=\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3"+
		"\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01b2\5{>\2\u01b1\u01b0\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b5\5}?\2\u01b4\u01b3\3\2\2"+
		"\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\5\u00a3R\2\u01b7"+
		"f\3\2\2\2\u01b8\u01ba\5\u0099M\2\u01b9\u01bb\5y=\2\u01ba\u01b9\3\2\2\2"+
		"\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01be\5{>\2\u01bd\u01bc"+
		"\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01c1\5}?\2\u01c0"+
		"\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c4\5\u00a1"+
		"Q\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"\u01c6\5\u00a3R\2\u01c6h\3\2\2\2\u01c7\u01c8\7$\2\2\u01c8\u01c9\5\u00c5"+
		"c\2\u01c9\u01ca\7$\2\2\u01caj\3\2\2\2\u01cb\u01d0\5m\67\2\u01cc\u01d0"+
		"\5o8\2\u01cd\u01d0\5s:\2\u01ce\u01d0\5q9\2\u01cf\u01cb\3\2\2\2\u01cf\u01cc"+
		"\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0l\3\2\2\2\u01d1"+
		"\u01d5\5\u00afX\2\u01d2\u01d5\5\u00b1Y\2\u01d3\u01d5\5\u00b3Z\2\u01d4"+
		"\u01d1\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d3\3\2\2\2\u01d5n\3\2\2\2"+
		"\u01d6\u01d8\7)\2\2\u01d7\u01d9\7^\2\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9"+
		"\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\13\2\2\2\u01db\u01dc\7)\2\2\u01dc"+
		"p\3\2\2\2\u01dd\u01e2\7$\2\2\u01de\u01e1\5\u00a7T\2\u01df\u01e1\13\2\2"+
		"\2\u01e0\u01de\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e3"+
		"\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5"+
		"\u01e6\7$\2\2\u01e6r\3\2\2\2\u01e7\u01e9\5\u00b5[\2\u01e8\u01e7\3\2\2"+
		"\2\u01e8\u01e9\3\2\2\2\u01e9\u01f4\3\2\2\2\u01ea\u01eb\5\u00bd_\2\u01eb"+
		"\u01ec\7\60\2\2\u01ec\u01f5\3\2\2\2\u01ed\u01ee\7\60\2\2\u01ee\u01f5\5"+
		"\u00abV\2\u01ef\u01f0\5\u00bd_\2\u01f0\u01f1\7\60\2\2\u01f1\u01f2\5\u00ab"+
		"V\2\u01f2\u01f5\3\2\2\2\u01f3\u01f5\5\u00adW\2\u01f4\u01ea\3\2\2\2\u01f4"+
		"\u01ed\3\2\2\2\u01f4\u01ef\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f7\3\2"+
		"\2\2\u01f6\u01f8\5\u00b7\\\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"t\3\2\2\2\u01f9\u0200\5\u0089E\2\u01fa\u0200\5\177@\2\u01fb\u0200\5\u008b"+
		"F\2\u01fc\u0200\5\u0081A\2\u01fd\u0200\5\u0085C\2\u01fe\u0200\5\u0087"+
		"D\2\u01ff\u01f9\3\2\2\2\u01ff\u01fa\3\2\2\2\u01ff\u01fb\3\2\2\2\u01ff"+
		"\u01fc\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200v\3\2\2\2"+
		"\u0201\u0202\7%\2\2\u0202\u0203\7k\2\2\u0203\u0204\7p\2\2\u0204\u0205"+
		"\7e\2\2\u0205\u0206\7n\2\2\u0206\u0207\7w\2\2\u0207\u0208\7f\2\2\u0208"+
		"\u0209\7g\2\2\u0209x\3\2\2\2\u020a\u020e\5\u00b5[\2\u020b\u020e\5\u009b"+
		"N\2\u020c\u020e\5\u009fP\2\u020d\u020a\3\2\2\2\u020d\u020b\3\2\2\2\u020d"+
		"\u020c\3\2\2\2\u020ez\3\2\2\2\u020f\u0212\5m\67\2\u0210\u0212\5\u009d"+
		"O\2\u0211\u020f\3\2\2\2\u0211\u0210\3\2\2\2\u0212|\3\2\2\2\u0213\u0214"+
		"\7\60\2\2\u0214\u0215\5{>\2\u0215~\3\2\2\2\u0216\u0217\7k\2\2\u0217\u0218"+
		"\7p\2\2\u0218\u0219\7v\2\2\u0219\u0080\3\2\2\2\u021a\u021b\7h\2\2\u021b"+
		"\u021c\7n\2\2\u021c\u021d\7q\2\2\u021d\u021e\7c\2\2\u021e\u021f\7v\2\2"+
		"\u021f\u0082\3\2\2\2\u0220\u0221\7x\2\2\u0221\u0222\7q\2\2\u0222\u0223"+
		"\7k\2\2\u0223\u0224\7f\2\2\u0224\u0084\3\2\2\2\u0225\u0226\7f\2\2\u0226"+
		"\u0227\7q\2\2\u0227\u0228\7w\2\2\u0228\u0229\7d\2\2\u0229\u022a\7n\2\2"+
		"\u022a\u022b\7g\2\2\u022b\u0086\3\2\2\2\u022c\u022d\7e\2\2\u022d\u022e"+
		"\7j\2\2\u022e\u022f\7c\2\2\u022f\u0230\7t\2\2\u0230\u0088\3\2\2\2\u0231"+
		"\u0232\7u\2\2\u0232\u0233\7j\2\2\u0233\u0234\7q\2\2\u0234\u0235\7t\2\2"+
		"\u0235\u0236\7v\2\2\u0236\u008a\3\2\2\2\u0237\u0238\7n\2\2\u0238\u0239"+
		"\7q\2\2\u0239\u023a\7p\2\2\u023a\u023b\7i\2\2\u023b\u008c\3\2\2\2\u023c"+
		"\u023d\7d\2\2\u023d\u023e\7t\2\2\u023e\u023f\7g\2\2\u023f\u0240\7c\2\2"+
		"\u0240\u0241\7m\2\2\u0241\u008e\3\2\2\2\u0242\u0243\7e\2\2\u0243\u0244"+
		"\7q\2\2\u0244\u0245\7p\2\2\u0245\u0246\7v\2\2\u0246\u0247\7k\2\2\u0247"+
		"\u0248\7p\2\2\u0248\u0249\7w\2\2\u0249\u024a\7g\2\2\u024a\u0090\3\2\2"+
		"\2\u024b\u024c\7-\2\2\u024c\u024d\7-\2\2\u024d\u0092\3\2\2\2\u024e\u024f"+
		"\7/\2\2\u024f\u0250\7/\2\2\u0250\u0094\3\2\2\2\u0251\u0255\5\u00c1a\2"+
		"\u0252\u0254\5\u00c3b\2\u0253\u0252\3\2\2\2\u0254\u0257\3\2\2\2\u0255"+
		"\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0096\3\2\2\2\u0257\u0255\3\2"+
		"\2\2\u0258\u0259\5\u0095K\2\u0259\u025a\7\60\2\2\u025a\u025b\5\u0095K"+
		"\2\u025b\u0098\3\2\2\2\u025c\u025d\7\'\2\2\u025d\u009a\3\2\2\2\u025e\u025f"+
		"\7%\2\2\u025f\u009c\3\2\2\2\u0260\u0261\7,\2\2\u0261\u009e\3\2\2\2\u0262"+
		"\u0263\7\62\2\2\u0263\u00a0\3\2\2\2\u0264\u0265\t\2\2\2\u0265\u00a2\3"+
		"\2\2\2\u0266\u0269\t\3\2\2\u0267\u0269\5\u0099M\2\u0268\u0266\3\2\2\2"+
		"\u0268\u0267\3\2\2\2\u0269\u00a4\3\2\2\2\u026a\u026b\7\"\2\2\u026b\u00a6"+
		"\3\2\2\2\u026c\u026d\7^\2\2\u026d\u0273\7$\2\2\u026e\u026f\7^\2\2\u026f"+
		"\u0273\7^\2\2\u0270\u0271\7^\2\2\u0271\u0273\t\4\2\2\u0272\u026c\3\2\2"+
		"\2\u0272\u026e\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u00a8\3\2\2\2\u0274\u0275"+
		"\7\60\2\2\u0275\u0276\5\u0095K\2\u0276\u00aa\3\2\2\2\u0277\u0279\5\u00bd"+
		"_\2\u0278\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u0278\3\2\2\2\u027a"+
		"\u027b\3\2\2\2\u027b\u028b\3\2\2\2\u027c\u027e\5\u00bd_\2\u027d\u027c"+
		"\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280"+
		"\u0281\3\2\2\2\u0281\u0283\t\5\2\2\u0282\u0284\5\u00b5[\2\u0283\u0282"+
		"\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0286\3\2\2\2\u0285\u0287\5\u00bd_"+
		"\2\u0286\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289"+
		"\3\2\2\2\u0289\u028b\3\2\2\2\u028a\u0278\3\2\2\2\u028a\u027d\3\2\2\2\u028b"+
		"\u00ac\3\2\2\2\u028c\u028e\5\u00bd_\2\u028d\u028c\3\2\2\2\u028e\u028f"+
		"\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\3\2\2\2\u0291"+
		"\u0293\t\5\2\2\u0292\u0294\5\u00b5[\2\u0293\u0292\3\2\2\2\u0293\u0294"+
		"\3\2\2\2\u0294\u0296\3\2\2\2\u0295\u0297\5\u00bd_\2\u0296\u0295\3\2\2"+
		"\2\u0297\u0298\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u00ae"+
		"\3\2\2\2\u029a\u029c\7\62\2\2\u029b\u029d\4\629\2\u029c\u029b\3\2\2\2"+
		"\u029d\u029e\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u00b0"+
		"\3\2\2\2\u02a0\u02a1\7\62\2\2\u02a1\u02a5\7z\2\2\u02a2\u02a3\7\62\2\2"+
		"\u02a3\u02a5\7Z\2\2\u02a4\u02a0\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a5\u02a7"+
		"\3\2\2\2\u02a6\u02a8\5\u00bf`\2\u02a7\u02a6\3\2\2\2\u02a8\u02a9\3\2\2"+
		"\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u00b2\3\2\2\2\u02ab\u02ac"+
		"\5\u00bd_\2\u02ac\u00b4\3\2\2\2\u02ad\u02ae\t\6\2\2\u02ae\u00b6\3\2\2"+
		"\2\u02af\u02b0\t\7\2\2\u02b0\u00b8\3\2\2\2\u02b1\u02b4\5\u00c7d\2\u02b2"+
		"\u02b4\5\u00c9e\2\u02b3\u02b1\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b4\u00ba"+
		"\3\2\2\2\u02b5\u02b6\t\b\2\2\u02b6\u00bc\3\2\2\2\u02b7\u02b9\5\u00bb^"+
		"\2\u02b8\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb"+
		"\3\2\2\2\u02bb\u00be\3\2\2\2\u02bc\u02bf\t\t\2\2\u02bd\u02bf\5\u00bb^"+
		"\2\u02be\u02bc\3\2\2\2\u02be\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02be"+
		"\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u00c0\3\2\2\2\u02c2\u02c3\t\n\2\2\u02c3"+
		"\u00c2\3\2\2\2\u02c4\u02c7\5\u00bb^\2\u02c5\u02c7\5\u00c1a\2\u02c6\u02c4"+
		"\3\2\2\2\u02c6\u02c5\3\2\2\2\u02c7\u00c4\3\2\2\2\u02c8\u02cb\5\u00a7T"+
		"\2\u02c9\u02cb\13\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02c9\3\2\2\2\u02cb"+
		"\u02ce\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cd\u00c6\3\2"+
		"\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02d0\7\61\2\2\u02d0\u02d1\7\61\2\2\u02d1"+
		"\u02d5\3\2\2\2\u02d2\u02d4\13\2\2\2\u02d3\u02d2\3\2\2\2\u02d4\u02d7\3"+
		"\2\2\2\u02d5\u02d6\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02dd\3\2\2\2\u02d7"+
		"\u02d5\3\2\2\2\u02d8\u02da\7\17\2\2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3"+
		"\2\2\2\u02da\u02db\3\2\2\2\u02db\u02de\7\f\2\2\u02dc\u02de\7\2\2\3\u02dd"+
		"\u02d9\3\2\2\2\u02dd\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\bd"+
		"\2\2\u02e0\u00c8\3\2\2\2\u02e1\u02e2\7\61\2\2\u02e2\u02e3\7,\2\2\u02e3"+
		"\u02e7\3\2\2\2\u02e4\u02e6\13\2\2\2\u02e5\u02e4\3\2\2\2\u02e6\u02e9\3"+
		"\2\2\2\u02e7\u02e8\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02ea\3\2\2\2\u02e9"+
		"\u02e7\3\2\2\2\u02ea\u02eb\7,\2\2\u02eb\u02ec\7\61\2\2\u02ec\u02ed\3\2"+
		"\2\2\u02ed\u02ee\be\2\2\u02ee\u00ca\3\2\2\2\u02ef\u02f0\t\13\2\2\u02f0"+
		"\u02f1\3\2\2\2\u02f1\u02f2\bf\2\2\u02f2\u00cc\3\2\2\2A\2\u0154\u0159\u015c"+
		"\u0162\u0167\u016a\u0170\u0175\u0178\u017e\u0183\u0186\u018c\u0191\u0194"+
		"\u0198\u019f\u01a5\u01a8\u01ae\u01b1\u01b4\u01ba\u01bd\u01c0\u01c3\u01cf"+
		"\u01d4\u01d8\u01e0\u01e2\u01e8\u01f4\u01f7\u01ff\u020d\u0211\u0255\u0268"+
		"\u0272\u027a\u027f\u0283\u0288\u028a\u028f\u0293\u0298\u029e\u02a4\u02a9"+
		"\u02b3\u02ba\u02be\u02c0\u02c6\u02ca\u02cc\u02d5\u02d9\u02dd\u02e7\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}