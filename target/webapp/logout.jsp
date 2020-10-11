<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10/8/2020
  Time: 4:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    session.invalidate();
    response.sendRedirect("http://localhost:8080/webapp/login-form.jsp");
%>