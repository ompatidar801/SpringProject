<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action = "home.do" method = "post">
		<div>
			<input type="submit" name="action" value="ItalianPizza"  style="height: 50px; width: 100px;" >
			<input type="submit" name="action" value="IndianPizza" style="height: 50px; width: 100px; ">
			<input type="submit" name="action" value="Orders" style="height: 50px; width: 100px; ">
		</div>
	</form>
</body>
</html>