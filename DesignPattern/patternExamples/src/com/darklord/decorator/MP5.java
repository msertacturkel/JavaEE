package com.darklord.decorator;

public class MP5 extends Weapon {
	public MP5() {
		super();
		name = "mp5";
	}

	public MP5(int damagePointLowest, int damagePointHighest,
			int condition) {
		super("mp5", damagePointLowest, damagePointHighest, condition);
	}

	@Override
	public void update() {
		System.out.println("Using MP5.");
	}

	@Override
	public void draw() {
		System.out.println(this);

	}

}
