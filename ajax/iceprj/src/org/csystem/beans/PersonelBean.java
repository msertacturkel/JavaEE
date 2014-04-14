package org.csystem.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PersonelBean {

	private List<Personel> personeller = new ArrayList<Personel>();

	public PersonelBean() {
		personeller.add(new Personel("Hakan", "Erman"));
		personeller.add(new Personel("Ugur", "Pirci"));
		personeller.add(new Personel("Burak", "Yaman"));
	}

	public List<Personel> getPersoneller() {
		return personeller;
	}

	public void setPersoneller(List<Personel> personeller) {
		this.personeller = personeller;
	}

}
