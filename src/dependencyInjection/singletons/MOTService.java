package dependencyInjection.singletons;

public class MOTService {
    // Methods and attributes for MOTService

    private EmailService emailService;

    public MOTService(EmailService emailService) {
        this.emailService = emailService;
    }
}
