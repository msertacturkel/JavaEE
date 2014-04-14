package org.csystem.hiber;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class CustomerTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Query query = session.createQuery("from Customer");

		List<Customer> result = query.list();

		for (Customer customer : result) {
			System.out.println(customer.getCustomernumber() + ","
					+ customer.getContactfirstname());
		}

	}

}
