package composition.example2.solutionByComposition;

public class DogBark implements BarkBehavior {

    /**
     *      DogBark and RobotBark are
     *      concrete implementations of
     *      the BarkBehavior interface
     *      contract.
     * */

    @Override
    public void bark() {
        System.out.println("Woof!");

    }
}
