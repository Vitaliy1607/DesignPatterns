package patterns.structural.flyweight;

import java.util.*;


/* In this program i use Flyweight Pattern where we put our object in common Map and than
 We reuse this object instead of recreate*/
public class FlyweightPattern {
    public static void main(String[] args) {

        FlyweightFactory flyweightFactory = new FlyweightFactory();

        List<Figure> figures = new ArrayList<>();

        figures.add(flyweightFactory.getFigure("square"));
        figures.add(flyweightFactory.getFigure("circle"));
        figures.add(flyweightFactory.getFigure("circle"));
        figures.add(flyweightFactory.getFigure("triangle"));
        figures.add(flyweightFactory.getFigure("square"));
        figures.add(flyweightFactory.getFigure("circle"));

        Random random = new Random();
        for (Figure figure : figures){
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            figure.draw(x,y);
        }
    }
}

interface Figure{
    void draw(int x, int y);
}

class Circle implements Figure{
    int radius = 5;
    @Override
    public void draw(int x, int y) {
        System.out.println("("+x+","+y+") + Draw Circle");
    }
}


class Square implements Figure{
    @Override
    public void draw(int x, int y) {
        System.out.println("("+x+","+y+") + Draw Square");
    }
}


class Triangle implements Figure{
    @Override
    public void draw(int x, int y) {
        System.out.println("("+x+","+y+") + Draw Triangle");
    }
}

class FlyweightFactory{
   private static final Map<String, Figure> figures = new HashMap<>();

    public Figure getFigure(String figureName){

        Figure figure = figures.get(figureName);
        if (figure == null){
            switch (figureName){
                case "circle":
                    figure = new Circle();
                    break;
                case "square":
                    figure = new Square();
                    break;
                case "triangle":
                    figure = new Triangle();
                    break;
            }
            figures.put(figureName,figure);
        }
        return figure;
    }
}