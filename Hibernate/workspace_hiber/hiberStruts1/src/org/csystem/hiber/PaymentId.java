package org.csystem.hiber;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PaymentId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class PaymentId implements java.io.Serializable {

	// Fields

	private Integer customernumber;
	private String checknumber;

	// Constructors

	/** default constructor */
	public PaymentId() {
	}

	/** full constructor */
	public PaymentId(Integer customernumber, String checknumber) {
		this.customernumber = customernumber;
		this.checknumber = checknumber;
	}

	// Property accessors

	@Column(name = "CUSTOMERNUMBER", nullable = false)
	public Integer getCustomernumber() {
		return this.customernumber;
	}

	public void setCustomernumber(Integer customernumber) {
		this.customernumber = customernumber;
	}

	@Column(name = "CHECKNUMBER", nullable = false, length = 50)
	public String getChecknumber() {
		return this.checknumber;
	}

	public void setChecknumber(String checknumber) {
		this.checknumber = checknumber;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PaymentId))
			return false;
		PaymentId castOther = (PaymentId) other;

		return ((this.getCustomernumber() == castOther.getCustomernumber()) || (this
				.getCustomernumber() != null
				&& castOther.getCustomernumber() != null && this
				.getCustomernumber().equals(castOther.getCustomernumber())))
				&& ((this.getChecknumber() == castOther.getChecknumber()) || (this
						.getChecknumber() != null
						&& castOther.getChecknumber() != null && this
						.getChecknumber().equals(castOther.getChecknumber())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCustomernumber() == null ? 0 : this.getCustomernumber()
						.hashCode());
		result = 37
				* result
				+ (getChecknumber() == null ? 0 : this.getChecknumber()
						.hashCode());
		return result;
	}

}