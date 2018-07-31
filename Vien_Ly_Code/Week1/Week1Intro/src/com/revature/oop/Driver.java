package com.revature.oop;

public class Driver {

	public static void main(String[] args) {
		Circle testCi = new Circle(5.0);
		System.out.println(testCi.calculateArea());
		
		Square testSq = new Square(5.0);
		System.out.println(testSq.calculateArea());
		
		Cat kitty1 = new Cat("kitty #1", 10, "calico");
		System.out.println(kitty1.getName() + " is a " + kitty1.getWeight() + " lbs " + kitty1.getBreed());
		kitty1.makeSound();
		
		Dog puppy1 = new Dog(20, "German Shepherd");
		System.out.println(puppy1.getName() + " is a " + puppy1.getWeight() + " lbs " + puppy1.getBreed());

		puppy1.makeSound(20);
	}

}
