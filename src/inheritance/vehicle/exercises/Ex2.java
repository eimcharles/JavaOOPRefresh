package inheritance.vehicle.exercises;

import inheritance.vehicle.Bus;

import java.math.BigDecimal;

public class Ex2 {

    /**
     * 		SuperClass Method Overriding within the child class
     *
     * 		Although a subClass inherits methods from a superClass,
     * 		it can override an inherited methods if necessary.
     *
     * 	    IMPORTANT:
     *
     * 	    Attributes of the superClasses should be declared
     * 	    protected in order for subClasses access them
     * 	    directly.
     *
     * */

    public static void main(String[] args) {

        Bus bus1 = new Bus();

        // Using the child overridden setNumbOfDoors() method to set the price of the bus object through the parent by  super.setPrice(price)
        bus1.setPrice(new BigDecimal(2000));
        System.out.println(bus1);
    }
}
