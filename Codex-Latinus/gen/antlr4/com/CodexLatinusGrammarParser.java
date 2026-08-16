// Generated from /home/juanpa/Documentos/Codex-Latinus/Codex-Latinus/src/main/java/antlr4/com/CodexLatinusGrammar.g4 by ANTLR 4.13.2
package antlr4.com;

    package antlr4;

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
		RULE_valores_structura_coma = 4, RULE_valores_structura_punto_coma = 5, 
		RULE_asignacion_structura = 6, RULE_asignaciones = 7, RULE_opcion_func = 8, 
		RULE_bloque_func = 9, RULE_ratio_val = 10, RULE_tipos = 11, RULE_tipos_structura = 12, 
		RULE_main = 13, RULE_instruccion = 14, RULE_imprimir = 15, RULE_leer_txt = 16, 
		RULE_expresion = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "instrucciones", "opcion_val", "bloque_vars", "valores_structura_coma", 
			"valores_structura_punto_coma", "asignacion_structura", "asignaciones", 
			"opcion_func", "bloque_func", "ratio_val", "tipos", "tipos_structura", 
			"main", "instruccion", "imprimir", "leer_txt", "expresion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'non'", "'esto'", "'verum'", "'falsus'", "'series'", "'textum'", 
			"'decimalis'", "'numerus'", "'littera'", "'bool'", "'structura'", "'finis'", 
			"'si'", "'aliter'", "'dum'", "'facere'", "'perge'", "'per'", "'interrumpe'", 
			"'actio'", "'ratio'", "'reddere'", "'VARIABILES'", "'MUNERA'", "'MAIOR'", 
			"'FINIS'", "'>>'", "'<<'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", 
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) {
				{
				setState(36);
				instrucciones();
				}
			}

			setState(39);
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
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABILES) {
				{
				setState(41);
				opcion_val();
				}
			}

			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUNERA) {
				{
				setState(44);
				opcion_func();
				}
			}

			setState(47);
			main();
			setState(48);
			match(FINISUP);
			setState(49);
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
			setState(51);
			match(VARIABILES);
			setState(52);
			match(MAYOR);
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				bloque_vars();
				}
				}
				setState(56); 
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
		public List<TerminalNode> ID() { return getTokens(CodexLatinusGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CodexLatinusGrammarParser.ID, i);
		}
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
		public List<TerminalNode> COMA() { return getTokens(CodexLatinusGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(CodexLatinusGrammarParser.COMA, i);
		}
		public TerminalNode STRUCTURA() { return getToken(CodexLatinusGrammarParser.STRUCTURA, 0); }
		public TerminalNode FINIS() { return getToken(CodexLatinusGrammarParser.FINIS, 0); }
		public Valores_structura_comaContext valores_structura_coma() {
			return getRuleContext(Valores_structura_comaContext.class,0);
		}
		public List<Valores_structura_punto_comaContext> valores_structura_punto_coma() {
			return getRuleContexts(Valores_structura_punto_comaContext.class);
		}
		public Valores_structura_punto_comaContext valores_structura_punto_coma(int i) {
			return getRuleContext(Valores_structura_punto_comaContext.class,i);
		}
		public Asignacion_structuraContext asignacion_structura() {
			return getRuleContext(Asignacion_structuraContext.class,0);
		}
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
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(ESTO);
				setState(59);
				match(ID);
				setState(60);
				match(DOS_PUNTOS);
				setState(61);
				tipos();
				setState(62);
				expresion(0);
				setState(63);
				match(PUNTO_COMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(ID);
				setState(66);
				match(DOS_PUNTOS);
				setState(67);
				tipos();
				setState(68);
				expresion(0);
				setState(69);
				match(PUNTO_COMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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
				match(LLLAVE);
				setState(79);
				expresion(0);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(80);
					match(COMA);
					setState(81);
					expresion(0);
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(87);
				match(RLLAVE);
				setState(88);
				match(PUNTO_COMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				match(SERIES);
				setState(91);
				match(ID);
				setState(92);
				match(LCORCH);
				setState(93);
				expresion(0);
				setState(94);
				match(RCORCH);
				setState(95);
				match(DOS_PUNTOS);
				setState(96);
				tipos();
				setState(97);
				match(PUNTO_COMA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				match(STRUCTURA);
				setState(100);
				match(ID);
				setState(101);
				match(LLLAVE);
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(102);
					valores_structura_coma();
					}
					break;
				case 2:
					{
					setState(104); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(103);
						valores_structura_punto_coma();
						}
						}
						setState(106); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==ESTO );
					}
					break;
				}
				setState(110);
				match(RLLAVE);
				setState(111);
				match(FINIS);
				setState(112);
				match(PUNTO_COMA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				match(ESTO);
				setState(115);
				match(ID);
				setState(116);
				match(DOS_PUNTOS);
				setState(117);
				match(ID);
				setState(118);
				asignacion_structura();
				setState(119);
				match(LLLAVE);
				setState(120);
				match(RLLAVE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(122);
				asignaciones();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(123);
				match(ESTO);
				setState(124);
				match(ID);
				setState(125);
				match(DOS_PUNTOS);
				setState(126);
				expresion(0);
				setState(127);
				match(PUNTO_COMA);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(129);
				match(ID);
				setState(130);
				match(SUMA_INCR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(131);
				match(ID);
				setState(132);
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
	public static class Valores_structura_comaContext extends ParserRuleContext {
		public List<TerminalNode> ESTO() { return getTokens(CodexLatinusGrammarParser.ESTO); }
		public TerminalNode ESTO(int i) {
			return getToken(CodexLatinusGrammarParser.ESTO, i);
		}
		public List<TerminalNode> ID() { return getTokens(CodexLatinusGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CodexLatinusGrammarParser.ID, i);
		}
		public List<TerminalNode> DOS_PUNTOS() { return getTokens(CodexLatinusGrammarParser.DOS_PUNTOS); }
		public TerminalNode DOS_PUNTOS(int i) {
			return getToken(CodexLatinusGrammarParser.DOS_PUNTOS, i);
		}
		public List<Tipos_structuraContext> tipos_structura() {
			return getRuleContexts(Tipos_structuraContext.class);
		}
		public Tipos_structuraContext tipos_structura(int i) {
			return getRuleContext(Tipos_structuraContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(CodexLatinusGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(CodexLatinusGrammarParser.COMA, i);
		}
		public Valores_structura_comaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores_structura_coma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterValores_structura_coma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitValores_structura_coma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitValores_structura_coma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valores_structura_comaContext valores_structura_coma() throws RecognitionException {
		Valores_structura_comaContext _localctx = new Valores_structura_comaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_valores_structura_coma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(ESTO);
			setState(136);
			match(ID);
			setState(137);
			match(DOS_PUNTOS);
			setState(138);
			tipos_structura();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(139);
				match(COMA);
				setState(140);
				match(ESTO);
				setState(141);
				match(ID);
				setState(142);
				match(DOS_PUNTOS);
				setState(143);
				tipos_structura();
				}
				}
				setState(148);
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
	public static class Valores_structura_punto_comaContext extends ParserRuleContext {
		public TerminalNode ESTO() { return getToken(CodexLatinusGrammarParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CodexLatinusGrammarParser.DOS_PUNTOS, 0); }
		public Tipos_structuraContext tipos_structura() {
			return getRuleContext(Tipos_structuraContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public Valores_structura_punto_comaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores_structura_punto_coma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterValores_structura_punto_coma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitValores_structura_punto_coma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitValores_structura_punto_coma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valores_structura_punto_comaContext valores_structura_punto_coma() throws RecognitionException {
		Valores_structura_punto_comaContext _localctx = new Valores_structura_punto_comaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_valores_structura_punto_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(ESTO);
			setState(150);
			match(ID);
			setState(151);
			match(DOS_PUNTOS);
			setState(152);
			tipos_structura();
			setState(153);
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
	public static class Asignacion_structuraContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CodexLatinusGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CodexLatinusGrammarParser.ID, i);
		}
		public List<TerminalNode> DOS_PUNTOS() { return getTokens(CodexLatinusGrammarParser.DOS_PUNTOS); }
		public TerminalNode DOS_PUNTOS(int i) {
			return getToken(CodexLatinusGrammarParser.DOS_PUNTOS, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(CodexLatinusGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(CodexLatinusGrammarParser.COMA, i);
		}
		public Asignacion_structuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_structura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterAsignacion_structura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitAsignacion_structura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitAsignacion_structura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asignacion_structuraContext asignacion_structura() throws RecognitionException {
		Asignacion_structuraContext _localctx = new Asignacion_structuraContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_asignacion_structura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ID);
			setState(156);
			match(DOS_PUNTOS);
			setState(157);
			expresion(0);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(158);
				match(COMA);
				setState(159);
				match(ID);
				setState(160);
				match(DOS_PUNTOS);
				setState(161);
				expresion(0);
				}
				}
				setState(166);
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
		enterRule(_localctx, 14, RULE_asignaciones);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(ID);
				setState(168);
				match(ASIGNACION);
				setState(169);
				expresion(0);
				setState(170);
				match(PUNTO_COMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(ID);
				setState(173);
				match(LCORCH);
				setState(174);
				expresion(0);
				setState(175);
				match(RCORCH);
				setState(176);
				match(ASIGNACION);
				setState(177);
				expresion(0);
				setState(178);
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
		enterRule(_localctx, 16, RULE_opcion_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(MUNERA);
			setState(183);
			match(MAYOR);
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184);
				bloque_func();
				}
				}
				setState(187); 
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
		public Valores_structura_comaContext valores_structura_coma() {
			return getRuleContext(Valores_structura_comaContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CodexLatinusGrammarParser.RPAREN, 0); }
		public TerminalNode LLLAVE() { return getToken(CodexLatinusGrammarParser.LLLAVE, 0); }
		public TerminalNode RLLAVE() { return getToken(CodexLatinusGrammarParser.RLLAVE, 0); }
		public TerminalNode FINIS() { return getToken(CodexLatinusGrammarParser.FINIS, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public TerminalNode RATIO() { return getToken(CodexLatinusGrammarParser.RATIO, 0); }
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public Ratio_valContext ratio_val() {
			return getRuleContext(Ratio_valContext.class,0);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
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
		enterRule(_localctx, 18, RULE_bloque_func);
		int _la;
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(ACTIO);
				setState(190);
				match(ID);
				setState(191);
				match(LPAREN);
				setState(192);
				valores_structura_coma();
				setState(193);
				match(RPAREN);
				setState(194);
				match(LLLAVE);
				setState(195);
				match(RLLAVE);
				setState(196);
				match(FINIS);
				setState(197);
				match(PUNTO_COMA);
				}
				break;
			case RATIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(RATIO);
				setState(200);
				tipos();
				setState(201);
				match(ID);
				setState(202);
				match(LPAREN);
				setState(203);
				valores_structura_coma();
				setState(204);
				match(RPAREN);
				setState(205);
				match(LLLAVE);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARIABILES) {
					{
					setState(206);
					ratio_val();
					}
				}

				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 560698158310465562L) != 0)) {
					{
					{
					setState(209);
					instruccion();
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(215);
				match(RLLAVE);
				setState(216);
				match(FINIS);
				setState(217);
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
	public static class Ratio_valContext extends ParserRuleContext {
		public TerminalNode VARIABILES() { return getToken(CodexLatinusGrammarParser.VARIABILES, 0); }
		public TerminalNode LCORCH() { return getToken(CodexLatinusGrammarParser.LCORCH, 0); }
		public Bloque_varsContext bloque_vars() {
			return getRuleContext(Bloque_varsContext.class,0);
		}
		public TerminalNode RCORCH() { return getToken(CodexLatinusGrammarParser.RCORCH, 0); }
		public Ratio_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ratio_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterRatio_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitRatio_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitRatio_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ratio_valContext ratio_val() throws RecognitionException {
		Ratio_valContext _localctx = new Ratio_valContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ratio_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(VARIABILES);
			setState(222);
			match(LCORCH);
			setState(223);
			bloque_vars();
			setState(224);
			match(RCORCH);
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
		enterRule(_localctx, 22, RULE_tipos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
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
	public static class Tipos_structuraContext extends ParserRuleContext {
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode LCORCH() { return getToken(CodexLatinusGrammarParser.LCORCH, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RCORCH() { return getToken(CodexLatinusGrammarParser.RCORCH, 0); }
		public Tipos_structuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_structura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterTipos_structura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitTipos_structura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitTipos_structura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipos_structuraContext tipos_structura() throws RecognitionException {
		Tipos_structuraContext _localctx = new Tipos_structuraContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipos_structura);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				tipos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(ID);
				setState(230);
				match(LCORCH);
				setState(231);
				expresion(0);
				setState(232);
				match(RCORCH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				match(ID);
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
		enterRule(_localctx, 26, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(MAIOR);
			setState(238);
			match(MAYOR);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 560698158310465562L) != 0)) {
				{
				{
				setState(239);
				instruccion();
				}
				}
				setState(244);
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
		public Leer_txtContext leer_txt() {
			return getRuleContext(Leer_txtContext.class,0);
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
		public List<AsignacionesContext> asignaciones() {
			return getRuleContexts(AsignacionesContext.class);
		}
		public AsignacionesContext asignaciones(int i) {
			return getRuleContext(AsignacionesContext.class,i);
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
		public TerminalNode REDDERE() { return getToken(CodexLatinusGrammarParser.REDDERE, 0); }
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
		enterRule(_localctx, 28, RULE_instruccion);
		int _la;
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				imprimir();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				expresion(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				leer_txt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				match(SI);
				setState(249);
				match(LPAREN);
				setState(250);
				expresion(0);
				setState(251);
				match(RPAREN);
				setState(252);
				match(LLLAVE);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 560698158310465562L) != 0)) {
					{
					setState(255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(253);
						instruccion();
						}
						break;
					case 2:
						{
						setState(254);
						asignaciones();
						}
						break;
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260);
				match(RLLAVE);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ALITER) {
					{
					{
					setState(261);
					match(ALITER);
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LPAREN) {
						{
						setState(262);
						match(LPAREN);
						setState(263);
						expresion(0);
						setState(264);
						match(RPAREN);
						}
					}

					setState(268);
					match(LLLAVE);
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 560698158310465562L) != 0)) {
						{
						{
						setState(269);
						instruccion();
						}
						}
						setState(274);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(275);
					match(RLLAVE);
					}
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(281);
				match(FINIS);
				setState(282);
				match(PUNTO_COMA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
				match(DUM);
				setState(285);
				match(LPAREN);
				setState(286);
				expresion(0);
				setState(287);
				match(RPAREN);
				setState(288);
				match(LLLAVE);
				setState(290); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(289);
					instruccion();
					}
					}
					setState(292); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 560698158310465562L) != 0) );
				setState(294);
				match(RLLAVE);
				setState(295);
				match(FINIS);
				setState(296);
				match(PUNTO_COMA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(298);
				match(FACERE);
				setState(299);
				match(LLLAVE);
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(300);
					instruccion();
					}
					}
					setState(303); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 560698158310465562L) != 0) );
				setState(305);
				match(RLLAVE);
				setState(306);
				match(DUM);
				setState(307);
				match(LPAREN);
				setState(308);
				expresion(0);
				setState(309);
				match(RPAREN);
				setState(310);
				match(PUNTO_COMA);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(312);
				match(PER);
				setState(313);
				match(LPAREN);
				setState(314);
				bloque_vars();
				setState(315);
				match(PUNTO_COMA);
				setState(316);
				expresion(0);
				setState(317);
				match(PUNTO_COMA);
				setState(318);
				bloque_vars();
				setState(319);
				match(RPAREN);
				setState(320);
				match(LLLAVE);
				setState(321);
				match(RLLAVE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(323);
				match(PERGE);
				setState(324);
				match(PUNTO_COMA);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(325);
				match(INTERRUMPE);
				setState(326);
				match(PUNTO_COMA);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(327);
				match(REDDERE);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 560698157902594074L) != 0)) {
					{
					setState(328);
					expresion(0);
					}
				}

				setState(331);
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
	public static class ImprimirContext extends ParserRuleContext {
		public List<TerminalNode> IMPR() { return getTokens(CodexLatinusGrammarParser.IMPR); }
		public TerminalNode IMPR(int i) {
			return getToken(CodexLatinusGrammarParser.IMPR, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
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
		enterRule(_localctx, 30, RULE_imprimir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(IMPR);
			setState(335);
			expresion(0);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPR) {
				{
				{
				setState(336);
				match(IMPR);
				setState(337);
				expresion(0);
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
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
	public static class Leer_txtContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(CodexLatinusGrammarParser.LEER, 0); }
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(CodexLatinusGrammarParser.PUNTO_COMA, 0); }
		public Leer_txtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer_txt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).enterLeer_txt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexLatinusGrammarListener ) ((CodexLatinusGrammarListener)listener).exitLeer_txt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodexLatinusGrammarVisitor ) return ((CodexLatinusGrammarVisitor<? extends T>)visitor).visitLeer_txt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Leer_txtContext leer_txt() throws RecognitionException {
		Leer_txtContext _localctx = new Leer_txtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_leer_txt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(345);
				match(ID);
				}
			}

			setState(348);
			match(LEER);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTO_COMA) {
				{
				setState(349);
				match(PUNTO_COMA);
				}
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
		public TerminalNode ID() { return getToken(CodexLatinusGrammarParser.ID, 0); }
		public List<TerminalNode> COMA() { return getTokens(CodexLatinusGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(CodexLatinusGrammarParser.COMA, i);
		}
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public TerminalNode VERUM() { return getToken(CodexLatinusGrammarParser.VERUM, 0); }
		public TerminalNode FALSUS() { return getToken(CodexLatinusGrammarParser.FALSUS, 0); }
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(353);
				match(RESTA);
				setState(354);
				expresion(18);
				}
				break;
			case 2:
				{
				setState(355);
				match(NON);
				setState(356);
				expresion(17);
				}
				break;
			case 3:
				{
				setState(357);
				match(LPAREN);
				setState(358);
				expresion(0);
				setState(359);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(361);
				match(ID);
				setState(362);
				match(LPAREN);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 560698157902594074L) != 0)) {
					{
					{
					setState(363);
					expresion(0);
					setState(368);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(364);
						match(COMA);
						setState(365);
						expresion(0);
						}
						}
						setState(370);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(376);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(377);
				match(ID);
				setState(378);
				tipos();
				setState(379);
				match(LPAREN);
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 560698157902594074L) != 0)) {
					{
					{
					setState(380);
					expresion(0);
					setState(385);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(381);
						match(COMA);
						setState(382);
						expresion(0);
						}
						}
						setState(387);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(393);
				match(RPAREN);
				}
				break;
			case 6:
				{
				setState(395);
				match(VERUM);
				}
				break;
			case 7:
				{
				setState(396);
				match(FALSUS);
				}
				break;
			case 8:
				{
				setState(397);
				match(ID);
				}
				break;
			case 9:
				{
				setState(398);
				match(DOUBLE);
				}
				break;
			case 10:
				{
				setState(399);
				match(INT);
				}
				break;
			case 11:
				{
				setState(400);
				match(CHARS);
				}
				break;
			case 12:
				{
				setState(401);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(422);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(404);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(405);
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
						setState(406);
						expresion(16);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(407);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(408);
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
						setState(409);
						expresion(15);
						}
						break;
					case 3:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(410);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(411);
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
						setState(412);
						expresion(14);
						}
						break;
					case 4:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(413);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(414);
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
						setState(415);
						expresion(13);
						}
						break;
					case 5:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(416);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(417);
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
						setState(418);
						expresion(12);
						}
						break;
					case 6:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(419);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(420);
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
						setState(421);
						expresion(11);
						}
						break;
					}
					} 
				}
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		case 17:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u01ac\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0003\u0000"+
		"&\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001+\b\u0001\u0001"+
		"\u0001\u0003\u0001.\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u00027\b\u0002\u000b"+
		"\u0002\f\u00028\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003S\b\u0003\n\u0003\f\u0003V\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003i\b"+
		"\u0003\u000b\u0003\f\u0003j\u0003\u0003m\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0086\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u0091\b\u0004\n\u0004\f\u0004\u0094"+
		"\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u00a3\b\u0006\n\u0006\f\u0006\u00a6\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00b5\b\u0007\u0001\b\u0001\b\u0001\b\u0004\b"+
		"\u00ba\b\b\u000b\b\f\b\u00bb\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d0\b\t\u0001\t\u0005\t\u00d3\b\t"+
		"\n\t\f\t\u00d6\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00dc\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ec\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u00f1\b\r\n\r\f\r\u00f4\t\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u0100\b\u000e\n\u000e\f\u000e\u0103"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u010b\b\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u010f"+
		"\b\u000e\n\u000e\f\u000e\u0112\t\u000e\u0001\u000e\u0005\u000e\u0115\b"+
		"\u000e\n\u000e\f\u000e\u0118\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0004\u000e\u0123\b\u000e\u000b\u000e\f\u000e\u0124\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004"+
		"\u000e\u012e\b\u000e\u000b\u000e\f\u000e\u012f\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u014a\b\u000e"+
		"\u0001\u000e\u0003\u000e\u014d\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u0153\b\u000f\n\u000f\f\u000f\u0156\t\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0003\u0010\u015b\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u015f\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u016f"+
		"\b\u0011\n\u0011\f\u0011\u0172\t\u0011\u0005\u0011\u0174\b\u0011\n\u0011"+
		"\f\u0011\u0177\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0180\b\u0011\n\u0011"+
		"\f\u0011\u0183\t\u0011\u0005\u0011\u0185\b\u0011\n\u0011\f\u0011\u0188"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0193\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u01a7\b\u0011\n\u0011\f\u0011\u01aa\t\u0011\u0001\u0011\u0000\u0001"+
		"\"\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"\u0000\u0007\u0001\u0000\u0006\n\u0001\u0000!\"\u0001"+
		"\u0000\u001f \u0001\u0000#$\u0001\u0000%&\u0001\u0000\'(\u0001\u0000)"+
		"*\u01dc\u0000%\u0001\u0000\u0000\u0000\u0002*\u0001\u0000\u0000\u0000"+
		"\u00043\u0001\u0000\u0000\u0000\u0006\u0085\u0001\u0000\u0000\u0000\b"+
		"\u0087\u0001\u0000\u0000\u0000\n\u0095\u0001\u0000\u0000\u0000\f\u009b"+
		"\u0001\u0000\u0000\u0000\u000e\u00b4\u0001\u0000\u0000\u0000\u0010\u00b6"+
		"\u0001\u0000\u0000\u0000\u0012\u00db\u0001\u0000\u0000\u0000\u0014\u00dd"+
		"\u0001\u0000\u0000\u0000\u0016\u00e2\u0001\u0000\u0000\u0000\u0018\u00eb"+
		"\u0001\u0000\u0000\u0000\u001a\u00ed\u0001\u0000\u0000\u0000\u001c\u014c"+
		"\u0001\u0000\u0000\u0000\u001e\u014e\u0001\u0000\u0000\u0000 \u015a\u0001"+
		"\u0000\u0000\u0000\"\u0192\u0001\u0000\u0000\u0000$&\u0003\u0002\u0001"+
		"\u0000%$\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\'\u0001\u0000"+
		"\u0000\u0000\'(\u0005\u0000\u0000\u0001(\u0001\u0001\u0000\u0000\u0000"+
		")+\u0003\u0004\u0002\u0000*)\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+-\u0001\u0000\u0000\u0000,.\u0003\u0010\b\u0000-,\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0003\u001a"+
		"\r\u000001\u0005\u001a\u0000\u000012\u0005,\u0000\u00002\u0003\u0001\u0000"+
		"\u0000\u000034\u0005\u0017\u0000\u000046\u0005(\u0000\u000057\u0003\u0006"+
		"\u0003\u000065\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000086\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u00009\u0005\u0001\u0000\u0000"+
		"\u0000:;\u0005\u0002\u0000\u0000;<\u00056\u0000\u0000<=\u0005+\u0000\u0000"+
		"=>\u0003\u0016\u000b\u0000>?\u0003\"\u0011\u0000?@\u0005,\u0000\u0000"+
		"@\u0086\u0001\u0000\u0000\u0000AB\u00056\u0000\u0000BC\u0005+\u0000\u0000"+
		"CD\u0003\u0016\u000b\u0000DE\u0003\"\u0011\u0000EF\u0005,\u0000\u0000"+
		"F\u0086\u0001\u0000\u0000\u0000GH\u0005\u0005\u0000\u0000HI\u00056\u0000"+
		"\u0000IJ\u00051\u0000\u0000JK\u0003\"\u0011\u0000KL\u00052\u0000\u0000"+
		"LM\u0005+\u0000\u0000MN\u0003\u0016\u000b\u0000NO\u0005/\u0000\u0000O"+
		"T\u0003\"\u0011\u0000PQ\u0005-\u0000\u0000QS\u0003\"\u0011\u0000RP\u0001"+
		"\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000"+
		"\u0000WX\u00050\u0000\u0000XY\u0005,\u0000\u0000Y\u0086\u0001\u0000\u0000"+
		"\u0000Z[\u0005\u0005\u0000\u0000[\\\u00056\u0000\u0000\\]\u00051\u0000"+
		"\u0000]^\u0003\"\u0011\u0000^_\u00052\u0000\u0000_`\u0005+\u0000\u0000"+
		"`a\u0003\u0016\u000b\u0000ab\u0005,\u0000\u0000b\u0086\u0001\u0000\u0000"+
		"\u0000cd\u0005\u000b\u0000\u0000de\u00056\u0000\u0000el\u0005/\u0000\u0000"+
		"fm\u0003\b\u0004\u0000gi\u0003\n\u0005\u0000hg\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000km\u0001\u0000\u0000\u0000lf\u0001\u0000\u0000\u0000lh\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000no\u00050\u0000\u0000op\u0005\f"+
		"\u0000\u0000pq\u0005,\u0000\u0000q\u0086\u0001\u0000\u0000\u0000rs\u0005"+
		"\u0002\u0000\u0000st\u00056\u0000\u0000tu\u0005+\u0000\u0000uv\u00056"+
		"\u0000\u0000vw\u0003\f\u0006\u0000wx\u0005/\u0000\u0000xy\u00050\u0000"+
		"\u0000y\u0086\u0001\u0000\u0000\u0000z\u0086\u0003\u000e\u0007\u0000{"+
		"|\u0005\u0002\u0000\u0000|}\u00056\u0000\u0000}~\u0005+\u0000\u0000~\u007f"+
		"\u0003\"\u0011\u0000\u007f\u0080\u0005,\u0000\u0000\u0080\u0086\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u00056\u0000\u0000\u0082\u0086\u0005\u001d"+
		"\u0000\u0000\u0083\u0084\u00056\u0000\u0000\u0084\u0086\u0005\u001e\u0000"+
		"\u0000\u0085:\u0001\u0000\u0000\u0000\u0085A\u0001\u0000\u0000\u0000\u0085"+
		"G\u0001\u0000\u0000\u0000\u0085Z\u0001\u0000\u0000\u0000\u0085c\u0001"+
		"\u0000\u0000\u0000\u0085r\u0001\u0000\u0000\u0000\u0085z\u0001\u0000\u0000"+
		"\u0000\u0085{\u0001\u0000\u0000\u0000\u0085\u0081\u0001\u0000\u0000\u0000"+
		"\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0007\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0005\u0002\u0000\u0000\u0088\u0089\u00056\u0000\u0000\u0089"+
		"\u008a\u0005+\u0000\u0000\u008a\u0092\u0003\u0018\f\u0000\u008b\u008c"+
		"\u0005-\u0000\u0000\u008c\u008d\u0005\u0002\u0000\u0000\u008d\u008e\u0005"+
		"6\u0000\u0000\u008e\u008f\u0005+\u0000\u0000\u008f\u0091\u0003\u0018\f"+
		"\u0000\u0090\u008b\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000"+
		"\u0000\u0093\t\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005\u0002\u0000\u0000\u0096\u0097\u00056\u0000\u0000\u0097"+
		"\u0098\u0005+\u0000\u0000\u0098\u0099\u0003\u0018\f\u0000\u0099\u009a"+
		"\u0005,\u0000\u0000\u009a\u000b\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"6\u0000\u0000\u009c\u009d\u0005+\u0000\u0000\u009d\u00a4\u0003\"\u0011"+
		"\u0000\u009e\u009f\u0005-\u0000\u0000\u009f\u00a0\u00056\u0000\u0000\u00a0"+
		"\u00a1\u0005+\u0000\u0000\u00a1\u00a3\u0003\"\u0011\u0000\u00a2\u009e"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\r\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005"+
		"6\u0000\u0000\u00a8\u00a9\u00055\u0000\u0000\u00a9\u00aa\u0003\"\u0011"+
		"\u0000\u00aa\u00ab\u0005,\u0000\u0000\u00ab\u00b5\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u00056\u0000\u0000\u00ad\u00ae\u00051\u0000\u0000\u00ae\u00af"+
		"\u0003\"\u0011\u0000\u00af\u00b0\u00052\u0000\u0000\u00b0\u00b1\u0005"+
		"5\u0000\u0000\u00b1\u00b2\u0003\"\u0011\u0000\u00b2\u00b3\u0005,\u0000"+
		"\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00a7\u0001\u0000\u0000"+
		"\u0000\u00b4\u00ac\u0001\u0000\u0000\u0000\u00b5\u000f\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0005\u0018\u0000\u0000\u00b7\u00b9\u0005(\u0000\u0000"+
		"\u00b8\u00ba\u0003\u0012\t\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bc\u0011\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0005\u0014\u0000\u0000\u00be\u00bf\u00056\u0000\u0000\u00bf\u00c0"+
		"\u00053\u0000\u0000\u00c0\u00c1\u0003\b\u0004\u0000\u00c1\u00c2\u0005"+
		"4\u0000\u0000\u00c2\u00c3\u0005/\u0000\u0000\u00c3\u00c4\u00050\u0000"+
		"\u0000\u00c4\u00c5\u0005\f\u0000\u0000\u00c5\u00c6\u0005,\u0000\u0000"+
		"\u00c6\u00dc\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0015\u0000\u0000"+
		"\u00c8\u00c9\u0003\u0016\u000b\u0000\u00c9\u00ca\u00056\u0000\u0000\u00ca"+
		"\u00cb\u00053\u0000\u0000\u00cb\u00cc\u0003\b\u0004\u0000\u00cc\u00cd"+
		"\u00054\u0000\u0000\u00cd\u00cf\u0005/\u0000\u0000\u00ce\u00d0\u0003\u0014"+
		"\n\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d4\u0001\u0000\u0000\u0000\u00d1\u00d3\u0003\u001c\u000e"+
		"\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u00050\u0000\u0000\u00d8\u00d9\u0005\f\u0000\u0000"+
		"\u00d9\u00da\u0005,\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db"+
		"\u00bd\u0001\u0000\u0000\u0000\u00db\u00c7\u0001\u0000\u0000\u0000\u00dc"+
		"\u0013\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u0017\u0000\u0000\u00de"+
		"\u00df\u00051\u0000\u0000\u00df\u00e0\u0003\u0006\u0003\u0000\u00e0\u00e1"+
		"\u00052\u0000\u0000\u00e1\u0015\u0001\u0000\u0000\u0000\u00e2\u00e3\u0007"+
		"\u0000\u0000\u0000\u00e3\u0017\u0001\u0000\u0000\u0000\u00e4\u00ec\u0003"+
		"\u0016\u000b\u0000\u00e5\u00e6\u00056\u0000\u0000\u00e6\u00e7\u00051\u0000"+
		"\u0000\u00e7\u00e8\u0003\"\u0011\u0000\u00e8\u00e9\u00052\u0000\u0000"+
		"\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00ec\u00056\u0000\u0000\u00eb"+
		"\u00e4\u0001\u0000\u0000\u0000\u00eb\u00e5\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ec\u0019\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0005\u0019\u0000\u0000\u00ee\u00f2\u0005(\u0000\u0000\u00ef\u00f1"+
		"\u0003\u001c\u000e\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f3\u001b\u0001\u0000\u0000\u0000\u00f4\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f5\u014d\u0003\u001e\u000f\u0000\u00f6\u014d"+
		"\u0003\"\u0011\u0000\u00f7\u014d\u0003 \u0010\u0000\u00f8\u00f9\u0005"+
		"\r\u0000\u0000\u00f9\u00fa\u00053\u0000\u0000\u00fa\u00fb\u0003\"\u0011"+
		"\u0000\u00fb\u00fc\u00054\u0000\u0000\u00fc\u0101\u0005/\u0000\u0000\u00fd"+
		"\u0100\u0003\u001c\u000e\u0000\u00fe\u0100\u0003\u000e\u0007\u0000\u00ff"+
		"\u00fd\u0001\u0000\u0000\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100"+
		"\u0103\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0001\u0000\u0000\u0000\u0102\u0104\u0001\u0000\u0000\u0000\u0103"+
		"\u0101\u0001\u0000\u0000\u0000\u0104\u0116\u00050\u0000\u0000\u0105\u010a"+
		"\u0005\u000e\u0000\u0000\u0106\u0107\u00053\u0000\u0000\u0107\u0108\u0003"+
		"\"\u0011\u0000\u0108\u0109\u00054\u0000\u0000\u0109\u010b\u0001\u0000"+
		"\u0000\u0000\u010a\u0106\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u0110\u0005/\u0000"+
		"\u0000\u010d\u010f\u0003\u001c\u000e\u0000\u010e\u010d\u0001\u0000\u0000"+
		"\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0113\u0001\u0000\u0000"+
		"\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0115\u00050\u0000\u0000"+
		"\u0114\u0105\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000"+
		"\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000"+
		"\u0117\u0119\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0005\f\u0000\u0000\u011a\u011b\u0005,\u0000\u0000\u011b"+
		"\u014d\u0001\u0000\u0000\u0000\u011c\u011d\u0005\u000f\u0000\u0000\u011d"+
		"\u011e\u00053\u0000\u0000\u011e\u011f\u0003\"\u0011\u0000\u011f\u0120"+
		"\u00054\u0000\u0000\u0120\u0122\u0005/\u0000\u0000\u0121\u0123\u0003\u001c"+
		"\u000e\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000"+
		"\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u00050\u0000"+
		"\u0000\u0127\u0128\u0005\f\u0000\u0000\u0128\u0129\u0005,\u0000\u0000"+
		"\u0129\u014d\u0001\u0000\u0000\u0000\u012a\u012b\u0005\u0010\u0000\u0000"+
		"\u012b\u012d\u0005/\u0000\u0000\u012c\u012e\u0003\u001c\u000e\u0000\u012d"+
		"\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f"+
		"\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u00050\u0000\u0000\u0132\u0133"+
		"\u0005\u000f\u0000\u0000\u0133\u0134\u00053\u0000\u0000\u0134\u0135\u0003"+
		"\"\u0011\u0000\u0135\u0136\u00054\u0000\u0000\u0136\u0137\u0005,\u0000"+
		"\u0000\u0137\u014d\u0001\u0000\u0000\u0000\u0138\u0139\u0005\u0012\u0000"+
		"\u0000\u0139\u013a\u00053\u0000\u0000\u013a\u013b\u0003\u0006\u0003\u0000"+
		"\u013b\u013c\u0005,\u0000\u0000\u013c\u013d\u0003\"\u0011\u0000\u013d"+
		"\u013e\u0005,\u0000\u0000\u013e\u013f\u0003\u0006\u0003\u0000\u013f\u0140"+
		"\u00054\u0000\u0000\u0140\u0141\u0005/\u0000\u0000\u0141\u0142\u00050"+
		"\u0000\u0000\u0142\u014d\u0001\u0000\u0000\u0000\u0143\u0144\u0005\u0011"+
		"\u0000\u0000\u0144\u014d\u0005,\u0000\u0000\u0145\u0146\u0005\u0013\u0000"+
		"\u0000\u0146\u014d\u0005,\u0000\u0000\u0147\u0149\u0005\u0016\u0000\u0000"+
		"\u0148\u014a\u0003\"\u0011\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b"+
		"\u014d\u0005,\u0000\u0000\u014c\u00f5\u0001\u0000\u0000\u0000\u014c\u00f6"+
		"\u0001\u0000\u0000\u0000\u014c\u00f7\u0001\u0000\u0000\u0000\u014c\u00f8"+
		"\u0001\u0000\u0000\u0000\u014c\u011c\u0001\u0000\u0000\u0000\u014c\u012a"+
		"\u0001\u0000\u0000\u0000\u014c\u0138\u0001\u0000\u0000\u0000\u014c\u0143"+
		"\u0001\u0000\u0000\u0000\u014c\u0145\u0001\u0000\u0000\u0000\u014c\u0147"+
		"\u0001\u0000\u0000\u0000\u014d\u001d\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0005\u001b\u0000\u0000\u014f\u0154\u0003\"\u0011\u0000\u0150\u0151\u0005"+
		"\u001b\u0000\u0000\u0151\u0153\u0003\"\u0011\u0000\u0152\u0150\u0001\u0000"+
		"\u0000\u0000\u0153\u0156\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000"+
		"\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0157\u0001\u0000"+
		"\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0157\u0158\u0005,\u0000"+
		"\u0000\u0158\u001f\u0001\u0000\u0000\u0000\u0159\u015b\u00056\u0000\u0000"+
		"\u015a\u0159\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000"+
		"\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015e\u0005\u001c\u0000\u0000"+
		"\u015d\u015f\u0005,\u0000\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015e"+
		"\u015f\u0001\u0000\u0000\u0000\u015f!\u0001\u0000\u0000\u0000\u0160\u0161"+
		"\u0006\u0011\uffff\uffff\u0000\u0161\u0162\u0005 \u0000\u0000\u0162\u0193"+
		"\u0003\"\u0011\u0012\u0163\u0164\u0005\u0001\u0000\u0000\u0164\u0193\u0003"+
		"\"\u0011\u0011\u0165\u0166\u00053\u0000\u0000\u0166\u0167\u0003\"\u0011"+
		"\u0000\u0167\u0168\u00054\u0000\u0000\u0168\u0193\u0001\u0000\u0000\u0000"+
		"\u0169\u016a\u00056\u0000\u0000\u016a\u0175\u00053\u0000\u0000\u016b\u0170"+
		"\u0003\"\u0011\u0000\u016c\u016d\u0005-\u0000\u0000\u016d\u016f\u0003"+
		"\"\u0011\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016f\u0172\u0001\u0000"+
		"\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000"+
		"\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000"+
		"\u0000\u0000\u0173\u016b\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000"+
		"\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000"+
		"\u0000\u0000\u0176\u0178\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000"+
		"\u0000\u0000\u0178\u0193\u00054\u0000\u0000\u0179\u017a\u00056\u0000\u0000"+
		"\u017a\u017b\u0003\u0016\u000b\u0000\u017b\u0186\u00053\u0000\u0000\u017c"+
		"\u0181\u0003\"\u0011\u0000\u017d\u017e\u0005-\u0000\u0000\u017e\u0180"+
		"\u0003\"\u0011\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u0180\u0183\u0001"+
		"\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001"+
		"\u0000\u0000\u0000\u0182\u0185\u0001\u0000\u0000\u0000\u0183\u0181\u0001"+
		"\u0000\u0000\u0000\u0184\u017c\u0001\u0000\u0000\u0000\u0185\u0188\u0001"+
		"\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0187\u0001"+
		"\u0000\u0000\u0000\u0187\u0189\u0001\u0000\u0000\u0000\u0188\u0186\u0001"+
		"\u0000\u0000\u0000\u0189\u018a\u00054\u0000\u0000\u018a\u0193\u0001\u0000"+
		"\u0000\u0000\u018b\u0193\u0005\u0003\u0000\u0000\u018c\u0193\u0005\u0004"+
		"\u0000\u0000\u018d\u0193\u00056\u0000\u0000\u018e\u0193\u00058\u0000\u0000"+
		"\u018f\u0193\u00057\u0000\u0000\u0190\u0193\u0005:\u0000\u0000\u0191\u0193"+
		"\u00059\u0000\u0000\u0192\u0160\u0001\u0000\u0000\u0000\u0192\u0163\u0001"+
		"\u0000\u0000\u0000\u0192\u0165\u0001\u0000\u0000\u0000\u0192\u0169\u0001"+
		"\u0000\u0000\u0000\u0192\u0179\u0001\u0000\u0000\u0000\u0192\u018b\u0001"+
		"\u0000\u0000\u0000\u0192\u018c\u0001\u0000\u0000\u0000\u0192\u018d\u0001"+
		"\u0000\u0000\u0000\u0192\u018e\u0001\u0000\u0000\u0000\u0192\u018f\u0001"+
		"\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0191\u0001"+
		"\u0000\u0000\u0000\u0193\u01a8\u0001\u0000\u0000\u0000\u0194\u0195\n\u000f"+
		"\u0000\u0000\u0195\u0196\u0007\u0001\u0000\u0000\u0196\u01a7\u0003\"\u0011"+
		"\u0010\u0197\u0198\n\u000e\u0000\u0000\u0198\u0199\u0007\u0002\u0000\u0000"+
		"\u0199\u01a7\u0003\"\u0011\u000f\u019a\u019b\n\r\u0000\u0000\u019b\u019c"+
		"\u0007\u0003\u0000\u0000\u019c\u01a7\u0003\"\u0011\u000e\u019d\u019e\n"+
		"\f\u0000\u0000\u019e\u019f\u0007\u0004\u0000\u0000\u019f\u01a7\u0003\""+
		"\u0011\r\u01a0\u01a1\n\u000b\u0000\u0000\u01a1\u01a2\u0007\u0005\u0000"+
		"\u0000\u01a2\u01a7\u0003\"\u0011\f\u01a3\u01a4\n\n\u0000\u0000\u01a4\u01a5"+
		"\u0007\u0006\u0000\u0000\u01a5\u01a7\u0003\"\u0011\u000b\u01a6\u0194\u0001"+
		"\u0000\u0000\u0000\u01a6\u0197\u0001\u0000\u0000\u0000\u01a6\u019a\u0001"+
		"\u0000\u0000\u0000\u01a6\u019d\u0001\u0000\u0000\u0000\u01a6\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a3\u0001\u0000\u0000\u0000\u01a7\u01aa\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001"+
		"\u0000\u0000\u0000\u01a9#\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000"+
		"\u0000\u0000$%*-8Tjl\u0085\u0092\u00a4\u00b4\u00bb\u00cf\u00d4\u00db\u00eb"+
		"\u00f2\u00ff\u0101\u010a\u0110\u0116\u0124\u012f\u0149\u014c\u0154\u015a"+
		"\u015e\u0170\u0175\u0181\u0186\u0192\u01a6\u01a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}