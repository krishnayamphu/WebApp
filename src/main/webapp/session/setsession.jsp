<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10/8/2020
  Time: 3:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Session set</title>
</head>
<body>
<%
    String user="Admin";
    session.setAttribute("user",user);
%>
<p>Session set successfully.</p>

</body>
</html>
