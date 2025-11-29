package solidPrinciples.sRp.ex2.solution;

import java.util.List;

public class FormatShapesJson {

    private final AreaCalculator areaCalculator;

    public FormatShapesJson(AreaCalculator areaCalculator){
        this.areaCalculator = new AreaCalculator();
    }

    // Single responsibility
    public String displayTotalAreaOfAllShapesJson(List<Object> shapes){
        // calls the totalAreaOfAllShapes and formats the returned areaSum
        return "{Total area of all shapes: %s}".formatted(this.areaCalculator.totalAreaOfAllShapes(shapes));
    }
}
