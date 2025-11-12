package polymorphism.interfaces;

public class Main {

    /**
     *      Polymorphism: many forms
     *
     *      Runtime (Dynamic) Polymorphism:
     *      - Achieved through method overriding.
     *      - Subclass provides a specific implementation of a superclass method.
     *      - Method to execute is determined at runtime based on the actual object.
     *
     *      Car - move, break, getCurrentSpeed
     *      Bicycle - move, break, getCurrentSpeed
     *      Electric Scooter - move, break, getCurrentSpeed
     *
     *      Interfaces define a contract that enforces
     *      shared capabilities across classes. Any class
     *      that implements the interface must provide
     *      implementations for its methods, ensuring
     *      consistent behavior and enabling polymorphism.
     *
     * */

    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        ElectricScooter electricScooter = new ElectricScooter();
        double milesConverted;

        Vehicle[] vehicles = {car, bicycle, electricScooter};

        Person john = new Person("John", vehicles);
        System.out.println(john);
        System.out.println();

        /**
         *      Polymorphism works because all classes implement Vehicle.
         *      The Vehicle array can hold any Vehicle type, and calling move()
         *      invokes the correct implementation for each object at runtime.
         */

        for (Vehicle vehicle : vehicles) {

            if (vehicle.getClass().getSimpleName().equals("Car")){
                vehicle.move(80);
                milesConverted =  vehicle.milesToKm();
                System.out.println(vehicle.getClass().getSimpleName() + " speed in Mph "+ milesConverted);
                System.out.println(vehicle);
                System.out.println();
            }

            if (vehicle.getClass().getSimpleName().equals("Bicycle")){
                vehicle.move(50);
                milesConverted =  vehicle.milesToKm();
                System.out.println(vehicle.getClass().getSimpleName() + " speed in Mph "+ milesConverted);
                System.out.println(vehicle);
                System.out.println();            }

            if (vehicle.getClass().getSimpleName().equals("ElectricScooter")){
                vehicle.move(30);
                milesConverted =  vehicle.milesToKm();
                System.out.println(vehicle.getClass().getSimpleName()+ " speed in Mph "+ milesConverted);
                System.out.println(vehicle);
                System.out.println();
            }
        }
    }
}
