package com.darklord.decorator;

public class VisualRectangle implements DrawableComponent {

	public VisualRectangle(float x, float y, float width, float height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public void update() {
	}

	@Override
	public void draw() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Drawing rectangle at " + "(" + x + ", " + y + ") with width of " + width + 
		" and height of " + height;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	protected float x, y, width, height;

}
