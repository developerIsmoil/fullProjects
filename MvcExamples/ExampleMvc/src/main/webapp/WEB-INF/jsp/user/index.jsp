<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hp
  Date: 5/19/2022
  Time: 12:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users Page</title>
</head>
<body>
<h1>Page:1 Users Page</h1>
<a href="/user/add">Yangi User qo'shish</a>
<table border="1">
    <tr>
        <td>UserName(Bean Yo'li)</td>
        <td>Password</td>
        <td>FirstName</td>
        <td>LastName</td>
        <td>PhoneNumber</td>
        <td>Email</td>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td > <a href="/user/get/${user.userName}">${user.userName}</a></td>
            <td>${user.password}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.phoneNumber}</td>
            <td>${user.email}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
