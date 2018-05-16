<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get Balance</title>
</head>
<body>


<br>
<form action="FindEmployee.jsp">
Account No <input type="text" name="acc_no"/><br>
<input type="submit" value="Find"/>
</form>
<h1>Update your Amount</h1>
<form action="updateEmployee.jsp">
Account No <input type="text" name="acc_no"/><br>
Amount <input type="text" name="amount"/><br>
<input type="submit" value="Add"/>
</form>
</body>
</html>
