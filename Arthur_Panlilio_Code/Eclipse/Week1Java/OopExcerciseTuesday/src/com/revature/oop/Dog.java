package com.revature.oop;

public class Dog extends Animal {

	public Dog(String theName, int theAge) {
		super(theName, theAge);
	}
	
	@Override
	public void eat() {
		System.out.println("My name is " + getName() + " and I eat dog food!");
	}
	
	public void bark() {
		System.out.println(getName() + ": Arf Arf!");
	}

}
