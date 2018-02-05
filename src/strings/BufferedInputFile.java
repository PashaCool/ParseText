package strings;

import java.io.*;

public class BufferedInputFile {

    public String read(String filename) {
        String res = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String s;
            StringBuilder sb = new StringBuilder();
            while ((s = in.readLine()) != null) {
                sb.append(s + "\n");
            }
            res = sb.toString();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
}