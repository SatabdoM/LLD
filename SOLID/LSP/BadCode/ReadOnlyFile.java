public class ReadOnlyFile extends File{
    @Override
    public void write(){
        throw new UnsupportedOperationException();
        
    }
}