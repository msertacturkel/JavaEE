package org.csystem.hiber;

import java.util.HashSet;
import java.util.Set;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	private Integer customernumber;
	private String customername;
	private String contactlastname;
	private String contactfýrstname;
	private String phone;
	private String addresslýne1;
	private String addresslýne2;
	private String cýty;
	private String state;
	private String postalcode;
	private String country;
	private Integer salesrepemployeenumber;
	private Double credýtlýmýt;
	private Set payments = new HashSet(0);

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** full constructor */
	public Customer(String customername, String contactlastname,
			String contactfýrstname, String phone, String addresslýne1,
			String addresslýne2, String cýty, String state, String postalcode,
			String country, Integer salesrepemployeenumber, Double credýtlýmýt,
			Set payments) {
		this.customername = customername;
		this.contactlastname = contactlastname;
		this.contactfýrstname = contactfýrstname;
		this.phone = phone;
		this.addresslýne1 = addresslýne1;
		this.addresslýne2 = addresslýne2;
		this.cýty = cýty;
		this.state = state;
		this.postalcode = postalcode;
		this.country = country;
		this.salesrepemployeenumber = salesrepemployeenumber;
		this.credýtlýmýt = credýtlýmýt;
		this.payments = payments;
	}

	// Property accessors

	public Integer getCustomernumber() {
		return this.customernumber;
	}

	public void setCustomernumber(Integer customernumber) {
		this.customernumber = customernumber;
	}

	public String getCustomername() {
		return this.customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getContactlastname() {
		return this.contactlastname;
	}

	public void setContactlastname(String contactlastname) {
		this.contactlastname = contactlastname;
	}

	public String getContactfýrstname() {
		return this.contactfýrstname;
	}

	public void setContactfýrstname(String contactfýrstname) {
		this.contactfýrstname = contactfýrstname;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddresslýne1() {
		return this.addresslýne1;
	}

	public void setAddresslýne1(String addresslýne1) {
		this.addresslýne1 = addresslýne1;
	}

	public String getAddresslýne2() {
		return this.addresslýne2;
	}

	public void setAddresslýne2(String addresslýne2) {
		this.addresslýne2 = addresslýne2;
	}

	public String getCýty() {
		return this.cýty;
	}

	public void setCýty(String cýty) {
		this.cýty = cýty;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalcode() {
		return this.postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getSalesrepemployeenumber() {
		return this.salesrepemployeenumber;
	}

	public void setSalesrepemployeenumber(Integer salesrepemployeenumber) {
		this.salesrepemployeenumber = salesrepemployeenumber;
	}

	public Double getCredýtlýmýt() {
		return this.credýtlýmýt;
	}

	public void setCredýtlýmýt(Double credýtlýmýt) {
		this.credýtlýmýt = credýtlýmýt;
	}

	public Set getPayments() {
		return this.payments;
	}

	public void setPayments(Set payments) {
		this.payments = payments;
	}

}