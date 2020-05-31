<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
    
<%@ page import="model.Product" %>
    
<% Product product = (Product) request.getAttribute("product"); %>    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Grocery - Update a Product</title>
 <link rel = "stylesheet"
   type = "text/css"
   href = "ProductStyle.css" />
</head>
<body>

<h1>Grocery Library - Update a Product</h1>

<form name=updateForm action=updateProduct method=get >

    <label>
      SKU:
   </label>
   <input type=text name=SKU value="<%= product.getSKU() %>" />
   <br />

   <label>
      Product Type:
   </label>
   <input type=text name=ProductType value="<%= product.getProductType() %>" />
   <br />
   <label>
      Flavor:
   </label>
   <input type=text name=Flavor value="<%= product.getFlavor() %>" />
   <br />
   
   <label>
      Cost:
   </label>
   <input type=text name=Cost value="<%= product.getCost() %>" />
   <br />
   
     <label>
      Price:
   </label>
   <input type=text name=Price value="<%= product.getPrice() %>" />
   <br />
   
       <label>
      Quantity:
   </label>
   <input type=text name=Quantity value="<%= product.getQuantity() %>" />
   <br />
   
   <input type=submit name=submit value="Update " />

</form>

</body>
</html>