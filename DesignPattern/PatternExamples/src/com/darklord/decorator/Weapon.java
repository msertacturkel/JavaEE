package com.darklord.decorator;

public abstract class Weapon extends Equipment {
	
	public Weapon() {
		super();
	}
	
	public Weapon(String name, int damagePointLowest, int damagePointHighest,
			int condition) {
		super(name);
		this.damagePointLowest = damagePointLowest;
		this.damagePointHighest = damagePointHighest;
		this.condition = condition;
	}

	abstract public void update();
	abstract public void draw();
	
	@Override
	public String toString() {
		return super.toString() + "damagePointLowest = " + damagePointLowest
				+ " damagePointHighest = " + damagePointHighest + " condition = "
				+ condition;
	}

	public int getDamagePointLowest() {
		return damagePointLowest;
	}
	public void setDamagePointLowest(int damagePointLowest) {
		this.damagePointLowest = damagePointLowest;
	}
	public int getDamagePointHighest() {
		return damagePointHighest;
	}
	public void setDamagePointHighest(int damagePointHighest) {
		this.damagePointHighest = damagePointHighest;
	}
	public int getCondition() {
		return condition;
	}
	public void setCondition(int condition) {
		this.condition = condition;
	}
	
	protected int damagePointLowest, damagePointHighest, condition;

}
