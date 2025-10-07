public class Main {
    public static void main(String args[]) {
        ReadableFile readableFile = new ReadOnlyFile();
        readableFile.read();

        WriteableFile writeableFile = new WriteableFile();
        writeableFile.read();
        writeableFile.write();
    }
}