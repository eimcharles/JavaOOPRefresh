package composition.example2.problemWithInheritance;

public class Dog extends Animal {

    /**
     *
     *      Animal Inherits both bark() and eat()
     *      calling eat() which makes sense in the
     *      context of a Dog object
     *
     * */

    @Override
    public void eat() {
        // Dog logic for eat - good
    }

    @Override
    public void bark() {
        // Dog logic for eat - good
    }
}
