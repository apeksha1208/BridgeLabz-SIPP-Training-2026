package Polymorphism;

public class Notification {
    String recipientName;
    String message;
    Notification(String recipientName, String message){
        this.recipientName=recipientName;
        this.message=message;
    }
    public String sendNotification(String message){
        return message;
    }

}
class emailNotification extends Notification{
    emailNotification(String recipientName, String message){
        super(recipientName,message);
    }
    public String sendNotification(String message){
        return message;
    }
}
class smsNotification extends Notification{
    smsNotification(String recipientName, String message){
        super(recipientName, message);
    }
    public String sendNotification(String message){
        return message;
    }
}
class pushNotification extends Notification{
    pushNotification(String recipientName, String message){
        super(recipientName, message);
    }
    public String sendNotification(String message){
        return message;
    }
}
class MainMessage{
    public static void main(String[] args) {
        emailNotification email = new emailNotification("apeksha","hii");
        smsNotification sms = new smsNotification("vaishnavi","hlo");
        pushNotification push = new pushNotification("vamika","hihihi");
        Notification [] not = {email,sms, push};
        for(Notification n : not){
            System.out.println(n.sendNotification("hi"));
        }
    }
}

