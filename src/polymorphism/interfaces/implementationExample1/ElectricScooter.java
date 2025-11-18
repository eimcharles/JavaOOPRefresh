package polymorphism.interfaces.implementationExample1;

import polymorphism.interfaces.vehicleInterface.Vehicle;

import java.io.Serializable;

public class ElectricScooter implements Vehicle, Serializable {

    /**
     *      Concrete implementation
     *      of the Vehicle interface.
     * */

    private int currentSpeed;

    public ElectricScooter() {}

    public ElectricScooter(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int amount) {
        this.currentSpeed += amount;

    }

    @Override
    public void applyBreaks(int amount) {
        this.currentSpeed -= amount;

    }

    @Override
    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    @Override
    public String toString() {
        return "ElectricScooter { currentSpeed = %d}".formatted(currentSpeed);
    }
}
