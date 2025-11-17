package usefulExtraExercises.carGarageOOPExample;

import usefulExtraExercises.carGarageOOPExample.car.Brand;
import usefulExtraExercises.carGarageOOPExample.car.Car;
import usefulExtraExercises.carGarageOOPExample.car.Model;
import usefulExtraExercises.carGarageOOPExample.carService.CarService;
import usefulExtraExercises.carGarageOOPExample.garage.Garage;
import usefulExtraExercises.carGarageOOPExample.garageService.GarageService;

import java.time.Year;

public class Main {

    public static void main(String[] args) {

        // Create a new car to be added to the garage
        Car mazda = new Car(Brand.MAZDA, Model.CX5, Year.of(1998), "YZ3 K1J");
        Car bmw = new Car(Brand.BMW, Model.M3, Year.of(2021), "YZ3 Z34");
        Car volks = new Car(Brand.VOLKSWAGEN, Model.TIGUAN, Year.of(2024), "K1J Y6N");

        // Create a garage with no cars in it
        Garage garage = new Garage(5);
        GarageService garageService = new GarageService();
        CarService carService = new CarService();

        garageService.addCarToGarage(garage, mazda);
        garageService.addCarToGarage(garage, bmw);
        garageService.addCarToGarage(garage, volks);
        System.out.println();

        // Using a copy of the carGarage to avoid exposing the internal array
        Car[] carsInGarageCopy = garageService.getAllCarsInGarage(garage);
        garageService.displayCarsInInventory(carsInGarageCopy);
        System.out.println();

        // Removing a car
        garageService.removeMatchingCarFromGarage(garage, bmw);
        carsInGarageCopy = garageService.getAllCarsInGarage(garage);
        garageService.displayCarsInInventory(carsInGarageCopy);
        System.out.println();

        // Passing a null objects to addCarToGarage
        garageService.addCarToGarage(null, null);
        // Passing a null objects to addCarToGarage
        garageService.addCarToGarage(garage, null);
        garageService.addCarToGarage(null, mazda);
        System.out.println();

        // Passing a null objects to removeMatchingCarFromGarage
        garageService.removeMatchingCarFromGarage(null, null);
        // Passing a null objects to removeMatchingCarFromGarage
        garageService.removeMatchingCarFromGarage(garage, null);
        garageService.removeMatchingCarFromGarage(null, mazda);
        System.out.println();

        // Passing a null object to displayCarsInInventory
        garageService.displayCarsInInventory(null);
        // Passing a null objects to removeMatchingCarFromGarage
        garageService.getAllCarsInGarage(null);
        System.out.println();

        // Passing a null object to repairCar
        carService.repairCar(null);
        System.out.println();

        // Calling methods in carService
        carService.repairCar(mazda);
        carService.refuelCar(mazda);
        carService.washCar(mazda);

    }

}
