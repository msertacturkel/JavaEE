/**
 * 
 */
package org.csystem;

import java.util.Date;

/**
 * @author Administrator
 * 
 */
public class PersonBean {
	private String ad, soyad;

	private Date dogum;

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

	public Date getDogum() {
		return dogum;
	}

	public void setDogum(Date dogum) {
		this.dogum = dogum;
	}

	public String gosterAction() {
		return "goster";
	}
}
