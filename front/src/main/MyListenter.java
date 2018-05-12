package main;

import org.antlr.v4.runtime.tree.ErrorNode;

public class MyListenter extends PBaseListener {
    private boolean error = false;

    @Override
    public void visitErrorNode(ErrorNode node) {
        System.out.println("Super super");
        super.visitErrorNode(node);
        error = true;
    }

    public boolean isError() {
        return error;
    }
}
