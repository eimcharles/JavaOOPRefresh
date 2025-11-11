package inheritance.employee.subClass;

import inheritance.employee.base.Employee;
import inheritance.employee.base.Role;

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

    public Programmer(String name, int age, String address, Role role, String[] programmingLanguages) {

        // Call to parent constructor
        this(name, age, address, role);

        // Setting its own attribute
        this.programmingLanguages = programmingLanguages;
    }

    public Programmer(String name, int age, String address, Role role) {

        // Call to parent constructor - Programmer is-a Employee
        super(name, age, address, role);
    }

    // Uses parent implementation always - regardless of being overridden
    public String writeSomeCodeFromParent(){

        StringBuilder stringBuilder = new StringBuilder();

        // Strict call to parent method defined in parent class
        stringBuilder.append(super.sayHi()).append(", I can code in ");

        for (String programmingLanguage : this.getProgrammingLanguages()) {
            stringBuilder.append(programmingLanguage).append(" ");
        }

        return stringBuilder.toString();
    }

    // Uses child implementation always - only if overridden
    public String writeSomeCodeFromChild(){

        StringBuilder stringBuilder = new StringBuilder();

        // Call to overridden method defined in parent class - access to name attribute
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
