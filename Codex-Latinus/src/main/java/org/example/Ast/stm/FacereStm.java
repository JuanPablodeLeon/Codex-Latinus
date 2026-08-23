package org.example.Ast.stm;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

import java.util.List;

public class FacereStm extends AbstractNode {

    private final List<ASTNode> body;
    private final ASTNode condition;

    public FacereStm( List<ASTNode> body, ASTNode condition, int line) {
        super(line);
        this.body = body;
        this.condition = condition;
    }

    public static class Context{
        public final List<ASTNode> body;
        public final ASTNode condition;
        public final int line;

        public Context(FacereStm node) {
            this.body = node.body;
            this.condition = node.condition;
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
