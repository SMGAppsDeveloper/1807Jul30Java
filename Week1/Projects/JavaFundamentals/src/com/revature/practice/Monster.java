package com.revature.practice;

//inheritance
public class Monster extends SW{ 

	
		public Monster(String type, int speed, int attack, int health) {
		super(type, speed, attack, health);
		// TODO Auto-generated constructor stub
	}
		int baseSpeed = 100;
		//polymorphism (override) because there is the same command in the SW parent class
		public void showBaseSpeed() {
		System.out.println("Taor has a base speed of" + baseSpeed);	
		}

}
