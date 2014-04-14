package org.csystem.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import org.csystem.data.Sehir;
import org.csystem.data.SehirDAO;

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
		SehirDAO sd = new SehirDAO();
		List<Sehir> sehirler = sd.listAll();
		for (Sehir sehir : sehirler)
			sehirItem.add(new SelectItem(sehir.getKod(), sehir.getAd()));

	}

}
