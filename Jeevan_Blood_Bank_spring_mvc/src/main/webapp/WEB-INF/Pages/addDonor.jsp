<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Blood Donor</title>
</head>
<body>
	
	<form:form method="post" action="donors" commandName="donor">
	
	<form:label path="phoneNumber">Phone Number</form:label>
	<form:input path="phoneNumber"/>
	
	<form:label path="firstName">First Name</form:label>
	<form:input path="firstName"/>
	<span style="color:#ff0000"><form:errors path="phoneNumber"/></span>
	
	<form:label path="bloodGroup">Blood Group</form:label>
	<form:select path="bloodGroup" items="${groups}" />
	
	<input type="submit" value="Add">
	</form:form>	
	
</body>
</html>