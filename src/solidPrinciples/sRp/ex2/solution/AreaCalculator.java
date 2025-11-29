package solidPrinciples.sRp.ex2.solution;

import solidPrinciples.sRp.ex2.problem.Circle;
import solidPrinciples.sRp.ex2.problem.Square;

import java.util.List;

public class AreaCalculator {

    // Single responsibility
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
}
