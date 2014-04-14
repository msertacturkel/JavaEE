package org.cdernek.hiber;

/**
 * Urun entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Urun implements java.io.Serializable {

	// Fields

	private Integer urunId;
	private String urunAd;
	private String urunKod;
	private Integer fiyat;

	// Constructors

	/** default constructor */
	public Urun() {
	}

	/** full constructor */
	public Urun(String urunAd, String urunKod, Integer fiyat) {
		this.urunAd = urunAd;
		this.urunKod = urunKod;
		this.fiyat = fiyat;
	}

	// Property accessors

	public Integer getUrunId() {
		return this.urunId;
	}

	public void setUrunId(Integer urunId) {
		this.urunId = urunId;
	}

	public String getUrunAd() {
		return this.urunAd;
	}

	public void setUrunAd(String urunAd) {
		this.urunAd = urunAd;
	}

	public String getUrunKod() {
		return this.urunKod;
	}

	public void setUrunKod(String urunKod) {
		this.urunKod = urunKod;
	}

	public Integer getFiyat() {
		return this.fiyat;
	}

	public void setFiyat(Integer fiyat) {
		this.fiyat = fiyat;
	}

}