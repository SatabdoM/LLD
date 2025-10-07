public class CreditCard implements PaymentMethod{
    @Override
    public void processPayment(double amount){
        //now we can implement our credit card payment logic here without modifying any other class
        System.out.println("Processing credit card payment of $" + amount);
    }
}