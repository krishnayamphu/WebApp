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
    <%@ include file="../bs-head.jsp" %>
    <title>Edit User</title>
</head>
<body>

<div class="container">
    <div class="row mt-5">
        <div class="col-6">
            <div class="d-flex justify-content-between">
                <h4>Update User</h4>
                <a class="btn btn-info" href="/webapp/users">All Users</a>
            </div>
           
            <form action="/webapp/users/edit" method="post">
                <input type="hidden" name="userId" value="${user.id}">


                <div class="form-group">
                    <label>Username:</label>
                    <input type="text" class="form-control" name="username" value="${user.username}" required>
                </div>
                <div class="form-group">
                    <label>Password:</label>
                    <input type="password" class="form-control" name="password" value="${user.password}" required>
                </div>

                <button class="btn btn-primary" type="submit">Update User</button>
            </form>
        </div>
    </div>
</div>

<%@ include file="../bs-script.jsp" %>
</body>
</html>
