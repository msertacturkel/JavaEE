package org.cdernek.struts.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Urunler implements java.io.Serializable {

	private List<Urun> urunler;

	public Urunler() {
		// TODO Auto-generated constructor stub
		urunler = new ArrayList<Urun>();
		urunler.add(new Urun("elma", "elm", 5));
		urunler.add(new Urun("portakal", "port", 4));
		urunler.add(new Urun("nar", "nr", 6));
	}

	public Urun getUrun(String kod1) {
		int kod = Integer.parseInt(kod1);
		return (Urun) urunler.get(kod);
	}
}
