<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page  import="java.text.NumberFormat"%>
<%@ page import= "java.util.Locale"%>
<%@ page import = "model.CreditCard"%>
 <% 
//we are in java mode now
 //input 
 CreditCard card = new CreditCard(request.getParameter("firstName"), request.getParameter("lastName"), Integer.parseInt(request.getParameter("accountNum")), Double.parseDouble(request.getParameter("balanceDue")), Double.parseDouble(request.getParameter("percentToPay")));
		
		NumberFormat ft = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
%>
<!DOCTYPE html>
<html>
		<head>
		<style> table, th, td {
				border: 1px solid black;
				border-collapse: collapse;}
		</style>
		</head>
		<body>
		<h1> Credit Payment Schedule </h1>
		<h3>Customer: <%= request.getParameter("firstName")+ " "%> <%= request.getParameter("lastName")%> </h3>
		<h3>Account#: <%= Integer.parseInt(request.getParameter("accountNum"))%> </h3>
		<h3>Balance Due: <%=ft.format(Double.parseDouble(request.getParameter("balanceDue"))) %> </h3>
		<%= card.data()%>
		</body>
		</html>