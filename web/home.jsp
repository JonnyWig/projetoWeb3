<%@page import="model.User" %>
<%
    User u = (User)request.getAttribute("userName");
    User uSession = (User)session.getAttribute("userNameSession");
%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>bem vindo <%= u %> </h1>
        <h1>bem vindo <%= uSession %> </h1>
        
    </body>
</html>
