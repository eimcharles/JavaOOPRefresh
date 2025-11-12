package overloading.runTime;

public class Dog extends Animal{

    /**
     *      The Dog and Cat subclasses override
     *      sound to provide specific implementations.
     * */

    @Override
    public void sound() {
        System.out.println("Dog barks: Woof!");
    }
}
