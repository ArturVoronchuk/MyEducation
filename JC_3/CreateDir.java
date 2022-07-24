package JC_3;

import java.io.*;

public class CreateDir {

    public static void createDir() {

        File dir = null;

        String[] str = new String[]{
                "C:/Games",
                "C:/Games/src/main",
                "C:/Games/src/temp",
                "C:/Games/res",
                "C:/Games/savegames",
                "C:/Games/temp",
                "C:/Games/res/drawables",
                "C:/Games/res/vectors",
                "C:/Games/icons"
        };

        try {
            for (String s : str) {
                dir = new File(s);
                if (!dir.exists()) {
                    dir.mkdirs();
                } else {
                    System.out.println("Папка " + dir.getName() + " уже сущаетсвет.");
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}