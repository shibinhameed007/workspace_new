

import java.io.IOException;
import java.io.PrintWriter;

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
public class Color extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String c= request.getParameter("color");
		//Cookie ck= new Cookie("username",c) ;
		HttpSession session= request.getSession();
		//response.setContentType("text/html");
		//PrintWriter out= response.getWriter();
		session.setAttribute("colorselect", c);
		
		//out.println(c);
		//response.addCookie(ck);
		response.sendRedirect("SecondPage.html");
		
	}

}
