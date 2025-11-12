package polymorphism.abstractWithInterfaces;

abstract public class Shape implements Drawable {

    protected String color;

    public Shape(String colour) {
        this.color = colour;
    }

    /**
     *      Shape defines common behavior area() for all shapes
     *      but doesn’t provide an implementation.
     */

    protected abstract double area();

    public void printArea(){
        System.out.println("Area: " + area());
    }

    public void displayColor() {
        System.out.println("This shape has a color of " + color + ".");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}