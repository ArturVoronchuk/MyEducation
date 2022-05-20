package JC_3.Install;

import java.io.IOException;
import static JC_3.Install.CreateDir.createDir;
import static JC_3.Install.CreateFile.createFile;
import static JC_3.Install.FileWriter.fileWr;
import static JC_3.Install.StringBuilder.*;

public class Main {

    public static void main(String[] args) throws IOException {
        createDir();
        createFile();
        created();
        fileWr();
    }
}