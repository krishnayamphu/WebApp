<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10/19/2020
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Users</title>
</head>
<body>
<h3>All Users</h3>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Username</th>
        <th>Password</th>
        <th>Action</th>
    </tr>

<c:forEach var="user" items="${userlist}">
    <tr>
        <td>${user.id}</td>
        <td>${user.username}</td>
        <td>${user.password}</td>
        <td>
            <a href="/webapp/users/edit?userId=${user.id}">
                <button>Edit</button>
            </a>
            |
            <form action="/webapp/users" method="post">
                <input type="hidden" name="userid" value="${user.id}">
                <button type="submit">Delete</button>
            </form>
        </td>
    </tr>
</c:forEach>
</table>
</body>
</html>
