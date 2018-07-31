package com.revature.oop;

public abstract class Pet {
	private String name;
	private int weight;
	
	public Pet(int weight) {
		this.name = "Good boy";
		this.weight = weight;
	}
	
	public Pet(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public abstract void makeSound();
	
	public void feed(int foodAmount) {
		this.weight += foodAmount;
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

