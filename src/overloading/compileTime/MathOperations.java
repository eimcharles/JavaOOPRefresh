package overloading.compileTime;

public class MathOperations {

    /**
     *      The same method name "add" is defined multiple times with different parameter types:
     *       - int + int
     *       - double + double
     *       - String + String
     *
     *      The compiler decides which method to call based on the argument types provided.
     */

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String str1, String str2) {
        return str1 + str2;
    }
}
