import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LLVMRunner {

    public static void createExectuble()
    {
        Process process = null;
        try
        {
            String script = "./makeExecutableAndRun.sh";
            process = Runtime.getRuntime().exec(script);

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line=reader.readLine())!=null)
            {
                System.out.println(line);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            if (process != null) {
                process.destroy();
            }
        }
    }
}
