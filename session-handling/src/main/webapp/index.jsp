<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% out.println(session.isNew()); %>
<% out.println(session.getId()); %>

<% session.setAttribute("one","sugar"); %>

<a href="First.jsp">next</a>


</body>
</html>