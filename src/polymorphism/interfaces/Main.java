package polymorphism.interfaces;

import polymorphism.interfaces.implementation.Bicycle;
import polymorphism.interfaces.implementation.Car;
import polymorphism.interfaces.implementation.ElectricScooter;
import polymorphism.interfaces.person.Person;
import polymorphism.interfaces.VehicleInterface.Vehicle;

public class Main {

    /**
     *
     *      Runtime (Dynamic) Polymorphism
     *
     *      Multiple classes need to perform the same action in different
     *      ways. This can be achieved through interfacing.
     *
     *      Classes that perform the same action in different ways:
     *
     *      Car Class actions: move(), break(), getCurrentSpeed()
     *      Bicycle Class actions: move() , break(), getCurrentSpeed()
     *      ElectricScooter Class actions: move(), break(), getCurrentSpeed()
     *
     *      Interfaces define a contract that enforces
     *      shared capabilities across classes.
     *
     *      Any class that implements the interface must provide
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
         *      Polymorphism works because all classes implement Vehicle interface.
         *
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
