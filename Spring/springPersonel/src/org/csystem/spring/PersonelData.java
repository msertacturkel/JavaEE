package org.csystem.spring;

import java.util.ArrayList;
import java.util.List;

public class PersonelData {
	private List<Personel> personeller;

	public PersonelData() {
		personeller = new ArrayList<Personel>();
		personeller.add(new Personel("Ugur", "Pirci"));
		personeller.add(new Personel("Eren", "Printer"));
		personeller.add(new Personel("Goknur", "Lion"));
	}

	public List<Personel> getPersoneller() {
		return personeller;
	}

}
