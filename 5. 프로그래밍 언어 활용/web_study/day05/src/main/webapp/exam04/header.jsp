<%@ page contentType="text/html; charset=UTF-8" %>

<%
    String message = request.getParameter("message");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP 디렉티브 태그 연습</title>
</head>
<body>
<header><%=message%></header>