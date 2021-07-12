<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Row Added</p><c:out value="${rowAdded}"></c:out>

<form:form action="cars" method="post" commandName="cars">

<form:label path="model">Model</form:label>
<form:input path="model"/>

<form:label path="yearofmanufacture">YearOfManufacture</form:label>
<form:input path="yearofmanufacture"/>
 
 <form:label path="kilometers">Kilometers</form:label>
 <form:input path="kilometers"/>
 	
 <form:label path="status">Status</form:label>
 <form:select path="status" items="${groups}" />
 
 <form:label path="brandName">BrandName</form:label>
 <form:input path="brandName"/>
 
 <input type="submit" value="ADD">
 </form:form>

</body>
</html>