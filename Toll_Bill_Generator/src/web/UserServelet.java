package web;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user;
import database.USerData;
@WebServlet("/register")
public class UserServelet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private USerData userData;
    int i=0;
    public void init() {
    	userData = new USerData();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    	PrintWriter out = response.getWriter();
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email=request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");

       user k = new user();
       k.setFirstName(firstName);
       k.setLastName(lastName);
       k.setEmail(email);
        k.setUsername(username);
       k.setPassword(password);
        k.setContact(contact);
       k.setAddress(address);

        try {
            i=userData.registerUser(k);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(i==0)
        {
        	out.println("<script type=\"text/javascript\">");
            out.println("alert('Registration Unsuccessful/Email already exists');");
            out.println("location='UserRegistration.jsp';");
            out.println("</script>");
        }
        else
        {
            response.sendRedirect("UserDetails.jsp");
        }
    }
}