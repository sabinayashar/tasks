package ada.wm2.servlet;

import ada.wm2.Question;
import ada.wm2.User;
import ada.wm2.helper.UQHelper;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class AuthServlet extends HttpServlet {
    HashMap<String, User> userMap = new HashMap<String, User>();
    HashMap<Integer, Question> questionMap = new HashMap<Integer, Question>();

    public void init() {
        userMap = UQHelper.getUsers();
        questionMap = UQHelper.getQuestions();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String pass = req.getParameter("pass");
        User u = userMap.get(user);
        if(u == null) {
            RequestDispatcher error = req.getRequestDispatcher("error.html");
            error.forward(req, resp);
        }
        if (!(u.getPassword().equals(pass))) {
            PrintWriter wrongPass = resp.getWriter();
            wrongPass.println("Please include correct password!");
            wrongPass.close();
        }

        if(u.isUserLogged()) {
            PrintWriter lostChance = resp.getWriter();
            lostChance.println("You have already taken the test!");
            lostChance.close();
        }
        else {
            u.setUserLogged(true);
            req.getSession().setAttribute("loggedUser", u);
            req.getSession().setAttribute("curQuesIdx", 0);
            req.getSession().setAttribute("questions", questionMap);
            RequestDispatcher quests = req.getRequestDispatcher("questions.jsp");
            quests.forward(req, resp);
        }
    }
}
