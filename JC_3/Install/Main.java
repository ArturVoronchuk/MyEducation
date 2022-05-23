package JC_3.Install;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CreateDir.createDir();
        CreateFile.createFile();
        StringB.logsSaved();
        WriteFile.fileWr();
    }
}