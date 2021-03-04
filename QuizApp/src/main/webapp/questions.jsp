<%@ page import = "java.util.*, ada.wm2.*"%>

<html>
<head>
    <title>Quiz</title>
</head>

<body>
 <%
    User u = (User)session.getAttribute("loggedUser");
 	HashMap<Integer,Question> questionMap = (HashMap)session.getAttribute("questions");
 	Integer curQuesIdx = (Integer)session.getAttribute("curQuesIdx");
    Question q = questionMap.get(curQuesIdx);

 %>
    User: <b><%=u.getFullName()%></b>
    <br>
    Quiz consists of <b><%=questionMap.size()%></b> questions.
    <br>
    GOOD LUCK and HAVE FUN!
    <br>
    <h4><%=q.getQuestionText()%></h4>
    <form method = "GET" action = "quiz">
        <%
            String[] answers = q.getAnswers();
            for (int i = 0; i < answers.length; i++) {
        %>
        <input type="radio" id="answer" name="choice" value="<%=i%>"><%=answers[i]%><br>
        <%
            }
        %>
        <%
            if(curQuesIdx == 0) {
        %>
        <br>
        <input type="submit" name="command" value=">>">
        <%
            }
            else if(curQuesIdx == 9) {
        %>
        <br>
        <input type="submit" name="command" value="<<"><br>
        <input type="submit" name="command" value="FINISH">
        <%
            }
            else {
        %>
     <br>
    <input type="submit" name="command" value="<<">
    <input type="submit" name="command" value=">>">
    </form>
        <%
           }
        %>
</body>
</html>
