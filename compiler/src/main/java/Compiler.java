import main.Front;

import java.io.IOException;

public class Compiler {
    public static void main(String[] args) {
        try {
            Front.run("code.P");
            LLVMRunner.createExectuble();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
