package patterns.Creational.AbstractFactory.factories;

import patterns.Creational.AbstractFactory.interfac.Factory;

public class AbstractFactory {
    public Factory createFactory(String typeOfFactory){
        switch (typeOfFactory){
            case "Tank" : return new TankFactory();
            case "Car": return new CarFactory();
            default: return null;
        }
    }
}
