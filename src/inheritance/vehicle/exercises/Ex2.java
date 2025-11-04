package inheritance.vehicle.exercises;

import inheritance.vehicle.Bus;

import java.math.BigDecimal;

public class Ex2 {

    /**
     * 		SuperClass Method Overriding within the child class
     *
     * 		We can override in different Classes
     *
     * 		Although a subClass inherits methods from a superClass,
     * 		it can override an inherited methods if necessary.
     *
     * */

    public static void main(String[] args) {

        Bus bus1 = new Bus();

        // Using the subClass overridden method
        bus1.setPrice(new BigDecimal(2000));
        System.out.println(bus1);
    }
}
