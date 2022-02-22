package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.admin;


import database.AdminData;


/**
 * Servlet implementation class AdminServelet
 */
@WebServlet("/AdServelet")
public class AdminServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private AdminData admindata;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
	 public void init() {
	    	admindata = new AdminData();
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	        String Name = request.getParameter("Name");
	        String email=request.getParameter("email");
	        String userid = request.getParameter("userid");
	        String password = request.getParameter("password");
	        String contact = request.getParameter("contact");

	       admin m = new admin();
	       m.setName(Name);
	       m.setEmail(email);
	        m.setUserid(userid);
	       m.setPassword(password);
	       m.setContact(contact);

	        try {
	            admindata.registerAdmin(m);
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	        response.sendRedirect("AdminDetails.jsp");
	    }
	}
