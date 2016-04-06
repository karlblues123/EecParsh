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
		INT=23, FLOAT=24, TERMINATE=25, SPAREN=26, EPAREN=27, SBRAC=28, EBRAC=29, 
		ADD=30, SUB=31, MULT=32, DIV=33, MOD=34, CONCAT=35, COMMA=36, AND=37, 
		OR=38, NOT=39, GREATERTHAN=40, LESSTHAN=41, GREATERTHANEQUAL=42, LESSTHANEQUAL=43, 
		NOTEQUAL=44, EQUAL=45, ASSIGN=46, COLON=47, STRING=48, CHAR=49, IDEN=50, 
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
		null, null, null, "'!'", "')'", "'('", "'}'", "'{'", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'^'", "','", "'&&'", "'||'", "'ton'", "'>'", "'<'", "'>='", 
		"'<='", "'<>'", "'=='", "'='", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FUNCTION", "INTKEY", "FLOATKEY", "CHARKEY", "STRINGKEY", "ARRAYKEY", 
		"VOIDKEY", "BOOLEANKEY", "TRUE", "FALSE", "IF", "ELSE", "WHILE", "FOR", 
		"RETURN", "SWITCH", "CASE", "BREAK", "DO", "PRINT", "SCAN", "COMMENT", 
		"INT", "FLOAT", "TERMINATE", "SPAREN", "EPAREN", "SBRAC", "EBRAC", "ADD", 
		"SUB", "MULT", "DIV", "MOD", "CONCAT", "COMMA", "AND", "OR", "NOT", "GREATERTHAN", 
		"LESSTHAN", "GREATERTHANEQUAL", "LESSTHANEQUAL", "NOTEQUAL", "EQUAL", 
		"ASSIGN", "COLON", "STRING", "CHAR", "IDEN", "WS"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitStaato(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitPrintF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintFContext printF() throws RecognitionException {
		PrintFContext _localctx = new PrintFContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_printF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(PRINT);
			setState(65);
			match(SPAREN);
			setState(66);
			lit();
			setState(67);
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

	public static class ScanFContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(EecParshParser.SCAN, 0); }
		public TerminalNode SPAREN() { return getToken(EecParshParser.SPAREN, 0); }
		public TerminalNode IDEN() { return getToken(EecParshParser.IDEN, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitScanF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanFContext scanF() throws RecognitionException {
		ScanFContext _localctx = new ScanFContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_scanF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(SCAN);
			setState(70);
			match(SPAREN);
			setState(71);
			match(IDEN);
			setState(72);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(FUNCTION);
				setState(75);
				datatype();
				setState(76);
				match(IDEN);
				setState(77);
				match(SPAREN);
				setState(78);
				morefparam(0);
				setState(79);
				match(EPAREN);
				setState(80);
				match(SBRAC);
				setState(81);
				codeblock();
				setState(82);
				match(RETURN);
				setState(83);
				lit();
				setState(84);
				match(TERMINATE);
				setState(85);
				match(EBRAC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(FUNCTION);
				setState(88);
				datatype();
				setState(89);
				match(IDEN);
				setState(90);
				match(SPAREN);
				setState(91);
				morefparam(0);
				setState(92);
				match(EPAREN);
				setState(93);
				match(SBRAC);
				setState(94);
				codeblock();
				setState(95);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitMorefparam(this);
			else return visitor.visitChildren(this);
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
			setState(100);
			fparam();
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
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
					setState(102);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(103);
					match(COMMA);
					setState(104);
					fparam();
					}
					} 
				}
				setState(109);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitFparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FparamContext fparam() throws RecognitionException {
		FparamContext _localctx = new FparamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(110);
				datatype();
				setState(111);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitCodeblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeblockContext codeblock() throws RecognitionException {
		CodeblockContext _localctx = new CodeblockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_codeblock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(134);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(115);
						dec();
						setState(116);
						match(TERMINATE);
						}
						break;
					case 2:
						{
						setState(118);
						assign();
						setState(119);
						match(TERMINATE);
						}
						break;
					case 3:
						{
						setState(121);
						condif();
						}
						break;
					case 4:
						{
						setState(122);
						condswitch();
						}
						break;
					case 5:
						{
						setState(123);
						forloop();
						}
						break;
					case 6:
						{
						setState(124);
						whileloop();
						}
						break;
					case 7:
						{
						setState(125);
						printF();
						setState(126);
						match(TERMINATE);
						}
						break;
					case 8:
						{
						setState(128);
						scanF();
						setState(129);
						match(TERMINATE);
						}
						break;
					case 9:
						{
						setState(131);
						funcall();
						setState(132);
						match(TERMINATE);
						}
						break;
					}
					} 
				}
				setState(138);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(IDEN);
			setState(142);
			match(ASSIGN);
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(143);
				expr(0);
				}
				break;
			case 2:
				{
				setState(144);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTKEY) | (1L << FLOATKEY) | (1L << CHARKEY) | (1L << STRINGKEY) | (1L << BOOLEANKEY))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(148);
				match(IDEN);
				}
				break;
			case 2:
				{
				{
				setState(149);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LitContext lit() throws RecognitionException {
		LitContext _localctx = new LitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lit);
		try {
			setState(158);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(FLOAT);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(CHAR);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				match(STRING);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				bool();
				}
				break;
			case IDEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
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
			setState(163);
			nexpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(174);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(166);
						match(ADD);
						setState(167);
						nexpr(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(169);
						match(SUB);
						setState(170);
						nexpr(0);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(172);
						match(CONCAT);
						setState(173);
						nexpr(0);
						}
						break;
					}
					} 
				}
				setState(178);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitNexpr(this);
			else return visitor.visitChildren(this);
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
			setState(185);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case INT:
			case FLOAT:
			case STRING:
			case CHAR:
			case IDEN:
				{
				setState(180);
				lit();
				}
				break;
			case SPAREN:
				{
				setState(181);
				match(SPAREN);
				setState(182);
				expr(0);
				setState(183);
				match(EPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new NexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nexpr);
						setState(187);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(188);
						match(MULT);
						setState(189);
						lit();
						}
						break;
					case 2:
						{
						_localctx = new NexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nexpr);
						setState(190);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(191);
						match(DIV);
						setState(192);
						lit();
						}
						break;
					case 3:
						{
						_localctx = new NexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nexpr);
						setState(193);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(194);
						match(MOD);
						setState(195);
						lit();
						}
						break;
					}
					} 
				}
				setState(200);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitLexpr(this);
			else return visitor.visitChildren(this);
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
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(202);
				olexpr(0);
				}
				break;
			case 2:
				{
				setState(203);
				match(SPAREN);
				setState(204);
				lexpr(0);
				setState(205);
				match(EPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
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
					setState(209);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(210);
					match(OR);
					setState(211);
					olexpr(0);
					}
					} 
				}
				setState(216);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitOlexpr(this);
			else return visitor.visitChildren(this);
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
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(218);
				nlexpr();
				}
				break;
			case 2:
				{
				setState(219);
				match(SPAREN);
				setState(220);
				olexpr(0);
				setState(221);
				match(EPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
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
					setState(225);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(226);
					match(AND);
					setState(227);
					nlexpr();
					}
					} 
				}
				setState(232);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitNlexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NlexprContext nlexpr() throws RecognitionException {
		NlexprContext _localctx = new NlexprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nlexpr);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(NOT);
				setState(234);
				match(SPAREN);
				setState(235);
				mlexpr(0);
				setState(236);
				match(EPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				mlexpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				match(SPAREN);
				setState(240);
				mlexpr(0);
				setState(241);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitMlexpr(this);
			else return visitor.visitChildren(this);
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
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(246);
				match(SPAREN);
				setState(247);
				mlexpr(0);
				setState(248);
				match(EPAREN);
				}
				break;
			case 2:
				{
				setState(250);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
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
					setState(253);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(254);
					lop();
					setState(255);
					expr(0);
					}
					} 
				}
				setState(261);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitLop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LopContext lop() throws RecognitionException {
		LopContext _localctx = new LopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitCondif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondifContext condif() throws RecognitionException {
		CondifContext _localctx = new CondifContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(IF);
			setState(265);
			match(SPAREN);
			setState(266);
			lexpr(0);
			setState(267);
			match(EPAREN);
			setState(268);
			match(SBRAC);
			setState(269);
			codeblock();
			setState(270);
			match(EBRAC);
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(271);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitCondelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondelseContext condelse() throws RecognitionException {
		CondelseContext _localctx = new CondelseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condelse);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(ELSE);
				setState(275);
				match(SBRAC);
				setState(276);
				codeblock();
				setState(277);
				match(EBRAC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(ELSE);
				setState(280);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitForloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(FOR);
			setState(284);
			match(SPAREN);
			setState(287);
			switch (_input.LA(1)) {
			case IDEN:
				{
				setState(285);
				assign();
				}
				break;
			case INTKEY:
			case FLOATKEY:
			case CHARKEY:
			case STRINGKEY:
			case BOOLEANKEY:
				{
				setState(286);
				dec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(289);
			match(TERMINATE);
			setState(290);
			lexpr(0);
			setState(291);
			match(TERMINATE);
			setState(292);
			assign();
			setState(293);
			match(EPAREN);
			setState(294);
			match(SBRAC);
			setState(295);
			codeblock();
			setState(296);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitWhileloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(WHILE);
			setState(299);
			match(SPAREN);
			setState(300);
			lexpr(0);
			setState(301);
			match(EPAREN);
			setState(302);
			match(SBRAC);
			setState(303);
			codeblock();
			setState(304);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitCondswitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondswitchContext condswitch() throws RecognitionException {
		CondswitchContext _localctx = new CondswitchContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_condswitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(SWITCH);
			setState(307);
			match(SPAREN);
			setState(308);
			match(IDEN);
			setState(309);
			match(EPAREN);
			setState(310);
			match(SBRAC);
			setState(311);
			condcase(0);
			setState(312);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitCondcase(this);
			else return visitor.visitChildren(this);
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
			setState(315);
			match(CASE);
			setState(316);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==CHAR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(317);
			match(COLON);
			setState(318);
			codeblock();
			setState(319);
			switchbreak();
			}
			_ctx.stop = _input.LT(-1);
			setState(330);
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
					setState(321);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(322);
					match(CASE);
					setState(323);
					_la = _input.LA(1);
					if ( !(_la==INT || _la==CHAR) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(324);
					match(COLON);
					setState(325);
					codeblock();
					setState(326);
					switchbreak();
					}
					} 
				}
				setState(332);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitSwitchbreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchbreakContext switchbreak() throws RecognitionException {
		SwitchbreakContext _localctx = new SwitchbreakContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_switchbreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(333);
				match(BREAK);
				setState(334);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitFuncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncallContext funcall() throws RecognitionException {
		FuncallContext _localctx = new FuncallContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_funcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(IDEN);
			setState(338);
			match(SPAREN);
			setState(339);
			moreparam(0);
			setState(340);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitMoreparam(this);
			else return visitor.visitChildren(this);
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
			setState(343);
			param();
			}
			_ctx.stop = _input.LT(-1);
			setState(350);
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
					setState(345);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(346);
					match(COMMA);
					setState(347);
					param();
					}
					} 
				}
				setState(352);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EecParshVisitor ) return ((EecParshVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(353);
				expr(0);
				}
				break;
			case 2:
				{
				setState(354);
				lexpr(0);
				}
				break;
			case 3:
				{
				setState(355);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u0169\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5d\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\7\3\7\3\7"+
		"\5\7t\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\b\u0089\n\b\f\b\16\b\u008c\13\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\5\n\u0094\n\n\3\13\3\13\3\13\5\13\u0099\n\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00a1\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u00b1\n\16\f\16\16\16\u00b4\13\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00bc\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u00c7\n\17\f\17\16\17\u00ca\13\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00d2\n\20\3\20\3\20\3\20\7\20\u00d7\n\20\f\20\16\20\u00da"+
		"\13\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e2\n\21\3\21\3\21\3\21\7"+
		"\21\u00e7\n\21\f\21\16\21\u00ea\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u00f6\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00fe\n\23\3\23\3\23\3\23\3\23\7\23\u0104\n\23\f\23\16\23\u0107\13\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0113\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u011c\n\26\3\27\3\27\3\27\3\27\5\27"+
		"\u0122\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32"+
		"\u014b\n\32\f\32\16\32\u014e\13\32\3\33\3\33\5\33\u0152\n\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u015f\n\35\f\35\16"+
		"\35\u0162\13\35\3\36\3\36\3\36\5\36\u0167\n\36\3\36\2\n\n\32\34\36 $\62"+
		"8\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\7"+
		"\4\2\4\7\t\n\4\2\4\7\n\n\3\2\13\f\3\2*/\4\2\31\31\63\63\u0177\2?\3\2\2"+
		"\2\4B\3\2\2\2\6G\3\2\2\2\bc\3\2\2\2\ne\3\2\2\2\fs\3\2\2\2\16\u008a\3\2"+
		"\2\2\20\u008d\3\2\2\2\22\u008f\3\2\2\2\24\u0095\3\2\2\2\26\u00a0\3\2\2"+
		"\2\30\u00a2\3\2\2\2\32\u00a4\3\2\2\2\34\u00bb\3\2\2\2\36\u00d1\3\2\2\2"+
		" \u00e1\3\2\2\2\"\u00f5\3\2\2\2$\u00fd\3\2\2\2&\u0108\3\2\2\2(\u010a\3"+
		"\2\2\2*\u011b\3\2\2\2,\u011d\3\2\2\2.\u012c\3\2\2\2\60\u0134\3\2\2\2\62"+
		"\u013c\3\2\2\2\64\u0151\3\2\2\2\66\u0153\3\2\2\28\u0158\3\2\2\2:\u0166"+
		"\3\2\2\2<>\5\b\5\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\3\3\2\2\2"+
		"A?\3\2\2\2BC\7\26\2\2CD\7\34\2\2DE\5\26\f\2EF\7\35\2\2F\5\3\2\2\2GH\7"+
		"\27\2\2HI\7\34\2\2IJ\7\64\2\2JK\7\35\2\2K\7\3\2\2\2LM\7\3\2\2MN\5\20\t"+
		"\2NO\7\64\2\2OP\7\34\2\2PQ\5\n\6\2QR\7\35\2\2RS\7\36\2\2ST\5\16\b\2TU"+
		"\7\21\2\2UV\5\26\f\2VW\7\33\2\2WX\7\37\2\2Xd\3\2\2\2YZ\7\3\2\2Z[\5\20"+
		"\t\2[\\\7\64\2\2\\]\7\34\2\2]^\5\n\6\2^_\7\35\2\2_`\7\36\2\2`a\5\16\b"+
		"\2ab\7\37\2\2bd\3\2\2\2cL\3\2\2\2cY\3\2\2\2d\t\3\2\2\2ef\b\6\1\2fg\5\f"+
		"\7\2gm\3\2\2\2hi\f\4\2\2ij\7&\2\2jl\5\f\7\2kh\3\2\2\2lo\3\2\2\2mk\3\2"+
		"\2\2mn\3\2\2\2n\13\3\2\2\2om\3\2\2\2pq\5\20\t\2qr\7\64\2\2rt\3\2\2\2s"+
		"p\3\2\2\2st\3\2\2\2t\r\3\2\2\2uv\5\24\13\2vw\7\33\2\2w\u0089\3\2\2\2x"+
		"y\5\22\n\2yz\7\33\2\2z\u0089\3\2\2\2{\u0089\5(\25\2|\u0089\5\60\31\2}"+
		"\u0089\5,\27\2~\u0089\5.\30\2\177\u0080\5\4\3\2\u0080\u0081\7\33\2\2\u0081"+
		"\u0089\3\2\2\2\u0082\u0083\5\6\4\2\u0083\u0084\7\33\2\2\u0084\u0089\3"+
		"\2\2\2\u0085\u0086\5\66\34\2\u0086\u0087\7\33\2\2\u0087\u0089\3\2\2\2"+
		"\u0088u\3\2\2\2\u0088x\3\2\2\2\u0088{\3\2\2\2\u0088|\3\2\2\2\u0088}\3"+
		"\2\2\2\u0088~\3\2\2\2\u0088\177\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0085"+
		"\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\17\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\t\2\2\2\u008e\21\3\2\2\2\u008f"+
		"\u0090\7\64\2\2\u0090\u0093\7\60\2\2\u0091\u0094\5\32\16\2\u0092\u0094"+
		"\5\36\20\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\23\3\2\2\2\u0095"+
		"\u0098\t\3\2\2\u0096\u0099\7\64\2\2\u0097\u0099\5\22\n\2\u0098\u0096\3"+
		"\2\2\2\u0098\u0097\3\2\2\2\u0099\25\3\2\2\2\u009a\u00a1\7\31\2\2\u009b"+
		"\u00a1\7\32\2\2\u009c\u00a1\7\63\2\2\u009d\u00a1\7\62\2\2\u009e\u00a1"+
		"\5\30\r\2\u009f\u00a1\7\64\2\2\u00a0\u009a\3\2\2\2\u00a0\u009b\3\2\2\2"+
		"\u00a0\u009c\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f"+
		"\3\2\2\2\u00a1\27\3\2\2\2\u00a2\u00a3\t\4\2\2\u00a3\31\3\2\2\2\u00a4\u00a5"+
		"\b\16\1\2\u00a5\u00a6\5\34\17\2\u00a6\u00b2\3\2\2\2\u00a7\u00a8\f\6\2"+
		"\2\u00a8\u00a9\7 \2\2\u00a9\u00b1\5\34\17\2\u00aa\u00ab\f\5\2\2\u00ab"+
		"\u00ac\7!\2\2\u00ac\u00b1\5\34\17\2\u00ad\u00ae\f\4\2\2\u00ae\u00af\7"+
		"%\2\2\u00af\u00b1\5\34\17\2\u00b0\u00a7\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b0"+
		"\u00ad\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\33\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\b\17\1\2\u00b6\u00bc"+
		"\5\26\f\2\u00b7\u00b8\7\34\2\2\u00b8\u00b9\5\32\16\2\u00b9\u00ba\7\35"+
		"\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bc"+
		"\u00c8\3\2\2\2\u00bd\u00be\f\6\2\2\u00be\u00bf\7\"\2\2\u00bf\u00c7\5\26"+
		"\f\2\u00c0\u00c1\f\5\2\2\u00c1\u00c2\7#\2\2\u00c2\u00c7\5\26\f\2\u00c3"+
		"\u00c4\f\4\2\2\u00c4\u00c5\7$\2\2\u00c5\u00c7\5\26\f\2\u00c6\u00bd\3\2"+
		"\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\35\3\2\2\2\u00ca\u00c8\3\2\2"+
		"\2\u00cb\u00cc\b\20\1\2\u00cc\u00d2\5 \21\2\u00cd\u00ce\7\34\2\2\u00ce"+
		"\u00cf\5\36\20\2\u00cf\u00d0\7\35\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cb"+
		"\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d2\u00d8\3\2\2\2\u00d3\u00d4\f\5\2\2\u00d4"+
		"\u00d5\7(\2\2\u00d5\u00d7\5 \21\2\u00d6\u00d3\3\2\2\2\u00d7\u00da\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\37\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00db\u00dc\b\21\1\2\u00dc\u00e2\5\"\22\2\u00dd\u00de\7\34\2"+
		"\2\u00de\u00df\5 \21\2\u00df\u00e0\7\35\2\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00db\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2\u00e8\3\2\2\2\u00e3\u00e4\f\5"+
		"\2\2\u00e4\u00e5\7\'\2\2\u00e5\u00e7\5\"\22\2\u00e6\u00e3\3\2\2\2\u00e7"+
		"\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9!\3\2\2\2"+
		"\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7)\2\2\u00ec\u00ed\7\34\2\2\u00ed\u00ee"+
		"\5$\23\2\u00ee\u00ef\7\35\2\2\u00ef\u00f6\3\2\2\2\u00f0\u00f6\5$\23\2"+
		"\u00f1\u00f2\7\34\2\2\u00f2\u00f3\5$\23\2\u00f3\u00f4\7\35\2\2\u00f4\u00f6"+
		"\3\2\2\2\u00f5\u00eb\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f6"+
		"#\3\2\2\2\u00f7\u00f8\b\23\1\2\u00f8\u00f9\7\34\2\2\u00f9\u00fa\5$\23"+
		"\2\u00fa\u00fb\7\35\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fe\5\32\16\2\u00fd"+
		"\u00f7\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0105\3\2\2\2\u00ff\u0100\f\5"+
		"\2\2\u0100\u0101\5&\24\2\u0101\u0102\5\32\16\2\u0102\u0104\3\2\2\2\u0103"+
		"\u00ff\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106%\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\t\5\2\2\u0109\'\3"+
		"\2\2\2\u010a\u010b\7\r\2\2\u010b\u010c\7\34\2\2\u010c\u010d\5\36\20\2"+
		"\u010d\u010e\7\35\2\2\u010e\u010f\7\36\2\2\u010f\u0110\5\16\b\2\u0110"+
		"\u0112\7\37\2\2\u0111\u0113\5*\26\2\u0112\u0111\3\2\2\2\u0112\u0113\3"+
		"\2\2\2\u0113)\3\2\2\2\u0114\u0115\7\16\2\2\u0115\u0116\7\36\2\2\u0116"+
		"\u0117\5\16\b\2\u0117\u0118\7\37\2\2\u0118\u011c\3\2\2\2\u0119\u011a\7"+
		"\16\2\2\u011a\u011c\5(\25\2\u011b\u0114\3\2\2\2\u011b\u0119\3\2\2\2\u011c"+
		"+\3\2\2\2\u011d\u011e\7\20\2\2\u011e\u0121\7\34\2\2\u011f\u0122\5\22\n"+
		"\2\u0120\u0122\5\24\13\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0124\7\33\2\2\u0124\u0125\5\36\20\2\u0125\u0126"+
		"\7\33\2\2\u0126\u0127\5\22\n\2\u0127\u0128\7\35\2\2\u0128\u0129\7\36\2"+
		"\2\u0129\u012a\5\16\b\2\u012a\u012b\7\37\2\2\u012b-\3\2\2\2\u012c\u012d"+
		"\7\17\2\2\u012d\u012e\7\34\2\2\u012e\u012f\5\36\20\2\u012f\u0130\7\35"+
		"\2\2\u0130\u0131\7\36\2\2\u0131\u0132\5\16\b\2\u0132\u0133\7\37\2\2\u0133"+
		"/\3\2\2\2\u0134\u0135\7\22\2\2\u0135\u0136\7\34\2\2\u0136\u0137\7\64\2"+
		"\2\u0137\u0138\7\35\2\2\u0138\u0139\7\36\2\2\u0139\u013a\5\62\32\2\u013a"+
		"\u013b\7\37\2\2\u013b\61\3\2\2\2\u013c\u013d\b\32\1\2\u013d\u013e\7\23"+
		"\2\2\u013e\u013f\t\6\2\2\u013f\u0140\7\61\2\2\u0140\u0141\5\16\b\2\u0141"+
		"\u0142\5\64\33\2\u0142\u014c\3\2\2\2\u0143\u0144\f\3\2\2\u0144\u0145\7"+
		"\23\2\2\u0145\u0146\t\6\2\2\u0146\u0147\7\61\2\2\u0147\u0148\5\16\b\2"+
		"\u0148\u0149\5\64\33\2\u0149\u014b\3\2\2\2\u014a\u0143\3\2\2\2\u014b\u014e"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\63\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014f\u0150\7\24\2\2\u0150\u0152\7\33\2\2\u0151\u014f\3"+
		"\2\2\2\u0151\u0152\3\2\2\2\u0152\65\3\2\2\2\u0153\u0154\7\64\2\2\u0154"+
		"\u0155\7\34\2\2\u0155\u0156\58\35\2\u0156\u0157\7\35\2\2\u0157\67\3\2"+
		"\2\2\u0158\u0159\b\35\1\2\u0159\u015a\5:\36\2\u015a\u0160\3\2\2\2\u015b"+
		"\u015c\f\4\2\2\u015c\u015d\7&\2\2\u015d\u015f\5:\36\2\u015e\u015b\3\2"+
		"\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"9\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0167\5\32\16\2\u0164\u0167\5\36\20"+
		"\2\u0165\u0167\5\66\34\2\u0166\u0163\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167;\3\2\2\2\36?cms\u0088\u008a\u0093"+
		"\u0098\u00a0\u00b0\u00b2\u00bb\u00c6\u00c8\u00d1\u00d8\u00e1\u00e8\u00f5"+
		"\u00fd\u0105\u0112\u011b\u0121\u014c\u0151\u0160\u0166";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}