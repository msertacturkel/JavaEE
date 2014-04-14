package com.darklord.decorator;

public class Soldier extends Human {

	public Soldier() {
	}

	public Soldier(String name, int initialHealth, int attackPoint, int defencePoint) {
		super(name, initialHealth);
		this.attackPoint = attackPoint;
		this.defencePoint = defencePoint;
	}

	@Override
	public void update() {
		System.out.println("Preparing for battle...");
	}

	@Override
	public void draw() {
		System.out.println(this);

	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + "AP = " + attackPoint + " DP = " + defencePoint;
	}

	public int getAttackPoint() {
		return attackPoint;
	}

	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}

	public int getDefencePoint() {
		return defencePoint;
	}

	public void setDefencePoint(int defencePoint) {
		this.defencePoint = defencePoint;
	}

	protected int attackPoint, defencePoint;

}
