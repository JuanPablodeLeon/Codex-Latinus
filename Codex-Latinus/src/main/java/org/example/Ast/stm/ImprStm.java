package org.example.Ast.stm;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

import java.util.List;

public class ImprStm extends AbstractNode {
    private final List<ASTNode> expresions;

    public ImprStm(List<ASTNode> expresions, int line) {
        super(line);
        this.expresions = expresions;
    }

    public static class Context{
        public final List<ASTNode> expresions;
        public final int line;

        public Context(ImprStm node) {
            this.expresions = node.expresions;
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
