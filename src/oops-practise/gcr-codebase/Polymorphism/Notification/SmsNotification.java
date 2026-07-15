package Polymorphism.Notification;


public class SmsNotification extends Notification {

    public SmsNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public String sendNotification(String message) {
        return message;
    }
}