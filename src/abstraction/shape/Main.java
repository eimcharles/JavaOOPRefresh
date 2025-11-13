package abstraction.shape;

import abstraction.shape.base.Circle;
import abstraction.shape.subClass.Shape;

public class Main {

    public static void main(String[] args) {

        Shape shape = new Circle("Yellow", 5);
        shape.displayColor();
        shape.printArea();
    }
}
