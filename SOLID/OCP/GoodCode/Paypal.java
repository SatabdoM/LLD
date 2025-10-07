public class Paypal implements PaymentMethod{
    @Override
    public void processPayment(double amount){
        //now we can implement our paypal payment logic here without modifying any other class
        System.out.println("Processing PayPal payment of $" + amount);
    }
}