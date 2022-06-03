package JC_3.Saving;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFiles {
    public static void zipFiles(String path, String files) throws IOException {

        try (
                ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("D:/Games/savegames/zip.zip"));
                FileInputStream fis = new FileInputStream("D:/Games/savegames/save1.dat");
        ) {
            ZipEntry entry = new ZipEntry("zip_save1.dat");
            zos.putNextEntry(entry);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            zos.write(buffer);
            zos.closeEntry();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
