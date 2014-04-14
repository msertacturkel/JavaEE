package org.csystem.struts;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class MyAction extends ActionSupport {

	private List<String> renkler = new ArrayList<String>();

	public MyAction() {
		renkler.add("kirmizi");
		renkler.add("mavi");
		renkler.add("yesil");
		renkler.add("penbe");
	}

	public List<String> getRenkler() {
		return renkler;
	}

	public void setRenkler(List<String> renkler) {
		this.renkler = renkler;
	}

	public String execute() {
		// TODO Auto-generated method stub
		return "son";
	}
}