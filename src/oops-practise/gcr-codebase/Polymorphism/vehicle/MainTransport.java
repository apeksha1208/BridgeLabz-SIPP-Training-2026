package Polymorphism.vehicle;

public class MainTransport {

    public static void main(String[] args) {

        Car car = new Car("Maruti");
        Bus bus = new Bus("Local transport");
        Bike bike = new Bike("Honda");

        Vehicle[] veh = {car, bus, bike};

        for (Vehicle val : veh) {
            System.out.println(val.fuelCost(1));
        }
    }
}