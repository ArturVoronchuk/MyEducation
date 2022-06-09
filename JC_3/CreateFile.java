package JC_3;

import java.io.*;

public class CreateFile {
    public static void createFile() throws IOException {

        File files = null;

        String[] str = new String[]{
                "C:/Games/src/main/Main.java",
                "C:/Games/src/main/Utils.java",
                "C:/Games/temp/temp.txt"
        };

        try {
            for (String s : str) {
                files = new File(s);
                if(!files.exists()) {
                    files.createNewFile();
                    System.out.println("Файл " + files.getName() + " успешно создан.");
                } else {
                    System.out.println("Файлы " + files.getName() + " уже существует.");
                }
            };
        } catch (IOException iEx) {
            System.out.println(iEx.getMessage());
        }
    }
}
