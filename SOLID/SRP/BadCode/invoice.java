
public class Invoice {

    private double amount;

    public Invoice(double amount){
        this.amount =amount;
    }
    public void generateInvoice(){
        system.out.println("Invoice generated with amount: " + amount);
    }
    public void saveToDatabase(){
        system.out.println("Invoice saved to database");
    }
    public void sendEmailToCustomer(){
        system.out.println("Email sent to customer");
    }
}