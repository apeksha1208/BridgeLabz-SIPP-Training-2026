package Polymorphism.Notification;

public class EmailNotification extends Notification {

    public EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public String sendNotification(String message) {
        return message;
    }
}