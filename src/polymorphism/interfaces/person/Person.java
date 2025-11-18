package polymorphism.interfaces.person;

import polymorphism.interfaces.vehicleInterface.Vehicle;

import java.util.Arrays;
import java.util.Objects;

public class Person {

    /**
     *      Allows for a Person object
     *      to have one Vehicle or
     *      multiple Vehicles
     * */

    private String name;
    private Vehicle vehicle;
    private Vehicle[] vehicles;


    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Vehicle[] vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(vehicle, person.vehicle) && Objects.deepEquals(vehicles, person.vehicles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, vehicle, Arrays.hashCode(vehicles));
    }

    @Override
    public String toString() {
        return "Person { name = '%s', vehicle = %s, vehicles = %s}".formatted(name, vehicle, Arrays.toString(vehicles));
    }
}