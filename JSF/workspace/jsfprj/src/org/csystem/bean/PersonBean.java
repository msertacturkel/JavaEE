package org.csystem.bean;

public class PersonBean {
	
	private String ad, soyad;

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
	
	public String gitAction(){
		return "son";
	}

}
