<%-- 
    Document   : login
    Created on : 18 Jun 2023, 15:10:11
    Author     : icbt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="index.jsp" method="post">
            <label>Username</label><br>
            <input type="text" id="username" name="username" value=""><br>
            <label>Password:</label><br>
            <input type="password" id="password" name="password" value=""><br><br>
            <input type="submit" value="Login">
        </form> 
    </body>
</html>
