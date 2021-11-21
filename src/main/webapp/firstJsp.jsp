<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>firstJsp</title>
</head>
<body>
<h2 style="color: olivedrab">First jsp</h2>
<hr>
<%
    java.util.Date now = new java.util.Date();
    String dateString = "Today is " + now;
%>
<%= dateString %>
</body>
</html>

