package inheritance.card;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Card card;
        BirthdayCard birthdayCard;

        // Q1 : initializing a regular card
        card = new Card("Regular Card", "Enter your wishes");
        System.out.println(card);
        System.out.println();

        // Q3 : initializing a birthday card and passing a birthday date
        LocalDate myBirthday = LocalDate.of(1990, 5, 15);
        birthdayCard = new BirthdayCard("Birthday", "Happy b-day, all the best!!", myBirthday);
        System.out.println(birthdayCard);
        System.out.println();

        // Q3 : initializing a birthday card without birthday - setting birthday through setter
        birthdayCard = new BirthdayCard("Birthday", "Happy happy bdayyy");
        System.out.println(birthdayCard);
        birthdayCard.setBirthday(LocalDate.of(1988, 8, 27));
        System.out.println(birthdayCard);


    }
}
