<%--
  Created by IntelliJ IDEA.
  User: Hp
  Date: 5/19/2022
  Time: 2:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>
</head>
<body>
<h1>Page:2 Add User</h1>
<form action="/user/save" method="post">
    <table>
        <tr>
            <td>Username</td>
            <td><input name="userName"/></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input name="password"/></td>
        </tr>
        <tr>
            <td>FirstName</td>
            <td><input name="firstName"/></td>
        </tr>
        <tr>
            <td>LastName</td>
            <td><input name="lastName"/></td>
        </tr>
        <tr>
            <td>PhoneNuber</td>
            <td><input name="phoneNumber"/></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input name="email"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Saqlash"></td>
        </tr>
    </table>
</form>
</body>
</html>
