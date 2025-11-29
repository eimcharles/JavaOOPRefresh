package solidPrinciples.sRp.ex1.solution;

/**
 *      Solution: create distinct classes for
 *      calculating an employee's salary
 *      and generating a payroll report.
 *
 *      The Employee class manages employee data,
 *      such as name and salary,
 *      and calculates the annual
 *      salary based on the monthly salary.
 * */

public class Employee {


    /**
     *        This separation ensures that each class has a single task,
     *        and changes to salary calculations won’t affect reporting,
     *        and updates to report formats won’t impact employee data,
     *        making the system easier to maintain.
     *
     *      - Aim to define a clear role for each class, focusing on one specific task.
     *      - If a class handles multiple tasks, refactor it into smaller, focused classes with single responsibilities.
     *      - Design classes so that changes to one task don’t impact others.
     * */

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Single responsibility
    public double calculateSalary() {
        return salary * 12; // Annual salary
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
