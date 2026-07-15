package Polymorphism.vehicle;

public class Car extends Vehicle {

    Car(String name) {
        super(name);
    }

    @Override
    public int fuelCost(int km) {
        return 10 * km;
    }
}