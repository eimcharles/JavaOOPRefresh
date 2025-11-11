package inheritance.vehicle.base;

import java.math.BigDecimal;
import java.util.Objects;

public class Vehicle {

    private int numberOfDoors;
    private BigDecimal price;

    public Vehicle() {
        System.out.println("Creating a vehicle");
        this.numberOfDoors = 2;
        this.price = BigDecimal.valueOf(10_000);
    }

    public Vehicle(int numberOfDoors, BigDecimal price) {
        this.numberOfDoors = numberOfDoors;
        this.price = price;
    }

    public Vehicle(Vehicle vehicleToCopy) {
        this.numberOfDoors = vehicleToCopy.numberOfDoors;
        this.price = vehicleToCopy.price;
    }

    public int getNumberOfDoors(){
        return this.numberOfDoors;
    }

    public BigDecimal getPrice(){
        return this.price;
    }

    // Final method in parent class that cannot be overridden - overloaded in child class
    final public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    // Parent method that is overridden in the child class
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return numberOfDoors == vehicle.numberOfDoors && Objects.equals(price, vehicle.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfDoors, price);
    }

    @Override
    public String toString() {
        return "Vehicle has %d doors and it price is %s$.".formatted(this.numberOfDoors, this.price);
    }
}
