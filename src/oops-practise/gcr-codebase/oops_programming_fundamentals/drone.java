package oops_programming_fundamentals;

public class drone {
    int droneId;
    int batteryPercentage;
    static String companyName = "Sky Logistics";
    drone(int droneId , int batteryPercentage ){
        this.droneId=droneId;
        this.batteryPercentage=batteryPercentage;
    }
    public void startDelivery(){
        System.out.println(droneId);
    }
    public void displayStatus(){
        System.out.println(droneId);
        System.out.println(batteryPercentage);
        System.out.println(companyName);
    }
}
class MainDrone{
    public static void main(String[] args) {
        drone d1 = new drone(102,98);
        drone d2 = new drone(112,29);
        d1.startDelivery();
        d2.startDelivery();
        d1.displayStatus();
        d2.displayStatus();
    }
}