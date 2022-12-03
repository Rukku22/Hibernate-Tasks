package newservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/Showcart")
public class Showcart extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  
			{
		PrintWriter out=res.getWriter();
		 try {
		        HttpSession session=req.getSession();  

				String na =(String)session.getAttribute("name");
				

			  Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecom", "root", "root");  
				PreparedStatement ps = con.prepareStatement("select * from "+na);
				 	ResultSet rs = ps.executeQuery();
				 	
				 	if(rs.next()){
				 		int id=rs.getInt(1);
				 		String name=rs.getString(2);
				 		String img=rs.getString(3);
				 		int cost=rs.getInt(4);
 
				 		out.println("<div><img style=width:200px; src="+img+"><br></div>"); 
				 		out.println("<div><h2>" + name + "</h2>");
						out.println("<div><b><h2>price:" + cost + " " + "Rs/-" + "<h2></b></div></div>");
				 	}
				 	 	  else {
				 		out.println("cart is empty");
				 		out.println("<a href='Homepage.jsp'>Select products in homepage</a>");
				 		
				 	}
 				 	
		  }catch(Exception e){
 
			  out.println(e);
		  }
			}}

