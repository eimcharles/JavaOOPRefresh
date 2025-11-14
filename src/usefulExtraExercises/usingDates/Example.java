package usefulExtraExercises.usingDates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Example {
    public static void main(String[] args) {

        System.out.println("Question 1: ");

        // Get the current date
        LocalDate today = LocalDate.now();

        // Define a custom date and time format using DateTimeFormatter
        DateTimeFormatter dateTimeFormatterToday = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // format the date
        today.format(dateTimeFormatterToday);

        // Print today's date
        System.out.println(today);

        LocalDateTime todayAndTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatterTodayAndTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        todayAndTime.format(dateTimeFormatterTodayAndTime);
        System.out.println(todayAndTime);
        System.out.println();

        System.out.println("Question 2: ");
        LocalDate myBday = LocalDate.of(1988,8, 27);
        DateTimeFormatter myBayFormatted = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        myBday.format(myBayFormatted);
        System.out.println(myBday);
        System.out.println();

        System.out.println("Question 3: ");
        LocalDate myBayPlusDays = myBday.plusDays(100);
        System.out.println(myBayPlusDays);
        System.out.println();

        System.out.println("Question 4: ");
        int timeBetweenBdayAndNow = calculateAge(myBday, today);
        System.out.println(timeBetweenBdayAndNow);
        System.out.println();
    }

    public static int calculateAge(LocalDate birthday, LocalDate currentDate) {

        // Get the current date
        LocalDate todaysDate = currentDate.now();

        // Object to get the number of days between two dates
        Period period = Period.between(birthday, todaysDate);

        // Get the amount between the passed Period
        int days = period.getDays();
        int months = period.getMonths();
        int years = period.getYears();

        if (months < 0 || (months == 0 && days < 0)) {
            // since their birthday (Dec 10) hasn’t happened yet this year,
            // the code subtracts 1 → age = 24
            years--;
        }

        return years;
    }
}
