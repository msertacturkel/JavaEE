package org.csystem.data;

import java.util.List;

public class DAOTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SehirDAO sd=new SehirDAO();
		List<Sehir> sehirler = sd.listAll();
		for (Sehir sehir : sehirler) {
			System.out.println(sehir.getAd());
		}

	}

}
