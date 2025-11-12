package overloading;

public class Main {


    /**
     *      1. Compile-time (Static) Polymorphism:
     *          - Achieved through method overloading.
     *          - Multiple methods with the same name but different parameters.
     *          - Method to execute is determined by the compiler.
     * */

    public static void main(String[] args) {

        Rectangle rectangleOne;
        int area;

        rectangleOne = new Rectangle(10, 10);
        area = getArea(rectangleOne);
        System.out.println("Area of a rectangle given a rectangle object: " + area);

        area = getArea(10, 10);
        System.out.println("Area of a given its length and width: " + area);

    }

    public static int getArea(Rectangle rectangle) {
        return getArea(rectangle.getLength(), rectangle.getWidth());
    }

    public static int getArea(int length, int width) {
        return length * width;
    }
}
