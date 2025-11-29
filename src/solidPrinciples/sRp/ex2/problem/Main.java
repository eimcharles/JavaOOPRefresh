package solidPrinciples.sRp.ex2.problem;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(10);
        Square square = new Square(10);

        // Creates a new, unmodifiable List
        List<Object> shapes = List.of(circle, square);

        // Single class with two responsibilities
        AreaCalculator areaCalculator = new AreaCalculator();

        // Iterates through the shapes list, calculates the area for each shape,
        // Returns the total totalAreaShapesSum of all the areas of shapes in shape
        double totalArea = areaCalculator.totalAreaOfAllShapes(shapes);

        System.out.println(totalArea);
        System.out.println(areaCalculator.displayTotalAreaOfAllShapesJson(shapes));
    }
}
