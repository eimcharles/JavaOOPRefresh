package composition.example2.solutionByComposition;

public interface BarkBehavior {

    /**
     *      Interface for Contract bark():
     *
     *      Separate contract for behaviour
     *      that can be implemented by
     *      DogBark and RobotBark
     *      Class.
     *
     *      Dynamic Dispatch: Runtime Polymorphism.
     *
     *      Every class that implements an interface has a table mapping
     *      interface methods → concrete implementations.
     *
     *      The JVM checks the table and calls the concrete
     *      implementation based on the actual object type
     *      (DogBark or RobotBark) determines the method.
     *
     *
     * */

    void bark();
}
