// Generated from /home/ppiedel/IdeaProjects/Compiler/front/src/main/P.g4 by ANTLR 4.7
package main;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, COMMENT=5, NUMBER=6, INT=7, FLOAT=8, PRINT=9, 
		FUN=10, ID=11, EQUALS=12, COLON=13, LEFT_BRACKET=14, RIGHT_BRACKET=15, 
		WS=16;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_function = 2, RULE_statement = 3, 
		RULE_expression = 4, RULE_assignment = 5, RULE_variable_declaration = 6, 
		RULE_print = 7;
	public static final String[] ruleNames = {
		"program", "body", "function", "statement", "expression", "assignment", 
		"variable_declaration", "print"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'{'", "'}'", "','", null, null, "'int'", "'float'", "'print'", 
		"'fun'", null, "'='", "':'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "COMMENT", "NUMBER", "INT", "FLOAT", "PRINT", 
		"FUN", "ID", "EQUALS", "COLON", "LEFT_BRACKET", "RIGHT_BRACKET", "WS"
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ProgramContext)_localctx).val =  new Front.Program(); 
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(17);
				match(T__0);
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << INT) | (1L << FLOAT) | (1L << PRINT) | (1L << FUN) | (1L << ID))) != 0)) {
				{
				setState(40);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
				case INT:
				case FLOAT:
				case PRINT:
				case ID:
					{
					{
					setState(23);
					((ProgramContext)_localctx).statement = statement();
					setState(25); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(24);
						match(T__0);
						}
						}
						setState(27); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__0 );
					}
					 _localctx.val.statements.add(((ProgramContext)_localctx).statement.val); 
					}
					break;
				case FUN:
					{
					{
					setState(31);
					((ProgramContext)_localctx).function = function();
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(32);
						match(T__0);
						}
						}
						setState(37);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					 _localctx.val.functions.add(((ProgramContext)_localctx).function.val); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(44);
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
			setState(45);
			match(T__1);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NUMBER) | (1L << INT) | (1L << FLOAT) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(46);
					match(T__0);
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(52);
				((BodyContext)_localctx).a = statement();
				 ((BodyContext)_localctx).val =  new Front.Body(); _localctx.val.add(((BodyContext)_localctx).a.val); 
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(55); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(54);
							match(T__0);
							}
							}
							setState(57); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==T__0 );
						setState(59);
						((BodyContext)_localctx).b = statement();
						 _localctx.val.add(((BodyContext)_localctx).b.val); 
						}
						} 
					}
					setState(66);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(67);
					match(T__0);
					}
					}
					setState(70); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
			}

			setState(74);
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
			setState(76);
			match(FUN);
			setState(77);
			((FunctionContext)_localctx).name = match(ID);
			setState(78);
			match(LEFT_BRACKET);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(79);
				((FunctionContext)_localctx).arg1 = match(ID);
				 _localctx.val.addArg((((FunctionContext)_localctx).arg1!=null?((FunctionContext)_localctx).arg1.getText():null)); 
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(81);
					match(T__3);
					setState(82);
					((FunctionContext)_localctx).arg2 = match(ID);
					 _localctx.val.addArg((((FunctionContext)_localctx).arg2!=null?((FunctionContext)_localctx).arg2.getText():null)); 
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(91);
			match(RIGHT_BRACKET);
			setState(92);
			match(COLON);
			setState(93);
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
			setState(95);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
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
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				((StatementContext)_localctx).a = expression();
				((StatementContext)_localctx).val =  new Front.StatementExpression(((StatementContext)_localctx).a.val); 
				}
				break;
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				((StatementContext)_localctx).c = variable_declaration();
				 ((StatementContext)_localctx).val =  ((StatementContext)_localctx).c.val; 
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				((StatementContext)_localctx).d = print();
				{ ((StatementContext)_localctx).val =  ((StatementContext)_localctx).d.val; } 
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

	public static class ExpressionContext extends ParserRuleContext {
		public Front.Expression val;
		public Token a;
		public AssignmentContext d;
		public TerminalNode NUMBER() { return getToken(PParser.NUMBER, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
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
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				((ExpressionContext)_localctx).a = match(NUMBER);
				 ((ExpressionContext)_localctx).val =  new Front.IntExpression((((ExpressionContext)_localctx).a!=null?((ExpressionContext)_localctx).a.getText():null)); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				((ExpressionContext)_localctx).d = assignment();
				 ((ExpressionContext)_localctx).val =  ((ExpressionContext)_localctx).d.val; 
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
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			((AssignmentContext)_localctx).to = match(ID);
			setState(117);
			match(EQUALS);
			setState(118);
			((AssignmentContext)_localctx).what = expression();
			 ((AssignmentContext)_localctx).val =  new Front.Assignment((((AssignmentContext)_localctx).to!=null?((AssignmentContext)_localctx).to.getText():null), ((AssignmentContext)_localctx).what.val); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declarationContext extends ParserRuleContext {
		public Front.VariableDeclaration val;
		public Token name;
		public Token value;
		public TerminalNode INT() { return getToken(PParser.INT, 0); }
		public TerminalNode EQUALS() { return getToken(PParser.EQUALS, 0); }
		public TerminalNode ID() { return getToken(PParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(PParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(PParser.FLOAT, 0); }
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitVariable_declaration(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable_declaration);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(INT);
				setState(122);
				((Variable_declarationContext)_localctx).name = match(ID);
				setState(123);
				match(EQUALS);
				setState(124);
				((Variable_declarationContext)_localctx).value = match(NUMBER);
				 ((Variable_declarationContext)_localctx).val =  new Front.IntVariableDeclaration((((Variable_declarationContext)_localctx).name!=null?((Variable_declarationContext)_localctx).name.getText():null),(((Variable_declarationContext)_localctx).value!=null?((Variable_declarationContext)_localctx).value.getText():null)); 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(FLOAT);
				setState(127);
				((Variable_declarationContext)_localctx).name = match(ID);
				setState(128);
				match(EQUALS);
				setState(129);
				((Variable_declarationContext)_localctx).value = match(NUMBER);
				 ((Variable_declarationContext)_localctx).val =  new Front.FloatVariableDeclaration((((Variable_declarationContext)_localctx).name!=null?((Variable_declarationContext)_localctx).name.getText():null),(((Variable_declarationContext)_localctx).value!=null?((Variable_declarationContext)_localctx).value.getText():null)); 
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
			setState(133);
			match(PRINT);
			setState(134);
			match(LEFT_BRACKET);
			setState(135);
			((PrintContext)_localctx).reference = match(ID);
			setState(136);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22\u008e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\25"+
		"\n\2\f\2\16\2\30\13\2\3\2\3\2\6\2\34\n\2\r\2\16\2\35\3\2\3\2\3\2\3\2\7"+
		"\2$\n\2\f\2\16\2\'\13\2\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\3\3\3\7\3\62"+
		"\n\3\f\3\16\3\65\13\3\3\3\3\3\3\3\6\3:\n\3\r\3\16\3;\3\3\3\3\3\3\7\3A"+
		"\n\3\f\3\16\3D\13\3\3\3\6\3G\n\3\r\3\16\3H\5\3K\n\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4W\n\4\f\4\16\4Z\13\4\5\4\\\n\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5n\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\5\6u\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u0086\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f"+
		"\16\20\2\3\3\2\t\n\2\u0095\2\22\3\2\2\2\4/\3\2\2\2\6N\3\2\2\2\bm\3\2\2"+
		"\2\nt\3\2\2\2\fv\3\2\2\2\16\u0085\3\2\2\2\20\u0087\3\2\2\2\22\26\b\2\1"+
		"\2\23\25\7\3\2\2\24\23\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2"+
		"\2\27,\3\2\2\2\30\26\3\2\2\2\31\33\5\b\5\2\32\34\7\3\2\2\33\32\3\2\2\2"+
		"\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37 \b\2\1\2 "+
		"+\3\2\2\2!%\5\6\4\2\"$\7\3\2\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2"+
		"\2&(\3\2\2\2\'%\3\2\2\2()\b\2\1\2)+\3\2\2\2*\31\3\2\2\2*!\3\2\2\2+.\3"+
		"\2\2\2,*\3\2\2\2,-\3\2\2\2-\3\3\2\2\2.,\3\2\2\2/J\7\4\2\2\60\62\7\3\2"+
		"\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2"+
		"\2\65\63\3\2\2\2\66\67\5\b\5\2\67B\b\3\1\28:\7\3\2\298\3\2\2\2:;\3\2\2"+
		"\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\5\b\5\2>?\b\3\1\2?A\3\2\2\2@9\3\2\2"+
		"\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CF\3\2\2\2DB\3\2\2\2EG\7\3\2\2FE\3\2\2"+
		"\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2J\63\3\2\2\2JK\3\2\2\2KL\3\2"+
		"\2\2LM\7\5\2\2M\5\3\2\2\2NO\7\f\2\2OP\7\r\2\2P[\7\20\2\2QR\7\r\2\2RX\b"+
		"\4\1\2ST\7\6\2\2TU\7\r\2\2UW\b\4\1\2VS\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3"+
		"\2\2\2Y\\\3\2\2\2ZX\3\2\2\2[Q\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\21\2\2"+
		"^_\7\17\2\2_`\t\2\2\2`a\b\4\1\2ab\5\4\3\2bc\b\4\1\2c\7\3\2\2\2de\5\n\6"+
		"\2ef\b\5\1\2fn\3\2\2\2gh\5\16\b\2hi\b\5\1\2in\3\2\2\2jk\5\20\t\2kl\b\5"+
		"\1\2ln\3\2\2\2md\3\2\2\2mg\3\2\2\2mj\3\2\2\2n\t\3\2\2\2op\7\b\2\2pu\b"+
		"\6\1\2qr\5\f\7\2rs\b\6\1\2su\3\2\2\2to\3\2\2\2tq\3\2\2\2u\13\3\2\2\2v"+
		"w\7\r\2\2wx\7\16\2\2xy\5\n\6\2yz\b\7\1\2z\r\3\2\2\2{|\7\t\2\2|}\7\r\2"+
		"\2}~\7\16\2\2~\177\7\b\2\2\177\u0086\b\b\1\2\u0080\u0081\7\n\2\2\u0081"+
		"\u0082\7\r\2\2\u0082\u0083\7\16\2\2\u0083\u0084\7\b\2\2\u0084\u0086\b"+
		"\b\1\2\u0085{\3\2\2\2\u0085\u0080\3\2\2\2\u0086\17\3\2\2\2\u0087\u0088"+
		"\7\13\2\2\u0088\u0089\7\20\2\2\u0089\u008a\7\r\2\2\u008a\u008b\7\21\2"+
		"\2\u008b\u008c\b\t\1\2\u008c\21\3\2\2\2\21\26\35%*,\63;BHJX[mt\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}