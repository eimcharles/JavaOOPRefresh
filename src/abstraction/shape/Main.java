package abstraction.shape;

import abstraction.shape.subClass.Circle;
import abstraction.shape.subClass.Shape;

public class Main {

    /**
     *     Encapsulation / Access Modifiers:
     *       - `protected String color` allows subclasses
     *       to access it while hiding it from unrelated classes.
     *
     *       - `protected abstract area()` enforces implementation
     *       in subclasses without exposing it publicly.
     *
     *       - Public methods like `printArea()` and `displayColor()`
     *       provide controlled access to external code.

     *     Concrete Method Using Abstract Method:
     *       `printArea()` calls the abstract `area()` method,
     *       providing a public interface to the abstract calculation.
     */

    public static void main(String[] args) {

        Shape shape = new Circle("Yellow", 5);
        shape.displayColor();
        shape.printArea();
    }
}
