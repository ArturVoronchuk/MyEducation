package JC_3.Install;

import java.io.*;

public class CreateFile {
    public static void createFile() throws IOException {
        File mainDotJava = new File("D:/Games/src/main/Main.java");
        File utilsDotJava = new File("D:/Games/src/main/Utils.java");

        try {
            mainDotJava.createNewFile();
            utilsDotJava.createNewFile();
           // tempDotTxt.write("Файлы и папки успешно созданы.");
        } catch (IOException iEx) {
            System.out.println(iEx.getMessage());
        }

//        System.out.println("Директории " + mainDotJava.getName() + " " +
//                utilsDotJava.getName() + " и " + tempDotTxt.getName() +
//                " созданы успешно.");
    }
}
