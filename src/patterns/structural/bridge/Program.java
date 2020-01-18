package patterns.structural.bridge;

import patterns.structural.bridge.interfaces.Developer;

public abstract class Program {
    protected Developer developer;
    protected Program(Developer developer){
        this.developer = developer;
    }

    protected abstract void developProgram();

}
