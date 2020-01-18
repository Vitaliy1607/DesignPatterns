package patterns.Creational.Prototype;

public class Student implements Cloneable {
    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }
}
