package patterns.Creational.AbstractFactory.car;

import patterns.Creational.AbstractFactory.interfac.Car;
import patterns.Creational.AbstractFactory.interfac.Tank;
import patterns.Creational.AbstractFactory.factories.AbstractFactory;
import patterns.Creational.AbstractFactory.interfac.Factory;

public class Main {
    public static void main(String[] args) {
        Factory carFactory = new AbstractFactory().createFactory("Car");
        Factory tankFactory = new AbstractFactory().createFactory("Tank");
        Car toyota = carFactory.createCar("Toyota");
        toyota.drive();
        Tank t800 = tankFactory.createTank("T800");
        t800.drive();
    }
}
