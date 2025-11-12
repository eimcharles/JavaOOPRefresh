package composition.example2.solutionByComposition;

public interface BarkBehavior {

    /**
     *      Dynamic Dispatch:
     *
     *      Every class that implements an interface has a table mapping
     *      interface methods → concrete implementations.
     *
     *      JVM checks the table and calls the concrete
     *      implementation based on the actual object type
     *      (DogBark or RobotBark) determines the method.
     *
     *      Contract bark():
     *
     *      Separate contract for behaviour
     *      that can be implemented by
     *      Dog and RobotDog Class
     *
     * */

    void bark();
}
