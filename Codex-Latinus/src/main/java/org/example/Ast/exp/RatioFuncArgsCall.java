package org.example.Ast.exp;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;
import org.w3c.dom.ls.LSInput;

import java.util.List;

public class RatioFuncArgsCall extends AbstractNode {
    private final String type;
    private final String name;
    private final List<ASTNode> args;

    public RatioFuncArgsCall(String type, String name, List<ASTNode> args, int line) {
        super(line);
        this.type = type;
        this.name = name;
        this.args = args;
    }

    public static class Context{
        public final String type;
        public final String name;
        public final List<ASTNode> args;
        public final int line;

        public Context(RatioFuncArgsCall node) {
            this.type = node.type;
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
