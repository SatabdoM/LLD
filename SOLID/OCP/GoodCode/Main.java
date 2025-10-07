    public class Main {
        public static void main(String[] args) {
            PaymentProcessor paymentProcessor = new PaymentProcessor();

            PaymentMethod creditCard = new CreditCard();
            PaymentMethod paypal = new Paypal();
            PaymentMethod debitCard = new DebitCard();

            paymentProcessor.process(creditCard, 100.0);
            paymentProcessor.process(paypal, 200.0);
            paymentProcessor.process(debitCard, 300.0);
        }
    }