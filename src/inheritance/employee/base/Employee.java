package inheritance.employee.base;

import java.util.Objects;

/**
 *      Employee -> Manager
 *               -> Programmer
 *
 *      Hierarchical inheritance,
 *      multiple subclasses inherit from
 *      the Employee superclass, forming a
 *      hierarchical structure.
 *
 * */

public class Employee {

    protected String name;
    protected int age;
    protected String address;
    protected Role role;

    public Employee(String name, int age, String address, Role role) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.role = role;
    }

    /**
     *      The child classes can call the sayHi() directly
     *      given the method has a protected access modifier
     *      and is accessible within the package and to subclasses.
     *
     *      - if the method was private, the sayHi() method call in
     *      subclasses would not compile (allows for method invocation in child)
     *
     *      The JVM decides at runtime which version of the method to actually execute.
     *
     *      sayHi() → “Ask the object itself which version to run”
     *
     *      super.sayHi() → “Ignore the object, run my parent’s version”
     * */

    protected String sayHi(){
        return "Hello from my super class, my name is " + this.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Role getRole(Role role) {
        return Role.valueOf(role.toString().toLowerCase());
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee1 = (Employee) o;
        return age == employee1.age &&
                Objects.equals(name, employee1.name) &&
                Objects.equals(address, employee1.address) &&
                Objects.equals(role, employee1.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address, role);
    }

    @Override
    public String toString() {
        return "Employee { name = '%s', age = %d, address = '%s', role = '%s' }".formatted(name, age, address, role);
    }
}
