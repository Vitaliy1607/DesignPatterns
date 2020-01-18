package patterns.structural.decorator;

public class Program {
    public static void main(String[] args) {

        Developer developer =
                new TeamLeadJavaDeveloper(new SeniorJavaDeveloper(new JavaDeveloper()));


        System.out.println(developer.makeJob());

    }
}
interface Developer{
    public String makeJob();
}

class JavaDeveloper implements Developer{

    @Override
    public String makeJob(){
        return "Write Java Code...";
    }
}

class DeveloperDecorator implements Developer{

    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}

class SeniorJavaDeveloper extends DeveloperDecorator{


    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview(){
        return "Make code review...";
    }

    @Override
    public String makeJob() {
        return developer.makeJob() + makeCodeReview();
    }
}

class TeamLeadJavaDeveloper extends DeveloperDecorator{

    public TeamLeadJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String informCustomer(){
        return "Informing customer";
    }

    @Override
    public String makeJob() {
        return developer.makeJob() + informCustomer();
    }
}
