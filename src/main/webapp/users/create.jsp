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
    <title>Create Usesr</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-6">
            <div class="d-flex justify-content-between mt-5 mb-3">
                <h4>New User</h4>
                <a class="btn btn-info" href="/webapp/users">All Users</a>
            </div>

            <form action="/webapp/users/create" method="post">
                <div class="form-group">
                    <label>Username</label>
                    <input class="form-control" type="text" name="username" required>
                </div>

                <div class="form-group">
                    <label>Password</label>
                    <input class="form-control" type="password" name="password" required>
                </div>

                <button class="btn btn-primary" type="submit">Create User</button>
            </form>
        </div>
    </div>
</div>

<%@ include file="../bs-head.jsp" %>
</body>
</html>
