package org.csystem.hiber;

import java.util.Date;

/**
 * PurchaseOrder entity. @author MyEclipse Persistence Tools
 */

public class PurchaseOrder implements java.io.Serializable {

	// Fields

	private Integer orderNum;
	private Product product;
	private Customer customer;
	private Short quantity;
	private Double shippingCost;
	private Date salesDate;
	private Date shippingDate;
	private String freightCompany;

	// Constructors

	/** default constructor */
	public PurchaseOrder() {
	}

	/** minimal constructor */
	public PurchaseOrder(Product product, Customer customer) {
		this.product = product;
		this.customer = customer;
	}

	/** full constructor */
	public PurchaseOrder(Product product, Customer customer, Short quantity,
			Double shippingCost, Date salesDate, Date shippingDate,
			String freightCompany) {
		this.product = product;
		this.customer = customer;
		this.quantity = quantity;
		this.shippingCost = shippingCost;
		this.salesDate = salesDate;
		this.shippingDate = shippingDate;
		this.freightCompany = freightCompany;
	}

	// Property accessors

	public Integer getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Short getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Short quantity) {
		this.quantity = quantity;
	}

	public Double getShippingCost() {
		return this.shippingCost;
	}

	public void setShippingCost(Double shippingCost) {
		this.shippingCost = shippingCost;
	}

	public Date getSalesDate() {
		return this.salesDate;
	}

	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}

	public Date getShippingDate() {
		return this.shippingDate;
	}

	public void setShippingDate(Date shippingDate) {
		this.shippingDate = shippingDate;
	}

	public String getFreightCompany() {
		return this.freightCompany;
	}

	public void setFreightCompany(String freightCompany) {
		this.freightCompany = freightCompany;
	}

}