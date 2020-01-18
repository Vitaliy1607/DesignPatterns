package patterns.Creational.FactoryMethod;

public class CommercialPlan extends Plan {
    @Override
    void getRate() {
        rate = 7.5f;
    }
}
