<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import= "model.Customer"%>
<%@ page import= "model.Cart"%>    
    

<% 
	String userName= (String)session.getAttribute("userName");	
	String cartInfo = (String)session.getAttribute("cartInfo");	

%>

<html>
<head>
<meta charset="UTF-8">
<title>Cart</title>
<link href="./style/style.css" type="text/css" rel="stylesheet">
</head>
<body>
<h1><center>AMC Theaters</center></h1>
<header>
<nav>
<ul>
<li><a href="MovieServlet">Movies</a></li>
<li><a href="ReadCartServlet" id="cartLogo"><img src="images/cart2.png" alt="" id="cartLogo"/></a></li>
</ul>
</nav>
</header>


<br>
<h3>Items In Your Cart</h3>



<p><center><%=cartInfo %></center></p>

<form>
<input type="submit" name="getTicket" value="Purchase Tickets"/>
</form>

</body>
</html>