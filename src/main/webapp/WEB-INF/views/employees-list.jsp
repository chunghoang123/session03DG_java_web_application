<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: chung
  Date: 4/7/2026
  Time: 1:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee List</title>
</head>
<body>
<h1>Employee List</h1>

<table>
    <thead>

        <tr>
            <td>ID</td>
            <td>Fullname</td>
            <td>Department</td>
            <td>Salary</td>
        </tr>
    </thead>
<c:forEach var="employee" items="${employees}">

</c:forEach>
</table>


</body>
</html>
