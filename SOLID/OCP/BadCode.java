public class paymentProcessor {
    public void processPayment( String paymentMethod, double amount){
        if(paymentMethod.equals("CreditCard")){
            // Process credit card payment
            System.out.println("Processing credit card payment of $" + amount);
        } else if(paymentMethod.equals("PayPal")){
            // Process PayPal payment
            System.out.println("Processing PayPal payment of $" + amount);
        } else {
            System.out.println("Unsupported payment method: " + paymentMethod);
        }
    }
}
//What is the problem with this code?
//Lets say we cant to modify our Credit Card Payment method, we have to modify our paymentProcessor class.
//This is violation of Open/Closed Principle that says that a class should be open for extension but closed for mofification.
//So, we should refactor this code to follow Open/Closed Principle.
