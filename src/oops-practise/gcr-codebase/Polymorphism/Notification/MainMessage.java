
package Polymorphism.Notification;

public class MainMessage {

    public static void main(String[] args) {

        EmailNotification email = new EmailNotification("apeksha", "hii");
        SmsNotification sms = new SmsNotification("vaishnavi", "hlo");
        PushNotification push = new PushNotification("vamika", "hihihi");

        Notification[] not = {email, sms, push};

        for (Notification n : not) {
            System.out.println(n.sendNotification("hi"));
        }
    }
}