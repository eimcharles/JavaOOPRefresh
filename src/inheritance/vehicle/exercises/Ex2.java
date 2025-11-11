package inheritance.vehicle.exercises;

import inheritance.vehicle.subClass.Bus;

import java.math.BigDecimal;

public class Ex2 {

    /**
     * 		Superclass Method Overriding within the child class
     *
     * 		Although a subclass inherits methods from a superClass,
     * 		it can override an inherited methods if necessary.
     *
     * 	    IMPORTANT:
     *
     * 	    Attributes of the superclasses should be declared
     * 	    protected in order for subclasses access them
     * 	    directly.
     * */

    public static void main(String[] args) {

        Bus bus1 = new Bus();

        // Using the child overridden setPrice(BigDecimal price) method to set the price of the bus object through the parent with super.setPrice(price)
        bus1.setPrice(new BigDecimal(2000));
        System.out.println(bus1);
    }
}
