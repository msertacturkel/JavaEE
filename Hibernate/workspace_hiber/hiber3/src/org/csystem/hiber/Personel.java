package org.csystem.hiber;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Personel entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "PERSONEL", schema = "CLASSICCARS")
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
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "AD", length = 40)
	public String getAd() {
		return this.ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	@Column(name = "SOYAD", length = 40)
	public String getSoyad() {
		return this.soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	@Column(name = "MAAS")
	public Integer getMaas() {
		return this.maas;
	}

	public void setMaas(Integer maas) {
		this.maas = maas;
	}

}