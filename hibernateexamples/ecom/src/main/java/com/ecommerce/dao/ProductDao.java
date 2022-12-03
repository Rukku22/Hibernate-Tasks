package com.ecommerce.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ecommerce.ProductDetails;

public class ProductDao {

	public static Connection createConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/ecommerce";
		String username = "root";
		String password = "root";
		con = DriverManager.getConnection(url,username,password);
		return con;
	}
	public int saveProduct(ProductDetails prods) {
		int i = 0;
		try {
			Connection con = createConnection();
			String query = "insert into Products values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, prods.getProductName());
			ps.setString(2, prods.getProductImageUrl());
			ps.setString(3, prods.getProductDescript());
			ps.setString(4, prods.getProductPrice());
			ps.setString(5, prods.getProductCat());
			i = ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return i;
		
		
	}
	public List<ProductDetails> getProducts(String cat){
		List<ProductDetails> list = new ArrayList<ProductDetails>();
			
		try {
			Connection con = createConnection();
			String query = "select * from Products where cat = ?;";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, cat);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				ProductDetails pd = new ProductDetails();
				pd.setProductName(rs.getString(1));
				pd.setProductImageUrl(rs.getString(2));
				pd.setProductDescript(rs.getString(3));
				pd.setProductPrice(rs.getString(4));
				pd.setProductCat(rs.getString(5));
				list.add(pd);
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return list;
		
	}
	public static List<ProductDetails> getProductsByName(String name){
		List<ProductDetails> list = new ArrayList<ProductDetails>();
			
		try {
			Connection con = createConnection();
			String query = "select * from Products where cat = ?;";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				ProductDetails pd = new ProductDetails();
				pd.setProductName(rs.getString(1));
				pd.setProductImageUrl(rs.getString(2));
				pd.setProductDescript(rs.getString(3));
				pd.setProductPrice(rs.getString(4));
				pd.setProductCat(rs.getString(5));
				list.add(pd);
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return list;
		
	}
}


