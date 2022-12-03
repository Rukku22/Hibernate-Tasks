package newservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Checkout")
public class Checkout extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  
			{  
		try{
	        HttpSession session=req.getSession();  
          String na =(String)session.getAttribute("name");
		 Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecom", "root", "root");
		PreparedStatement ps=con.prepareStatement("select * from "+na);
		 ResultSet rs=ps.executeQuery();
		 while(rs.next()){
			int id=rs.getInt(1);
 			String name=rs.getString(2);
 			PreparedStatement ps1 = con.prepareStatement("insert into orderlist2 values(?,?,?,?)");
			ps1.setInt(1, id);
			ps1.setString(2, name);
			ps1.setString(3, rs.getString(3));
			ps1.setInt(4, rs.getInt(4));
			ps1.executeUpdate();
			PreparedStatement ps2=con.prepareStatement("delete from "+na +" where id=?");
			ps2.setInt(1, id);
			ps2.executeUpdate();
		 }

		}catch(Exception e){
	        PrintWriter out = res.getWriter(); 

		    out.println(e);
		    
		}
			}}

