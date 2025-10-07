public class MultipurposeMachine implements Printer,Scanner, Copier{
    @Override
    public void print() {
        System.out.println("Printing document");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document");
    }

    @Override
    public void copy() {
        System.out.println("Copying document");
    }
}