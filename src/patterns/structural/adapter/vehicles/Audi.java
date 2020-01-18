package patterns.structural.adapter.vehicles;

import patterns.structural.adapter.interfaces.Car;

public class Audi implements Car {
    @Override
    public void wash() {
        System.out.println("Wash Car");
    }
}
