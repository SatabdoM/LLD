public class Main{
    public static void main(String args[]){
        File readOnlyFile=new ReadOnlyFile();
        readOnlyFile.read();
        readOnlyFile.write(); // This will throw exception LSP violated
    }
    
}