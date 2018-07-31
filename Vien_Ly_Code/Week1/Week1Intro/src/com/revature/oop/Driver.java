package com.revature.oop;

public class Driver {

	public static void main(String[] args) {
		Circle testCi = new Circle(5.0);
		System.out.println(testCi.calculateArea());
		
		Square testSq = new Square(5.0);
		System.out.println(testSq.calculateArea());
		
		Cat kitty1 = new Cat("kitty #1", 10, "calico");
		kitty1.printInfo();
		kitty1.makeSound();
		
		Dog puppy1 = new Dog(20, "German Shepherd");
		puppy1.printInfo();
		Pet.feed(puppy1, 10);
		puppy1.makeSound(5);
		puppy1.printInfo();
	}

}
