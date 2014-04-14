package org.csystem.hiber;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class HiberOku {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Customer");
        List<Customer> customers = query.list();
        for (Customer customer : customers) {
			System.out.println(customer.getContactfýrstname());
		}

	}

}
