package usefulExtraExercises.surveyExercise;

import usefulExtraExercises.surveyExercise.person.Person;
import usefulExtraExercises.surveyExercise.questionnaire.Question;
import usefulExtraExercises.surveyExercise.questionnaire.Questionnaire;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SurveyApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Setup Questionnaire
        Questionnaire questionnaire = new Questionnaire(1);
        questionnaire.addQuestion(new Question("What programming languages are you the most proficient in? "));
        questionnaire.addQuestion(new Question("What do you enjoy the most about programming? "));
        questionnaire.addQuestion(new Question("Do you have any pets? "));

        // Collect name, email, and date of birth to create a Person object.
        Person personSurveyed = collectPersonalInformation(scanner);

        // Loop through all questions in the questionnaire and collects answers.
        String[] questionnaireAnswers = collectQuestionnaireAnswers(scanner, questionnaire);

        // Save the data
        writeAnswersToFile(questionnaire, personSurveyed, questionnaireAnswers);

        // Close resources
        scanner.close();

    }

    private static BufferedWriter initializeBufferedWriter(String fileName) throws IOException {

        // Create the file under this path - Java object that “points” to that path
        File file = new File(fileName);

        // Creates a new empty file at the path represented by fileName
        boolean isCreated = file.createNewFile();

        // Checks if File already exists
        if (!isCreated) {

            // Appends if exists
            System.out.println("File already exists");

        } else {

            // else creates a new file
            System.out.println("File is created");
        }

        // Creates a buffered writer linked to the file, opening it in append mode (true).
        return new BufferedWriter(new FileWriter(file, true));
    }

    private static void writeAnswersToFile(Questionnaire questionnaire, Person person, String[] questionnaireAnswers) {

        String fileName = "src/usefulExtraExercises/surveyExercise/survey_answers.txt";
        BufferedWriter writer;

        try {

            // Opens the file for writing (in append mode) after checking file existence and creating it if necessary.
            writer = initializeBufferedWriter(fileName);

            // Writes pertinent information to file
            writer.write(questionnaire.getCreatedAt().toString() + "\n");
            writer.write("Name: " + person.getName() + "\n");
            writer.write("Email: " + person.getEmail() + "\n");
            writer.write("Date of Birth: " + getFormattedDate(person) + "\n");

            for (int i = 0; i < questionnaireAnswers.length; i++) {

                writer.write("Question " + (i + 1) + ": " + questionnaireAnswers[i] + "\n");

            }

            // Add an extra line at the end of the questionnaire to separate future inputs
            writer.write("\n");

            // Close all resources
            writer.close();

            // Display the file name that the answers were saved to
            System.out.println("Survey answers saved to " + fileName);

        } catch (IOException e) {

            // In case of en error
            System.out.println("An error occurred while saving the survey answers.");
            System.out.println(e.getMessage());

        }
    }

    private static Date getDateOfBirth(Scanner scanner){

        System.out.print("Enter your date of birth (yyyy-mm-dd): ");
        String dateOfBirthString = scanner.nextLine();

        // Formatting the date of birth for the Person object
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date dateOfBirth = null;

        try {

            // Converts the input string into a Date object.
            dateOfBirth = dateFormat.parse(dateOfBirthString);

        } catch (Exception e) {

            System.out.println("Parsing failed for input: " + dateOfBirthString);
            System.out.println(e.getMessage());
        }

        return dateOfBirth;
    }

    private static String getFormattedDate(Person person){

        Date dateOfBirth = person.getDateOfBirth();

        // if dateOfBirth input format is incorrect
        if (dateOfBirth == null) {
            return "dateOfBirth not parsed - unparseable date ";
        }

        // Defines the clean pattern used to format the Date object for file output.
        SimpleDateFormat outputFormatter = new SimpleDateFormat("yyyy-MM-dd");

        // Converts the internal Date object back into the desired string format.
        return outputFormatter.format(dateOfBirth);
    }

    private static Person collectPersonalInformation(Scanner scanner){

        // Initial prompts
        System.out.print("Please enter your name: ");
        String inputName = scanner.nextLine();

        System.out.print("Please enter your email address: ");
        String inputEmail = scanner.nextLine();

        Date dateOfBirth = getDateOfBirth(scanner);

        return new Person(inputName, inputEmail, dateOfBirth);
    }

    private static String[] collectQuestionnaireAnswers(Scanner scanner, Questionnaire questionnaire){

        // Holds the number of questions
        int numberOfQuestions = questionnaire.getQuestions().size();

        // Creates an array questionnaireAnswers that is the same size as the questionnaire
        String[] questionnaireAnswers = new String[numberOfQuestions];

        // Loop for all the questions in the questionnaire
        for (int i = 0; i < numberOfQuestions ; i++) {

            // Loops through all the questions in the questionnaire list
            System.out.print(questionnaire.getQuestions().get(i).getQuestion() + ": ");

            // Adds an answer to the questionnaireAnswers array
            questionnaireAnswers[i] = scanner.nextLine();
        }

        return questionnaireAnswers;
    }

}
