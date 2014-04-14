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
	private String contactf�rstname;
	private String phone;
	private String addressl�ne1;
	private String addressl�ne2;
	private String c�ty;
	private String state;
	private String postalcode;
	private String country;
	private Integer salesrepemployeenumber;
	private Double cred�tl�m�t;
	private Set payments = new HashSet(0);

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** full constructor */
	public Customer(String customername, String contactlastname,
			String contactf�rstname, String phone, String addressl�ne1,
			String addressl�ne2, String c�ty, String state, String postalcode,
			String country, Integer salesrepemployeenumber, Double cred�tl�m�t,
			Set payments) {
		this.customername = customername;
		this.contactlastname = contactlastname;
		this.contactf�rstname = contactf�rstname;
		this.phone = phone;
		this.addressl�ne1 = addressl�ne1;
		this.addressl�ne2 = addressl�ne2;
		this.c�ty = c�ty;
		this.state = state;
		this.postalcode = postalcode;
		this.country = country;
		this.salesrepemployeenumber = salesrepemployeenumber;
		this.cred�tl�m�t = cred�tl�m�t;
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

	public String getContactf�rstname() {
		return this.contactf�rstname;
	}

	public void setContactf�rstname(String contactf�rstname) {
		this.contactf�rstname = contactf�rstname;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddressl�ne1() {
		return this.addressl�ne1;
	}

	public void setAddressl�ne1(String addressl�ne1) {
		this.addressl�ne1 = addressl�ne1;
	}

	public String getAddressl�ne2() {
		return this.addressl�ne2;
	}

	public void setAddressl�ne2(String addressl�ne2) {
		this.addressl�ne2 = addressl�ne2;
	}

	public String getC�ty() {
		return this.c�ty;
	}

	public void setC�ty(String c�ty) {
		this.c�ty = c�ty;
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

	public Double getCred�tl�m�t() {
		return this.cred�tl�m�t;
	}

	public void setCred�tl�m�t(Double cred�tl�m�t) {
		this.cred�tl�m�t = cred�tl�m�t;
	}

	public Set getPayments() {
		return this.payments;
	}

	public void setPayments(Set payments) {
		this.payments = payments;
	}

}