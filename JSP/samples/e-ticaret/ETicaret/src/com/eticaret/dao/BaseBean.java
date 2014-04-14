package com.eticaret.dao;

import java.sql.SQLException;

public abstract class BaseBean {

	protected String menuHtml = "";
	protected int id;
	protected String name;
	
	public abstract String getMenuHtml () throws SQLException, ClassNotFoundException;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public BaseBean() {
		
	}
	
	public BaseBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
}
