package encapsulation.student;

import encapsulation.student.service.StudentService;
import encapsulation.student.studentDomain.Student;
import encapsulation.student.utility.GradeCalculator;
import encapsulation.student.utility.StudentReport;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student charles = new Student("Charles");
        StudentService studentService = new StudentService();
        GradeCalculator gradeCalculator = new GradeCalculator();
        StudentReport studentReport = new StudentReport();

        double quizNumber;
        double quizNumberScore;
        String charlesReport;

        int[] invalidQuizScores = new int[]{-1, 12, 21};

        studentService.updateAllQuizScores(charles, invalidQuizScores);
        System.out.println(Arrays.toString(invalidQuizScores));
        System.out.println();

        studentService.updateQuizScore(charles, 1, 13);
        int[] validQuizScores = charles.getQuizScores();
        System.out.println(Arrays.toString(validQuizScores));
        System.out.println();

        // Invalid input for midterm score
        studentService.updateMidtermScore(charles, 105);
        studentService.updateMidtermScore(charles, 55);
        System.out.println();

        // Valid input - midterm score set
        studentService.updateMidtermScore(charles, 30);

        // Invalid input for final score
        studentService.updateFinalScore(charles, -1);
        studentService.updateFinalScore(charles, 105);
        System.out.println();

        // Valid input - final score set
        studentService.updateFinalScore(charles, 75);

        // Invalid quiz range passed
        studentService.findQuizNumberByStudent(charles, 25);

        // find quiz by student and valid quiz score
        quizNumber = studentService.findQuizNumberByStudent(charles, 13);

        // Invalid quiz value passed
        studentService.findQuizScoreByStudent(charles, 0);

        // Finds quiz by student and valid quiz number
        quizNumberScore = studentService.findQuizScoreByStudent(charles, 1);
        System.out.println("The quiz number: " + quizNumber +  " has a grade of " + quizNumberScore);
        System.out.println();

        // Calculate the overall score and letter grade
        gradeCalculator.setOverallStudentScore(charles);
        gradeCalculator.updateLetterGrade(charles);

        // Create the student report
        charlesReport = studentReport.formatReport(charles);
        System.out.println(charlesReport);






    }

}
