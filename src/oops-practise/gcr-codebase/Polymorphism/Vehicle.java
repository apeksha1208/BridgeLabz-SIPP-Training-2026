package Polymorphism;

public class Vehicle {
    public String name;
    Vehicle(String name){
        this.name=name;
    }
    public int fuelCost(int km){
        return 0;
    }
}
class Car extends Vehicle{

    @Override
    public int fuelCost(int km){
        return 10*km;
    }
    Car(String name){
        super(name);
    }

}
class Bus extends Vehicle{
    @Override
    public int fuelCost(int km){
        return 20*km;
    }
    Bus(String name){
        super(name);
    }
}
class Bike extends Vehicle{
    Bike(String name){
        super(name);
    }
    @Override
    public int fuelCost(int km){
        return 30*km;
    }

}
class MainTransport{
    public static void main(String[] args) {
        Car car = new Car("Maruti");
        Bus bus = new Bus("Local transport");
        Bike bike = new Bike("Honda");
        Vehicle [] veh={car,bus,bike};
        for( Vehicle val:veh){
            System.out.println(val.fuelCost(1));

        }
    }
}