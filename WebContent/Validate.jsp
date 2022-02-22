<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
    try{
        String username = request.getParameter("username");   
        String password = request.getParameter("password");
        Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","monisa");    
        PreparedStatement pst = conn.prepareStatement("Select username,password from employees where username=? and password=?");
        pst.setString(1, username);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();                        
        if(rs.next()) 
        {
           out.println("Valid login credentials");  
        response.sendRedirect("TravelDetails.jsp");
        }
        else
        {
        
           out.println("Invalid login credentials");
        response.sendRedirect("InvalidLogin.jsp");
        }
        
   }
   catch(Exception e){       
       out.println("Something went wrong !! Please try again");       
   }      
%>
 
</body>
</html>