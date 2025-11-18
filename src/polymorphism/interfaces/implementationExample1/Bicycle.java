package polymorphism.interfaces.implementationExample1;

import polymorphism.interfaces.vehicleInterface.Vehicle;

import java.io.Serializable;

public class Bicycle implements Vehicle, Serializable {

    private int currentSpeed;

    public Bicycle() {}

    public Bicycle(int currentSpeed) {
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
        return "Bicycle { currentSpeed = %d}".formatted(currentSpeed);
    }
}
