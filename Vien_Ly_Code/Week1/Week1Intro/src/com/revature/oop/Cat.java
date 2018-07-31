package com.revature.oop;

public class Cat extends Pet {

	private String breed;
	
	public Cat(String name, int weight, String breed) {
		super(name, weight);
		this.breed = breed;
	}
	
	@Override
	public void makeSound() {
		System.out.println(this.name + " says meow");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	@Override
	public void printInfo() {
		System.out.println(this.name + " is a " + this.weight + " lbs " + this.breed);
	}

}
