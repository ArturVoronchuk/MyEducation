package JC_3.Install;

public class StringB {

    public StringB(String s) {
    }

    static String str = "All files and folders created.";
    public static StringB logsSaved() {
        StringB created = new StringB(str);
        return created;
    }
    @Override
    public String toString(){
        return str;
    }
}
