package encapsulation.overloading.student;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student student;
        int[] scores;
        int[] updatedScore;
        int midtermScore;
        int finalScore;
        double overallScore;
        char letterGrade;
        int quizNumberGrade;
        int quizScoreByNumber;

        student = new Student("Bob");
        scores = new int[]{22, 18, -1};

        // Q1
        System.out.println(Arrays.toString(scores));
        student.setAllQuizScores(scores);
        System.out.println();

        // Q2
        updatedScore = student.getQuizScores();
        System.out.println(Arrays.toString(updatedScore));
        System.out.println();

        // Q3
        student.setQuizzesByQuizNumber(1, 105);
        student.setQuizzesByQuizNumber(5, 80);
        student.setQuizzesByQuizNumber(1, 96);
        System.out.println();

        // Q4
        quizScoreByNumber = student.getQuizScoreByQuizNumber(scores,2);
        System.out.println(quizScoreByNumber);

        quizScoreByNumber = student.getQuizScoreByQuizNumber(scores,5);
        System.out.println(quizScoreByNumber);
        System.out.println();

        // Q5
        updatedScore = student.getQuizScores();
        System.out.println(Arrays.toString(updatedScore));
        System.out.println();

        // Q6
        student.setMidtermScore(55);
        student.setMidtermScore(42);

        // Q7
        midtermScore = student.getMidtermScore();
        System.out.println("Midterm score " + midtermScore);
        System.out.println();

        // Q8
        student.setFinalScore(-50);
        student.setFinalScore(62);
        finalScore = student.getFinalScore();
        System.out.println("Final score " + finalScore);
        System.out.println();

        // Q9
        student.setOverallScore(scores);
        overallScore = student.getOverallScore();
        System.out.println("Overall score " + overallScore);
        System.out.println();

        // Q10
        student.setLetterGrade(overallScore);
        letterGrade = student.getLetterGrade();
        System.out.println("Letter grade " + letterGrade);
        System.out.println();

        // Q11
        quizNumberGrade = student.getQuizByQuizNumber(1);
        System.out.println("Quiz grade for quiz 1: " + quizNumberGrade);

        quizNumberGrade = student.getQuizByQuizNumber(2);
        System.out.println("Quiz grade for quiz 2: " + quizNumberGrade);

        student.getQuizByQuizNumber(5);
        System.out.println();

        System.out.println(student);
    }

}
