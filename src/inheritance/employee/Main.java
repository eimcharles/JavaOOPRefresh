package inheritance.employee;

import inheritance.employee.base.Role;
import inheritance.employee.subClass.Manager;
import inheritance.employee.subClass.Programmer;

public class Main {

    public static void main(String[] args) {

        // Inherits name, address and employee attributes from parent - doesn't initialize languages
        Programmer charles = new Programmer("Charles", 37, "1234 Street", Role.PROGRAMMER);
        System.out.println(charles);
        System.out.println();

        String[] languages = {"Java", "Go", "C++"};

        // Inherits name, address and employee attributes from parent - initializes languages
        Programmer john = new Programmer("John", 25, "1234 Street", Role.PROGRAMMER, languages);

        // With the use of super to explicitly call sayHi() in parent
        String johnsLanguagesFromParent = john.writeSomeCodeFromParent();
        System.out.println(johnsLanguagesFromParent);
        System.out.println(john);
        System.out.println();

        // With the use of protected - calls overridden method
        String johnsLanguages = john.writeSomeCodeFromChild();
        System.out.println(johnsLanguages);
        System.out.println();

        // Given that we extend Employee, the Manager class has access to all the parent methods
        System.out.println(john.getName());
        System.out.println(john.getAge());
        System.out.println(john.getAddress());
        System.out.println();

        // Inherits name, address and employee attributes from parent - initializes teamSize
        Manager larry = new Manager("Larry", 25, "1234 Street", Role.MANAGER, 3);

        // With the use of super to explicitly call sayHi() in parent
        String larryReportFromParent = larry.reportFromParent();
        System.out.println(larryReportFromParent);
        System.out.println(larry);
        System.out.println();

        // With the use of protected - calls overridden method
        String larryReportFromChild = larry.reportFromChild();
        System.out.println(larryReportFromChild);
        System.out.println();

        // Given that we extend employee, we have access to all the parent methods
        System.out.println(larry.getName());
        System.out.println(larry.getAge());
        System.out.println(larry.getAddress());
        System.out.println();

    }
}
