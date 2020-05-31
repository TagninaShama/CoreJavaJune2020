<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page  import="java.text.NumberFormat"%>
<%@ page import= "java.util.Locale"%>
<%@ page import = "model.CreditCard"%>
 <% 
//we are in java mode now
 //input 

CreditCard card = (CreditCard) request.getAttribute("card");
 
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
		<h3>Customer: <%= card.getfName()+ " "%> <%= card.getlName()%> </h3>
		<h3>Account#: <%= card.getAccountNum() %> </h3>
		<h3>Balance Due: <%=ft.format(card.getBalanceDue()) %> </h3>
		<%= card.data() %>
		</html>
		</body>