<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>
</head>
<body>
<p>
<%@ include file="menu.html" %>
</p>
<form>
 <label>Book Id</label>
 <input type="text" name="bookId">
 <label>Book Name</label>
 <input type="text" name="bookName">
 <input type="submit" name="Add">
</form>
</body>
</html>