// Generated from /Users/diana_ghindaoanu/Documents/ALF_2022/ALF_TP_2021/TP3/ex6/Python.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PythonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LP=1, RP=2, PLUS=3, MINUS=4, EGAL=5, COLON=6, SEMICOLON=7, LB=8, RB=9, 
		LSP=10, RSP=11, MUL=12, DIV=13, REM=14, FOR=15, IF=16, ELSE=17, WHILE=18, 
		CLASS=19, BREAK=20, DEF=21, IN=22, WS=23, INT=24, VARIABLE=25, FUNCTION_NAME=26, 
		FLOAT=27, NEWLINE=28, STRING=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LP", "RP", "PLUS", "MINUS", "EGAL", "COLON", "SEMICOLON", "LB", "RB", 
			"LSP", "RSP", "MUL", "DIV", "REM", "FOR", "IF", "ELSE", "WHILE", "CLASS", 
			"BREAK", "DEF", "IN", "WS", "INT", "VARIABLE", "FUNCTION_NAME", "FLOAT", 
			"NEWLINE", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'+'", "'-'", "'='", "':'", "';'", "'{'", "'}'", 
			"'['", "']'", "'*'", "'/'", "'%'", "'for'", "'if'", "'else'", "'while'", 
			"'class'", "'break'", "'def'", "'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LP", "RP", "PLUS", "MINUS", "EGAL", "COLON", "SEMICOLON", "LB", 
			"RB", "LSP", "RSP", "MUL", "DIV", "REM", "FOR", "IF", "ELSE", "WHILE", 
			"CLASS", "BREAK", "DEF", "IN", "WS", "INT", "VARIABLE", "FUNCTION_NAME", 
			"FLOAT", "NEWLINE", "STRING"
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


	public PythonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Python.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00b4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\6\30\u0080\n\30\r\30\16\30\u0081\3\31\6\31\u0085\n\31"+
		"\r\31\16\31\u0086\3\32\6\32\u008a\n\32\r\32\16\32\u008b\3\33\3\33\7\33"+
		"\u0090\n\33\f\33\16\33\u0093\13\33\3\34\6\34\u0096\n\34\r\34\16\34\u0097"+
		"\3\34\3\34\6\34\u009c\n\34\r\34\16\34\u009d\3\35\6\35\u00a1\n\35\r\35"+
		"\16\35\u00a2\3\36\3\36\6\36\u00a7\n\36\r\36\16\36\u00a8\3\36\3\36\3\36"+
		"\6\36\u00ae\n\36\r\36\16\36\u00af\3\36\5\36\u00b3\n\36\2\2\37\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\n\3"+
		"\2\"\"\3\2\62;\5\2\62;C\\c|\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\3"+
		"\2$$\3\2))\2\u00bd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13"+
		"E\3\2\2\2\rG\3\2\2\2\17I\3\2\2\2\21K\3\2\2\2\23M\3\2\2\2\25O\3\2\2\2\27"+
		"Q\3\2\2\2\31S\3\2\2\2\33U\3\2\2\2\35W\3\2\2\2\37Y\3\2\2\2!]\3\2\2\2#`"+
		"\3\2\2\2%e\3\2\2\2\'k\3\2\2\2)q\3\2\2\2+w\3\2\2\2-{\3\2\2\2/\177\3\2\2"+
		"\2\61\u0084\3\2\2\2\63\u0089\3\2\2\2\65\u008d\3\2\2\2\67\u0095\3\2\2\2"+
		"9\u00a0\3\2\2\2;\u00b2\3\2\2\2=>\7*\2\2>\4\3\2\2\2?@\7+\2\2@\6\3\2\2\2"+
		"AB\7-\2\2B\b\3\2\2\2CD\7/\2\2D\n\3\2\2\2EF\7?\2\2F\f\3\2\2\2GH\7<\2\2"+
		"H\16\3\2\2\2IJ\7=\2\2J\20\3\2\2\2KL\7}\2\2L\22\3\2\2\2MN\7\177\2\2N\24"+
		"\3\2\2\2OP\7]\2\2P\26\3\2\2\2QR\7_\2\2R\30\3\2\2\2ST\7,\2\2T\32\3\2\2"+
		"\2UV\7\61\2\2V\34\3\2\2\2WX\7\'\2\2X\36\3\2\2\2YZ\7h\2\2Z[\7q\2\2[\\\7"+
		"t\2\2\\ \3\2\2\2]^\7k\2\2^_\7h\2\2_\"\3\2\2\2`a\7g\2\2ab\7n\2\2bc\7u\2"+
		"\2cd\7g\2\2d$\3\2\2\2ef\7y\2\2fg\7j\2\2gh\7k\2\2hi\7n\2\2ij\7g\2\2j&\3"+
		"\2\2\2kl\7e\2\2lm\7n\2\2mn\7c\2\2no\7u\2\2op\7u\2\2p(\3\2\2\2qr\7d\2\2"+
		"rs\7t\2\2st\7g\2\2tu\7c\2\2uv\7m\2\2v*\3\2\2\2wx\7f\2\2xy\7g\2\2yz\7h"+
		"\2\2z,\3\2\2\2{|\7k\2\2|}\7p\2\2}.\3\2\2\2~\u0080\t\2\2\2\177~\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\60\3"+
		"\2\2\2\u0083\u0085\t\3\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\62\3\2\2\2\u0088\u008a\t\4\2"+
		"\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\64\3\2\2\2\u008d\u0091\t\5\2\2\u008e\u0090\t\6\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\66\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096\t\3\2\2\u0095\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\7\60\2\2\u009a\u009c\t\3\2\2\u009b\u009a\3"+
		"\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"8\3\2\2\2\u009f\u00a1\t\7\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2"+
		"\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3:\3\2\2\2\u00a4\u00a6\7"+
		"$\2\2\u00a5\u00a7\n\b\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00b3\7$"+
		"\2\2\u00ab\u00ad\7)\2\2\u00ac\u00ae\n\t\2\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b3\7)\2\2\u00b2\u00a4\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b3"+
		"<\3\2\2\2\r\2\u0081\u0086\u008b\u0091\u0097\u009d\u00a2\u00a8\u00af\u00b2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}