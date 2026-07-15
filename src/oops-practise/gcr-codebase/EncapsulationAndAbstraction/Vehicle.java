package EncapsulationAndAbstraction;

public  abstract class  Vehicle {
    private String vehicleNumber;
    private String vehicleType;
    public Vehicle(String vehicleNumber,  String vehicleType){ //We use public with a constructor when we want objects of that class to be created from outside the class.
        this.vehicleNumber = vehicleNumber;
        this.vehicleType=vehicleType;
    }
    public String getVehicleNumber(){
        return vehicleNumber;
    }
    public String getVehicleType(){
        return vehicleType;
    }
    public void setVehicleNumber(String vehicleNumber){
        this.vehicleNumber = vehicleNumber;
    }
    public void setVehicleType(String vehicleType){
        this.vehicleType=vehicleType;
    }
    public abstract double calculateRentalCost(int days);
}
 class Car extends Vehicle{

    private double dailyRate;

    public Car (String vehicleNumber , double dailyRate){
        super(vehicleNumber,"Car");
        this.dailyRate=dailyRate;
    }
    public double getDailyRate(){
        return dailyRate;
    }
    public void setDailyRate(double dailyRate){
        this.dailyRate=dailyRate;
    }
    @Override
    public double calculateRentalCost(int days){
        return days*dailyRate;
    }
}
class  Bike extends Vehicle{
    private double dailyRate;
    public Bike(String vehicleNumber, double dailyRate){
        super(vehicleNumber,"Bike");
        this.dailyRate=dailyRate;
    }
    public double getDailyRate(){
        return dailyRate;
    }
    public void setDailyRate(double dailyRate){
        this.dailyRate = dailyRate;
    }
    @Override
    public double calculateRentalCost(int days){
        return days * dailyRate;
    }
}
class Truck extends Vehicle{
    private double dailyRate;
    private double loadingCharge;
    public Truck(String vehicleNumber,double dailyRate, double loadingCharge){
        super(vehicleNumber,"Truck");
        this.dailyRate=dailyRate;
        this.loadingCharge=loadingCharge;
    }
    public double getDailyRate(){
        return dailyRate;
    }
    public void setDailyRate(double dailyRate){
        this.dailyRate=dailyRate;
    }
    public void setLoadingCharge(double loadingCharge){
        this.loadingCharge=loadingCharge;
    }
    @Override
    public double calculateRentalCost(int days){
        return (days * dailyRate)+loadingCharge;
    }
}
class mainVehicle{
    public static void main(String[] args) {
        Car c = new Car("abc12", 200.00);
        Bike b = new Bike("bchde34",399.00);
        Truck t = new Truck("sjih34",400.00,9840.1);
    }
}
