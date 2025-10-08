public class EmailService implements NotificationChannel {
    @Override
    public void sendNotification(String message) {
        // Logic to send email notification
        System.out.println("Email Notification sent: " + message);
    }
    
}