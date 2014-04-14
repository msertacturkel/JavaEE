package org.csystem.bean;

import java.util.ArrayList;
import java.util.List;

import org.csystem.hiber.Customer;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class CustomerTable {
	private List<CustomerBean> customerList;

	public CustomerTable() {

		customerList = new ArrayList<CustomerBean>();

		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Query query = session.createQuery("from Customer");

		List<Customer> result = query.list();
		for (Customer customer : result) {
			CustomerBean cust = new CustomerBean();
			cust.setContactfirstname(customer.getContactfirstname());
			cust.setCustomernumber(customer.getCustomernumber());
			cust.setCountry(customer.getCountry());
			
			customerList.add(cust);
		}

	}

	public List<CustomerBean> getCustomerList() {
		return customerList;
	}

}
