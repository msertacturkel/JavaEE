package com.darklord.decorator;

public class Civilian extends Human {

	public Civilian() {
	}

	public Civilian(String name, int initialHealth) {
		super(name, initialHealth);
	}
	
	public Civilian(String name, int initialHealth, float x, float y) {
		super(name, initialHealth, x, y);
	}

	@Override
	public void update() {
		System.out.println("Doing some farming, collecting, usual stuff!");
	}

	@Override
	public void draw() {
		System.out.println(this);
	}

}
