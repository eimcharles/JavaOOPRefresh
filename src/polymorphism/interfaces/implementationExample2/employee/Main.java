package polymorphism.interfaces.implementationExample2.employee;

public class Main {

    public static void main(String[] args) {

        Employee hiredFirst = new Employee(10_0001);
        Employee hiredSecond = new Employee(10_102);

        System.out.println("Does Employee 10_0001 precedes Employee 10_102: " + hiredFirst.precede(hiredSecond));

    }

}
