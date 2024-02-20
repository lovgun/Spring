<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>EDIT FORM</h2>
<form action="/update">
<input type="hidden" placeholder="Enter your id" name="id" value="${edit1.getId() }">
<input type="text" placeholder="Enter your Name" name="name" value="${edit1.getName() }">
<input type="password" placeholder="Enter your password" name="pass" value="${edit1.getPass() }">
<input type="number" placeholder="Enter your Age" name="age" value="${edit1.getAge() }">
<input type="text" placeholder="Enter your Address" name="address" value="${edit1.getAddress() }">
<input type="submit" value="update">

</form>
</body>
</html>