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
    <%@ include file="../bs-head.jsp" %>
    <title>Search Users</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-6">
            <div class="d-flex justify-content-between mt-5 mb-3">
                <h4>All Users (${totalUsers})</h4>
                <a class="btn btn-info" href="/webapp/users">All Users</a>
            </div>

            <div>
                <form action="/webapp/users/search" method="post">
                    <input type="search" name="search" placeholder="eg. admin">
                    <button type="submit">Search</button>
                </form>
            </div>


            <table class="table">
                <thead class="thead-light">
                <tr>
                    <th scope="col">#ID</th>
                    <th scope="col">Username</th>
                    <th scope="col">Action</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="user" items="${users}">
                    <tr>
                        <th scope="row">${user.id}</th>
                        <td>${user.username}</td>
                        <td>
                            <div class="">
                                <a class="btn btn-success" href="/webapp/users/edit?userId=${user.id}">
                                    Edit
                                </a>
                                    <%-- start modal --%>
                                <!-- Button trigger modal -->
                                <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#modal${user.id}">
                                    Delete
                                </button>

                                <!-- Modal -->
                                <div class="modal fade" id="modal${user.id}" tabindex="-1" aria-labelledby="exampleModalLabel"
                                     aria-hidden="true">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h5 class="modal-title" id="exampleModalLabel">Delete User</h5>
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                    <span aria-hidden="true">&times;</span>
                                                </button>
                                            </div>
                                            <div class="modal-body">
                                                Are sure want to delete this user?
                                            </div>
                                            <div class="modal-footer">
                                                <form action="/webapp/users" method="post">
                                                    <input type="hidden" name="userid" value="${user.id}">

                                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close
                                                    </button>
                                                    <button type="submit" class="btn btn-primary">Confirm</button>

                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                    <%-- end modal --%>


                            </div>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

<%@ include file="../bs-script.jsp" %>

</body>
</html>