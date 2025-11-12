package composition.example2.solutionByComposition;

public class Dog {

    /**
     *      Dog is a container (Composite class)
     *      that delegates  the behaviour
     *      to the composed object barkBehavior.
     *
     *      Dog “has a” BarkBehavior, delegates
     *      the barking behavior to a BarkBehavior object
     *
     *      BarkBehavior reference can point to
     *      any object that implements that interface
     *
     * */

    // Container for DogBark object - reference type is BarkBehavior
    private BarkBehavior barkBehavior;

    // Constructor injection - contained object is passed via the constructor
    public Dog(BarkBehavior barkBehavior) {
        this.barkBehavior = barkBehavior;
    }

    /**
     *      performBark() does not implement barking itself.
     *
     *      Calls bark() on the barkBehavior object, barking is
     *      delegated to the object held in barkBehavior.
     *
     *      Polymorphism is what makes this delegation flexible and dynamic
     *
     * */

    public void bark() {
        System.out.println("Delegating to DogBark class");
        barkBehavior.bark();
    }
}
