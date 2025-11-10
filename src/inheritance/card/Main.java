package inheritance.card;

import inheritance.card.base.Card;
import inheritance.card.base.Occasion;
import inheritance.card.subClass.BirthdayCard;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Card card;
        BirthdayCard birthdayCard;

        // Q1 : initializing a regular card
        card = new Card(Occasion.BASIC, "Enter your wishes");
        System.out.println(card);
        System.out.println();

        // Q3 : initializing a birthday card and passing a birthday date
        LocalDate myBirthday = LocalDate.of(1990, 5, 15);
        birthdayCard = new BirthdayCard(Occasion.BIRTHDAY, "Happy b-day, all the best!!", myBirthday);
        System.out.println(birthdayCard);
        System.out.println();

        // Q3 : initializing a birthday card without birthday - setting birthday through setter
        birthdayCard = new BirthdayCard(Occasion.BIRTHDAY, "Happy happy bdayyy");
        System.out.println(birthdayCard);
        birthdayCard.setBirthday(LocalDate.of(1988, 8, 27));
        System.out.println(birthdayCard);


    }
}
