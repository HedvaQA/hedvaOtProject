package AutomationProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Browser {

    /* Get the browser from file */

    public static String returnbrowser() throws IOException {

        String everything;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\or\\Documents\\hedvaL\\browser.txt"))) {
            everything = "";
            try {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null) {
                    StringBuilder append = sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                everything = sb.toString();
            } finally {
                br.close();
            }
        }

        everything=everything.replace("\r\n","");
        return everything;
    }


}
