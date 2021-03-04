package ada.wm2;

public class Question {
    private int questionId;
    private String questionText;
    private String[] answers;
    private String correctAnswer;

    public Question(){
        ;
    }

    public Question(int id, String q, String[] a, String cA) {
        questionId = id;
        questionText = q;
        answers = a;
        correctAnswer = cA;
    }

    public Integer getQId() {return questionId;}
    public String getQuestionText() {return questionText;}
    public String[] getAnswers() {return answers;}
    public String getCorrectAnswer() {return correctAnswer;}

    public void setQuestionId(Integer id) {questionId = id;}
    public void setQuestionText(String q) {questionText = q;}
    public void setAnswers(String[] a) {answers = a;}
    public void setCorrectAnswer(String cA) {correctAnswer = cA;}
}
