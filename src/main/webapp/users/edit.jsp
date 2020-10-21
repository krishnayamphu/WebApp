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
    <title>Edit User</title>
</head>
<body>
<h4>Update User</h4>
<form action="/webapp/users/edit" method="post">
    <input type="hidden" name="userId" value="${user.id}">
    <label>Username:</label>
    <input type="text" name="username" value="${user.username}" required>
    <br><br>

    <label>Password:</label>
    <input type="password" name="password" value="${user.password}" required>
    <br><br>

    <button type="submit">Update User</button>
</form>


</body>
</html>
