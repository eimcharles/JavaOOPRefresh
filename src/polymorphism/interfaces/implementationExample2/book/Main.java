package polymorphism.interfaces.implementationExample2.book;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book(2001);

        Book book2 = new Book(1999);

        Book book3 = new Book(2025);

        System.out.println("Does book book1 precedes book book2: " + book1.precede(book2));

        System.out.println("Does book book3 precedes book book2: " + book3.precede(book2));

        System.out.println("Does book book2 precedes book book1: " + book2.precede(book1));


    }
}
