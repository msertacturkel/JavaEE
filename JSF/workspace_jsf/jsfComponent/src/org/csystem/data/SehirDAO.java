package org.csystem.data;

import java.util.ArrayList;
import java.util.List;

public class SehirDAO {

	List<Sehir> sehirler = new ArrayList<Sehir>();

	public SehirDAO() {
		sehirler.add(new Sehir(6, "Ankara"));
		sehirler.add(new Sehir(34, "Istanbul"));
		sehirler.add(new Sehir(26, "Eskisehir"));
		sehirler.add(new Sehir(1, "Adana"));

	}

	public Sehir getSehirByKod(int kod) {
		for (Sehir sehir : sehirler)
			if (sehir.getKod() == kod)
				return sehir;
		return null;
	}

	public List<Sehir> listAll() {
		return sehirler;
	}
}
