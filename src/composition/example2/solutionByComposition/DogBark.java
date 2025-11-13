package composition.example2.solutionByComposition;

public class DogBark implements BarkBehavior {

    /**
     *
     *      The DogBark class is a composed object,
     *      that Dog delegates its bark() behaviour to.
     *
     *      The DogBark implements
     *      the BarkBehavior interface
     *      contract.
     *
     * */

    @Override
    public void bark() {
        System.out.println("Woof!");

    }
}
