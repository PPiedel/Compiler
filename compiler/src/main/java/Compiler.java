import main.Front;

import java.io.IOException;

public class Compiler {
    public static void main(String[] args) {
        try {
            Front.run("code.P", "code2.P", "code3.P");
            LLVMRunner.createExectuble();
            System.out.println("Compile finished successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
