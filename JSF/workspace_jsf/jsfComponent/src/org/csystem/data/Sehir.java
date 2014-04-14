package org.csystem.data;

public class Sehir {

	private int kod;
	private String ad;

	public Sehir(int kod, String ad) {
		this.kod = kod;
		this.ad = ad;
	}

	public int getKod() {
		return kod;
	}

	public void setKod(int kod) {
		this.kod = kod;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

}
