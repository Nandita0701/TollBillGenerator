package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Travel;

/**
 * Servlet implementation class Bill
 */
@WebServlet("/Bill")
public class Bill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bill() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 PrintWriter pw=response.getWriter();
		 String a=request.getParameter("from");
		 String b=request.getParameter("to");
		 int bill=0;
		 int way=Integer.parseInt(request.getParameter("way"));
		 if((a.equals("Chittoor"))&&(b.equals("Guntur"))||(a.equals("Guntur")&&(b.equals("Chittoor"))))
		 {
			 bill=way*240;
		 }
		 else if((a.equals("Chittoor"))&&(b.equals("Hyderabad"))||(a.equals("Hyderabad")&&(b.equals("Chittoor"))))
		 {
			 bill=way*200;
		 }
		 else if((a.equals("Chittoor"))&&(b.equals("Kurnool"))||(a.equals("Kurnool")&&(b.equals("Chittoor"))))
		 {
			 bill=way*320;
		 }
		 else if((a.equals("Chittoor"))&&(b.equals("Kakinada"))||(a.equals("Kakinada")&&(b.equals("Chittoor"))))
		 {
			 bill=way*345;
		 }
		 else if((a.equals("Chittoor"))&&(b.equals("Khammam"))||(a.equals("Khammam")&&(b.equals("Chittoor"))))
		 {
			 bill=way*380;
		 }
		 else if((a.equals("Chittoor"))&&(b.equals("Nellore"))||(a.equals("Nellore")&&(b.equals("Chittoor"))))
		 {
			 bill=way*280;
		 }
		 else if((a.equals("Chittoor"))&&(b.equals("Tirupathi"))||(a.equals("Tirupathi")&&(b.equals("Chittoor"))))
		 {
			 bill=way*150;
		 }
		 else if((a.equals("Chittoor"))&&(b.equals("Vijayawada"))||(a.equals("Vijayawada")&&(b.equals("Chittoor"))))
		 {
			 bill=way*205;
		 }
		 else if((a.equals("Chittoor"))&&(b.equals("Warangal"))||(a.equals("Warangal")&&(b.equals("Chittoor"))))
		 {
			 bill=way*395;
		 }
		 else if((a.equals("Guntur"))&&(b.equals("Hyderabad"))||(a.equals("Hyderabad")&&(b.equals("Guntur"))))
		 {
			 bill=way*320;
		 }
		 else if((a.equals("Guntur"))&&(b.equals("Hyderabad"))||(a.equals("Hyderabad")&&(b.equals("Guntur"))))
		 {
			 bill=way*320;
		 }
		 else if((a.equals("Guntur"))&&(b.equals("Kurnool"))||(a.equals("Kurnool")&&(b.equals("Guntur"))))
		 {
			 bill=way*390;
		 }
		 else if((a.equals("Guntur"))&&(b.equals("Kakinada"))||(a.equals("Kakinada")&&(b.equals("Guntur"))))
		 {
			 bill=way*394;
		 }
		 else if((a.equals("Guntur"))&&(b.equals("Khammam"))||(a.equals("Khammam")&&(b.equals("Guntur"))))
		 {
			 bill=way*400;
		 }
		 else if((a.equals("Guntur"))&&(b.equals("Nellore"))||(a.equals("Nellore")&&(b.equals("Guntur"))))
		 {
			 bill=way*330;
		 }
		 else if((a.equals("Guntur"))&&(b.equals("Tirupathi"))||(a.equals("Tirupathi")&&(b.equals("Guntur"))))
		 {
			 bill=way*220;
		 }
		 else if((a.equals("Guntur"))&&(b.equals("Vijayawada"))||(a.equals("Vijayawada")&&(b.equals("Guntur"))))
		 {
			 bill=way*110;
		 }
		 else if((a.equals("Guntur"))&&(b.equals("Warangal"))||(a.equals("Warangal")&&(b.equals("Guntur"))))
		 {
			 bill=way*405;
		 }

		 
		// pw.print(bill);
		 request.setAttribute("total", bill);
		 request.getRequestDispatcher("Receipt.jsp").forward(request, response); 
		//response.sendRedirect("InvalidLogin.jsp");
	}

}
