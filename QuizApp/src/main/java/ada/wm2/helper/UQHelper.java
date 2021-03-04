package ada.wm2.helper;

import ada.wm2.Question;
import ada.wm2.User;

import java.util.HashMap;

public class UQHelper {

    public static HashMap<String, User> getUsers() {
        HashMap<String, User> userMap = new HashMap<String, User>();

        User u1 = new User("Sabina Yashar", "sabina", "sabina789", false);
        userMap.put(u1.getUser(), u1);
        User u2 = new User("Madina Abdullayeva", "madina", "madina564", false);
        userMap.put(u2.getUser(), u2);
        User u3 = new User("John Doe", "john", "john123", false);
        userMap.put(u3.getUser(), u3);

        return userMap;
    }

    public static HashMap getQuestions() {
        HashMap<Integer, Question> questionMap = new HashMap<Integer, Question>();

        Question q1 = new Question();
        q1.setQuestionId(0);
        q1.setQuestionText("1. What is the approximate length of the tail of a kangaroo?");
        String[] answers1 = {"40", "100", "75"};
        q1.setAnswers(answers1);
        q1.setCorrectAnswer("100");
        questionMap.put(q1.getQId(), q1);

        Question q2 = new Question();
        q2.setQuestionId(1);
        q2.setQuestionText("2. How many snow globes does the person with the largest snow globe collection have?");
        String[] answers2 = {"4034", "4045", "4059"};
        q2.setAnswers(answers2);
        q2.setCorrectAnswer("4059");
        questionMap.put(q2.getQId(), q2);

        Question q3 = new Question();
        q3.setQuestionId(2);
        q3.setQuestionText("3. Until which year did the shoes have no left and right distinction?");
        String[] answers3 = {"1800", "1803", "1807"};
        q3.setAnswers(answers3);
        q3.setCorrectAnswer("1800");
        questionMap.put(q3.getQId(), q3);

        Question q4 = new Question();
        q4.setQuestionId(3);
        q4.setQuestionText("4. What is the obesity rate in America?");
        String[] answers4 = {"40", "35", "38"};
        q4.setAnswers(answers4);
        q4.setCorrectAnswer("38");
        questionMap.put(q4.getQId(), q4);

        Question q5 = new Question();
        q5.setQuestionId(4);
        q5.setQuestionText("5. How many crabs migrate to Indian ocean annually?");
        String[] answers5 = {"4 mln", "43 mln", "34 mln"};
        q5.setAnswers(answers5);
        q5.setCorrectAnswer("43 mln");
        questionMap.put(q5.getQId(), q5);

        Question q6 = new Question();
        q6.setQuestionId(5);
        q6.setQuestionText("6. How many windows are there in the White House?");
        String[] answers6 = {"174", "147", "177"};
        q6.setAnswers(answers6);
        q6.setCorrectAnswer("147");
        questionMap.put(q6.getQId(), q6);

        Question q7 = new Question();
        q7.setQuestionId(6);
        q7.setQuestionText("7. How many words did Eminem use in his Rap God song?");
        String[] answers7 = {"1560", "1650", "1065"};
        q7.setAnswers(answers7);
        q7.setCorrectAnswer("1560");
        questionMap.put(q7.getQId(), q7);

        Question q8 = new Question();
        q8.setQuestionId(7);
        q8.setQuestionText("8. On average, how many minutes does an American football player remain in the game?");
        String[] answers8 = {"15", "14", "12"};
        q8.setAnswers(answers8);
        q8.setCorrectAnswer("12");
        questionMap.put(q8.getQId(), q8);

        Question q9 = new Question();
        q9.setQuestionId(8);
        q9.setQuestionText("9. How many characters can a folder name be on a computer AT MOST?");
        String[] answers9 = {"123", "213", "204"};
        q9.setAnswers(answers9);
        q9.setCorrectAnswer("204");
        questionMap.put(q9.getQId(), q9);

        Question q10 = new Question();
        q10.setQuestionId(9);
        q10.setQuestionText("10. How long is the longest Formula1 tarmac?");
        String[] answers10 = {"6.968 km", "6.788 km", "6.897 km"};
        q10.setAnswers(answers10);
        q10.setCorrectAnswer("6.968 km");
        questionMap.put(q10.getQId(), q10);

        return questionMap;
    }

    public static HashMap getCorrectAnswers() {
        HashMap<String, Question> correctAnswersMap = new HashMap<String, Question>();

        Question q1 = new Question();
        q1.setQuestionId(0);
        q1.setQuestionText("1. What is the approximate length of the tail of a kangaroo?");
        String[] answers1 = {"40", "100", "75"};
        q1.setAnswers(answers1);
        q1.setCorrectAnswer("100");
        correctAnswersMap.put(q1.getCorrectAnswer(), q1);

        Question q2 = new Question();
        q2.setQuestionId(1);
        q2.setQuestionText("2. How many snow globes does the person with the largest snow globe collection have?");
        String[] answers2 = {"4034", "4045", "4059"};
        q2.setAnswers(answers2);
        q2.setCorrectAnswer("4059");
        correctAnswersMap.put(q2.getCorrectAnswer(), q2);

        Question q3 = new Question();
        q3.setQuestionId(2);
        q3.setQuestionText("3. Until which year did the shoes have no left and right distinction?");
        String[] answers3 = {"1800", "1803", "1807"};
        q3.setAnswers(answers3);
        q3.setCorrectAnswer("1800");
        correctAnswersMap.put(q3.getCorrectAnswer(), q3);

        Question q4 = new Question();
        q4.setQuestionId(3);
        q4.setQuestionText("4. What is the obesity rate in America?");
        String[] answers4 = {"40", "35", "38"};
        q4.setAnswers(answers4);
        q4.setCorrectAnswer("38");
        correctAnswersMap.put(q4.getCorrectAnswer(), q4);

        Question q5 = new Question();
        q5.setQuestionId(4);
        q5.setQuestionText("5. How many crabs migrate to Indian ocean annually?");
        String[] answers5 = {"4 mln", "43 mln", "34 mln"};
        q5.setAnswers(answers5);
        q5.setCorrectAnswer("43 mln");
        correctAnswersMap.put(q5.getCorrectAnswer(), q5);

        Question q6 = new Question();
        q6.setQuestionId(5);
        q6.setQuestionText("6. How many windows are there in the White House?");
        String[] answers6 = {"174", "147", "177"};
        q6.setAnswers(answers6);
        q6.setCorrectAnswer("147");
        correctAnswersMap.put(q6.getCorrectAnswer(), q6);

        Question q7 = new Question();
        q7.setQuestionId(6);
        q7.setQuestionText("7. How many words did Eminem use in his Rap God song?");
        String[] answers7 = {"1560", "1650", "1065"};
        q7.setAnswers(answers7);
        q7.setCorrectAnswer("1560");
        correctAnswersMap.put(q7.getCorrectAnswer(), q7);

        Question q8 = new Question();
        q8.setQuestionId(7);
        q8.setQuestionText("8. On average, how many minutes does an American football player remain in the game?");
        String[] answers8 = {"15", "14", "12"};
        q8.setAnswers(answers8);
        q8.setCorrectAnswer("12");
        correctAnswersMap.put(q8.getCorrectAnswer(), q8);

        Question q9 = new Question();
        q9.setQuestionId(8);
        q9.setQuestionText("9. How many characters can a folder name be on a computer AT MOST?");
        String[] answers9 = {"123", "213", "204"};
        q9.setAnswers(answers9);
        q9.setCorrectAnswer("204");
        correctAnswersMap.put(q9.getCorrectAnswer(), q9);

        Question q10 = new Question();
        q10.setQuestionId(9);
        q10.setQuestionText("10. How long is the longest Formula1 tarmac?");
        String[] answers10 = {"6.968 km", "6.788 km", "6.897 km"};
        q10.setAnswers(answers10);
        q10.setCorrectAnswer("6.968 km");
        correctAnswersMap.put(q10.getCorrectAnswer(), q10);

        return correctAnswersMap;
    }

}
