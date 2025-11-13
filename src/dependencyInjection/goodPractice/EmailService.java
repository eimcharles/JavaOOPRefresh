package dependencyInjection.goodPractice;

public class EmailService {

    /**
     *      EmailService injects a
     *      MOTService dependency.
     * */

    private MOTService motService;

    public EmailService(MOTService motService) {
        this.motService = motService;
    }
}
