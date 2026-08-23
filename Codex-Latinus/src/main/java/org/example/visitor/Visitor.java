package org.example.visitor;

import org.example.Ast.exp.*;
import org.example.Ast.stm.*;

public interface Visitor <T>{
    T visit(UMenos.Context context);
    T visit(StringLiteral.Context context);
    T visit(NonExp.Context context);
    T visit(IntLiteral.Context context);
    T visit(DoubleLiteral.Context context);
    T visit(CharLiteral.Context context);
    T visit(BoolLiteral.Context context);
    T visit(Parentesis.Context context);
    T visit(Identificador.Context context);
    T visit(AllExpr.Context context);
    T visit(SeriesAccess.Context context);
    T visit(SeriesFieldAccess.Context context);
    T visit(StructuraAccess.Context context);
    T visit(FuncArgsCall.Context context);
    T visit(RatioFuncArgsCall.Context context);
    T visit(SiStm.Context context);
    T visit(FuncsStm.Context context);
    T visit(AutoOpStm.Context context);
    T visit(PerStm.Context context);
    T visit(FacereStm.Context context);
    T visit(InterrumpeStm.Context context);
    T visit(PergeStm.Context context);
    T visit(DumStm.Context context);
    T visit(ReddereStm.Context context);
    T visit(LeerStm.Context context);
    T visit(ImprStm.Context context);
    T visit(Flujo.Context context);
    T visit(SeriesAssigVal.Context context);
    T visit(SeriesStrucAssigVal.Context context);
    T visit(Asigancion.Context context);
    T visit(CallActioStm.Context context);
    T visit(ValDeclEsto.Context context);
    T visit(SeriesDecl.Context context);
    T visit(StructuraAsigField.Context context);
    T visit(StructuraAsigSeriesVal.Context context);
    T visit(StrucTypeDecl.Context context);
    T visit(StrucVarDecl.Context context);
}
