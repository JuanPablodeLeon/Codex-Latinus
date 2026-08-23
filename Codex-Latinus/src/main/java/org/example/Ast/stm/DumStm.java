package org.example.Ast.stm;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

import java.util.List;

public class DumStm extends AbstractNode {
    private final ASTNode condition;
    private final List<ASTNode> body;

    public DumStm( ASTNode condition, List<ASTNode> body, int line) {
        super(line);
        this.condition = condition;
        this.body = body;
    }

    public static class Context{
        public final ASTNode condition;
        public final List<ASTNode> body;
        public final int line;

        public Context(DumStm node) {
            this.condition = node.condition;
            this.body = node.body;
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
