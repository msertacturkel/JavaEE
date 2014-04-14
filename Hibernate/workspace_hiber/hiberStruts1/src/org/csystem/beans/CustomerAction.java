package org.csystem.beans;

import java.util.ArrayList;
import java.util.List;

import org.csystem.hiber.Customer;
import org.csystem.hiber.CustomerDAO;

import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {

	List<String> custNames = new ArrayList<String>();

	public List<String> getCustNames() {
		return custNames;
	}

	public void setCustNames(List<String> custNames) {
		this.custNames = custNames;
	}

	public String execute() {
		CustomerDAO cDAO = new CustomerDAO();
		List<Customer> custs = cDAO.findAll();
		for (Customer customer : custs) {
			custNames.add(customer.getContactfýrstname());
		}

		return "goster";
	}
}