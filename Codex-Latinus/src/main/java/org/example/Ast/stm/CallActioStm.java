package org.example.Ast.stm;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

import java.util.List;

public class CallActioStm extends AbstractNode {
    private final String name;
    private final List<ASTNode> args;

    public CallActioStm(String name, List<ASTNode> args, int line) {
        super(line);
        this.name = name;
        this.args = args;
    }

    public static class Context{
        public final String name;
        public final List<ASTNode> args;
        public final int line;

        public Context(CallActioStm node) {
            this.name = node.name;
            this.args = node.args;
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
