package org.csystem.beans;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

public class CountryValueListener implements ValueChangeListener {

	public void processValueChange(ValueChangeEvent event)
			throws AbortProcessingException {

		// access country bean directly
		CountryBean country = (CountryBean) FacesContext.getCurrentInstance()
				.getExternalContext().getSessionMap().get("country");

		country.setLocaleCode(event.getNewValue().toString());

	}

}