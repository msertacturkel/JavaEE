package org.csystem.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

	private Connection con;

	public Product findByProductCode(String productCode) {
		Connection connect = getConnection();
		Product product = null;
		try {
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from product where productcode='"+productCode+"'");
            rs.next();
			product = new Product();
			product.setProductcode(rs.getString("productcode"));
			product.setBuyprice(rs.getDouble("buyprice"));
			product.setMsrp(rs.getDouble("msrp"));
			product.setProductname(rs.getString("productname"));
			product.setProductdescription(rs.getString("productdescription"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;

	}

	public List<Product> findAll() {
		Connection connect = getConnection();
		Product product = null;
		ArrayList<Product> productList = new ArrayList<Product>();
		try {
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from product");
			while (rs.next()) {
				product = new Product();
				product.setProductcode(rs.getString("productcode"));
				product.setBuyprice(rs.getDouble("buyprice"));
				product.setMsrp(rs.getDouble("msrp"));
				product.setProductname(rs.getString("productname"));
				product.setProductdescription(rs
						.getString("productdescription"));
				productList.add(product);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return productList;

	}

	public Connection getConnection() {
		if (con == null) {
			try {
				Class.forName("org.apache.derby.jdbc.ClientDriver");
				con = DriverManager.getConnection(
						"jdbc:derby://localhost:1527/myeclipse", "classiccars",
						"classiccars");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return con;
	}
}
