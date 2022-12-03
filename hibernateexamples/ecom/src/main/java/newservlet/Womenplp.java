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
@WebServlet("/Womenplp")
public class Womenplp extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  
			{
        PrintWriter out = res.getWriter(); 

	try {
  
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/addcart", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from women1 where id=1");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			int id = rs.getInt(1);
			String img = rs.getString(2);
			String name = rs.getString(3);
			int cost = rs.getInt(5);
   			out.println("<div><a href='Pdpwomen?id=1'><img style=width:200px; src=" + img + "></a><br></div>");
		
			out.println("<div><h2>" + name + "</h2>");
			out.println("<div><b><h2>price:" + cost + " " + "Rs/-" + "<h2></b></div></div>");
			 
		}
	} catch (Exception e) {
 		out.print("not inserted");
	
	}
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/addcart", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from women1 where id=2");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			int id = rs.getInt(1);
			String img = rs.getString(2);
			String name = rs.getString(3);
			int cost = rs.getInt(5);
	         

			out.println("<div><div><a href='/Pdpwomen?id="+2+"'><img style=width:200px; src=" + img + "></a><br></div>");
 			out.println("<div><h2>" + name + "</h2>");
			out.println("<div><b><h2>price:" + cost + " " + "Rs/-" + "<h2></b></div></div>");
			 
		}
	} catch (Exception e) {
 
	
		out.print("not inserted");
	}
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/addcart", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from women1 where id=3");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			int id = rs.getInt(1);
			String img = rs.getString(2);
			String name = rs.getString(3);
			int cost = rs.getInt(5);
 
			out.println("<div><div class='img1'><div><a href='Pdpwomen"
					+ ""
					+ "?id="+3+"'><img style=width:200px; src=" + img + "></a><br></div>");
			out.println("<h2>" + name + "</h2>");
			out.println("<div><b><h2>price:" + cost + " " + "Rs/-" + "<h2></b></div><div>");
			 
		}
	} catch (Exception e) {
 
	
		out.print(e);
	}
	  
	
}

	}
 

