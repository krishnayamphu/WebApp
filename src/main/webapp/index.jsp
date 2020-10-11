<%@ page import="java.util.Date" %>
<html>
<head>
    <title>Welcome</title>
</head>

<body>
<h1>Welcome to Advanced java</h1>
<% out.print("Hello World"); %>
<br>
<% int age=50; %>

<% out.print("Age: "+age); %>
<br>
<% out.print("sum: "+(50+5)); %>

<br>
<h1>Age=<%= age %></h1>

<p>Today: <%= new Date()%></p>


<%!

    int getSqr(int n){
        return n*n;
    }
%>

<p>The square value is: <%=getSqr(5)%></p>
</body>
</html>