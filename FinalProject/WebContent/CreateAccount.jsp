<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="style.css" type="text/css" rel="stylesheet">
<title>AMC Theaters: Create An Account</title>
</head>

<body>
<header>
<h1><center>AMC Theaters</center></h1>
<nav>
<ul>
<li><a href="MovieServlet">Movies</a></li>
<li><a href="addAccountForm">Create an Account</a></li> 
<li><a href="LogInForm">Log In </a></li> 
<li><a href="cart.jsp" id="cartLogo"><img src="images/cart2.png" alt="" id="cartLogo"/></a></li>
</ul>
</nav>
</header>

<h2><center>Create An Account</center></h2>

<form name=addForm action=AddAccount method=post>
<label>First Name:</label>
<input type="text" name="firstName"  value="" placeholder="first name" required/>
<br><br>
<label>Last Name:</label>
<input type="text" name="lastName" value="" placeholder="last name" required/>
<br><br>
<label>UserName(Email Address):</label>
<input type ="text" name="emailAddress" placeholder="email address" required> 
<br><br>
<label>Phone:</label>
<input type="text" name="customerPhoneNo"  value="" placeholder="phone number"/>
<br><br>
<label>Password:</label>
<input type = "password" name="password" placeholder="password" required> 
<br><br>
<input type="submit" name="submit" value="Create Account"/>
<br>
${errorMessage}
<p>If you would like to sign up for offers, please check box </p>
<input type="checkbox" name="subscribe" value="Subscribe For Emails"/>

</form>


</body>
</html>