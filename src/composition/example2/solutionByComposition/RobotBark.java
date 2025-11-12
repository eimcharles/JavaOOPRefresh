package composition.example2.solutionByComposition;

public class RobotBark implements BarkBehavior {

    /**
     *      DogBark and RobotBark are
     *      concrete implementations of
     *      the BarkBehavior interface
     *      contract.
     * */

    @Override
    public void bark() {
        System.out.println("Beep!");
    }
}
