package com.darklord;

public class Person {
	public Person() 
	{
	}
	
	public Person(String name, int x, int y, HelloBehavior helloBehavior, 
			GoodbyeBehavior goodbyeBehavior, MoveBehavior moveBehavior)
	{
		this.name = name;
		this.x = x;
		this.y = y;
		this.helloBehavior = helloBehavior;
		this.goodbyeBehavior = goodbyeBehavior;
		this.moveBehavior = moveBehavior;
	}
	
	public void introduce()
	{
		helloBehavior.sayHello(this);
		
	}
	
	public void moveTo(int x, int y)
	{
		moveBehavior.move(this, x, y);
	}
	
	public void leaveAndGoTo(int x, int y)
	{
		goodbyeBehavior.sayGoodbye();
		moveBehavior.move(this, x, y);
	}

	// Getters and setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HelloBehavior getHelloBehavior() {
		return helloBehavior;
	}

	public void setHelloBehavior(HelloBehavior helloBehavior) {
		this.helloBehavior = helloBehavior;
	}

	public GoodbyeBehavior getGoodbyeBehavior() {
		return goodbyeBehavior;
	}

	public void setGoodbyeBehavior(GoodbyeBehavior goodbyeBehavior) {
		this.goodbyeBehavior = goodbyeBehavior;
	}

	public MoveBehavior getMoveBehavior() {
		return moveBehavior;
	}

	public void setMoveBehavior(MoveBehavior moveBehavior) {
		this.moveBehavior = moveBehavior;
	}

	// Behaviors
	HelloBehavior helloBehavior;
	GoodbyeBehavior goodbyeBehavior;
	MoveBehavior moveBehavior;
	
	// Properties
	protected int x, y;
	protected String name;
}
