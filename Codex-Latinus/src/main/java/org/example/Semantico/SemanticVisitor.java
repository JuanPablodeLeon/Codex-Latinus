package org.example.Semantico;

import org.example.Ast.ASTNode;
import org.example.Ast.exp.*;
import org.example.Ast.stm.*;
import org.example.Interpreter.Reports.ErrorLatinus;
import org.example.Interpreter.Reports.ErrorReporter;
import org.example.visitor.Visitor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Implementa las funcionalidades semanticas recorriendo el AST
public class SemanticVisitor implements Visitor<Tipos> {
    private final SymbolTable table = new SymbolTable();
    private final ErrorReporter errores;
    private FuncSymbol actualFunc; //se vuelve null para el maior
    private int profciclo = 0;

    @Override
    public Tipos visit(Flujo.Context context) {
        for (ASTNode n : context.varsGlb) n.accept(this);

        for (ASTNode n : context.funcs){
            if (n instanceof FuncsStm) setSignFunc((FuncsStm) n);
        }

        actualFunc = null;
        table.enterScope("main");
        procesarBody(context.main);
        table.exitScope();
        return Tipos.VOID;
    }

    public SemanticVisitor(ErrorReporter errores){
        this.errores = errores;
    }
    public SymbolTable getTable(){
        return  table;
    }

    public void analize(Flujo flujo){
        flujo.accept(this);
    }

    @Override
    public Tipos visit(UMenos.Context context) {
        Tipos t = context.value.accept(this);
        if (!t.isNumber() && !t.isError()){
            errores.semantico(context.line, "El operador '-' solo aplica para numerus/decimalis");
            return Tipos.ERROR;
        }
        return t;
    }

    @Override
    public Tipos visit(StringLiteral.Context context) {
        return Tipos.TEXTUM;
    }

    @Override
    public Tipos visit(NonExp.Context context) {
        Tipos t = context.value.accept(this);
        if (!t.equals(Tipos.BOOL) && !t.isError()){
            errores.semantico(context.line, "La palabra 'non' solo aplica para tipo bool");
        }
        return Tipos.BOOL;
    }

    @Override
    public Tipos visit(IntLiteral.Context context) {
        return Tipos.NUMERUS;
    }

    @Override
    public Tipos visit(DoubleLiteral.Context context) {
        return Tipos.DECIMALIS;
    }

    @Override
    public Tipos visit(CharLiteral.Context context) {
        return Tipos.LITTERA;
    }

    @Override
    public Tipos visit(BoolLiteral.Context context) {
        return Tipos.BOOL;
    }

    @Override
    public Tipos visit(Parentesis.Context context) {
        return context.value.accept(this);
    }

    @Override
    public Tipos visit(Identificador.Context context) {
        VarSymbol vs = table.getVar(context.nombre);
        if (vs == null){
            errores.semantico(context.line, "La variable no ha sido declarada: "+context.nombre);
            return  Tipos.ERROR;
        }
        return vs.type;
    }

    @Override
    public Tipos visit(AllExpr.Context context) {
        Tipos left = context.left.accept(this);
        Tipos right = context.right.accept(this);
        String op = context.op;
        if (left.isError() || right.isError()) return Tipos.ERROR;

        switch (op){
            case "+":
                if (left.tb == Tipos.TiposBase.TEXTUM || right.tb == Tipos.TiposBase.TEXTUM){
                    if (!left.isPrimivite() || !right.isPrimivite()){
                        errores.semantico(context.line, "No se pude concatenar un serie o structura con textum");
                        return Tipos.ERROR;
                    }
                }
                if (!left.isPrimivite() || !right.isPrimivite()){
                    errores.semantico(context.line, "El operador '+' solo es para tipos primitivos");
                    return Tipos.ERROR;
                }
                return Tipos.typeResult(left,right);
            case "-":
            case "*":
            case "/":
                if (left.tb == Tipos.TiposBase.TEXTUM || right.tb == Tipos.TiposBase.TEXTUM){
                    errores.semantico(context.line, "El operador '"+op+"' no es compatible con tipo textum");
                    return Tipos.ERROR;
                }
                if (!left.isPrimivite() || !right.isPrimivite()){
                    errores.semantico(context.line, "El operador '"+op+"' solo es para tipos primitivos");
                    return Tipos.ERROR;
                }
                return Tipos.typeResult(left, right);
            case "==":
            case "!=":
                if (!left.isPrimivite() || !right.isPrimivite()){
                    errores.semantico(context.line, "El operador '"+op+"' solo es para tipos primitivos");
                } else if ((left.tb == Tipos.TiposBase.TEXTUM) != (right.tb == Tipos.TiposBase.TEXTUM)) {
                    errores.semantico(context.line, "Unicamente se pueden comparatar textum con textum");
                }
                return Tipos.BOOL;
            case "<":
            case ">":
            case "<=":
            case ">=":
                if (left.tb == Tipos.TiposBase.TEXTUM || right.tb == Tipos.TiposBase.TEXTUM || !left.isPrimivite() || !right.isPrimivite()){
                    errores.semantico(context.line, "El operador '"+op+"' mno aplica para textum, serie o structura");
                }
                return Tipos.BOOL;
            case "&&":
            case "||":
                if (!left.equals(Tipos.BOOL) || !right.equals(Tipos.BOOL)){
                    errores.semantico(context.line, "El operador '"+op+"' unicamente validos para tipo bool");
                }
                return Tipos.BOOL;
            default:
                return Tipos.ERROR;
        }
    }

    @Override
    public Tipos visit(SeriesAccess.Context context) {
        VarSymbol vs = table.getVar(context.name);
        Tipos idType = context.index.accept(this);
        if (idType.tb != Tipos.TiposBase.NUMERUS && !idType.isError()){
            errores.semantico(context.line, "El indice de serie debe de ser de tipo numerus");
        }
        if (vs == null){
            errores.semantico(context.line, "La variable no ha sido declarada: "+context.name);
            return Tipos.ERROR;
        }
        if (vs.type.tb != Tipos.TiposBase.SERIRES){
            errores.semantico(context.line, "La variable no es una serie: "+context.name);
            return Tipos.ERROR;
        }
        Integer idConst = evaluateConstNumerus(context.index);
        if (idConst != null && vs.sizeSeries != null && (idConst < 0 || idConst >= vs.sizeSeries)){
            errores.semantico(context.line, "Indice fuera de rango: "+idConst);
        }
        return vs.type.elemnts;
    }

    @Override
    public Tipos visit(SeriesFieldAccess.Context context) {
        VarSymbol vs = table.getVar(context.nameSeries);
        Tipos idType = context.index.accept(this);
        if (idType.tb != Tipos.TiposBase.NUMERUS && !idType.isError()){
            errores.semantico(context.line, "El indice de serie debe de ser de tipo numerus");
        }
        if (vs == null){
            errores.semantico(context.line, "La variable no ha sido declarada: "+context.nameSeries);
            return Tipos.ERROR;
        }
        if (vs.type.tb != Tipos.TiposBase.SERIRES || vs.type.elemnts.tb != Tipos.TiposBase.STRUCT){
            errores.semantico(context.line, "No es un serie de structura: "+vs.type.elemnts);
            return Tipos.ERROR;
        }
        StructSymbol s = table.getStructura(vs.type.elemnts.nameStruc);
        if (s == null || !s.hasField(context.nameField)){
            errores.semantico(context.line, "La structura no tiene el atributo: "+vs.type.elemnts+" <-> "+context.nameField);
            return Tipos.ERROR;
        }
        return s.fieldsType(context.nameField);
    }

    @Override
    public Tipos visit(StructuraAccess.Context context) {
        VarSymbol vs = table.getVar(context.nameStruc);
        if (vs == null){
            errores.semantico(context.line, "La variable no ha sido declarada: "+context.nameField);
            return Tipos.ERROR;
        }
        if (vs.type.tb != Tipos.TiposBase.STRUCT){
            errores.semantico(context.line, "No es una variable de tipo structura: "+context.nameField);
            return Tipos.ERROR;
        }
        StructSymbol s = table.getStructura(vs.type.nameStruc);
        if (s == null || !s.hasField(context.nameField)){
            errores.semantico(context.line, "La structura: "+vs.type+" no tiene el atributo: "+context.nameField);
            return Tipos.ERROR;
        }
        return s.fieldsType(context.nameField);
    }

    @Override
    public Tipos visit(FuncArgsCall.Context context) {
        return validateCall(context.name, context.args, context.line);
    }

    @Override
    public Tipos visit(RatioFuncArgsCall.Context context) {
        Tipos declarado = getType(context.type, context.line);
        Tipos real = validateCall(context.name, context.args, context.line);
        if (!declarado.isError() && !real.isError() && !declarado.equals(real)){
            errores.semantico(context.line, "La funcion -> "+context.name+" debe de retornar: "+real);
        }
        return real.isError() ? declarado : real;
    }

    @Override
    public Tipos visit(SiStm.Context context) {
        exigirBool(context.condition.accept(this), context.line, "si");
        table.enterScope("si");
        procesarBody(context.bodySi);
        table.exitScope();
        for (AliterStm aliter : context.aliterNodes){
            if (aliter.condition != null){
                exigirBool(aliter.condition.accept(this), context.line, "aliter");
            }
            table.enterScope("aliter");
            procesarBody(aliter.body);
            table.exitScope();
        }
        return Tipos.VOID;
    }

    @Override
    public Tipos visit(FuncsStm.Context context) {
        FuncSymbol fs = table.getFunc(context.name);
        if (fs == null){
            fs = new FuncSymbol(context.name, context.line, Tipos.VOID, new ArrayList<>(), new ArrayList<>());
        }
        FuncSymbol prev = actualFunc;
        actualFunc = fs;
        int prevCiclo = profciclo;
        profciclo = 0;

        table.enterScope("function: "+context.name);
        for (int i = 0; i < context.params.size(); i++) {
            Params p = context.params.get(i);
            Tipos t = i < fs.typesParams.size() ? fs.typesParams.get(i) : Tipos.ERROR;
            if (table.existLocalVar(p.name)){
                errores.semantico(context.line, "Parametro ya declarado: "+p.name);
            } else {
                table.setVar(new VarSymbol(p.name, context.line, t));
            }
        }

        for (ASTNode v : context.localVars){
            v.accept(this);
        }

        procesarBody(context.body);
        boolean returnSiempre = siempreRetorna(context.body);
        if (fs.typeReddere.tb != Tipos.TiposBase.VOID && !returnSiempre){
            errores.semantico(context.line, "La funcion: "+context.name+" le falta un reddere");
        }

        table.exitScope();
        profciclo = prevCiclo;
        actualFunc = prev;
        return Tipos.VOID;
    }

    @Override
    public Tipos visit(AutoOpStm.Context context) {
        VarSymbol vs = table.getVar(context.name);
        if (vs == null){
            errores.semantico(context.line, "La variable no ha sido declarada: "+context.name);
            return Tipos.ERROR;
        } if (!vs.type.isNumber()){
            errores.semantico(context.line, "El operador no aplica para incremento/decremento: "+context.op);
        }
        return vs.type;
    }

    @Override
    public Tipos visit(PerStm.Context context) {
        table.enterScope("per");
        Tipos iteratorType = getType(context.typeParam, context.line);
        Tipos initType = context.initValue.accept(this);
        if (!iteratorType.isError() && !initType.isError() && !Tipos.isAssigImpl(iteratorType, initType)){
            errores.semantico(context.line, "El valor del iterador: "+context.nameParam+" no es compatible con: "+iteratorType);
        }
        table.setVar(new VarSymbol(context.nameParam, context.line, iteratorType));
        exigirBool(context.condition.accept(this), context.line, "per");
        context.incrm.accept(this);

        profciclo++;
        table.enterScope("per_body");
        procesarBody(context.body);
        table.exitScope();
        profciclo--;
        table.exitScope();
        return Tipos.VOID;
    }

    @Override
    public Tipos visit(FacereStm.Context context) {
        profciclo++;
        table.enterScope("facere");
        procesarBody(context.body);
        table.exitScope();
        profciclo--;
        exigirBool(context.condition.accept(this), context.line, "facere ... dum");
        return Tipos.VOID;
    }

    @Override
    public Tipos visit(InterrumpeStm.Context context) {
        if (profciclo == 0){
            errores.semantico(context.line, "Interrumpe usado fuera de los Cilos");
        }
        return Tipos.VOID;
    }

    @Override
    public Tipos visit(PergeStm.Context context) {
        if (profciclo == 0){
            errores.semantico(context.line, "Perge usado fuera de los Cilos");
        }
        return Tipos.VOID;
    }

    @Override
    public Tipos visit(DumStm.Context context) {
        exigirBool(context.condition.accept(this), context.line, "dum");
        profciclo++;
        table.enterScope("dum");
        procesarBody(context.body);
        table.exitScope();
        profciclo--;
        return Tipos.VOID;
    }

    @Override
    public Tipos visit(ReddereStm.Context context) {
        if (actualFunc == null){
            errores.semantico(context.line, "Reddere usado fuera de Ratio");
            if (context.expresion != null) context.expresion.accept(this);
            return Tipos.VOID;
        }
        Tipos esperado = actualFunc.typeReddere;
        if (context.expresion == null){
            if (esperado.tb != Tipos.TiposBase.VOID){
                errores.semantico(context.line, "La funcion Ratio debe de devolver un valor de tipo: "+esperado);
            }
        } else {
            Tipos real = context.expresion.accept(this);
            if (esperado.tb == Tipos.TiposBase.VOID){
                errores.semantico(context.line, "La funcion es de tipo Actio y no puede retornar valores: "+actualFunc.name);
            } else if (!esperado.isError() && !real.isError() && !Tipos.isAssigImpl(esperado, real)) {
                errores.semantico(context.line, "El valor a retornar no es del mismo tipo que el de la funcion");
            }
        }
        return Tipos.VOID;
    }

    @Override
    public Tipos visit(LeerStm.Context context) {
        if (context.name != null){
            VarSymbol vs = table.getVar(context.name);
            if (vs == null){
                errores.semantico(context.line, "La variable no ha sido declarada: "+context.name);
            } else if (!vs.type.isPrimivite()) {
                errores.semantico(context.line, "No se puede leer la variable primitiva");
            }
        }
        return Tipos.VOID;
    }

    @Override
    public Tipos visit(ImprStm.Context context) {
        for (ASTNode e : context.expresions){
            Tipos t = e.accept(this);
            if (t.tb == Tipos.TiposBase.SERIRES || t.tb == Tipos.TiposBase.STRUCT){
                errores.semantico(context.line, "No se puede imprimir un serie/structura directo");
            }
        }
        return Tipos.VOID;
    }


    @Override
    public Tipos visit(SeriesAssigVal.Context context) {
        VarSymbol vs = table.getVar(context.name);
        Tipos idTypes = context.index.accept(this);
        if (idTypes.tb != Tipos.TiposBase.NUMERUS && !idTypes.isError()){
            errores.semantico(context.line, "El indice debe de ser de tipo numerus");
        }
        Tipos real = context.value.accept(this);
        if (vs == null){
            errores.semantico(context.line, "La variable no ha sido declarada: "+context.name);
            return Tipos.ERROR;
        }
        if (vs.type.tb != Tipos.TiposBase.SERIRES){
            errores.semantico(context.line, "No es de tipo series: "+context.name);
            return Tipos.ERROR;
        }
        Integer idConst = evaluateConstNumerus(context.index);
        if (idConst != null && vs.sizeSeries != null && (idConst < 0 || idConst >= vs.sizeSeries)){
            errores.semantico(context.line, "Indice fuera de rango: "+idConst);
        }
        Tipos elemento = vs.type.elemnts;
        if (!elemento.isError() && !real.isError() && !Tipos.isAssigImpl(elemento, real)){
            errores.semantico(context.line, "No se puede asignar un valor de tipo: "+real+" a la serie: "+context.name);
        }
        return elemento;
    }

    @Override
    public Tipos visit(SeriesStrucAssigVal.Context context) {
        VarSymbol vs = table.getVar(context.nameSeries);
        Tipos idType = context.index.accept(this);
        if (idType.tb != Tipos.TiposBase.NUMERUS && !idType.isError()){
            errores.semantico(context.line, "Eñ indice de la serie debe de ser de tipo numerus");
        }
        Tipos real = context.value.accept(this);
        if (vs == null){
            errores.semantico(context.line, "La variable no ha sido declarada: "+context.nameSeries);
            return Tipos.ERROR;
        }
        if (vs.type.tb != Tipos.TiposBase.SERIRES || vs.type.elemnts.tb != Tipos.TiposBase.STRUCT){
            errores.semantico(context.line, "No es una serie de la structura: "+context.nameSeries);
            return Tipos.ERROR;
        }
        StructSymbol s = table.getStructura(vs.type.elemnts.nameStruc);
        if (s == null || !s.hasField(context.nameStruc)){
            errores.semantico(context.line, "La structura: "+vs.type.elemnts+" no tiene el atributo: "+context.nameStruc);
            return Tipos.ERROR;
        }
        Tipos esperado = s.fieldsType(context.nameStruc);
        if (!esperado.isError() && !real.isError() && !Tipos.isAssigImpl(esperado, real)){
            errores.semantico(context.line, "No se pude asignar un valor de tipo: "+real+" al atributo: "+context.nameStruc);
        }
        return esperado;
    }

    @Override
    public Tipos visit(Asigancion.Context context) {
        VarSymbol vs = table.getVar(context.name);
        Tipos real = context.value.accept(this);
        if (vs == null){
            errores.semantico(context.line, "La variable no ha sido declarada: "+context.name);
            return Tipos.ERROR;
        }
        if (!vs.type.isError() && !real.isError() && !Tipos.isAssigImpl(vs.type, real)){
            errores.semantico(context.line, "Valores no son compatibles: "+real+" <-> "+vs.type);
        }
        return vs.type;
    }

    @Override
    public Tipos visit(CallActioStm.Context context) {
        validateCall(context.name, context.args, context.line);
        return Tipos.VOID;
    }

    @Override
    public Tipos visit(ValDeclEsto.Context context) {
        if (table.existLocalVar(context.name)){
            errores.semantico(context.line, "Variable ya declarada: "+context.name);
        }
        Tipos declarado;
        if (context.typeInf){
            Tipos real = context.initValue.accept(this);
            if (!real.equals(Tipos.BOOL) && !real.isError()){
                errores.semantico(context.line, "Debe de ser tipo bool: "+real);
            }
            declarado = Tipos.BOOL;
        } else {
            declarado = getType(context.type, context.line);
            Tipos real = context.initValue.accept(this);
            if (!declarado.isError() && !real.isError() && !Tipos.isAssigImpl(declarado, real)){
                errores.semantico(context.line, "El tipo: "+real+" no es compatible con : "+context.name);
            }
        }
        table.setVar(new VarSymbol(context.name, context.line, declarado));

        return declarado;
    }

    @Override
    public Tipos visit(SeriesDecl.Context context) {
        if (table.existLocalVar(context.name)){
            errores.semantico(context.line, "La variable ya fue declarada: "+context.name);
        }
        Tipos elemento = getType(context.type, context.line);
        Tipos tipoSize = context.size.accept(this);
        if (tipoSize.tb != Tipos.TiposBase.NUMERUS && !tipoSize.isError()){
            errores.semantico(context.line, "El tamaño debe de ser tipo numerus");
        }

        Integer sizeConst = evaluateConstNumerus(context.size);
        if (context.initVals != null){
            if (sizeConst != null && context.initVals.size() != sizeConst){
                errores.semantico(context.line, "El indice de series no cumple el rango de: "+context.name);
            }
            for (ASTNode v : context.initVals){
                Tipos real = v.accept(this);
                if (!elemento.isError() && !real.isError() && !Tipos.isAssigImpl(elemento, real)){
                    errores.semantico(context.line, "Valor Agregado imcompatible con tipo ");
                }
            }
        }

        VarSymbol vs = new VarSymbol(context.name, context.line, Tipos.series(elemento));
        vs.sizeSeries = sizeConst;
        table.setVar(vs);
        return vs.type;
    }

    @Override
    public Tipos visit(StructuraAsigField.Context context) {
        VarSymbol vs = table.getVar(context.nameStruc);
        String nameField =getNameId(context.field);
        Tipos real = context.value.accept(this);
        if (vs == null){
            errores.semantico(context.line, "La variable no ha sido declarada: "+context.nameStruc);
            return Tipos.ERROR;
        }
        if (vs.type.tb != Tipos.TiposBase.STRUCT){
            errores.semantico(context.line, "No es una variable de tipo structura: "+context.nameStruc);
            return Tipos.ERROR;
        }
        if (nameField == null){
            errores.semantico(context.line, "El atributo de un structura debe de referenciar a un identificador");
            return Tipos.ERROR;
        }
        StructSymbol s = table.getStructura(vs.type.nameStruc);
        if (s == null || !s.hasField(nameField)){
            errores.semantico(context.line, "La structura "+vs.type+" no tiene le falta el atributo: "+nameField);
            return Tipos.ERROR;
        }
        Tipos esperado = s.fieldsType(nameField);
        if (!esperado.isError() && !real.isError() && !Tipos.isAssigImpl(esperado, real)){
            errores.semantico(context.line, "No se pude asignar un valor de tipo: "+real+" al atributo: "+nameField);
        }
        return esperado;
    }

    @Override
    public Tipos visit(StructuraAsigSeriesVal.Context context) {
        VarSymbol strucVar = table.getVar(context.nameStruc);
        Tipos idTipo = context.index.accept(this);
        if (idTipo.tb != Tipos.TiposBase.NUMERUS && !idTipo.isError()){
            errores.semantico(context.line, "El indice debe de ser de tipo numerus");
        }
        if (strucVar == null){
            errores.semantico(context.line, "La variable no ha sido declarada: "+context.nameStruc);
            for (StrucFieldInit  fi : context.values) fi.value.accept(this);
            return Tipos.ERROR;
        }
        if (strucVar.type.tb != Tipos.TiposBase.STRUCT){
            errores.semantico(context.line, "No es una variable de tipo structura: "+context.nameStruc);
            for (StrucFieldInit  fi : context.values) fi.value.accept(this);
            return Tipos.ERROR;
        }
        StructSymbol contenedor = table.getStructura(strucVar.type.nameStruc);
        if (contenedor == null || !contenedor.hasField(context.nameSeries) || contenedor.fieldsType(context.nameSeries).tb != Tipos.TiposBase.SERIRES){
            errores.semantico(context.line, "No es una arreglo valido: "+context.nameSeries);
            for (StrucFieldInit  fi : context.values) fi.value.accept(this);
            return Tipos.ERROR;
        }
        Tipos elemento = contenedor.fieldsType(context.nameSeries).elemnts;
        if (elemento.tb != Tipos.TiposBase.STRUCT){
            errores.semantico(context.line, "Solo se pueden asignar literales de structura a series de structuras");
            for (StrucFieldInit  fi : context.values) fi.value.accept(this);
            return Tipos.ERROR;
        }
        StructSymbol s= table.getStructura(elemento.nameStruc);
        if (s == null){
            errores.semantico(context.line, "La structura no ha sido declarada: "+elemento.nameStruc);
            for (StrucFieldInit  fi : context.values) fi.value.accept(this);
            return Tipos.ERROR;
        }
        validateInitStruc(s, context.values, context.line);
        return Tipos.VOID;
    }

    @Override
    public Tipos visit(StrucTypeDecl.Context context) {
        if (table.existStruc(context.name)){
            errores.semantico(context.line, "La structura ya fue declarada: "+context.name);
        }
        StructSymbol s = new StructSymbol(context.name, context.line);
        Set<String> vistor = new HashSet<>();
        for (StrucFieldParams f : context.fields){
            if (!vistor.add(f.name)){
                errores.semantico(context.line, "Atributo duplicado: "+f.name);
                continue;
            }
            Tipos tfield = getType(f.type, context.line);
            s.fields.put(f.name, f.isSeries ? Tipos.series(tfield) : tfield);
        }
        table.setStruc(s);
        return Tipos.VOID;
    }

    @Override
    public Tipos visit(StrucVarDecl.Context context) {
        if (table.existLocalVar(context.name)){
            errores.semantico(context.line, "La variable ya fue declarada: "+context.name);
        }
        StructSymbol s = table.getStructura(context.type);
        if (s == null){
            errores.semantico(context.line, "La estructura no ha sido declarada: "+context.type);
            for (StrucFieldInit fi : context.values) fi.value.accept(this);
            table.setVar(new VarSymbol(context.type, context.line, Tipos.ERROR));
            return Tipos.ERROR;
        }
        validateInitStruc(s, context.values, context.line);
        table.setVar(new VarSymbol(context.name, context.line, Tipos.struct(context.type)));
        return Tipos.struct(context.type);
    }

    //Devuelve el tipo
    private Tipos getType(String name, int line){
        if (name == null) return Tipos.ERROR;
        switch (name){
            case "numerus" : return Tipos.NUMERUS;
            case "decimalis" : return Tipos.DECIMALIS;
            case "textum" : return Tipos.TEXTUM;
            case "littera" : return Tipos.LITTERA;
            case "bool" : return Tipos.BOOL;
            default:
                if (table.existStruc(name)) return Tipos.struct(name);
                errores.semantico(line, "Tipo no delcarado: "+name);
                return Tipos.ERROR;
        }
    }

    private void setSignFunc(FuncsStm fn){
        FuncsStm.Context c = new FuncsStm.Context(fn);
        if (table.existFunc(c.name)){
            errores.semantico(c.line, "La funcion: "+c.name+" ya esta declarada");
            return;
        }
        Tipos retorno = c.returnType == null ? Tipos.VOID : getType(c.returnType, c.line);
        List<Tipos> paramTypes = new ArrayList<>();
        List<String> paramNameS = new ArrayList<>();
        Set<String> visto = new HashSet<>();
        for (Params p : c.params){
            if (!visto.add(p.name)){
                errores.semantico(c.line, "Parametro duplicado: "+p.name);
            }
            paramTypes.add(getType(p.type, c.line));
            paramNameS.add(p.name);
        }
        table.setFunc(new FuncSymbol(c.name, c.line, retorno, paramTypes, paramNameS));

    }

    private void procesarBody(List<ASTNode> stms){
        boolean hasReturn = false;
        for (ASTNode s : stms){
            if (hasReturn){
                errores.semantico(s.getLinea(), "Retorno Previo: Ya existia Reddere antes ");
            }
            s.accept(this);
            if (s instanceof ReddereStm){
                hasReturn = true;
            }
        }
    }

    private boolean siempreRetorna(List<ASTNode> stms){
        for (ASTNode s :stms){
            if (s instanceof ReddereStm) return true;

            if (s instanceof SiStm){
                SiStm.Context c = new SiStm.Context((SiStm) s);
                boolean todoRetorna = siempreRetorna(c.bodySi);
                boolean tieneAliter = false;
                for (AliterStm aliter : c.aliterNodes){
                    todoRetorna = todoRetorna && siempreRetorna(aliter.body);
                    if (aliter.condition == null) return true;
                }
                if (tieneAliter && todoRetorna) return true;
            }
        }
        return false;
    }

    //Operaciones para tipos Numerus
    private Integer evaluateConstNumerus(ASTNode n){
        if (n instanceof IntLiteral){
            return new IntLiteral.Context((IntLiteral) n).value;
        }
        if (n instanceof UMenos){
            Integer v = evaluateConstNumerus(new UMenos.Context((UMenos) n).value);
            return v == null ? null : -v;
        }
        if (n instanceof Parentesis){
            return evaluateConstNumerus(new Parentesis.Context((Parentesis) n).value);
        }
        if (n instanceof AllExpr){
            AllExpr.Context c = new AllExpr.Context((AllExpr) n);
            Integer left = evaluateConstNumerus(c.left);
            Integer right = evaluateConstNumerus(c.right);
            if(left == null || right == null) return null;
            switch (c.op){
                case "+": return  left+right;
                case "-": return  left-right;
                case "*": return  left*right;
                case "/": return  right == 0 ? null : left/right;
                default: return null;
            }
        }
        return null;
    }

    private void validateInitStruc(StructSymbol s, List<StrucFieldInit> values , int line){
        Set<String> asignados = new HashSet<>();
        for (StrucFieldInit fi :values){
            Tipos real = fi.value.accept(this);
            if (!s.hasField(fi.name)){
                errores.semantico(line, "El structura no tiene atributo: "+s.name);
                continue;
            }
            Tipos esperado = s.fieldsType(fi.name);
            if (!esperado.isError() && !real.isError() && !Tipos.isAssigImpl(esperado, real)){
                errores.semantico(line, "El atributo "+ fi.name+" espera unicamente el tipo: "+esperado);
            }
            asignados.add(fi.name);
        }
        for (String field : s.fields.keySet()){
            if (!asignados.contains(field)){
                errores.semantico(line, "Falta agregar valor al atributo de la structura: "+s.name);
            }
        }
    }

    private void exigirBool(Tipos t, int line, String ctx){
        if (!t.equals(Tipos.BOOL) && !t.isError()){
            errores.semantico(line, "La condicion debe de ser de tipo bool: "+ctx);
        }
    }

    private Tipos validateCall(String name, List<ASTNode> args, int line){
        List<Tipos> argsType = new ArrayList<>();
        for (ASTNode e : args){
            argsType.add(e.accept(this));
        }
        FuncSymbol fs = table.getFunc(name);
        if (fs == null){
            errores.semantico(line, "La funcion no ha sido declarada: "+name);
            return Tipos.ERROR;
        }
        if (fs.typesParams.size() != argsType.size()){
            errores.semantico(line, "La funcion "+name+" necesita "+fs.typesParams.size()+" pero se recibieron "+argsType.size());
            return fs.typeReddere;
        }
        for (int i = 0; i < argsType.size(); i++) {
            Tipos esperado = fs.typesParams.get(i);
            Tipos real = argsType.get(i);
            if (real.isError()) continue;
            if (!real.isPrimivite()){
                errores.semantico(line, "Solo se permiten valores primitivos como argumentos: Arumento -> "+(i+1)+" : "+name);
            } else if (!Tipos.isAssigImpl(esperado, real)) {
                errores.semantico(line, "El argumento "+(i+1)+" no corresponde con el tipo esperado: "+esperado+ " : "+real);
            }
        }
        return fs.typeReddere;
    }

    private String getNameId(ASTNode n){
        if (n instanceof Identificador){
            return  new Identificador.Context((Identificador) n).nombre;
        }
        return null;
    }
}
