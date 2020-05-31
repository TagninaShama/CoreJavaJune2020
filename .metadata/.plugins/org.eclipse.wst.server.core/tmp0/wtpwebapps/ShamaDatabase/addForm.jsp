<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Grocery Library - Add a Product</title>
 <link rel = "stylesheet"
   type = "text/css"
   href = "ProductStyle.css" />
</head>
<body>

<h1>Grocery Library - Add a Product</h1>

<form name=addForm action=addProduct method=get >
  <label>
      SKU:
   </label>
   <input type=text name=SKU value="" />
   <br />
   
   <label>
      Product Type:
   </label>
   <input type=text name=ProductType value="" />
   <br />
   <label>
      Flavor:
   </label>
   <input type=text name=Flavor value="" />
   <br />
   
   <label>
      Cost:
   </label>
   <input type=text name=Cost value="" />
   <br />
   
    <label>
      Price:
   </label>
   <input type=text name=Price value="" />
   <br />
   
    <label>
      Quantity:
   </label>
   <input type=text name=Quantity value="" />
   <br />
   
   
   <input type=submit name=submit value="Add the Product" />

</form>
</body>
</html>