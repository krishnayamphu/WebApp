<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="bs-head.jsp" %>
    <title>All Users</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-12">

            <c:forEach var="image" items="${images}">
                <img width="200px" src="http://localhost:8080/webapp/uploads/${image}" alt="${image}">
            </c:forEach>
            

        </div>
    </div>
</div>

<%@ include file="bs-script.jsp" %>

</body>
</html>