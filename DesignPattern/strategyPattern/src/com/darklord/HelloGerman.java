package com.darklord;

public class HelloGerman implements HelloBehavior {

	@Override
	public void sayHello(Person person) {
		System.out.println("Hallo, ich bin " + person.name + "!");
	}

}
