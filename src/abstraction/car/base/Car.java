package abstraction.car.base;

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
     *      Abstract class methods are declared without
     *      implementation.
     *
     *      - They cannot be private / final
     *        because they need to be overridden
     *        in concrete classes - Subclasses
     *
     *      Any Class that extends Car must
     *      provide an implementation for abstract
     *      methods.
     *
     *      This enforces shared behaviour that
     *      the subclasses must implement.
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
     *      The car Class contains common behaviors:
     *      ListOfManufacturedCars() and getPriceOfManufacturedCars()
     *
     *      These methods work for any subclass of Car, relying on
     *      overridden methods like toString() and getPrice() to provide
     *      subclass-specific behavior.
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
     *      unless overridden.
     * */

    @Override
    public String toString() {
        return "Car { numberOfDoors = %d}".formatted(numberOfDoors);
    }
}
