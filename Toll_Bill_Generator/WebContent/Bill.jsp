<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
 function pay()
 {
	 alert("Your payment was successfull");
 }
	
</script>
<body>
	  <div align="center">
	  	<h1>Bill Payment</h1>
	  		<form action="<%= request.getContextPath() %>/Bill" method="post">
		   		<table style="with: 80%">
		   			<tr>
               			<td>Enter your vehicle type</td>
               			<td><input type="text" name="vehicle" required></td>
               		</tr>
               		<tr>
               			<td><input type="radio" name="way" value="1">Up</td>
               			<td><input type="radio" name="way" value="2">Up&Down</td>
               		</tr>
               		<tr>
               			<td><h3>Please Confirm your Route here</h3></td>
               		</tr>
               		<tr><td>FROM</td>
               			<td><select name="from">
             			<option>Select</option>
             			<option>Chittoor</option>
             			<option>Guntur</option>
             			<option>Hyderabad</option>
             			<option>Kurnool</option>
             			<option>Kakinada</option>
             			<option>Khamman</option>
             			<option>Nellore</option>
             			<option>Tirupathi</option>
                		<option>Vijayawada</option>
                		<option>Warangal</option>
                		</select></td>
                	</tr>
               <tr>
             	<td>TO</td>
             	<td><select name="to">
             			<option>Select</option>
             			<option>Chittoor</option>
             			<option>Guntur</option>
             			<option>Hyderabad</option>
             			<option>Kurnool</option>
             			<option>Kakinada</option>
             			<option>Khamman</option>
             			<option>Nellore</option>
             			<option>Tirupathi</option>
                		<option>Vijayawada</option>
                		<option>Warangal</option>
                		</select></td>
               </tr>
                	
               	</table>
               	<input type="submit" name="submit" value="Pay Now" onclick="pay()">
              </form>
         </div>
</body>
</html>