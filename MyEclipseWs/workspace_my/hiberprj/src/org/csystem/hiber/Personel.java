package org.csystem.hiber;

/**
 * Personel entity. @author MyEclipse Persistence Tools
 */

public class Personel implements java.io.Serializable {

	// Fields

	private Integer id;
	private String ad;
	private String soyad;
	private Integer maas;

	// Constructors

	/** default constructor */
	public Personel() {
	}

	/** full constructor */
	public Personel(String ad, String soyad, Integer maas) {
		this.ad = ad;
		this.soyad = soyad;
		this.maas = maas;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAd() {
		return this.ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return this.soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public Integer getMaas() {
		return this.maas;
	}

	public void setMaas(Integer maas) {
		this.maas = maas;
	}

}