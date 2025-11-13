package dependencyInjection.singletons;

public class Main {

    public static void main(String[] args) {

        /**
         *      Problem:
         *
         *      Supposed CarService or MOTService wants to
         *      send emails.
         *
         *      This could potentially lead to email duplicates,
         *      or wasted resources.
         *
         *      Solution:
         *
         *      The singleton pattern ensures that only
         *      ONE instance of EmailService exists
         *      in the application.
         *
         *      This provides a single point of access,
         *      consistent configuration, reduced resource
         *      usage, and easier maintenance.
         *
         *      We can do the same for MOTService.
         */

        // CarService dependencies - duplicate instances of EmailService passed into MOTService
        CarService carService = new CarService(new CarDAO(), new EmailService(), new MOTService(new EmailService()));

        // MOTService dependencies - duplicate instances of EmailService into MOTService
        MOTService motService =  new MOTService(new EmailService());
    }

}
