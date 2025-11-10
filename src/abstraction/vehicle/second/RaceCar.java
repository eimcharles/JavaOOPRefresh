package abstraction.vehicle.second;

import abstraction.vehicle.first.Car;

import java.util.Objects;

public class RaceCar extends Car {

    protected int horsePower;

    // Belongs to RaceCar class
    protected int price;

    public RaceCar(int horsePower) {
        super();
        this.horsePower = horsePower;
        price = Car.price + 50_000;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
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
    protected void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    protected int getPrice() {
        return this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RaceCar raceCar = (RaceCar) o;
        return horsePower == raceCar.horsePower && price == raceCar.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(horsePower, price);
    }

    /**
     *      Provides a string representation of the RaceCar object.
     *
     *      Overrides the toString() method from the Car class to include
     *      RaceCar-specific details such as horse power and the number of doors.
     *      This allows printing or logging RaceCar objects in a readable format.
     *
     */

    @Override
    public String toString() {
        return "RaceCar { horsePower = %d, numberOfDoors = %d}".formatted(horsePower, numberOfDoors);
    }
}
