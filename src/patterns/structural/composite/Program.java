package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Fruit apple = new Apple();
        Fruit lemone = new Lemon();
        Fruit lemon1 = new Lemon();

        Fruit banana = new Banana();
        Fruit apple1 = new Apple();
        Fruit lemon2 = new Lemon();


        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.addFruit(apple);
        composite1.addFruit(lemone);
        composite1.addFruit(lemon1);

        composite2.addFruit(banana);
        composite2.addFruit(apple1);
        composite2.addFruit(lemon2);
        composite2.removeFruit(apple1);

        composite.addFruit(composite1);
        composite.addFruit(composite2);

        composite.showName();
    }
}
interface Fruit{
    void showName();
}

class Apple implements Fruit{

    @Override
    public void showName() {
        System.out.println(" i am apple");
    }
}

class Banana implements Fruit{

    @Override
    public void showName() {
        System.out.println(" i am banana");
    }
}

class Lemon implements Fruit{

    @Override
    public void showName() {
        System.out.println(" i am lemon");
    }
}

class Composite implements Fruit{

    private List<Fruit> composites = new ArrayList<>();

    public void addFruit(Fruit fruit){
        composites.add(fruit);
    }

    public void removeFruit(Fruit fruit){
        composites.remove(fruit);
    }

    @Override
    public void showName() {
        for (Fruit fruit: composites) {
            fruit.showName();
        }
    }
}

