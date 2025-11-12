package composition.example2.problemWithInheritance;

public class Animal {

    /**
     *      limitation of inheritance:
     *
     *      Subclasses get everything from the parent,
     *      even what you don’t want.
     *
     *      Solution:
     *
     *      Instead of inheriting everything, use
     *      composition with a behaviour interface.
     *
     *      See solutionByComposition package
     *
     * */

    public void eat(){
        // eat logic
    }

    public void bark(){
        // bark logic
    }

}
