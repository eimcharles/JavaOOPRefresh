package usefulExtraExercises.surveyExercise.questionnaire;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Questionnaire {

    private int questionnaireID;
    private Date createdAt;
    private List<Question> questions;

    public Questionnaire(int questionnaireID) {
        this.questionnaireID = questionnaireID;
        this.createdAt = new Date();
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question){
        questions.add(question);
    }

    public void removeQuestion(Question question){
        questions.remove(question);
    }

    public void displayAllQuestions(List questions){
        for (Object question : questions) {
            System.out.println(question);
        }
    }

    public int getQuestionnaireID() {
        return questionnaireID;
    }

    public void setQuestionnaireID(int questionnaireID) {
        this.questionnaireID = questionnaireID;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Questionnaire that = (Questionnaire) o;
        return questionnaireID == that.questionnaireID && Objects.equals(createdAt, that.createdAt) && Objects.equals(questions, that.questions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionnaireID, createdAt, questions);
    }

    @Override
    public String toString() {
        return "Questionnaire {questionnaireID = %d, createdAt = %s, questions = %s}".formatted(questionnaireID, createdAt, questions);
    }
}
