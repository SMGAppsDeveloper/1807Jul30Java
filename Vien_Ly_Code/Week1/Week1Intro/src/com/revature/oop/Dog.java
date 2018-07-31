package com.revature.oop;

public class Dog extends Pet {

	private String breed;
	
	public Dog(int weight, String breed) {
		super("Good Boy", weight);
		this.breed = breed;
	}
	
	public Dog(String name, int weight, String breed) {
		super(name, weight);
		this.breed = breed;
	}
	
	@Override
	public void makeSound() {
		System.out.println("Woof");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

}
