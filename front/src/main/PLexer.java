// Generated from /home/ppiedel/IdeaProjects/Compiler/front/src/main/P.g4 by ANTLR 4.7
package main;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NEW=5, NUMBER=6, NUMBER_FLOAT=7, INT=8, 
		FLOAT=9, STATIC=10, STRING=11, STRING_LITERAL=12, PRINT=13, READ_INT=14, 
		READ_FLOAT=15, FUN=16, IF=17, WHILE=18, RETURN=19, ID=20, EQUALS=21, COLON=22, 
		DOUBLE_QUOTE=23, ADD=24, MINUS=25, BOOL_OPERATOR=26, MUTLIPLY=27, DIVIDE=28, 
		LEFT_BRACKET=29, RIGHT_BRACKET=30, LEFT_SQUARE_BRACKET=31, RIGHT_SQUARE_BRACKET=32, 
		WS=33, COMMENT=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "NEW", "NUMBER", "NUMBER_FLOAT", "DIGIT", 
		"INT", "FLOAT", "STATIC", "STRING", "STRING_LITERAL", "StringCharacters", 
		"StringCharacter", "PRINT", "READ_INT", "READ_FLOAT", "FUN", "IF", "WHILE", 
		"RETURN", "ID", "EQUALS", "COLON", "DOUBLE_QUOTE", "ADD", "MINUS", "BOOL_OPERATOR", 
		"MUTLIPLY", "DIVIDE", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_SQUARE_BRACKET", 
		"RIGHT_SQUARE_BRACKET", "WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'{'", "'}'", "','", "'new'", null, null, "'int'", "'float'", 
		"'static'", "'String'", null, "'print'", "'readInt'", "'readFloat'", "'fun'", 
		"'if'", "'while'", "'return'", null, "'='", "':'", "'\"'", "'+'", "'-'", 
		null, "'*'", "'/'", "'('", "')'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "NEW", "NUMBER", "NUMBER_FLOAT", "INT", 
		"FLOAT", "STATIC", "STRING", "STRING_LITERAL", "PRINT", "READ_INT", "READ_FLOAT", 
		"FUN", "IF", "WHILE", "RETURN", "ID", "EQUALS", "COLON", "DOUBLE_QUOTE", 
		"ADD", "MINUS", "BOOL_OPERATOR", "MUTLIPLY", "DIVIDE", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "WS", 
		"COMMENT"
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


	public PLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "P.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u010b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\6\7[\n\7\r\7\16\7\\\3\b\6\b`\n\b\r\b\16\ba\3\b\3\b"+
		"\7\bf\n\b\f\b\16\bi\13\b\3\b\3\b\6\bm\n\b\r\b\16\bn\5\bq\n\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u008f\n\16\3\16\3\16\3\17"+
		"\6\17\u0094\n\17\r\17\16\17\u0095\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\7\30\u00c8"+
		"\n\30\f\30\16\30\u00cb\13\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00de\n\36\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\7&\u00f4\n&\f"+
		"&\16&\u00f7\13&\3&\5&\u00fa\n&\3&\3&\3&\3&\3&\7&\u0101\n&\f&\16&\u0104"+
		"\13&\3&\3&\5&\u0108\n&\3&\3&\3\u0102\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\2\23\n\25\13\27\f\31\r\33\16\35\2\37\2!\17#\20%\21\'\22)\23+\24-\25"+
		"/\26\61\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$\3\2\b\6\2"+
		"\f\f\17\17$$^^\4\2C\\c|\5\2\62;C\\c|\4\2>>@@\5\2\f\f\17\17\"\"\4\2\f\f"+
		"\17\17\2\u0116\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3"+
		"M\3\2\2\2\5O\3\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2\rZ\3\2\2\2\17p"+
		"\3\2\2\2\21r\3\2\2\2\23t\3\2\2\2\25x\3\2\2\2\27~\3\2\2\2\31\u0085\3\2"+
		"\2\2\33\u008c\3\2\2\2\35\u0093\3\2\2\2\37\u0097\3\2\2\2!\u0099\3\2\2\2"+
		"#\u009f\3\2\2\2%\u00a7\3\2\2\2\'\u00b1\3\2\2\2)\u00b5\3\2\2\2+\u00b8\3"+
		"\2\2\2-\u00be\3\2\2\2/\u00c5\3\2\2\2\61\u00cc\3\2\2\2\63\u00ce\3\2\2\2"+
		"\65\u00d0\3\2\2\2\67\u00d2\3\2\2\29\u00d4\3\2\2\2;\u00dd\3\2\2\2=\u00df"+
		"\3\2\2\2?\u00e1\3\2\2\2A\u00e3\3\2\2\2C\u00e5\3\2\2\2E\u00e7\3\2\2\2G"+
		"\u00e9\3\2\2\2I\u00eb\3\2\2\2K\u0107\3\2\2\2MN\7=\2\2N\4\3\2\2\2OP\7}"+
		"\2\2P\6\3\2\2\2QR\7\177\2\2R\b\3\2\2\2ST\7.\2\2T\n\3\2\2\2UV\7p\2\2VW"+
		"\7g\2\2WX\7y\2\2X\f\3\2\2\2Y[\5\21\t\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2"+
		"\\]\3\2\2\2]\16\3\2\2\2^`\5\21\t\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2"+
		"\2\2bc\3\2\2\2cg\7\60\2\2df\5\21\t\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3"+
		"\2\2\2hq\3\2\2\2ig\3\2\2\2jl\7\60\2\2km\5\21\t\2lk\3\2\2\2mn\3\2\2\2n"+
		"l\3\2\2\2no\3\2\2\2oq\3\2\2\2p_\3\2\2\2pj\3\2\2\2q\20\3\2\2\2rs\4\62;"+
		"\2s\22\3\2\2\2tu\7k\2\2uv\7p\2\2vw\7v\2\2w\24\3\2\2\2xy\7h\2\2yz\7n\2"+
		"\2z{\7q\2\2{|\7c\2\2|}\7v\2\2}\26\3\2\2\2~\177\7u\2\2\177\u0080\7v\2\2"+
		"\u0080\u0081\7c\2\2\u0081\u0082\7v\2\2\u0082\u0083\7k\2\2\u0083\u0084"+
		"\7e\2\2\u0084\30\3\2\2\2\u0085\u0086\7U\2\2\u0086\u0087\7v\2\2\u0087\u0088"+
		"\7t\2\2\u0088\u0089\7k\2\2\u0089\u008a\7p\2\2\u008a\u008b\7i\2\2\u008b"+
		"\32\3\2\2\2\u008c\u008e\7$\2\2\u008d\u008f\5\35\17\2\u008e\u008d\3\2\2"+
		"\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7$\2\2\u0091\34"+
		"\3\2\2\2\u0092\u0094\5\37\20\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2"+
		"\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\36\3\2\2\2\u0097\u0098"+
		"\n\2\2\2\u0098 \3\2\2\2\u0099\u009a\7r\2\2\u009a\u009b\7t\2\2\u009b\u009c"+
		"\7k\2\2\u009c\u009d\7p\2\2\u009d\u009e\7v\2\2\u009e\"\3\2\2\2\u009f\u00a0"+
		"\7t\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7f\2\2\u00a3"+
		"\u00a4\7K\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7v\2\2\u00a6$\3\2\2\2\u00a7"+
		"\u00a8\7t\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7f\2\2"+
		"\u00ab\u00ac\7H\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af"+
		"\7c\2\2\u00af\u00b0\7v\2\2\u00b0&\3\2\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3"+
		"\7w\2\2\u00b3\u00b4\7p\2\2\u00b4(\3\2\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7"+
		"\7h\2\2\u00b7*\3\2\2\2\u00b8\u00b9\7y\2\2\u00b9\u00ba\7j\2\2\u00ba\u00bb"+
		"\7k\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7g\2\2\u00bd,\3\2\2\2\u00be\u00bf"+
		"\7t\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7w\2\2\u00c2"+
		"\u00c3\7t\2\2\u00c3\u00c4\7p\2\2\u00c4.\3\2\2\2\u00c5\u00c9\t\3\2\2\u00c6"+
		"\u00c8\t\4\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\60\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd"+
		"\7?\2\2\u00cd\62\3\2\2\2\u00ce\u00cf\7<\2\2\u00cf\64\3\2\2\2\u00d0\u00d1"+
		"\7$\2\2\u00d1\66\3\2\2\2\u00d2\u00d3\7-\2\2\u00d38\3\2\2\2\u00d4\u00d5"+
		"\7/\2\2\u00d5:\3\2\2\2\u00d6\u00de\t\5\2\2\u00d7\u00d8\7?\2\2\u00d8\u00de"+
		"\7?\2\2\u00d9\u00da\7>\2\2\u00da\u00de\7?\2\2\u00db\u00dc\7@\2\2\u00dc"+
		"\u00de\7?\2\2\u00dd\u00d6\3\2\2\2\u00dd\u00d7\3\2\2\2\u00dd\u00d9\3\2"+
		"\2\2\u00dd\u00db\3\2\2\2\u00de<\3\2\2\2\u00df\u00e0\7,\2\2\u00e0>\3\2"+
		"\2\2\u00e1\u00e2\7\61\2\2\u00e2@\3\2\2\2\u00e3\u00e4\7*\2\2\u00e4B\3\2"+
		"\2\2\u00e5\u00e6\7+\2\2\u00e6D\3\2\2\2\u00e7\u00e8\7]\2\2\u00e8F\3\2\2"+
		"\2\u00e9\u00ea\7_\2\2\u00eaH\3\2\2\2\u00eb\u00ec\t\6\2\2\u00ec\u00ed\3"+
		"\2\2\2\u00ed\u00ee\b%\2\2\u00eeJ\3\2\2\2\u00ef\u00f0\7\61\2\2\u00f0\u00f1"+
		"\7\61\2\2\u00f1\u00f5\3\2\2\2\u00f2\u00f4\n\7\2\2\u00f3\u00f2\3\2\2\2"+
		"\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f9"+
		"\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fa\7\17\2\2\u00f9\u00f8\3\2\2\2"+
		"\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0108\7\f\2\2\u00fc\u00fd"+
		"\7\61\2\2\u00fd\u00fe\7,\2\2\u00fe\u0102\3\2\2\2\u00ff\u0101\13\2\2\2"+
		"\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0103\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7,\2\2\u0106"+
		"\u0108\7\61\2\2\u0107\u00ef\3\2\2\2\u0107\u00fc\3\2\2\2\u0108\u0109\3"+
		"\2\2\2\u0109\u010a\b&\2\2\u010aL\3\2\2\2\20\2\\agnp\u008e\u0095\u00c9"+
		"\u00dd\u00f5\u00f9\u0102\u0107\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}