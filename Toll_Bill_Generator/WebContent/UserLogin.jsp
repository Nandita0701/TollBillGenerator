<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script language="javascript" type="text/javascript">

function doSubmit()
{
window.open("CustomerLogin.jsp","_self");
}
function doSubmit1()
{
window.open("UserRegistration.jsp","_self");
}
</script>
<body>
<center><h1>Welcome to User Login/Register Form</h1>
<br>
<br>
<button onclick="doSubmit()">Login</button>
<button onclick="doSubmit1()">Register</button>
</center>
</body>
</html>