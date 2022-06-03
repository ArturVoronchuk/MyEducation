package JC_3;

import JC_3.Saving.DeleteSaves;
import JC_3.Saving.GameProgress;
import JC_3.Saving.SaveGames;
import JC_3.Saving.ZipFiles;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CreateDir.createDir();
        CreateFile.createFile();
        StringB.logsSaved();
        WriteFile.fileWr();
        GameProgress gameProgress1 = new GameProgress(35, 11, 80, 39.5);
        GameProgress gameProgress2 = new GameProgress(15, 23, 13, 15.5);
        GameProgress gameProgress3 = new GameProgress(1330, 19, 100, 444.5);
        SaveGames.saveGame("D:/Games/savegames", gameProgress1);
        SaveGames.saveGame("D:/Games/savegames", gameProgress2);
        SaveGames.saveGame("D:/Games/savegames", gameProgress3);
        ZipFiles.zipFiles("D:/Games/savegames/zip.zip", "D:/Games/savegames/save1.dat");
        DeleteSaves.deleting("D:/Games/savegames/","save1.dat");
    }
}