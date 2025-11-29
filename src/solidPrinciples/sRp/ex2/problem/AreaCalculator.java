package solidPrinciples.sRp.ex2.problem;

import java.util.List;

/**
 *          The “S” in the SOLID principles stands
 *          for the Single Responsibility Principle (SRP),
 *          which states that a class should have only
 *          one reason to change or, in other words,
 *          it should have a single, well-defined
 *          responsibility or task within a software system.
 *
 *          The AreaCalculator class violates SRP because it has two responsibilities:
 *          calculating the total area of all shapes and displaying a json
 *          version of the total area of all shapes result.
 *
 *          Solution: refactor the code to separate concerns and ensure
 *          that each class has a single, well-defined responsibility.
 * */


public class AreaCalculator {

    // First responsibility
    public double totalAreaOfAllShapes(List<Object> shapes){

        double areaSum = 0;

        for (int i = 0; i < shapes.size(); i++) {

            // Retrieves the element from the shapes collection at the index i
            Object shape = shapes.get(i);

            // Check the element in the shapes list is a circle
            if (shape.getClass().getSimpleName().equals("Square")){

                // Cast Object shape to type Square
                // Retrieve the length of the side of the square
                // Area = Math.pow(length * length)
                double area = Math.pow(((Square) shape).getLength(), 2);
                areaSum += area;

            }

            if (shape.getClass().getSimpleName().equals("Circle")){

                // Cast Object shape to type Circle
                // Retrieve the radius of the side of the square
                // Area = Math.pow(radius * radius)
                double area = Math.pow(((Circle) shape).getRadius(), 2);
                areaSum += area;
            }


        }

        return areaSum;
    }

    // Second responsibility
    public String displayTotalAreaOfAllShapesJson(List<Object> shapes){
        // calls the totalAreaOfAllShapes and formats the returned areaSum
        return "{Total area of all shapes: %s}".formatted(totalAreaOfAllShapes(shapes));
    }

}
