package org.cdernek.struts.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Urunler implements java.io.Serializable {

	private List<UrunOLD> urunler;

	public Urunler() {
		// TODO Auto-generated constructor stub
		urunler = new ArrayList<UrunOLD>();
		urunler.add(new UrunOLD("elma", "elm", 5));
		urunler.add(new UrunOLD("portakal", "port", 4));
		urunler.add(new UrunOLD("nar", "nr", 6));
	}

	public UrunOLD getUrun(String kod1) {
		int kod = Integer.parseInt(kod1);
		return (UrunOLD) urunler.get(kod);
	}
}
