package Polymorphism.vehicle;

public class Bike extends Vehicle {

    Bike(String name) {
        super(name);
    }

    @Override
    public int fuelCost(int km) {
        return 30 * km;
    }
}