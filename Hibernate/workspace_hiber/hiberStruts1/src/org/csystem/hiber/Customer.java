package org.csystem.hiber;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "CUSTOMER", schema = "CLASSICCARS")
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
	private Set<Payment> payments = new HashSet<Payment>(0);

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** full constructor */
	public Customer(String customername, String contactlastname,
			String contactfýrstname, String phone, String addresslýne1,
			String addresslýne2, String cýty, String state, String postalcode,
			String country, Integer salesrepemployeenumber, Double credýtlýmýt,
			Set<Payment> payments) {
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
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CUSTOMERNUMBER", unique = true, nullable = false)
	public Integer getCustomernumber() {
		return this.customernumber;
	}

	public void setCustomernumber(Integer customernumber) {
		this.customernumber = customernumber;
	}

	@Column(name = "CUSTOMERNAME", length = 50)
	public String getCustomername() {
		return this.customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	@Column(name = "CONTACTLASTNAME", length = 50)
	public String getContactlastname() {
		return this.contactlastname;
	}

	public void setContactlastname(String contactlastname) {
		this.contactlastname = contactlastname;
	}

	@Column(name = "CONTACTFIRSTNAME", length = 50)
	public String getContactfýrstname() {
		return this.contactfýrstname;
	}

	public void setContactfýrstname(String contactfýrstname) {
		this.contactfýrstname = contactfýrstname;
	}

	@Column(name = "PHONE", length = 50)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "ADDRESSLINE1", length = 50)
	public String getAddresslýne1() {
		return this.addresslýne1;
	}

	public void setAddresslýne1(String addresslýne1) {
		this.addresslýne1 = addresslýne1;
	}

	@Column(name = "ADDRESSLINE2", length = 50)
	public String getAddresslýne2() {
		return this.addresslýne2;
	}

	public void setAddresslýne2(String addresslýne2) {
		this.addresslýne2 = addresslýne2;
	}

	@Column(name = "CITY", length = 50)
	public String getCýty() {
		return this.cýty;
	}

	public void setCýty(String cýty) {
		this.cýty = cýty;
	}

	@Column(name = "STATE", length = 50)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "POSTALCODE", length = 15)
	public String getPostalcode() {
		return this.postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	@Column(name = "COUNTRY", length = 50)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "SALESREPEMPLOYEENUMBER")
	public Integer getSalesrepemployeenumber() {
		return this.salesrepemployeenumber;
	}

	public void setSalesrepemployeenumber(Integer salesrepemployeenumber) {
		this.salesrepemployeenumber = salesrepemployeenumber;
	}

	@Column(name = "CREDITLIMIT", precision = 52, scale = 0)
	public Double getCredýtlýmýt() {
		return this.credýtlýmýt;
	}

	public void setCredýtlýmýt(Double credýtlýmýt) {
		this.credýtlýmýt = credýtlýmýt;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")
	public Set<Payment> getPayments() {
		return this.payments;
	}

	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}

}