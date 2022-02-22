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
@WebServlet("/EditServlet2")  
public class Edit2Servlet extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
          throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        String source=request.getParameter("source");  
        String destination=request.getParameter("destination");  
		int price=Integer.parseInt(request.getParameter("price"));  
        
        
          
      Toll e=new Toll();  
        e.setId(id);  
        e.setSource(source);  
        e.setDestination(destination);  
        e.setPrice(price);  
        
          
        int status=TollDao.update(e);  
        if(status>0){  
            response.sendRedirect("ViewServlet");  
        }else{  
            out.println("Sorry! unable to update record");  
        }  
          
        out.close();  
    }  
  
}  