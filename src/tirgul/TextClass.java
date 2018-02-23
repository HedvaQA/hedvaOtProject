package tirgul;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class TextClass {

    public static void main(String[] args) throws IOException {
        System.out.println(returnData());
    }

    public static String returnData() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\or\\Documents\\hedvaL\\TestClass.txt"));
        String everything = "";
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb.toString();
        } finally {
            br.close();
        }
        return everything;
    }


}
