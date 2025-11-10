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

    /**
     *	    getQuizScoreByQuizNumber takes quizNumber
     *	    returns the associated quizScore
     * */

    public int getQuizScoreByQuizNumber(int quizNumber){
        if (quizNumber <= 0 || quizNumber > this.quizScores.length){
            System.out.println("Invalid quiz number " + quizNumber + " doesn't exist");
            return -1;
        }

        // if quiz number is 1 returns index 0 with quizMark
        return this.quizScores[quizNumber - 1];
    }

    /**
     *	    getQuizByQuizScore takes an integer value quizScore
     *	    and checks to see if the quizScore negative or outside the
     *	    length of quizScores array, returns the associated quizNumber.
     * */

    public int getQuizByQuizScore(int quizScore){
        if (quizScore < 0 || quizScore > 20) {
            System.out.println("Invalid quiz score value " + quizScore);
            return -1;
        }

        for (int i = 0; i < quizScores.length; i++) {

            if (quizScores[i] == quizScore){
                // Quiz numbers are index 0 + 1.
                return i+1;
            }
        }

        return -1;
    }

    /**
     * 		setAllQuizScores takes in an array of quizScores
     * 		and checks the values at each index.
     *
     * 		If the value at a given index in the quizScores array is
     * 		outside the quiz range (less than 0 or greater than 20)
     * 		reset the value of the quiz at that index to 0.
     * */

    public void setAllQuizScores(int[] quizScores) {

        // Makes sure that the passed array is the same size as the quiz array
        if (quizScores.length != this.quizScores.length) {
            System.out.println("Incorrect number of quiz scores.");
            return;
        }

        for (int i = 0; i < quizScores.length; i++) {
            if (quizScores[i] < 0 || quizScores[i] > 20){
                System.out.println("Invalid quiz score for quiz number " + (i + 1) + " with a values of " + quizScores[i]);
                // reset the quiz score
                this.quizScores[i] = 0;
            }  else {
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
        if (quizNumber <= 0 || quizNumber > quizScores.length){
            System.out.println("Invalid quiz number " + quizNumber + " doesn't exist");
            return;
        }

        if (quizMark < 0 || quizMark > 20){
            System.out.println("Invalid score value " + quizMark);
            return;
        }

        // if quiz number is 1 - sets index 0 with quizMark
        this.quizScores[quizNumber - 1] = quizMark;
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
            System.out.println("Error invalid value for midterm score");
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
            System.out.println("Error invalid value for final score");
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

    public void setOverallScore() {

        // Sum up the quiz scores first
        double quizScoreTotal = 0;

        for (int i = 0; i < this.quizScores.length; i++) {
            quizScoreTotal += quizScores[i];
        }

        // Then compute the average and weights
        double averageQuizScore = quizScoreTotal / quizScores.length;
        double quizWeight = averageQuizScore * 0.25;
        double midtermWeight = this.midtermScore * 0.25;
        double finalWeight = this.finalScore * 0.5;

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

    public void setLetterGrade() {
        if (this.overallScore >= 90) {
            this.letterGrade = 'A';
        } else if (this.overallScore < 90 && this.overallScore >= 80){
            this.letterGrade = 'B';
        } else if (this.overallScore < 80 && this.overallScore >= 70){
            this.letterGrade = 'C';
        } else if (this.overallScore < 70 && this.overallScore >= 60){
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
