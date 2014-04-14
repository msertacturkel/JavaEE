package com.darklord.decorator;

public abstract class Human implements DrawableComponent {
	public Human() {
	}
	
	public Human(String name, int initialHealth) {
		this.name = name;
		currentHealth = totalHealth = initialHealth;
	}
	
	public Human(String name, int initialHealth, float x, float y) {
		this(name, initialHealth);
		this.x = x;
		this.y = y;
	}
	
	public abstract void update();
	public abstract void draw();
	
	public void Move(float x, float y)
	{
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name = " + name + " Health = (" + currentHealth + "/" + totalHealth + ")";
	}

	protected String name = "noname";
	protected int currentHealth = 100;
	protected int totalHealth = 100;
	protected float x = 0, y = 0;
}
