<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View All Customers</title>
</head>
<body>
<h1>Customer List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>account_no</th><th>f_name</th><th>l_name</th><th>e_mail</th><th>amount</th></tr>
<c:forEach var="emp" items="${list}">
<tr>
<td>${emp.acc_no}</td>
<td>${emp.f_name}</td>
<td>${emp.l_name}</td>
<td>${emp.e_mail}</td>
<td>${emp.amount}</td>
</tr>
</c:forEach>
</table>
</body>
</html>