<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
<c:out value="${title}"></c:out>
</h1>
<a href="cars">Add Cars</a>
<a href="cars/all">View Cars</a>
<a href="cars/any">View Available cars</a>
<a href="cars/all">View By Brand</a>
</body>
</html>