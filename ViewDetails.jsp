<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<form action="view">
<table border=1 width=70% height=50%>
<tr><th>Id</th><th>Name</th><th>Contact</th><th>Email</th><th>Date Of Birth</th><th>Age</th><th>Update</th><th>Delete</th></tr>
<c:forEach items="${listCustomers}" var="customer">
<tr><td>${customer.getId()}</td><td>${customer.getName()}</td><td>${customer.getContact()}</td>  
<td>${customer.getEmail()}</td><td>${customer.getDateOfBirth()}</td><td>${customer.getAge()}</td>
<td><a href="updatepage?id=${customer.getId()}">Update</a></td>
<td><a href="delete?id=${customer.getId()}">Delete</a></td></tr> 
</c:forEach>
</table>
</form>
</body>
</html>