package org.csystem.struts;

import com.opensymphony.xwork2.ActionSupport;

public class RenkGoster extends ActionSupport {
	private String renk;

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String execute() {
		// TODO Auto-generated method stub
		return "renkgoster";
	}
}