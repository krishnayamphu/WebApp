<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10/8/2020
  Time: 3:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Get Session</title>
</head>
<body>

<%
    String user=(String)session.getAttribute("user");
%>

<p>Username is <%=user%></p>

</body>
</html>
