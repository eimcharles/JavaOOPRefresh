package inheritance.card;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Card card;
        BirthdayCard birthdayCard;

        card = new Card("Regular Card", "Enter your wishes");
        System.out.println(card);
        System.out.println();

        LocalDate myBirthday = LocalDate.of(1990, 5, 15);
        birthdayCard = new BirthdayCard("Birthday", "Happy b-day, all the best!!", myBirthday);
        System.out.println(birthdayCard);
        System.out.println();

        birthdayCard = new BirthdayCard("Birthday", "Happy happy bdayyy");
        System.out.println(birthdayCard);
        birthdayCard.setBirthday(LocalDate.of(1988, 8, 27));
        System.out.println(birthdayCard);


    }
}
