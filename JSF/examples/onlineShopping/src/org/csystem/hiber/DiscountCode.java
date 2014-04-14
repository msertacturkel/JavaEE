package org.csystem.hiber;

import java.util.HashSet;
import java.util.Set;

/**
 * DiscountCode entity. @author MyEclipse Persistence Tools
 */

public class DiscountCode implements java.io.Serializable {

	// Fields

	private String discountCode;
	private Double rate;
	private Set customers = new HashSet(0);

	// Constructors

	/** default constructor */
	public DiscountCode() {
	}

	/** full constructor */
	public DiscountCode(Double rate, Set customers) {
		this.rate = rate;
		this.customers = customers;
	}

	// Property accessors

	public String getDiscountCode() {
		return this.discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public Double getRate() {
		return this.rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Set getCustomers() {
		return this.customers;
	}

	public void setCustomers(Set customers) {
		this.customers = customers;
	}

}