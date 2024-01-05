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
<form name="Save Customer" action="" method="post" class="form-example" autocomplete="on">
    <h2>Save Customer</h2>
    <div class="form-example">
        <label>
            First name:  <input type="text" name="firstName" />
        </label>
    </div>
    <div class="form-example">
        <label>
            Last name:  <input type="text" name="lastName" required/>
        </label>
    </div>
    <div class="form-example">
        <label>
            Email:  <input type="email" name="email" required />
        </label>
    </div>
    <div class="save-button">
        <input type="submit" value="Save" />
    </div>
</form>
<a href="${pageContext.request.contextPath}/WEB-INF/homePage.jsp">Back to List</a>
</body>
</html>