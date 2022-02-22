package web;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Travel;

import database.UserPlan;

/**
 * Servlet implementation class TravelServlet
 */
@WebServlet("/TravelServlet")
public class TravelServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private UserPlan userplan;

    public void init() {
    	userplan = new UserPlan();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String from = request.getParameter("from");
        String to = request.getParameter("to");
        String startDateStr = request. getParameter("StartDate");
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date startDate = null;
		try {
			startDate = sdf. parse(startDateStr);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		java.sql.Date sqlDate = new java.sql.Date(startDate.getTime());

       Travel t = new Travel();
       t.setStartDate(sqlDate);
       t.setFrom(from);
       t.setTo(to);
        try {
            userplan.registerPlan(t);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("Bill.jsp");
    }
}