package com.revature.oop;

public abstract class Pet {
	protected String name;
	protected int weight;
	
	public Pet(int weight) {
		this.name = "Good boy";
		this.weight = weight;
	}
	
	public Pet(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public abstract void makeSound();
	public abstract void printInfo(); //abstract method because different pets might have different state variables
	
	public static void feed(Pet pet, int foodAmount) {
		System.out.println("you fed " + pet.getName() + " " + foodAmount + " lbs of pet foods");
		pet.weight += foodAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}

