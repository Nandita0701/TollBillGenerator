<%@page import="java.sql.*" %>

<%

String userid = request.getParameter("userid");
String status="approved";



try
{
  
   Class.forName("com.mysql.jdbc.Driver");
   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","monisa"); 
   
   
 
   int i = con.createStatement().executeUpdate(" Update manager set verified='"+status+"' where userid = '"+userid+"' ");
   
   if(i>0)
   {
       response.sendRedirect("IndexWelcome.jsp");
   }
   else
   {
       out.println("Approve Failed");
   }
   
   


}
catch(Exception e)
{
    out.println(e);
}


%>
