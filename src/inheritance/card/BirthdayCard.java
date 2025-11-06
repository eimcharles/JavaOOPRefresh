package inheritance.card;

import java.time.LocalDate;
import java.util.Objects;

/**
 *      Represents a birthdayCard that contains an LocalDate.
 *
 *      This class demonstrates composition: a birthdayCard "has-an" LocalDate.
 *      The LocalDate is a part of the birthdayCard.
 *
 *      The birthdayCard does not control the creation or destruction of the LocalDate,
 *      the LocalDate object is associated to the birthdayCard class.
 *
 *      A birthdayCard may or may not have an associated Animal.
 */


public class BirthdayCard extends Card {

    private LocalDate birthday;

    public BirthdayCard(String occasion, String message) {
        super(occasion, message);
    }

    public BirthdayCard(String occasion, String message, LocalDate birthday) {
        super(occasion, message);
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BirthdayCard that = (BirthdayCard) o;
        return Objects.equals(birthday, that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), birthday);
    }

    @Override
    public String toString() {
        return "BirthdayCard { occasion = '%s', message = '%s', birthday = %s}".formatted(this.occasion, this.message, this.birthday);
    }
}
