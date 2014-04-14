package org.csystem.bean;

public class TableData {
	private Name[] names;

	public TableData() {
		names = new Name[] { new Name("William", "Dupont"),
				new Name("Anna", "Keeney"), new Name("Mariko", "Randor"),
				new Name("John", "Wilson") };
	}

	public Name[] getNames() {
		return names;
	}

}
