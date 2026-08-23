package org.example.Ast;

public abstract class AbstractNode  implements ASTNode{

    protected final int line;

    protected AbstractNode(int line) {
        this.line = line;
    }

    @Override
    public int getLinea() {
        return line;
    }
}
