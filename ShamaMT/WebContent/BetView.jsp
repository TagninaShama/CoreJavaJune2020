<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.text.NumberFormat"%>
<%@ page import="java.util.Locale"%>
<%@page import="Model.Die"%>
<%
	NumberFormat ft = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
%>
<%
	Double initialAmount = (Double) request.getAttribute("initialAmount");
%>
<%
	Integer rollCount = (Integer) request.getAttribute("rollCount");
%>
<%
	Die one = new Die();
	Die two = new Die();
	int valueOne = one.getValue();
	int valueTwo = two.getValue();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bet View</title>
<link rel="stylesheet" href="Style.css">
</head>
<body>
	<h1>MIST4630 High-Low Game- Bet Page</h1>
	<p>
		Current Balance: <strong><%=ft.format(initialAmount)%></strong>
	</p>
	<table>
		<form action="RollServlet" method="post">
			<tr>
				<td colspan='1'><label> Bet Amount </label></td>
				<td colspan='2'><input type="text" name="amount" value="">
					<input type="hidden" name="initialAmount" value=<%=initialAmount%>>
					<input type="hidden" name="rollCount" value=<%=rollCount%>>

				</td>
			</tr>
			<tr>
				<td>Low: sum = 2 through 6 <br> (odds - 1:1)<br> <input
					type="radio" name="option" value="low">

				</td>
				<td>Seven: sum = 7 <br> (pay out = 4:1)<br> <input
					type="radio" name="option" value="seven">

				</td>
				<td>High: sum = 8 through 12 <br> (pay out = 1:1)<br>
					<input type="radio" name="option" value="high">

				</td>
			</tr>
			<tr>
				<td colspan='2'><input type="submit" name="subBtn"
					value="Place bet"> <input type="hidden" name="val1"
					value="<%=valueOne%>"> <input type="hidden" name="val2"
					value="<%=valueTwo%>">
		</form>
		</td>
		<td colspan='1'>
			<form action="ResultServlet" method="post">
				<input type="submit" name="subBtn" value="Quit"> <input
					type="hidden" name="initialAmount" value=<%=initialAmount%>>
				<input type="hidden" name="rollCount" value=<%=rollCount%>>

			</form>
		</td>
		</tr>
	</table>
	<div class="img">
		<img
			src="https://i.pinimg.com/236x/12/82/12/12821257857b916064fb4a8f14fc429a--good-luck-dice.jpg">
	</div>
</body>
<footer>
	<h6>Copyright 2019. All rights reserved.</h6>
</footer>
</html>