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
</div>

<%@ include file="bs-script.jsp" %>

</body>
</html>