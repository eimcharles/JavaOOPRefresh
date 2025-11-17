package usefulExtraExercises.carGarageOOPExample.garage;

import usefulExtraExercises.carGarageOOPExample.car.Car;

import java.util.Arrays;
import java.util.Objects;

public class Garage {

    private Car[] carGarage;
    private int numberOfCarsInGarage;

    public Garage(int numberOfCarsInGarage) {
        this.carGarage = new Car[numberOfCarsInGarage];
        this.numberOfCarsInGarage = 0;
    }

    public Car[] getCarGarage() {
        return carGarage;
    }

    public void setCarGarage(Car[] carGarage) {
        this.carGarage = carGarage;
    }

    public int getNumberOfCarsInGarage() {
        return numberOfCarsInGarage;
    }

    public void setNumberOfCarsInGarage(int numberOfCarsInGarage) {
        this.numberOfCarsInGarage = numberOfCarsInGarage;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return numberOfCarsInGarage == garage.numberOfCarsInGarage && Objects.deepEquals(carGarage, garage.carGarage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(carGarage), numberOfCarsInGarage);
    }

    @Override
    public String toString() {
        return "Garage {carGarage = %s, numberOfCarsInGarage = %d}".formatted(Arrays.toString(carGarage), numberOfCarsInGarage);
    }
}
