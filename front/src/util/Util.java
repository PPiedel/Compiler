package util;

import java.io.*;

public class Util {
    public static void writeIRToFile(String iR, File file){

        try( BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
           bufferedWriter.write(iR);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
