<%@ page import = "java.util.*, ada.wm2.*"%>

<html>
<head>
  <title>Result</title>
</head>

<body>
   <%User u = (User)session.getAttribute("loggedUser");%>

   <h3>Congratulations on finishing "Guess What"!</h3>
   <h3>User: <b><%u.getFullName();%><b></h3><br>
   <h3><b>Start Date:</b> <%out.println(u.getStartDate());%></h3>
   <h3><b>End Date:</b> <%out.println(u.getEndDate());%></h3>
   <h3><b>Maximum Score:</b> 100</h3>
   <h3><b>Your Score:</b> <%out.println(u.getTotalScore());%></h3>
</body>

</html>