package com.revature.oop;
public class Circle implements Shape {

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(this.radius, 2);
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}

}
