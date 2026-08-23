package org.example.Ast.stm;

import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

public class InterrumpeStm extends AbstractNode {
    public InterrumpeStm(int line) {
        super(line);
    }

    public static class Context{
        public final int line;

        public Context(InterrumpeStm node) {
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
