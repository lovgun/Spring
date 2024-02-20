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
<h1 align="center">Login Successfully</h1>
<hr>
<h2 align="right">${msg.getName()} </h2>

<%-- <h2 align="right">&{msg.getId()} </h2> --%>
<h3 align="right">
<a href="card">My Card</a>
<a href="logout">Log Out</a>
</h3>
<hr>
<table border="2"width="70%"cellpadding="2">
<tr><th>Name</th>
<th>Price</th>
<th>Add to Cart</th></tr>
<c:forEach var="b" items="${item}">
<tr>
<td>${b.getName() }</td>
<td>${b.getPrice() }</td>
<td><a href="/addCard/${b.getId() }">Add to Card</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>