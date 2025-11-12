package overloading.runTime;

public class Main {

    /**
     *
     *         At runtime, the JVM determines the actual
     *         type of the object (Dog or Cat)
     *         and calls the appropriate sound method,
     *         even though the reference type is Animal.
     *
     * */

    public static void main(String[] args) {

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // Dog's sound() method is called
        animal1.sound();
        // Cat's sound() method is called
        animal2.sound();
    }
}
