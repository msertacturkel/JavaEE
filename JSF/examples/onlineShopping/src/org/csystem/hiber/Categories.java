package org.csystem.hiber;

/**
 * Categories entity. @author MyEclipse Persistence Tools
 */

public class Categories implements java.io.Serializable {

	// Fields

	private Integer categoryId;
	private String categoryName;
	private String description;
	private Integer ustCategoryId;

	// Constructors

	/** default constructor */
	public Categories() {
	}

	/** full constructor */
	public Categories(String categoryName, String description,
			Integer ustCategoryId) {
		this.categoryName = categoryName;
		this.description = description;
		this.ustCategoryId = ustCategoryId;
	}

	// Property accessors

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getUstCategoryId() {
		return this.ustCategoryId;
	}

	public void setUstCategoryId(Integer ustCategoryId) {
		this.ustCategoryId = ustCategoryId;
	}

}