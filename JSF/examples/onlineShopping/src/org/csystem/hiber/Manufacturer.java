package org.csystem.hiber;

import java.util.HashSet;
import java.util.Set;

/**
 * Manufacturer entity. @author MyEclipse Persistence Tools
 */

public class Manufacturer implements java.io.Serializable {

	// Fields

	private Integer manufacturerId;
	private String name;
	private String addressline1;
	private String addressline2;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String fax;
	private String email;
	private String rep;
	private Set products = new HashSet(0);

	// Constructors

	/** default constructor */
	public Manufacturer() {
	}

	/** full constructor */
	public Manufacturer(String name, String addressline1, String addressline2,
			String city, String state, String zip, String phone, String fax,
			String email, String rep, Set products) {
		this.name = name;
		this.addressline1 = addressline1;
		this.addressline2 = addressline2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.fax = fax;
		this.email = email;
		this.rep = rep;
		this.products = products;
	}

	// Property accessors

	public Integer getManufacturerId() {
		return this.manufacturerId;
	}

	public void setManufacturerId(Integer manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddressline1() {
		return this.addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return this.addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRep() {
		return this.rep;
	}

	public void setRep(String rep) {
		this.rep = rep;
	}

	public Set getProducts() {
		return this.products;
	}

	public void setProducts(Set products) {
		this.products = products;
	}

}