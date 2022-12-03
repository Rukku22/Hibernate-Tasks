package newservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/Logout")
public class Logout extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  
			{
		
        HttpSession session=req.getSession();  

		session.invalidate();  
       PrintWriter out=res.getWriter(); 
       out.println("<h1>Successfully logout........</h1>");  
       out.println("<button style='background-color:orange'><a href=\"Login.jsp\">Sign in</a></button>") ;
			}
}
