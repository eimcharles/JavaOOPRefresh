package solidPrinciples.sRp.ex1.problem;

/**
 *          The “S” in the SOLID principles stands
 *          for the Single Responsibility Principle (SRP),
 *          which states that a class should have only
 *          one reason to change or, in other words,
 *          it should have a single, well-defined
 *          responsibility or task within a software system.
 *
 *          The Employee class violates SRP because it has two responsibilities:
 *          calculating an employee’s salary and generating a payroll report.
 *
 *          Solution: refactor the code to separate concerns and ensure
 *          that each class has a single, well-defined responsibility.
 * */

public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // First responsibility
    public double calculateSalary() {
        return salary * 12; // Annual salary
    }

    // Second responsibility
    public void generatePayrollReport() {
        System.out.println("Payroll Report for " + name + ": $" + salary * 12);
    }

}
