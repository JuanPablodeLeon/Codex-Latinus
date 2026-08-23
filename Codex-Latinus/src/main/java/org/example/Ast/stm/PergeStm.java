package org.example.Ast.stm;

import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

public class PergeStm extends AbstractNode {
    public PergeStm(int line) {
        super(line);
    }
    public static class Context{
        public final int line;

        public Context(PergeStm node){
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
