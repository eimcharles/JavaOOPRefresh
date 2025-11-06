package inheritance.employee;

import java.util.Arrays;
import java.util.Objects;

/**
 *      Programmer is a subclass,
 *      the child class that inherits
 *      from the employee class.
 *
 *      It inherits all the methods from the
 *      parent class and defines its own new
 *      set of attributes and methods
 * */

public class Programmer extends Employee {

    private String[] programmingLanguages;

    public Programmer(String name, int age, String address, String experience, String[] programmingLanguages) {

        // Call to parent constructor
        super(name, age, address, experience);

        // Setting its own attribute
        this.programmingLanguages = programmingLanguages;
    }

    public Programmer(String name, int age, String address, String experience) {

        // Call to parent constructor - Programmer is-a Employee
        super(name, age, address, experience);
    }

    public String writeSomeCodeFromParent(){

        StringBuilder stringBuilder = new StringBuilder();

        // Call to parent method defined in parent class
        stringBuilder.append(super.sayHi()).append(", I can code in ");

        for (String programmingLanguage : this.getProgrammingLanguages()) {
            stringBuilder.append(programmingLanguage).append(" ");
        }

        return stringBuilder.toString();
    }

    public String writeSomeCodeFromChild(){

        StringBuilder stringBuilder = new StringBuilder();

        // Call to overridden method defined in parent class
        stringBuilder.append(sayHi()).append(this.name).append(", I can code in ");

        for (String programmingLanguage : this.getProgrammingLanguages()) {
            stringBuilder.append(programmingLanguage).append(" ");
        }

        return stringBuilder.toString();
    }

    @Override
    // Widening the access modifier in the child class
    public String sayHi() {
        return "Hi from my subclass, my name is ";
    }

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Programmer that = (Programmer) o;
        return Objects.deepEquals(programmingLanguages, that.programmingLanguages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Arrays.hashCode(programmingLanguages));
    }

    @Override
    public String toString() {
        return super.toString() + "\nProgrammer { " +
                "programmingLanguages = " + Arrays.toString(programmingLanguages) +
                '}';
    }
}
