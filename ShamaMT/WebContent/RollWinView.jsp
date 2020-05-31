<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page  import="java.text.NumberFormat"%> 
    <%@ page import= "java.util.Locale"%>
    <%@page import = "Model.Calculation" %>
    <% Calculation calc = (Calculation)request.getAttribute("calc"); %>
     <% NumberFormat ft = NumberFormat.getCurrencyInstance(new Locale("en", "US")); %>
      <% Double initialAmount = (Double)request.getAttribute("initialAmount"); %>
      <% Integer rollCount = (Integer)request.getAttribute("rollCount"); %>
    <% String diceImages = (String)request.getAttribute("diceImages"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Roll View </title>
<link rel="stylesheet" href="Style.css">
</head>
<body>
<h1> MIST4630 High-Low Game- Result Page</h1>
<br>
<p>Current balance: <strong> <%=ft.format(calc.getTotalAmount()) %>
		</strong>
	</p>
<p>Current bet:  <%=ft.format(calc.getAmountBet()) %> </p>
<p>Current bet type: <%=calc.getBetType()%></p>
<p> Your roll: </p>
<p> <%= diceImages %></p>
<p> Congratulations! You won <%= ft.format(calc.getTotalBetAmount())%>.</p>
<form action ="BetServlet" method="post">
<input type="submit" name="subBtn"  value="Place another bet">
<input type ="hidden" name="initialAmount" value= <%=initialAmount%>>
<input type ="hidden" name="rollCount" value= <%=rollCount%>>
</form>
<form action ="ResultServlet" method="post">
<input type="submit" name="subBtn"  value="Quit">
<input type ="hidden" name="initialAmount" value= <%=initialAmount%>>
<input type ="hidden" name="rollCount" value= <%=rollCount%>>
</form>
</body>
<footer>
<h6>Copyright 2019. All rights reserved.</h6>
</footer>
</html>