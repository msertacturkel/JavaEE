package org.csystem.hiber;

import java.util.HashSet;
import java.util.Set;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */

public class Product implements java.io.Serializable {

	// Fields

	private Integer productId;
	private Manufacturer manufacturer;
	private ProductCode productCode;
	private Double purchaseCost;
	private Integer quantityOnHand;
	private Double markup;
	private String available;
	private String description;
	private Integer categoryId;
	private String imageurl;
	private Set purchaseOrders = new HashSet(0);

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** minimal constructor */
	public Product(Manufacturer manufacturer, ProductCode productCode) {
		this.manufacturer = manufacturer;
		this.productCode = productCode;
	}

	/** full constructor */
	public Product(Manufacturer manufacturer, ProductCode productCode,
			Double purchaseCost, Integer quantityOnHand, Double markup,
			String available, String description, Integer categoryId,
			String imageurl, Set purchaseOrders) {
		this.manufacturer = manufacturer;
		this.productCode = productCode;
		this.purchaseCost = purchaseCost;
		this.quantityOnHand = quantityOnHand;
		this.markup = markup;
		this.available = available;
		this.description = description;
		this.categoryId = categoryId;
		this.imageurl = imageurl;
		this.purchaseOrders = purchaseOrders;
	}

	// Property accessors

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Manufacturer getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public ProductCode getProductCode() {
		return this.productCode;
	}

	public void setProductCode(ProductCode productCode) {
		this.productCode = productCode;
	}

	public Double getPurchaseCost() {
		return this.purchaseCost;
	}

	public void setPurchaseCost(Double purchaseCost) {
		this.purchaseCost = purchaseCost;
	}

	public Integer getQuantityOnHand() {
		return this.quantityOnHand;
	}

	public void setQuantityOnHand(Integer quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	public Double getMarkup() {
		return this.markup;
	}

	public void setMarkup(Double markup) {
		this.markup = markup;
	}

	public String getAvailable() {
		return this.available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getImageurl() {
		return this.imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public Set getPurchaseOrders() {
		return this.purchaseOrders;
	}

	public void setPurchaseOrders(Set purchaseOrders) {
		this.purchaseOrders = purchaseOrders;
	}

}