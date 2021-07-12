<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<title>Available Cars for Sale</title>
<style type="text/css">
table,tr,th,td{
	border:2px solid blue;
	font-family:'comic sans ms', sans-serif;
	background-color: rgb(0,0,255);
}
table tr{
	border-radius:20px;
	box-shadow:0px 0px 10px darkslategray;
}
table{
	width:100%;'
}

</style>
</head>
<body>
<table>
<tr>
<th>Model</th>
<th>YearOfManufacture</th>
<th>Status</th>
<th>Kilometers</th>
<th>BrandName</th>
</tr>
<c:forEach items="${list}" var="eachItem">
<tr>
<td><c:out value="${eachItem.model}"/></td>
<td><c:out value="${eachItem.yearofmanufacture}"/></td>
<td><c:out value="${eachItem.status}"/></td>
<td><c:out value="${eachItem.kilometers}"/></td>
<td><c:out value="${eachItem.brandName}"/></td>
</tr>
</c:forEach>
</table>

</body>
</html>