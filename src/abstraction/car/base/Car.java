package abstraction.car.base;

/**
 *       Abstract classes should be used when you want to define a common
 *       base for related classes but do not want to allow direct instantiation.
 *
 *      They allow you to:
 *      - Provide shared fields and concrete methods for all subclasses.
 *      - Declare abstract methods that must be implemented by subclasses.
 *      - Enforce a common interface while allowing subclasses to supply
 *        specific behavior.
 *
 *      Purpose: to promote code reuse, consistency, and polymorphism
 *      across a group of related classes.
 */

abstract public class Car {

    protected int numberOfDoors;
    protected static int carCount;
    protected static int price;

    // All RaceCar or Truck constructors can use it as a base price.
    {
        price = 10_000;
    }

    public Car(){
        this.numberOfDoors = 4;
        carCount++;
    }

    /**
     *      Method is declared without
     *      implementation
     *
     *      - It cannot be private / final
     *        because it needs to be overridden
     *        in the concrete class - Subclass
     *
     *      Any Class that extends Car must
     *      provide an implementation for this method
     *
     *      This enforces shared behaviour that
     *      the subclass must implement.
     *
     *      The specific behaviour is then invoked
     *      by the use of polymorphism.
     *
     * */

    protected abstract void setNumberOfDoors(int numberOfDoors);
    protected abstract int getPrice();

    /**
     *      Abstract classes can contain
     *      static method that belong to the class
     * */

    public static void getCarCount(){
        System.out.println("Total cars: " + carCount);
    }

    /**
     *      General utility methods for arrays of Car objects.
     *
     *      These methods work for any subclass of Car, relying on
     *      overridden methods like toString() and getPrice() to provide
     *      subclass-specific behavior while keeping the code general.
     */

    public static void ListOfManufacturedCars(Car[] car){
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }
    }

    public static void getPriceOfManufacturedCars(Car[] car){
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i].getPrice());
        }
    }

    /**
     *      Default method for all subclasses to inherit,
     *      unless they override it,
     * */

    @Override
    public String toString() {
        return "Car { numberOfDoors = %d}".formatted(numberOfDoors);
    }
}
