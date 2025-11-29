package solidPrinciples.sRp.ex2.solution;

import solidPrinciples.sRp.ex2.problem.Circle;
import solidPrinciples.sRp.ex2.problem.Square;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(10);
        Square square = new Square(10);

        // Creates a new, unmodifiable List
        List<Object> shapes = List.of(circle, square);

        // First class single responsibility
        AreaCalculator areaCalculator = new AreaCalculator();
        double totalArea = areaCalculator.totalAreaOfAllShapes(shapes);
        System.out.println(totalArea);

        // Second class single responsibility with a dependency
        FormatShapesJson formatShapesJson = new FormatShapesJson(areaCalculator);
        System.out.println(formatShapesJson.displayTotalAreaOfAllShapesJson(shapes));
    }
}
