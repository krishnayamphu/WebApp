<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10/21/2020
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Usesr</title>
</head>
<body>
<h4>New User</h4>
<form action="/webapp/users/create" method="post">
    <label>Username:</label>
    <input type="text" name="username" required>
    <br><br>

    <label>Password:</label>
    <input type="password" name="password" required>
    <br><br>

    <button type="submit">Create User</button>
</form>


</body>
</html>
