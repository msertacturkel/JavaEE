package org.csystem.struts.form;

import org.apache.struts.action.ActionForm;

public class PersonelForm extends ActionForm {
	private String ad;
	private String soyad;
	private int maas;
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		this.maas = maas;
	}
	
	
}
