<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hp
  Date: 6/1/2022
  Time: 12:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>
        Bean
    </title>
</head>
<body>
<tabel>
    <tr>
        <td>UserName</td>
        <td>Password</td>
        <td>FirstName</td>
        <td>LastName</td>
        <td>PhoneNumber</td>
        <td>Email</td>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td > <a href="">${user.userName}</a></td>
            <td>${user.password}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.phoneNumber}</td>
            <td>${user.email}</td>
        </tr>
    </c:forEach>
</tabel>

</body>
</html>
