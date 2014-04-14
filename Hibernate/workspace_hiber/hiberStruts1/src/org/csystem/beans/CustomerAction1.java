package org.csystem.beans;

import java.util.ArrayList;
import java.util.List;

import org.csystem.hiber.Customer;
import org.csystem.hiber.CustomerDAO;

import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction1 extends ActionSupport {

	List<Customer> custs = new ArrayList<Customer>();

	public List<Customer> getCusts() {
		return custs;
	}

	public void setCusts(List<Customer> custs) {
		this.custs = custs;
	}

	public String execute() {
		CustomerDAO cDAO = new CustomerDAO();
		custs = cDAO.findAll();
		
		return "goster";
	}
}