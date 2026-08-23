package org.example.Ast.stm;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

import java.util.List;

public class AliterStm{
    public final ASTNode condition;
    public final List<ASTNode> body;

    public AliterStm(ASTNode condition, List<ASTNode> body) {
        this.condition = condition;
        this.body = body;
    }
}
