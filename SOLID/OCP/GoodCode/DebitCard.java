public class DebitCard implements PaymentMethod{
    @Override
    public void processPayment(double amount){
        System.out.println("Processing debit card payment of $" + amount);
    }
}