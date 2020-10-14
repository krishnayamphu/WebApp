<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10/7/2020
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Login</title>
</head>
<body>

<form action="/webapp/login" method="post">
    <label>Username:</label>
    <input type="text" name="username" placeholder="enter username">
    <br><br>

    <label>Password:</label>
    <input type="password" name="password" placeholder="enter password">
    <br><br>
    <p> <%
        if(session!=null){
            String name=(String)session.getAttribute("err");
out.print(name);

        }
    %>
    </p>

    <button type="submit">Login</button>
</form>

</body>
</html>
