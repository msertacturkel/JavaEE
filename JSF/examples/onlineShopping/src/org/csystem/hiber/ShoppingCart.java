package org.csystem.hiber;

/**
 * ShoppingCart entity. @author MyEclipse Persistence Tools
 */

public class ShoppingCart implements java.io.Serializable {

	// Fields

	private Integer pkid;
	private Integer cartid;
	private Integer productid;
	private Integer quantity;

	// Constructors

	/** default constructor */
	public ShoppingCart() {
	}

	/** minimal constructor */
	public ShoppingCart(Integer cartid, Integer productid) {
		this.cartid = cartid;
		this.productid = productid;
	}

	/** full constructor */
	public ShoppingCart(Integer cartid, Integer productid, Integer quantity) {
		this.cartid = cartid;
		this.productid = productid;
		this.quantity = quantity;
	}

	// Property accessors

	public Integer getPkid() {
		return this.pkid;
	}

	public void setPkid(Integer pkid) {
		this.pkid = pkid;
	}

	public Integer getCartid() {
		return this.cartid;
	}

	public void setCartid(Integer cartid) {
		this.cartid = cartid;
	}

	public Integer getProductid() {
		return this.productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}