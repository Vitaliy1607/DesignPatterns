package patterns.Creational.AbstractFactory.tank;

import patterns.Creational.AbstractFactory.interfac.Tank;

public class T800 implements Tank {
    @Override
    public void drive() {
        System.out.println("Drive T-800");
    }
}
