package JC_3;

import java.io.*;

public class CreateDir {

    public static void createDir() {

        File dirGames = new File("D:/Games");
        File dirSrc = new File("D:/Games/src/main");
        File dirSrcMain = new File("D:/Games/src/temp");
        File dirRes = new File("D:/Games/res");
        File dirSaveGames = new File("D:/Games/savegames");
        File dirTemp = new File("D:/Games/temp");
        File drawables = new File("D:/Games/res/drawables");
        File vectors = new File("D:/Games/res/vectors");
        File icons = new File("D:/Games/icons");

        if (!dirGames.exists()) {
            dirGames.mkdir();
            dirSrc.mkdirs();
            dirSrcMain.mkdirs();
            dirRes.mkdir();
            dirSaveGames.mkdir();
            dirTemp.mkdir();
            drawables.mkdirs();
            vectors.mkdirs();
            icons.mkdirs();
            System.out.println("Все папки успешно созданы.");
        } else if (dirGames.exists()) {
            System.out.println("Папка " + dirGames.getName() + " уже сущаетсвет.");
        } else {
            System.out.println("Папка " + dirGames.getName() + " не может быть создана.");
        }
    }
}
