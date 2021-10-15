<%-- 
    Document   : login
    Created on : Oct 12, 2021, 5:15:00 PM
    Author     : 775262
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="POST" action="login">
            <label>Username: </label>
            <input type="text" name="user-name" value="${username}">
            <br>
            <label>Password: </label>
            <input type="password" name="user-password" value="">
            <br>

            <input type="submit" value="Log in">
        </form>
    <c:if test="${invalidInput}">
        <p>Invalid entry.</p>
    </c:if>
    <c:if test="${logoutMessage}">
        <p>You have successfully logged out</p>
    </c:if>

</body>
</html>
