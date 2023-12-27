<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ page import="by.kolesnik.program_1.homework2.TimeServlet" %>
<!--<!DOCTYPE html>-->
<!--html lang="en"-->

<%
    request.setAttribute("time", TimeServlet.getTime());
%>

<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        <%@include file="../css/time.css"%>
    </style>
</head>
<body>
<p class="title">Time in Minsk naw</p>
<div class="time">
    <p><c:out value="${time}"/></p>
</div>
</body>
</html>