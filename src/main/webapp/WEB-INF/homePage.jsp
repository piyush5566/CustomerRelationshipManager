<%--
  Created by IntelliJ IDEA.
  User: piyushkk
  Date: 1/1/2024
  Time: 11:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CRM - Customer Relationship Manager</title>
    <link href="${pageContext.request.contextPath}/WEB-INF/formInput.css" rel="stylesheet" type="text/css">
</head>
<body>
<h1>CRM - Customer Relationship Manager</h1>
<button onclick="location.href = '${pageContext.request.contextPath}/WEB-INF/customerForm.jsp';">Add Customer</button>
<table>
    <thead>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>John</td>
        <td>Adams</td>
        <td>john@gmail.com</td>
        <td><a href="${pageContext.request.contextPath}/update">Update</a> | <a href="${pageContext.request.contextPath}/delete">Delete</a></td>
    </tr>
    <tr>
        <td>Chitvan</td>
        <td>Dixit</td>
        <td>chitvan.dixit@gmail.com</td>
        <td><a href="${pageContext.request.contextPath}/update">Update</a> | <a href="${pageContext.request.contextPath}/delete">Delete</a></td>
    </tr>
    <tr>
        <td>Donald</td>
        <td>Duck</td>
        <td>donald@gmail.com</td>
        <td><a href="${pageContext.request.contextPath}/update">Update</a> | <a href="${pageContext.request.contextPath}/delete">Delete</a></td>
    </tr>
    <tr>
        <td>Ajay</td>
        <td>Rao</td>
        <td>ajay@gmail.com</td>
        <td><a href="${pageContext.request.contextPath}/update">Update</a> | <a href="${pageContext.request.contextPath}/delete">Delete</a></td>
    </tr>
    <tr>
        <td>Shourya</td>
        <td>Roy</td>
        <td>Shourya.Roy@gmail.com</td>
        <td><a href="${pageContext.request.contextPath}/update">Update</a> | <a href="${pageContext.request.contextPath}/delete">Delete</a></td>
    </tr>
    </tbody>
</table>
</body>
</html>

