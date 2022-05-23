package JC_3.Install;

import java.io.*;

public class CreateFile {
    public static void createFile() throws IOException {
        File mainDotJava = new File("D:/Games/src/main/Main.java");
        File utilsDotJava = new File("D:/Games/src/main/Utils.java");
        File tempDotTxt = new File("D:/Games/temp/temp.txt");

        try {
            mainDotJava.createNewFile();
            utilsDotJava.createNewFile();
            tempDotTxt.createNewFile();
        } catch (IOException iEx) {
            System.out.println(iEx.getMessage());
        }
    }
}
