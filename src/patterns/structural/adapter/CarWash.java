package patterns.structural.adapter;

import patterns.structural.adapter.interfaces.Car;

public class CarWash {
    public void washCar(Car car){
        car.wash();
    }
}
