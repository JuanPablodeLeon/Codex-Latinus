// Generated from /home/juanpa/Documentos/Codex-Latinus/Codex-Latinus/src/main/java/antlr4/com/CodexLatinusGrammar.g4 by ANTLR 4.13.2

    package antlr4.com;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CodexLatinusGrammarParser}.
 */
public interface CodexLatinusGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Programa}
	 * labeled alternative in {@link CodexLatinusGrammarParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(CodexLatinusGrammarParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Programa}
	 * labeled alternative in {@link CodexLatinusGrammarParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(CodexLatinusGrammarParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Programa_Completo}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterPrograma_Completo(CodexLatinusGrammarParser.Programa_CompletoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Programa_Completo}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitPrograma_Completo(CodexLatinusGrammarParser.Programa_CompletoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bloque_Variables}
	 * labeled alternative in {@link CodexLatinusGrammarParser#opcion_val}.
	 * @param ctx the parse tree
	 */
	void enterBloque_Variables(CodexLatinusGrammarParser.Bloque_VariablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bloque_Variables}
	 * labeled alternative in {@link CodexLatinusGrammarParser#opcion_val}.
	 * @param ctx the parse tree
	 */
	void exitBloque_Variables(CodexLatinusGrammarParser.Bloque_VariablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bloque_Funciones}
	 * labeled alternative in {@link CodexLatinusGrammarParser#opcion_func}.
	 * @param ctx the parse tree
	 */
	void enterBloque_Funciones(CodexLatinusGrammarParser.Bloque_FuncionesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bloque_Funciones}
	 * labeled alternative in {@link CodexLatinusGrammarParser#opcion_func}.
	 * @param ctx the parse tree
	 */
	void exitBloque_Funciones(CodexLatinusGrammarParser.Bloque_FuncionesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Funcion_Actio}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_func}.
	 * @param ctx the parse tree
	 */
	void enterFuncion_Actio(CodexLatinusGrammarParser.Funcion_ActioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Funcion_Actio}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_func}.
	 * @param ctx the parse tree
	 */
	void exitFuncion_Actio(CodexLatinusGrammarParser.Funcion_ActioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Funcion_Ratio}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_func}.
	 * @param ctx the parse tree
	 */
	void enterFuncion_Ratio(CodexLatinusGrammarParser.Funcion_RatioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Funcion_Ratio}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_func}.
	 * @param ctx the parse tree
	 */
	void exitFuncion_Ratio(CodexLatinusGrammarParser.Funcion_RatioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bloque_Variables_Funciones}
	 * labeled alternative in {@link CodexLatinusGrammarParser#funcs_val}.
	 * @param ctx the parse tree
	 */
	void enterBloque_Variables_Funciones(CodexLatinusGrammarParser.Bloque_Variables_FuncionesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bloque_Variables_Funciones}
	 * labeled alternative in {@link CodexLatinusGrammarParser#funcs_val}.
	 * @param ctx the parse tree
	 */
	void exitBloque_Variables_Funciones(CodexLatinusGrammarParser.Bloque_Variables_FuncionesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Asignacion}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(CodexLatinusGrammarParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Asignacion}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(CodexLatinusGrammarParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Asignacion_Series}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_Series(CodexLatinusGrammarParser.Asignacion_SeriesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Asignacion_Series}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_Series(CodexLatinusGrammarParser.Asignacion_SeriesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Asignacion_Series_Vacia}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_Series_Vacia(CodexLatinusGrammarParser.Asignacion_Series_VaciaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Asignacion_Series_Vacia}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_Series_Vacia(CodexLatinusGrammarParser.Asignacion_Series_VaciaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Asignacion_Structura}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_Structura(CodexLatinusGrammarParser.Asignacion_StructuraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Asignacion_Structura}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_Structura(CodexLatinusGrammarParser.Asignacion_StructuraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Asignacion_Strucutura_Variable}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_Strucutura_Variable(CodexLatinusGrammarParser.Asignacion_Strucutura_VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Asignacion_Strucutura_Variable}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_Strucutura_Variable(CodexLatinusGrammarParser.Asignacion_Strucutura_VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Asignacion_Valores_Struc_Serie}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_Valores_Struc_Serie(CodexLatinusGrammarParser.Asignacion_Valores_Struc_SerieContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Asignacion_Valores_Struc_Serie}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_Valores_Struc_Serie(CodexLatinusGrammarParser.Asignacion_Valores_Struc_SerieContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bloque_Asignaciones_Vars}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 */
	void enterBloque_Asignaciones_Vars(CodexLatinusGrammarParser.Bloque_Asignaciones_VarsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bloque_Asignaciones_Vars}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 */
	void exitBloque_Asignaciones_Vars(CodexLatinusGrammarParser.Bloque_Asignaciones_VarsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Asignacion_Bool_Inferida}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_Bool_Inferida(CodexLatinusGrammarParser.Asignacion_Bool_InferidaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Asignacion_Bool_Inferida}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_Bool_Inferida(CodexLatinusGrammarParser.Asignacion_Bool_InferidaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Suma_Resta_Auto}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 */
	void enterSuma_Resta_Auto(CodexLatinusGrammarParser.Suma_Resta_AutoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Suma_Resta_Auto}
	 * labeled alternative in {@link CodexLatinusGrammarParser#bloque_vars}.
	 * @param ctx the parse tree
	 */
	void exitSuma_Resta_Auto(CodexLatinusGrammarParser.Suma_Resta_AutoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identificador_Series}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos_series}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador_Series(CodexLatinusGrammarParser.Identificador_SeriesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identificador_Series}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos_series}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador_Series(CodexLatinusGrammarParser.Identificador_SeriesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tipos_Primitivos_Series}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos_series}.
	 * @param ctx the parse tree
	 */
	void enterTipos_Primitivos_Series(CodexLatinusGrammarParser.Tipos_Primitivos_SeriesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tipos_Primitivos_Series}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos_series}.
	 * @param ctx the parse tree
	 */
	void exitTipos_Primitivos_Series(CodexLatinusGrammarParser.Tipos_Primitivos_SeriesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Valores_Structura_Coma}
	 * labeled alternative in {@link CodexLatinusGrammarParser#valores_structura_coma}.
	 * @param ctx the parse tree
	 */
	void enterValores_Structura_Coma(CodexLatinusGrammarParser.Valores_Structura_ComaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Valores_Structura_Coma}
	 * labeled alternative in {@link CodexLatinusGrammarParser#valores_structura_coma}.
	 * @param ctx the parse tree
	 */
	void exitValores_Structura_Coma(CodexLatinusGrammarParser.Valores_Structura_ComaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Valores_Structura_Punto_Coma}
	 * labeled alternative in {@link CodexLatinusGrammarParser#valores_structura_punto_coma}.
	 * @param ctx the parse tree
	 */
	void enterValores_Structura_Punto_Coma(CodexLatinusGrammarParser.Valores_Structura_Punto_ComaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Valores_Structura_Punto_Coma}
	 * labeled alternative in {@link CodexLatinusGrammarParser#valores_structura_punto_coma}.
	 * @param ctx the parse tree
	 */
	void exitValores_Structura_Punto_Coma(CodexLatinusGrammarParser.Valores_Structura_Punto_ComaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Asignacion_Variable_Structura}
	 * labeled alternative in {@link CodexLatinusGrammarParser#asignacion_structura}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_Variable_Structura(CodexLatinusGrammarParser.Asignacion_Variable_StructuraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Asignacion_Variable_Structura}
	 * labeled alternative in {@link CodexLatinusGrammarParser#asignacion_structura}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_Variable_Structura(CodexLatinusGrammarParser.Asignacion_Variable_StructuraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parametros_Funciones}
	 * labeled alternative in {@link CodexLatinusGrammarParser#func_param}.
	 * @param ctx the parse tree
	 */
	void enterParametros_Funciones(CodexLatinusGrammarParser.Parametros_FuncionesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parametros_Funciones}
	 * labeled alternative in {@link CodexLatinusGrammarParser#func_param}.
	 * @param ctx the parse tree
	 */
	void exitParametros_Funciones(CodexLatinusGrammarParser.Parametros_FuncionesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tipos_Primitivos}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos_structura}.
	 * @param ctx the parse tree
	 */
	void enterTipos_Primitivos(CodexLatinusGrammarParser.Tipos_PrimitivosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tipos_Primitivos}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos_structura}.
	 * @param ctx the parse tree
	 */
	void exitTipos_Primitivos(CodexLatinusGrammarParser.Tipos_PrimitivosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TIpo_Series}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos_structura}.
	 * @param ctx the parse tree
	 */
	void enterTIpo_Series(CodexLatinusGrammarParser.TIpo_SeriesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TIpo_Series}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos_structura}.
	 * @param ctx the parse tree
	 */
	void exitTIpo_Series(CodexLatinusGrammarParser.TIpo_SeriesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identificador_Structura}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos_structura}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador_Structura(CodexLatinusGrammarParser.Identificador_StructuraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identificador_Structura}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos_structura}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador_Structura(CodexLatinusGrammarParser.Identificador_StructuraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tipo_Numerus}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos}.
	 * @param ctx the parse tree
	 */
	void enterTipo_Numerus(CodexLatinusGrammarParser.Tipo_NumerusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tipo_Numerus}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos}.
	 * @param ctx the parse tree
	 */
	void exitTipo_Numerus(CodexLatinusGrammarParser.Tipo_NumerusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tipo_Decimalis}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos}.
	 * @param ctx the parse tree
	 */
	void enterTipo_Decimalis(CodexLatinusGrammarParser.Tipo_DecimalisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tipo_Decimalis}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos}.
	 * @param ctx the parse tree
	 */
	void exitTipo_Decimalis(CodexLatinusGrammarParser.Tipo_DecimalisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tipo_Textum}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos}.
	 * @param ctx the parse tree
	 */
	void enterTipo_Textum(CodexLatinusGrammarParser.Tipo_TextumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tipo_Textum}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos}.
	 * @param ctx the parse tree
	 */
	void exitTipo_Textum(CodexLatinusGrammarParser.Tipo_TextumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tipo_Littera}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos}.
	 * @param ctx the parse tree
	 */
	void enterTipo_Littera(CodexLatinusGrammarParser.Tipo_LitteraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tipo_Littera}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos}.
	 * @param ctx the parse tree
	 */
	void exitTipo_Littera(CodexLatinusGrammarParser.Tipo_LitteraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tipo_Bool}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos}.
	 * @param ctx the parse tree
	 */
	void enterTipo_Bool(CodexLatinusGrammarParser.Tipo_BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tipo_Bool}
	 * labeled alternative in {@link CodexLatinusGrammarParser#tipos}.
	 * @param ctx the parse tree
	 */
	void exitTipo_Bool(CodexLatinusGrammarParser.Tipo_BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bloque_Maior}
	 * labeled alternative in {@link CodexLatinusGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void enterBloque_Maior(CodexLatinusGrammarParser.Bloque_MaiorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bloque_Maior}
	 * labeled alternative in {@link CodexLatinusGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void exitBloque_Maior(CodexLatinusGrammarParser.Bloque_MaiorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bloque_Imprimir}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterBloque_Imprimir(CodexLatinusGrammarParser.Bloque_ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bloque_Imprimir}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitBloque_Imprimir(CodexLatinusGrammarParser.Bloque_ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Auto_Instruccion}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterAuto_Instruccion(CodexLatinusGrammarParser.Auto_InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Auto_Instruccion}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitAuto_Instruccion(CodexLatinusGrammarParser.Auto_InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bloque_Expresiones}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterBloque_Expresiones(CodexLatinusGrammarParser.Bloque_ExpresionesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bloque_Expresiones}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitBloque_Expresiones(CodexLatinusGrammarParser.Bloque_ExpresionesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bloque_Leer}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterBloque_Leer(CodexLatinusGrammarParser.Bloque_LeerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bloque_Leer}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitBloque_Leer(CodexLatinusGrammarParser.Bloque_LeerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Llamada_Actio}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_Actio(CodexLatinusGrammarParser.Llamada_ActioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Llamada_Actio}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_Actio(CodexLatinusGrammarParser.Llamada_ActioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Si_Condicional}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterSi_Condicional(CodexLatinusGrammarParser.Si_CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Si_Condicional}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitSi_Condicional(CodexLatinusGrammarParser.Si_CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Dum_Ciclo}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterDum_Ciclo(CodexLatinusGrammarParser.Dum_CicloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Dum_Ciclo}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitDum_Ciclo(CodexLatinusGrammarParser.Dum_CicloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Facere_Ciclo}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterFacere_Ciclo(CodexLatinusGrammarParser.Facere_CicloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Facere_Ciclo}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitFacere_Ciclo(CodexLatinusGrammarParser.Facere_CicloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Per_Ciclo}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterPer_Ciclo(CodexLatinusGrammarParser.Per_CicloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Per_Ciclo}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitPer_Ciclo(CodexLatinusGrammarParser.Per_CicloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Perge_Action}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterPerge_Action(CodexLatinusGrammarParser.Perge_ActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Perge_Action}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitPerge_Action(CodexLatinusGrammarParser.Perge_ActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Interrumpe_Action}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInterrumpe_Action(CodexLatinusGrammarParser.Interrumpe_ActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Interrumpe_Action}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInterrumpe_Action(CodexLatinusGrammarParser.Interrumpe_ActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Reddere_Value}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterReddere_Value(CodexLatinusGrammarParser.Reddere_ValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Reddere_Value}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitReddere_Value(CodexLatinusGrammarParser.Reddere_ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bloque_Asignaciones}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterBloque_Asignaciones(CodexLatinusGrammarParser.Bloque_AsignacionesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bloque_Asignaciones}
	 * labeled alternative in {@link CodexLatinusGrammarParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitBloque_Asignaciones(CodexLatinusGrammarParser.Bloque_AsignacionesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mod_Valor}
	 * labeled alternative in {@link CodexLatinusGrammarParser#asignaciones}.
	 * @param ctx the parse tree
	 */
	void enterMod_Valor(CodexLatinusGrammarParser.Mod_ValorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mod_Valor}
	 * labeled alternative in {@link CodexLatinusGrammarParser#asignaciones}.
	 * @param ctx the parse tree
	 */
	void exitMod_Valor(CodexLatinusGrammarParser.Mod_ValorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mod_Valor_Series}
	 * labeled alternative in {@link CodexLatinusGrammarParser#asignaciones}.
	 * @param ctx the parse tree
	 */
	void enterMod_Valor_Series(CodexLatinusGrammarParser.Mod_Valor_SeriesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mod_Valor_Series}
	 * labeled alternative in {@link CodexLatinusGrammarParser#asignaciones}.
	 * @param ctx the parse tree
	 */
	void exitMod_Valor_Series(CodexLatinusGrammarParser.Mod_Valor_SeriesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mod_Valor_Structura}
	 * labeled alternative in {@link CodexLatinusGrammarParser#asignaciones}.
	 * @param ctx the parse tree
	 */
	void enterMod_Valor_Structura(CodexLatinusGrammarParser.Mod_Valor_StructuraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mod_Valor_Structura}
	 * labeled alternative in {@link CodexLatinusGrammarParser#asignaciones}.
	 * @param ctx the parse tree
	 */
	void exitMod_Valor_Structura(CodexLatinusGrammarParser.Mod_Valor_StructuraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Asignacion_Structura_Series}
	 * labeled alternative in {@link CodexLatinusGrammarParser#asignaciones}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_Structura_Series(CodexLatinusGrammarParser.Asignacion_Structura_SeriesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Asignacion_Structura_Series}
	 * labeled alternative in {@link CodexLatinusGrammarParser#asignaciones}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_Structura_Series(CodexLatinusGrammarParser.Asignacion_Structura_SeriesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Suma_Auto}
	 * labeled alternative in {@link CodexLatinusGrammarParser#ops_automaticas}.
	 * @param ctx the parse tree
	 */
	void enterSuma_Auto(CodexLatinusGrammarParser.Suma_AutoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Suma_Auto}
	 * labeled alternative in {@link CodexLatinusGrammarParser#ops_automaticas}.
	 * @param ctx the parse tree
	 */
	void exitSuma_Auto(CodexLatinusGrammarParser.Suma_AutoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Resta_Auto}
	 * labeled alternative in {@link CodexLatinusGrammarParser#ops_automaticas}.
	 * @param ctx the parse tree
	 */
	void enterResta_Auto(CodexLatinusGrammarParser.Resta_AutoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Resta_Auto}
	 * labeled alternative in {@link CodexLatinusGrammarParser#ops_automaticas}.
	 * @param ctx the parse tree
	 */
	void exitResta_Auto(CodexLatinusGrammarParser.Resta_AutoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Impresion_Consola}
	 * labeled alternative in {@link CodexLatinusGrammarParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterImpresion_Consola(CodexLatinusGrammarParser.Impresion_ConsolaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Impresion_Consola}
	 * labeled alternative in {@link CodexLatinusGrammarParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitImpresion_Consola(CodexLatinusGrammarParser.Impresion_ConsolaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lectura_Texto}
	 * labeled alternative in {@link CodexLatinusGrammarParser#leer_txt}.
	 * @param ctx the parse tree
	 */
	void enterLectura_Texto(CodexLatinusGrammarParser.Lectura_TextoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lectura_Texto}
	 * labeled alternative in {@link CodexLatinusGrammarParser#leer_txt}.
	 * @param ctx the parse tree
	 */
	void exitLectura_Texto(CodexLatinusGrammarParser.Lectura_TextoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(CodexLatinusGrammarParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(CodexLatinusGrammarParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalsusValor}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterFalsusValor(CodexLatinusGrammarParser.FalsusValorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalsusValor}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitFalsusValor(CodexLatinusGrammarParser.FalsusValorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntVal}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterIntVal(CodexLatinusGrammarParser.IntValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntVal}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitIntVal(CodexLatinusGrammarParser.IntValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Llamada_Series_Structura}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_Series_Structura(CodexLatinusGrammarParser.Llamada_Series_StructuraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Llamada_Series_Structura}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_Series_Structura(CodexLatinusGrammarParser.Llamada_Series_StructuraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharVal}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterCharVal(CodexLatinusGrammarParser.CharValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharVal}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitCharVal(CodexLatinusGrammarParser.CharValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumaResta}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterSumaResta(CodexLatinusGrammarParser.SumaRestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumaResta}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitSumaResta(CodexLatinusGrammarParser.SumaRestaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negacion}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterNegacion(CodexLatinusGrammarParser.NegacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negacion}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitNegacion(CodexLatinusGrammarParser.NegacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Llamada_Elemento_Series}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_Elemento_Series(CodexLatinusGrammarParser.Llamada_Elemento_SeriesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Llamada_Elemento_Series}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_Elemento_Series(CodexLatinusGrammarParser.Llamada_Elemento_SeriesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterMultDiv(CodexLatinusGrammarParser.MultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitMultDiv(CodexLatinusGrammarParser.MultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Llamada_Actio_Exp}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_Actio_Exp(CodexLatinusGrammarParser.Llamada_Actio_ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Llamada_Actio_Exp}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_Actio_Exp(CodexLatinusGrammarParser.Llamada_Actio_ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IgualNoIgual}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterIgualNoIgual(CodexLatinusGrammarParser.IgualNoIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IgualNoIgual}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitIgualNoIgual(CodexLatinusGrammarParser.IgualNoIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MenorMayor}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterMenorMayor(CodexLatinusGrammarParser.MenorMayorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MenorMayor}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitMenorMayor(CodexLatinusGrammarParser.MenorMayorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Llamada_Ratio_Tipo}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_Ratio_Tipo(CodexLatinusGrammarParser.Llamada_Ratio_TipoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Llamada_Ratio_Tipo}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_Ratio_Tipo(CodexLatinusGrammarParser.Llamada_Ratio_TipoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleVal}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterDoubleVal(CodexLatinusGrammarParser.DoubleValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleVal}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitDoubleVal(CodexLatinusGrammarParser.DoubleValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Llamada_Propiedad_Structura}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_Propiedad_Structura(CodexLatinusGrammarParser.Llamada_Propiedad_StructuraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Llamada_Propiedad_Structura}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_Propiedad_Structura(CodexLatinusGrammarParser.Llamada_Propiedad_StructuraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringVal}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterStringVal(CodexLatinusGrammarParser.StringValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringVal}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitStringVal(CodexLatinusGrammarParser.StringValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identificador}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(CodexLatinusGrammarParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identificador}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(CodexLatinusGrammarParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MenorMayorIgual}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterMenorMayorIgual(CodexLatinusGrammarParser.MenorMayorIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MenorMayorIgual}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitMenorMayorIgual(CodexLatinusGrammarParser.MenorMayorIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VerumValor}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterVerumValor(CodexLatinusGrammarParser.VerumValorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VerumValor}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitVerumValor(CodexLatinusGrammarParser.VerumValorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndOr}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterAndOr(CodexLatinusGrammarParser.AndOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndOr}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitAndOr(CodexLatinusGrammarParser.AndOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Umenos}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterUmenos(CodexLatinusGrammarParser.UmenosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Umenos}
	 * labeled alternative in {@link CodexLatinusGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitUmenos(CodexLatinusGrammarParser.UmenosContext ctx);
}