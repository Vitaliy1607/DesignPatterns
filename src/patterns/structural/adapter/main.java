package patterns.structural.adapter;

import patterns.structural.adapter.CarWash;
import patterns.structural.adapter.vehicles.Volvo;
import patterns.structural.adapter.wrapper.TrackWrapper;

public class main {
    public static void main(String[] args) {
        CarWash carWash = new CarWash();
        carWash.washCar(new TrackWrapper(new Volvo()));
    }
}
