package org.csystem.hiber;

/**
 * Sequence entity. @author MyEclipse Persistence Tools
 */

public class Sequence implements java.io.Serializable {

	// Fields

	private String seqName;
	private Integer seqCount;

	// Constructors

	/** default constructor */
	public Sequence() {
	}

	/** full constructor */
	public Sequence(Integer seqCount) {
		this.seqCount = seqCount;
	}

	// Property accessors

	public String getSeqName() {
		return this.seqName;
	}

	public void setSeqName(String seqName) {
		this.seqName = seqName;
	}

	public Integer getSeqCount() {
		return this.seqCount;
	}

	public void setSeqCount(Integer seqCount) {
		this.seqCount = seqCount;
	}

}