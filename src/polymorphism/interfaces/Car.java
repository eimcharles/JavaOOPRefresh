package polymorphism.interfaces;

import java.io.Serializable;

public class Car implements Vehicle , Serializable {

    private int currentSpeed;

    public Car(){}

    public Car(int currentSpeed) {
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
        return "Car { currentSpeed = %d }".formatted(currentSpeed);
    }
}
