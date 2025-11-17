package usefulExtraExercises.carGarageOOPExample.garageService;

import usefulExtraExercises.carGarageOOPExample.garage.Garage;
import usefulExtraExercises.carGarageOOPExample.car.Car;

public class GarageService {

    /**
     *      GarageService Contains service
     *      logic for the GarageService class
     * */

    public void addCarToGarage(Garage garage, Car car){

        // Checks garage object - return if null or empty
        if (garage == null || garage.getCarGarage().length == 0) {
            System.out.println("Garage array not initialized or null");
            return;
        }

        // Checks car object - return if empty
        if (car == null) {
            System.out.println("Car object not initialized");
            return;
        }

        // Keeps track of the number of cars in the garage
        int updateNumberOfCarsInGarage = garage.getNumberOfCarsInGarage();

        // Keeps track of cars in garage
        Car[] carsAlreadyInGarage = garage.getCarGarage();

        for (int i = 0; i < carsAlreadyInGarage.length; i++) {

            // find the first empty spot in carsAlreadyInGarage and add the car to the empty spot
            if (carsAlreadyInGarage[i] == null){

                // Add the car at that index
                carsAlreadyInGarage[i] = car;

                // Confirm the car is added
                System.out.println("Car added: " + car);

                // Increment and update the new total
                updateNumberOfCarsInGarage++;
                garage.setNumberOfCarsInGarage(updateNumberOfCarsInGarage);

                // adds only one car at the found null index
                break;
            }
        }

    }

    public void removeMatchingCarFromGarage(Garage garage, Car car){

        // Checks garage object - return if null or empty
        if (garage == null || garage.getCarGarage().length == 0) {
            System.out.println("Garage array not initialized or null");
            return;
        }

        // Checks car object - return if empty
        if (car == null) {
            System.out.println("Car object not initialized");
            return;
        }

        // Flag for if the car that is passed can't be removed / not found
        boolean removed = false;

        // Keeps track of the number of cars in the garage
        int updateNumberOfCarsInGarage = garage.getNumberOfCarsInGarage();

        // Keeps track of cars in garage
        Car[] carsAlreadyInGarage = garage.getCarGarage();

        for (int i = 0; i < updateNumberOfCarsInGarage ; i++) {

            // Checks to see if the passed car is in the garage (use the object reference)
            if (carsAlreadyInGarage[i] == car){

                // Shift all cars after the matching car index i one position to the left
                // Starts at the removed car index j and goes up to the second-to-last used index
                // Stops at the second to last index (to avoid array out of bounds)
                // remove CarB (index i = 1)
                // cars: [CarA, -> CarB, CarC, CarD]

                for (int j = i; j < updateNumberOfCarsInGarage - 1; j++) {

                    // Removes the car with matching brand by shifting by one index
                    // shift operation -> [CarA, -> CarB, CarC, CarD]
                    // shift operation -> [CarA, -> CarC, CarC, CarD]
                    carsAlreadyInGarage[j] = carsAlreadyInGarage[j + 1];

                    }

                // shift operation -> [CarA, CarC, CarD, CarD]
                // Once everything is shifted including the last element.
                // Nullify the last element (move the gap to the last slot)
                // shift operation -> [CarA, CarC, CarD, null]
                carsAlreadyInGarage[updateNumberOfCarsInGarage - 1] = null;

                // Confirm the removed car
                System.out.println("Car removed: " + car);

                // Flip the flag, the car is found and removed
                removed = true;

                // Decrement and update the new total
                updateNumberOfCarsInGarage--;
                garage.setNumberOfCarsInGarage(updateNumberOfCarsInGarage);

                // Only remove one car
                break;

            }

        }

        // After looking through inventory, car still not found print message
        if (!removed) {
            System.out.println("Car to be removed not found");
        }

    }

    public void displayCarsInInventory(Car[] carGarageCopy){

        // If carGarageCopy is null or empty - return
        if (carGarageCopy == null || carGarageCopy.length == 0) {
            System.out.println("carGarageCopy array not initialized");
            return;
            }

        for (int i = 0; i < carGarageCopy.length; i++) {
            // Displays each car at a given inventory index
            System.out.println(carGarageCopy[i]);
        }
    }

    public Car[] getAllCarsInGarage(Garage garage){

        // If garage is null or empty - return an empty array
        if (garage == null || garage.getCarGarage().length == 0) {
            System.out.println("Garage array not initialized or null - returning empty array");
            return new Car[0];
        }

        // Keeps track of cars in garage
        int updateNumberOfCarsInGarage = garage.getNumberOfCarsInGarage();

        // Create copy with the same number of cars in the garage
        Car[] copyOfAllCarsInGarage = new Car[updateNumberOfCarsInGarage];

        // Copies the indexes that contain car values, doesn't copy null values
        System.arraycopy(garage.getCarGarage(), 0, copyOfAllCarsInGarage, 0, garage.getNumberOfCarsInGarage());

        // Return the copied array
        return copyOfAllCarsInGarage;

    }

}
