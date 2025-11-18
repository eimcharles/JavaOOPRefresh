package polymorphism.interfaces.implementationExample2.employee;

import polymorphism.interfaces.implementationExample2.orderedInterface.Ordered;

import java.util.Objects;

public class Employee implements Ordered {

    private long employeeIdNumber;

    public Employee(long employeeIdNumber) {
        this.employeeIdNumber = employeeIdNumber;
    }

    public long getEmployeeIdNumber() {
        return employeeIdNumber;
    }

    public void setEmployeeIdNumber(long employeeIdNumber) {
        this.employeeIdNumber = employeeIdNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeIdNumber == employee.employeeIdNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(employeeIdNumber);
    }

    @Override
    public String toString() {
        return "Employee { employeeIdNumber = %d}".formatted(employeeIdNumber);
    }

    @Override
    public boolean precede(Object object) {

        // Validates the object passed
        if (object == null || this.getClass() != object.getClass()){
            return false;
        }

        // Down casting the passed object to Type book
        Employee employee = (Employee) object;

        return this.employeeIdNumber < employee.employeeIdNumber;
    }

    @Override
    public boolean succeed(Object object) {

        // Validates the object passed
        if (object == null || this.getClass() != object.getClass()){
            return false;
        }

        // Down casting the passed object to Type book
        Employee employee = (Employee) object;

        return this.employeeIdNumber > employee.employeeIdNumber;
    }
}
