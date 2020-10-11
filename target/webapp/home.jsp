<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10/11/2020
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<%@ include file="header.jsp" %>
<nav>
    <a href="#">Home</a>
    <a href="about.jsp">About us</a>
    <a href="contact.jsp">Contact us</a>
</nav>
<main>
    <aside>Aside</aside>
    <div class="content">
        <article>
            <h1>Welcome to our first blog</h1>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ad, amet architecto atque dolores expedita fuga
                hic illum laborum maxime minus mollitia nam, omnis optio perspiciatis quaerat quam quibusdam sapiente
                voluptate?</p>
        </article>
    </div>
</main>
<%@ include file="footer.jsp" %>
</body>
</html>
