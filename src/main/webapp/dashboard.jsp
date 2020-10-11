<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10/8/2020
  Time: 4:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard</title>

</head>
<body>
<%
String user=(String)session.getAttribute("user");
    if(user==null){
        response.sendRedirect("http://localhost:8080/webapp/login-form.jsp");
    }
%>
<%=session.getAttribute("user")%>
<form action="logout.jsp" method="post">
    <button type="submit">Logout</button>
</form>
<h1>WELCOME TO DASHBOARD</h1>

</body>
</html>
