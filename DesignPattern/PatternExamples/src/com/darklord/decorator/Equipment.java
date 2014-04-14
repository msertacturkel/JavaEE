package com.darklord.decorator;

public abstract class Equipment implements DrawableComponent {
	
	public Equipment() {
	}

	public Equipment(String name) {
		this.name = name;
	}

	public abstract void update();
	public abstract void draw();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name = " + name + " ";
	}

	protected String name = "noname";

}
