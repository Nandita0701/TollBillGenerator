<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="text-align: center">
<h1>Add New Toll</h1>  

<form action="SaveServlet" method="post">  

<table>  
<tr>
<td><h1>Source</h1></td>
<td><input type="text" name="source" size="30" required/></td>
</tr>  
<tr>
<td><h1>Destination</h1></td>
<td><input type="text" name="destination" size="30" required/></td>
</tr>  
<tr>
<td><h1>Price</h1></td>
<td><input type="number" name="price" size="30" required/></td>
</tr> 
 
<tr><td colspan="2"><input type="submit" value="Save"/></td></tr>  
</table>  
</form>  
  
<br/>  
<a href="ViewServlet"><h1>View Tolls</h1></a> 
</div>
</body>
</html>