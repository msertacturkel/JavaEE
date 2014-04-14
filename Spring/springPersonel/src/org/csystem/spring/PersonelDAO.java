package org.csystem.spring;

import java.util.ArrayList;
import java.util.List;

public class PersonelDAO {
	private List<Personel> personeller;

	public PersonelDAO(PersonelData perData) {
		personeller = perData.getPersoneller();
	}

	public List<Personel> listAll() {
		return personeller;
	}

}
