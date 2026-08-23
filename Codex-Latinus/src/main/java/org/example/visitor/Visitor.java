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
}
