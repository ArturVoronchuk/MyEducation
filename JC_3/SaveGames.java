package JC_3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveGames {
    public static void saveGame(String path, GameProgress gameProgress) throws IOException {
        FileOutputStream outputStream1 = new FileOutputStream("C:/Games/savegames/save1.dat");
        FileOutputStream outputStream2 = new FileOutputStream("C:/Games/savegames/save2.dat");
        FileOutputStream outputStream3 = new FileOutputStream("C:/Games/savegames/save3.dat");
        ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(outputStream1);
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(outputStream2);
        ObjectOutputStream objectOutputStream3 = new ObjectOutputStream(outputStream3);
        objectOutputStream1.close();
        objectOutputStream2.close();
        objectOutputStream3.close();
    }
}
