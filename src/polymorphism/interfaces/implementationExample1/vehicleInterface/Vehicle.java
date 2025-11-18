package polymorphism.interfaces.implementationExample1.vehicleInterface;

public interface Vehicle {

    double PURCHASE_TAX = 1.15;

    /**
     *      Interfaces in Java:
     *
     *      Can contain:
     *         - Abstract methods (methods without a body)
     *         - Default methods (methods with a default implementation, Java 8+)
     *         - Static methods
     *         - Constants (public static final fields)
     *
     *      Cannot contain:
     *          - Instance fields (variables that belong to an object)
     *          - Constructors (interfaces cannot be instantiated)
     *          - Non-static, non-final variables
     *
     *      Purpose:
     *          - Define a contract that classes can implement
     *          - Enable polymorphism without enforcing inheritance
     */

     void move(int amount);
     void applyBreaks(int amount);
     int getCurrentSpeed();
     String toString();

    /**
     *      Default implementation provided in the interface.
     *
     *      Allows implementing classes to use a predefined method (milesToKm)
     *      without requiring their own implementation, unless they choose to override it.
     */

     default double milesToKm(){
         return getCurrentSpeed() * 1.609;
     }

     static double getPurchaseTax(){
         return PURCHASE_TAX;
     }

}
