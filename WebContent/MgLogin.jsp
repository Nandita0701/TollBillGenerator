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
        <h1>Manager Login</h1>
        <form action="Validate3.jsp" method="post">
            <label for="userid">UserID:</label>
            <input name="userid" size="30" required></input>
            <br><br>
            <label for="password">Password:</label>
            <input type="password" name="password" size="30" required/>
            <br>
            <br><br>           
            <button type="submit">Login</button>
        </form>
    </div>
</body>
</html>