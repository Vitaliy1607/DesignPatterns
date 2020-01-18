package patterns.structural.bridge;


import patterns.structural.bridge.developers.CppDeveloper;
import patterns.structural.bridge.developers.JavaDeveloper;

public class ProgramCreator {
    public static void main(String[] args) {
        Program [] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())};

        for (Program program : programs){
            program.developProgram();
        }
    }
}
