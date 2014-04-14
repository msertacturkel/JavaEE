package org.csystem.hiber;

/**
 * Urunler entity. @author MyEclipse Persistence Tools
 */

public class Urunler implements java.io.Serializable {

	// Fields

	private Integer urunId;
	private Integer categoryId;
	private String urunAd;
	private String kisaAciklama;
	private String uzunAciklama;
	private String imageUrl;
	private String urunKodu;

	// Constructors

	/** default constructor */
	public Urunler() {
	}

	/** full constructor */
	public Urunler(Integer categoryId, String urunAd, String kisaAciklama,
			String uzunAciklama, String imageUrl, String urunKodu) {
		this.categoryId = categoryId;
		this.urunAd = urunAd;
		this.kisaAciklama = kisaAciklama;
		this.uzunAciklama = uzunAciklama;
		this.imageUrl = imageUrl;
		this.urunKodu = urunKodu;
	}

	// Property accessors

	public Integer getUrunId() {
		return this.urunId;
	}

	public void setUrunId(Integer urunId) {
		this.urunId = urunId;
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getUrunAd() {
		return this.urunAd;
	}

	public void setUrunAd(String urunAd) {
		this.urunAd = urunAd;
	}

	public String getKisaAciklama() {
		return this.kisaAciklama;
	}

	public void setKisaAciklama(String kisaAciklama) {
		this.kisaAciklama = kisaAciklama;
	}

	public String getUzunAciklama() {
		return this.uzunAciklama;
	}

	public void setUzunAciklama(String uzunAciklama) {
		this.uzunAciklama = uzunAciklama;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getUrunKodu() {
		return this.urunKodu;
	}

	public void setUrunKodu(String urunKodu) {
		this.urunKodu = urunKodu;
	}

}