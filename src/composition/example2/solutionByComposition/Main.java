package composition.example2.solutionByComposition;

public class Main {

    /**
     *      A single reference type (BarkBehavior)
     *      can refer to multiple concrete implementations
     *      DogBark and RobotBark.
     *
     *      At runtime, Java dynamically calls the implementations:
     *
     *       - If barkBehavior points to DogBark, it calls DogBark.bark().
     *       - If barkBehavior points to RobotBark, it calls RobotBark.bark()
     *
     *       Execution:
     *
     *       Dog delegates DogBark -> barkBehavior -> polymorphism -> DogBark.bark()
     *       RobotDog delegates RobotBark -> barkBehavior -> polymorphism -> RobotBark.bark()
     *
     * */

    public static void main(String[] args) {

        // Behaviour
        DogBark dogBark = new DogBark();
        // Container takes a BarkBehavior parameter, pass dogBark object
        Dog dog = new Dog(dogBark);
        dog.bark();

        System.out.println();

        // Behaviour
        RobotBark robotBark = new RobotBark();
        // Container takes a BarkBehavior parameter, pass robotBark object
        RobotDog robotDog = new RobotDog(robotBark);
        robotDog.bark();

    }
}
