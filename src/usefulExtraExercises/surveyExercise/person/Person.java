package usefulExtraExercises.surveyExercise.person;

import java.util.Date;
import java.util.Objects;

public class Person {

    private String name;
    private String email;
    private Date dateOfBirth;

    public Person(String name, String email, Date dateOfBirth) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(email, person.email) &&
                Objects.equals(dateOfBirth, person.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Person {name = '%s', email = '%s', dateOfBirth = %s}".formatted(name, email, dateOfBirth);
    }
}
