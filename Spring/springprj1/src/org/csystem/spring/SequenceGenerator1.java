package org.csystem.spring;

import java.util.List;

public class SequenceGenerator1 {
	private List<Object> suffixes;
	private int initial;
	private int counter;

	public SequenceGenerator1() {
	}

	public SequenceGenerator1(List<Object> suffixes, int initial) {
		super();
		this.suffixes = suffixes;
		this.initial = initial;

	}

	public int getInitial() {
		return initial;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}

	public List<Object> getSuffixes() {
		return suffixes;
	}

	public void setSuffixes(List<Object> suffixes) {
		this.suffixes = suffixes;
	}

	public synchronized String getSequence() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(initial + counter++);
		for (Object suffix : suffixes) {
			buffer.append("-");
			buffer.append(suffix);
		}
		return buffer.toString();
	}
}
