package org.csystem.beans;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "dateEntry")
@SessionScoped
public class DateEntryBean {
	private Date selectedDate = new Date(System.currentTimeMillis());

	public Date getSelectedDate() {
		return selectedDate;
	}

	public void setSelectedDate(Date selectedDate) {
		this.selectedDate = selectedDate;
	}

}
