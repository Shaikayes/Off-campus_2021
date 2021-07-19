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
<% session.setAttribute("three","rice"); %>
<% out.println(session.getAttribute("one")); %>
<% out.println(session.getAttribute("two")); %>


<a href="third.jsp">next</a>
		<%session.invalidate(); %>



</body>
</html>