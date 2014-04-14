package dao;

import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PersonelDao p=new PersonelDao();
		List<Personel> pers = p.findAll();
		for (Personel personel : pers) {
			System.out.println(personel.getAd());
		}

	}

}
