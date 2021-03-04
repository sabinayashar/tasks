<%@ page import="reg.serv.*"%>
<html>
<head>
   <title>Student DB</title>
    <style>
        input[type=submit] {width:100%;
                            background-color:#E572CD;
                            color:black;
                            padding:14px 20px;
                            margin:8px 0;
                            border:none;
                            border-radius:30px 30px 30px 30px;
                            cursor:pointer;}
        input[type=submit]:hover {background-color:#BC2B9E;
                                  color:white;}
    </style>
</head>
<body>
    <form method = "GET" action = "startDB">
        <input type = "submit" id = "show" name = "show" value = "SHOW DATA">
    </form>
    <%
        String show = request.getParameter("show");
        if (show != null && show.equals("show")) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/startDB");
            dispatcher.forward(request, response);
        }
    %>
</body>
</html>
