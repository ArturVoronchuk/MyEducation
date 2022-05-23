package JC_3.Install;

import java.io.*;
import static JC_3.Install.StringB.logsSaved;

public class WriteFile {

      public static void fileWr() {
        try {
            FileWriter logs = new FileWriter("D:/Games/temp/temp.txt");
            logs.write(String.valueOf(logsSaved()));
            logs.close();
        } catch (IOException ex) {
            System.out.println("Запись логов завершена.");
        }
    }
}