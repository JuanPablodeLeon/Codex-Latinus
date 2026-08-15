// Generated from /home/juanpa/Documentos/Codex-Latinus/Codex-Latinus/src/main/java/antlr4/com/CodexLatinusGrammar.g4 by ANTLR 4.13.2

    package antlr4.com;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CodexLatinusGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NON=1, ESTO=2, VERUM=3, FALSUS=4, SERIES=5, TEXTUM=6, DECIMALIS=7, NUMERUS=8, 
		LITTERA=9, BOOL=10, STRUCTURA=11, FINIS=12, SI=13, ALITER=14, DUM=15, 
		FACERE=16, PERGE=17, PER=18, INTERRUMPE=19, ACTIO=20, RATIO=21, REDDERE=22, 
		VARIABILES=23, MUNERA=24, MAIOR=25, FINISUP=26, IMPR=27, LEER=28, SUMA_INCR=29, 
		RESTA_DECR=30, SUMA=31, RESTA=32, MULTI=33, DIV=34, IGUAL=35, NO_IGUAL=36, 
		MENRO_IGUAL=37, MAYOR_IGUAL=38, MENOR=39, MAYOR=40, AND=41, OR=42, DOS_PUNTOS=43, 
		PUNTO_COMA=44, COMA=45, PUNTO=46, LLLAVE=47, RLLAVE=48, LCORCH=49, RCORCH=50, 
		LPAREN=51, RPAREN=52, ASIGNACION=53, ID=54, INT=55, DOUBLE=56, STRING=57, 
		CHARS=58, ESC=59, LINE_COMMENT=60, BLOCK_COMMENT=61, WS=62;
	public static final int
		RULE_inicio = 0, RULE_instrucciones = 1, RULE_opcion_val = 2, RULE_bloque_vars = 3, 
		RULE_asignaciones = 4, RULE_opcion_func = 5, RULE_bloque_func = 6, RULE_tipos = 7, 
		RULE_main = 8, RULE_instruccion = 9, RULE_imprimir = 10, RULE_expresion = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "instrucciones", "opcion_val", "bloque_vars", "asignaciones", 
			"opcion_func", "bloque_func", "tipos", "main", "instruccion", "imprimir", 
			"expresion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'non'", "'esto'", "'verum'", "'falsus'", "'series'", "'textum'", 
			"'decimalis'", "'numerus'", "'littera'", "'bool'", "'structura'", "'finis'", 
			"'si'", "'aliter'", "'dum'", "'facere'", "'perge'", "'per'", "'interrumpe'", 
			"'actio'", "'ratio'", "'reddere'", "'VARIABILES'", "'MUNERA'", "'MAIOR'", 
			"'FINIS'", "'<<'", "'>>'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", 
			"'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'&&'", "'||'", "':'", 
			"';'", "','", "'.'", "'{'", "'}'", "'['", "']'", "'('", "')'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NON", "ESTO", "VERUM", "FALSUS", "SERIES", "TEXTUM", "DECIMALIS", 
			"NUMERUS", "LITTERA", "BOOL", "STRUCTURA", "FINIS", "SI", "ALITER", "DUM", 
			"FACERE", "PERGE", "PER", "INTERRUMPE", "ACTIO", "RATIO", "REDDERE", 
			"VARIABILES", "MUNERA", "MAIOR", "FINISUP", "IMPR", "LEER", "SUMA_INCR", 
			"RESTA_DECR", "SUMA", "RESTA", "MULTI", "DIV", "IGUAL", "NO_IGUAL", "MENRO_IGUAL", 
			"MAYOR_IGUAL", "MENOR", "MAYOR", "AND", "OR", "DOS_PUNTOS", "PUNTO_COMA", 
			"COMA", "PUNTO", "LLLAVE", "RLLAVE", "LCORCH", "RCORCH", "LPAREN", "RPAREN", 
			"ASIGNACION", "ID", "INT", "DOUBLE", "STRING", "CHARS", "ESC", "LINE_COMMENT", 
			"BLOCK_COMMENT", "WS"
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

	@Override
	public String getGrammarFileName() { return "CodexLatinusGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CodexLatinusGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CodexLatinusGrammarParser.EOF, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) {
				{
				setState(24);
				instrucciones();
				}
			}

			setState(27);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionesContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode FINISUP() { return getToken(CodexLatinusGrammarParser.FINISUP, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public Opcion_valContext opcion_val() {
			return getRuleContext(Opcion_valContext.class,0);
		}
		public Opcion_funcContext opcion_func() {
			return getRuleContext(Opcion_funcContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABILES) {
				{
				setState(29);
				opcion_val();
				}
			}

			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUNERA) {
				{
				setState(32);
				opcion_func();
				}
			}

			setState(35);
			main();
			setState(36);
			match(FINISUP);
			setState(37);
			match(PUNTO_COMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Opcion_valContext extends ParserRuleContext {
		public TerminalNode VARIABILES() { return getToken(CodexLatinusGrammarParser.VARIABILES, 0); }
		public TerminalNode MAYOR() { return getToken(CodexLatinusGrammarParser.MAYOR, 0); }
		public List<Bloque_varsContext> bloque_vars() {
			return getRuleContexts(Bloque_varsContext.class);
		}
		public Bloque_varsContext bloque_vars(int i) {
			return getRuleContext(Bloque_varsContext.class,i);
		}
		public Opcion_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcion_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterOpcion_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitOpcion_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitOpcion_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opcion_valContext opcion_val() throws RecognitionException {
		Opcion_valContext _localctx = new Opcion_valContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_opcion_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(VARIABILES);
			setState(40);
			match(MAYOR);
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				bloque_vars();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 18014398509484068L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_varsContext extends ParserRuleContext {
		public TerminalNode ESTO() { return getToken(CodexLatinusGrammarParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CodexLatinusGrammarParser.DOS_PUNTOS, 0); }
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public TerminalNode SERIES() { return getToken(CodexLatinusGrammarParser.SERIES, 0); }
		public TerminalNode LCORCH() { return getToken(CodexLatinusGrammarParser.LCORCH, 0); }
		public TerminalNode RCORCH() { return getToken(CodexLatinusGrammarParser.RCORCH, 0); }
		public TerminalNode LLLAVE() { return getToken(CodexLatinusGrammarParser.LLLAVE, 0); }
		public TerminalNode RLLAVE() { return getToken(CodexLatinusGrammarParser.RLLAVE, 0); }
		public TerminalNode STRUCTURA() { return getToken(CodexLatinusGrammarParser.STRUCTURA, 0); }
		public TerminalNode FINIS() { return getToken(CodexLatinusGrammarParser.FINIS, 0); }
		public AsignacionesContext asignaciones() {
			return getRuleContext(AsignacionesContext.class,0);
		}
		public TerminalNode SUMA_INCR() { return getToken(CodexLatinusGrammarParser.SUMA_INCR, 0); }
		public TerminalNode RESTA_DECR() { return getToken(CodexLatinusGrammarParser.RESTA_DECR, 0); }
		public Bloque_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterBloque_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitBloque_vars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitBloque_vars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_varsContext bloque_vars() throws RecognitionException {
		Bloque_varsContext _localctx = new Bloque_varsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloque_vars);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(ESTO);
				setState(47);
				match(ID);
				setState(48);
				match(DOS_PUNTOS);
				setState(49);
				tipos();
				setState(50);
				expresion(0);
				setState(51);
				match(PUNTO_COMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(ID);
				setState(54);
				match(DOS_PUNTOS);
				setState(55);
				tipos();
				setState(56);
				expresion(0);
				setState(57);
				match(PUNTO_COMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(SERIES);
				setState(60);
				match(ID);
				setState(61);
				match(LCORCH);
				setState(62);
				expresion(0);
				setState(63);
				match(RCORCH);
				setState(64);
				match(DOS_PUNTOS);
				setState(65);
				tipos();
				setState(66);
				match(LLLAVE);
				setState(67);
				expresion(0);
				setState(68);
				match(RLLAVE);
				setState(69);
				match(PUNTO_COMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				match(SERIES);
				setState(72);
				match(ID);
				setState(73);
				match(LCORCH);
				setState(74);
				expresion(0);
				setState(75);
				match(RCORCH);
				setState(76);
				match(DOS_PUNTOS);
				setState(77);
				tipos();
				setState(78);
				match(PUNTO_COMA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				match(STRUCTURA);
				setState(81);
				match(ID);
				setState(82);
				match(LLLAVE);
				setState(83);
				match(RLLAVE);
				setState(84);
				match(FINIS);
				setState(85);
				match(PUNTO_COMA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				match(STRUCTURA);
				setState(87);
				match(ID);
				setState(88);
				match(LLLAVE);
				setState(89);
				match(RLLAVE);
				setState(90);
				match(FINIS);
				setState(91);
				match(PUNTO_COMA);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				asignaciones();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(93);
				match(ID);
				setState(94);
				match(SUMA_INCR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(95);
				match(ID);
				setState(96);
				match(RESTA_DECR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(CodexLatinusGrammarParser.ASIGNACION, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public TerminalNode LCORCH() { return getToken(CodexLatinusGrammarParser.LCORCH, 0); }
		public TerminalNode RCORCH() { return getToken(CodexLatinusGrammarParser.RCORCH, 0); }
		public AsignacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterAsignaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitAsignaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitAsignaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionesContext asignaciones() throws RecognitionException {
		AsignacionesContext _localctx = new AsignacionesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asignaciones);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(ID);
				setState(100);
				match(ASIGNACION);
				setState(101);
				expresion(0);
				setState(102);
				match(PUNTO_COMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(ID);
				setState(105);
				match(LCORCH);
				setState(106);
				expresion(0);
				setState(107);
				match(RCORCH);
				setState(108);
				match(ASIGNACION);
				setState(109);
				expresion(0);
				setState(110);
				match(PUNTO_COMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Opcion_funcContext extends ParserRuleContext {
		public TerminalNode MUNERA() { return getToken(CodexLatinusGrammarParser.MUNERA, 0); }
		public TerminalNode MAYOR() { return getToken(CodexLatinusGrammarParser.MAYOR, 0); }
		public List<Bloque_funcContext> bloque_func() {
			return getRuleContexts(Bloque_funcContext.class);
		}
		public Bloque_funcContext bloque_func(int i) {
			return getRuleContext(Bloque_funcContext.class,i);
		}
		public Opcion_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcion_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterOpcion_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitOpcion_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitOpcion_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opcion_funcContext opcion_func() throws RecognitionException {
		Opcion_funcContext _localctx = new Opcion_funcContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_opcion_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(MUNERA);
			setState(115);
			match(MAYOR);
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				bloque_func();
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ACTIO || _la==RATIO );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_funcContext extends ParserRuleContext {
		public TerminalNode ACTIO() { return getToken(CodexLatinusGrammarParser.ACTIO, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CodexLatinusGrammarParser.RPAREN, 0); }
		public TerminalNode LLLAVE() { return getToken(CodexLatinusGrammarParser.LLLAVE, 0); }
		public TerminalNode RLLAVE() { return getToken(CodexLatinusGrammarParser.RLLAVE, 0); }
		public TerminalNode FINIS() { return getToken(CodexLatinusGrammarParser.FINIS, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public TerminalNode RATIO() { return getToken(CodexLatinusGrammarParser.RATIO, 0); }
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public Bloque_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterBloque_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitBloque_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitBloque_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_funcContext bloque_func() throws RecognitionException {
		Bloque_funcContext _localctx = new Bloque_funcContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloque_func);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(ACTIO);
				setState(122);
				match(ID);
				setState(123);
				match(LPAREN);
				setState(124);
				match(RPAREN);
				setState(125);
				match(LLLAVE);
				setState(126);
				match(RLLAVE);
				setState(127);
				match(FINIS);
				setState(128);
				match(PUNTO_COMA);
				}
				break;
			case RATIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(RATIO);
				setState(130);
				tipos();
				setState(131);
				match(ID);
				setState(132);
				match(LPAREN);
				setState(133);
				match(RPAREN);
				setState(134);
				match(LLLAVE);
				setState(135);
				match(RLLAVE);
				setState(136);
				match(FINIS);
				setState(137);
				match(PUNTO_COMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TiposContext extends ParserRuleContext {
		public TerminalNode NUMERUS() { return getToken(CodexLatinusGrammarParser.NUMERUS, 0); }
		public TerminalNode DECIMALIS() { return getToken(CodexLatinusGrammarParser.DECIMALIS, 0); }
		public TerminalNode TEXTUM() { return getToken(CodexLatinusGrammarParser.TEXTUM, 0); }
		public TerminalNode LITTERA() { return getToken(CodexLatinusGrammarParser.LITTERA, 0); }
		public TerminalNode BOOL() { return getToken(CodexLatinusGrammarParser.BOOL, 0); }
		public TiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterTipos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitTipos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitTipos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiposContext tipos() throws RecognitionException {
		TiposContext _localctx = new TiposContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1984L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIOR() { return getToken(CodexLatinusGrammarParser.MAIOR, 0); }
		public TerminalNode MAYOR() { return getToken(CodexLatinusGrammarParser.MAYOR, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(MAIOR);
			setState(144);
			match(MAYOR);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 560698158037835802L) != 0)) {
				{
				{
				setState(145);
				instruccion();
				}
				}
				setState(150);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode SI() { return getToken(CodexLatinusGrammarParser.SI, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(CodexLatinusGrammarParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(CodexLatinusGrammarParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CodexLatinusGrammarParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(CodexLatinusGrammarParser.RPAREN, i);
		}
		public List<TerminalNode> LLLAVE() { return getTokens(CodexLatinusGrammarParser.LLLAVE); }
		public TerminalNode LLLAVE(int i) {
			return getToken(CodexLatinusGrammarParser.LLLAVE, i);
		}
		public List<TerminalNode> RLLAVE() { return getTokens(CodexLatinusGrammarParser.RLLAVE); }
		public TerminalNode RLLAVE(int i) {
			return getToken(CodexLatinusGrammarParser.RLLAVE, i);
		}
		public TerminalNode FINIS() { return getToken(CodexLatinusGrammarParser.FINIS, 0); }
		public List<TerminalNode> PUNTO_COMA() { return getTokens(CodexLatinusGrammarParser.PUNTO_COMA); }
		public TerminalNode PUNTO_COMA(int i) {
			return getToken(CodexLatinusGrammarParser.PUNTO_COMA, i);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public List<TerminalNode> ALITER() { return getTokens(CodexLatinusGrammarParser.ALITER); }
		public TerminalNode ALITER(int i) {
			return getToken(CodexLatinusGrammarParser.ALITER, i);
		}
		public TerminalNode DUM() { return getToken(CodexLatinusGrammarParser.DUM, 0); }
		public TerminalNode FACERE() { return getToken(CodexLatinusGrammarParser.FACERE, 0); }
		public TerminalNode PER() { return getToken(CodexLatinusGrammarParser.PER, 0); }
		public List<Bloque_varsContext> bloque_vars() {
			return getRuleContexts(Bloque_varsContext.class);
		}
		public Bloque_varsContext bloque_vars(int i) {
			return getRuleContext(Bloque_varsContext.class,i);
		}
		public TerminalNode PERGE() { return getToken(CodexLatinusGrammarParser.PERGE, 0); }
		public TerminalNode INTERRUMPE() { return getToken(CodexLatinusGrammarParser.INTERRUMPE, 0); }
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instruccion);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPR:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				imprimir();
				}
				break;
			case NON:
			case VERUM:
			case FALSUS:
			case RESTA:
			case LPAREN:
			case ID:
			case INT:
			case DOUBLE:
			case STRING:
			case CHARS:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				expresion(0);
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(SI);
				setState(154);
				match(LPAREN);
				setState(155);
				expresion(0);
				setState(156);
				match(RPAREN);
				setState(157);
				match(LLLAVE);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 560698158037835802L) != 0)) {
					{
					{
					setState(158);
					instruccion();
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(164);
				match(RLLAVE);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ALITER) {
					{
					{
					setState(165);
					match(ALITER);
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LPAREN) {
						{
						setState(166);
						match(LPAREN);
						setState(167);
						expresion(0);
						setState(168);
						match(RPAREN);
						}
					}

					setState(172);
					match(LLLAVE);
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 560698158037835802L) != 0)) {
						{
						{
						setState(173);
						instruccion();
						}
						}
						setState(178);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(179);
					match(RLLAVE);
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
				match(FINIS);
				setState(186);
				match(PUNTO_COMA);
				}
				break;
			case DUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				match(DUM);
				setState(189);
				match(LPAREN);
				setState(190);
				expresion(0);
				setState(191);
				match(RPAREN);
				setState(192);
				match(LLLAVE);
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(193);
					instruccion();
					}
					}
					setState(196); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 560698158037835802L) != 0) );
				setState(198);
				match(RLLAVE);
				setState(199);
				match(FINIS);
				setState(200);
				match(PUNTO_COMA);
				}
				break;
			case FACERE:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				match(FACERE);
				setState(203);
				match(LLLAVE);
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(204);
					instruccion();
					}
					}
					setState(207); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 560698158037835802L) != 0) );
				setState(209);
				match(RLLAVE);
				setState(210);
				match(DUM);
				setState(211);
				match(LPAREN);
				setState(212);
				expresion(0);
				setState(213);
				match(RPAREN);
				setState(214);
				match(PUNTO_COMA);
				}
				break;
			case PER:
				enterOuterAlt(_localctx, 6);
				{
				setState(216);
				match(PER);
				setState(217);
				match(LPAREN);
				setState(218);
				bloque_vars();
				setState(219);
				match(PUNTO_COMA);
				setState(220);
				expresion(0);
				setState(221);
				match(PUNTO_COMA);
				setState(222);
				bloque_vars();
				setState(223);
				match(RPAREN);
				setState(224);
				match(LLLAVE);
				setState(225);
				match(RLLAVE);
				}
				break;
			case PERGE:
				enterOuterAlt(_localctx, 7);
				{
				setState(227);
				match(PERGE);
				setState(228);
				match(PUNTO_COMA);
				}
				break;
			case INTERRUMPE:
				enterOuterAlt(_localctx, 8);
				{
				setState(229);
				match(INTERRUMPE);
				setState(230);
				match(PUNTO_COMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode IMPR() { return getToken(CodexLatinusGrammarParser.IMPR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitImprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(IMPR);
			setState(234);
			expresion(0);
			setState(235);
			match(PUNTO_COMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public Token ops1;
		public TerminalNode RESTA() { return getToken(CodexLatinusGrammarParser.RESTA, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode NON() { return getToken(CodexLatinusGrammarParser.NON, 0); }
		public TerminalNode LPAREN() { return getToken(CodexLatinusGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CodexLatinusGrammarParser.RPAREN, 0); }
		public TerminalNode VERUM() { return getToken(CodexLatinusGrammarParser.VERUM, 0); }
		public TerminalNode FALSUS() { return getToken(CodexLatinusGrammarParser.FALSUS, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode DOUBLE() { return getToken(CodexLatinusGrammarParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(CodexLatinusGrammarParser.INT, 0); }
		public TerminalNode CHARS() { return getToken(CodexLatinusGrammarParser.CHARS, 0); }
		public TerminalNode STRING() { return getToken(CodexLatinusGrammarParser.STRING, 0); }
		public TerminalNode MULTI() { return getToken(CodexLatinusGrammarParser.MULTI, 0); }
		public TerminalNode DIV() { return getToken(CodexLatinusGrammarParser.DIV, 0); }
		public TerminalNode SUMA() { return getToken(CodexLatinusGrammarParser.SUMA, 0); }
		public TerminalNode IGUAL() { return getToken(CodexLatinusGrammarParser.IGUAL, 0); }
		public TerminalNode NO_IGUAL() { return getToken(CodexLatinusGrammarParser.NO_IGUAL, 0); }
		public TerminalNode MENRO_IGUAL() { return getToken(CodexLatinusGrammarParser.MENRO_IGUAL, 0); }
		public TerminalNode MAYOR_IGUAL() { return getToken(CodexLatinusGrammarParser.MAYOR_IGUAL, 0); }
		public TerminalNode MENOR() { return getToken(CodexLatinusGrammarParser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(CodexLatinusGrammarParser.MAYOR, 0); }
		public TerminalNode AND() { return getToken(CodexLatinusGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(CodexLatinusGrammarParser.OR, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESTA:
				{
				setState(238);
				match(RESTA);
				setState(239);
				expresion(16);
				}
				break;
			case NON:
				{
				setState(240);
				match(NON);
				setState(241);
				expresion(15);
				}
				break;
			case LPAREN:
				{
				setState(242);
				match(LPAREN);
				setState(243);
				expresion(0);
				setState(244);
				match(RPAREN);
				}
				break;
			case VERUM:
				{
				setState(246);
				match(VERUM);
				}
				break;
			case FALSUS:
				{
				setState(247);
				match(FALSUS);
				}
				break;
			case ID:
				{
				setState(248);
				match(ID);
				}
				break;
			case DOUBLE:
				{
				setState(249);
				match(DOUBLE);
				}
				break;
			case INT:
				{
				setState(250);
				match(INT);
				}
				break;
			case CHARS:
				{
				setState(251);
				match(CHARS);
				}
				break;
			case STRING:
				{
				setState(252);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(273);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(255);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(256);
						((ExpresionContext)_localctx).ops1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULTI || _la==DIV) ) {
							((ExpresionContext)_localctx).ops1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(257);
						expresion(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(258);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(259);
						((ExpresionContext)_localctx).ops1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUMA || _la==RESTA) ) {
							((ExpresionContext)_localctx).ops1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(260);
						expresion(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(261);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(262);
						((ExpresionContext)_localctx).ops1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==IGUAL || _la==NO_IGUAL) ) {
							((ExpresionContext)_localctx).ops1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(263);
						expresion(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(264);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(265);
						((ExpresionContext)_localctx).ops1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MENRO_IGUAL || _la==MAYOR_IGUAL) ) {
							((ExpresionContext)_localctx).ops1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(266);
						expresion(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(267);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(268);
						((ExpresionContext)_localctx).ops1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MENOR || _la==MAYOR) ) {
							((ExpresionContext)_localctx).ops1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(269);
						expresion(10);
						}
						break;
					case 6:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(270);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(271);
						((ExpresionContext)_localctx).ops1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((ExpresionContext)_localctx).ops1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(272);
						expresion(9);
						}
						break;
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u0117\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0003\u0000\u001a\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003"+
		"\u0001\u001f\b\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0004"+
		"\u0002+\b\u0002\u000b\u0002\f\u0002,\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003b\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004q\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0004\u0005v\b\u0005\u000b\u0005\f\u0005w\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u008c\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u0093\b\b\n\b\f\b\u0096\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0005\t\u00a0\b\t\n\t\f\t\u00a3\t\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00ab\b\t\u0001\t\u0001\t\u0005"+
		"\t\u00af\b\t\n\t\f\t\u00b2\t\t\u0001\t\u0005\t\u00b5\b\t\n\t\f\t\u00b8"+
		"\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0004\t\u00c3\b\t\u000b\t\f\t\u00c4\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0004\t\u00ce\b\t\u000b\t\f\t\u00cf\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00e8\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00fe\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u0112\b\u000b\n\u000b\f\u000b\u0115\t\u000b\u0001\u000b\u0000\u0001"+
		"\u0016\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000"+
		"\u0007\u0001\u0000\u0006\n\u0001\u0000!\"\u0001\u0000\u001f \u0001\u0000"+
		"#$\u0001\u0000%&\u0001\u0000\'(\u0001\u0000)*\u0136\u0000\u0019\u0001"+
		"\u0000\u0000\u0000\u0002\u001e\u0001\u0000\u0000\u0000\u0004\'\u0001\u0000"+
		"\u0000\u0000\u0006a\u0001\u0000\u0000\u0000\bp\u0001\u0000\u0000\u0000"+
		"\nr\u0001\u0000\u0000\u0000\f\u008b\u0001\u0000\u0000\u0000\u000e\u008d"+
		"\u0001\u0000\u0000\u0000\u0010\u008f\u0001\u0000\u0000\u0000\u0012\u00e7"+
		"\u0001\u0000\u0000\u0000\u0014\u00e9\u0001\u0000\u0000\u0000\u0016\u00fd"+
		"\u0001\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001\u0000\u0019\u0018"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001b"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001"+
		"\u0001\u0000\u0000\u0000\u001d\u001f\u0003\u0004\u0002\u0000\u001e\u001d"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f!\u0001"+
		"\u0000\u0000\u0000 \"\u0003\n\u0005\u0000! \u0001\u0000\u0000\u0000!\""+
		"\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0003\u0010\b\u0000"+
		"$%\u0005\u001a\u0000\u0000%&\u0005,\u0000\u0000&\u0003\u0001\u0000\u0000"+
		"\u0000\'(\u0005\u0017\u0000\u0000(*\u0005(\u0000\u0000)+\u0003\u0006\u0003"+
		"\u0000*)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-\u0005\u0001\u0000\u0000\u0000"+
		"./\u0005\u0002\u0000\u0000/0\u00056\u0000\u000001\u0005+\u0000\u00001"+
		"2\u0003\u000e\u0007\u000023\u0003\u0016\u000b\u000034\u0005,\u0000\u0000"+
		"4b\u0001\u0000\u0000\u000056\u00056\u0000\u000067\u0005+\u0000\u00007"+
		"8\u0003\u000e\u0007\u000089\u0003\u0016\u000b\u00009:\u0005,\u0000\u0000"+
		":b\u0001\u0000\u0000\u0000;<\u0005\u0005\u0000\u0000<=\u00056\u0000\u0000"+
		"=>\u00051\u0000\u0000>?\u0003\u0016\u000b\u0000?@\u00052\u0000\u0000@"+
		"A\u0005+\u0000\u0000AB\u0003\u000e\u0007\u0000BC\u0005/\u0000\u0000CD"+
		"\u0003\u0016\u000b\u0000DE\u00050\u0000\u0000EF\u0005,\u0000\u0000Fb\u0001"+
		"\u0000\u0000\u0000GH\u0005\u0005\u0000\u0000HI\u00056\u0000\u0000IJ\u0005"+
		"1\u0000\u0000JK\u0003\u0016\u000b\u0000KL\u00052\u0000\u0000LM\u0005+"+
		"\u0000\u0000MN\u0003\u000e\u0007\u0000NO\u0005,\u0000\u0000Ob\u0001\u0000"+
		"\u0000\u0000PQ\u0005\u000b\u0000\u0000QR\u00056\u0000\u0000RS\u0005/\u0000"+
		"\u0000ST\u00050\u0000\u0000TU\u0005\f\u0000\u0000Ub\u0005,\u0000\u0000"+
		"VW\u0005\u000b\u0000\u0000WX\u00056\u0000\u0000XY\u0005/\u0000\u0000Y"+
		"Z\u00050\u0000\u0000Z[\u0005\f\u0000\u0000[b\u0005,\u0000\u0000\\b\u0003"+
		"\b\u0004\u0000]^\u00056\u0000\u0000^b\u0005\u001d\u0000\u0000_`\u0005"+
		"6\u0000\u0000`b\u0005\u001e\u0000\u0000a.\u0001\u0000\u0000\u0000a5\u0001"+
		"\u0000\u0000\u0000a;\u0001\u0000\u0000\u0000aG\u0001\u0000\u0000\u0000"+
		"aP\u0001\u0000\u0000\u0000aV\u0001\u0000\u0000\u0000a\\\u0001\u0000\u0000"+
		"\u0000a]\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000b\u0007\u0001"+
		"\u0000\u0000\u0000cd\u00056\u0000\u0000de\u00055\u0000\u0000ef\u0003\u0016"+
		"\u000b\u0000fg\u0005,\u0000\u0000gq\u0001\u0000\u0000\u0000hi\u00056\u0000"+
		"\u0000ij\u00051\u0000\u0000jk\u0003\u0016\u000b\u0000kl\u00052\u0000\u0000"+
		"lm\u00055\u0000\u0000mn\u0003\u0016\u000b\u0000no\u0005,\u0000\u0000o"+
		"q\u0001\u0000\u0000\u0000pc\u0001\u0000\u0000\u0000ph\u0001\u0000\u0000"+
		"\u0000q\t\u0001\u0000\u0000\u0000rs\u0005\u0018\u0000\u0000su\u0005(\u0000"+
		"\u0000tv\u0003\f\u0006\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u000b\u0001"+
		"\u0000\u0000\u0000yz\u0005\u0014\u0000\u0000z{\u00056\u0000\u0000{|\u0005"+
		"3\u0000\u0000|}\u00054\u0000\u0000}~\u0005/\u0000\u0000~\u007f\u00050"+
		"\u0000\u0000\u007f\u0080\u0005\f\u0000\u0000\u0080\u008c\u0005,\u0000"+
		"\u0000\u0081\u0082\u0005\u0015\u0000\u0000\u0082\u0083\u0003\u000e\u0007"+
		"\u0000\u0083\u0084\u00056\u0000\u0000\u0084\u0085\u00053\u0000\u0000\u0085"+
		"\u0086\u00054\u0000\u0000\u0086\u0087\u0005/\u0000\u0000\u0087\u0088\u0005"+
		"0\u0000\u0000\u0088\u0089\u0005\f\u0000\u0000\u0089\u008a\u0005,\u0000"+
		"\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008by\u0001\u0000\u0000\u0000"+
		"\u008b\u0081\u0001\u0000\u0000\u0000\u008c\r\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0007\u0000\u0000\u0000\u008e\u000f\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005\u0019\u0000\u0000\u0090\u0094\u0005(\u0000\u0000\u0091\u0093"+
		"\u0003\u0012\t\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0096\u0001"+
		"\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001"+
		"\u0000\u0000\u0000\u0095\u0011\u0001\u0000\u0000\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0097\u00e8\u0003\u0014\n\u0000\u0098\u00e8\u0003\u0016"+
		"\u000b\u0000\u0099\u009a\u0005\r\u0000\u0000\u009a\u009b\u00053\u0000"+
		"\u0000\u009b\u009c\u0003\u0016\u000b\u0000\u009c\u009d\u00054\u0000\u0000"+
		"\u009d\u00a1\u0005/\u0000\u0000\u009e\u00a0\u0003\u0012\t\u0000\u009f"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1"+
		"\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4"+
		"\u00b6\u00050\u0000\u0000\u00a5\u00aa\u0005\u000e\u0000\u0000\u00a6\u00a7"+
		"\u00053\u0000\u0000\u00a7\u00a8\u0003\u0016\u000b\u0000\u00a8\u00a9\u0005"+
		"4\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a6\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac\u00b0\u0005/\u0000\u0000\u00ad\u00af\u0003\u0012\t"+
		"\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b5\u00050\u0000\u0000\u00b4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\f\u0000\u0000\u00ba"+
		"\u00bb\u0005,\u0000\u0000\u00bb\u00e8\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0005\u000f\u0000\u0000\u00bd\u00be\u00053\u0000\u0000\u00be\u00bf\u0003"+
		"\u0016\u000b\u0000\u00bf\u00c0\u00054\u0000\u0000\u00c0\u00c2\u0005/\u0000"+
		"\u0000\u00c1\u00c3\u0003\u0012\t\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u00050\u0000\u0000\u00c7\u00c8\u0005\f\u0000\u0000\u00c8"+
		"\u00c9\u0005,\u0000\u0000\u00c9\u00e8\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0005\u0010\u0000\u0000\u00cb\u00cd\u0005/\u0000\u0000\u00cc\u00ce\u0003"+
		"\u0012\t\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u00050\u0000"+
		"\u0000\u00d2\u00d3\u0005\u000f\u0000\u0000\u00d3\u00d4\u00053\u0000\u0000"+
		"\u00d4\u00d5\u0003\u0016\u000b\u0000\u00d5\u00d6\u00054\u0000\u0000\u00d6"+
		"\u00d7\u0005,\u0000\u0000\u00d7\u00e8\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0005\u0012\u0000\u0000\u00d9\u00da\u00053\u0000\u0000\u00da\u00db\u0003"+
		"\u0006\u0003\u0000\u00db\u00dc\u0005,\u0000\u0000\u00dc\u00dd\u0003\u0016"+
		"\u000b\u0000\u00dd\u00de\u0005,\u0000\u0000\u00de\u00df\u0003\u0006\u0003"+
		"\u0000\u00df\u00e0\u00054\u0000\u0000\u00e0\u00e1\u0005/\u0000\u0000\u00e1"+
		"\u00e2\u00050\u0000\u0000\u00e2\u00e8\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0005\u0011\u0000\u0000\u00e4\u00e8\u0005,\u0000\u0000\u00e5\u00e6\u0005"+
		"\u0013\u0000\u0000\u00e6\u00e8\u0005,\u0000\u0000\u00e7\u0097\u0001\u0000"+
		"\u0000\u0000\u00e7\u0098\u0001\u0000\u0000\u0000\u00e7\u0099\u0001\u0000"+
		"\u0000\u0000\u00e7\u00bc\u0001\u0000\u0000\u0000\u00e7\u00ca\u0001\u0000"+
		"\u0000\u0000\u00e7\u00d8\u0001\u0000\u0000\u0000\u00e7\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u0013\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0005\u001b\u0000\u0000\u00ea\u00eb\u0003\u0016"+
		"\u000b\u0000\u00eb\u00ec\u0005,\u0000\u0000\u00ec\u0015\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0006\u000b\uffff\uffff\u0000\u00ee\u00ef\u0005 \u0000"+
		"\u0000\u00ef\u00fe\u0003\u0016\u000b\u0010\u00f0\u00f1\u0005\u0001\u0000"+
		"\u0000\u00f1\u00fe\u0003\u0016\u000b\u000f\u00f2\u00f3\u00053\u0000\u0000"+
		"\u00f3\u00f4\u0003\u0016\u000b\u0000\u00f4\u00f5\u00054\u0000\u0000\u00f5"+
		"\u00fe\u0001\u0000\u0000\u0000\u00f6\u00fe\u0005\u0003\u0000\u0000\u00f7"+
		"\u00fe\u0005\u0004\u0000\u0000\u00f8\u00fe\u00056\u0000\u0000\u00f9\u00fe"+
		"\u00058\u0000\u0000\u00fa\u00fe\u00057\u0000\u0000\u00fb\u00fe\u0005:"+
		"\u0000\u0000\u00fc\u00fe\u00059\u0000\u0000\u00fd\u00ed\u0001\u0000\u0000"+
		"\u0000\u00fd\u00f0\u0001\u0000\u0000\u0000\u00fd\u00f2\u0001\u0000\u0000"+
		"\u0000\u00fd\u00f6\u0001\u0000\u0000\u0000\u00fd\u00f7\u0001\u0000\u0000"+
		"\u0000\u00fd\u00f8\u0001\u0000\u0000\u0000\u00fd\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe\u0113\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\n\r\u0000\u0000\u0100\u0101\u0007\u0001\u0000\u0000"+
		"\u0101\u0112\u0003\u0016\u000b\u000e\u0102\u0103\n\f\u0000\u0000\u0103"+
		"\u0104\u0007\u0002\u0000\u0000\u0104\u0112\u0003\u0016\u000b\r\u0105\u0106"+
		"\n\u000b\u0000\u0000\u0106\u0107\u0007\u0003\u0000\u0000\u0107\u0112\u0003"+
		"\u0016\u000b\f\u0108\u0109\n\n\u0000\u0000\u0109\u010a\u0007\u0004\u0000"+
		"\u0000\u010a\u0112\u0003\u0016\u000b\u000b\u010b\u010c\n\t\u0000\u0000"+
		"\u010c\u010d\u0007\u0005\u0000\u0000\u010d\u0112\u0003\u0016\u000b\n\u010e"+
		"\u010f\n\b\u0000\u0000\u010f\u0110\u0007\u0006\u0000\u0000\u0110\u0112"+
		"\u0003\u0016\u000b\t\u0111\u00ff\u0001\u0000\u0000\u0000\u0111\u0102\u0001"+
		"\u0000\u0000\u0000\u0111\u0105\u0001\u0000\u0000\u0000\u0111\u0108\u0001"+
		"\u0000\u0000\u0000\u0111\u010b\u0001\u0000\u0000\u0000\u0111\u010e\u0001"+
		"\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001"+
		"\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0017\u0001"+
		"\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0013\u0019\u001e"+
		"!,apw\u008b\u0094\u00a1\u00aa\u00b0\u00b6\u00c4\u00cf\u00e7\u00fd\u0111"+
		"\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}