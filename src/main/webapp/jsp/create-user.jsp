<%@page contentType="text/html" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<fmt:setBundle basename="messages"/>
<fmt:setLocale value="ru"/>
<html lang="ru">

<%
    request.setAttribute("itIsFemale", "female");
    request.setAttribute("itIsMale", "male");
%>

<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        <%@include file="../css/bootstrap.min.css"%>
        <%@include file="/css/form.css"%>
    </style>
</head>

<body>
<c:if test="${sessionScope.user != null}">
    <div class="alert alert-info" role="alert">
        <fmt:message key="main.incorrectInput"/>
    </div>
</c:if>

<form action="<c:url value="/user"/>" method="post">
    <h1><fmt:message key="main.title"/></h1>

    <div class="input_field">
        <input id="username" class="field" name="username" type="text" autocomplete="off"
        <c:if test="${sessionScope.user != null}">
               value="<c:out value="${sessionScope.user.username}"/>"
               </c:if>
               placeholder="<fmt:message key="main.username"/>" required>
    </div>
    <div class="input_field">
        <input id="password" class="field" name="password" type="password" autocomplete="off"
        <c:if test="${sessionScope.user != null}">
               value="<c:out value="${sessionScope.user.password}"/>"
               </c:if>
               placeholder="<fmt:message key="main.password"/>" required>
    </div>

    <div class="input_field">
        <input id="firstname" class="field" name="firstname" type="text" autocomplete="off"
        <c:if test="${sessionScope.user != null}">
               value="<c:out value="${sessionScope.user.firstname}"/>"
               </c:if>
               placeholder="<fmt:message key="main.firstname"/>" required>
    </div>

    <div class="input_field">
        <input id="lastname" class="field" name="lastname" type="text" autocomplete="off"
        <c:if test="${sessionScope.user != null}">
               value="<c:out value="${sessionScope.user.lastname}"/>"
               </c:if>
               placeholder="<fmt:message key="main.lastname"/>" required>
    </div>

    <div class="input_field">
        <input id="patronymic" class="field" name="patronymic" type="text" autocomplete="off"
        <c:if test="${sessionScope.user != null}">
               value="<c:out value="${sessionScope.user.patronymic}"/>"
               </c:if>
               placeholder="<fmt:message key="main.patronymic"/>" required>
    </div>

    <div class="input_field">
        <fmt:message key="main.gender"/>
        <input type="radio" name="gender" value="female"
                <c:if test="${sessionScope.user != null}">
                    <c:if test="${sessionScope.user.gender == itIsFemale}">
                        checked
                    </c:if>
                </c:if>
        /><fmt:message key="main.woman"/>
        <input type="radio" name="gender" value="male"
                <c:if test="${sessionScope.user != null}">
                    <c:if test="${sessionScope.user.gender == itIsMale}">
                        checked
                    </c:if>
                </c:if>
        /><fmt:message key="main.man"/>
    </div>

    <div class="input_field">
        <input id="birthDate" class="field" name="birthDate" type="date" autocomplete="off"
        <c:if test="${sessionScope.user != null}">
               value="<c:out value="${sessionScope.user.birthDate}"/>"
               </c:if>
               placeholder="<fmt:message key="main.birthDate"/>" required>
    </div>

    <div class="input_field">
        <input id="city" class="field" name="city" type="text" autocomplete="off"
        <c:if test="${sessionScope.user != null}">
               value="<c:out value="${sessionScope.user.city}"/>"
               </c:if>
               placeholder="<fmt:message key="main.city"/>" required>
    </div>

    <div class="input_field">
        <input id="phoneNumber" class="field" name="phoneNumber" type="text" autocomplete="off"
        <c:if test="${sessionScope.user != null}">
               value="<c:out value="${sessionScope.user.phoneNumber}"/>"
               </c:if>
               placeholder="<fmt:message key="main.phoneNumber"/>" required>
    </div>

    <div class="input_field">
        <input id="enter" type="submit">
    </div>
</form>
<script src="../js/bootstrap.bundle.min.js"></script>
</body>
</html>