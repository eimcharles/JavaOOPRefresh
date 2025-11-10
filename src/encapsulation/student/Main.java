package encapsulation.student;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student student;

        int[] invalidScores;
        int[] updatedValidScores;

        double midtermScore;
        double finalScore;
        double overallScore;
        char letterGrade;

        int validQuizScore;
        int invalidQuizScore;

        int validQuizNumber;
        int invalidQuizNumber;


        student = new Student("Bob");

        // Invalid quiz values 22 and -1.
        invalidScores = new int[]{22, 18, -5};

        // Q1 : Setting the quiz score with the scores array values
        System.out.println(Arrays.toString(invalidScores));
        student.setAllQuizScores(invalidScores);
        System.out.println();

        // Q2 : Individual quiz scores are reset to 0 for each invalid value passed
        updatedValidScores = student.getQuizScores();
        System.out.println(Arrays.toString(updatedValidScores));
        System.out.println();

        // Q3 :  Setting the quiz score by quiz number
        student.setQuizzesByQuizNumber(1, 105);
        student.setQuizzesByQuizNumber(5, 80);

        // Valid value - quiz 2 updated
        student.setQuizzesByQuizNumber(2, 15);

        // Get the updated valid values for the quiz array
        updatedValidScores = student.getQuizScores();
        System.out.println(Arrays.toString(updatedValidScores));
        System.out.println();

        // Q4 : Getting the updated values for quiz number 2
        invalidQuizScore = student.getQuizScoreByQuizNumber(5);

        validQuizScore = student.getQuizScoreByQuizNumber(2);
        System.out.println("The quiz score for the passed quiz number is: " + validQuizScore);
        System.out.println();

        // Q5 : displaying the array  quiz scores
        updatedValidScores = student.getQuizScores();
        System.out.println(Arrays.toString(updatedValidScores));
        System.out.println();

        // Q11 : getting the quiz for a given grade
        invalidQuizScore = student.getQuizByQuizScore(96);
        validQuizNumber = student.getQuizByQuizScore(15);
        System.out.println("Quiz number for quiz grade " + validQuizNumber + " is: " + validQuizScore);
        System.out.println();

        // Q6 : setting the grade for the midterm score
        student.setMidtermScore(55);
        student.setMidtermScore(42);

        // Q7 : getting the values for the midterm score
        midtermScore = student.getMidtermScore();
        System.out.println("Midterm score " + midtermScore);
        System.out.println();

        // Q8 : setting the grade for the final score
        student.setFinalScore(-50);
        student.setFinalScore(105);
        student.setFinalScore(80);

        // Q9 : setting the grade for the final score
        finalScore = student.getFinalScore();
        System.out.println("Final score " + finalScore);
        System.out.println();

        // Q10 : getting the overal score for quizzes, midterm and final
        student.setOverallScore();
        overallScore = student.getOverallScore();
        System.out.println("Overall score for quizzes, midterm and final: " + overallScore);
        System.out.println();

        // Q11 : getting the letter grade for overall score
        student.setLetterGrade();
        letterGrade = student.getLetterGrade();
        System.out.println("Letter grade " + letterGrade);
        System.out.println();

        // Q12 : display student statistics
        System.out.println(student);
    }

}
