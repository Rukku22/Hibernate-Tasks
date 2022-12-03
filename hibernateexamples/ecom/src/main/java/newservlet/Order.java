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
@WebServlet("/Order")
public class Order extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  
			{
        PrintWriter out=res.getWriter();
 
 	try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecom", "root", "root");
			PreparedStatement ps = con.prepareStatement("select * from orderlist2");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String img = rs.getString(3);
				int cost = rs.getInt(4);
             PrintWriter out1=res.getWriter();
             out1.println("<div></div>");
  				out1.println("<div><img style=width:200px; src=" + img + "><br></div>");
				out1.println("<div><h2>" + name + "</h2>");
				out1.println("<div><b><h2>price:" + cost + " " + "Rs/-" + "<h2></b></div></div>");
 
				}

		} catch (Exception e) {
            PrintWriter out1=res.getWriter();

			out1.println(e);
		}
			}
}
