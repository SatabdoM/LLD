//The Liskov Substition Principle states that object of a superclass should be replaceable with object of its subclass without altering the correctness of the program.

public interface bird {
    void fly();

    void eat();
}

class Ostich implements bird {
    @Override
    public void fly() {
        // ostrich cannot fly
        throw new UnsupportedOperationException();
        // violation of LSP
    }

    @Override
    public void eat() {
        System.out.println("Ostrich is eating");
    }
}

public class main {
    public static void main(String[] args) {
        bird myBird = new Ostich();
        myBird.eat();
        myBird.fly(); // This will throw an exception LSP violated
    }
}