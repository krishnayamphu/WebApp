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
        <div class="col-6">
            <form method="POST" enctype="multipart/form-data" action="/webapp/media">
                File to upload: <input type="file" name="upfile"><br/>
                <button type="submit"> Upload</button>
            </form>
        </div>
    </div>


    <div class="row row-cols-1 row-cols-md-4">
        <c:forEach var="image" items="${images}">
            <div class="col mb-4">
                <div class="card">
                    <form class="form-inline" action="/webapp/del-image" method="post">
                        <input type="hidden" name="imageName" value="${image}">
                        <button class="btn btn-danger"  type="submit"> X </button>
                    </form>
                    <img class="card-img-top" src="http://localhost:8080/webapp/uploads/${image}" alt="${image}">
                </div>
            </div>
        </c:forEach>

    </div>
</div>


<%@ include file="bs-script.jsp" %>

</body>
</html>