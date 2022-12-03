package newservlet;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Register1")
public class Register1 extends HttpServlet{
 public void doGet(HttpServletRequest re,HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		try{
			    String str=re.getParameter("FirstName");
				String str1=re.getParameter("LastName");
				String str2=re.getParameter("Email");
				String str4=re.getParameter("Password");
				String str5=re.getParameter("mobile");
 				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecom", "root", "root");  
				 PreparedStatement ps=con.prepareStatement("insert into new_table(FirstName,LastName,Email,Password,mobile) values(?,?,?,?,?)");
				ps.setString(1, str); 
				ps.setString(2,str1);
				ps.setString(3, str2);
				ps.setString(4, str4);
				ps.setString( 5, str5);
				int i=ps.executeUpdate();
				if(i>0)
				{
				Class.forName("com.mysql.cj.jdbc.Driver");
				 Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecom", "root", "root");  
				 PreparedStatement ps1=con1.prepareStatement("create table "+str+"(id int,name varchar(50),img varchar(500),price int)");
				 ps1.executeUpdate();
			      PrintWriter out = res.getWriter(); 
                out.println("Registered successfully thank you......."+str);
                res.sendRedirect("Homepage.jsp");
 				}
				
				else {
			        PrintWriter out = res.getWriter(); 
                    out.println("<script type=\"text/javascript\">");
			        out.println("alert('please enter valid details');");
			        out.println("</script>");
			        RequestDispatcher rd=re.getRequestDispatcher("Login.jsp");  
			        rd.include(re,res);
				}
		 } catch (Exception e) {
	        PrintWriter out = res.getWriter();
	        
	         out.println("already existed this user please continue by using login");
	         RequestDispatcher req1=re.getRequestDispatcher("Login.jsp");
			   ((RequestDispatcher) re).forward(re, res);
			
          }
}
}