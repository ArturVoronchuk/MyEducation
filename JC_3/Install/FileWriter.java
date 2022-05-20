package JC_3.Install;

import java.io.*;

public class FileWriter {

    public FileWriter(File tempDotTxt) {
    }

    public static void fileWr () throws IOException {
        File tempDotTxt = new File("D:/Games/src/temp/temp.txt");
        tempDotTxt.createNewFile();
        FileWriter tempDotTxtWr = new FileWriter(tempDotTxt);
        tempDotTxtWr.write("Файлы и папки успешно созданы.");
    }

    private void write(String s) {
    }
}