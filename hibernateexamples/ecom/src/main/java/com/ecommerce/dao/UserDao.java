package com.ecommerce.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ecommerce.User;

public class UserDao {

	public Connection createConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/ecommerce";
		String username = "root";
		String password = "root";
		con = DriverManager.getConnection(url,username,password);
		return con;
		
	}
	public int createUser(User user) throws ClassNotFoundException, SQLException {
		int i = 0;
		Connection con = createConnection();
		String qry = "insert into userDetails(name,email,password) value(?,?,?)";
		PreparedStatement ps = con.prepareStatement(qry);
		ps.setString(1,user.getName());
		ps.setString(2, user.getEmail());
		ps.setString(3, user.getPassword());
		
		i=ps.executeUpdate();
		return i;
		
	}
	public boolean checkUser(User user) {
		try {
			Connection con = createConnection();
			String qry = "select * from userDetails";
			PreparedStatement ps = con.prepareStatement(qry);
			ResultSet rs = ps.executeQuery();
			String email = user.getEmail();
			String password = user.getPassword();
			while(rs.next()) {
				String databaseEmail = rs.getString(3);
				String databasePassword = rs.getString(4);
				if((email.equals(databaseEmail)) && (password.equals(databasePassword))) {
					return true;
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return false;
		
	}
}

