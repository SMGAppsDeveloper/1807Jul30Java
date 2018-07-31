package com.revature.fourpillarsofoop;

public abstract class Human {

	String Name;
	int Age;

	public void sayName() {
		System.out.println("My name is " + Name);
	}

	public void sayAge() {
		System.out.println("My age is " + this.Age);
	}

	public abstract void dothings();

}
