package patterns.Creational.AbstractFactory.factories;

import patterns.Creational.AbstractFactory.interfac.Car;
import patterns.Creational.AbstractFactory.interfac.Factory;
import patterns.Creational.AbstractFactory.interfac.Tank;
import patterns.Creational.AbstractFactory.tank.T1000;
import patterns.Creational.AbstractFactory.tank.T800;

public class TankFactory implements Factory {
    @Override
    public Car createCar(String typeOfCar) {
        return null;
    }

    public Tank createTank(String typeOfTank){
        switch (typeOfTank){
            case "T800": return new T800();
            case "T1000": return new T1000();
            default:return null;
        }
    }
}
