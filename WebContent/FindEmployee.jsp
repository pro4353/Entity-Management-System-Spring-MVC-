<%@page import="com.beans.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.dao.ClientInvoker"%>
<%@page import="com.dao.*" %>
<jsp:include page="index.jsp" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get Balance</title>
</head>
<body>
<%-- 
int acc_no=Integer.parseInt(request.getParameter("acc_no"));
out.print("Balance of Account number: "+acc_no+" "+ClientInvoker.selectEmployee(acc_no));
--%>
AMount : <%
		int acc_no=Integer.parseInt(request.getParameter("acc_no"));
Employee e=ClientInvoker.selectEmployee(acc_no);
if(e!=null)
out.print("Balance of Account number: "+acc_no+" "+e.getAmount());
	%>
		
</body>
</html>

