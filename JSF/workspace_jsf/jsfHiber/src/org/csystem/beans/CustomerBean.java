package org.csystem.beans;

import java.util.List;

import org.csystem.hiber.Customer;
import org.csystem.hiber.CustomerDAO;

public class CustomerBean {

	private List<Customer> customers;

	public CustomerBean() {
		CustomerDAO custD = new CustomerDAO();
		customers = custD.findAll();
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

}
