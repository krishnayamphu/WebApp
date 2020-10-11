<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10/7/2020
  Time: 3:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Authentication</title>
</head>
<body>
<%
    String username=request.getParameter("username");
    String password=request.getParameter("password");

    if(username.equals("admin") && password.equals("a123")){
        session.setAttribute("user",username);
        response.sendRedirect("http://localhost:8080/webapp/dashboard.jsp");
    }else{
        response.sendRedirect("http://localhost:8080/webapp/login-form.jsp");
    }
%>


</body>
</html>
