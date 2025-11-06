package encapsulation.student;

public class Student {

    private String name;
    private final int[] quizScores;
    private double midtermScore;
    private double finalScore;
    private double overallScore;
    private char letterGrade;

    // Creates a student that has 3 quizzes
    public Student(String name) {
        this.name = name;
        this.quizScores = new int[3];
    }

    // Creates a student that variable amount of quizzes
    public Student(String name, int midtermScore, int finalScore) {
        this.name = name;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
        this.quizScores = new int[3];
    }

    public int[] getQuizScores() {
        return this.quizScores;
    }


    /**
     *	    getQuizScoreByQuizNumber takes an quizScores array and quizNumber
     *	    returns the associated quizScore
     * */

    public int getQuizScoreByQuizNumber(int[] quizScores, int quizNumber){
        if (quizScores == null || quizNumber < 0 || quizNumber > quizScores.length){
            System.out.println("Invalid quiz number " + quizNumber + " doesn't exist");
            return 0;
        }

        for (int i = 0; i < quizScores.length; i++) {
            if (i == quizNumber){
                return quizScores[quizNumber - 1];
            }
        }

        return 0;
    }

    /**
     *	    getQuizByQuizNumber takes an integer value quizNumber
     *	    and checks to see if the quizNumber negative or outside the
     *	    length of quizScores array, returns the result for the given quizNumber.
     * */

    public int getQuizByQuizNumber(int quizNumber){
        if (quizNumber < 0 || quizNumber > quizScores.length) {
            System.out.println("Invalid quiz number " + quizNumber + " doesn't exist");
            return 0;
        }

        return this.quizScores[quizNumber-1];
    }

    /**
     * 		setAllQuizScores takes in an array of quizScores
     * 		and checks the values at each index.
     *
     * 		If the value at a given index in the quizScores array is
     * 		outside the quiz range (less than 0 or greater than 20)
     * 		set the value of the quiz at that index to 0.
     * */

    public void setAllQuizScores(int[] quizScores) {

        for (int i = 0; i < quizScores.length; i++) {
            if (quizScores[i] < 0 || quizScores[i] > 20){
                System.out.println("Error invalid quiz score for quiz number " + (i + 1) + " with a values of " + quizScores[i]);
                // reset the quiz score
                this.quizScores[i] = 0;
            } else {
                // set the quiz scores
                this.quizScores[i] = quizScores[i];
            }
        }
    }

    /**
     * 		setQuizzesByQuizNumber takes quizNumber, and a quizMark.
     * 		if the quizNumber is out of bounds it will return an error message,
     * 		and doesn't set the value.
     *
     * 		if the quizNumber is valid, set the quizMark
     * 	    in the quizScores array for the passed quizNumber
     * */

    public void setQuizzesByQuizNumber(int quizNumber, int quizMark){

        // If the quiz number is 0 or greater than the amount of quizzes taken
        if (quizNumber < 0 || quizNumber > quizScores.length){
            System.out.println("Invalid quiz number " + quizNumber + " doesn't exist");
            return;
        }

        if (quizMark < 0 || quizMark > 100){
            System.out.println("Invalid quiz mark " + quizMark);
            return;
        }

        this.quizScores[quizNumber] = quizMark;
    }

    public double getMidtermScore() {
        return midtermScore;
    }

    /**
     *	      setMidtermScore takes an integer values midtermScore,
     *	      and checks to see if the value is between 0 and 50.
     * */

    public void setMidtermScore(double midtermScore) {
        if (midtermScore < 0 || midtermScore > 50){
            System.out.println("Error invalid entry for midterm score");
            return;
        }

        this.midtermScore = midtermScore;
    }

    public double getFinalScore() {
        return finalScore;
    }

    /**
     *	    setFinalScore takes an integer value finalScore,
     *	    and checks to see if the value is between 0 and 100.
     * */

    public void setFinalScore(double finalScore) {
        if (finalScore < 0 || finalScore > 100) {
            System.out.println("Error invalid entry for final score");
            return;
        }

        this.finalScore = finalScore;
    }

    public double getOverallScore() {
        return overallScore;
    }

    /**
     * 		setOverallScore calculates the overall
     * 		grade for a given student
     * */

    public void setOverallScore(int[] quizScores) {

        double quizScoreTotal = 0;
        double averageQuizScore = quizScoreTotal / quizScores.length;
        double quizWeight = averageQuizScore * 0.25;
        double midtermWeight = this.midtermScore * 0.25;
        double finalWeight = this.finalScore * 0.5;

        for (int i = 0; i < quizScores.length; i++) {
            quizScoreTotal += quizScores[i];
        }

        this.overallScore = quizWeight + midtermWeight + finalWeight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public char getLetterGrade() {
        return letterGrade;
    }

    /**
     * 		setLetterGrade calculates the overall
     * 		letter grade for an overallScore
     * */

    public void setLetterGrade(double overallScore) {
        if (overallScore >= 90) {
            this.letterGrade = 'A';
        } else if (overallScore < 90 && overallScore >= 80){
            this.letterGrade = 'B';
        } else if (overallScore < 80 && overallScore >= 70){
            this.letterGrade = 'C';
        } else if (overallScore < 70 && overallScore >= 60){
            this.letterGrade = 'D';
        } else {
            this.letterGrade = 'F';
        }
    }

    public String toString() {
        String report = "";
        report += "Student Name: " + this.name + "\n";
        report += "Grades" + "\n";
        report += "Quiz 1: " + this.quizScores[0] + "\n";
        report += "Quiz 2: " + this.quizScores[1] + "\n";
        report += "Quiz 3: " + this.quizScores[2] + "\n";
        report += "Midterm: " + this.midtermScore + "\n";
        report += "Final Exam: " + this.finalScore + "\n";
        report += "Letter Grade: " + this.letterGrade + "\n";
        return report;
    }

}
