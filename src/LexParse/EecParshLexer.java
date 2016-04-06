package LexParse;

// Generated from EecParsh.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EecParshLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"FUNCTION", "INTKEY", "FLOATKEY", "CHARKEY", "STRINGKEY", "ARRAYKEY", 
		"VOIDKEY", "BOOLEANKEY", "TRUE", "FALSE", "IF", "ELSE", "WHILE", "FOR", 
		"RETURN", "SWITCH", "CASE", "BREAK", "DO", "PRINT", "SCAN", "COMMENT", 
		"INT", "FLOAT", "TERMINATE", "SPAREN", "EPAREN", "SBRAC", "EBRAC", "ADD", 
		"SUB", "MULT", "DIV", "MOD", "CONCAT", "COMMA", "AND", "OR", "NOT", "GREATERTHAN", 
		"LESSTHAN", "GREATERTHANEQUAL", "LESSTHANEQUAL", "NOTEQUAL", "EQUAL", 
		"ASSIGN", "COLON", "STRING", "CHAR", "IDEN", "WS"
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


	public EecParshLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EecParsh.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\65\u0150\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\7\27\u00de\n\27\f\27\16\27\u00e1"+
		"\13\27\3\27\3\27\3\27\3\27\3\30\5\30\u00e8\n\30\3\30\6\30\u00eb\n\30\r"+
		"\30\16\30\u00ec\3\31\5\31\u00f0\n\31\3\31\6\31\u00f3\n\31\r\31\16\31\u00f4"+
		"\3\31\3\31\6\31\u00f9\n\31\r\31\16\31\u00fa\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3"+
		"-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\7\61\u0135\n\61\f\61\16\61\u0138"+
		"\13\61\3\61\3\61\3\62\3\62\7\62\u013e\n\62\f\62\16\62\u0141\13\62\3\62"+
		"\3\62\3\63\6\63\u0146\n\63\r\63\16\63\u0147\3\64\6\64\u014b\n\64\r\64"+
		"\16\64\u014c\3\64\3\64\3\u00df\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65\3\2\7\3\2\62;\6\2\"\"\62;C\\c|\5\2\62;C\\c|"+
		"\4\2C\\c|\5\2\13\f\17\17\"\"\u0159\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\3i\3\2\2\2\5n\3\2\2\2\7r\3\2\2\2\tx\3\2\2\2\13}\3\2\2\2\r\u0084\3\2"+
		"\2\2\17\u008a\3\2\2\2\21\u008f\3\2\2\2\23\u0097\3\2\2\2\25\u009c\3\2\2"+
		"\2\27\u00a2\3\2\2\2\31\u00a5\3\2\2\2\33\u00aa\3\2\2\2\35\u00b0\3\2\2\2"+
		"\37\u00b4\3\2\2\2!\u00bb\3\2\2\2#\u00c2\3\2\2\2%\u00c7\3\2\2\2\'\u00cd"+
		"\3\2\2\2)\u00d0\3\2\2\2+\u00d6\3\2\2\2-\u00db\3\2\2\2/\u00e7\3\2\2\2\61"+
		"\u00ef\3\2\2\2\63\u00fc\3\2\2\2\65\u00fe\3\2\2\2\67\u0100\3\2\2\29\u0102"+
		"\3\2\2\2;\u0104\3\2\2\2=\u0106\3\2\2\2?\u0108\3\2\2\2A\u010a\3\2\2\2C"+
		"\u010c\3\2\2\2E\u010e\3\2\2\2G\u0110\3\2\2\2I\u0112\3\2\2\2K\u0114\3\2"+
		"\2\2M\u0117\3\2\2\2O\u011a\3\2\2\2Q\u011e\3\2\2\2S\u0120\3\2\2\2U\u0122"+
		"\3\2\2\2W\u0125\3\2\2\2Y\u0128\3\2\2\2[\u012b\3\2\2\2]\u012e\3\2\2\2_"+
		"\u0130\3\2\2\2a\u0132\3\2\2\2c\u013b\3\2\2\2e\u0145\3\2\2\2g\u014a\3\2"+
		"\2\2ij\7w\2\2jk\7p\2\2kl\7h\2\2lm\7e\2\2m\4\3\2\2\2no\7p\2\2op\7k\2\2"+
		"pq\7v\2\2q\6\3\2\2\2rs\7h\2\2st\7q\2\2tu\7n\2\2uv\7c\2\2vw\7v\2\2w\b\3"+
		"\2\2\2xy\7e\2\2yz\7c\2\2z{\7j\2\2{|\7t\2\2|\n\3\2\2\2}~\7i\2\2~\177\7"+
		"p\2\2\177\u0080\7u\2\2\u0080\u0081\7v\2\2\u0081\u0082\7t\2\2\u0082\u0083"+
		"\7k\2\2\u0083\f\3\2\2\2\u0084\u0085\7{\2\2\u0085\u0086\7c\2\2\u0086\u0087"+
		"\7c\2\2\u0087\u0088\7t\2\2\u0088\u0089\7t\2\2\u0089\16\3\2\2\2\u008a\u008b"+
		"\7q\2\2\u008b\u008c\7x\2\2\u008c\u008d\7k\2\2\u008d\u008e\7f\2\2\u008e"+
		"\20\3\2\2\2\u008f\u0090\7n\2\2\u0090\u0091\7q\2\2\u0091\u0092\7q\2\2\u0092"+
		"\u0093\7d\2\2\u0093\u0094\7g\2\2\u0094\u0095\7c\2\2\u0095\u0096\7p\2\2"+
		"\u0096\22\3\2\2\2\u0097\u0098\7t\2\2\u0098\u0099\7w\2\2\u0099\u009a\7"+
		"v\2\2\u009a\u009b\7g\2\2\u009b\24\3\2\2\2\u009c\u009d\7n\2\2\u009d\u009e"+
		"\7c\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7g\2\2\u00a1"+
		"\26\3\2\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4\7k\2\2\u00a4\30\3\2\2\2\u00a5"+
		"\u00a6\7u\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7g\2\2"+
		"\u00a9\32\3\2\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7"+
		"y\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7j\2\2\u00af\34\3\2\2\2\u00b0\u00b1"+
		"\7q\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7h\2\2\u00b3\36\3\2\2\2\u00b4\u00b5"+
		"\7v\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7p\2\2\u00b8"+
		"\u00b9\7w\2\2\u00b9\u00ba\7t\2\2\u00ba \3\2\2\2\u00bb\u00bc\7v\2\2\u00bc"+
		"\u00bd\7y\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7e\2\2"+
		"\u00c0\u00c1\7j\2\2\u00c1\"\3\2\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7c"+
		"\2\2\u00c4\u00c5\7e\2\2\u00c5\u00c6\7g\2\2\u00c6$\3\2\2\2\u00c7\u00c8"+
		"\7d\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7m\2\2\u00cb"+
		"\u00cc\7g\2\2\u00cc&\3\2\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7f\2\2\u00cf"+
		"(\3\2\2\2\u00d0\u00d1\7r\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7p\2\2\u00d3"+
		"\u00d4\7v\2\2\u00d4\u00d5\7t\2\2\u00d5*\3\2\2\2\u00d6\u00d7\7u\2\2\u00d7"+
		"\u00d8\7p\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7e\2\2\u00da,\3\2\2\2\u00db"+
		"\u00df\7%\2\2\u00dc\u00de\13\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e3\7%\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\b\27"+
		"\2\2\u00e5.\3\2\2\2\u00e6\u00e8\7/\2\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00eb\t\2\2\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\60\3\2\2"+
		"\2\u00ee\u00f0\7/\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2"+
		"\3\2\2\2\u00f1\u00f3\t\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\7\60"+
		"\2\2\u00f7\u00f9\t\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\62\3\2\2\2\u00fc\u00fd\7#\2\2"+
		"\u00fd\64\3\2\2\2\u00fe\u00ff\7+\2\2\u00ff\66\3\2\2\2\u0100\u0101\7*\2"+
		"\2\u01018\3\2\2\2\u0102\u0103\7\177\2\2\u0103:\3\2\2\2\u0104\u0105\7}"+
		"\2\2\u0105<\3\2\2\2\u0106\u0107\7-\2\2\u0107>\3\2\2\2\u0108\u0109\7/\2"+
		"\2\u0109@\3\2\2\2\u010a\u010b\7,\2\2\u010bB\3\2\2\2\u010c\u010d\7\61\2"+
		"\2\u010dD\3\2\2\2\u010e\u010f\7\'\2\2\u010fF\3\2\2\2\u0110\u0111\7`\2"+
		"\2\u0111H\3\2\2\2\u0112\u0113\7.\2\2\u0113J\3\2\2\2\u0114\u0115\7(\2\2"+
		"\u0115\u0116\7(\2\2\u0116L\3\2\2\2\u0117\u0118\7~\2\2\u0118\u0119\7~\2"+
		"\2\u0119N\3\2\2\2\u011a\u011b\7v\2\2\u011b\u011c\7q\2\2\u011c\u011d\7"+
		"p\2\2\u011dP\3\2\2\2\u011e\u011f\7@\2\2\u011fR\3\2\2\2\u0120\u0121\7>"+
		"\2\2\u0121T\3\2\2\2\u0122\u0123\7@\2\2\u0123\u0124\7?\2\2\u0124V\3\2\2"+
		"\2\u0125\u0126\7>\2\2\u0126\u0127\7?\2\2\u0127X\3\2\2\2\u0128\u0129\7"+
		">\2\2\u0129\u012a\7@\2\2\u012aZ\3\2\2\2\u012b\u012c\7?\2\2\u012c\u012d"+
		"\7?\2\2\u012d\\\3\2\2\2\u012e\u012f\7?\2\2\u012f^\3\2\2\2\u0130\u0131"+
		"\7=\2\2\u0131`\3\2\2\2\u0132\u0136\7$\2\2\u0133\u0135\t\3\2\2\u0134\u0133"+
		"\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7$\2\2\u013ab\3\2\2\2\u013b"+
		"\u013f\7)\2\2\u013c\u013e\t\4\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2"+
		"\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0142\u0143\7)\2\2\u0143d\3\2\2\2\u0144\u0146\t\5\2\2\u0145"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148f\3\2\2\2\u0149\u014b\t\6\2\2\u014a\u0149\3\2\2\2\u014b\u014c"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014f\b\64\2\2\u014fh\3\2\2\2\r\2\u00df\u00e7\u00ec\u00ef\u00f4\u00fa"+
		"\u0136\u013f\u0147\u014c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}