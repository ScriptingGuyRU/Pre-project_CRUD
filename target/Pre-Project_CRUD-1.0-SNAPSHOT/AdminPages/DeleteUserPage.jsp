<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 09.04.2020
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete User</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<body>

<form action="/admin/deleteUser" method="POST">
    Id :<input type="text" name="id" value="<%= request.getParameter("id")%>" required>
    <div class="w3-container">
        <p><button class="w3-button w3-cyan" type="submit">Delete</button></p>
    </div>
</form>

</body>
</html>
