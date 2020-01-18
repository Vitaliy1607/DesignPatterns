package patterns.Creational.Singleton;

public class Singleton {
 static Singleton singleton = new Singleton();
    private Singleton(){
    }
    public static Singleton getInstance(){
        return singleton;
    }
}
