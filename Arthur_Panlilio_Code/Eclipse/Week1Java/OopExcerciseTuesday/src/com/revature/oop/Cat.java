package com.revature.oop;

public class Cat extends Animal {

	public Cat(String theName, int theAge) {
		super(theName, theAge);
	}
	
	@Override
	public void eat() {
		System.out.println("My name is " + getName() + " and I eat rats, birds, and fish!");
	}
	
	public void meow() {
		System.out.println(getName() + ": meow meow!");
	}

}
