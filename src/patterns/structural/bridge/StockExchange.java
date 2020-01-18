package patterns.structural.bridge;

import patterns.structural.bridge.interfaces.Developer;

public class StockExchange extends Program {
    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    protected void developProgram() {
        System.out.println("Stock Exchange development in progress");
        developer.writeCode();
    }
}
