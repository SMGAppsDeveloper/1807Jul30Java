package com.revature.oop;

public class Square implements Shape {
	private double side;
	public Square(double side) {
		this.side = side;
	}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return side * side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	
}
