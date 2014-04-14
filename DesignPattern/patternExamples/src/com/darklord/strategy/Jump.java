package com.darklord.strategy;

public class Jump implements MoveBehavior {

	@Override
	public void move(Person person, int x, int y) {
		person.x = x;
		person.y = y;
		System.out.println("I jumpped to (" + x + ", " + y + ")");
	}

}
