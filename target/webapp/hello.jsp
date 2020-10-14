<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10/12/2020
  Time: 3:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
<h1>Hello world !</h1>

<%
    String name=request.getParameter("user");
%>

<h1>Your name is : <%=name%></h1>
</body>
</html>
