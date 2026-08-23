package org.example.Ast.stm;

import org.example.Ast.ASTNode;
import org.example.Ast.AbstractNode;
import org.example.visitor.Visitor;

import java.util.List;

public class FuncsStm extends AbstractNode {
    private final String name;
    private final String returnType;
    private final List<Params> params;
    private final List<ASTNode> localVars;
    private final List<ASTNode> body;

    public FuncsStm( String name, String returnType, List<Params> params, List<ASTNode> localVars, List<ASTNode> body, int line) {
        super(line);
        this.name = name;
        this.returnType = returnType;
        this.params = params;
        this.localVars = localVars;
        this.body = body;
    }

    public static class Context{
        public final String name;
        public final String returnType;
        public final List<Params> params;
        public final List<ASTNode> localVars;
        public final List<ASTNode> body;
        public final int line;

        public Context(FuncsStm node) {
            this.name = node.name;
            this.returnType = node.returnType;
            this.params = node.params;
            this.localVars = node.localVars;
            this.body = node.body;
            this.line = node.line;
        }
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(new Context(this));
    }
}
