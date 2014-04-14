package com.darklord.decorator;

public class IntelligentSoldier extends Soldier {
	
	public IntelligentSoldier(Soldier soldier) {
		super(soldier.name, soldier.totalHealth, soldier.attackPoint, soldier.defencePoint);
		this.soldier = soldier;
	}
	
	
	
	@Override
	public void draw() {
		super.draw();
		soldier.draw();
	}

	@Override
	public void update() {
		super.update();
		soldier.update();
		doIntelligentThings();
	}

	void doIntelligentThings() {
		System.out.println("I am doing some AI things.");
	}

	Soldier soldier;
	
}
