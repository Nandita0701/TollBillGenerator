package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manager;


import database.ManagerData;


/**
 * Servlet implementation class AdminServelet
 */
@WebServlet("/ManagerServelet")
public class ManagerServelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private ManagerData managerdata;
	 int i=0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
	 public void init() {
	    	managerdata = new ManagerData();
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	    	PrintWriter out = response.getWriter();
	        String Name = request.getParameter("Name");
	        String email=request.getParameter("email");
	        String userid = request.getParameter("userid");
	        String password = request.getParameter("password");
	        String contact = request.getParameter("contact");

	       manager m = new manager();
	       m.setName(Name);
	       m.setEmail(email);
	        m.setUserid(userid);
	       m.setPassword(password);
	       m.setContact(contact);

	        try {
	            i=managerdata.registerManager(m);
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        if(i==0)
	        {
	        	out.println("<script type=\"text/javascript\">");
	            out.println("alert('Registration Unsuccessful/Email already exists');");
	            out.println("location='ManagerRegistration.jsp';");
	            out.println("</script>");
	        }
	        else
	        {
	            response.sendRedirect("ManagerDetails.jsp");
	        }

	    }
	}
