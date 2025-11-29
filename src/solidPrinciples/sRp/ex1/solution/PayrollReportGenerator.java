package solidPrinciples.sRp.ex1.solution;

/**
 *      The PayrollReportGenerator class
 *      takes an employee’s data and
 *      produces payroll reports
 * */

public class PayrollReportGenerator {


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

    // Single responsibility
    public void generatePayrollReport(Employee employee) {
        System.out.println("Payroll Report for " + employee.getName() + ": $" + employee.getSalary() * 12);
    }
}
