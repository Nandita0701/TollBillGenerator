<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
  <h1>Admin Register Form</h1>
  <form action="<%= request.getContextPath() %>/AdServelet" method="post">
   <table style="with: 80%">
    <tr>
     <td>Name</td>
     <td><input type="text" name="Name" required /></td>
    </tr>
    <tr>
     <td>Email</td>
     <td><input type="text" name="email" required/></td>
    </tr>
    <tr>
     <td>UserId</td>
     <td><input type="text" name="userid" pattern="[0-9]{4}" placeholder="4 digits" required/></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="password"  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" required /></td>
    </tr>
     <td>Contact No</td>
     <td><input type="text" name="contact" pattern="[7-9]{1}[0-9]{9}"  required/></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>