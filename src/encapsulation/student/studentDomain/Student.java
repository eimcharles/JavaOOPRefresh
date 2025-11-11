package encapsulation.student.studentDomain;

import encapsulation.student.utility.LetterGrade;

public class Student {

    private String name;
    private final int[] quizScores;
    private double midtermScore;
    private double finalScore;
    private LetterGrade letterGrade;

    // Creates a student that has 3 quizzes
    public Student(String name) {
        this.name = name;
        this.quizScores = new int[3];
    }

    // Creates a student with student name, midtermScore, finalScore
    public Student(String name, double midtermScore, double finalScore) {
        this.name = name;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
        this.quizScores = new int[3];
    }

    public int[] getQuizScores() {
        return this.quizScores;
    }

    public void setQuizScore(int quizIndex, int quizMark) {
        this.quizScores[quizIndex] = quizMark;
    }

    public double getMidtermScore() {
        return midtermScore;
    }

    public void setMidtermScore(double midtermScore) {
        this.midtermScore = midtermScore;
    }

    public double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LetterGrade getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(LetterGrade letterGrade) {
        this.letterGrade = letterGrade;
    }

}


