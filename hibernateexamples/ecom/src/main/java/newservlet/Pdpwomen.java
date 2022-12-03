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
@WebServlet("/Pdpwomen")
public class Pdpwomen extends HttpServlet {
		public void doGet(HttpServletRequest req,HttpServletResponse res)  
				throws ServletException,IOException  
				{
	        PrintWriter out = res.getWriter(); 

		try {
			int i = Integer.parseInt(req.getParameter("id"));
        	Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/addcart", "root", "root");
			PreparedStatement ps = con.prepareStatement("select * from women1 where id=?");
			ps.setInt(1, i);
			ResultSet rs = ps.executeQuery();
			rs.next();
			int id = rs.getInt(1);
			String img = rs.getString(2);
			String name = rs.getString(3);
			int cost = rs.getInt(5);
             out.println("<div><img style=width:200px; src=" + img + "></a><br></div>");
	        out.println("<h2>" + name + "</h2>");
			out.println("<div><b><h2>price:" + cost + " " + "Rs/-" + "<h2></b></div>");
 
		         
 	  		out.println("<a  href='/Cart1'>AddToCart</a>");

  	  		out.println("<div style=margin-top:-58px;><button style=background-color:yellow;margin-left:123px;><a style=text-decoration:none; href='/orderlink.jsp?id="+i+"'><h2 margin-top:50px;>Buy Now  </button></div>");
		       
		}catch(Exception e) {
		    out.println(e);
		}



		}

		
}
