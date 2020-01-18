package patterns.Creational.AbstractFactory;

import patterns.Creational.AbstractFactory.interfac.Car;

public class Toyota implements Car {
    @Override
    public void drive() {
        System.out.println("Drive Toyota");
    }
}
