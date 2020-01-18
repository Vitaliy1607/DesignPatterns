package patterns.Creational.AbstractFactory.car;

import patterns.Creational.AbstractFactory.interfac.Car;

public class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("Drive audi");
    }
}
