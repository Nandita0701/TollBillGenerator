<%@page import="java.sql.*" %>
<html>

   
    <body>
       
      <h2 align="center">Approval List</h2>
     
       
        <br>
         <h3 align="center" style="color:red"><u>View Managers</u></h3><br>
         <table align="center" bgcolor="violet" border="1" width="700">
             <tr align="center">
                 <td>Name</td>
                 <td>email</td>
					<td>userid</td>
					<td>password</td>
                 <td>Contact</td>
                 
             </tr>    
<%

 Connection con = null;
   Class.forName("com.mysql.jdbc.Driver");
   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","monisa");   
   ResultSet rs = con.createStatement().executeQuery(" select * from manager");
   
   while(rs.next())
   {
       %>
       <tr align="center">
           <td><%=rs.getString(1)%></td>
           <td><%=rs.getString(2)%></td>
  			<td><%=rs.getString(3)%></td>
           <td><%=rs.getString(4)%></td>
           <td><%=rs.getString(5)%></td>
           
           <td>
               
               <a href="Validate2.jsp?userid=<%=rs.getInt(3)%>">Approve</a>
               
               
           </td>
           <td>  <a href="Vaildate4.jsp?userid=<%=rs.getInt(3)%>">Reject</a></td>
           
       </tr>
       
       <%
   }
   
   
   
%>    
             
             
             
         </table>        
       
    </body>
   
</html>
