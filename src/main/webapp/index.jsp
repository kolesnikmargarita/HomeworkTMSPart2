<%@page contentType="text/html" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        <%@include file="css/login.css"%>
    </style>
</head>
<body>
<form action=/program_1_war/validation method="post">
    <h1>Authorization</h1>

    <div>
        <input id="username" name="username" type="text" autocomplete="off" placeholder="Enter username" required>
    </div>

    <div>
        <input id="password" name="password" type="password" autocomplete="off" placeholder="Enter password" required>
    </div>

    <div>
        <input id="enter" type="submit">
    </div>
</form>
<img src=img/1.jpg alt="not found" width="400" height="400"/>
</body>
</html>