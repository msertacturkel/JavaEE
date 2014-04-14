package org.csystem.hiber;

import java.util.Date;

/**
 * Payment entity. @author MyEclipse Persistence Tools
 */

public class Payment implements java.io.Serializable {

	// Fields

	private PaymentId id;
	private Customer customer;
	private Date paymentdate;
	private Double amount;

	// Constructors

	/** default constructor */
	public Payment() {
	}

	/** minimal constructor */
	public Payment(PaymentId id, Customer customer) {
		this.id = id;
		this.customer = customer;
	}

	/** full constructor */
	public Payment(PaymentId id, Customer customer, Date paymentdate,
			Double amount) {
		this.id = id;
		this.customer = customer;
		this.paymentdate = paymentdate;
		this.amount = amount;
	}

	// Property accessors

	public PaymentId getId() {
		return this.id;
	}

	public void setId(PaymentId id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getPaymentdate() {
		return this.paymentdate;
	}

	public void setPaymentdate(Date paymentdate) {
		this.paymentdate = paymentdate;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}