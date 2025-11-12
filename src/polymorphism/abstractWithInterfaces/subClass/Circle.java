package polymorphism.abstractWithInterfaces.subClass;

import polymorphism.abstractWithInterfaces.drawableInterface.Drawable;
import polymorphism.abstractWithInterfaces.base.Shape;

public class Circle extends Shape implements Drawable {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Implementing abstract method from Shape
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    /**
     *      Circle implements draw() to satisfy the Drawable contract.
     *
     *      Circle object can now be treated as a Drawable as well as a Shape.
     * */

    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}
