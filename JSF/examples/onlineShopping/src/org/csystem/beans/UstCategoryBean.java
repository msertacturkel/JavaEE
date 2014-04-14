package org.csystem.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import org.csystem.hiber.Categories;
import org.csystem.hiber.CategoriesDAO;
import org.csystem.hiber.HibernateSessionFactory;
import org.csystem.hiber.Ustcategory;
import org.csystem.hiber.UstcategoryDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UstCategoryBean {
	private String ustCategoryName;
	private String description;
	private Integer ustCategoryId;
	private List<SelectItem> ustCategoriItems = new ArrayList<SelectItem>();
	

	private UstcategoryDAO cDAO;

	public UstCategoryBean() {
		cDAO = new UstcategoryDAO();
		List<Ustcategory> ustCategories =cDAO.findAll();
		for (Ustcategory ustCategori : ustCategories) {
			SelectItem select = new SelectItem(ustCategori.getUstCategoryId(),
					ustCategori.getUstCategoryName());
			ustCategoriItems.add(select);
		}
	}
	public Integer getUstCategoryId() {
		return ustCategoryId;
	}

	public void setUstCategoryId(Integer ustCategoryId) {
		this.ustCategoryId = ustCategoryId;
	}

	public String getUstCategoryName() {
		return ustCategoryName;
	}

	public void setUstCategoryName(String ustCategoryName) {
		this.ustCategoryName = ustCategoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public List<SelectItem> getUstCategoriItems() {
		return ustCategoriItems;
	}

	public void setUstCategoriItems(List<SelectItem> ustCategoriItems) {
		this.ustCategoriItems = ustCategoriItems;
	}
	public String kayitAction() {
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();

		Ustcategory ust = new Ustcategory();
		ust.setUstCategoryName(ustCategoryName);
		ust.setDescription(description);
		cDAO.save(ust);
		tx.commit();
		return null;
	}

}
