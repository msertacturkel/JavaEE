package org.csystem.beans;

import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;

import org.apache.taglibs.standard.lang.jstl.OrOperator;
import org.csystem.hiber.Categories;
import org.csystem.hiber.CategoriesDAO;
import org.csystem.hiber.HibernateSessionFactory;
import org.csystem.hiber.Urunler;
import org.csystem.hiber.UrunlerDAO;
import org.csystem.hiber.Ustcategory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UrunBean {
	private Integer categoryId;
	private String urunAd;
	private String kisaAciklama;
	private String uzunAciklama;
	private String imageUrl;
	private String urunKodu;
	private UrunlerDAO uDAO;

	public UrunBean() {
		uDAO = new UrunlerDAO();
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getUrunAd() {
		return urunAd;
	}

	public void setUrunAd(String urunAd) {
		this.urunAd = urunAd;
	}

	public String getKisaAciklama() {
		return kisaAciklama;
	}

	public void setKisaAciklama(String kisaAciklama) {
		this.kisaAciklama = kisaAciklama;
	}

	public String getUzunAciklama() {
		return uzunAciklama;
	}

	public void setUzunAciklama(String uzunAciklama) {
		this.uzunAciklama = uzunAciklama;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getUrunKodu() {
		return urunKodu;
	}

	public void setUrunKodu(String urunKodu) {
		this.urunKodu = urunKodu;
	}

	public String kayitAction() {
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		FacesContext context = FacesContext.getCurrentInstance();
		ValueBinding currentBinding = context.getApplication()
				.createValueBinding("#{categoriesBean}");
		CategoriesBean categori = (CategoriesBean ) currentBinding
				.getValue(context);
		Urunler urunler = new Urunler();
		urunler.setImageUrl(imageUrl);
		urunler.setKisaAciklama(kisaAciklama);
		urunler.setUrunAd(urunAd);
		urunler.setUrunKodu(urunKodu);
		urunler.setUzunAciklama(uzunAciklama);
		urunler.setCategoryId(categori.getCategoriID());
		uDAO.save(urunler);
		tx.commit();
		return null;
	}
}
