package web;
import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import com.Toll;  
import database.TollDao;
@SuppressWarnings("serial")
@WebServlet("/SaveServlet")  
public class SaveServlet extends HttpServlet {  
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
         throws ServletException, IOException {  
        response.setContentType("text/jsp");  
        PrintWriter out=response.getWriter();  
          
        String source=request.getParameter("source");  
        String destination=request.getParameter("destination");  
        int price=Integer.parseInt(request.getParameter("price"));  
       
          
        Toll e=new Toll();  
        e.setSource(source);  
        e.setDestination(destination);  
        e.setPrice(price);  
         
          
        int status=TollDao.save(e);  
        if(status>0){  
            out.print("<p>Record saved successfully!</p>");  
            request.getRequestDispatcher("Home.jsp").include(request, response);  
        }else{  
            out.println("Sorry! unable to save record");  
        }  
          
        out.close();  
    }  
  
} 