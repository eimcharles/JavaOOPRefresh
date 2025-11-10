package inheritance.employee.base;

import java.util.Objects;

/**
 *      Employee is a super class,
 *      the parent class for both
 *      programmer and manager
 *      child classes.
 *
 *      The protected access modifier
 *      allows for the class itself and
 *      the subclass to have direct
 *      access to the parent attribute
 * */

public class Employee {

    protected String name;
    protected int age;
    protected String address;
    protected String experience;

    public Employee(String name, int age, String address, String experience) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.experience = experience;
    }

    /**
     *      The Child classes calling sayHi() works
     *      because the method is protected and visible to subclasses.
     *
     *      - The subclass can call the method directly given it is protected
     *      and doesn't have to go through the parent
     *
     *      - if the method was private, the sayHi() method call in
     *      subclasses would not compile (allows for method invocation in child)
     *
     *      - sayHi() is accessible within the same package
     *
     *      The compiler allows this call, but the JVM decides at runtime which
     *      version of the method to actually execute.
     *
     *      sayHi() → “Ask the object itself which version to run”
     *      super.sayHi() → “Ignore the object, run my parent’s version”
     *
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

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee1 = (Employee) o;
        return age == employee1.age &&
                Objects.equals(name, employee1.name) &&
                Objects.equals(address, employee1.address) &&
                Objects.equals(experience, employee1.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address, experience);
    }

    @Override
    public String toString() {
        return "Employee { name = '%s', age = %d, address = '%s', experience = '%s' }".formatted(name, age, address, experience);
    }
}
