package org.csystem.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import org.csystem.hiber.Customer;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class CustomersBean {

	private List<SelectItem> customerItems = new ArrayList<SelectItem>();
	// private CustomerBean selectedCustomer;
	private String custNo;

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public CustomersBean() {
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Query query = session.createQuery("from Customer");

		List<Customer> result = query.list();

		for (Customer customer : result) {
			SelectItem select = new SelectItem(customer.getCustomernumber(),
					customer.getContactfirstname());
			customerItems.add(select);
		}
	}

	public List<SelectItem> getCustomerItems() {
		return customerItems;
	}

	public void setCustomerItems(List<SelectItem> customerItems) {
		this.customerItems = customerItems;
	}

}
