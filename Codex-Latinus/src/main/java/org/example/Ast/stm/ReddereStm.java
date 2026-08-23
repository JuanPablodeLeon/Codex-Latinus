package org.example.Ast.stm;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

public class ReddereStm extends AbstractNode {
    private final ASTNode expresion;

    public ReddereStm( ASTNode expresion, int line) {
        super(line);
        this.expresion = expresion;
    }
    public static class Context{
        public final ASTNode expresion;
        public final int line;

        public Context(ReddereStm node) {
            this.expresion = node.expresion;
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
