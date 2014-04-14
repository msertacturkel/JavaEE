package com.eticaret.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EticaretDao {

	private static ResultSet getResultSet(String cmdStr) throws SQLException,
			ClassNotFoundException {

		Class.forName("org.sqlite.JDBC");
		Connection c = DriverManager
				.getConnection("jdbc:sqlite:c:\\ETicaret.sqlite");

		Statement stmt = c.createStatement();

		return stmt.executeQuery(cmdStr);
	}

	public static List<CategoryBean> getCategories() throws SQLException,
			ClassNotFoundException {

		List<CategoryBean> catList = new ArrayList();

		ResultSet result = getResultSet("SELECT * FROM Category");

		while (result.next())
			catList.add(new CategoryBean(result.getInt("CategoryId"), result
					.getString("Name")));

		return catList;
	}

	public static List<ProductBean> getProducts(int catId) throws SQLException,
			ClassNotFoundException {

		List<ProductBean> productList = new ArrayList();

		String strSql = "SELECT * FROM Product where 1=1";

		if (catId > 0)
			strSql += " AND CategoryId=" + catId;

		ResultSet result = getResultSet(strSql);

		while (result.next())
			productList.add(new ProductBean(result.getInt("ProductId"), result
					.getInt("CategoryId"), result.getString("Name"), result
					.getString("Img"), result.getDouble("Fiyat")));

		return productList;
	}

	public static ProductBean getProduct(int prodId) throws SQLException,
			ClassNotFoundException {

		String strSql = "SELECT * FROM Product where ProductId=" + prodId;

		ResultSet result = getResultSet(strSql);
		ProductBean pb = null;

		if (result.next())
			pb = new ProductBean(result.getInt("ProductId"),
					result.getInt("CategoryId"), result.getString("Name"),
					result.getString("Img"), result.getDouble("Fiyat"));

		return pb;
	}
}
