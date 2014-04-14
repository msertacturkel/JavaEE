package com.darklord.strategy;

public class HelloTurkish implements HelloBehavior {

	@Override
	public void sayHello(Person person) {
		System.out.println("Merhaba, ben " + person.name + "!");
	}

}
