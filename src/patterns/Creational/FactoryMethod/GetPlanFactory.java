package patterns.Creational.FactoryMethod;
// It`s my Factory where i choose what object i need to create in runtime
public class GetPlanFactory {

    public Plan getPlan(String planType){
        if (planType == null){
            return null;
        }
        if (planType.equalsIgnoreCase("DomesticPlan")){
            return new DomesticPlan();
        }
        if (planType.equalsIgnoreCase("CommercialPlan")){
            return new CommercialPlan();
        }
        if (planType.equalsIgnoreCase("ReaderPlan")){
            return new ReaderPlan();
        }
        return null;
    }
}
