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
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, NUMBER = 5, NUMBER_FLOAT = 6, INT = 7, FLOAT = 8,
            STRING = 9, STRING_LITERAL = 10, PRINT = 11, READ_INT = 12, READ_FLOAT = 13, FUN = 14,
            RETURN = 15, ID = 16, EQUALS = 17, COLON = 18, DOUBLE_QUOTE = 19, ADD = 20, MINUS = 21,
            MUTLIPLY = 22, DIVIDE = 23, LEFT_BRACKET = 24, RIGHT_BRACKET = 25, WS = 26, COMMENT = 27;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_function = 2, RULE_statement = 3, 
		RULE_expression = 4, RULE_assignment = 5, RULE_variable_declaration = 6, 
		RULE_print = 7, RULE_returnst = 8, RULE_read = 9;
	public static final String[] ruleNames = {
		"program", "body", "function", "statement", "expression", "assignment", 
		"variable_declaration", "print", "returnst", "read"
	};
	public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00d2\4\2\t\2" +
                    "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\3\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2\6\2 \n\2\r\2\16\2!\3" +
                    "\2\3\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13" +
                    "\2\3\3\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\3\3\3\3\6\3>\n\3\r\3\16\3?\3" +
                    "\3\3\3\3\3\7\3E\n\3\f\3\16\3H\13\3\3\3\6\3K\n\3\r\3\16\3L\5\3O\n\3\3\3" +
                    "\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4[\n\4\f\4\16\4^\13\4\5\4`\n\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3" +
                    "\5\3\5\3\5\3\5\3\5\5\5x\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0083" +
                    "\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3" +
                    "\6\3\6\3\6\3\6\7\6\u0099\n\6\f\6\16\6\u009c\13\6\3\7\3\7\3\7\3\7\3\7\3" +
                    "\7\5\7\u00a4\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3" +
                    "\b\3\b\5\b\u00b5\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5" +
                    "\n\u00c3\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5" +
                    "\13\u00d0\n\13\3\13\2\3\n\f\2\4\6\b\n\f\16\20\22\24\2\3\3\2\t\n\2\u00e4" +
                    "\2\26\3\2\2\2\4\63\3\2\2\2\6R\3\2\2\2\bw\3\2\2\2\n\u0082\3\2\2\2\f\u00a3" +
                    "\3\2\2\2\16\u00b4\3\2\2\2\20\u00b6\3\2\2\2\22\u00c2\3\2\2\2\24\u00cf\3" +
                    "\2\2\2\26\32\b\2\1\2\27\31\7\3\2\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3" +
                    "\2\2\2\32\33\3\2\2\2\33\60\3\2\2\2\34\32\3\2\2\2\35\37\5\b\5\2\36 \7\3" +
                    "\2\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#$\b\2\1" +
                    "\2$/\3\2\2\2%)\5\6\4\2&(\7\3\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2" +
                    "\2\2*,\3\2\2\2+)\3\2\2\2,-\b\2\1\2-/\3\2\2\2.\35\3\2\2\2.%\3\2\2\2/\62" +
                    "\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\3\3\2\2\2\62\60\3\2\2\2\63N\7\4" +
                    "\2\2\64\66\7\3\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\2" +
                    "8:\3\2\2\29\67\3\2\2\2:;\5\b\5\2;F\b\3\1\2<>\7\3\2\2=<\3\2\2\2>?\3\2\2" +
                    "\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\5\b\5\2BC\b\3\1\2CE\3\2\2\2D=\3\2\2" +
                    "\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GJ\3\2\2\2HF\3\2\2\2IK\7\3\2\2JI\3\2\2" +
                    "\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2N\67\3\2\2\2NO\3\2\2\2OP\3\2" +
                    "\2\2PQ\7\5\2\2Q\5\3\2\2\2RS\7\20\2\2ST\7\22\2\2T_\7\32\2\2UV\7\22\2\2" +
                    "V\\\b\4\1\2WX\7\6\2\2XY\7\22\2\2Y[\b\4\1\2ZW\3\2\2\2[^\3\2\2\2\\Z\3\2" +
                    "\2\2\\]\3\2\2\2]`\3\2\2\2^\\\3\2\2\2_U\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7" +
                    "\33\2\2bc\7\24\2\2cd\t\2\2\2de\b\4\1\2ef\5\4\3\2fg\b\4\1\2g\7\3\2\2\2" +
                    "hi\5\n\6\2ij\b\5\1\2jx\3\2\2\2kl\5\16\b\2lm\b\5\1\2mx\3\2\2\2no\5\20\t" +
                    "\2op\b\5\1\2px\3\2\2\2qr\5\22\n\2rs\b\5\1\2sx\3\2\2\2tu\5\24\13\2uv\b" +
                    "\5\1\2vx\3\2\2\2wh\3\2\2\2wk\3\2\2\2wn\3\2\2\2wq\3\2\2\2wt\3\2\2\2x\t" +
                    "\3\2\2\2yz\b\6\1\2z{\7\7\2\2{\u0083\b\6\1\2|}\7\22\2\2}\u0083\b\6\1\2" +
                    "~\177\5\f\7\2\177\u0080\b\6\1\2\u0080\u0083\3\2\2\2\u0081\u0083\3\2\2" +
                    "\2\u0082y\3\2\2\2\u0082|\3\2\2\2\u0082~\3\2\2\2\u0082\u0081\3\2\2\2\u0083" +
                    "\u009a\3\2\2\2\u0084\u0085\f\7\2\2\u0085\u0086\7\26\2\2\u0086\u0087\5" +
                    "\n\6\b\u0087\u0088\b\6\1\2\u0088\u0099\3\2\2\2\u0089\u008a\f\6\2\2\u008a" +
                    "\u008b\7\27\2\2\u008b\u008c\5\n\6\7\u008c\u008d\b\6\1\2\u008d\u0099\3" +
                    "\2\2\2\u008e\u008f\f\5\2\2\u008f\u0090\7\30\2\2\u0090\u0091\5\n\6\6\u0091" +
                    "\u0092\b\6\1\2\u0092\u0099\3\2\2\2\u0093\u0094\f\4\2\2\u0094\u0095\7\31" +
                    "\2\2\u0095\u0096\5\n\6\5\u0096\u0097\b\6\1\2\u0097\u0099\3\2\2\2\u0098" +
                    "\u0084\3\2\2\2\u0098\u0089\3\2\2\2\u0098\u008e\3\2\2\2\u0098\u0093\3\2" +
                    "\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b" +
                    "\13\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7\22\2\2\u009e\u009f\7\23" +
                    "\2\2\u009f\u00a0\5\n\6\2\u00a0\u00a1\b\7\1\2\u00a1\u00a4\3\2\2\2\u00a2" +
                    "\u00a4\3\2\2\2\u00a3\u009d\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\r\3\2\2\2" +
                    "\u00a5\u00a6\7\t\2\2\u00a6\u00a7\7\22\2\2\u00a7\u00a8\7\23\2\2\u00a8\u00a9" +
                    "\7\7\2\2\u00a9\u00b5\b\b\1\2\u00aa\u00ab\7\n\2\2\u00ab\u00ac\7\22\2\2" +
                    "\u00ac\u00ad\7\23\2\2\u00ad\u00ae\7\b\2\2\u00ae\u00b5\b\b\1\2\u00af\u00b0" +
                    "\7\13\2\2\u00b0\u00b1\7\22\2\2\u00b1\u00b2\7\23\2\2\u00b2\u00b3\7\f\2" +
                    "\2\u00b3\u00b5\b\b\1\2\u00b4\u00a5\3\2\2\2\u00b4\u00aa\3\2\2\2\u00b4\u00af" +
                    "\3\2\2\2\u00b5\17\3\2\2\2\u00b6\u00b7\7\r\2\2\u00b7\u00b8\7\32\2\2\u00b8" +
                    "\u00b9\7\22\2\2\u00b9\u00ba\7\33\2\2\u00ba\u00bb\b\t\1\2\u00bb\21\3\2" +
                    "\2\2\u00bc\u00bd\7\21\2\2\u00bd\u00be\7\7\2\2\u00be\u00c3\b\n\1\2\u00bf" +
                    "\u00c0\7\21\2\2\u00c0\u00c1\7\b\2\2\u00c1\u00c3\b\n\1\2\u00c2\u00bc\3" +
                    "\2\2\2\u00c2\u00bf\3\2\2\2\u00c3\23\3\2\2\2\u00c4\u00c5\7\16\2\2\u00c5" +
                    "\u00c6\7\32\2\2\u00c6\u00c7\7\22\2\2\u00c7\u00c8\7\33\2\2\u00c8\u00d0" +
                    "\b\13\1\2\u00c9\u00ca\7\17\2\2\u00ca\u00cb\7\32\2\2\u00cb\u00cc\7\22\2" +
                    "\2\u00cc\u00cd\7\33\2\2\u00cd\u00d0\b\13\1\2\u00ce\u00d0\3\2\2\2\u00cf" +
                    "\u00c4\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\25\3\2\2" +
                    "\2\26\32!).\60\67?FLN\\_w\u0082\u0098\u009a\u00a3\u00b4\u00c2\u00cf";
	private static final String[] _LITERAL_NAMES = {
            null, "';'", "'{'", "'}'", "','", null, null, "'int'", "'float'", "'String'",
            null, "'print'", "'readInt'", "'readFloat'", "'fun'", "'return'", null,
            "'='", "':'", "'\"'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
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

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 ((ProgramContext)_localctx).val =  new Front.Program(); 
			setState(24);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(21);
					match(T__0);
					}
					} 
				}
				setState(26);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(44);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						{
						setState(27);
						((ProgramContext)_localctx).statement = statement();
						setState(29); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(28);
								match(T__0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(31); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						 _localctx.val.statements.add(((ProgramContext)_localctx).statement.val); 
						}
						break;
					case 2:
						{
						{
						setState(35);
						((ProgramContext)_localctx).function = function();
						setState(39);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(36);
								match(T__0);
								}
								} 
							}
							setState(41);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
						}
						}
						 _localctx.val.functions.add(((ProgramContext)_localctx).function.val); 
						}
						break;
					}
					} 
				}
				setState(48);
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

	public static class BodyContext extends ParserRuleContext {
		public Front.Body val;
		public StatementContext a;
		public StatementContext b;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__1);
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(50);
						match(T__0);
						}
						} 
					}
					setState(55);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(56);
				((BodyContext)_localctx).a = statement();
				 ((BodyContext)_localctx).val =  new Front.Body(); _localctx.val.add(((BodyContext)_localctx).a.val); 
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(59); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(58);
								match(T__0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(61); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(63);
						((BodyContext)_localctx).b = statement();
						 _localctx.val.add(((BodyContext)_localctx).b.val); 
						}
						} 
					}
					setState(70);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(71);
					match(T__0);
					}
					}
					setState(74); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				break;
			}
			setState(78);
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

	public static class FunctionContext extends ParserRuleContext {
		public Front.Function val;
		public Token name;
		public Token arg1;
		public Token arg2;
		public Token returnType;
		public BodyContext body;
		public TerminalNode FUN() { return getToken(PParser.FUN, 0); }
		public TerminalNode COLON() { return getToken(PParser.COLON, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PParser.ID, i);
		}
		public TerminalNode INT() { return getToken(PParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PParser.FLOAT, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(FUN);
			setState(81);
			((FunctionContext)_localctx).name = match(ID);
			setState(82);
			match(LEFT_BRACKET);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(83);
				((FunctionContext)_localctx).arg1 = match(ID);
				 _localctx.val.addArg((((FunctionContext)_localctx).arg1!=null?((FunctionContext)_localctx).arg1.getText():null)); 
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(85);
					match(T__3);
					setState(86);
					((FunctionContext)_localctx).arg2 = match(ID);
					 _localctx.val.addArg((((FunctionContext)_localctx).arg2!=null?((FunctionContext)_localctx).arg2.getText():null)); 
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(95);
			match(RIGHT_BRACKET);
			setState(96);
			match(COLON);
			setState(97);
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
			 ((FunctionContext)_localctx).val =  new Front.Function((((FunctionContext)_localctx).name!=null?((FunctionContext)_localctx).name.getText():null),(((FunctionContext)_localctx).returnType!=null?((FunctionContext)_localctx).returnType.getText():null)); 
			setState(99);
			((FunctionContext)_localctx).body = body();
			 _localctx.val.setBody(((FunctionContext)_localctx).body.val); 
			}
		}
		catch (RecognitionException re) {
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
		public Front.Statement val;
		public ExpressionContext a;
		public Variable_declarationContext c;
		public PrintContext d;
		public ReturnstContext e;
		public ReadContext f;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ReturnstContext returnst() {
			return getRuleContext(ReturnstContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				((StatementContext)_localctx).a = expression(0);
				((StatementContext)_localctx).val =  new Front.StatementExpression(((StatementContext)_localctx).a.val); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				((StatementContext)_localctx).c = variable_declaration();
				 ((StatementContext)_localctx).val =  ((StatementContext)_localctx).c.val; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				((StatementContext)_localctx).d = print();
				{ ((StatementContext)_localctx).val =  ((StatementContext)_localctx).d.val; } 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				((StatementContext)_localctx).e = returnst();
				{ ((StatementContext)_localctx).val =  ((StatementContext)_localctx).e.val; } 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				((StatementContext)_localctx).f = read();
				{ ((StatementContext)_localctx).val =  ((StatementContext)_localctx).f.val; } 
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

	public static class ExpressionContext extends ParserRuleContext {
		public Front.Expression val;
		public ExpressionContext d;
		public ExpressionContext f;
		public ExpressionContext h;
		public ExpressionContext j;
		public Token a;
		public Token b;
		public AssignmentContext c;
		public ExpressionContext e;
		public ExpressionContext g;
		public ExpressionContext i;
		public ExpressionContext k;
		public TerminalNode NUMBER() { return getToken(PParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(PParser.ID, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode ADD() { return getToken(PParser.ADD, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(PParser.MINUS, 0); }
		public TerminalNode MUTLIPLY() { return getToken(PParser.MUTLIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(PParser.DIVIDE, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitExpression(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(120);
				((ExpressionContext)_localctx).a = match(NUMBER);
				 ((ExpressionContext)_localctx).val =  new Front.NumberExpression((((ExpressionContext)_localctx).a!=null?((ExpressionContext)_localctx).a.getText():null)); 
				}
				break;
			case 2:
				{
				setState(122);
				((ExpressionContext)_localctx).b = match(ID);
				 ((ExpressionContext)_localctx).val =  new Front.IdExpression((((ExpressionContext)_localctx).b!=null?((ExpressionContext)_localctx).b.getText():null)); 
				}
				break;
			case 3:
				{
				setState(124);
				((ExpressionContext)_localctx).c = assignment();
				 ((ExpressionContext)_localctx).val =  ((ExpressionContext)_localctx).c.val; 
				}
				break;
			case 4:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(150);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.d = _prevctx;
						_localctx.d = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(130);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(131);
						match(ADD);
						setState(132);
						((ExpressionContext)_localctx).e = expression(6);
						 ((ExpressionContext)_localctx).val =  new Front.AddExpression(((ExpressionContext)_localctx).d.val,((ExpressionContext)_localctx).e.val); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(135);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(136);
						match(MINUS);
						setState(137);
						((ExpressionContext)_localctx).g = expression(5);
						 ((ExpressionContext)_localctx).val =  new Front.MinusExpression(((ExpressionContext)_localctx).f.val,((ExpressionContext)_localctx).g.val); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.h = _prevctx;
						_localctx.h = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(140);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(141);
						match(MUTLIPLY);
						setState(142);
						((ExpressionContext)_localctx).i = expression(4);
						 ((ExpressionContext)_localctx).val =  new Front.MultiplyExpression(((ExpressionContext)_localctx).h.val,((ExpressionContext)_localctx).i.val); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.j = _prevctx;
						_localctx.j = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(145);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(146);
						match(DIVIDE);
						setState(147);
						((ExpressionContext)_localctx).k = expression(3);
						 ((ExpressionContext)_localctx).val =  new Front.DivideExpression(((ExpressionContext)_localctx).j.val,((ExpressionContext)_localctx).k.val); 
						}
						break;
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class AssignmentContext extends ParserRuleContext {
		public Front.Assignment val;
		public Token to;
		public ExpressionContext what;
		public TerminalNode ID() { return getToken(PParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				((AssignmentContext)_localctx).to = match(ID);
				setState(156);
				match(EQUALS);
				setState(157);
				((AssignmentContext)_localctx).what = expression(0);
				 ((AssignmentContext)_localctx).val =  new Front.Assignment((((AssignmentContext)_localctx).to!=null?((AssignmentContext)_localctx).to.getText():null), ((AssignmentContext)_localctx).what.val); 
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
	private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, "NUMBER", "NUMBER_FLOAT", "INT", "FLOAT",
            "STRING", "STRING_LITERAL", "PRINT", "READ_INT", "READ_FLOAT", "FUN",
            "RETURN", "ID", "EQUALS", "COLON", "DOUBLE_QUOTE", "ADD", "MINUS", "MUTLIPLY",
            "DIVIDE", "LEFT_BRACKET", "RIGHT_BRACKET", "WS", "COMMENT"
	};

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable_declaration);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(INT);
				setState(164);
				((Variable_declarationContext)_localctx).name = match(ID);
				setState(165);
				match(EQUALS);
				setState(166);
				((Variable_declarationContext)_localctx).value = match(NUMBER);
				 ((Variable_declarationContext)_localctx).val =  new Front.IntVariableDeclaration((((Variable_declarationContext)_localctx).name!=null?((Variable_declarationContext)_localctx).name.getText():null),(((Variable_declarationContext)_localctx).value!=null?((Variable_declarationContext)_localctx).value.getText():null)); 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(FLOAT);
				setState(169);
				((Variable_declarationContext)_localctx).name = match(ID);
				setState(170);
				match(EQUALS);
				setState(171);
				((Variable_declarationContext)_localctx).value = match(NUMBER_FLOAT);
				 ((Variable_declarationContext)_localctx).val =  new Front.FloatVariableDeclaration((((Variable_declarationContext)_localctx).name!=null?((Variable_declarationContext)_localctx).name.getText():null),(((Variable_declarationContext)_localctx).value!=null?((Variable_declarationContext)_localctx).value.getText():null)); 
				}
            break;
                case STRING:
                    enterOuterAlt(_localctx, 3);
				{
                    setState(173);
                    match(STRING);
                    setState(174);
                    ((Variable_declarationContext) _localctx).name = match(ID);
                    setState(175);
                    match(EQUALS);
                    setState(176);
                    ((Variable_declarationContext) _localctx).value = match(STRING_LITERAL);
                    ((Variable_declarationContext) _localctx).val = new Front.StringVariableDeclaration((((Variable_declarationContext) _localctx).name != null ? ((Variable_declarationContext) _localctx).name.getText() : null), (((Variable_declarationContext) _localctx).value != null ? ((Variable_declarationContext) _localctx).value.getText() : null));
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

	public static class PrintContext extends ParserRuleContext {
		public Front.PrintStatement val;
		public Token reference;
		public TerminalNode PRINT() { return getToken(PParser.PRINT, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(PParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(PParser.RIGHT_BRACKET, 0); }
		public TerminalNode ID() { return getToken(PParser.ID, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(180);
			match(PRINT);
                setState(181);
			match(LEFT_BRACKET);
                setState(182);
			((PrintContext)_localctx).reference = match(ID);
                setState(183);
			match(RIGHT_BRACKET);
			((PrintContext)_localctx).val =  new Front.PrintIDStatement((((PrintContext)_localctx).reference!=null?((PrintContext)_localctx).reference.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnstContext extends ParserRuleContext {
		public Front.ReturnStatement val;
		public Token NUMBER;
		public Token NUMBER_FLOAT;
		public TerminalNode RETURN() { return getToken(PParser.RETURN, 0); }
		public TerminalNode NUMBER() { return getToken(PParser.NUMBER, 0); }
		public TerminalNode NUMBER_FLOAT() { return getToken(PParser.NUMBER_FLOAT, 0); }
		public ReturnstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterReturnst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitReturnst(this);
		}
	}

	public final ReturnstContext returnst() throws RecognitionException {
		ReturnstContext _localctx = new ReturnstContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnst);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
                    setState(186);
				match(RETURN);
                    setState(187);
				((ReturnstContext)_localctx).NUMBER = match(NUMBER);
				((ReturnstContext)_localctx).val =  new Front.ReturnInt((((ReturnstContext)_localctx).NUMBER!=null?((ReturnstContext)_localctx).NUMBER.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
                    setState(189);
				match(RETURN);
                    setState(190);
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

	public static class ReadContext extends ParserRuleContext {
		public Front.Read val;
		public Token reference;
		public TerminalNode READ_INT() { return getToken(PParser.READ_INT, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(PParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(PParser.RIGHT_BRACKET, 0); }
		public TerminalNode ID() { return getToken(PParser.ID, 0); }
		public TerminalNode READ_FLOAT() { return getToken(PParser.READ_FLOAT, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_read);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ_INT:
				enterOuterAlt(_localctx, 1);
				{
                    setState(194);
				match(READ_INT);
                    setState(195);
				match(LEFT_BRACKET);
                    setState(196);
				((ReadContext)_localctx).reference = match(ID);
                    setState(197);
				match(RIGHT_BRACKET);
				((ReadContext)_localctx).val =  new Front.ReadInt((((ReadContext)_localctx).reference!=null?((ReadContext)_localctx).reference.getText():null));
				}
				break;
			case READ_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
                    setState(199);
				match(READ_FLOAT);
                    setState(200);
				match(LEFT_BRACKET);
                    setState(201);
				((ReadContext)_localctx).reference = match(ID);
                    setState(202);
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
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static class Variable_declarationContext extends ParserRuleContext {
		public Front.VariableDeclaration val;
		public Token name;
		public Token value;
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
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}