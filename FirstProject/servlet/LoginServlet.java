

	//package ;
	import java.io.IOException;
	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	
	public class LoginServlet extends HttpServlet {
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
			String uname=request.getParameter("Username");
			String psw=request.getParameter("Password");
			
			if(uname.equals("admin") && psw.equals("admin"))
			{
				System.out.println("Login success");
				//return;
			}
			else
			{
				System.out.println("Login failed");
				return;
			}
		}
	}

