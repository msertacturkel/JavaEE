package com.eticaret.dao;

import java.sql.SQLException;
import java.util.List;

public class CategoryBean extends BaseBean {

	public CategoryBean() {

	}

	public CategoryBean(int categoryId, String categoryName) {
		super(categoryId,categoryName);
		
	}
	
	@Override
	public String getMenuHtml() throws SQLException, ClassNotFoundException {
		List<CategoryBean> list = EticaretDao.getCategories();

		for (CategoryBean cat : list)
			menuHtml += "<li><a href=\"#\" onclick=\"doPostBack("
					+ cat.id + ");\">" + cat.name + "</a></li>";

		return menuHtml;
	}
}
