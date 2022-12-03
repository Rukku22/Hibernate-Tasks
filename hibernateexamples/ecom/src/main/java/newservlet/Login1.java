package newservlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/Login1")
 public class Login1 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  
			{  
			res.setContentType("text/html"); 
				 String s1=req.getParameter("name");
				String s2=req.getParameter("password");
				 
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				 
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecom", "root", "root");  
				PreparedStatement ps=con.prepareStatement("select * from new_table where FirstName=? and Password=?");
				ps.setString(1,s1);
				ps.setString(2,s2);
				ResultSet rs=ps.executeQuery();
                    if(rs.next()){
				        HttpSession session=req.getSession();
				        session.setAttribute("name",s1);
                         PrintWriter out = res.getWriter(); 
                        out.println("<script type=\"text/javascript\">");

 				        out.println("alert('login successfully');");
				        out.println("</script>");
				        res.sendRedirect("Homepage.jsp");
			      
					       
                        }
				  else {
				        PrintWriter out = res.getWriter(); 
                        out.println("<script type=\"text/javascript\">");
				        out.println("alert('please enter valid details');");
				        out.println("</script>");
				        RequestDispatcher rd=req.getRequestDispatcher("log.jsp");  
				        rd.include(req,res);
				      }
				} catch (Exception e) {
					PrintWriter out = res.getWriter();
			         out.println("already existed this user please continue ");
                        res.sendRedirect("log.jsp");
					 
  			}
				
                
 		
	}
}


