package inheritance.vehicle;

import java.math.BigDecimal;
import java.util.Objects;

public class Bus extends Vehicle {

    /**
     *         The bus class does not have direct access to
     *         its inherited attributes given that they
     *         are declared private in the vehicle class
     *
     *         Therefore, it uses method overriding to set
     *         its own price through the parent by calling
     *         super.setPrice() to update its own price.
     *
     *         Moreover, it uses method overloading to
     *         set its own numberOfDoors given that
     *         the setNumbOfDoors() method is final
     *         and cannot be overloaded in the child
     *         class.
     * */

    private int passengerCapacity;

    // Calls vehicle default constructor upon instantiation
    public Bus() {
        System.out.println("Creating a bus");
    }

    // Calls vehicle constructor upon instantiation
    public Bus(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    // Calls vehicle copy constructor upon instantiation
    public Bus(Bus busToCopy) {
        this.passengerCapacity = busToCopy.passengerCapacity;
    }

    public int getPassCapacity() {
        return this.passengerCapacity;
    }

    public void setPassCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    // Overrides the parent class setPrice() method and sets the price through the parent given private access modifier for attributes
    @Override
    public void setPrice(BigDecimal price) {
        System.out.println("Using the overridden setPrice method to set the new price");
        super.setPrice(price);
    }

    // Overloads the final method in the parent class given it cannot be overridden
    public void setNumberOfDoors(){
        System.out.println("Using the overloaded setNumberOfDoors method to set the number of doors");
        setNumbOfDoors(5);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return passengerCapacity == bus.passengerCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerCapacity);
    }

    // Call to parent methods to display all attributes
    public String toString() {
        return "Bus has %d doors and its price is: %s$ with passenger capacity of %d passengers.".formatted(getNumbOfDoors(), getPrice(), this.passengerCapacity);
    }
}
