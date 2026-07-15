package Polymorphism.Notification;

public class PushNotification extends Notification {

    public PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public String sendNotification(String message) {
        return message;
    }
}