package encapsulation.student.service;

import encapsulation.student.studentDomain.Student;

public class StudentService {

    public StudentService() {}

    /**
     * 		updateAllQuizScores takes Student object
     * 		and an array of quizScores.
     *
     * 	    Checks if the quizScores array is initialized and is
     * 	    the same length as the Student object quiz array.
     *
     * 		If the value at a given index in the quizScores array is
     * 		outside the quiz range (less than 0 or greater than 20)
     * 		reset the value of the quiz at that index to 0.
     * */

    public void updateAllQuizScores(Student student, int[] quizScores) {

        // Makes sure that the passed array is the same size as the quiz array
        if (quizScores == null || quizScores.length != student.getQuizScores().length) {
            System.out.println("Invalid quizzes, value must be in range 1-" + student.getQuizScores().length);
            return;
        }

        for (int i = 0; i < quizScores.length; i++) {
            if (quizScores[i] < 0 || quizScores[i] > 20){
                System.out.println("Invalid quiz score for quiz number " + (i + 1) + " with a values of " + quizScores[i]);
                // reset the quiz score
                student.setQuizScore(i, 0);
            } else {
                student.setQuizScore(i, quizScores[i]);
            }
        }
    }

    /**
     * 		updateQuizScore takes a Student object, a
     * 	    quizNumber, and a quizScore.
     *
     * 		if the quizNumber or quizScore is out of bounds,
     * 		returns an error message.
     *
     * 		if the quizNumber and quizScore are valid, sets the quizScore
     *
     * */

    public void updateQuizScore(Student student, int quizNumber, int quizScore){

        int[] quizScores = student.getQuizScores();

        // If the quiz number is 0 or greater than the amount of quizzes taken
        if (quizNumber <= 0 || quizNumber > quizScores.length){
            System.out.println("Invalid quiz number " + quizNumber + " doesn't exist");
            return;
        }

        if (quizScore <= 0 || quizScore > 20){
            System.out.println("Invalid score value " + quizScore + " value must be in range (0-20)");
            return;
        }

        // shifts quizNumber index by -1 and assigns the quizScore
        student.setQuizScore(quizNumber - 1, quizScore);
    }

    /**
     *	      updateMidtermScore take a Student object and midtermScore,
     *	      and checks to see if the value is between 0 and 50.
     *
     *	      if the value is valid, updates a student's midterm score.
     * */

    public void updateMidtermScore(Student student, int midtermScore) {
        if (midtermScore < 0 || midtermScore > 50){
            System.out.println("Error invalid value for midterm score, value must be in range (0-50)");
            return;
        }

        student.setMidtermScore(midtermScore);
    }

    /**
     *	    updateFinalScore takes a Student object and a finalScore,
     *	    and checks to see if the value is between 0 and 100.
     *
     *	    if the value is valid, updates a student's final score
     * */

    public void updateFinalScore(Student student, int finalScore) {
        if (finalScore <= 0 || finalScore > 100) {
            System.out.println("Error invalid value for final score, value must be in range (0-100)");
            return;
        }

        student.setFinalScore(finalScore);
    }

    /**
     *	    findQuizNumberByStudent takes Student object and quizScore,
     *	    checks to see if the quizScore negative or outside the
     *	    length of quizScores array, returns the associated quizNumber.
     * */

    public int findQuizNumberByStudent(Student student, int quizScore){

        int[] quizScores = student.getQuizScores();

        if (quizScore <= 0 || quizScore > 20) {
            System.out.println("Invalid quiz score " + quizScore + " doesn't exist");
            return -1;
        }

        for (int i = 0; i < quizScores.length; i++) {
            if (quizScores[i] == quizScore){
                // Shifts quizNumber index by +1
                return i+1;
            }
        }

        return -1;
    }

    /**
     *	    findQuizScoreByStudent takes Student object and a quizNumber,
     *	    returns the associated quizScore
     * */

    public double findQuizScoreByStudent(Student student, int quizNumber){

        int[] quizScores = student.getQuizScores();

        if (quizNumber <= 0 || quizNumber > quizScores.length){
            System.out.println("Invalid quiz number " + quizNumber + " doesn't exist, value must be between 1-" + quizScores.length);
            return -1;
        }

        // Shifts quizNumber index by -1
        return quizScores[quizNumber - 1];
    }

}
