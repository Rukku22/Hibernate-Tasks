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
@WebServlet("/Pdp")
public class Pdp extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  
			{ 

		try{
			int i = Integer.parseInt(req.getParameter("id"));
        	Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/image", "root", "root");
			PreparedStatement ps = con.prepareStatement("select * from kids where id=?");
			ps.setInt(1, i);
			ResultSet rs = ps.executeQuery();
			rs.next();
			int id = rs.getInt(1);
			String img = rs.getString(2);
			String name = rs.getString(3);
			int cost = rs.getInt(5);
	        PrintWriter out = res.getWriter(); 
            out.println("<div><img style=width:200px; src=" + img + "></a><br></div>");
	        out.println("<h2>" + name + "</h2>");
			out.println("<div><b><h2>price:" + cost + " " + "Rs/-" + "<h2></b></div>");
 			out.println("<button> <a href='Cart1?id="+i+"'>AddToCart</a><br></button>");
 
			out.println("<button><a href='Buynow?id="+i+"'><div>BuyNow</div></a></button> ");
 
		         

 
	 	   }catch (Exception e) {
		        PrintWriter out = res.getWriter(); 
			out.print("not inserted pdp " + e);
		}
			}
}