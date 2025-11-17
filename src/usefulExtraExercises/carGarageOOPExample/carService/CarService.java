package usefulExtraExercises.carGarageOOPExample.carService;

import usefulExtraExercises.carGarageOOPExample.car.Car;

public class CarService {

    /**
     *      CarService Contains service
     *      logic for the CarService class
     * */

    public void repairCar(Car car){

        // Checks car object - return if empty
        if (car == null) {
            System.out.println("Car Object not initialized");
            return;
        }
        // Logic to perform a repair on a given Car Object...
        System.out.println("Car repaired: " + car.getBrand()+ " " + car.getModel());
    }

    public void washCar(Car car){

        // Checks car object - return if empty
        if (car == null) {
            System.out.println("Car Object not initialized" );
            return;
        }
        // Logic to wash a Car Object...
        System.out.println("Car washed: " + car.getBrand()+ " " + car.getModel());
    }

    public void refuelCar(Car car){

        // Checks car object - return if empty
        if (car == null) {
            System.out.println("Car Object not initialized");
            return;
        }
        // Logic to refuel a Car Object...
        System.out.println("Car refueled: " + car.getBrand()+ " " + car.getModel());
    }
}
