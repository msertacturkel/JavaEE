/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package org.csystem.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 03-19-2011
 * 
 * XDoclet definition:
 * @struts.form name="kitapGirisForm"
 */
public class KitapGirisForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** yazar property */
	private String yazar;

	/** fiyat property */
	private Integer fiyat;

	/** kitapAdi property */
	private String kitapAdi;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the yazar.
	 * @return String
	 */
	public String getYazar() {
		return yazar;
	}

	/** 
	 * Set the yazar.
	 * @param yazar The yazar to set
	 */
	public void setYazar(String yazar) {
		this.yazar = yazar;
	}

	/** 
	 * Returns the fiyat.
	 * @return Integer
	 */
	public Integer getFiyat() {
		return fiyat;
	}

	/** 
	 * Set the fiyat.
	 * @param fiyat The fiyat to set
	 */
	public void setFiyat(Integer fiyat) {
		this.fiyat = fiyat;
	}

	/** 
	 * Returns the kitapAdi.
	 * @return String
	 */
	public String getKitapAdi() {
		return kitapAdi;
	}

	/** 
	 * Set the kitapAdi.
	 * @param kitapAdi The kitapAdi to set
	 */
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
}