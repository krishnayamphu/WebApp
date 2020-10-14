<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
<a href="http://localhost:8080/webapp/hello.jsp?user=ram">go to  hello page</a>
<form action="/webapp/hidden-form" method="get">
    <input type="hidden" name="token" value="token123">
    <label>Text</label>
    <input type="text" placeholder="enter some text" name="mytext">
    <br><br>

    <button type="submit">Submit</button>
</form>


</body>
</html>
