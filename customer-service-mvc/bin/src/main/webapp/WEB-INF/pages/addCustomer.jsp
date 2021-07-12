<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Customer</title>
</head>
<body>
<p>Row Added</p><c:out value="${rowAdded}"></c:out>

<form:form method="post"  action="customers">

<form:label path="id">ID</form:label>
<form:input path="id"/>

<form:label path="email">EMail</form:label>
<form:input path="email"/>

 <form:label path="customerName">Customer Name</form:label>
 <form:input path="customerName"/>
 
 <input type="submit" value="ADD">
 </form:form>

</body>
</html>