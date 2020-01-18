package patterns.Creational.AbstractFactory.interfac;

public interface Factory  {
    Car createCar(String typeOfCar);
    Tank createTank(String typeOfTank);
}
