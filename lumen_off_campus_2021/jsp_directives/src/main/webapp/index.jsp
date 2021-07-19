<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Novel</title>
<style type="text/css">

ul>li{

display:inline;
padding:10px 10px;
}

</style>
</head>
<body>
<c:set var="Author" value="Robert James" scope="page"/>
<h1 style="text-align:center; color: #0000ff">
<c:out value="${Author}"/>
</h1>
<p>
<%@ include file="menu.html" %>
</p>
</body>
</html>