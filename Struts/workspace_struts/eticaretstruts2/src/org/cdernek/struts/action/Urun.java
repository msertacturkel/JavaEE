package org.cdernek.struts.action;

public class Urun implements java.io.Serializable{
	private String ad;
	private String kod;
	private double fiyat;

	public Urun() {
	}

	public Urun(String ad, String kod, double fiyat) {
		super();
		this.ad = ad;
		this.kod = kod;
		this.fiyat = fiyat;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

}
