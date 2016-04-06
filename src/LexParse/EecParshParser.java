package LexParse;

// Generated from EecParsh.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EecParshParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTION=1, INTKEY=2, FLOATKEY=3, CHARKEY=4, STRINGKEY=5, ARRAYKEY=6, 
		VOIDKEY=7, BOOLEANKEY=8, TRUE=9, FALSE=10, IF=11, ELSE=12, WHILE=13, FOR=14, 
		RETURN=15, SWITCH=16, CASE=17, BREAK=18, DO=19, PRINT=20, SCAN=21, COMMENT=22, 
		INT=23, TERMINATE=24, SPAREN=25, EPAREN=26, SBRAC=27, EBRAC=28, ADD=29, 
		SUB=30, MULT=31, DIV=32, MOD=33, CONCAT=34, COMMA=35, AND=36, OR=37, NOT=38, 
		GREATERTHAN=39, LESSTHAN=40, GREATERTHANEQUAL=41, LESSTHANEQUAL=42, NOTEQUAL=43, 
		EQUAL=44, ASSIGN=45, COLON=46, FLOAT=47, STRING=48, CHAR=49, IDEN=50, 
		WS=51;
	public static final int
		RULE_staato = 0, RULE_printF = 1, RULE_scanF = 2, RULE_func = 3, RULE_morefparam = 4, 
		RULE_fparam = 5, RULE_codeblock = 6, RULE_datatype = 7, RULE_assign = 8, 
		RULE_dec = 9, RULE_lit = 10, RULE_bool = 11, RULE_expr = 12, RULE_nexpr = 13, 
		RULE_lexpr = 14, RULE_olexpr = 15, RULE_nlexpr = 16, RULE_mlexpr = 17, 
		RULE_lop = 18, RULE_condif = 19, RULE_condelse = 20, RULE_forloop = 21, 
		RULE_whileloop = 22, RULE_condswitch = 23, RULE_condcase = 24, RULE_switchbreak = 25, 
		RULE_funcall = 26, RULE_moreparam = 27, RULE_param = 28;
	public static final String[] ruleNames = {
		"staato", "printF", "scanF", "func", "morefparam", "fparam", "codeblock", 
		"datatype", "assign", "dec", "lit", "bool", "expr", "nexpr", "lexpr", 
		"olexpr", "nlexpr", "mlexpr", "lop", "condif", "condelse", "forloop", 
		"whileloop", "condswitch", "condcase", "switchbreak", "funcall", "moreparam", 
		"param"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'unfc'", "'nit'", "'folat'", "'cahr'", "'gnstri'", "'yaarr'", "'ovid'", 
		"'loobean'", "'rute'", "'lafse'", "'fi'", "'slee'", "'liweh'", "'orf'", 
		"'trenur'", "'twisch'", "'sace'", "'brake'", "'od'", "'pintr'", "'snac'", 
		null, null, "'!'", "')'", "'('", "'}'", "'{'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'^'", "','", "'&&'", "'||'", "'ton'", "'>'", "'<'", "'>='", "'<='", 
		"'<>'", "'=='", "'='", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FUNCTION", "INTKEY", "FLOATKEY", "CHARKEY", "STRINGKEY", "ARRAYKEY", 
		"VOIDKEY", "BOOLEANKEY", "TRUE", "FALSE", "IF", "ELSE", "WHILE", "FOR", 
		"RETURN", "SWITCH", "CASE", "BREAK", "DO", "PRINT", "SCAN", "COMMENT", 
		"INT", "TERMINATE", "SPAREN", "EPAREN", "SBRAC", "EBRAC", "ADD", "SUB", 
		"MULT", "DIV", "MOD", "CONCAT", "COMMA", "AND", "OR", "NOT", "GREATERTHAN", 
		"LESSTHAN", "GREATERTHANEQUAL", "LESSTHANEQUAL", "NOTEQUAL", "EQUAL", 
		"ASSIGN", "COLON", "FLOAT", "STRING", "CHAR", "IDEN", "WS"
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
	public String getGrammarFileName() { return "EecParsh.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EecParshParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StaatoContext extends ParserRuleContext {
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public StaatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterStaato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitStaato(this);
		}
	}

	public final StaatoContext staato() throws RecognitionException {
		StaatoContext _localctx = new StaatoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_staato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(58);
				func();
				}
				}
				setState(63);
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

	public static class PrintFContext extends ParserRuleContext {
		public LitContext lit;
		public TerminalNode PRINT() { return getToken(EecParshParser.PRINT, 0); }
		public TerminalNode SPAREN() { return getToken(EecParshParser.SPAREN, 0); }
		public LitContext lit() {
			return getRuleContext(LitContext.class,0);
		}
		public TerminalNode EPAREN() { return getToken(EecParshParser.EPAREN, 0); }
		public PrintFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterPrintF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitPrintF(this);
		}
	}

	public final PrintFContext printF() throws RecognitionException {
		PrintFContext _localctx = new PrintFContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_printF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(PRINT);
			setState(67);
			match(SPAREN);
			setState(68);
			((PrintFContext)_localctx).lit = lit();
			setState(69);
			match(EPAREN);
			System.out.println((((PrintFContext)_localctx).lit!=null?_input.getText(((PrintFContext)_localctx).lit.start,((PrintFContext)_localctx).lit.stop):null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScanFContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(EecParshParser.SCAN, 0); }
		public TerminalNode SPAREN() { return getToken(EecParshParser.SPAREN, 0); }
		public TerminalNode EPAREN() { return getToken(EecParshParser.EPAREN, 0); }
		public ScanFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterScanF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitScanF(this);
		}
	}

	public final ScanFContext scanF() throws RecognitionException {
		ScanFContext _localctx = new ScanFContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_scanF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(SCAN);
			setState(73);
			match(SPAREN);
			setState(74);
			match(EPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(EecParshParser.FUNCTION, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode IDEN() { return getToken(EecParshParser.IDEN, 0); }
		public TerminalNode SPAREN() { return getToken(EecParshParser.SPAREN, 0); }
		public MorefparamContext morefparam() {
			return getRuleContext(MorefparamContext.class,0);
		}
		public TerminalNode EPAREN() { return getToken(EecParshParser.EPAREN, 0); }
		public TerminalNode SBRAC() { return getToken(EecParshParser.SBRAC, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(EecParshParser.RETURN, 0); }
		public LitContext lit() {
			return getRuleContext(LitContext.class,0);
		}
		public TerminalNode TERMINATE() { return getToken(EecParshParser.TERMINATE, 0); }
		public TerminalNode EBRAC() { return getToken(EecParshParser.EBRAC, 0); }
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(FUNCTION);
				setState(77);
				datatype();
				setState(78);
				match(IDEN);
				setState(79);
				match(SPAREN);
				setState(80);
				morefparam(0);
				setState(81);
				match(EPAREN);
				setState(82);
				match(SBRAC);
				setState(83);
				codeblock();
				setState(84);
				match(RETURN);
				setState(85);
				lit();
				setState(86);
				match(TERMINATE);
				setState(87);
				match(EBRAC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(FUNCTION);
				setState(90);
				datatype();
				setState(91);
				match(IDEN);
				setState(92);
				match(SPAREN);
				setState(93);
				morefparam(0);
				setState(94);
				match(EPAREN);
				setState(95);
				match(SBRAC);
				setState(96);
				codeblock();
				setState(97);
				match(EBRAC);
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

	public static class MorefparamContext extends ParserRuleContext {
		public FparamContext fparam() {
			return getRuleContext(FparamContext.class,0);
		}
		public MorefparamContext morefparam() {
			return getRuleContext(MorefparamContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(EecParshParser.COMMA, 0); }
		public MorefparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_morefparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterMorefparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitMorefparam(this);
		}
	}

	public final MorefparamContext morefparam() throws RecognitionException {
		return morefparam(0);
	}

	private MorefparamContext morefparam(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MorefparamContext _localctx = new MorefparamContext(_ctx, _parentState);
		MorefparamContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_morefparam, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(102);
			fparam();
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MorefparamContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_morefparam);
					setState(104);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(105);
					match(COMMA);
					setState(106);
					fparam();
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class FparamContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode IDEN() { return getToken(EecParshParser.IDEN, 0); }
		public FparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterFparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitFparam(this);
		}
	}

	public final FparamContext fparam() throws RecognitionException {
		FparamContext _localctx = new FparamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(112);
				datatype();
				setState(113);
				match(IDEN);
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

	public static class CodeblockContext extends ParserRuleContext {
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public List<TerminalNode> TERMINATE() { return getTokens(EecParshParser.TERMINATE); }
		public TerminalNode TERMINATE(int i) {
			return getToken(EecParshParser.TERMINATE, i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<CondifContext> condif() {
			return getRuleContexts(CondifContext.class);
		}
		public CondifContext condif(int i) {
			return getRuleContext(CondifContext.class,i);
		}
		public List<CondswitchContext> condswitch() {
			return getRuleContexts(CondswitchContext.class);
		}
		public CondswitchContext condswitch(int i) {
			return getRuleContext(CondswitchContext.class,i);
		}
		public List<ForloopContext> forloop() {
			return getRuleContexts(ForloopContext.class);
		}
		public ForloopContext forloop(int i) {
			return getRuleContext(ForloopContext.class,i);
		}
		public List<WhileloopContext> whileloop() {
			return getRuleContexts(WhileloopContext.class);
		}
		public WhileloopContext whileloop(int i) {
			return getRuleContext(WhileloopContext.class,i);
		}
		public List<PrintFContext> printF() {
			return getRuleContexts(PrintFContext.class);
		}
		public PrintFContext printF(int i) {
			return getRuleContext(PrintFContext.class,i);
		}
		public List<ScanFContext> scanF() {
			return getRuleContexts(ScanFContext.class);
		}
		public ScanFContext scanF(int i) {
			return getRuleContext(ScanFContext.class,i);
		}
		public List<FuncallContext> funcall() {
			return getRuleContexts(FuncallContext.class);
		}
		public FuncallContext funcall(int i) {
			return getRuleContext(FuncallContext.class,i);
		}
		public CodeblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterCodeblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitCodeblock(this);
		}
	}

	public final CodeblockContext codeblock() throws RecognitionException {
		CodeblockContext _localctx = new CodeblockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_codeblock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(117);
						dec();
						setState(118);
						match(TERMINATE);
						}
						break;
					case 2:
						{
						setState(120);
						assign();
						setState(121);
						match(TERMINATE);
						}
						break;
					case 3:
						{
						setState(123);
						condif();
						}
						break;
					case 4:
						{
						setState(124);
						condswitch();
						}
						break;
					case 5:
						{
						setState(125);
						forloop();
						}
						break;
					case 6:
						{
						setState(126);
						whileloop();
						}
						break;
					case 7:
						{
						setState(127);
						printF();
						setState(128);
						match(TERMINATE);
						}
						break;
					case 8:
						{
						setState(130);
						scanF();
						setState(131);
						match(TERMINATE);
						}
						break;
					case 9:
						{
						setState(133);
						funcall();
						setState(134);
						match(TERMINATE);
						}
						break;
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode INTKEY() { return getToken(EecParshParser.INTKEY, 0); }
		public TerminalNode FLOATKEY() { return getToken(EecParshParser.FLOATKEY, 0); }
		public TerminalNode CHARKEY() { return getToken(EecParshParser.CHARKEY, 0); }
		public TerminalNode STRINGKEY() { return getToken(EecParshParser.STRINGKEY, 0); }
		public TerminalNode BOOLEANKEY() { return getToken(EecParshParser.BOOLEANKEY, 0); }
		public TerminalNode VOIDKEY() { return getToken(EecParshParser.VOIDKEY, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitDatatype(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTKEY) | (1L << FLOATKEY) | (1L << CHARKEY) | (1L << STRINGKEY) | (1L << VOIDKEY) | (1L << BOOLEANKEY))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode IDEN() { return getToken(EecParshParser.IDEN, 0); }
		public TerminalNode ASSIGN() { return getToken(EecParshParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(IDEN);
			setState(144);
			match(ASSIGN);
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(145);
				expr(0);
				}
				break;
			case 2:
				{
				setState(146);
				lexpr(0);
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

	public static class DecContext extends ParserRuleContext {
		public TerminalNode INTKEY() { return getToken(EecParshParser.INTKEY, 0); }
		public TerminalNode FLOATKEY() { return getToken(EecParshParser.FLOATKEY, 0); }
		public TerminalNode CHARKEY() { return getToken(EecParshParser.CHARKEY, 0); }
		public TerminalNode STRINGKEY() { return getToken(EecParshParser.STRINGKEY, 0); }
		public TerminalNode BOOLEANKEY() { return getToken(EecParshParser.BOOLEANKEY, 0); }
		public TerminalNode IDEN() { return getToken(EecParshParser.IDEN, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitDec(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTKEY) | (1L << FLOATKEY) | (1L << CHARKEY) | (1L << STRINGKEY) | (1L << BOOLEANKEY))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(150);
				match(IDEN);
				}
				break;
			case 2:
				{
				{
				setState(151);
				assign();
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

	public static class LitContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(EecParshParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(EecParshParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(EecParshParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(EecParshParser.STRING, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode IDEN() { return getToken(EecParshParser.IDEN, 0); }
		public LitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitLit(this);
		}
	}

	public final LitContext lit() throws RecognitionException {
		LitContext _localctx = new LitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lit);
		try {
			setState(160);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(FLOAT);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(CHAR);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				match(STRING);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				bool();
				}
				break;
			case IDEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				match(IDEN);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(EecParshParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(EecParshParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ExprContext extends ParserRuleContext {
		public NexprContext nexpr() {
			return getRuleContext(NexprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(EecParshParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(EecParshParser.SUB, 0); }
		public TerminalNode CONCAT() { return getToken(EecParshParser.CONCAT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(165);
			nexpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(176);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(168);
						match(ADD);
						setState(169);
						nexpr(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(171);
						match(SUB);
						setState(172);
						nexpr(0);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(174);
						match(CONCAT);
						setState(175);
						nexpr(0);
						}
						break;
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class NexprContext extends ParserRuleContext {
		public LitContext lit() {
			return getRuleContext(LitContext.class,0);
		}
		public TerminalNode SPAREN() { return getToken(EecParshParser.SPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EPAREN() { return getToken(EecParshParser.EPAREN, 0); }
		public NexprContext nexpr() {
			return getRuleContext(NexprContext.class,0);
		}
		public TerminalNode MULT() { return getToken(EecParshParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(EecParshParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(EecParshParser.MOD, 0); }
		public NexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterNexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitNexpr(this);
		}
	}

	public final NexprContext nexpr() throws RecognitionException {
		return nexpr(0);
	}

	private NexprContext nexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NexprContext _localctx = new NexprContext(_ctx, _parentState);
		NexprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_nexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case INT:
			case FLOAT:
			case STRING:
			case CHAR:
			case IDEN:
				{
				setState(182);
				lit();
				}
				break;
			case SPAREN:
				{
				setState(183);
				match(SPAREN);
				setState(184);
				expr(0);
				setState(185);
				match(EPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(198);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new NexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nexpr);
						setState(189);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(190);
						match(MULT);
						setState(191);
						lit();
						}
						break;
					case 2:
						{
						_localctx = new NexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nexpr);
						setState(192);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(193);
						match(DIV);
						setState(194);
						lit();
						}
						break;
					case 3:
						{
						_localctx = new NexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nexpr);
						setState(195);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(196);
						match(MOD);
						setState(197);
						lit();
						}
						break;
					}
					} 
				}
				setState(202);
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

	public static class LexprContext extends ParserRuleContext {
		public OlexprContext olexpr() {
			return getRuleContext(OlexprContext.class,0);
		}
		public TerminalNode SPAREN() { return getToken(EecParshParser.SPAREN, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode EPAREN() { return getToken(EecParshParser.EPAREN, 0); }
		public TerminalNode OR() { return getToken(EecParshParser.OR, 0); }
		public LexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterLexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitLexpr(this);
		}
	}

	public final LexprContext lexpr() throws RecognitionException {
		return lexpr(0);
	}

	private LexprContext lexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LexprContext _localctx = new LexprContext(_ctx, _parentState);
		LexprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_lexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(204);
				olexpr(0);
				}
				break;
			case 2:
				{
				setState(205);
				match(SPAREN);
				setState(206);
				lexpr(0);
				setState(207);
				match(EPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lexpr);
					setState(211);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(212);
					match(OR);
					setState(213);
					olexpr(0);
					}
					} 
				}
				setState(218);
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

	public static class OlexprContext extends ParserRuleContext {
		public NlexprContext nlexpr() {
			return getRuleContext(NlexprContext.class,0);
		}
		public TerminalNode SPAREN() { return getToken(EecParshParser.SPAREN, 0); }
		public OlexprContext olexpr() {
			return getRuleContext(OlexprContext.class,0);
		}
		public TerminalNode EPAREN() { return getToken(EecParshParser.EPAREN, 0); }
		public TerminalNode AND() { return getToken(EecParshParser.AND, 0); }
		public OlexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_olexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterOlexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitOlexpr(this);
		}
	}

	public final OlexprContext olexpr() throws RecognitionException {
		return olexpr(0);
	}

	private OlexprContext olexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OlexprContext _localctx = new OlexprContext(_ctx, _parentState);
		OlexprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_olexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(220);
				nlexpr();
				}
				break;
			case 2:
				{
				setState(221);
				match(SPAREN);
				setState(222);
				olexpr(0);
				setState(223);
				match(EPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OlexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_olexpr);
					setState(227);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(228);
					match(AND);
					setState(229);
					nlexpr();
					}
					} 
				}
				setState(234);
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

	public static class NlexprContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(EecParshParser.NOT, 0); }
		public TerminalNode SPAREN() { return getToken(EecParshParser.SPAREN, 0); }
		public MlexprContext mlexpr() {
			return getRuleContext(MlexprContext.class,0);
		}
		public TerminalNode EPAREN() { return getToken(EecParshParser.EPAREN, 0); }
		public NlexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nlexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterNlexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitNlexpr(this);
		}
	}

	public final NlexprContext nlexpr() throws RecognitionException {
		NlexprContext _localctx = new NlexprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nlexpr);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(NOT);
				setState(236);
				match(SPAREN);
				setState(237);
				mlexpr(0);
				setState(238);
				match(EPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				mlexpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(SPAREN);
				setState(242);
				mlexpr(0);
				setState(243);
				match(EPAREN);
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

	public static class MlexprContext extends ParserRuleContext {
		public TerminalNode SPAREN() { return getToken(EecParshParser.SPAREN, 0); }
		public MlexprContext mlexpr() {
			return getRuleContext(MlexprContext.class,0);
		}
		public TerminalNode EPAREN() { return getToken(EecParshParser.EPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LopContext lop() {
			return getRuleContext(LopContext.class,0);
		}
		public MlexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterMlexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitMlexpr(this);
		}
	}

	public final MlexprContext mlexpr() throws RecognitionException {
		return mlexpr(0);
	}

	private MlexprContext mlexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MlexprContext _localctx = new MlexprContext(_ctx, _parentState);
		MlexprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_mlexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(248);
				match(SPAREN);
				setState(249);
				mlexpr(0);
				setState(250);
				match(EPAREN);
				}
				break;
			case 2:
				{
				setState(252);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MlexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mlexpr);
					setState(255);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(256);
					lop();
					setState(257);
					expr(0);
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class LopContext extends ParserRuleContext {
		public TerminalNode GREATERTHAN() { return getToken(EecParshParser.GREATERTHAN, 0); }
		public TerminalNode LESSTHAN() { return getToken(EecParshParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHANEQUAL() { return getToken(EecParshParser.GREATERTHANEQUAL, 0); }
		public TerminalNode LESSTHANEQUAL() { return getToken(EecParshParser.LESSTHANEQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(EecParshParser.NOTEQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(EecParshParser.EQUAL, 0); }
		public LopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterLop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitLop(this);
		}
	}

	public final LopContext lop() throws RecognitionException {
		LopContext _localctx = new LopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATERTHAN) | (1L << LESSTHAN) | (1L << GREATERTHANEQUAL) | (1L << LESSTHANEQUAL) | (1L << NOTEQUAL) | (1L << EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class CondifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(EecParshParser.IF, 0); }
		public TerminalNode SPAREN() { return getToken(EecParshParser.SPAREN, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode EPAREN() { return getToken(EecParshParser.EPAREN, 0); }
		public TerminalNode SBRAC() { return getToken(EecParshParser.SBRAC, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TerminalNode EBRAC() { return getToken(EecParshParser.EBRAC, 0); }
		public CondelseContext condelse() {
			return getRuleContext(CondelseContext.class,0);
		}
		public CondifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterCondif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitCondif(this);
		}
	}

	public final CondifContext condif() throws RecognitionException {
		CondifContext _localctx = new CondifContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(IF);
			setState(267);
			match(SPAREN);
			setState(268);
			lexpr(0);
			setState(269);
			match(EPAREN);
			setState(270);
			match(SBRAC);
			setState(271);
			codeblock();
			setState(272);
			match(EBRAC);
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(273);
				condelse();
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

	public static class CondelseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(EecParshParser.ELSE, 0); }
		public TerminalNode SBRAC() { return getToken(EecParshParser.SBRAC, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TerminalNode EBRAC() { return getToken(EecParshParser.EBRAC, 0); }
		public CondifContext condif() {
			return getRuleContext(CondifContext.class,0);
		}
		public CondelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterCondelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitCondelse(this);
		}
	}

	public final CondelseContext condelse() throws RecognitionException {
		CondelseContext _localctx = new CondelseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condelse);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(ELSE);
				setState(277);
				match(SBRAC);
				setState(278);
				codeblock();
				setState(279);
				match(EBRAC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(ELSE);
				setState(282);
				condif();
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

	public static class ForloopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(EecParshParser.FOR, 0); }
		public TerminalNode SPAREN() { return getToken(EecParshParser.SPAREN, 0); }
		public List<TerminalNode> TERMINATE() { return getTokens(EecParshParser.TERMINATE); }
		public TerminalNode TERMINATE(int i) {
			return getToken(EecParshParser.TERMINATE, i);
		}
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public TerminalNode EPAREN() { return getToken(EecParshParser.EPAREN, 0); }
		public TerminalNode SBRAC() { return getToken(EecParshParser.SBRAC, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TerminalNode EBRAC() { return getToken(EecParshParser.EBRAC, 0); }
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitForloop(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(FOR);
			setState(286);
			match(SPAREN);
			setState(289);
			switch (_input.LA(1)) {
			case IDEN:
				{
				setState(287);
				assign();
				}
				break;
			case INTKEY:
			case FLOATKEY:
			case CHARKEY:
			case STRINGKEY:
			case BOOLEANKEY:
				{
				setState(288);
				dec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(291);
			match(TERMINATE);
			setState(292);
			lexpr(0);
			setState(293);
			match(TERMINATE);
			setState(294);
			assign();
			setState(295);
			match(EPAREN);
			setState(296);
			match(SBRAC);
			setState(297);
			codeblock();
			setState(298);
			match(EBRAC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileloopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(EecParshParser.WHILE, 0); }
		public TerminalNode SPAREN() { return getToken(EecParshParser.SPAREN, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode EPAREN() { return getToken(EecParshParser.EPAREN, 0); }
		public TerminalNode SBRAC() { return getToken(EecParshParser.SBRAC, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TerminalNode EBRAC() { return getToken(EecParshParser.EBRAC, 0); }
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterWhileloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitWhileloop(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(WHILE);
			setState(301);
			match(SPAREN);
			setState(302);
			lexpr(0);
			setState(303);
			match(EPAREN);
			setState(304);
			match(SBRAC);
			setState(305);
			codeblock();
			setState(306);
			match(EBRAC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondswitchContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(EecParshParser.SWITCH, 0); }
		public TerminalNode SPAREN() { return getToken(EecParshParser.SPAREN, 0); }
		public TerminalNode IDEN() { return getToken(EecParshParser.IDEN, 0); }
		public TerminalNode EPAREN() { return getToken(EecParshParser.EPAREN, 0); }
		public TerminalNode SBRAC() { return getToken(EecParshParser.SBRAC, 0); }
		public CondcaseContext condcase() {
			return getRuleContext(CondcaseContext.class,0);
		}
		public TerminalNode EBRAC() { return getToken(EecParshParser.EBRAC, 0); }
		public CondswitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condswitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterCondswitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitCondswitch(this);
		}
	}

	public final CondswitchContext condswitch() throws RecognitionException {
		CondswitchContext _localctx = new CondswitchContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_condswitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(SWITCH);
			setState(309);
			match(SPAREN);
			setState(310);
			match(IDEN);
			setState(311);
			match(EPAREN);
			setState(312);
			match(SBRAC);
			setState(313);
			condcase(0);
			setState(314);
			match(EBRAC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondcaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(EecParshParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(EecParshParser.COLON, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public SwitchbreakContext switchbreak() {
			return getRuleContext(SwitchbreakContext.class,0);
		}
		public TerminalNode INT() { return getToken(EecParshParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(EecParshParser.CHAR, 0); }
		public CondcaseContext condcase() {
			return getRuleContext(CondcaseContext.class,0);
		}
		public CondcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterCondcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitCondcase(this);
		}
	}

	public final CondcaseContext condcase() throws RecognitionException {
		return condcase(0);
	}

	private CondcaseContext condcase(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondcaseContext _localctx = new CondcaseContext(_ctx, _parentState);
		CondcaseContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_condcase, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(317);
			match(CASE);
			setState(318);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==CHAR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(319);
			match(COLON);
			setState(320);
			codeblock();
			setState(321);
			switchbreak();
			}
			_ctx.stop = _input.LT(-1);
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondcaseContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condcase);
					setState(323);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(324);
					match(CASE);
					setState(325);
					_la = _input.LA(1);
					if ( !(_la==INT || _la==CHAR) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(326);
					match(COLON);
					setState(327);
					codeblock();
					setState(328);
					switchbreak();
					}
					} 
				}
				setState(334);
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

	public static class SwitchbreakContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(EecParshParser.BREAK, 0); }
		public TerminalNode TERMINATE() { return getToken(EecParshParser.TERMINATE, 0); }
		public SwitchbreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchbreak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterSwitchbreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitSwitchbreak(this);
		}
	}

	public final SwitchbreakContext switchbreak() throws RecognitionException {
		SwitchbreakContext _localctx = new SwitchbreakContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_switchbreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(335);
				match(BREAK);
				setState(336);
				match(TERMINATE);
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

	public static class FuncallContext extends ParserRuleContext {
		public TerminalNode IDEN() { return getToken(EecParshParser.IDEN, 0); }
		public TerminalNode SPAREN() { return getToken(EecParshParser.SPAREN, 0); }
		public MoreparamContext moreparam() {
			return getRuleContext(MoreparamContext.class,0);
		}
		public TerminalNode EPAREN() { return getToken(EecParshParser.EPAREN, 0); }
		public FuncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterFuncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitFuncall(this);
		}
	}

	public final FuncallContext funcall() throws RecognitionException {
		FuncallContext _localctx = new FuncallContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_funcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(IDEN);
			setState(340);
			match(SPAREN);
			setState(341);
			moreparam(0);
			setState(342);
			match(EPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoreparamContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public MoreparamContext moreparam() {
			return getRuleContext(MoreparamContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(EecParshParser.COMMA, 0); }
		public MoreparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterMoreparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitMoreparam(this);
		}
	}

	public final MoreparamContext moreparam() throws RecognitionException {
		return moreparam(0);
	}

	private MoreparamContext moreparam(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MoreparamContext _localctx = new MoreparamContext(_ctx, _parentState);
		MoreparamContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_moreparam, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(345);
			param();
			}
			_ctx.stop = _input.LT(-1);
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MoreparamContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_moreparam);
					setState(347);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(348);
					match(COMMA);
					setState(349);
					param();
					}
					} 
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class ParamContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public FuncallContext funcall() {
			return getRuleContext(FuncallContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EecParshListener ) ((EecParshListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(355);
				expr(0);
				}
				break;
			case 2:
				{
				setState(356);
				lexpr(0);
				}
				break;
			case 3:
				{
				setState(357);
				funcall();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return morefparam_sempred((MorefparamContext)_localctx, predIndex);
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 13:
			return nexpr_sempred((NexprContext)_localctx, predIndex);
		case 14:
			return lexpr_sempred((LexprContext)_localctx, predIndex);
		case 15:
			return olexpr_sempred((OlexprContext)_localctx, predIndex);
		case 17:
			return mlexpr_sempred((MlexprContext)_localctx, predIndex);
		case 24:
			return condcase_sempred((CondcaseContext)_localctx, predIndex);
		case 27:
			return moreparam_sempred((MoreparamContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean morefparam_sempred(MorefparamContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean nexpr_sempred(NexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lexpr_sempred(LexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean olexpr_sempred(OlexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean mlexpr_sempred(MlexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean condcase_sempred(CondcaseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean moreparam_sempred(MoreparamContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u016b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5f\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6n\n\6\f\6\16\6q\13\6\3\7"+
		"\3\7\3\7\5\7v\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008b\n\b\f\b\16\b\u008e\13\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\5\n\u0096\n\n\3\13\3\13\3\13\5\13\u009b\n\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u00a3\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u00b3\n\16\f\16\16\16\u00b6\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00be\n\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u00c9\n\17\f\17\16\17\u00cc\13\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00d4\n\20\3\20\3\20\3\20\7\20\u00d9\n\20\f\20\16"+
		"\20\u00dc\13\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e4\n\21\3\21\3\21"+
		"\3\21\7\21\u00e9\n\21\f\21\16\21\u00ec\13\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00f8\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u0100\n\23\3\23\3\23\3\23\3\23\7\23\u0106\n\23\f\23\16\23\u0109"+
		"\13\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0115\n"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u011e\n\26\3\27\3\27\3\27"+
		"\3\27\5\27\u0124\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\7\32\u014d\n\32\f\32\16\32\u0150\13\32\3\33\3\33\5\33\u0154\n\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0161\n\35"+
		"\f\35\16\35\u0164\13\35\3\36\3\36\3\36\5\36\u0169\n\36\3\36\2\n\n\32\34"+
		"\36 $\628\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:\2\7\4\2\4\7\t\n\4\2\4\7\n\n\3\2\13\f\3\2).\4\2\31\31\63\63\u0179"+
		"\2?\3\2\2\2\4D\3\2\2\2\6J\3\2\2\2\be\3\2\2\2\ng\3\2\2\2\fu\3\2\2\2\16"+
		"\u008c\3\2\2\2\20\u008f\3\2\2\2\22\u0091\3\2\2\2\24\u0097\3\2\2\2\26\u00a2"+
		"\3\2\2\2\30\u00a4\3\2\2\2\32\u00a6\3\2\2\2\34\u00bd\3\2\2\2\36\u00d3\3"+
		"\2\2\2 \u00e3\3\2\2\2\"\u00f7\3\2\2\2$\u00ff\3\2\2\2&\u010a\3\2\2\2(\u010c"+
		"\3\2\2\2*\u011d\3\2\2\2,\u011f\3\2\2\2.\u012e\3\2\2\2\60\u0136\3\2\2\2"+
		"\62\u013e\3\2\2\2\64\u0153\3\2\2\2\66\u0155\3\2\2\28\u015a\3\2\2\2:\u0168"+
		"\3\2\2\2<>\5\b\5\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A"+
		"?\3\2\2\2BC\b\2\1\2C\3\3\2\2\2DE\7\26\2\2EF\7\33\2\2FG\5\26\f\2GH\7\34"+
		"\2\2HI\b\3\1\2I\5\3\2\2\2JK\7\27\2\2KL\7\33\2\2LM\7\34\2\2M\7\3\2\2\2"+
		"NO\7\3\2\2OP\5\20\t\2PQ\7\64\2\2QR\7\33\2\2RS\5\n\6\2ST\7\34\2\2TU\7\35"+
		"\2\2UV\5\16\b\2VW\7\21\2\2WX\5\26\f\2XY\7\32\2\2YZ\7\36\2\2Zf\3\2\2\2"+
		"[\\\7\3\2\2\\]\5\20\t\2]^\7\64\2\2^_\7\33\2\2_`\5\n\6\2`a\7\34\2\2ab\7"+
		"\35\2\2bc\5\16\b\2cd\7\36\2\2df\3\2\2\2eN\3\2\2\2e[\3\2\2\2f\t\3\2\2\2"+
		"gh\b\6\1\2hi\5\f\7\2io\3\2\2\2jk\f\4\2\2kl\7%\2\2ln\5\f\7\2mj\3\2\2\2"+
		"nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\13\3\2\2\2qo\3\2\2\2rs\5\20\t\2st\7\64"+
		"\2\2tv\3\2\2\2ur\3\2\2\2uv\3\2\2\2v\r\3\2\2\2wx\5\24\13\2xy\7\32\2\2y"+
		"\u008b\3\2\2\2z{\5\22\n\2{|\7\32\2\2|\u008b\3\2\2\2}\u008b\5(\25\2~\u008b"+
		"\5\60\31\2\177\u008b\5,\27\2\u0080\u008b\5.\30\2\u0081\u0082\5\4\3\2\u0082"+
		"\u0083\7\32\2\2\u0083\u008b\3\2\2\2\u0084\u0085\5\6\4\2\u0085\u0086\7"+
		"\32\2\2\u0086\u008b\3\2\2\2\u0087\u0088\5\66\34\2\u0088\u0089\7\32\2\2"+
		"\u0089\u008b\3\2\2\2\u008aw\3\2\2\2\u008az\3\2\2\2\u008a}\3\2\2\2\u008a"+
		"~\3\2\2\2\u008a\177\3\2\2\2\u008a\u0080\3\2\2\2\u008a\u0081\3\2\2\2\u008a"+
		"\u0084\3\2\2\2\u008a\u0087\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\17\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090"+
		"\t\2\2\2\u0090\21\3\2\2\2\u0091\u0092\7\64\2\2\u0092\u0095\7/\2\2\u0093"+
		"\u0096\5\32\16\2\u0094\u0096\5\36\20\2\u0095\u0093\3\2\2\2\u0095\u0094"+
		"\3\2\2\2\u0096\23\3\2\2\2\u0097\u009a\t\3\2\2\u0098\u009b\7\64\2\2\u0099"+
		"\u009b\5\22\n\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\25\3\2\2"+
		"\2\u009c\u00a3\7\31\2\2\u009d\u00a3\7\61\2\2\u009e\u00a3\7\63\2\2\u009f"+
		"\u00a3\7\62\2\2\u00a0\u00a3\5\30\r\2\u00a1\u00a3\7\64\2\2\u00a2\u009c"+
		"\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2\u009e\3\2\2\2\u00a2\u009f\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\27\3\2\2\2\u00a4\u00a5\t\4\2"+
		"\2\u00a5\31\3\2\2\2\u00a6\u00a7\b\16\1\2\u00a7\u00a8\5\34\17\2\u00a8\u00b4"+
		"\3\2\2\2\u00a9\u00aa\f\6\2\2\u00aa\u00ab\7\37\2\2\u00ab\u00b3\5\34\17"+
		"\2\u00ac\u00ad\f\5\2\2\u00ad\u00ae\7 \2\2\u00ae\u00b3\5\34\17\2\u00af"+
		"\u00b0\f\4\2\2\u00b0\u00b1\7$\2\2\u00b1\u00b3\5\34\17\2\u00b2\u00a9\3"+
		"\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00af\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\33\3\2\2\2\u00b6\u00b4\3\2\2"+
		"\2\u00b7\u00b8\b\17\1\2\u00b8\u00be\5\26\f\2\u00b9\u00ba\7\33\2\2\u00ba"+
		"\u00bb\5\32\16\2\u00bb\u00bc\7\34\2\2\u00bc\u00be\3\2\2\2\u00bd\u00b7"+
		"\3\2\2\2\u00bd\u00b9\3\2\2\2\u00be\u00ca\3\2\2\2\u00bf\u00c0\f\6\2\2\u00c0"+
		"\u00c1\7!\2\2\u00c1\u00c9\5\26\f\2\u00c2\u00c3\f\5\2\2\u00c3\u00c4\7\""+
		"\2\2\u00c4\u00c9\5\26\f\2\u00c5\u00c6\f\4\2\2\u00c6\u00c7\7#\2\2\u00c7"+
		"\u00c9\5\26\f\2\u00c8\u00bf\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c5\3"+
		"\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\35\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\b\20\1\2\u00ce\u00d4\5 \21"+
		"\2\u00cf\u00d0\7\33\2\2\u00d0\u00d1\5\36\20\2\u00d1\u00d2\7\34\2\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00cd\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d4\u00da\3\2"+
		"\2\2\u00d5\u00d6\f\5\2\2\u00d6\u00d7\7\'\2\2\u00d7\u00d9\5 \21\2\u00d8"+
		"\u00d5\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\37\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\b\21\1\2\u00de\u00e4"+
		"\5\"\22\2\u00df\u00e0\7\33\2\2\u00e0\u00e1\5 \21\2\u00e1\u00e2\7\34\2"+
		"\2\u00e2\u00e4\3\2\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4\u00ea"+
		"\3\2\2\2\u00e5\u00e6\f\5\2\2\u00e6\u00e7\7&\2\2\u00e7\u00e9\5\"\22\2\u00e8"+
		"\u00e5\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb!\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7(\2\2\u00ee\u00ef"+
		"\7\33\2\2\u00ef\u00f0\5$\23\2\u00f0\u00f1\7\34\2\2\u00f1\u00f8\3\2\2\2"+
		"\u00f2\u00f8\5$\23\2\u00f3\u00f4\7\33\2\2\u00f4\u00f5\5$\23\2\u00f5\u00f6"+
		"\7\34\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00ed\3\2\2\2\u00f7\u00f2\3\2\2\2"+
		"\u00f7\u00f3\3\2\2\2\u00f8#\3\2\2\2\u00f9\u00fa\b\23\1\2\u00fa\u00fb\7"+
		"\33\2\2\u00fb\u00fc\5$\23\2\u00fc\u00fd\7\34\2\2\u00fd\u0100\3\2\2\2\u00fe"+
		"\u0100\5\32\16\2\u00ff\u00f9\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\u0107\3"+
		"\2\2\2\u0101\u0102\f\5\2\2\u0102\u0103\5&\24\2\u0103\u0104\5\32\16\2\u0104"+
		"\u0106\3\2\2\2\u0105\u0101\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108%\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b"+
		"\t\5\2\2\u010b\'\3\2\2\2\u010c\u010d\7\r\2\2\u010d\u010e\7\33\2\2\u010e"+
		"\u010f\5\36\20\2\u010f\u0110\7\34\2\2\u0110\u0111\7\35\2\2\u0111\u0112"+
		"\5\16\b\2\u0112\u0114\7\36\2\2\u0113\u0115\5*\26\2\u0114\u0113\3\2\2\2"+
		"\u0114\u0115\3\2\2\2\u0115)\3\2\2\2\u0116\u0117\7\16\2\2\u0117\u0118\7"+
		"\35\2\2\u0118\u0119\5\16\b\2\u0119\u011a\7\36\2\2\u011a\u011e\3\2\2\2"+
		"\u011b\u011c\7\16\2\2\u011c\u011e\5(\25\2\u011d\u0116\3\2\2\2\u011d\u011b"+
		"\3\2\2\2\u011e+\3\2\2\2\u011f\u0120\7\20\2\2\u0120\u0123\7\33\2\2\u0121"+
		"\u0124\5\22\n\2\u0122\u0124\5\24\13\2\u0123\u0121\3\2\2\2\u0123\u0122"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\7\32\2\2\u0126\u0127\5\36\20"+
		"\2\u0127\u0128\7\32\2\2\u0128\u0129\5\22\n\2\u0129\u012a\7\34\2\2\u012a"+
		"\u012b\7\35\2\2\u012b\u012c\5\16\b\2\u012c\u012d\7\36\2\2\u012d-\3\2\2"+
		"\2\u012e\u012f\7\17\2\2\u012f\u0130\7\33\2\2\u0130\u0131\5\36\20\2\u0131"+
		"\u0132\7\34\2\2\u0132\u0133\7\35\2\2\u0133\u0134\5\16\b\2\u0134\u0135"+
		"\7\36\2\2\u0135/\3\2\2\2\u0136\u0137\7\22\2\2\u0137\u0138\7\33\2\2\u0138"+
		"\u0139\7\64\2\2\u0139\u013a\7\34\2\2\u013a\u013b\7\35\2\2\u013b\u013c"+
		"\5\62\32\2\u013c\u013d\7\36\2\2\u013d\61\3\2\2\2\u013e\u013f\b\32\1\2"+
		"\u013f\u0140\7\23\2\2\u0140\u0141\t\6\2\2\u0141\u0142\7\60\2\2\u0142\u0143"+
		"\5\16\b\2\u0143\u0144\5\64\33\2\u0144\u014e\3\2\2\2\u0145\u0146\f\3\2"+
		"\2\u0146\u0147\7\23\2\2\u0147\u0148\t\6\2\2\u0148\u0149\7\60\2\2\u0149"+
		"\u014a\5\16\b\2\u014a\u014b\5\64\33\2\u014b\u014d\3\2\2\2\u014c\u0145"+
		"\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\63\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\7\24\2\2\u0152\u0154\7\32"+
		"\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\65\3\2\2\2\u0155\u0156"+
		"\7\64\2\2\u0156\u0157\7\33\2\2\u0157\u0158\58\35\2\u0158\u0159\7\34\2"+
		"\2\u0159\67\3\2\2\2\u015a\u015b\b\35\1\2\u015b\u015c\5:\36\2\u015c\u0162"+
		"\3\2\2\2\u015d\u015e\f\4\2\2\u015e\u015f\7%\2\2\u015f\u0161\5:\36\2\u0160"+
		"\u015d\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2"+
		"\2\2\u01639\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0169\5\32\16\2\u0166\u0169"+
		"\5\36\20\2\u0167\u0169\5\66\34\2\u0168\u0165\3\2\2\2\u0168\u0166\3\2\2"+
		"\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169;\3\2\2\2\36?eou\u008a"+
		"\u008c\u0095\u009a\u00a2\u00b2\u00b4\u00bd\u00c8\u00ca\u00d3\u00da\u00e3"+
		"\u00ea\u00f7\u00ff\u0107\u0114\u011d\u0123\u014e\u0153\u0162\u0168";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}