package patterns.Creational.FactoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.println("Enter which plan is be displayed");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String planName = bufferedReader.readLine();
        System.out.println("Enter number of units");
        int units = Integer.parseInt(bufferedReader.readLine());

        Plan plan = planFactory.getPlan(planName);

        plan.getRate();
        plan.calculateBill(units);
    }
}
