package patterns.Creational.AbstractFactory.factories;

import patterns.Creational.AbstractFactory.Toyota;
import patterns.Creational.AbstractFactory.car.Audi;
import patterns.Creational.AbstractFactory.interfac.Car;
import patterns.Creational.AbstractFactory.interfac.Tank;
import patterns.Creational.AbstractFactory.interfac.Factory;

public class CarFactory implements Factory {
    public Car createCar(String typeOfCar){
        switch (typeOfCar){
            case "Audi": return new Audi();
            case "Toyota": return new Toyota();
            default: return null;
        }
    }

    @Override
    public Tank createTank(String typeOfTank) {
        return null;
    }
}
