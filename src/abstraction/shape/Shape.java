package abstraction.shape;

abstract public class Shape {

    protected String color;

    public Shape(String colour) {
        this.color = colour;
    }

    protected abstract double area();

    public void printArea(){
        System.out.println("Area: " + area());
    }

    public void displayColor() {
        System.out.println("This shape a color of " + color + ".");
    }
}
