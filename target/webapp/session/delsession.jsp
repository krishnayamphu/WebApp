<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10/8/2020
  Time: 4:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Session delete</title>
</head>
<body>
<%
    session.invalidate();
%>
<p>all session deleted.</p>
</body>
</html>
