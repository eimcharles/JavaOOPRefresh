package inheritance.vehicle.exercises;

import inheritance.vehicle.subClass.Bus;

public class Ex3 {

    /**
     * 		A final method in a SuperClass cannot be OVERRIDDEN
     * 		by the child class.
     *
     * 		Given that the setNumberOfDoors(int numberOfDoors)
     * 		in the parent class is final.
     *
     * 		We overload the method with setNumberOfDoors() in
     * 	    order for the child class to be able to set its
     * 	    own numberOfDoors attribute.
     *
     * */

    public static void main(String[] args) {

        Bus bus1 = new Bus();

        // Using the child overloaded setNumberOfDoors() method to set the number of doors
        bus1.setNumberOfDoors();;
        System.out.println(bus1);
    }
}
