package abstraction.car;

import abstraction.car.base.Car;
import abstraction.car.subClass.RaceCar;
import abstraction.car.subClass.Truck;

import static abstraction.car.base.Car.*;

public class Main {

    /**
     *      Main class to demonstrate the usage of the abstract class Car
     *      and its concrete subclasses RaceCar and Truck.
     *
     *      This program shows:
     *          1. How to instantiate concrete subclasses of an abstract class.
     *          2. How abstract methods (setNumberOfDoors) are implemented in subclasses.
     *          3. Polymorphism: storing RaceCar and Truck objects in a Car array.
     *          4. Static methods and fields in abstract classes (getCarCount and ListOfManufacturedCars).
     *          5. Overridden methods: toString() provides subclass-specific output.
     *
     *      The program creates multiple RaceCar and Truck objects, stores them in arrays,
     *      prints their details, and displays the total number of cars manufactured.
     */

    public static void main(String[] args) {

        RaceCar raceCar1 = new RaceCar(500);
        RaceCar raceCar2 = new RaceCar(350);
        RaceCar raceCar3 = new RaceCar(600);

        Car[] raceCars = {raceCar1, raceCar2, raceCar3};
        ListOfManufacturedCars(raceCars);
        getPriceOfManufacturedCars(raceCars);
        getCarCount();
        System.out.println();

        Truck truck1 = new Truck(6);
        truck1.setNumberOfDoors(2);

        Truck truck2 = new Truck(8);
        truck2.setNumberOfDoors(4);

        Truck truck3 = new Truck(12);
        truck3.setNumberOfDoors(3);

        Car[] trucks = {truck1, truck2, truck3};
        ListOfManufacturedCars(trucks);
        getPriceOfManufacturedCars(trucks);
        getCarCount();
        System.out.println();

    }

}
