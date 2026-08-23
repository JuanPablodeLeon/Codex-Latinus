package org.example.Ast.stm;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

import java.util.List;

public class SeriesDecl extends AbstractNode {
    private final String name;
    private final ASTNode size;
    private final String type;
    private final List<ASTNode> initVals;

    public SeriesDecl( String name, ASTNode size, String type, List<ASTNode> initVals, int line) {
        super(line);
        this.name = name;
        this.size = size;
        this.type = type;
        this.initVals = initVals;
    }

    public static class Context{
        public final String name;
        public final ASTNode size;
        public final String type;
        public final List<ASTNode> initVals;
        public final int line;

        public Context(SeriesDecl node) {
            this.name = node.name;
            this.size = node.size;
            this.type = node.type;
            this.initVals = node.initVals;
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
