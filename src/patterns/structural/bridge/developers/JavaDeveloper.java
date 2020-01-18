package patterns.structural.bridge.developers;

import patterns.structural.bridge.interfaces.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer write Java code...");
    }
}
