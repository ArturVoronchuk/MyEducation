package JC_3.Saving;

import java.io.File;
import java.io.FilenameFilter;

public class DeleteSaves {
    public static void deleting(String path, String files) {
        File dir = new File("C:/Games/savegames");
        FilenameFilter filter = new ExtensionFilter(".dat");

        String[] filenames = dir.list(filter);
        for (String filename : filenames) {
            String fullFilename = new StringBuilder()
                    .append(dir)
                    .append(File.separator)
                    .append(filename)
                    .toString();

            File file = new File(fullFilename);
            Boolean isDeleted = file.delete();
            System.out.println("Фaйл yдaлeн: " + fullFilename + isDeleted.toString());
            System.out.println();
        }

    }
}
