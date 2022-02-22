<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function TDate() {
	var UserDate = document.getElementById("userdate").value;
    var ToDate = new Date();
	var parts=UserDate.split("/");
	var dateObject = new Date(+parts[2], parts[1] - 1, +parts[0]); 
    if (dateObject.getTime() <= ToDate.getTime()) {
          alert("The Date must be Bigger than today's date");
          response.sendRedirect("TravelDetails.jsp");
          return false;
     }
    
    return true;
}
</script>
<body>
   <div align="center">
	  <form action="<%= request.getContextPath() %>/Bill.jsp" method="post">
		   <table style="with: 80%">
		   	<tr>
		   		<td>Travel Date</td>
                <td><input type="date" name="StartDate" id="userdate" placeholder="dd/mm/yyyy" required></td>
             </tr>
             <tr>
             	<td>From</td>
             	<td><select name="from">
             			<option>Select</option>
             			<option>Chittoor</option>
             			<option>Guntur</option>
             			<option>Hyderabad</option>
             			<option>Kurnool</option>
             			<option>Kakinada</option>
             			<option>Khammam</option>
             			<option>Nellore</option>
             			<option>Tirupathi</option>
                		<option>Vijayawada</option>
                		<option>Warangal</option>
                		</select></td>
               </tr>
               <tr>
             	<td>To</td>
             	<td><select name="to">
             			<option>Select</option>
             			<option>Chittoor</option>
             			<option>Guntur</option>
             			<option>Hyderabad</option>
             			<option>Kurnool</option>
             			<option>Kakinada</option>
             			<option>Khammam</option>
             			<option>Nellore</option>
             			<option>Tirupathi</option>
                		<option>Vijayawada</option>
                		<option>Warangal</option>
                		</select></td>
               </tr>
            </table>
            <input type="submit" value="Submit" onclick="TDate()"/>
       </form>	
   </div>	   						
</body>
</html>