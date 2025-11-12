package abstraction.shape;

abstract public class Shape {

    protected String color;

    public Shape(String colour) {
        this.color = colour;
    }

    /**
     *      protected abstract double area()
     *
     *      - Enforces encapsulation at the abstract class level.
     *      - Only subclasses (or classes in the same package) can see or override it.
     *      - The abstract class controls how outside code interacts with this internal method,
     *
     *        e.g., via public methods like printArea().
     */

    protected abstract double area();

    public void printArea(){
        System.out.println("Area: " + area());
    }

    public void displayColor() {
        System.out.println("This shape has a color of " + color + ".");
    }
}
