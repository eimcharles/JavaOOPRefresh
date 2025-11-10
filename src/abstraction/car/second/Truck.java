package abstraction.car.second;

import abstraction.car.first.Car;

import java.util.Objects;

public class Truck extends Car {

    private int numberOftires;

    // Belongs to Truck class
    private int price;

    public Truck(int numberOftires) {
        super();
        this.numberOftires = numberOftires;
        price = Car.price + 30_000;

    }

    public int getNumberOftires() {
        return numberOftires;
    }

    public void setNumberOftires(int numberOftires) {
        this.numberOftires = numberOftires;
    }

    /**
     *      Implements the abstract method from the Car class.
     *
     *      Specific behaviour for the subclass:
     *
     *      Sets the number of doors for this specific vehicle instance.
     *      This method must be implemented by any concrete subclass of Car
     *      because it is declared as abstract in the parent class.
     */

    @Override
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck = (Truck) o;
        return numberOftires == truck.numberOftires && price == truck.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOftires, price);
    }

    /**
     *      Provides a string representation of the Truck object.
     *
     *      Overrides the toString() method from the Car class to include
     *      Truck-specific details such as the number of tires and the number of doors.
     *      This allows printing or logging Truck objects in a readable format.
     */

    @Override
    public String toString() {
        return "Truck{ numberOftires = %d, numberOfDoors = %d}".formatted(numberOftires, numberOfDoors);
    }

}
