<%-- 
    Document   : home
    Created on : Oct 12, 2021, 5:23:24 PM
    Author     : 775262
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <h2>Hello ${user.userName}</h2>
        <a href="home?logout=true">logout</a>
    </body>
</html>
