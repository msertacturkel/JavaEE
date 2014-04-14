package org.csystem.hiber;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class HiberYaz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		Personel per = new Personel();
		per.setAd("Burak");
		per.setSoyad("Kuran");
		per.setMaas(4000);
		session.save(per);
		tx.commit();
		System.out.println("Afedersin biz kayit yapabildik..");
	}

}
