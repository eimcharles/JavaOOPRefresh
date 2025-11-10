package inheritance.vehicle.exercises;

import inheritance.vehicle.Bus;
import inheritance.vehicle.Vehicle;

import java.math.BigDecimal;

public class Ex1 {

    public static void main(String[] args) {

        /**
         * 		Subclasses can access to SuperClass methods
         * 		and attributes:
         *
         *		Any object of a subclass class can invoke superClass
         *		methods, just like any of its own methods.
         *
         *      IMPORTANT:
         *
         *      Subclasses should set the attributes with their own methods
         *      not by access through SuperClass methods
         * */

        Vehicle vehicle1 = new Vehicle();
        System.out.println(vehicle1);
        System.out.println();

        // Using the parent setNumbOfDoors() method to set the price of the bus object
        Bus bus1 = new Bus();
        bus1.setNumbOfDoors(2);
        System.out.println(bus1);

    }
}
