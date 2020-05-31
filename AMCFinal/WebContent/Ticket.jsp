<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%
	String userName= (String)session.getAttribute("userName");

 %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="./style/style.css" type="text/css" rel="stylesheet">
<title>Purchase Tickets</title>

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
<h2>Get Your Tickets</h2>

<form name="purchaseForm" action="CreateCartServlet" method="post">

<h3>Select A Movie:</h3>
<select name="movies">
<option value="A Beautiful Day in The Neighborhood">A Beautiful Day in The Neighborhood</option>
<option value="Charlie's Angels">Charlie's Angels</option>
<option value="Doctor Sleep">Doctor Sleep</option>
<option value="Ford v Ferrari">Ford v Ferrari</option>
<option value="Frozen II">Frozen II</option>
<option value="Joker">Joker</option>
<option value="Last Christmas">Last Christmas</option>
<option value="Midway">Midway</option>
<option value="Playing With Fire">Playing with Fire</option>
<option value="The Good Liar">The Good Liar</option>
</select>
<br>

<h3>Select A Date:</h3>
<input type="date" name="date"  value="">

<br>
<h3>Time:</h3>
<label>5:15p.m</label>
<input type="radio" name="times" value="5:15"/>

<label>7:00p.m</label>
<input type="radio" name="times" value="7:00"/>

<label>8:30p.m</label>
<input type="radio" name="times" value="8:30"/>

<label>9:15p.m</label>
<input type="radio" name="times" value="9:15"/>
<br>
<label>10:55p.m</label>
<input type="radio" name="times" value="10:55"/>

<label>11:00p.m</label>
<input type="radio" name="times" value="11:00"/>
<br>

<h3>Select a Ticket Type:</h3>

<label>Adult- Ages: 18+ </label><br>
<label>$7.99 </label><br>
<input type="number" name="adult" min="0" max="15" value="0">
<br>
<label>Child- Ages: 2-17 </label><br>
<label>$5.99 </label><br>
<input type="number" name="child" min="0" max="15" value="0">
<br><br>
<input type="submit" name="submit" value="Continue"/>

</form>

</body>
</html>