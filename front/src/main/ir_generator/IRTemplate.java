package main.ir_generator;

public class IRTemplate {
    public static final String INT = "i32";
    public static final String FLOAT = "float";
    public static final String FUNCTION_HEAD = "\ndefine %s @%s() #%d {\n";
    public static final String FUNCTION_END = "}";
    public static final String NEW_LINE = "\n";

    //int
    public static final String LOCAL_VARIABLE_INT_DECLARATION = "\n\t%%%s = alloca i32, align 4\n";
    public static final String LOCAL_VARIABLE_INT_ASSIGMENT = "\tstore i32 %d, i32* %%%s, align 4\n";
    public static final String GLOBAL_INT = "@%s = global i32 %d, align 4\n";

    //float
    public static final String LOCAL_VARIABLE_FLOAT_DECLARATION = "\n\t%%%s = alloca float, align 4\n";
    public static final String LOCAL_VARIABLE_FLOAT_ASSIGMENT = "\tstore float %f, float* %%%s, align 4\n";
    public static final String GLOBAL_FLOAT = "@%s = global float %f, align 4";

    //return
    public static final String RETURN_INT = "\n\tret i32 %d";
    public static final String RETURN_FLOAT = "\n\tret float %f";

    //print and read
    public static final String PRINT_STR_CONSTATNT = "@.str = private unnamed_addr constant [4 x i8] c\"%d\\0A\\00\", align 1\n";
    public static final String READ_STRING_CONST = "@.read = private unnamed_addr constant [3 x i8] c\"%d\\00\", align 1\n";
    public static final String PRINTF_DECLARATION = "\ndeclare i32 @printf(i8*, ...) #1\n";
    public static final String READ_DECLARATION = "\ndeclare i32 @__isoc99_scanf(i8*, ...) #1\n";
    public static final String PRINT_ID = "\n\t%%%d = load i32, i32* %%%s, align 4\n" +
            "\t%%%d = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i32 %%%d)\n";
    public static final String READ_INT = "\n\t%%%d = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @.read, i32 0, i32 0), i32* %%%s)\n";
    public static final String READ_FLOAT = "\n\t%%%d = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @.read, i32 0, i32 0), float* %%%s)\n";


    //add, minus, multiply, divide
    public static final String LOAD_INT_EXPRESSION = "\n\t%%%d = load i32, i32* %%%s, align 4";
    public static final String LOAD_FLOAT_EXPRESSION = "\n\t%%%d = load float, float* %%%s, align 4";
    public static final String ADD_INT = "\n\t%%%d = add nsw i32 %%%d, %%%d";
    public static final String ADD_FLOAT = "\n\t%%%d = fadd float %%%d, %%%d";
    public static final String MINUS_INT = "\n\t%%%d = sub nsw i32 %%%d, %%%d";
    public static final String MINUS_FLOAT = "\n\t%%%d = fsub float %%%s, %%%d";
    public static final String MULTIPLY_FLOAT = "\n\t%%%d = fmul float %%%d, %%%d";
    public static final String MULTIPLY_INT = "\n\t%%%d = mul nsw i32 %%%d, %%%d";
    public static final String DIVIDE_INT = "\n\t%%%d = sdiv i32 %%%d, %%%d";
    public static final String DIVIDE_FLOAT = "\n\t%%%d = fdiv float %%%d, %%%d";

    public static final String STORE_INT = "\n\tstore i32 %%%d, i32* %%%s, align 4\n";
    public static final String STORE_FLOAT = "'\nstore float %%%d, float* %%%s, align 4";










    //begin and and of the file
    public final static String BEGIN = "target datalayout = \"e-m:e-i64:64-f80:128-n8:16:32:64-S128\"\n" +
            "target triple = \"x86_64-pc-linux-gnu\"";



    public final static String END = "\nattributes #0 = { nounwind uwtable \"disable-tail-calls\"=\"false\" \"less-precise-fpmad\"=\"false\" \"no-frame-pointer-elim\"=\"true\" \"no-frame-pointer-elim-non-leaf\" \"no-infs-fp-math\"=\"false\" \"no-nans-fp-math\"=\"false\" \"stack-protector-buffer-size\"=\"8\" \"target-cpu\"=\"x86-64\" \"target-features\"=\"+fxsr,+mmx,+sse,+sse2\" \"unsafe-fp-math\"=\"false\" \"use-soft-float\"=\"false\" }\n" +
            "attributes #1 = { \"disable-tail-calls\"=\"false\" \"less-precise-fpmad\"=\"false\" \"no-frame-pointer-elim\"=\"true\" \"no-frame-pointer-elim-non-leaf\" \"no-infs-fp-math\"=\"false\" \"no-nans-fp-math\"=\"false\" \"stack-protector-buffer-size\"=\"8\" \"target-cpu\"=\"x86-64\" \"target-features\"=\"+fxsr,+mmx,+sse,+sse2\" \"unsafe-fp-math\"=\"false\" \"use-soft-float\"=\"false\" }\n" +
            "\n" +
            "!llvm.ident = !{!0}\n" +
            "\n" +
            "!0 = !{!\"clang version 3.8.0-2ubuntu4 (tags/RELEASE_380/final)\"}";
}
