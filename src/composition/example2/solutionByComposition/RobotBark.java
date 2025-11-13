package composition.example2.solutionByComposition;

public class RobotBark implements BarkBehavior {

    /**
     *
     *      The RobotBark class is a composed object,
     *      that Dog delegates its bark() behaviour to.
     *
     *      The RobotBark implements
     *      the BarkBehavior interface
     *      contract.
     *
     * */

    @Override
    public void bark() {
        System.out.println("Beep!");
    }
}
