package inheritance.employee.subClass;

import inheritance.employee.base.Employee;
import inheritance.employee.base.Role;

import java.util.Objects;

/**
 *      Manager is a subclass,
 *      the child class that inherits
 *      from the employee class.
 *
 *      It inherits all the methods from the
 *      parent class and defines its own new
 *      set of attributes and methods
 * */

public class Manager extends Employee {

    private int teamSize;

    public Manager(String name, int age, String address, Role role, int teamSize) {

        // Call to parent constructor - Manager is-a Employee
        this(name, age, address, role);

        // Setting its own attribute
        this.teamSize = teamSize;
    }

    public Manager(String name, int age, String address, Role role) {

        // Call to parent constructor - Manager is-a Employee
        super(name, age, address, role);
    }

    // Uses parent implementation always - regardless of being overridden
    public String reportFromParent(){

        // Strict call to parent method defined in parent class
        return super.sayHi() + ", i'm a manager and i'm writing team reports.";
    }

    // Uses child implementation always - only if overridden
    public String reportFromChild(){

        // Call to overridden method defined in parent class - access to name attribute
        return sayHi() + this.name + ", i'm a manager and i'm writing team reports.";
    }

    @Override
    // Widening the access modifier in the child class
    public String sayHi() {
        return "Hi from my subclass, my name is ";
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return teamSize == manager.teamSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), teamSize);
    }

    @Override
    public String toString() {
        return super.toString() + "\nManager { teamSize = %d }".formatted(teamSize);
    }
}
