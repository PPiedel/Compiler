package main.ir_generator;

import main.Front;

import java.util.ArrayList;
import java.util.List;

import static main.ir_generator.IRTemplate.*;

public final class IRGenerator {
    public static final String GLOBAL_SCOPE = "GLOBAL";
    public static final List<String> generatedGlobalStatements = new ArrayList<>();
    private final List<Front.Statement> statements;
    private final List<Front.Function> functions;


    public IRGenerator(Front.Program program) {
        this.statements = program.getStatements();
        this.functions = program.getFunctions();
    }

    public static String endFile() {
        StringBuilder ir = new StringBuilder();
        ir.append(PRINT_STR_CONSTATNT);
        ir.append(READ_STRING_CONST);
        ir.append(PRINTF_DECLARATION);
        ir.append(READ_DECLARATION);
        ir.append(MEM_COPY);
        ir.append(END);
        return ir.toString();
    }

    public static String beginFile() {
        StringBuilder ir = new StringBuilder();
        ir.append(BEGIN).append(NEW_LINE);

        return ir.toString();
    }

    public String generateIR() {
        StringBuilder ir = new StringBuilder();

        processGlobalStatements(ir);

        processFunctions(ir);

        processGeneratedStatements(ir);

        return ir.toString();
    }

    private void processGlobalStatements(StringBuilder ir) {
        for (Front.Statement statement : statements) {
            ir.append(statement.getIRCode(GLOBAL_SCOPE)).append(NEW_LINE);
        }
    }

    private void processFunctions(StringBuilder ir) {
        for (Front.Function function : functions) {
            appendFunctionHead(ir, function);
            if (function.getBody() != null) {
                for (Front.Statement statement : function.getBody().getStatements()) {
                    ir.append(statement.getIRCode(function.getName()));
                }
            }

            appendFunctionEnd(ir);

        }
    }

    private void processGeneratedStatements(StringBuilder ir) {
        for (String iRCode : generatedGlobalStatements) {
            ir.append(iRCode);
        }
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
