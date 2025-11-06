package encapsulation.overloading;

public class Main {


    public static void main(String[] args) {

        Rectangle rectangleOne, rectangleTwo;
        int area;

        rectangleOne = new Rectangle(10, 10);
        area = getArea(rectangleOne);
        System.out.println("Area of rectangle " + area);

        rectangleTwo = new Rectangle(5, 5);
        area = getArea(rectangleOne, rectangleTwo);
        System.out.println("Area of two rectangles " + area);

    }

    public static int getArea(Rectangle rectangle) {
        return rectangle.getLenght() * rectangle.getWidth();
    }

    public static int getArea(Rectangle rectangleOne, Rectangle rectangleTwo) {
        return (rectangleOne.getLenght() * rectangleOne.getWidth() + rectangleTwo.getLenght() * rectangleTwo.getWidth());
    }
}
