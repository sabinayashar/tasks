package ada.wm2.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import ada.wm2.User;
import ada.wm2.helper.UQHelper;

public class QuizServlet extends HttpServlet {
    boolean isStarted = true;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User u = (User)req.getSession().getAttribute("loggedUser");
        String pressedButton = req.getParameter("command");
        HashMap questionMap = (HashMap) req.getSession().getAttribute("questions");
        String selectedAnswer = req.getParameter("choice");
        ArrayList<String> selectedAnswersList = new ArrayList<>();
        int totalScore = u.getTotalScore();

        HashMap correctAnswersMap = UQHelper.getCorrectAnswers();
        ArrayList<String> correctAnswersList = new ArrayList<String>(correctAnswersMap.keySet());

        if(questionMap != null) {
            Object curQuesIdx = req.getSession().getAttribute("curQuesIdx");
            Integer idx = Integer.parseInt(curQuesIdx.toString());
            SimpleDateFormat startTimeFormatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date startTimeDate = new Date();
            u.setStartDate(startTimeFormatter.format(startTimeDate));

            if(curQuesIdx != null) {
                if (">>".equals(pressedButton) || idx == questionMap.size()) {
                    selectedAnswersList.add(selectedAnswer);
                    if (idx != questionMap.size()) idx++;
                }
                if ("<<".equals(pressedButton)) {
                    if (idx != 0) idx--;
                }
                if("FINISH".equals(pressedButton)) {
                    for (int i = 0; i < selectedAnswersList.size(); i++) {
                        for (int j = 0; j < correctAnswersList.size(); j++) {
                            if (selectedAnswersList.get(i).equals(correctAnswersList.get(j))) u.setTotalScore(totalScore + 10);
                            else u.setTotalScore(totalScore + 0);
                        }
                    }
                    String endTimeDate = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").format(LocalDateTime.now().plusMinutes(5));
                    u.setEndDate(endTimeDate);
                    RequestDispatcher result = req.getRequestDispatcher("result.jsp");
                    result.forward(req, resp);
                }
                req.getSession().setAttribute("curQuesIdx", idx);
                RequestDispatcher quests = req.getRequestDispatcher("questions.jsp");
                quests.forward(req, resp);
            }
        }
    }
}