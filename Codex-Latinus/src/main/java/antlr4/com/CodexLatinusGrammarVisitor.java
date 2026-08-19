// Generated from /home/juanpa/Documentos/Codex-Latinus/Codex-Latinus/src/main/java/antlr4/com/CodexLatinusGrammar.g4 by ANTLR 4.13.2

    package antlr4.com;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CodexLatinusGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CodexLatinusGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Programa}
	 * labeled alternative in {@link CodexLatinusGrammarParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(CodexLatinusGrammarParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Programa_Completo}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma_Completo(CodexLatinusGrammarParser.Programa_CompletoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bloque_Variables}
	 * labeled alternative in {@link CodexLatinusGrammarParser#opcion_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_Variables(CodexLatinusGrammarParser.Bloque_VariablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bloque_Funciones}
	 * labeled alternative in {@link CodexLatinusGrammarParser#opcion_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_Funciones(CodexLatinusGrammarParser.Bloque_FuncionesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Funcion_Actio}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion_Actio(CodexLatinusGrammarParser.Funcion_ActioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Funcion_Ratio}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion_Ratio(CodexLatinusGrammarParser.Funcion_RatioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bloque_Variables_Funciones}
	 * labeled alternative in {@link CodexLatinusGrammarParser#funcs_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_Variables_Funciones(CodexLatinusGrammarParser.Bloque_Variables_FuncionesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Asignacion}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(CodexLatinusGrammarParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Asignacion_Series}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_Series(CodexLatinusGrammarParser.Asignacion_SeriesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Asignacion_Series_Vacia}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_Series_Vacia(CodexLatinusGrammarParser.Asignacion_Series_VaciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Asignacion_Structura}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_Structura(CodexLatinusGrammarParser.Asignacion_StructuraContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Asignacion_Strucutura_Variable}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_Strucutura_Variable(CodexLatinusGrammarParser.Asignacion_Strucutura_VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Asignacion_Valores_Struc_Serie}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_Valores_Struc_Serie(CodexLatinusGrammarParser.Asignacion_Valores_Struc_SerieContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bloque_Asignaciones_Vars}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_Asignaciones_Vars(CodexLatinusGrammarParser.Bloque_Asignaciones_VarsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Asignacion_Bool_Inferida}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_Bool_Inferida(CodexLatinusGrammarParser.Asignacion_Bool_InferidaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Suma_Resta_Auto}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma_Resta_Auto(CodexLatinusGrammarParser.Suma_Resta_AutoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identificador_Series}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos_series}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador_Series(CodexLatinusGrammarParser.Identificador_SeriesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tipos_Primitivos_Series}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos_series}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos_Primitivos_Series(CodexLatinusGrammarParser.Tipos_Primitivos_SeriesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Valores_Structura_Coma}
	 * labeled alternative in {@link CodexLatinusGrammarParser#valores_structura_coma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValores_Structura_Coma(CodexLatinusGrammarParser.Valores_Structura_ComaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Valores_Structura_Punto_Coma}
	 * labeled alternative in {@link CodexLatinusGrammarParser#valores_structura_punto_coma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValores_Structura_Punto_Coma(CodexLatinusGrammarParser.Valores_Structura_Punto_ComaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Asignacion_Variable_Structura}
	 * labeled alternative in {@link CodexLatinusGrammarParser#asignacion_structura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_Variable_Structura(CodexLatinusGrammarParser.Asignacion_Variable_StructuraContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parametros_Funciones}
	 * labeled alternative in {@link CodexLatinusGrammarParser#func_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_Funciones(CodexLatinusGrammarParser.Parametros_FuncionesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tipos_Primitivos}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos_structura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos_Primitivos(CodexLatinusGrammarParser.Tipos_PrimitivosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TIpo_Series}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos_structura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTIpo_Series(CodexLatinusGrammarParser.TIpo_SeriesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identificador_Structura}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos_structura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador_Structura(CodexLatinusGrammarParser.Identificador_StructuraContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tipo_Numerus}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_Numerus(CodexLatinusGrammarParser.Tipo_NumerusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tipo_Decimalis}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_Decimalis(CodexLatinusGrammarParser.Tipo_DecimalisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tipo_Textum}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_Textum(CodexLatinusGrammarParser.Tipo_TextumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tipo_Littera}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_Littera(CodexLatinusGrammarParser.Tipo_LitteraContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tipo_Bool}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_Bool(CodexLatinusGrammarParser.Tipo_BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bloque_Maior}
	 * labeled alternative in {@link CodexLatinusGrammarParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_Maior(CodexLatinusGrammarParser.Bloque_MaiorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bloque_Imprimir}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_Imprimir(CodexLatinusGrammarParser.Bloque_ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Auto_Instruccion}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_Instruccion(CodexLatinusGrammarParser.Auto_InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bloque_Expresiones}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_Expresiones(CodexLatinusGrammarParser.Bloque_ExpresionesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bloque_Leer}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_Leer(CodexLatinusGrammarParser.Bloque_LeerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Llamada_Actio}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_Actio(CodexLatinusGrammarParser.Llamada_ActioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Si_Condicional}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi_Condicional(CodexLatinusGrammarParser.Si_CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Dum_Ciclo}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDum_Ciclo(CodexLatinusGrammarParser.Dum_CicloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Facere_Ciclo}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFacere_Ciclo(CodexLatinusGrammarParser.Facere_CicloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Per_Ciclo}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPer_Ciclo(CodexLatinusGrammarParser.Per_CicloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Perge_Action}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerge_Action(CodexLatinusGrammarParser.Perge_ActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Interrumpe_Action}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterrumpe_Action(CodexLatinusGrammarParser.Interrumpe_ActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Reddere_Value}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReddere_Value(CodexLatinusGrammarParser.Reddere_ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bloque_Asignaciones}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_Asignaciones(CodexLatinusGrammarParser.Bloque_AsignacionesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mod_Valor}
	 * labeled alternative in {@link CodexLatinusGrammarParser#asignaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod_Valor(CodexLatinusGrammarParser.Mod_ValorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mod_Valor_Series}
	 * labeled alternative in {@link CodexLatinusGrammarParser#asignaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod_Valor_Series(CodexLatinusGrammarParser.Mod_Valor_SeriesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mod_Valor_Structura}
	 * labeled alternative in {@link CodexLatinusGrammarParser#asignaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod_Valor_Structura(CodexLatinusGrammarParser.Mod_Valor_StructuraContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Asignacion_Structura_Series}
	 * labeled alternative in {@link CodexLatinusGrammarParser#asignaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_Structura_Series(CodexLatinusGrammarParser.Asignacion_Structura_SeriesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Suma_Auto}
	 * labeled alternative in {@link CodexLatinusGrammarParser#ops_automaticas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma_Auto(CodexLatinusGrammarParser.Suma_AutoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Resta_Auto}
	 * labeled alternative in {@link CodexLatinusGrammarParser#ops_automaticas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResta_Auto(CodexLatinusGrammarParser.Resta_AutoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Impresion_Consola}
	 * labeled alternative in {@link CodexLatinusGrammarParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion_Consola(CodexLatinusGrammarParser.Impresion_ConsolaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lectura_Texto}
	 * labeled alternative in {@link CodexLatinusGrammarParser#leer_txt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLectura_Texto(CodexLatinusGrammarParser.Lectura_TextoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(CodexLatinusGrammarParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalsusValor}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalsusValor(CodexLatinusGrammarParser.FalsusValorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntVal}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntVal(CodexLatinusGrammarParser.IntValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Llamada_Series_Structura}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_Series_Structura(CodexLatinusGrammarParser.Llamada_Series_StructuraContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharVal}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharVal(CodexLatinusGrammarParser.CharValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumaResta}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumaResta(CodexLatinusGrammarParser.SumaRestaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negacion}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegacion(CodexLatinusGrammarParser.NegacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Llamada_Elemento_Series}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_Elemento_Series(CodexLatinusGrammarParser.Llamada_Elemento_SeriesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(CodexLatinusGrammarParser.MultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Llamada_Actio_Exp}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_Actio_Exp(CodexLatinusGrammarParser.Llamada_Actio_ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IgualNoIgual}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualNoIgual(CodexLatinusGrammarParser.IgualNoIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MenorMayor}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenorMayor(CodexLatinusGrammarParser.MenorMayorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Llamada_Ratio_Tipo}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_Ratio_Tipo(CodexLatinusGrammarParser.Llamada_Ratio_TipoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleVal}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleVal(CodexLatinusGrammarParser.DoubleValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Llamada_Propiedad_Structura}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_Propiedad_Structura(CodexLatinusGrammarParser.Llamada_Propiedad_StructuraContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringVal}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringVal(CodexLatinusGrammarParser.StringValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identificador}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(CodexLatinusGrammarParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MenorMayorIgual}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenorMayorIgual(CodexLatinusGrammarParser.MenorMayorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VerumValor}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerumValor(CodexLatinusGrammarParser.VerumValorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndOr}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOr(CodexLatinusGrammarParser.AndOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Umenos}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUmenos(CodexLatinusGrammarParser.UmenosContext ctx);
}