<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Card Details</h1>
<h2 align="right">${user.getName()} </h2>
<h2 align="right">${user.getId()} </h2>
<a href="logout">Log out</a>
<hr>
<table border="2"width="70%"cellpadding="2">
<tr><th>Name</th>
<th>Price</th></tr>
<c:forEach var="b" items="${list}">
<tr>
<td>${b.getName() }</td>
<td>${b.getPrice() }</td>
</tr>
</c:forEach>
</table>
<h2 align="center">
<a href="order">Please order</a>
</h2>
</body>
</html>









