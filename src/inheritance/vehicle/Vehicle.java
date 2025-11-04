package inheritance.vehicle;

import java.math.BigDecimal;
import java.util.Objects;

public class Vehicle {

    private int numbOfDoors;
    private BigDecimal price;

    public Vehicle() {
        System.out.println("Creating a vehicle");
        this.numbOfDoors = 2;
        this.price = BigDecimal.valueOf(10);
    }

    public Vehicle(int numbOfDoors, BigDecimal price) {
        this.numbOfDoors = numbOfDoors;
        this.price = price;
    }

    public Vehicle(Vehicle vehicleToCopy) {
        this.numbOfDoors = vehicleToCopy.numbOfDoors;
        this.price = vehicleToCopy.price;
    }

    public int getNumbOfDoors(){
        return this.numbOfDoors;
    }

    public BigDecimal getPrice(){
        return this.price;
    }

    final public void setNumbOfDoors(int numbOfDoors) {
        this.numbOfDoors = numbOfDoors;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return numbOfDoors == vehicle.numbOfDoors && Objects.equals(price, vehicle.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbOfDoors, price);
    }

    @Override
    public String toString() {
        return "Vehicle has %d doors and it price is %s$.".formatted(this.numbOfDoors, this.price);
    }
}
