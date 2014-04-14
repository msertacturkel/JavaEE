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
        Customer customer=new Customer();
        customer.setCustomernumber(1000);
        customer.setContactfýrstname("Ertugrul");
        customer.setContactlastname("Murat");
        session.save(customer);
        tx.commit();
        System.out.println("Afedersin biz kayit yapabildik..");
	}

}
