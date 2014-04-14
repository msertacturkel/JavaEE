package com.eticaret.dao;

import java.sql.SQLException;
import java.util.*;

public class SepetBean {

	private TreeSet<ProductBean> prodList = new TreeSet<ProductBean>();
	private String sptHtml;

	public SepetBean() {
		// TODO Auto-generated constructor stub
	}

	public SepetBean(int prodId) throws SQLException, ClassNotFoundException {
		this.prodList.add(EticaretDao.getProduct(prodId));
	}

	public String getSptHtml() {
		return sptHtml;
	}

	public void addProduct(int prodId) throws SQLException,
			ClassNotFoundException {
			this.prodList.add(EticaretDao.getProduct(prodId));
	}

}
