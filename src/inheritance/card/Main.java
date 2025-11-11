package inheritance.card;

import inheritance.card.base.Card;
import inheritance.card.base.Occasion;
import inheritance.card.subClass.BirthdayCard;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Card card;
        BirthdayCard birthdayCard;

        // Initializing the parent object
        card = new Card(Occasion.BASIC, "Enter your wishes");
        System.out.println(card);
        System.out.println();

        // Initializing the child birthday card object and associating a birthday date object
        LocalDate myBirthday = LocalDate.of(1990, 5, 15);
        birthdayCard = new BirthdayCard(Occasion.BIRTHDAY, "Happy b-day, all the best!!", myBirthday);
        System.out.println(birthdayCard);
        System.out.println();

        // Initializing a child birthday card object without birthday date object - setting birthday object through setter
        birthdayCard = new BirthdayCard(Occasion.BIRTHDAY, "Happy happy bdayyy");
        System.out.println(birthdayCard);
        birthdayCard.setBirthday(LocalDate.of(1988, 8, 27));
        System.out.println(birthdayCard);

    }
}
