package patterns.structural.bridge;

import patterns.structural.bridge.interfaces.Developer;

public class BankSystem extends Program {
    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    protected void developProgram() {
        System.out.println("Bank system development in progress");
        developer.writeCode();
    }


}
