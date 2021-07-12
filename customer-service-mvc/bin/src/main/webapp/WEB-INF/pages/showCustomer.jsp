<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Customer</title>
</head>
<body>
<table>
<tr>
<th>Id</th>
<th>CustomerName</th>
<th>Email</th>
</tr>

<c:forEach items="${list}" var="eachItem">
<tr>
<td><c:out value="${eachItem.id}"/></td>
<td><c:out value="${eachItem.customerName}"/></td>
<td><c:out value="${eachItem.email}"/></td>
</tr>

</c:forEach>
</table>
</body>
</html>