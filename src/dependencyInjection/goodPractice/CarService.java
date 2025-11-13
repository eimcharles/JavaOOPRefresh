package dependencyInjection.goodPractice;

public class CarService {

    /**
     *      The carDao, emailDAO and motService
     *      dependencies are injected
     *      into the CarService constructor, instead of
     *      creating them internally.
     *
     *      Dependency injection promotes loose coupling,
     *      easier testing, and flexibility.
     */

    private CarDAO carDAO;
    private EmailDAO emailDAO;
    private MOTService motService;

    // One constructor that injects all required dependencies
    public CarService(CarDAO carDAO, EmailDAO emailDAO, MOTService motService) {
        this.carDAO = carDAO;
        this.emailDAO = emailDAO;
        this.motService = motService;
    }
}
