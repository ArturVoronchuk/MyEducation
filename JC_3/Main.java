package JC_3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CreateDir.createDir();
        CreateFile.createFile();
        StringB.logsSaved();
        WriteFile.fileWr();
    }
}