package org.csystem.hiber;

/**
 * Ustcategory entity. @author MyEclipse Persistence Tools
 */

public class Ustcategory implements java.io.Serializable {

	// Fields

	private Integer ustCategoryId;
	private String ustCategoryName;
	private String description;

	// Constructors

	/** default constructor */
	public Ustcategory() {
	}

	/** full constructor */
	public Ustcategory(String ustCategoryName, String description) {
		this.ustCategoryName = ustCategoryName;
		this.description = description;
	}

	// Property accessors

	public Integer getUstCategoryId() {
		return this.ustCategoryId;
	}

	public void setUstCategoryId(Integer ustCategoryId) {
		this.ustCategoryId = ustCategoryId;
	}

	public String getUstCategoryName() {
		return this.ustCategoryName;
	}

	public void setUstCategoryName(String ustCategoryName) {
		this.ustCategoryName = ustCategoryName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}