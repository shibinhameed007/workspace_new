
//@WebServlet("LoginServlet")
	//package ;
	import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	
	public class LoginServlet extends HttpServlet {

		protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
			String uname=request.getParameter("uname");
			String psw=request.getParameter("psw");
			
			if(uname.equals("admin") && psw.equals("admin"))
			{
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				//response.sendRedirect("success.html");
				out.println("success");
				out.flush();
				System.out.println("Login success");
				//return;
			}
			else
			{
				System.out.println("Login failed");
				//return;
			}
		}
	}

