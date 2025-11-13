package dependencyInjection.badPractice;

public class CarService {

    /**
     *      The Car CarService "has a" carDao
     *      object.
     *
     *      However, The CarService class directly depends
     *      on a specific implementation of carDao.
     *
     *      Drawbacks:
     *      - Tight coupling (depends on specific class)
     *      - Fixed to one implementation (carDao Class)
     *      - Low flexibility
     * */

    private CarDAO carDao = new CarDAO();
}
