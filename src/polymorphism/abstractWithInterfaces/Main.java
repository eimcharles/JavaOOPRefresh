package polymorphism.abstractWithInterfaces;

import polymorphism.abstractWithInterfaces.base.Shape;
import polymorphism.abstractWithInterfaces.drawableInterface.Drawable;
import polymorphism.abstractWithInterfaces.subClass.Circle;

public class Main {

    /**
     *      Demonstrates polymorphism and multiple roles of a Circle object:
     *
     *      - As a Shape: printArea() and displayColor() use Circle's area().
     *
     *      - As a Drawable: draw() can be called without knowing the concrete type.
     *
     *      Advantage of this approach is flexibility and decoupling,
     *      allows one object to be treated as different types depending on the reference type.
     */

    public static void main(String[] args) {

        Circle circle = new Circle("Red", 5);

        Shape shape;
        Drawable drawable;

        // For area and color operations
        shape = circle;
        shape.printArea();
        shape.displayColor();

        // For drawing operations
        drawable = circle;
        drawable.draw();
    }
}
