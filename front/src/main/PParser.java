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
		T__0=1, T__1=2, T__2=3, T__3=4, NEW=5, NUMBER=6, NUMBER_FLOAT=7, INT=8, 
		FLOAT=9, STATIC=10, STRING=11, STRING_LITERAL=12, PRINT=13, READ_INT=14, 
		READ_FLOAT=15, FUN=16, IF=17, WHILE=18, RETURN=19, ID=20, EQUALS=21, COLON=22, 
		DOUBLE_QUOTE=23, ADD=24, MINUS=25, BOOL_OPERATOR=26, MUTLIPLY=27, DIVIDE=28, 
		LEFT_BRACKET=29, RIGHT_BRACKET=30, LEFT_SQUARE_BRACKET=31, RIGHT_SQUARE_BRACKET=32, 
		WS=33, COMMENT=34;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_function = 2, RULE_ifExpr = 3, RULE_whileLoop = 4, 
		RULE_whileExpr = 5, RULE_statement = 6, RULE_operator = 7, RULE_expression = 8, 
		RULE_indexingExpression = 9, RULE_assignment = 10, RULE_variable_declaration = 11, 
		RULE_array = 12, RULE_print = 13, RULE_returnst = 14, RULE_read = 15;
	public static final String[] ruleNames = {
		"program", "body", "function", "ifExpr", "whileLoop", "whileExpr", "statement", 
		"operator", "expression", "indexingExpression", "assignment", "variable_declaration", 
		"array", "print", "returnst", "read"
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
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(33);
					match(T__0);
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(56);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						{
						setState(39);
						((ProgramContext)_localctx).statement = statement();
						setState(41); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(40);
								match(T__0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(43); 
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
						setState(47);
						((ProgramContext)_localctx).function = function();
						setState(51);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(48);
								match(T__0);
								}
								} 
							}
							setState(53);
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
				setState(60);
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
			setState(61);
			match(T__1);
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(62);
						match(T__0);
						}
						} 
					}
					setState(67);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(68);
				((BodyContext)_localctx).a = statement();
				 ((BodyContext)_localctx).val =  new Front.Body(); _localctx.val.add(((BodyContext)_localctx).a.val); 
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(71); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(70);
								match(T__0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(73); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(75);
						((BodyContext)_localctx).b = statement();
						 _localctx.val.add(((BodyContext)_localctx).b.val); 
						}
						} 
					}
					setState(82);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(83);
					match(T__0);
					}
					}
					setState(86); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				break;
			}
			setState(90);
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
			setState(92);
			match(FUN);
			setState(93);
			((FunctionContext)_localctx).name = match(ID);
			setState(94);
			match(LEFT_BRACKET);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(95);
				((FunctionContext)_localctx).arg1 = match(ID);
				 _localctx.val.addArg((((FunctionContext)_localctx).arg1!=null?((FunctionContext)_localctx).arg1.getText():null)); 
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(97);
					match(T__3);
					setState(98);
					((FunctionContext)_localctx).arg2 = match(ID);
					 _localctx.val.addArg((((FunctionContext)_localctx).arg2!=null?((FunctionContext)_localctx).arg2.getText():null)); 
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(107);
			match(RIGHT_BRACKET);
			setState(108);
			match(COLON);
			setState(109);
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
			setState(111);
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

	public static class IfExprContext extends ParserRuleContext {
		public Front.IfExpr val;
		public OperatorContext operator;
		public BodyContext body;
		public TerminalNode IF() { return getToken(PParser.IF, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(PParser.LEFT_BRACKET, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(PParser.RIGHT_BRACKET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitIfExpr(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(IF);
			setState(115);
			match(LEFT_BRACKET);
			setState(116);
			((IfExprContext)_localctx).operator = operator();
			setState(117);
			match(RIGHT_BRACKET);
			 ((IfExprContext)_localctx).val =  new Front.IfExpr(((IfExprContext)_localctx).operator.val); 
			setState(119);
			((IfExprContext)_localctx).body = body();
			 _localctx.val.setBody(((IfExprContext)_localctx).body.val); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopContext extends ParserRuleContext {
		public Front.While val;
		public WhileExprContext whileExpr;
		public BodyContext body;
		public TerminalNode WHILE() { return getToken(PParser.WHILE, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(PParser.LEFT_BRACKET, 0); }
		public WhileExprContext whileExpr() {
			return getRuleContext(WhileExprContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(PParser.RIGHT_BRACKET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(WHILE);
			setState(123);
			match(LEFT_BRACKET);
			setState(124);
			((WhileLoopContext)_localctx).whileExpr = whileExpr();
			setState(125);
			match(RIGHT_BRACKET);
			 ((WhileLoopContext)_localctx).val =  new Front.While(((WhileLoopContext)_localctx).whileExpr.val); 
			setState(127);
			((WhileLoopContext)_localctx).body = body();
			 _localctx.val.setBody(((WhileLoopContext)_localctx).body.val); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileExprContext extends ParserRuleContext {
		public Front.WhileExpr val;
		public Token left;
		public Token op;
		public Token right;
		public TerminalNode ID() { return getToken(PParser.ID, 0); }
		public TerminalNode BOOL_OPERATOR() { return getToken(PParser.BOOL_OPERATOR, 0); }
		public TerminalNode NUMBER() { return getToken(PParser.NUMBER, 0); }
		public WhileExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterWhileExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitWhileExpr(this);
		}
	}

	public final WhileExprContext whileExpr() throws RecognitionException {
		WhileExprContext _localctx = new WhileExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileExpr);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				((WhileExprContext)_localctx).left = match(ID);
				setState(131);
				((WhileExprContext)_localctx).op = match(BOOL_OPERATOR);
				setState(132);
				((WhileExprContext)_localctx).right = match(NUMBER);
				 ((WhileExprContext)_localctx).val =  new Front.WhileExpr((((WhileExprContext)_localctx).left!=null?((WhileExprContext)_localctx).left.getText():null),(((WhileExprContext)_localctx).op!=null?((WhileExprContext)_localctx).op.getText():null),(((WhileExprContext)_localctx).right!=null?((WhileExprContext)_localctx).right.getText():null)); 
				}
				break;
			case RIGHT_BRACKET:
				enterOuterAlt(_localctx, 2);
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

	public static class StatementContext extends ParserRuleContext {
		public Front.Statement val;
		public ExpressionContext a;
		public Variable_declarationContext c;
		public PrintContext d;
		public ReturnstContext e;
		public ReadContext f;
		public IfExprContext g;
		public WhileLoopContext h;
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
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
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
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				((StatementContext)_localctx).a = expression(0);
				((StatementContext)_localctx).val =  new Front.StatementExpression(((StatementContext)_localctx).a.val); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				((StatementContext)_localctx).c = variable_declaration();
				 ((StatementContext)_localctx).val =  ((StatementContext)_localctx).c.val; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				((StatementContext)_localctx).d = print();
				{ ((StatementContext)_localctx).val =  ((StatementContext)_localctx).d.val; } 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				((StatementContext)_localctx).e = returnst();
				{ ((StatementContext)_localctx).val =  ((StatementContext)_localctx).e.val; } 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				((StatementContext)_localctx).f = read();
				{ ((StatementContext)_localctx).val =  ((StatementContext)_localctx).f.val; } 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				((StatementContext)_localctx).g = ifExpr();
				{ ((StatementContext)_localctx).val =  ((StatementContext)_localctx).g.val; } 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				((StatementContext)_localctx).h = whileLoop();
				{ ((StatementContext)_localctx).val =  ((StatementContext)_localctx).h.val; } 
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

	public static class OperatorContext extends ParserRuleContext {
		public Front.BoolExpr val;
		public Token left;
		public Token op;
		public Token right;
		public List<TerminalNode> NUMBER() { return getTokens(PParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PParser.NUMBER, i);
		}
		public TerminalNode BOOL_OPERATOR() { return getToken(PParser.BOOL_OPERATOR, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operator);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				((OperatorContext)_localctx).left = match(NUMBER);
				setState(161);
				((OperatorContext)_localctx).op = match(BOOL_OPERATOR);
				setState(162);
				((OperatorContext)_localctx).right = match(NUMBER);
				 ((OperatorContext)_localctx).val =  new Front.BoolExpr((((OperatorContext)_localctx).left!=null?((OperatorContext)_localctx).left.getText():null),(((OperatorContext)_localctx).op!=null?((OperatorContext)_localctx).op.getText():null),(((OperatorContext)_localctx).right!=null?((OperatorContext)_localctx).right.getText():null)); 
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
		public OperatorContext z;
		public ExpressionContext e;
		public ExpressionContext g;
		public ExpressionContext i;
		public ExpressionContext k;
		public TerminalNode NUMBER() { return getToken(PParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(PParser.ID, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IndexingExpressionContext indexingExpression() {
			return getRuleContext(IndexingExpressionContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(168);
				((ExpressionContext)_localctx).a = match(NUMBER);
				 ((ExpressionContext)_localctx).val =  new Front.NumberExpression((((ExpressionContext)_localctx).a!=null?((ExpressionContext)_localctx).a.getText():null)); 
				}
				break;
			case 2:
				{
				setState(170);
				((ExpressionContext)_localctx).b = match(ID);
				 ((ExpressionContext)_localctx).val =  new Front.IdExpression((((ExpressionContext)_localctx).b!=null?((ExpressionContext)_localctx).b.getText():null)); 
				}
				break;
			case 3:
				{
				setState(172);
				((ExpressionContext)_localctx).c = assignment();
				 ((ExpressionContext)_localctx).val =  ((ExpressionContext)_localctx).c.val; 
				}
				break;
			case 4:
				{
				setState(175);
				((ExpressionContext)_localctx).l = indexingExpression();
				 ((ExpressionContext)_localctx).val =  ((ExpressionContext)_localctx).l.val; 
				}
				break;
			case 5:
				{
				setState(178);
				((ExpressionContext)_localctx).z = operator();
				{ ((ExpressionContext)_localctx).val =  ((ExpressionContext)_localctx).z.val; } 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.d = _prevctx;
						_localctx.d = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(184);
						match(ADD);
						setState(185);
						((ExpressionContext)_localctx).e = expression(7);
						 ((ExpressionContext)_localctx).val =  new Front.AddExpression(((ExpressionContext)_localctx).d.val,((ExpressionContext)_localctx).e.val); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(188);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(189);
						match(MINUS);
						setState(190);
						((ExpressionContext)_localctx).g = expression(6);
						 ((ExpressionContext)_localctx).val =  new Front.MinusExpression(((ExpressionContext)_localctx).f.val,((ExpressionContext)_localctx).g.val); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.h = _prevctx;
						_localctx.h = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(194);
						match(MUTLIPLY);
						setState(195);
						((ExpressionContext)_localctx).i = expression(5);
						 ((ExpressionContext)_localctx).val =  new Front.MultiplyExpression(((ExpressionContext)_localctx).h.val,((ExpressionContext)_localctx).i.val); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.j = _prevctx;
						_localctx.j = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(199);
						match(DIVIDE);
						setState(200);
						((ExpressionContext)_localctx).k = expression(4);
						 ((ExpressionContext)_localctx).val =  new Front.DivideExpression(((ExpressionContext)_localctx).j.val,((ExpressionContext)_localctx).k.val); 
						}
						break;
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class IndexingExpressionContext extends ParserRuleContext {
		public Front.IndexingExpression val;
		public Token name;
		public Token index;
		public Token value;
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(PParser.LEFT_SQUARE_BRACKET, 0); }
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(PParser.RIGHT_SQUARE_BRACKET, 0); }
		public TerminalNode EQUALS() { return getToken(PParser.EQUALS, 0); }
		public TerminalNode ID() { return getToken(PParser.ID, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(PParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PParser.NUMBER, i);
		}
		public IndexingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterIndexingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitIndexingExpression(this);
		}
	}

	public final IndexingExpressionContext indexingExpression() throws RecognitionException {
		IndexingExpressionContext _localctx = new IndexingExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_indexingExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			((IndexingExpressionContext)_localctx).name = match(ID);
			setState(209);
			match(LEFT_SQUARE_BRACKET);
			setState(210);
			((IndexingExpressionContext)_localctx).index = match(NUMBER);
			setState(211);
			match(RIGHT_SQUARE_BRACKET);
			setState(212);
			match(EQUALS);
			setState(213);
			((IndexingExpressionContext)_localctx).value = match(NUMBER);
			 ((IndexingExpressionContext)_localctx).val =  new Front.IndexingExpression((((IndexingExpressionContext)_localctx).name!=null?((IndexingExpressionContext)_localctx).name.getText():null),(((IndexingExpressionContext)_localctx).index!=null?((IndexingExpressionContext)_localctx).index.getText():null),(((IndexingExpressionContext)_localctx).value!=null?((IndexingExpressionContext)_localctx).value.getText():null)); 
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 20, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			((AssignmentContext)_localctx).to = match(ID);
			setState(217);
			match(EQUALS);
			setState(218);
			((AssignmentContext)_localctx).what = expression(0);
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
		public ArrayContext f;
		public TerminalNode INT() { return getToken(PParser.INT, 0); }
		public TerminalNode EQUALS() { return getToken(PParser.EQUALS, 0); }
		public TerminalNode ID() { return getToken(PParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(PParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(PParser.FLOAT, 0); }
		public TerminalNode NUMBER_FLOAT() { return getToken(PParser.NUMBER_FLOAT, 0); }
		public TerminalNode STRING() { return getToken(PParser.STRING, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(PParser.STRING_LITERAL, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(PParser.STATIC, 0); }
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
		enterRule(_localctx, 22, RULE_variable_declaration);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(INT);
				setState(222);
				((Variable_declarationContext)_localctx).name = match(ID);
				setState(223);
				match(EQUALS);
				setState(224);
				((Variable_declarationContext)_localctx).value = match(NUMBER);
				 ((Variable_declarationContext)_localctx).val =  new Front.IntVariableDeclaration((((Variable_declarationContext)_localctx).name!=null?((Variable_declarationContext)_localctx).name.getText():null),(((Variable_declarationContext)_localctx).value!=null?((Variable_declarationContext)_localctx).value.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(FLOAT);
				setState(227);
				((Variable_declarationContext)_localctx).name = match(ID);
				setState(228);
				match(EQUALS);
				setState(229);
				((Variable_declarationContext)_localctx).value = match(NUMBER_FLOAT);
				 ((Variable_declarationContext)_localctx).val =  new Front.FloatVariableDeclaration((((Variable_declarationContext)_localctx).name!=null?((Variable_declarationContext)_localctx).name.getText():null),(((Variable_declarationContext)_localctx).value!=null?((Variable_declarationContext)_localctx).value.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(STRING);
				setState(232);
				((Variable_declarationContext)_localctx).name = match(ID);
				setState(233);
				match(EQUALS);
				setState(234);
				((Variable_declarationContext)_localctx).value = match(STRING_LITERAL);
				 ((Variable_declarationContext)_localctx).val =  new Front.StringVariableDeclaration((((Variable_declarationContext)_localctx).name!=null?((Variable_declarationContext)_localctx).name.getText():null),(((Variable_declarationContext)_localctx).value!=null?((Variable_declarationContext)_localctx).value.getText():null)); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				((Variable_declarationContext)_localctx).f = array();
				{ ((Variable_declarationContext)_localctx).val =  ((Variable_declarationContext)_localctx).f.val; } 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(239);
				match(STATIC);
				setState(240);
				match(INT);
				setState(241);
				((Variable_declarationContext)_localctx).name = match(ID);
				setState(242);
				match(EQUALS);
				setState(243);
				((Variable_declarationContext)_localctx).value = match(NUMBER);
				 ((Variable_declarationContext)_localctx).val =  new Front.StaticIntVariableDeclaration((((Variable_declarationContext)_localctx).name!=null?((Variable_declarationContext)_localctx).name.getText():null),(((Variable_declarationContext)_localctx).value!=null?((Variable_declarationContext)_localctx).value.getText():null)); 
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

	public static class ArrayContext extends ParserRuleContext {
		public Front.Array val;
		public Token name;
		public Token size;
		public List<TerminalNode> INT() { return getTokens(PParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(PParser.INT, i);
		}
		public List<TerminalNode> LEFT_SQUARE_BRACKET() { return getTokens(PParser.LEFT_SQUARE_BRACKET); }
		public TerminalNode LEFT_SQUARE_BRACKET(int i) {
			return getToken(PParser.LEFT_SQUARE_BRACKET, i);
		}
		public List<TerminalNode> RIGHT_SQUARE_BRACKET() { return getTokens(PParser.RIGHT_SQUARE_BRACKET); }
		public TerminalNode RIGHT_SQUARE_BRACKET(int i) {
			return getToken(PParser.RIGHT_SQUARE_BRACKET, i);
		}
		public TerminalNode EQUALS() { return getToken(PParser.EQUALS, 0); }
		public TerminalNode NEW() { return getToken(PParser.NEW, 0); }
		public TerminalNode ID() { return getToken(PParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(PParser.NUMBER, 0); }
		public List<TerminalNode> FLOAT() { return getTokens(PParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(PParser.FLOAT, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_array);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(INT);
				setState(248);
				match(LEFT_SQUARE_BRACKET);
				setState(249);
				match(RIGHT_SQUARE_BRACKET);
				setState(250);
				((ArrayContext)_localctx).name = match(ID);
				setState(251);
				match(EQUALS);
				setState(252);
				match(NEW);
				setState(253);
				match(INT);
				setState(254);
				match(LEFT_SQUARE_BRACKET);
				setState(255);
				((ArrayContext)_localctx).size = match(NUMBER);
				setState(256);
				match(RIGHT_SQUARE_BRACKET);
				((ArrayContext)_localctx).val =  new Front.ArrayInt((((ArrayContext)_localctx).name!=null?((ArrayContext)_localctx).name.getText():null), (((ArrayContext)_localctx).size!=null?((ArrayContext)_localctx).size.getText():null));
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(FLOAT);
				setState(259);
				match(LEFT_SQUARE_BRACKET);
				setState(260);
				match(RIGHT_SQUARE_BRACKET);
				setState(261);
				((ArrayContext)_localctx).name = match(ID);
				setState(262);
				match(EQUALS);
				setState(263);
				match(NEW);
				setState(264);
				match(FLOAT);
				setState(265);
				match(LEFT_SQUARE_BRACKET);
				setState(266);
				((ArrayContext)_localctx).size = match(NUMBER);
				setState(267);
				match(RIGHT_SQUARE_BRACKET);
				((ArrayContext)_localctx).val =  new Front.ArrayFloat((((ArrayContext)_localctx).name!=null?((ArrayContext)_localctx).name.getText():null), (((ArrayContext)_localctx).size!=null?((ArrayContext)_localctx).size.getText():null));
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
		public Token index;
		public TerminalNode PRINT() { return getToken(PParser.PRINT, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(PParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(PParser.RIGHT_BRACKET, 0); }
		public TerminalNode ID() { return getToken(PParser.ID, 0); }
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(PParser.LEFT_SQUARE_BRACKET, 0); }
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(PParser.RIGHT_SQUARE_BRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(PParser.NUMBER, 0); }
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
		enterRule(_localctx, 26, RULE_print);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(PRINT);
				setState(272);
				match(LEFT_BRACKET);
				setState(273);
				((PrintContext)_localctx).reference = match(ID);
				setState(274);
				match(RIGHT_BRACKET);
				((PrintContext)_localctx).val =  new Front.PrintIDStatement((((PrintContext)_localctx).reference!=null?((PrintContext)_localctx).reference.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(PRINT);
				setState(277);
				match(LEFT_BRACKET);
				setState(278);
				((PrintContext)_localctx).reference = match(ID);
				setState(279);
				match(LEFT_SQUARE_BRACKET);
				setState(280);
				((PrintContext)_localctx).index = match(NUMBER);
				setState(281);
				match(RIGHT_SQUARE_BRACKET);
				setState(282);
				match(RIGHT_BRACKET);
				((PrintContext)_localctx).val =  new Front.PrintIndex((((PrintContext)_localctx).reference!=null?((PrintContext)_localctx).reference.getText():null),(((PrintContext)_localctx).index!=null?((PrintContext)_localctx).index.getText():null));
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
		enterRule(_localctx, 28, RULE_returnst);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(RETURN);
				setState(287);
				((ReturnstContext)_localctx).NUMBER = match(NUMBER);
				((ReturnstContext)_localctx).val =  new Front.ReturnInt((((ReturnstContext)_localctx).NUMBER!=null?((ReturnstContext)_localctx).NUMBER.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(RETURN);
				setState(290);
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
		enterRule(_localctx, 30, RULE_read);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(READ_INT);
				setState(295);
				match(LEFT_BRACKET);
				setState(296);
				((ReadContext)_localctx).reference = match(ID);
				setState(297);
				match(RIGHT_BRACKET);
				((ReadContext)_localctx).val =  new Front.ReadInt((((ReadContext)_localctx).reference!=null?((ReadContext)_localctx).reference.getText():null));
				}
				break;
			case READ_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(READ_FLOAT);
				setState(300);
				match(LEFT_BRACKET);
				setState(301);
				((ReadContext)_localctx).reference = match(ID);
				setState(302);
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
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0136\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\7"+
		"\2%\n\2\f\2\16\2(\13\2\3\2\3\2\6\2,\n\2\r\2\16\2-\3\2\3\2\3\2\3\2\7\2"+
		"\64\n\2\f\2\16\2\67\13\2\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\3\3\3\7\3B"+
		"\n\3\f\3\16\3E\13\3\3\3\3\3\3\3\6\3J\n\3\r\3\16\3K\3\3\3\3\3\3\7\3Q\n"+
		"\3\f\3\16\3T\13\3\3\3\6\3W\n\3\r\3\16\3X\5\3[\n\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4g\n\4\f\4\16\4j\13\4\5\4l\n\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u008a\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a1\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u00a8\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u00b8\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ce\n\n\f\n\16\n\u00d1"+
		"\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f8\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0110\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u011f\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0127"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0134"+
		"\n\21\3\21\2\3\22\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\3\2\n"+
		"\13\2\u014a\2\"\3\2\2\2\4?\3\2\2\2\6^\3\2\2\2\bt\3\2\2\2\n|\3\2\2\2\f"+
		"\u0089\3\2\2\2\16\u00a0\3\2\2\2\20\u00a7\3\2\2\2\22\u00b7\3\2\2\2\24\u00d2"+
		"\3\2\2\2\26\u00da\3\2\2\2\30\u00f7\3\2\2\2\32\u010f\3\2\2\2\34\u011e\3"+
		"\2\2\2\36\u0126\3\2\2\2 \u0133\3\2\2\2\"&\b\2\1\2#%\7\3\2\2$#\3\2\2\2"+
		"%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'<\3\2\2\2(&\3\2\2\2)+\5\16\b\2*,\7\3"+
		"\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\b\2\1\2\60"+
		";\3\2\2\2\61\65\5\6\4\2\62\64\7\3\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63"+
		"\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\b\2\1\29;\3\2\2\2:"+
		")\3\2\2\2:\61\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\3\3\2\2\2><\3\2\2"+
		"\2?Z\7\4\2\2@B\7\3\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2"+
		"\2EC\3\2\2\2FG\5\16\b\2GR\b\3\1\2HJ\7\3\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2"+
		"\2\2KL\3\2\2\2LM\3\2\2\2MN\5\16\b\2NO\b\3\1\2OQ\3\2\2\2PI\3\2\2\2QT\3"+
		"\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3\2\2\2UW\7\3\2\2VU\3\2\2\2WX\3"+
		"\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZC\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\"+
		"]\7\5\2\2]\5\3\2\2\2^_\7\22\2\2_`\7\26\2\2`k\7\37\2\2ab\7\26\2\2bh\b\4"+
		"\1\2cd\7\6\2\2de\7\26\2\2eg\b\4\1\2fc\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3"+
		"\2\2\2il\3\2\2\2jh\3\2\2\2ka\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7 \2\2no\7"+
		"\30\2\2op\t\2\2\2pq\b\4\1\2qr\5\4\3\2rs\b\4\1\2s\7\3\2\2\2tu\7\23\2\2"+
		"uv\7\37\2\2vw\5\20\t\2wx\7 \2\2xy\b\5\1\2yz\5\4\3\2z{\b\5\1\2{\t\3\2\2"+
		"\2|}\7\24\2\2}~\7\37\2\2~\177\5\f\7\2\177\u0080\7 \2\2\u0080\u0081\b\6"+
		"\1\2\u0081\u0082\5\4\3\2\u0082\u0083\b\6\1\2\u0083\13\3\2\2\2\u0084\u0085"+
		"\7\26\2\2\u0085\u0086\7\34\2\2\u0086\u0087\7\b\2\2\u0087\u008a\b\7\1\2"+
		"\u0088\u008a\3\2\2\2\u0089\u0084\3\2\2\2\u0089\u0088\3\2\2\2\u008a\r\3"+
		"\2\2\2\u008b\u008c\5\22\n\2\u008c\u008d\b\b\1\2\u008d\u00a1\3\2\2\2\u008e"+
		"\u008f\5\30\r\2\u008f\u0090\b\b\1\2\u0090\u00a1\3\2\2\2\u0091\u0092\5"+
		"\34\17\2\u0092\u0093\b\b\1\2\u0093\u00a1\3\2\2\2\u0094\u0095\5\36\20\2"+
		"\u0095\u0096\b\b\1\2\u0096\u00a1\3\2\2\2\u0097\u0098\5 \21\2\u0098\u0099"+
		"\b\b\1\2\u0099\u00a1\3\2\2\2\u009a\u009b\5\b\5\2\u009b\u009c\b\b\1\2\u009c"+
		"\u00a1\3\2\2\2\u009d\u009e\5\n\6\2\u009e\u009f\b\b\1\2\u009f\u00a1\3\2"+
		"\2\2\u00a0\u008b\3\2\2\2\u00a0\u008e\3\2\2\2\u00a0\u0091\3\2\2\2\u00a0"+
		"\u0094\3\2\2\2\u00a0\u0097\3\2\2\2\u00a0\u009a\3\2\2\2\u00a0\u009d\3\2"+
		"\2\2\u00a1\17\3\2\2\2\u00a2\u00a3\7\b\2\2\u00a3\u00a4\7\34\2\2\u00a4\u00a5"+
		"\7\b\2\2\u00a5\u00a8\b\t\1\2\u00a6\u00a8\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\21\3\2\2\2\u00a9\u00aa\b\n\1\2\u00aa\u00ab\7\b\2"+
		"\2\u00ab\u00b8\b\n\1\2\u00ac\u00ad\7\26\2\2\u00ad\u00b8\b\n\1\2\u00ae"+
		"\u00af\5\26\f\2\u00af\u00b0\b\n\1\2\u00b0\u00b8\3\2\2\2\u00b1\u00b2\5"+
		"\24\13\2\u00b2\u00b3\b\n\1\2\u00b3\u00b8\3\2\2\2\u00b4\u00b5\5\20\t\2"+
		"\u00b5\u00b6\b\n\1\2\u00b6\u00b8\3\2\2\2\u00b7\u00a9\3\2\2\2\u00b7\u00ac"+
		"\3\2\2\2\u00b7\u00ae\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b8"+
		"\u00cf\3\2\2\2\u00b9\u00ba\f\b\2\2\u00ba\u00bb\7\32\2\2\u00bb\u00bc\5"+
		"\22\n\t\u00bc\u00bd\b\n\1\2\u00bd\u00ce\3\2\2\2\u00be\u00bf\f\7\2\2\u00bf"+
		"\u00c0\7\33\2\2\u00c0\u00c1\5\22\n\b\u00c1\u00c2\b\n\1\2\u00c2\u00ce\3"+
		"\2\2\2\u00c3\u00c4\f\6\2\2\u00c4\u00c5\7\35\2\2\u00c5\u00c6\5\22\n\7\u00c6"+
		"\u00c7\b\n\1\2\u00c7\u00ce\3\2\2\2\u00c8\u00c9\f\5\2\2\u00c9\u00ca\7\36"+
		"\2\2\u00ca\u00cb\5\22\n\6\u00cb\u00cc\b\n\1\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00b9\3\2\2\2\u00cd\u00be\3\2\2\2\u00cd\u00c3\3\2\2\2\u00cd\u00c8\3\2"+
		"\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\23\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7\26\2\2\u00d3\u00d4\7!\2"+
		"\2\u00d4\u00d5\7\b\2\2\u00d5\u00d6\7\"\2\2\u00d6\u00d7\7\27\2\2\u00d7"+
		"\u00d8\7\b\2\2\u00d8\u00d9\b\13\1\2\u00d9\25\3\2\2\2\u00da\u00db\7\26"+
		"\2\2\u00db\u00dc\7\27\2\2\u00dc\u00dd\5\22\n\2\u00dd\u00de\b\f\1\2\u00de"+
		"\27\3\2\2\2\u00df\u00e0\7\n\2\2\u00e0\u00e1\7\26\2\2\u00e1\u00e2\7\27"+
		"\2\2\u00e2\u00e3\7\b\2\2\u00e3\u00f8\b\r\1\2\u00e4\u00e5\7\13\2\2\u00e5"+
		"\u00e6\7\26\2\2\u00e6\u00e7\7\27\2\2\u00e7\u00e8\7\t\2\2\u00e8\u00f8\b"+
		"\r\1\2\u00e9\u00ea\7\r\2\2\u00ea\u00eb\7\26\2\2\u00eb\u00ec\7\27\2\2\u00ec"+
		"\u00ed\7\16\2\2\u00ed\u00f8\b\r\1\2\u00ee\u00ef\5\32\16\2\u00ef\u00f0"+
		"\b\r\1\2\u00f0\u00f8\3\2\2\2\u00f1\u00f2\7\f\2\2\u00f2\u00f3\7\n\2\2\u00f3"+
		"\u00f4\7\26\2\2\u00f4\u00f5\7\27\2\2\u00f5\u00f6\7\b\2\2\u00f6\u00f8\b"+
		"\r\1\2\u00f7\u00df\3\2\2\2\u00f7\u00e4\3\2\2\2\u00f7\u00e9\3\2\2\2\u00f7"+
		"\u00ee\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f8\31\3\2\2\2\u00f9\u00fa\7\n\2"+
		"\2\u00fa\u00fb\7!\2\2\u00fb\u00fc\7\"\2\2\u00fc\u00fd\7\26\2\2\u00fd\u00fe"+
		"\7\27\2\2\u00fe\u00ff\7\7\2\2\u00ff\u0100\7\n\2\2\u0100\u0101\7!\2\2\u0101"+
		"\u0102\7\b\2\2\u0102\u0103\7\"\2\2\u0103\u0110\b\16\1\2\u0104\u0105\7"+
		"\13\2\2\u0105\u0106\7!\2\2\u0106\u0107\7\"\2\2\u0107\u0108\7\26\2\2\u0108"+
		"\u0109\7\27\2\2\u0109\u010a\7\7\2\2\u010a\u010b\7\13\2\2\u010b\u010c\7"+
		"!\2\2\u010c\u010d\7\b\2\2\u010d\u010e\7\"\2\2\u010e\u0110\b\16\1\2\u010f"+
		"\u00f9\3\2\2\2\u010f\u0104\3\2\2\2\u0110\33\3\2\2\2\u0111\u0112\7\17\2"+
		"\2\u0112\u0113\7\37\2\2\u0113\u0114\7\26\2\2\u0114\u0115\7 \2\2\u0115"+
		"\u011f\b\17\1\2\u0116\u0117\7\17\2\2\u0117\u0118\7\37\2\2\u0118\u0119"+
		"\7\26\2\2\u0119\u011a\7!\2\2\u011a\u011b\7\b\2\2\u011b\u011c\7\"\2\2\u011c"+
		"\u011d\7 \2\2\u011d\u011f\b\17\1\2\u011e\u0111\3\2\2\2\u011e\u0116\3\2"+
		"\2\2\u011f\35\3\2\2\2\u0120\u0121\7\25\2\2\u0121\u0122\7\b\2\2\u0122\u0127"+
		"\b\20\1\2\u0123\u0124\7\25\2\2\u0124\u0125\7\t\2\2\u0125\u0127\b\20\1"+
		"\2\u0126\u0120\3\2\2\2\u0126\u0123\3\2\2\2\u0127\37\3\2\2\2\u0128\u0129"+
		"\7\20\2\2\u0129\u012a\7\37\2\2\u012a\u012b\7\26\2\2\u012b\u012c\7 \2\2"+
		"\u012c\u0134\b\21\1\2\u012d\u012e\7\21\2\2\u012e\u012f\7\37\2\2\u012f"+
		"\u0130\7\26\2\2\u0130\u0131\7 \2\2\u0131\u0134\b\21\1\2\u0132\u0134\3"+
		"\2\2\2\u0133\u0128\3\2\2\2\u0133\u012d\3\2\2\2\u0133\u0132\3\2\2\2\u0134"+
		"!\3\2\2\2\31&-\65:<CKRXZhk\u0089\u00a0\u00a7\u00b7\u00cd\u00cf\u00f7\u010f"+
		"\u011e\u0126\u0133";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}