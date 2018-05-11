package main.ir_generator;

import main.Front;

import java.util.List;

public final class IRGenerator {
    private final static String BEGIN = "; ModuleID = 'code.c'\n" +
            "target datalayout = \"e-m:e-i64:64-f80:128-n8:16:32:64-S128\"\n" +
            "target triple = \"x86_64-pc-linux-gnu\"";

    private final static String END = "attributes #0 = { nounwind uwtable \"disable-tail-calls\"=\"false\" \"less-precise-fpmad\"=\"false\" \"no-frame-pointer-elim\"=\"true\" \"no-frame-pointer-elim-non-leaf\" \"no-infs-fp-math\"=\"false\" \"no-nans-fp-math\"=\"false\" \"stack-protector-buffer-size\"=\"8\" \"target-cpu\"=\"x86-64\" \"target-features\"=\"+fxsr,+mmx,+sse,+sse2\" \"unsafe-fp-math\"=\"false\" \"use-soft-float\"=\"false\" }\n" +
            "\n" +
            "!llvm.ident = !{!0}\n" +
            "\n" +
            "!0 = !{!\"clang version 3.8.0-2ubuntu4 (tags/RELEASE_380/final)\"}";

    private final List<Front.Statement> statements;

    public IRGenerator(List<Front.Statement> statements) {
        this.statements = statements;
    }

    public String generateIR(){
        StringBuilder ir = new StringBuilder();

        String newLine = "\n";

        ir.append(BEGIN).append(newLine);
        for (Front.Statement statement : statements){
            ir.append(statement.getIRCode()).append(newLine);
        }

        ir.append(END);

        return ir.toString();
    }


}
