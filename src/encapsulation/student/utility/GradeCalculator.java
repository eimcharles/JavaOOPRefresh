package encapsulation.student.utility;

import encapsulation.student.studentDomain.Student;

public class GradeCalculator {

    public GradeCalculator() {}

    /**
     * 		calculates the overall grade
     * 		for a given Student Object
     * */

    public void setOverallStudentScore(Student student) {

        // Sum up the quiz scores
        double quizScoreTotal = 0;
        int[] quizScores = student.getQuizScores();

        for (int i = 0; i < quizScores.length; i++) {
            quizScoreTotal += quizScores[i];
        }

        //  Compute the average and weights
        double averageQuizScore = quizScoreTotal / quizScores.length;
        double quizWeight = averageQuizScore * 0.25;
        double midtermWeight = student.getMidtermScore() * 0.25;
        double finalWeight = student.getFinalScore() * 0.5;

        student.setFinalScore(quizWeight + midtermWeight + finalWeight);
    }

    /**
     *      calculates the letter grade
     *      given a Student object
     */

    public void updateLetterGrade(Student student) {

        double overallScore = student.getFinalScore();

        if (overallScore >= 90) {
            student.setLetterGrade(LetterGrade.A);
        } else if (overallScore >= 80){
            student.setLetterGrade(LetterGrade.B);
        } else if (overallScore >= 70){
            student.setLetterGrade(LetterGrade.C);
        } else if (overallScore >= 60){
            student.setLetterGrade(LetterGrade.D);
        } else {
            student.setLetterGrade(LetterGrade.F);
        }
    }

}
