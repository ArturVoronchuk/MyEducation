package JC_3;

import java.io.*;
import static JC_3.StringB.logsSaved;

public class WriteFile {

      public static void fileWr() {
        try {
            FileWriter logs = new FileWriter("C:/Games/temp/temp.txt");
            logs.write(String.valueOf(logsSaved()));
            logs.close();
        } catch (IOException ex) {
            System.out.println("Запись логов завершена.");
        }
    }
}