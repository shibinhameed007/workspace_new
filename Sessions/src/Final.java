import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Color
 */
@WebServlet("/Color")
public class Final extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String c= request.getParameter("sport");
	//	String d= request.getParameter("color");
	//	Cookie ck= new Cookie("username",c) ;
		
		response.setContentType("text/html");
		HttpSession session= request.getSession();
		PrintWriter out= response.getWriter();
		String user = (String)session.getAttribute("colorselect");
		out.println(c + user);
	//	response.addCookie(ck);
		//response.sendRedirect("Final");
		
	}

}
