<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Double initialAmount = 1000.00;
%>
<%
	int rollCount = 0;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MIST 4630 High-Low Game</title>
<link rel="stylesheet" href="Style.css">
</head>
<body>
	<h1>MIST4630 High-Low Game</h1>
	<br>
	<p>Place a bet and try your luck!</p>
	<div class="img">
		<img src="images/Dice-1.png"> &nbsp, &nbsp <img
			src="images/Dice-4.png">
	</div>
	<p>You start with a stake of $1,000.00</p>
	<form action="BetServlet" method="post">

		<input type="submit" name="subBtn" value="Play"> <input
			type="hidden" name="initialAmount" value=<%=initialAmount%>>
		<input type="hidden" name="rollCount" value=<%=rollCount%>>
	</form>
</body>
<footer>
	<h6>Copyright 2019. All rights reserved.</h6>
</footer>
</html>