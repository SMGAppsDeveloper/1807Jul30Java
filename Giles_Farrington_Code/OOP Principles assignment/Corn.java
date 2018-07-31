package com.revature.assignments;

public class Corn implements Vegetable {

	private int age;
	private String name;
	private int lastFed;
	private int lastWatered;
	private boolean alive;
	
	public int getLastWatered() {
		return lastWatered;
	}

	public void setLastWatered(int lastWatered) {
		this.lastWatered = lastWatered;
	}

	public int getLastFed() {
		return lastFed;
	}

	public void setLastFed(int lastFed) {
		this.lastFed = lastFed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	
	@Override
	public void waterPlant() {
		if(lastWatered >= 10) {
			System.out.println("Plant Watered");
			lastWatered = 0;
		}

	}

	@Override
	public void feedPlant() {
		if(lastFed >= 3) {
			System.out.println("Plant fed");
			lastFed = 0;
		}

	}

	@Override
	public void plantSeed() {
		System.out.println("Seed Planted");
		age = 0;
		setAlive(true);

	}

	@Override
	public boolean readyToHarvest() {
		if(age >= 45) {
			System.out.println("Plant harvested");
			setAlive(false);
			return true;
		}
		else {
			return false;
		}
		
	}

}
