<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
/* {
  box-sizing: border-box;
}*/

/* Create two equal columns that floats next to each other */
.column {
  float: left;
  width: 50%;
  padding: 10px;
  height: 100%; /* Should be removed. Only for demonstration */
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}
</style>
</head>
<body>

<h1>Welcome to AMC Movie Theater</h1>
<h3>Create An Account or Log In</h3>

<div class="row">
  
<script>
function Account() {
  location.replace("CreateAnAccount.jsp")
}
function LogIn() {
	  location.replace("LogIn.jsp")
	}
</script>

  </div>
  <div class="column" style="background-color:#bbb;">
    <!-- <h2>Create an Account</h2>-->
    <text onclick="Account()"> <h2>Create an Account</h2></text>
  </div>
  <div class="column" style="background-color:#ccc;">
  <!--  <h2>Log In </h2>-->
    <text onclick="LogIn()"><h2>Log In </h2></text>
  </div>
</div>

</body>
</html>

