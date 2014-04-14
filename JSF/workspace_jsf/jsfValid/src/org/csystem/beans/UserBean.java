package org.csystem.beans;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

public class UserBean {

	private String ad, soyad, email;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void validateEmail(FacesContext context, UIComponent toValidate,
			Object value) throws ValidatorException {
		String email = (String) value;
		if (email.indexOf('@') < 0) {
			FacesMessage message = new FacesMessage("Hatali mail");
			throw new ValidatorException(message);

		}
	}

}
