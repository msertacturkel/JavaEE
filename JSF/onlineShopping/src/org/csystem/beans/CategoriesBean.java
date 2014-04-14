package org.csystem.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;
import javax.faces.model.SelectItem;

import org.csystem.hiber.Categories;
import org.csystem.hiber.CategoriesDAO;
import org.csystem.hiber.HibernateSessionFactory;
import org.csystem.hiber.Ustcategory;
import org.csystem.hiber.UstcategoryDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CategoriesBean {
	private String categoryName;
	private String description;
	private Integer categoriID;
	private List<SelectItem> categoriItems = new ArrayList<SelectItem>();
	private CategoriesDAO cDAO;

	public CategoriesBean() {
		cDAO = new CategoriesDAO();
	
		List<Categories> categories =cDAO.findAll();
		for (Categories categori : categories) {
			SelectItem select = new SelectItem(categori.getCategoryId(),
					categori.getCategoryName());
			categoriItems.add(select);
		}

	}

	public Integer getCategoriID() {
		return categoriID;
	}

	public void setCategoriID(Integer categoriID) {
		this.categoriID = categoriID;
	}

	public List<SelectItem> getCategoriItems() {
		return categoriItems;
	}

	public void setCategoriItems(List<SelectItem> categoriItems) {
		this.categoriItems = categoriItems;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String kayitAction() {
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();

		Categories categori = new Categories();
		FacesContext context = FacesContext.getCurrentInstance();
		ValueBinding currentBinding = context.getApplication()
				.createValueBinding("#{ustCategoryBean}");
		UstCategoryBean ust = (UstCategoryBean) currentBinding
				.getValue(context);
		categori.setCategoryName(categoryName);
		categori.setDescription(description);
		categori.setUstCategoryId(ust.getUstCategoryId());		
		cDAO.save(categori);
		tx.commit();
		return null;
	}

}
