package patterns.Creational.Builder;

public class Main {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar.Builder("Audi").setColor("green").setMaxSpeed(250).build();
        System.out.println(sportCar.getColor());
        System.out.println(sportCar.getName());
    }
}
