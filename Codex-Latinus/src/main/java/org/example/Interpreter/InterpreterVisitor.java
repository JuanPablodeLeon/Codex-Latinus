package org.example.Interpreter;

import antlr4.com.CodexLatinusGrammarBaseVisitor;
import antlr4.com.CodexLatinusGrammarParser;
import org.example.Ast.ASTNode;
import org.example.Ast.exp.*;
import org.example.Ast.stm.*;
import org.example.Interpreter.Transfer.BreakException;
import org.example.Interpreter.Transfer.ContinueException;
import org.example.Interpreter.Transfer.ReturnException;
import org.example.visitor.Visitor;
import org.w3c.dom.ls.LSInput;

import javax.swing.plaf.BorderUIResource;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class InterpreterVisitor implements Visitor<Object> {

    private Enviroment enviroment = new Enviroment(null);
    private Enviroment globalEnv;
    private final Map<String, FuncsStm.Context> funcs = new HashMap<>();

    private Consumer<String> salidaConsumer = System.out::println;
    private Scanner entradaEstandarLazy;
    private Supplier<String> entradaProveedor  = () -> {
        if (entradaEstandarLazy == null){
            entradaEstandarLazy = new Scanner(System.in);
        }
        return entradaEstandarLazy.hasNextLine() ? entradaEstandarLazy.nextLine() : "";
    };

    public void setSalida(Consumer<String> salidaConsumer){
        this.salidaConsumer = salidaConsumer;
    }

    public void setEntrada(Supplier<String> entradaProveedor){
        this.entradaProveedor = entradaProveedor;
    }

    public void ejecutar(Flujo flujo){
        flujo.accept(this);
    }

    @Override
    public Object visit(Flujo.Context context) {
        globalEnv = enviroment;
        for (ASTNode n : context.varsGlb){//visita las variables globales
            n.accept(this);
        }
        for (ASTNode n : context.funcs){ //guarda el nombre de las funciones
            if (n instanceof  FuncsStm){
                FuncsStm.Context fc = new FuncsStm.Context((FuncsStm) n);
                funcs.put(fc.name, fc);
            }
        }
        Enviroment padre = enviroment; //guarda referencia del entorno global
        enviroment = new Enviroment(globalEnv); //crea nuevo entorno con las variables globales guardadas
        for (ASTNode n : context.main){
            n.accept(this);
        }
        enviroment = padre; //regresa al entorno original
        return null;
    }

    @Override
    public Object visit(UMenos.Context context) {
        Object v = context.value.accept(this);
        if (v instanceof Double) return -(Double) v;
        return -toInt(v);
    }

    @Override
    public Object visit(StringLiteral.Context context) {
        return context.value;
    }

    @Override
    public Object visit(NonExp.Context context) {
        return !isVerum(context.value.accept(this));
    }

    @Override
    public Object visit(IntLiteral.Context context) {
        return context.value;
    }

    @Override
    public Object visit(DoubleLiteral.Context context) {
        return context.value;
    }

    @Override
    public Object visit(CharLiteral.Context context) {
        return context.value;
    }

    @Override
    public Object visit(BoolLiteral.Context context) {
        return context.value;
    }

    @Override
    public Object visit(Parentesis.Context context) {
        return context.value.accept(this);
    }

    @Override
    public Object visit(Identificador.Context context) {
        return enviroment.getEnviroment(context.nombre);
    }

    @Override
    public Object visit(AllExpr.Context context) {
        Object left = context.left.accept(this);
        Object right = context.right.accept(this);
        return opsNum(left,context.op, right);
    }

    @Override
    public Object visit(SeriesAccess.Context context) {
        Object[] serie = (Object[]) enviroment.getEnviroment(context.name);
        return serie[toInt(context.index.accept(this))];
    }

    @Override
    public Object visit(SeriesFieldAccess.Context context) {
        Object[] serie = (Object[]) enviroment.getEnviroment(context.nameSeries);
        Map<String, Object> instancia = (Map<String, Object>) serie[toInt(context.index.accept(this))];
        return instancia.get(context.nameField);
    }

    @Override
    public Object visit(StructuraAccess.Context context) {
        Map<String, Object> instancia = (Map<String, Object>) enviroment.getEnviroment(context.nameStruc);
        return instancia.get(context.nameField);
    }

    @Override
    public Object visit(FuncArgsCall.Context context) {
        return executeCall(context.name, context.args);
    }

    @Override
    public Object visit(RatioFuncArgsCall.Context context) {
        return executeCall(context.name, context.args);
    }

    @Override
    public Object visit(SiStm.Context context) {
        if (isVerum(context.condition.accept(this))){
            executeBody(context.bodySi);
            return null;
        }
        for (AliterStm aliter : context.aliterNodes){
            if (aliter.condition == null || isVerum(aliter.condition.accept(this))){
                executeBody(aliter.body);
                return null;
            }
        }
        return null;
    }

    @Override
    public Object visit(FuncsStm.Context context) {
        return null;
    }

    @Override
    public Object visit(AutoOpStm.Context context) {
        Object actual = enviroment.getEnviroment(context.name);
        int delta = context.op.equals("++") ? 1 : -1;
        Object nuevo = actual instanceof Double ? (Double) actual + delta : toInt(actual) + delta;
        enviroment.assing(context.name, nuevo);
        return null;
    }

    @Override
    public Object visit(PerStm.Context context) {
        Enviroment parent = enviroment;
        enviroment = new Enviroment(parent);
        enviroment.setEviroment(context.nameParam, context.initValue.accept(this));
        while (isVerum(context.condition.accept(this))){
            try {
                executeBody(context.body);
            } catch (BreakException b){
                break;
            } catch (ContinueException c){

            }
            context.incrm.accept(this);
        }
        enviroment = parent;
        return null;
    }

    @Override
    public Object visit(FacereStm.Context context) {
        do{
            try {
                executeBody(context.body);
            } catch (BreakException b){
                break;
            } catch (ContinueException c){

            }
        } while (isVerum(context.condition.accept(this)));
        return null;
    }

    @Override
    public Object visit(InterrumpeStm.Context context) {
        throw new ContinueException();
    }

    @Override
    public Object visit(PergeStm.Context context) {
        throw new BreakException();
    }

    @Override
    public Object visit(DumStm.Context context) {
        while (isVerum(context.condition.accept(this))){
            try {
                executeBody(context.body);
            } catch (BreakException b){
                break;
            } catch (ContinueException c){

            }
        }
        return null;
    }

    @Override
    public Object visit(ReddereStm.Context context) {
        Object value = context.expresion != null ? context.expresion.accept(this) : null;
        throw new ReturnException(value);
    }

    @Override
    public Object visit(LeerStm.Context context) {
        String line = entradaProveedor.get();
        if (line == null) line = "";
        if (context.name != null){
            Object actual = enviroment.getEnviroment(context.name);
            enviroment.assing(context.name, convertEntrada(line,actual));
        }
        return null;
    }

    @Override
    public Object visit(ImprStm.Context context) {
        StringBuilder salida = new StringBuilder();
        for (ASTNode e: context.expresions){
            Object value = e.accept(this);
            salida.append(formatear(value));
        }
        salidaConsumer.accept(salida.toString());
        return null;
    }


    @Override
    public Object visit(SeriesAssigVal.Context context) {
        Object[] serie = (Object[]) enviroment.getEnviroment(context.name);
        int index = toInt(context.index.accept(this));
        Object value = context.value.accept(this);
        serie[index] = value;
        return value;
    }

    @Override
    public Object visit(SeriesStrucAssigVal.Context context) {
        Object[] serie = (Object[]) enviroment.getEnviroment(context.nameSeries);
        int index = toInt(context.index.accept(this));
        Map<String, Object> istancia = (Map<String, Object>) serie[index];
        Object value = context.value.accept(this);
        istancia.put(context.nameStruc, value);
        return value;
    }

    @Override
    public Object visit(Asigancion.Context context) {
        Object value = context.value.accept(this);
        enviroment.assing(context.name, value);
        return value;
    }

    @Override
    public Object visit(CallActioStm.Context context) {
        executeCall(context.name, context.args);
        return null;
    }

    @Override
    public Object visit(ValDeclEsto.Context context) {
        enviroment.setEviroment(context.name, context.initValue.accept(this));
        return null;
    }

    @Override
    public Object visit(SeriesDecl.Context context) {
        int size = toInt(context.size.accept(this));
        Object[] serie = new Object[size];
        if (context.initVals != null){
            for (int i = 0; i < context.initVals.size() && i < size; i++) {
                serie[i] = context.initVals.get(i).accept(this);
            }
        } else {
            Object defaultVal = valDefault(context.type);
            for (int i = 0; i < size; i++) {
                serie[i] = defaultVal;
            }
        }
        enviroment.setEviroment(context.name, serie);
        return null;
    }

    @Override
    public Object visit(StructuraAsigField.Context context) {
        Map<String, Object> instancia = (Map<String, Object>) enviroment.getEnviroment(context.nameStruc);
        String field = nameID(context.field);
        Object value = context.value.accept(this);
        instancia.put(field, value);
        return value;
    }

    @Override
    public Object visit(StructuraAsigSeriesVal.Context context) {
        Map<String, Object> contendor = (Map<String, Object>) enviroment.getEnviroment(context.nameStruc);
        Object[] serie = (Object[]) contendor.get(context.nameSeries);
        int index = toInt(context.index.accept(this));
        Map<String, Object> instancia = new LinkedHashMap<>();
        for (StrucFieldInit fi : context.values){
            instancia.put(fi.name, fi.value.accept(this));
        }
        serie[index] = instancia;
        return null;
    }

    @Override
    public Object visit(StrucTypeDecl.Context context) {
        return null;
    }

    @Override
    public Object visit(StrucVarDecl.Context context) {
        Map<String, Object> instancia = new LinkedHashMap<>();
        for (StrucFieldInit fi : context.values){
            instancia.put(fi.name, fi.value.accept(this));
        }
        enviroment.setEviroment(context.name, instancia);
        return null;
    }

    public String formatear(Object value){
        if (value == null) return "";
        if (value instanceof Boolean) return ((Boolean) value) ? "verum": "falsus";
        return String.valueOf(value);
    }

    private Object executeCall(String name, List<ASTNode> args){
        FuncsStm.Context fd = funcs.get(name);
        if (fd == null){
            throw new RuntimeException("Funcion no definida en tiempo de ejecucion: "+name);
        }

        Object[] argsValue = new Object[args.size()];
        for (int i = 0; i < args.size(); i++) {
            argsValue[i] = args.get(i).accept(this);
        }

        Enviroment padre = enviroment;
        enviroment = new Enviroment(globalEnv);
        for (int i = 0; i < fd.params.size(); i++) {
            enviroment.setEviroment(fd.params.get(i).name, argsValue[i]);
        }
        for (ASTNode v : fd.localVars){
            v.accept(this);
        }

        Object resultado = null;
        try {
            for (ASTNode s : fd.body){
                s.accept(this);
            }
        }catch (ReturnException r){
            resultado = r.value;
        } finally {
            enviroment = padre;
        }
        return resultado;
    }

    private int toInt(Object v){
        if (v instanceof Integer) return (Integer) v;
        throw new RuntimeException("Se esperaba un valor de tipo numerus: "+v);
    }

    private double toDouble(Object v){
        if (v instanceof Integer) return (Integer) v;
        if (v instanceof Double) return (Double) v;
        throw new RuntimeException("Se esperaba un valor de tipo decimalis: "+v);
    }

    private boolean isVerum(Object v){
        return v instanceof Boolean && (Boolean) v;
    }

    private Object valDefault(String type){
        switch (type){
            case "numerus": return 0;
            case "decimalis": return 0.0;
            case "textum": return "";
            case "littera": return '\0';
            case "bool": return false;
            default: return null;
        }
    }

    private void executeBody(List<ASTNode> sents){
        Enviroment parent = enviroment;
        enviroment = new Enviroment(parent);
        try {
            for (ASTNode s : sents){
                s.accept(this);
            }
        } finally {
            enviroment = parent;
        }
    }

    private Object convertEntrada(String text, Object valie){
        String t = text.trim();
        try {
            if (valie instanceof Integer) return Integer.parseInt(t);
            if (valie instanceof Double) return Double.parseDouble(t);
            if (valie instanceof Boolean) return t.equals("verum");
            if (valie instanceof Character) return t.isEmpty() ? '\0' : t.charAt(0);
        } catch (NumberFormatException ex){
            throw new RuntimeException("Entrada invalida: valor incomatible con "+valie);
        }
        return text;
    }

    private String nameID(ASTNode n){
        if (n instanceof Identificador){
            return new Identificador.Context((Identificador) n).nombre;
        }
        throw new RuntimeException("Se esperaba un Identificador de Atributo");
    }

    private Object evaluateAllExpr(Object left, String op , Object right){
        switch (op){
            case "+":
                if (left instanceof  String || right instanceof String){
                    return formatear(left)+formatear(right);
                }
                return opsNum(left, op, right);
            case "-":
            case "*":
            case "/":
                return opsNum(left, op, right);
            case "==":
                return sonIguales(left, right);
            case "!=":
                return !sonIguales(left, right);
            case "<":
                return toDouble(left) < toDouble(right);
            case ">":
                return toDouble(left) > toDouble(right);
            case "<=":
                return toDouble(left) <= toDouble(right);
            case ">=":
                return toDouble(left) >= toDouble(right);
            case "&&":
                return isVerum(left) && isVerum(right);
            case "||":
                return isVerum(left) || isVerum(right);
            default:
                throw new RuntimeException("Operador no soportado en tiempo de ejecucion: "+op);
        }
    }

    private boolean sonIguales(Object left, Object right){
        if (left instanceof Number && right instanceof Number){
            return toDouble(left) == toDouble(right);
        }
        return Objects.equals(left, right);
    }

    private Object opsNum(Object left, String op, Object right){
        double aleft = toDouble(left);
        double aright = toDouble(right);
        boolean resultDouble = (left instanceof Double) || (right instanceof Double);
        double rest;
        switch (op){
            case "+": rest = aleft + aright; break;
            case "-": rest = aleft - aright; break;
            case "*": rest = aleft * aright; break;
            case "/": rest = aleft / aright; break;
            default: throw new RuntimeException("Operador no soportado: "+op);
        }
        return resultDouble ? (Object) rest : (Object) (int) rest;
    }
}
