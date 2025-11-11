package inheritance.vehicle.exercises;

import inheritance.vehicle.subClass.Bus;
import inheritance.vehicle.base.Vehicle;

public class Ex1 {

    public static void main(String[] args) {

        /**
         *		Any object of a subclass class can invoke superclass
         *		methods, just like any of its own methods.
         *
         *      IMPORTANT:
         *
         *      Subclasses should set the attributes with their own methods
         *      not by access through Superclass methods.
         * */

        Vehicle vehicle1 = new Vehicle();
        System.out.println(vehicle1);
        System.out.println();

        // Using the parent setNumbOfDoors(int numberOfDoors) method to set the setNumberOfDoors of the bus object
        Bus bus1 = new Bus();
        bus1.setNumberOfDoors(2);
        System.out.println(bus1);

    }
}
