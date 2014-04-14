package org.csystem.hiber;

import java.util.HashSet;
import java.util.Set;

/**
 * ProductCode entity. @author MyEclipse Persistence Tools
 */

public class ProductCode implements java.io.Serializable {

	// Fields

	private String prodCode;
	private String discountCode;
	private String description;
	private Set products = new HashSet(0);

	// Constructors

	/** default constructor */
	public ProductCode() {
	}

	/** minimal constructor */
	public ProductCode(String discountCode) {
		this.discountCode = discountCode;
	}

	/** full constructor */
	public ProductCode(String discountCode, String description, Set products) {
		this.discountCode = discountCode;
		this.description = description;
		this.products = products;
	}

	// Property accessors

	public String getProdCode() {
		return this.prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getDiscountCode() {
		return this.discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getProducts() {
		return this.products;
	}

	public void setProducts(Set products) {
		this.products = products;
	}

}