import java.io.*;

/**
 * @author : Charles Zhang
 * @date : 2019-06-17 11:16
 */

public class Main {

    public static void main(String[] args) {

        String exe = "python3 ";
        String pyPath = "./src/main/python/__main__.py";

        Process proc;

        try {

            proc = Runtime.getRuntime().exec(exe + pyPath);

            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));

            String line = null;

            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }

            in.close();
            proc.waitFor();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
