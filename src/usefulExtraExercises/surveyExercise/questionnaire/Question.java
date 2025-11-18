package usefulExtraExercises.surveyExercise.questionnaire;

import java.util.Objects;

public class Question {

    private String question;

    public Question(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Question question1 = (Question) o;
        return Objects.equals(question, question1.question);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(question);
    }

    @Override
    public String toString() {
        return "Question { question = '%s'}".formatted(question);
    }
}
