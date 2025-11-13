package encapsulation.student.utility;

import encapsulation.student.studentDomain.Student;

public class StudentReport {

    public StudentReport() {}

    /**
     *      formatReport() formats a report for the given Student object.
     *
     *      The report includes:
     *           - Student's name
     *           - Quiz scores for all quizzes
     *           - Midterm score
     *           - Final exam score
     *           - Letter grade.
     *
     */

    public String formatReport(Student student) {
        StringBuilder report = new StringBuilder();
        report.append("Student Name: ").append(student.getName()).append("\n");
        report.append("Grades:\n");

        int[] quizzes = student.getQuizScores();
        for (int i = 0; i < quizzes.length; i++) {
            report.append("Quiz ").append(i + 1).append(": ").append(quizzes[i]).append("/20\n");
        }

        report.append("Midterm: ").append(student.getMidtermScore()).append("/50\n");
        report.append("Final Exam: ").append(student.getFinalScore()).append("/100\n");
        report.append("Letter Grade: ").append(student.getLetterGrade()).append("\n");
        return report.toString();
    }

}
