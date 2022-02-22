package web;
import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import com.Toll;

import database.TollDao;  
@SuppressWarnings("serial")
@WebServlet("/ViewServlet")  
public class ViewServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<a href='Home.html'><h1>Add New Toll</h1></a>");  
        out.println("<h1>Toll List</h1>");  
          
        List<Toll> list=TollDao.getAllTolls();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>Id</th><th>Source</th><th>Destination</th><th>Price</th><th>Edit</th></tr>");  
        for(Toll e:list){  
         out.print("<tr><td>"+e.getId()+"</td><td>"+e.getSource()+"</td><td>"+e.getDestination()+"</td><td>"+e.getPrice()+"</td><td><a href='EditServlet?id="+e.getId()+"'>edit</a></td></tr>");  
        }  
        out.print("</table>");  
          
        out.close();  
    }  
}  
