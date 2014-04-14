package org.csystem.struts.action;

public class Kitap {
	
	private int kitapID,fiyat;
	private String kitapAd,yazar;
	public int getFiyat() {
		return fiyat;
	}
	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}
	public String getKitapAd() {
		return kitapAd;
	}
	public void setKitapAd(String kitapAd) {
		this.kitapAd = kitapAd;
	}
	public String getYazar() {
		return yazar;
	}
	public void setYazar(String yazar) {
		this.yazar = yazar;
	}
	public int getKitapID() {
		return kitapID;
	}
	
	
}
