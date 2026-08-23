package org.example.visitor;

import antlr4.com.CodexLatinusGrammarBaseVisitor;
import antlr4.com.CodexLatinusGrammarParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.example.Ast.ASTNode;
import org.example.Ast.exp.FuncArgsCall;
import org.example.Ast.stm.Flujo;
import org.example.Ast.stm.FuncsStm;
import org.example.Ast.stm.Params;
import org.example.Ast.stm.ValDeclEsto;

import java.util.ArrayList;
import java.util.List;

public class BuilderVisitor extends CodexLatinusGrammarBaseVisitor<ASTNode> {

    //INicializa el programa
    @Override public ASTNode visitPrograma(CodexLatinusGrammarParser.ProgramaContext ctx) {
        if (ctx.instrucciones() == null) return new Flujo(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), line(ctx));

        return visit(ctx.instrucciones());
    }

    //Visita los bloques en caso de tener contenido
    @Override public ASTNode visitPrograma_Completo(CodexLatinusGrammarParser.Programa_CompletoContext ctx) {
        List<ASTNode> varsGlb = new ArrayList<>();
        if (ctx.opcion_val() != null){
            CodexLatinusGrammarParser.Bloque_VariablesContext bv = (CodexLatinusGrammarParser.Bloque_VariablesContext) ctx.opcion_val();
            for (CodexLatinusGrammarParser.Bloque_varsContext b : bv.bloque_vars()){
                varsGlb.add(visit(b));
            }
        }

        List<ASTNode> funcs = new ArrayList<>();
        if (ctx.opcion_func() != null){
            CodexLatinusGrammarParser.Bloque_FuncionesContext bf = (CodexLatinusGrammarParser.Bloque_FuncionesContext) ctx.opcion_func();
            for (CodexLatinusGrammarParser.Bloque_funcContext f : bf.bloque_func()){
                funcs.add(visit(f));
            }
        }

        List<ASTNode> main = new ArrayList<>();
        CodexLatinusGrammarParser.Bloque_MaiorContext bm = (CodexLatinusGrammarParser.Bloque_MaiorContext) ctx.main();
        for (CodexLatinusGrammarParser.InstruccionContext i : bm.instruccion()){
            main.add(visit(i));
        }

        return new Flujo(varsGlb, funcs, main, line(ctx));
    }

    // Actio y Ratio misma estructura, diferencia uno devuelve un valor y el otro no

    @Override public ASTNode visitFuncion_Actio(CodexLatinusGrammarParser.Funcion_ActioContext ctx) {
        String name = ctx.ID().getText(); // id de la funcion

        List<Params> params = getParams(ctx.func_param());
        List<ASTNode> localVars = getLocalVars(ctx.funcs_val());
        List<ASTNode> body = new ArrayList<>();

        for (CodexLatinusGrammarParser.InstruccionContext i : ctx.instruccion()){
            body.add(visit(i));
        }
        //Se agrega null ya que no devuelve ninguna valor
        return new FuncsStm(name, null, params, localVars, body, line(ctx));
    }


    @Override public ASTNode visitFuncion_Ratio(CodexLatinusGrammarParser.Funcion_RatioContext ctx) {
        String name = ctx.ID().getText();
        String type = ctx.tipos().getText(); //tipo de retorno de la funcion

        List<Params> params = getParams(ctx.func_param());
        List<ASTNode> localVars = getLocalVars(ctx.funcs_val());
        List<ASTNode> body = new ArrayList<>();

        for (CodexLatinusGrammarParser.InstruccionContext i : ctx.instruccion()){
            body.add(visit(i));
        }

        return new FuncsStm(name, type, params, localVars, body, line(ctx));
    }

    // Crear una variable con valor definido
    @Override public ASTNode visitAsignacion(CodexLatinusGrammarParser.AsignacionContext ctx) {
        String name = ctx.ID().getText();
        String type = ctx.tipos().getText();
        ASTNode value = visit(ctx.expresion());
        return new ValDeclEsto(name,type,value, false, line(ctx));
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitAsignacion_Series(CodexLatinusGrammarParser.Asignacion_SeriesContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitAsignacion_Series_Vacia(CodexLatinusGrammarParser.Asignacion_Series_VaciaContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitAsignacion_Structura(CodexLatinusGrammarParser.Asignacion_StructuraContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitAsignacion_Strucutura_Variable(CodexLatinusGrammarParser.Asignacion_Strucutura_VariableContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitAsignacion_Valores_Struc_Serie(CodexLatinusGrammarParser.Asignacion_Valores_Struc_SerieContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitBloque_Asignaciones_Vars(CodexLatinusGrammarParser.Bloque_Asignaciones_VarsContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitAsignacion_Bool_Inferida(CodexLatinusGrammarParser.Asignacion_Bool_InferidaContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitSuma_Resta_Auto(CodexLatinusGrammarParser.Suma_Resta_AutoContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitIdentificador_Series(CodexLatinusGrammarParser.Identificador_SeriesContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitTipos_Primitivos_Series(CodexLatinusGrammarParser.Tipos_Primitivos_SeriesContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitValores_Structura_Coma(CodexLatinusGrammarParser.Valores_Structura_ComaContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitValores_Structura_Punto_Coma(CodexLatinusGrammarParser.Valores_Structura_Punto_ComaContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitAsignacion_Variable_Structura(CodexLatinusGrammarParser.Asignacion_Variable_StructuraContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitParametros_Funciones(CodexLatinusGrammarParser.Parametros_FuncionesContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitTipos_Primitivos(CodexLatinusGrammarParser.Tipos_PrimitivosContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitTIpo_Series(CodexLatinusGrammarParser.TIpo_SeriesContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitIdentificador_Structura(CodexLatinusGrammarParser.Identificador_StructuraContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitTipo_Numerus(CodexLatinusGrammarParser.Tipo_NumerusContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitTipo_Decimalis(CodexLatinusGrammarParser.Tipo_DecimalisContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitTipo_Textum(CodexLatinusGrammarParser.Tipo_TextumContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitTipo_Littera(CodexLatinusGrammarParser.Tipo_LitteraContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitTipo_Bool(CodexLatinusGrammarParser.Tipo_BoolContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitBloque_Maior(CodexLatinusGrammarParser.Bloque_MaiorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitBloque_Imprimir(CodexLatinusGrammarParser.Bloque_ImprimirContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitAuto_Instruccion(CodexLatinusGrammarParser.Auto_InstruccionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitBloque_Expresiones(CodexLatinusGrammarParser.Bloque_ExpresionesContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitBloque_Leer(CodexLatinusGrammarParser.Bloque_LeerContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitLlamada_Actio(CodexLatinusGrammarParser.Llamada_ActioContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitSi_Condicional(CodexLatinusGrammarParser.Si_CondicionalContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitDum_Ciclo(CodexLatinusGrammarParser.Dum_CicloContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitFacere_Ciclo(CodexLatinusGrammarParser.Facere_CicloContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitPer_Ciclo(CodexLatinusGrammarParser.Per_CicloContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitPerge_Action(CodexLatinusGrammarParser.Perge_ActionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitInterrumpe_Action(CodexLatinusGrammarParser.Interrumpe_ActionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitReddere_Value(CodexLatinusGrammarParser.Reddere_ValueContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitBloque_Asignaciones(CodexLatinusGrammarParser.Bloque_AsignacionesContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitMod_Valor(CodexLatinusGrammarParser.Mod_ValorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitMod_Valor_Series(CodexLatinusGrammarParser.Mod_Valor_SeriesContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitMod_Valor_Structura(CodexLatinusGrammarParser.Mod_Valor_StructuraContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitAsignacion_Structura_Series(CodexLatinusGrammarParser.Asignacion_Structura_SeriesContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitSuma_Auto(CodexLatinusGrammarParser.Suma_AutoContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitResta_Auto(CodexLatinusGrammarParser.Resta_AutoContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitImpresion_Consola(CodexLatinusGrammarParser.Impresion_ConsolaContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitLectura_Texto(CodexLatinusGrammarParser.Lectura_TextoContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitParentesis(CodexLatinusGrammarParser.ParentesisContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitFalsusValor(CodexLatinusGrammarParser.FalsusValorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitIntVal(CodexLatinusGrammarParser.IntValContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitLlamada_Series_Structura(CodexLatinusGrammarParser.Llamada_Series_StructuraContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitCharVal(CodexLatinusGrammarParser.CharValContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitSumaResta(CodexLatinusGrammarParser.SumaRestaContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitNegacion(CodexLatinusGrammarParser.NegacionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitLlamada_Elemento_Series(CodexLatinusGrammarParser.Llamada_Elemento_SeriesContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitMultDiv(CodexLatinusGrammarParser.MultDivContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitLlamada_Actio_Exp(CodexLatinusGrammarParser.Llamada_Actio_ExpContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitIgualNoIgual(CodexLatinusGrammarParser.IgualNoIgualContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitMenorMayor(CodexLatinusGrammarParser.MenorMayorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitLlamada_Ratio_Tipo(CodexLatinusGrammarParser.Llamada_Ratio_TipoContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitDoubleVal(CodexLatinusGrammarParser.DoubleValContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitLlamada_Propiedad_Structura(CodexLatinusGrammarParser.Llamada_Propiedad_StructuraContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitStringVal(CodexLatinusGrammarParser.StringValContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitIdentificador(CodexLatinusGrammarParser.IdentificadorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitMenorMayorIgual(CodexLatinusGrammarParser.MenorMayorIgualContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitVerumValor(CodexLatinusGrammarParser.VerumValorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitAndOr(CodexLatinusGrammarParser.AndOrContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ASTNode visitUmenos(CodexLatinusGrammarParser.UmenosContext ctx) { return visitChildren(ctx); }

    //Metodo para obtener la linea por medio del parser
    private int line(ParserRuleContext context){
        return context.getStart().getLine();
    }

    private List<Params> getParams(CodexLatinusGrammarParser.Func_paramContext fp){
        List<Params> resultado = new ArrayList<>();

        if (fp == null) return resultado;

        CodexLatinusGrammarParser.Parametros_FuncionesContext pc = (CodexLatinusGrammarParser.Parametros_FuncionesContext) fp;
        List<TerminalNode> ids = pc.ID();
        List<CodexLatinusGrammarParser.TiposContext> types = pc.tipos();
        for (int i = 0; i < ids.size(); i++) {
            resultado.add(new Params(ids.get(i).getText(), types.get(i).getText()));
        }
        return resultado;
    }

    //Ver y obtener todas las variables
    private List<ASTNode> getLocalVars(CodexLatinusGrammarParser.Funcs_valContext fv){
        List<ASTNode> reultado = new ArrayList<>();
        if (fv == null) return reultado;

        CodexLatinusGrammarParser.Bloque_Variables_FuncionesContext bc = (CodexLatinusGrammarParser.Bloque_Variables_FuncionesContext) fv;
        for (CodexLatinusGrammarParser.Bloque_varsContext b : bc.bloque_vars()){
            reultado.add(visit(b));
        }
        return reultado;
    }

    private String procesarStr(String texto){
        String mod = texto.substring(1, texto.length()-1);
        return mod.replace("\\\"", "\"").replace("\\\\", "\\");
    }
}
