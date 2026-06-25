package Polymorphism.vehicle;

public class Bus extends Vehicle {

    Bus(String name) {
        super(name);
    }

    @Override
    public int fuelCost(int km) {
        return 20 * km;
    }
}