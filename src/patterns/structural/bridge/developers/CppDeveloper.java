package patterns.structural.bridge.developers;

import patterns.structural.bridge.interfaces.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ debveloper write C++ code..");
    }
}
