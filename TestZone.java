import java.io.FileWriter;

public class TestZone {
    public static void fileWr() {

        String data = "Welcome to gfg";

        try {
            // Creates a FileWriter
            FileWriter output = new FileWriter("output.txt");

            // Writes the string to the file
            output.write(data);

            // Closes the writer
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}