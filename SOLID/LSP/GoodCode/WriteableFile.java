public class WriteableFile extends ReadableFile implements Writable{
    @Override
    public void write(){
        System.out.print("Writing to a file...");
    }

}