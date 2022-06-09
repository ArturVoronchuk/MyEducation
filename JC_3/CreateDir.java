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
/*        File dirGames = new File("C:/Games");
        File dirSrc = new File("C:/Games/src/main");
        File dirSrcMain = new File("C:/Games/src/temp");
        File dirRes = new File("C:/Games/res");
        File dirSaveGames = new File("C:/Games/savegames");
        File dirTemp = new File("C:/Games/temp");
        File drawables = new File("C:/Games/res/drawables");
        File vectors = new File("C:/Games/res/vectors");
        File icons = new File("C:/Games/icons");*/

/*        if (!dir.exists()) {
            dir.mkdirs();
            dirSrc.mkdirs();
            dirSrcMain.mkdirs();
            dirRes.mkdir();
            dirSaveGames.mkdir();
            dirTemp.mkdir();
            drawables.mkdirs();
            vectors.mkdirs();
            icons.mkdirs();*/

    }
}
