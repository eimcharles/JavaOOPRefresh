package inheritance.employee;

public class Main {

    public static void main(String[] args) {

        // Inherits name, address and employee attributes from parent - doesn't initialize languages
        Programmer charles = new Programmer("Charles", 37, "1234 Street", "Full-stack");
        System.out.println(charles);
        System.out.println();

        String[] languages = {"Java", "Go", "C++"};

        // Inherits name, address and employee attributes from parent - initializes languages
        Programmer john = new Programmer("John", 25, "1234 Street", "Backend", languages);

        // With the use of super
        String johnsLanguagesFromParent = john.writeSomeCodeFromParent();
        System.out.println(johnsLanguagesFromParent);
        System.out.println(john);
        System.out.println();

        // With the use of protected
        String johnsLanguages = john.writeSomeCodeFromChild();
        System.out.println(johnsLanguages);
        System.out.println();

        // Given that we extend employee, we have access to all the parent methods
        System.out.println(john.getName());
        System.out.println(john.getAge());
        System.out.println(john.getAddress());
        System.out.println();

        // Inherits name, address and employee attributes from parent - initializes teamSize
        Manager larry = new Manager("Larry", 25, "1234 Street", "Team Manager", 3);

        // With the use of super
        String larryReportFromParent = larry.reportFromParent();
        System.out.println(larryReportFromParent);
        System.out.println(larry);
        System.out.println();

        // With the use of protected
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
