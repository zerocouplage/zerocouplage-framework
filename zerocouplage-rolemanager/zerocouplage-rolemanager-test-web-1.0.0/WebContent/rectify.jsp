<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>rectify page</title>
</head>
<body>

<% String LastName = request.getParameter("lastname"); %>
<h2> Hello, Mr  <%= LastName %> <br> You are on the page Rectify</h2>

</body>  
</html> 