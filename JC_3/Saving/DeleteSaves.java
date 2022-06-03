package JC_3.Saving;

import java.io.File;

public class DeleteSaves {
    public static void deleting(String path, String files) {
        File file = new File("D:/Games/savegames");
        String fileName = file.getName();
        int extension = fileName.lastIndexOf(".dat");

        if (file.equals(extension)) {
            file.delete();
            System.out.println("Незаархивированные файлы удалены");
        } else {
            System.out.println("Не удалось удалить файлы с расширением .dat");
        }
    }
}
