package org.example.Ast.exp;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

import java.util.List;

public class FuncArgsCall extends AbstractNode {
    private final String name;
    private final List<ASTNode> args;

    public FuncArgsCall(String name, List<ASTNode> args, int line) {
        super(line);
        this.name = name;
        this.args = args;
    }

    public static class Context{
        public final String name;
        public final List<ASTNode> args;

        public Context(FuncArgsCall node) {
            this.name = node.name;
            this.args = node.args;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
