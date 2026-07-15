package Polymorphism.Notification;


public class Notification {
    String recipientName;
    String message;

    protected Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    public String sendNotification(String message) {
        return message;
    }
}
