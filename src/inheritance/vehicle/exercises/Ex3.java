package inheritance.vehicle.exercises;

import inheritance.vehicle.Bus;

public class Ex3 {

    /**
     *
     * 		A final method in a SuperClass cannot be OVERRIDDEN
     * 		by the child class.
     *
     * 		Given that the setPrice() method
     * 		in the parent class is final
     *
     * 		The overloaded method doesn't have the same signature as
     * 		the parent final setPrice() method:
     *
     * 		- setPrice(price);
     *
     * 		We don't need the keyword super.setPrice(price);
     * 		because we have never overwritten it.
     *
     * */

    public static void main(String[] args) {

        Bus bus1 = new Bus();

        // Using the subClass overloaded method to set the number of doors given that the method is declared final in parent
        bus1.setNumberOfDoors();;
        System.out.println(bus1);
    }
}
