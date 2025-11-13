package composition.example2.problemWithInheritance;

public class RobotDog extends Animal {

    /**
     *
     *      The RobotDog Class Inherits both bark() and eat()
     *      calling eat() doesn’t make sense for a robot dog.
     *
     *      This causes errors or meaningless behavior.
     *
     * */

    @Override
    public void eat() {
        // RobotDog logic for eat - erroneous, we don't want this
    }

    @Override
    public void bark() {
        // RobotDog logic for bark - good
    }
}
