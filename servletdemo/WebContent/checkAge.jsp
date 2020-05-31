<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- -a JSP page command -->

<!-- -NOW SOME JAVA CODE -->
<% 
//we are in java mode now
 //input 
int age = Integer.parseInt(request.getParameter("age"));
		
		//TODO Process the data 
		String msg = " ";
		if (age<21) {
			msg = "Sorry,";
			msg+= age;
			msg+=" is too young to come in.";
		}
		else {
			msg="Come on in, the beer is cold!";
		}
%>
<!-- -OUTPUT -->
    
<!DOCTYPE html>
<html>
<head>
<meta carset-"UTF--8">
<title> JSP Age Demo</title>
</head>
<body>
<h1> Age = <%= age %></h1>
<p>
<%= msg %>
</p>
</body>
</html>