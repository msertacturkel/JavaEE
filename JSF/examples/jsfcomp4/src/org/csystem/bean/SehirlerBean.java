package org.csystem.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

public class SehirlerBean {

	private List<SelectItem> sehirItem = new ArrayList<SelectItem>();
	private String kod;
	private String kodlar[];

	public List<SelectItem> getSehirItem() {
		return sehirItem;
	}

	public void setSehirItem(List<SelectItem> sehirItem) {
		this.sehirItem = sehirItem;
	}

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	public String[] getKodlar() {
		return kodlar;
	}

	public void setKodlar(String[] kodlar) {
		this.kodlar = kodlar;
	}

	public SehirlerBean() {
		sehirItem.add(new SelectItem("06", "Ankara"));
		sehirItem.add(new SelectItem("34", "Istanbul"));
		sehirItem.add(new SelectItem("26", "Eskisehir"));
		sehirItem.add(new SelectItem("01", "Adana"));
	}

}
