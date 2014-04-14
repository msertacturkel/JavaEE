package org.csystem.struts;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorld extends ActionSupport {

	private String ad, soyad;
	private int yas;
	
	
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


	public int getYas() {
		return yas;
	}


	public void setYas(int yas) {
		this.yas = yas;
	}


	public String execute() {
		// TODO Auto-generated method stub
		return "son";
	}
}