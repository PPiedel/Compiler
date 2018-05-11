package main.ir_generator;

import main.Front;

import java.util.List;

import static main.ir_generator.IRTemplate.*;

public final class IRGenerator {


    private final List<Front.Statement> statements;
    private final List<Front.Function> functions;

    public IRGenerator(Front.Program program) {
        this.statements = program.getStatements();
        this.functions = program.getFunctions();
    }

    public String generateIR() {
        StringBuilder ir = new StringBuilder();

        ir.append(BEGIN).append(NEW_LINE);
        for (Front.Statement statement : statements){
            ir.append(statement.getIRCode()).append(NEW_LINE);
        }

        for (Front.Function function : functions) {
            appendFunctionHead(ir, function);

            appendFunctionEnd(ir);

        }

        ir.append(END);

        return ir.toString();
    }

    private void appendFunctionEnd(StringBuilder ir) {
        ir.append(NEW_LINE).append(FUNCTION_END).append(NEW_LINE);
    }

    private void appendFunctionHead(StringBuilder ir, Front.Function function) {
        switch (function.getReturnType()) {
            case ("int"): {
                ir.append(String.format(IRTemplate.FUNCTION_HEAD, IRTemplate.INT, function.getName(), function.getM_arguments().size()));
                break;
            }
            case ("float"): {
                ir.append(String.format(IRTemplate.FUNCTION_HEAD, IRTemplate.FLOAT, function.getName(), function.getM_arguments().size()));
                break;
            }
        }
    }


}
