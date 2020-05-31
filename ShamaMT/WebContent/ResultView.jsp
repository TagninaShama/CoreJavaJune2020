<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.text.NumberFormat"%>
<%@ page import="java.util.Locale"%>
<%@page import="java.text.NumberFormat"%>
<%@ page import="java.util.Locale"%>
<%
	Double initialAmount = (Double) request.getAttribute("initialAmount");
%>
<%
	Integer rollCount = (Integer) request.getAttribute("rollCount");
%>
<%
	NumberFormat ft = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result View</title>
<link rel="stylesheet" href="Style.css">
</head>
<body>
	<h1>MIST4630 High-Low Game- Result Page</h1>
	<br>
	<p>
		Final balance: <strong> <%=ft.format(initialAmount)%>
		</strong>
	</p>
	<p>
		Thanks for playing. Your final balance is
		<%=ft.format(initialAmount)%></p>
	<p>
		You rolled the dice
		<%=rollCount%>
		times.
	</p>
	<p>
		<a href="index.jsp"> Play again!</a>
	</p>
</body>
<footer>
	<h6>Copyright 2019. All rights reserved.</h6>
</footer>
</html>