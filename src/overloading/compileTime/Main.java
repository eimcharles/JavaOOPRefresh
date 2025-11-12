package overloading.compileTime;

public class Main {

    /**
     *      1. Compile-time (Static) Polymorphism:
     *          - Achieved through method overloading.
     *          - Multiple methods with the same name but different parameters.
     *          - Method to execute is determined by the compiler.
     * */

    public static void main(String[] args) {

        MathOperations math = new MathOperations();

        int sum1 = math.add(5, 10);
        double sum2 = math.add(3.5, 7.2);
        String result = math.add("Hello, ", "World!");

        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of doubles: " + sum2);
        System.out.println("Concatenated string: " + result);
    }
}
