h<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Credit Payment Schedule</title>
</head>
<body>
<form action ="paymentSchedule.jsp" method="get">
 		<label> First Name: </label>
 		<input type="text" name="firstName" value=""> <br>
 		<label> Last Name: </label>
 		<input type="text" name="lastName" value=""> <br>
 		<label> Account Number: </label>
 		<input type="text" name="accountNum" value=""> <br>
 		<label> Current Balance: </label>
 		<input type="text" name="balanceDue" value=""> <br>
 		<label> Percent To Pay: </label>
 		<input type="text" name="percentToPay" value=""> <br>
 
 		<input type="submit" name="subBtn"  value="Go">
 	    
 	</form>
</body>
</html>