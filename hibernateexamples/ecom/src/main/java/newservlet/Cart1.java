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
@WebServlet("/Cart1")
public class Cart1 extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  
			{
		PrintWriter out=res.getWriter();
try{
				
		        HttpSession session=req.getSession(false);  

				String na =(String)session.getAttribute("name");
		   		int j = Integer.parseInt(req.getParameter("id"));
		 		Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/image", "root", "root");
				PreparedStatement ps = con.prepareStatement("select * from kids where id=?");
				ps.setInt(1, j);
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
				int id = rs.getInt(1);
				String img = rs.getString(2);
				String name = rs.getString(3);
				String size = rs.getString(4);
				int cost = rs.getInt(5);
				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecom", "root", "root");
				PreparedStatement ps1 = con1.prepareStatement("insert into "+na+" values(?,?,?,?)");
				ps1.setInt(1, id);

				ps1.setString(2, name);

				ps1.setString(3, img);
				ps1.setInt(4,cost);

				ps1.executeUpdate();

			        out.println("Successfully added");
		 			out.println("<button> <a href='Homepage.jsp'>AddToCart</a><br></button>");
 }
			}
			 catch (Exception e) {
 				  out.println(e);
			}
			}

}
