package com.ecommerce.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ecommerce.ProductDetails;

public class CartDao {
	
	public Connection createConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/ecommerce";
		String username = "root";
		String password = "root";
		con = DriverManager.getConnection(url,username,password);
		return con;
		
	}
	public int saveCart(String name) {
		int i = 0;
		try {
			Connection con = createConnection();
			String query = "insert into Cart values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			List<ProductDetails> list = ProductDao.getProductsByName(name);
			ps.setString(1, name);
			for(ProductDetails pro : list) {
				ps.setString(2,pro.getProductImageUrl());
				ps.setString(3, pro.getProductDescript());
				ps.setString(4, pro.getProductPrice());
				ps.setString(5, pro.getProductCat());
				i = ps.executeUpdate();
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return i;
		
	}
	public List<ProductDetails> getProductsFromCart(){
		List<ProductDetails> list = new ArrayList<ProductDetails>();
		
			Connection con;
			try {
				con = createConnection();
				String query = "select * from cart";
				PreparedStatement ps = con.prepareStatement(query);
				ResultSet rs = ps.executeQuery(query);
				while(rs.next()) { 
				ProductDetails pro = new ProductDetails();
	            pro.setProductName(rs.getString(1));
	            pro.setProductImageUrl(rs.getString(2));
	            pro.setProductDescript(rs.getString(3));
	            pro.setProductPrice(rs.getString(4));
	            pro.setProductCat(rs.getString(5));  
	            list.add(pro); 
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		return list;
		}
}
		


