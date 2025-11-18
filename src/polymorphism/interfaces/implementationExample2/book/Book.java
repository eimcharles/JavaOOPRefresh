package polymorphism.interfaces.implementationExample2.book;

import polymorphism.interfaces.implementationExample2.orderedInterface.Ordered;

import java.util.Objects;

public class Book implements Ordered {

    private int publicationYear;

    public Book(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(publicationYear);
    }

    @Override
    public String toString() {
        return "Book { publicationYear = %d }".formatted(publicationYear);
    }

    @Override
    public boolean precede(Object object) {

        // Validates the object passed
        if (object == null || this.getClass() != object.getClass()){
            return false;
        }

        // Down casting the passed object to Type book
        Book book = (Book) object;

        return this.publicationYear < book.publicationYear;
    }

    @Override
    public boolean succeed(Object object) {

        // Validates the object passed
        if (object == null || this.getClass() != object.getClass()){
            return false;
        }

        // Down casting the passed object to Type book
        Book book = (Book) object;

        return this.publicationYear > book.publicationYear;
    }
}
