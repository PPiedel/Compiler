// Generated from /home/ppiedel/IdeaProjects/Compiler/front/src/main/P.g4 by ANTLR 4.7
package main;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, NEW = 5, NUMBER = 6, NUMBER_FLOAT = 7, INT = 8,
            FLOAT = 9, STATIC = 10, STRING = 11, STRING_LITERAL = 12, PRINT = 13, READ_INT = 14,
            READ_FLOAT = 15, FUN = 16, IF = 17, RETURN = 18, ID = 19, EQUALS = 20, COLON = 21, DOUBLE_QUOTE = 22,
            ADD = 23, MINUS = 24, BOOL_OPERATOR = 25, MUTLIPLY = 26, DIVIDE = 27, LEFT_BRACKET = 28,
            RIGHT_BRACKET = 29, LEFT_SQUARE_BRACKET = 30, RIGHT_SQUARE_BRACKET = 31, WS = 32,
            COMMENT = 33;
	public static final int
            RULE_program = 0, RULE_body = 1, RULE_function = 2, RULE_ifExpr = 3, RULE_statement = 4,
            RULE_boolExpr = 5, RULE_expression = 6, RULE_indexingExpression = 7, RULE_assignment = 8,
            RULE_variable_declaration = 9, RULE_array = 10, RULE_print = 11, RULE_returnst = 12,
            RULE_read = 13;
	public static final String[] ruleNames = {
            "program", "body", "function", "ifExpr", "statement", "boolExpr", "expression",
            "indexingExpression", "assignment", "variable_declaration", "array", "print",
            "returnst", "read"
	};
	public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0120\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\7\2!\n\2\f\2\16\2$\13" +
                    "\2\3\2\3\2\6\2(\n\2\r\2\16\2)\3\2\3\2\3\2\3\2\7\2\60\n\2\f\2\16\2\63\13" +
                    "\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\3\3\3\7\3>\n\3\f\3\16\3A\13\3\3" +
                    "\3\3\3\3\3\6\3F\n\3\r\3\16\3G\3\3\3\3\3\3\7\3M\n\3\f\3\16\3P\13\3\3\3" +
                    "\6\3S\n\3\r\3\16\3T\5\3W\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7" +
                    "\4c\n\4\f\4\16\4f\13\4\5\4h\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3" +
                    "\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6" +
                    "\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008b\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u0092\n" +
                    "\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a2\n" +
                    "\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b" +
                    "\3\b\3\b\3\b\7\b\u00b8\n\b\f\b\16\b\u00bb\13\b\3\t\3\t\3\t\3\t\3\t\3\t" +
                    "\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3" +
                    "\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3" +
                    "\13\3\13\5\13\u00e2\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3" +
                    "\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00fa\n\f\3\r\3\r\3\r\3" +
                    "\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0109\n\r\3\16\3\16\3\16\3" +
                    "\16\3\16\3\16\5\16\u0111\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17" +
                    "\3\17\3\17\3\17\5\17\u011e\n\17\3\17\2\3\16\20\2\4\6\b\n\f\16\20\22\24" +
                    "\26\30\32\34\2\3\3\2\n\13\2\u0134\2\36\3\2\2\2\4;\3\2\2\2\6Z\3\2\2\2\b" +
                    "p\3\2\2\2\n\u008a\3\2\2\2\f\u0091\3\2\2\2\16\u00a1\3\2\2\2\20\u00bc\3" +
                    "\2\2\2\22\u00c4\3\2\2\2\24\u00e1\3\2\2\2\26\u00f9\3\2\2\2\30\u0108\3\2" +
                    "\2\2\32\u0110\3\2\2\2\34\u011d\3\2\2\2\36\"\b\2\1\2\37!\7\3\2\2 \37\3" +
                    "\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#8\3\2\2\2$\"\3\2\2\2%\'\5\n\6\2" +
                    "&(\7\3\2\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\b\2\1" +
                    "\2,\67\3\2\2\2-\61\5\6\4\2.\60\7\3\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2" +
                    "\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\b\2\1\2\65\67\3\2" +
                    "\2\2\66%\3\2\2\2\66-\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\3\3\2" +
                    "\2\2:8\3\2\2\2;V\7\4\2\2<>\7\3\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2" +
                    "\2\2@B\3\2\2\2A?\3\2\2\2BC\5\n\6\2CN\b\3\1\2DF\7\3\2\2ED\3\2\2\2FG\3\2" +
                    "\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\5\n\6\2JK\b\3\1\2KM\3\2\2\2LE\3\2" +
                    "\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2PN\3\2\2\2QS\7\3\2\2RQ\3\2" +
                    "\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2V?\3\2\2\2VW\3\2\2\2WX\3\2" +
                    "\2\2XY\7\5\2\2Y\5\3\2\2\2Z[\7\22\2\2[\\\7\25\2\2\\g\7\36\2\2]^\7\25\2" +
                    "\2^d\b\4\1\2_`\7\6\2\2`a\7\25\2\2ac\b\4\1\2b_\3\2\2\2cf\3\2\2\2db\3\2" +
                    "\2\2de\3\2\2\2eh\3\2\2\2fd\3\2\2\2g]\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\37" +
                    "\2\2jk\7\27\2\2kl\t\2\2\2lm\b\4\1\2mn\5\4\3\2no\b\4\1\2o\7\3\2\2\2pq\7" +
                    "\23\2\2qr\7\36\2\2rs\5\f\7\2st\7\37\2\2tu\b\5\1\2uv\5\4\3\2vw\b\5\1\2" +
                    "w\t\3\2\2\2xy\5\16\b\2yz\b\6\1\2z\u008b\3\2\2\2{|\5\24\13\2|}\b\6\1\2" +
                    "}\u008b\3\2\2\2~\177\5\30\r\2\177\u0080\b\6\1\2\u0080\u008b\3\2\2\2\u0081" +
                    "\u0082\5\32\16\2\u0082\u0083\b\6\1\2\u0083\u008b\3\2\2\2\u0084\u0085\5" +
                    "\34\17\2\u0085\u0086\b\6\1\2\u0086\u008b\3\2\2\2\u0087\u0088\5\b\5\2\u0088" +
                    "\u0089\b\6\1\2\u0089\u008b\3\2\2\2\u008ax\3\2\2\2\u008a{\3\2\2\2\u008a" +
                    "~\3\2\2\2\u008a\u0081\3\2\2\2\u008a\u0084\3\2\2\2\u008a\u0087\3\2\2\2" +
                    "\u008b\13\3\2\2\2\u008c\u008d\7\b\2\2\u008d\u008e\7\33\2\2\u008e\u008f" +
                    "\7\b\2\2\u008f\u0092\b\7\1\2\u0090\u0092\3\2\2\2\u0091\u008c\3\2\2\2\u0091" +
                    "\u0090\3\2\2\2\u0092\r\3\2\2\2\u0093\u0094\b\b\1\2\u0094\u0095\7\b\2\2" +
                    "\u0095\u00a2\b\b\1\2\u0096\u0097\7\25\2\2\u0097\u00a2\b\b\1\2\u0098\u0099" +
                    "\5\22\n\2\u0099\u009a\b\b\1\2\u009a\u00a2\3\2\2\2\u009b\u009c\5\20\t\2" +
                    "\u009c\u009d\b\b\1\2\u009d\u00a2\3\2\2\2\u009e\u009f\5\f\7\2\u009f\u00a0" +
                    "\b\b\1\2\u00a0\u00a2\3\2\2\2\u00a1\u0093\3\2\2\2\u00a1\u0096\3\2\2\2\u00a1" +
                    "\u0098\3\2\2\2\u00a1\u009b\3\2\2\2\u00a1\u009e\3\2\2\2\u00a2\u00b9\3\2" +
                    "\2\2\u00a3\u00a4\f\b\2\2\u00a4\u00a5\7\31\2\2\u00a5\u00a6\5\16\b\t\u00a6" +
                    "\u00a7\b\b\1\2\u00a7\u00b8\3\2\2\2\u00a8\u00a9\f\7\2\2\u00a9\u00aa\7\32" +
                    "\2\2\u00aa\u00ab\5\16\b\b\u00ab\u00ac\b\b\1\2\u00ac\u00b8\3\2\2\2\u00ad" +
                    "\u00ae\f\6\2\2\u00ae\u00af\7\34\2\2\u00af\u00b0\5\16\b\7\u00b0\u00b1\b" +
                    "\b\1\2\u00b1\u00b8\3\2\2\2\u00b2\u00b3\f\5\2\2\u00b3\u00b4\7\35\2\2\u00b4" +
                    "\u00b5\5\16\b\6\u00b5\u00b6\b\b\1\2\u00b6\u00b8\3\2\2\2\u00b7\u00a3\3" +
                    "\2\2\2\u00b7\u00a8\3\2\2\2\u00b7\u00ad\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b8" +
                    "\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\17\3\2\2" +
                    "\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\25\2\2\u00bd\u00be\7 \2\2\u00be\u00bf" +
                    "\7\b\2\2\u00bf\u00c0\7!\2\2\u00c0\u00c1\7\26\2\2\u00c1\u00c2\7\b\2\2\u00c2" +
                    "\u00c3\b\t\1\2\u00c3\21\3\2\2\2\u00c4\u00c5\7\25\2\2\u00c5\u00c6\7\26" +
                    "\2\2\u00c6\u00c7\5\16\b\2\u00c7\u00c8\b\n\1\2\u00c8\23\3\2\2\2\u00c9\u00ca" +
                    "\7\n\2\2\u00ca\u00cb\7\25\2\2\u00cb\u00cc\7\26\2\2\u00cc\u00cd\7\b\2\2" +
                    "\u00cd\u00e2\b\13\1\2\u00ce\u00cf\7\13\2\2\u00cf\u00d0\7\25\2\2\u00d0" +
                    "\u00d1\7\26\2\2\u00d1\u00d2\7\t\2\2\u00d2\u00e2\b\13\1\2\u00d3\u00d4\7" +
                    "\r\2\2\u00d4\u00d5\7\25\2\2\u00d5\u00d6\7\26\2\2\u00d6\u00d7\7\16\2\2" +
                    "\u00d7\u00e2\b\13\1\2\u00d8\u00d9\5\26\f\2\u00d9\u00da\b\13\1\2\u00da" +
                    "\u00e2\3\2\2\2\u00db\u00dc\7\f\2\2\u00dc\u00dd\7\n\2\2\u00dd\u00de\7\25" +
                    "\2\2\u00de\u00df\7\26\2\2\u00df\u00e0\7\b\2\2\u00e0\u00e2\b\13\1\2\u00e1" +
                    "\u00c9\3\2\2\2\u00e1\u00ce\3\2\2\2\u00e1\u00d3\3\2\2\2\u00e1\u00d8\3\2" +
                    "\2\2\u00e1\u00db\3\2\2\2\u00e2\25\3\2\2\2\u00e3\u00e4\7\n\2\2\u00e4\u00e5" +
                    "\7 \2\2\u00e5\u00e6\7!\2\2\u00e6\u00e7\7\25\2\2\u00e7\u00e8\7\26\2\2\u00e8" +
                    "\u00e9\7\7\2\2\u00e9\u00ea\7\n\2\2\u00ea\u00eb\7 \2\2\u00eb\u00ec\7\b" +
                    "\2\2\u00ec\u00ed\7!\2\2\u00ed\u00fa\b\f\1\2\u00ee\u00ef\7\13\2\2\u00ef" +
                    "\u00f0\7 \2\2\u00f0\u00f1\7!\2\2\u00f1\u00f2\7\25\2\2\u00f2\u00f3\7\26" +
                    "\2\2\u00f3\u00f4\7\7\2\2\u00f4\u00f5\7\13\2\2\u00f5\u00f6\7 \2\2\u00f6" +
                    "\u00f7\7\b\2\2\u00f7\u00f8\7!\2\2\u00f8\u00fa\b\f\1\2\u00f9\u00e3\3\2" +
                    "\2\2\u00f9\u00ee\3\2\2\2\u00fa\27\3\2\2\2\u00fb\u00fc\7\17\2\2\u00fc\u00fd" +
                    "\7\36\2\2\u00fd\u00fe\7\25\2\2\u00fe\u00ff\7\37\2\2\u00ff\u0109\b\r\1" +
                    "\2\u0100\u0101\7\17\2\2\u0101\u0102\7\36\2\2\u0102\u0103\7\25\2\2\u0103" +
                    "\u0104\7 \2\2\u0104\u0105\7\b\2\2\u0105\u0106\7!\2\2\u0106\u0107\7\37" +
                    "\2\2\u0107\u0109\b\r\1\2\u0108\u00fb\3\2\2\2\u0108\u0100\3\2\2\2\u0109" +
                    "\31\3\2\2\2\u010a\u010b\7\24\2\2\u010b\u010c\7\b\2\2\u010c\u0111\b\16" +
                    "\1\2\u010d\u010e\7\24\2\2\u010e\u010f\7\t\2\2\u010f\u0111\b\16\1\2\u0110" +
                    "\u010a\3\2\2\2\u0110\u010d\3\2\2\2\u0111\33\3\2\2\2\u0112\u0113\7\20\2" +
                    "\2\u0113\u0114\7\36\2\2\u0114\u0115\7\25\2\2\u0115\u0116\7\37\2\2\u0116" +
                    "\u011e\b\17\1\2\u0117\u0118\7\21\2\2\u0118\u0119\7\36\2\2\u0119\u011a" +
                    "\7\25\2\2\u011a\u011b\7\37\2\2\u011b\u011e\b\17\1\2\u011c\u011e\3\2\2" +
                    "\2\u011d\u0112\3\2\2\2\u011d\u0117\3\2\2\2\u011d\u011c\3\2\2\2\u011e\35" +
                    "\3\2\2\2\30\")\61\668?GNTVdg\u008a\u0091\u00a1\u00b7\u00b9\u00e1\u00f9" +
                    "\u0108\u0110\u011d";
	private static final String[] _LITERAL_NAMES = {
            null, "';'", "'{'", "'}'", "','", "'new'", null, null, "'int'", "'float'",
            "'static'", "'String'", null, "'print'", "'readInt'", "'readFloat'", "'fun'",
            "'if'", "'return'", null, "'='", "':'", "'\"'", "'+'", "'-'", null, "'*'",
            "'/'", "'('", "')'", "'['", "']'"
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
	public String getGrammarFileName() { return "P.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Front.Program val;
		public StatementContext statement;
		public FunctionContext function;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitProgram(this);
		}
	}

    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, "NEW", "NUMBER", "NUMBER_FLOAT", "INT",
            "FLOAT", "STATIC", "STRING", "STRING_LITERAL", "PRINT", "READ_INT", "READ_FLOAT",
            "FUN", "IF", "RETURN", "ID", "EQUALS", "COLON", "DOUBLE_QUOTE", "ADD",
            "MINUS", "BOOL_OPERATOR", "MUTLIPLY", "DIVIDE", "LEFT_BRACKET", "RIGHT_BRACKET",
            "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "WS", "COMMENT"
    };

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                ((ProgramContext) _localctx).val = new Front.Program();
                setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
                        setState(29);
					match(T__0);
					}
                    }
				}
                setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
                setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
                        setState(52);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						{
                            setState(35);
						((ProgramContext)_localctx).statement = statement();
                            setState(37);
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
                                    setState(36);
								match(T__0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
                            setState(39);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
                            _localctx.val.statements.add(((ProgramContext) _localctx).statement.val);
						}
						break;
					case 2:
						{
						{
                            setState(43);
                            ((ProgramContext) _localctx).function = function();
                            setState(47);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
                                    setState(44);
								match(T__0);
								}
                                }
							}
                            setState(49);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
						}
						}
                            _localctx.val.functions.add(((ProgramContext) _localctx).function.val);
						}
						break;
					}
                    }
				}
                setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(57);
			match(T__1);
                setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
                    setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
                            setState(58);
						match(T__0);
						}
                        }
					}
                    setState(63);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
                    setState(64);
				((BodyContext)_localctx).a = statement();
                    ((BodyContext) _localctx).val = new Front.Body();
                    _localctx.val.add(((BodyContext) _localctx).a.val);
                    setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
                            setState(67);
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
                                    setState(66);
								match(T__0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
                            setState(69);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
                            setState(71);
						((BodyContext)_localctx).b = statement();
                            _localctx.val.add(((BodyContext) _localctx).b.val);
						}
                        }
					}
                    setState(78);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
                    setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
                        setState(79);
					match(T__0);
					}
					}
                    setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				break;
			}
                setState(86);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(88);
			match(FUN);
                setState(89);
			((FunctionContext)_localctx).name = match(ID);
                setState(90);
			match(LEFT_BRACKET);
                setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
                    setState(91);
				((FunctionContext)_localctx).arg1 = match(ID);
                    _localctx.val.addArg((((FunctionContext) _localctx).arg1 != null ? ((FunctionContext) _localctx).arg1.getText() : null));
                    setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
                        setState(93);
					match(T__3);
                        setState(94);
					((FunctionContext)_localctx).arg2 = match(ID);
                        _localctx.val.addArg((((FunctionContext) _localctx).arg2 != null ? ((FunctionContext) _localctx).arg2.getText() : null));
					}
					}
                    setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

                setState(103);
			match(RIGHT_BRACKET);
                setState(104);
			match(COLON);
                setState(105);
			((FunctionContext)_localctx).returnType = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
				((FunctionContext)_localctx).returnType = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
                ((FunctionContext) _localctx).val = new Front.Function((((FunctionContext) _localctx).name != null ? ((FunctionContext) _localctx).name.getText() : null), (((FunctionContext) _localctx).returnType != null ? ((FunctionContext) _localctx).returnType.getText() : null));
                setState(107);
			((FunctionContext)_localctx).body = body();
                _localctx.val.setBody(((FunctionContext) _localctx).body.val);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

    public final IfExprContext ifExpr() throws RecognitionException {
        IfExprContext _localctx = new IfExprContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_ifExpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(110);
                match(IF);
                setState(111);
                match(LEFT_BRACKET);
                setState(112);
                ((IfExprContext) _localctx).boolExpr = boolExpr();
                setState(113);
                match(RIGHT_BRACKET);
                ((IfExprContext) _localctx).val = new Front.IfExpr(((IfExprContext) _localctx).boolExpr.val);
                setState(115);
                ((IfExprContext) _localctx).body = body();
                _localctx.val.setBody(((IfExprContext) _localctx).body.val);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_statement);
        try {
            setState(136);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(118);
                    ((StatementContext) _localctx).a = expression(0);
                    ((StatementContext) _localctx).val = new Front.StatementExpression(((StatementContext) _localctx).a.val);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(121);
                    ((StatementContext) _localctx).c = variable_declaration();
                    ((StatementContext) _localctx).val = ((StatementContext) _localctx).c.val;
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(124);
                    ((StatementContext) _localctx).d = print();
                    {
                        ((StatementContext) _localctx).val = ((StatementContext) _localctx).d.val;
                    }
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(127);
                    ((StatementContext) _localctx).e = returnst();
                    {
                        ((StatementContext) _localctx).val = ((StatementContext) _localctx).e.val;
                    }
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(130);
                    ((StatementContext) _localctx).f = read();
                    {
                        ((StatementContext) _localctx).val = ((StatementContext) _localctx).f.val;
                    }
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(133);
                    ((StatementContext) _localctx).g = ifExpr();
                    {
                        ((StatementContext) _localctx).val = ((StatementContext) _localctx).g.val;
                    }
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BoolExprContext boolExpr() throws RecognitionException {
        BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_boolExpr);
        try {
            setState(143);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(138);
                    ((BoolExprContext) _localctx).left = match(NUMBER);
                    setState(139);
                    ((BoolExprContext) _localctx).op = match(BOOL_OPERATOR);
                    setState(140);
                    ((BoolExprContext) _localctx).right = match(NUMBER);
                    ((BoolExprContext) _localctx).val = new Front.BoolExpr((((BoolExprContext) _localctx).left != null ? ((BoolExprContext) _localctx).left.getText() : null), (((BoolExprContext) _localctx).op != null ? ((BoolExprContext) _localctx).op.getText() : null), (((BoolExprContext) _localctx).right != null ? ((BoolExprContext) _localctx).right.getText() : null));
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExpressionContext expression() throws RecognitionException {
        return expression(0);
    }

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
        int _startState = 12;
        enterRecursionRule(_localctx, 12, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(159);
			_errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
			case 1:
				{
                    setState(146);
				((ExpressionContext)_localctx).a = match(NUMBER);
                    ((ExpressionContext) _localctx).val = new Front.NumberExpression((((ExpressionContext) _localctx).a != null ? ((ExpressionContext) _localctx).a.getText() : null));
				}
				break;
			case 2:
				{
                    setState(148);
				((ExpressionContext)_localctx).b = match(ID);
                    ((ExpressionContext) _localctx).val = new Front.IdExpression((((ExpressionContext) _localctx).b != null ? ((ExpressionContext) _localctx).b.getText() : null));
				}
				break;
			case 3:
				{
                    setState(150);
				((ExpressionContext)_localctx).c = assignment();
                    ((ExpressionContext) _localctx).val = ((ExpressionContext) _localctx).c.val;
				}
				break;
			case 4:
				{
                    setState(153);
                    ((ExpressionContext) _localctx).l = indexingExpression();
                    ((ExpressionContext) _localctx).val = ((ExpressionContext) _localctx).l.val;
				}
            break;
                    case 5: {
                        setState(156);
                        ((ExpressionContext) _localctx).z = boolExpr();
                        {
                            ((ExpressionContext) _localctx).val = ((ExpressionContext) _localctx).z.val;
                        }
                    }
				break;
			}
			_ctx.stop = _input.LT(-1);
                setState(183);
			_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
                        setState(181);
					_errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.d = _prevctx;
						_localctx.d = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
                            setState(161);
                            if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                            setState(162);
						match(ADD);
                            setState(163);
                            ((ExpressionContext) _localctx).e = expression(7);
                            ((ExpressionContext) _localctx).val = new Front.AddExpression(((ExpressionContext) _localctx).d.val, ((ExpressionContext) _localctx).e.val);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
                            setState(166);
                            if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                            setState(167);
						match(MINUS);
                            setState(168);
                            ((ExpressionContext) _localctx).g = expression(6);
                            ((ExpressionContext) _localctx).val = new Front.MinusExpression(((ExpressionContext) _localctx).f.val, ((ExpressionContext) _localctx).g.val);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.h = _prevctx;
						_localctx.h = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
                            setState(171);
                            if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                            setState(172);
						match(MUTLIPLY);
                            setState(173);
                            ((ExpressionContext) _localctx).i = expression(5);
                            ((ExpressionContext) _localctx).val = new Front.MultiplyExpression(((ExpressionContext) _localctx).h.val, ((ExpressionContext) _localctx).i.val);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.j = _prevctx;
						_localctx.j = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
                            setState(176);
                            if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                            setState(177);
						match(DIVIDE);
                            setState(178);
                            ((ExpressionContext) _localctx).k = expression(4);
                            ((ExpressionContext) _localctx).val = new Front.DivideExpression(((ExpressionContext) _localctx).j.val, ((ExpressionContext) _localctx).k.val);
						}
						break;
					}
                    }
				}
                setState(185);
				_errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
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

    public final IndexingExpressionContext indexingExpression() throws RecognitionException {
        IndexingExpressionContext _localctx = new IndexingExpressionContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_indexingExpression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(186);
                ((IndexingExpressionContext) _localctx).name = match(ID);
                setState(187);
                match(LEFT_SQUARE_BRACKET);
                setState(188);
                ((IndexingExpressionContext) _localctx).index = match(NUMBER);
                setState(189);
                match(RIGHT_SQUARE_BRACKET);
                setState(190);
                match(EQUALS);
                setState(191);
                ((IndexingExpressionContext) _localctx).value = match(NUMBER);
                ((IndexingExpressionContext) _localctx).val = new Front.IndexingExpression((((IndexingExpressionContext) _localctx).name != null ? ((IndexingExpressionContext) _localctx).name.getText() : null), (((IndexingExpressionContext) _localctx).index != null ? ((IndexingExpressionContext) _localctx).index.getText() : null), (((IndexingExpressionContext) _localctx).value != null ? ((IndexingExpressionContext) _localctx).value.getText() : null));
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_assignment);
		try {
            enterOuterAlt(_localctx, 1);
            {
                setState(194);
                ((AssignmentContext) _localctx).to = match(ID);
                setState(195);
                match(EQUALS);
                setState(196);
                ((AssignmentContext) _localctx).what = expression(0);
                ((AssignmentContext) _localctx).val = new Front.Assignment((((AssignmentContext) _localctx).to != null ? ((AssignmentContext) _localctx).to.getText() : null), ((AssignmentContext) _localctx).what.val);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_variable_declaration);
		try {
            setState(223);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
                case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(199);
				match(INT);
                    setState(200);
				((Variable_declarationContext)_localctx).name = match(ID);
                    setState(201);
				match(EQUALS);
                    setState(202);
				((Variable_declarationContext)_localctx).value = match(NUMBER);
                    ((Variable_declarationContext) _localctx).val = new Front.IntVariableDeclaration((((Variable_declarationContext) _localctx).name != null ? ((Variable_declarationContext) _localctx).name.getText() : null), (((Variable_declarationContext) _localctx).value != null ? ((Variable_declarationContext) _localctx).value.getText() : null));
				}
				break;
                case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(204);
				match(FLOAT);
                    setState(205);
				((Variable_declarationContext)_localctx).name = match(ID);
                    setState(206);
				match(EQUALS);
                    setState(207);
				((Variable_declarationContext)_localctx).value = match(NUMBER_FLOAT);
                    ((Variable_declarationContext) _localctx).val = new Front.FloatVariableDeclaration((((Variable_declarationContext) _localctx).name != null ? ((Variable_declarationContext) _localctx).name.getText() : null), (((Variable_declarationContext) _localctx).value != null ? ((Variable_declarationContext) _localctx).value.getText() : null));
				}
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
				{
                    setState(209);
                    match(STRING);
                    setState(210);
                    ((Variable_declarationContext) _localctx).name = match(ID);
                    setState(211);
                    match(EQUALS);
                    setState(212);
                    ((Variable_declarationContext) _localctx).value = match(STRING_LITERAL);
                    ((Variable_declarationContext) _localctx).val = new Front.StringVariableDeclaration((((Variable_declarationContext) _localctx).name != null ? ((Variable_declarationContext) _localctx).name.getText() : null), (((Variable_declarationContext) _localctx).value != null ? ((Variable_declarationContext) _localctx).value.getText() : null));
				}
				break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(214);
                    ((Variable_declarationContext) _localctx).f = array();
                    {
                        ((Variable_declarationContext) _localctx).val = ((Variable_declarationContext) _localctx).f.val;
                    }
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(217);
                    match(STATIC);
                    setState(218);
                    match(INT);
                    setState(219);
                    ((Variable_declarationContext) _localctx).name = match(ID);
                    setState(220);
                    match(EQUALS);
                    setState(221);
                    ((Variable_declarationContext) _localctx).value = match(NUMBER);
                    ((Variable_declarationContext) _localctx).val = new Front.StaticIntVariableDeclaration((((Variable_declarationContext) _localctx).name != null ? ((Variable_declarationContext) _localctx).name.getText() : null), (((Variable_declarationContext) _localctx).value != null ? ((Variable_declarationContext) _localctx).value.getText() : null));
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ArrayContext array() throws RecognitionException {
        ArrayContext _localctx = new ArrayContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_array);
        try {
            setState(247);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case INT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(225);
                    match(INT);
                    setState(226);
                    match(LEFT_SQUARE_BRACKET);
                    setState(227);
                    match(RIGHT_SQUARE_BRACKET);
                    setState(228);
                    ((ArrayContext) _localctx).name = match(ID);
                    setState(229);
                    match(EQUALS);
                    setState(230);
                    match(NEW);
                    setState(231);
                    match(INT);
                    setState(232);
                    match(LEFT_SQUARE_BRACKET);
                    setState(233);
                    ((ArrayContext) _localctx).size = match(NUMBER);
                    setState(234);
                    match(RIGHT_SQUARE_BRACKET);
                    ((ArrayContext) _localctx).val = new Front.ArrayInt((((ArrayContext) _localctx).name != null ? ((ArrayContext) _localctx).name.getText() : null), (((ArrayContext) _localctx).size != null ? ((ArrayContext) _localctx).size.getText() : null));
                }
                break;
                case FLOAT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(236);
                    match(FLOAT);
                    setState(237);
                    match(LEFT_SQUARE_BRACKET);
                    setState(238);
                    match(RIGHT_SQUARE_BRACKET);
                    setState(239);
                    ((ArrayContext) _localctx).name = match(ID);
                    setState(240);
                    match(EQUALS);
                    setState(241);
                    match(NEW);
                    setState(242);
                    match(FLOAT);
                    setState(243);
                    match(LEFT_SQUARE_BRACKET);
                    setState(244);
                    ((ArrayContext) _localctx).size = match(NUMBER);
                    setState(245);
                    match(RIGHT_SQUARE_BRACKET);
                    ((ArrayContext) _localctx).val = new Front.ArrayFloat((((ArrayContext) _localctx).name != null ? ((ArrayContext) _localctx).name.getText() : null), (((ArrayContext) _localctx).size != null ? ((ArrayContext) _localctx).size.getText() : null));
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

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_print);
		try {
            setState(262);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(249);
                    match(PRINT);
                    setState(250);
                    match(LEFT_BRACKET);
                    setState(251);
                    ((PrintContext) _localctx).reference = match(ID);
                    setState(252);
                    match(RIGHT_BRACKET);
                    ((PrintContext) _localctx).val = new Front.PrintIDStatement((((PrintContext) _localctx).reference != null ? ((PrintContext) _localctx).reference.getText() : null));
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(254);
                    match(PRINT);
                    setState(255);
                    match(LEFT_BRACKET);
                    setState(256);
                    ((PrintContext) _localctx).reference = match(ID);
                    setState(257);
                    match(LEFT_SQUARE_BRACKET);
                    setState(258);
                    ((PrintContext) _localctx).index = match(NUMBER);
                    setState(259);
                    match(RIGHT_SQUARE_BRACKET);
                    setState(260);
                    match(RIGHT_BRACKET);
                    ((PrintContext) _localctx).val = new Front.PrintIndex((((PrintContext) _localctx).reference != null ? ((PrintContext) _localctx).reference.getText() : null), (((PrintContext) _localctx).index != null ? ((PrintContext) _localctx).index.getText() : null));
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

	public final ReturnstContext returnst() throws RecognitionException {
		ReturnstContext _localctx = new ReturnstContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_returnst);
		try {
            setState(270);
			_errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(264);
				match(RETURN);
                    setState(265);
				((ReturnstContext)_localctx).NUMBER = match(NUMBER);
				((ReturnstContext)_localctx).val =  new Front.ReturnInt((((ReturnstContext)_localctx).NUMBER!=null?((ReturnstContext)_localctx).NUMBER.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(267);
				match(RETURN);
                    setState(268);
				((ReturnstContext)_localctx).NUMBER_FLOAT = match(NUMBER_FLOAT);
				((ReturnstContext)_localctx).val =  new Front.ReturnFloat((((ReturnstContext)_localctx).NUMBER_FLOAT!=null?((ReturnstContext)_localctx).NUMBER_FLOAT.getText():null));
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

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_read);
		try {
            setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ_INT:
				enterOuterAlt(_localctx, 1);
				{
                    setState(272);
				match(READ_INT);
                    setState(273);
				match(LEFT_BRACKET);
                    setState(274);
				((ReadContext)_localctx).reference = match(ID);
                    setState(275);
				match(RIGHT_BRACKET);
				((ReadContext)_localctx).val =  new Front.ReadInt((((ReadContext)_localctx).reference!=null?((ReadContext)_localctx).reference.getText():null));
				}
				break;
			case READ_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
                    setState(277);
				match(READ_FLOAT);
                    setState(278);
				match(LEFT_BRACKET);
                    setState(279);
				((ReadContext)_localctx).reference = match(ID);
                    setState(280);
				match(RIGHT_BRACKET);
				((ReadContext)_localctx).val =  new Front.ReadFloat((((ReadContext)_localctx).reference!=null?((ReadContext)_localctx).reference.getText():null));
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
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

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 6:
                return expression_sempred((ExpressionContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 6);
            case 1:
                return precpred(_ctx, 5);
            case 2:
                return precpred(_ctx, 4);
            case 3:
                return precpred(_ctx, 3);
        }
        return true;
    }

    public static class BodyContext extends ParserRuleContext {
        public Front.Body val;
        public StatementContext a;
        public StatementContext b;

        public BodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_body;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).enterBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).exitBody(this);
        }
    }

    public static class FunctionContext extends ParserRuleContext {
        public Front.Function val;
        public Token name;
        public Token arg1;
        public Token arg2;
        public Token returnType;
        public BodyContext body;

        public FunctionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode FUN() {
            return getToken(PParser.FUN, 0);
        }

        public TerminalNode COLON() {
            return getToken(PParser.COLON, 0);
        }

        public BodyContext body() {
            return getRuleContext(BodyContext.class, 0);
        }

        public List<TerminalNode> ID() {
            return getTokens(PParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(PParser.ID, i);
        }

        public TerminalNode INT() {
            return getToken(PParser.INT, 0);
        }

        public TerminalNode FLOAT() {
            return getToken(PParser.FLOAT, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).enterFunction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).exitFunction(this);
        }
    }

    public static class IfExprContext extends ParserRuleContext {
        public Front.IfExpr val;
        public BoolExprContext boolExpr;
        public BodyContext body;

        public IfExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IF() {
            return getToken(PParser.IF, 0);
        }

        public TerminalNode LEFT_BRACKET() {
            return getToken(PParser.LEFT_BRACKET, 0);
        }

        public BoolExprContext boolExpr() {
            return getRuleContext(BoolExprContext.class, 0);
        }

        public TerminalNode RIGHT_BRACKET() {
            return getToken(PParser.RIGHT_BRACKET, 0);
        }

        public BodyContext body() {
            return getRuleContext(BodyContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).enterIfExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).exitIfExpr(this);
        }
    }

    public static class StatementContext extends ParserRuleContext {
        public Front.Statement val;
        public ExpressionContext a;
        public Variable_declarationContext c;
        public PrintContext d;
        public ReturnstContext e;
        public ReadContext f;
        public IfExprContext g;

        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public Variable_declarationContext variable_declaration() {
            return getRuleContext(Variable_declarationContext.class, 0);
        }

        public PrintContext print() {
            return getRuleContext(PrintContext.class, 0);
        }

        public ReturnstContext returnst() {
            return getRuleContext(ReturnstContext.class, 0);
        }

        public ReadContext read() {
            return getRuleContext(ReadContext.class, 0);
        }

        public IfExprContext ifExpr() {
            return getRuleContext(IfExprContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).exitStatement(this);
        }
    }

    public static class BoolExprContext extends ParserRuleContext {
        public Front.BoolExpr val;
        public Token left;
        public Token op;
        public Token right;

        public BoolExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> NUMBER() {
            return getTokens(PParser.NUMBER);
        }

        public TerminalNode NUMBER(int i) {
            return getToken(PParser.NUMBER, i);
        }

        public TerminalNode BOOL_OPERATOR() {
            return getToken(PParser.BOOL_OPERATOR, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_boolExpr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).enterBoolExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).exitBoolExpr(this);
        }
    }

    public static class ExpressionContext extends ParserRuleContext {
        public Front.Expression val;
        public ExpressionContext d;
        public ExpressionContext f;
        public ExpressionContext h;
        public ExpressionContext j;
        public Token a;
        public Token b;
        public AssignmentContext c;
        public IndexingExpressionContext l;
        public BoolExprContext z;
        public ExpressionContext e;
        public ExpressionContext g;
        public ExpressionContext i;
        public ExpressionContext k;

        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode NUMBER() {
            return getToken(PParser.NUMBER, 0);
        }

        public TerminalNode ID() {
            return getToken(PParser.ID, 0);
        }

        public AssignmentContext assignment() {
            return getRuleContext(AssignmentContext.class, 0);
        }

        public IndexingExpressionContext indexingExpression() {
            return getRuleContext(IndexingExpressionContext.class, 0);
        }

        public BoolExprContext boolExpr() {
            return getRuleContext(BoolExprContext.class, 0);
        }

        public TerminalNode ADD() {
            return getToken(PParser.ADD, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode MINUS() {
            return getToken(PParser.MINUS, 0);
        }

        public TerminalNode MUTLIPLY() {
            return getToken(PParser.MUTLIPLY, 0);
        }

        public TerminalNode DIVIDE() {
            return getToken(PParser.DIVIDE, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).enterExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).exitExpression(this);
        }
    }

    public static class IndexingExpressionContext extends ParserRuleContext {
        public Front.IndexingExpression val;
        public Token name;
        public Token index;
        public Token value;

        public IndexingExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode LEFT_SQUARE_BRACKET() {
            return getToken(PParser.LEFT_SQUARE_BRACKET, 0);
        }

        public TerminalNode RIGHT_SQUARE_BRACKET() {
            return getToken(PParser.RIGHT_SQUARE_BRACKET, 0);
        }

        public TerminalNode EQUALS() {
            return getToken(PParser.EQUALS, 0);
        }

        public TerminalNode ID() {
            return getToken(PParser.ID, 0);
        }

        public List<TerminalNode> NUMBER() {
            return getTokens(PParser.NUMBER);
        }

        public TerminalNode NUMBER(int i) {
            return getToken(PParser.NUMBER, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_indexingExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).enterIndexingExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).exitIndexingExpression(this);
        }
    }

    public static class AssignmentContext extends ParserRuleContext {
        public Front.Assignment val;
        public Token to;
        public ExpressionContext what;

        public AssignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(PParser.ID, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).enterAssignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).exitAssignment(this);
        }
    }

    public static class Variable_declarationContext extends ParserRuleContext {
        public Front.VariableDeclaration val;
        public Token name;
        public Token value;
        public ArrayContext f;

        public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode INT() {
            return getToken(PParser.INT, 0);
        }

        public TerminalNode EQUALS() {
            return getToken(PParser.EQUALS, 0);
        }

        public TerminalNode ID() {
            return getToken(PParser.ID, 0);
        }

        public TerminalNode NUMBER() {
            return getToken(PParser.NUMBER, 0);
        }

        public TerminalNode FLOAT() {
            return getToken(PParser.FLOAT, 0);
        }

        public TerminalNode NUMBER_FLOAT() {
            return getToken(PParser.NUMBER_FLOAT, 0);
        }

        public TerminalNode STRING() {
            return getToken(PParser.STRING, 0);
        }

        public TerminalNode STRING_LITERAL() {
            return getToken(PParser.STRING_LITERAL, 0);
        }

        public ArrayContext array() {
            return getRuleContext(ArrayContext.class, 0);
        }

        public TerminalNode STATIC() {
            return getToken(PParser.STATIC, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variable_declaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).enterVariable_declaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).exitVariable_declaration(this);
        }
    }

    public static class ArrayContext extends ParserRuleContext {
        public Front.Array val;
        public Token name;
        public Token size;

        public ArrayContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> INT() {
            return getTokens(PParser.INT);
        }

        public TerminalNode INT(int i) {
            return getToken(PParser.INT, i);
        }

        public List<TerminalNode> LEFT_SQUARE_BRACKET() {
            return getTokens(PParser.LEFT_SQUARE_BRACKET);
        }

        public TerminalNode LEFT_SQUARE_BRACKET(int i) {
            return getToken(PParser.LEFT_SQUARE_BRACKET, i);
        }

        public List<TerminalNode> RIGHT_SQUARE_BRACKET() {
            return getTokens(PParser.RIGHT_SQUARE_BRACKET);
        }

        public TerminalNode RIGHT_SQUARE_BRACKET(int i) {
            return getToken(PParser.RIGHT_SQUARE_BRACKET, i);
        }

        public TerminalNode EQUALS() {
            return getToken(PParser.EQUALS, 0);
        }

        public TerminalNode NEW() {
            return getToken(PParser.NEW, 0);
        }

        public TerminalNode ID() {
            return getToken(PParser.ID, 0);
        }

        public TerminalNode NUMBER() {
            return getToken(PParser.NUMBER, 0);
        }

        public List<TerminalNode> FLOAT() {
            return getTokens(PParser.FLOAT);
        }

        public TerminalNode FLOAT(int i) {
            return getToken(PParser.FLOAT, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_array;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).enterArray(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).exitArray(this);
        }
    }

    public static class PrintContext extends ParserRuleContext {
        public Front.PrintStatement val;
        public Token reference;
        public Token index;

        public PrintContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode PRINT() {
            return getToken(PParser.PRINT, 0);
        }

        public TerminalNode LEFT_BRACKET() {
            return getToken(PParser.LEFT_BRACKET, 0);
        }

        public TerminalNode RIGHT_BRACKET() {
            return getToken(PParser.RIGHT_BRACKET, 0);
        }

        public TerminalNode ID() {
            return getToken(PParser.ID, 0);
        }

        public TerminalNode LEFT_SQUARE_BRACKET() {
            return getToken(PParser.LEFT_SQUARE_BRACKET, 0);
        }

        public TerminalNode RIGHT_SQUARE_BRACKET() {
            return getToken(PParser.RIGHT_SQUARE_BRACKET, 0);
        }

        public TerminalNode NUMBER() {
            return getToken(PParser.NUMBER, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_print;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).enterPrint(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).exitPrint(this);
        }
    }

    public static class ReturnstContext extends ParserRuleContext {
        public Front.ReturnStatement val;
        public Token NUMBER;
        public Token NUMBER_FLOAT;

        public ReturnstContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode RETURN() {
            return getToken(PParser.RETURN, 0);
        }

        public TerminalNode NUMBER() {
            return getToken(PParser.NUMBER, 0);
        }

        public TerminalNode NUMBER_FLOAT() {
            return getToken(PParser.NUMBER_FLOAT, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_returnst;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).enterReturnst(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).exitReturnst(this);
        }
    }

    public static class ReadContext extends ParserRuleContext {
        public Front.Read val;
        public Token reference;

        public ReadContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode READ_INT() {
            return getToken(PParser.READ_INT, 0);
        }

        public TerminalNode LEFT_BRACKET() {
            return getToken(PParser.LEFT_BRACKET, 0);
        }

        public TerminalNode RIGHT_BRACKET() {
            return getToken(PParser.RIGHT_BRACKET, 0);
        }

        public TerminalNode ID() {
            return getToken(PParser.ID, 0);
        }

        public TerminalNode READ_FLOAT() {
            return getToken(PParser.READ_FLOAT, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_read;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).enterRead(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PListener) ((PListener) listener).exitRead(this);
        }
    }
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}