package dependencyInjection.goodPractice;

public class Main {

    public static void main(String[] args) {

        // CarDAO, EmailDAO and MOTService are injected into the CarService class - 3 dependencies
        CarService carService = new CarService(new CarDAO(), new EmailDAO(), new MOTService());

        // MOTService is injected into thw EmailService class - 1 dependency
        EmailService emailService = new EmailService(new MOTService());
    }
}
