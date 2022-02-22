<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
  <h1>User Register Form</h1>
  <form action="<%= request.getContextPath() %>/register" method="post">
   <table style="with: 80%">
    <tr>
     <td>First Name</td>
     <td><input type="text" name="firstName" required /></td>
    </tr>
    <tr>
     <td>Last Name</td>
     <td><input type="text" name="lastName" required/></td>
    </tr>
    <tr>
    <tr>
     <td>Email</td>
     <td><input type="text" name="email" required/></td>
    </tr>
    <tr>
     <td>UserName</td>
     <td><input type="text" name="username" required/></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="password"  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" required /></td>
    </tr>
    <tr>
     <td>Address</td>
     <td><input type="text" name="address" /></td>
    </tr>
    <tr>
     <td>Contact No</td>
     <td><input type="text" name="contact" pattern="[7-9]{1}[0-9]{9}"  required/></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>