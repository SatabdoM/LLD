public class SMSService implements NotificationChannel {
    @Override
    public void sendNotification(String message) {
        // Logic to send SMS notification
        System.out.println("SMS Notification sent: " + message);
    }
}