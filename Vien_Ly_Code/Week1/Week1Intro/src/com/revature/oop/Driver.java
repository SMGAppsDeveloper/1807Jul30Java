package com.revature.oop;

public class Driver {

	public static void main(String[] args) {
		Circle testCi = new Circle(5.0);
		System.out.println(testCi.calculateArea());
		
		Square testSq = new Square(5.0);
		System.out.println(testSq.calculateArea());
	}

}
