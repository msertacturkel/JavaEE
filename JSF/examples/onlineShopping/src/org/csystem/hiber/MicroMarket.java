package org.csystem.hiber;

/**
 * MicroMarket entity. @author MyEclipse Persistence Tools
 */

public class MicroMarket implements java.io.Serializable {

	// Fields

	private String zipCode;
	private Double radius;
	private Double areaLength;
	private Double areaWidth;

	// Constructors

	/** default constructor */
	public MicroMarket() {
	}

	/** full constructor */
	public MicroMarket(Double radius, Double areaLength, Double areaWidth) {
		this.radius = radius;
		this.areaLength = areaLength;
		this.areaWidth = areaWidth;
	}

	// Property accessors

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Double getRadius() {
		return this.radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	public Double getAreaLength() {
		return this.areaLength;
	}

	public void setAreaLength(Double areaLength) {
		this.areaLength = areaLength;
	}

	public Double getAreaWidth() {
		return this.areaWidth;
	}

	public void setAreaWidth(Double areaWidth) {
		this.areaWidth = areaWidth;
	}

}