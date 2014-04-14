package com.darklord.decorator;

import java.util.ArrayList;

public class EquippedSoldier extends Soldier {

	public EquippedSoldier(Soldier soldier) {
		super(soldier.name, soldier.totalHealth, soldier.attackPoint, soldier.defencePoint);
		this.soldier = soldier;
	}
	
	@Override
	public void update() {
		super.update();
		soldier.update();
		
		for (Equipment equipment : equipments) {
			equipment.update();
		}
	}

	@Override
	public void draw() {
		super.draw();
		soldier.draw();
		
		for (Equipment equipment : equipments) {
			equipment.draw();
		}
	}

	public void equip(Equipment equipment) {
		equipments.add(equipment);
	}
	
	public boolean unequip(Equipment equipment) {
		return equipments.remove(equipment);
	} 
	
	ArrayList<Equipment> equipments = new ArrayList<Equipment>();
	Soldier soldier;

}
