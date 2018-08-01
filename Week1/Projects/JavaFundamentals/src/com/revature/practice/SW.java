package com.revature.practice;

//abstraction
public abstract class SW {
	
		//encapsulation
		private String type;
		private int speed;
		private int attack;
		private int health;
		
		public SW(String type, int speed, int attack, int health) {
			System.out.println("Constructor a SW monster");
			this.type = type;
			this.speed = speed;
			this.attack = attack;
			this.health = health;
		}
		
		public void showBaseSpeed() {
			System.out.println(type + "has a base speed of" + speed);
		}
		public String getType() {
			return type;
		}
		
		public int getSpeed() {
			return speed;
		}
		
		public int getAttack() {
			return attack;
		}
		
		public int getHealth() {
			return health;
		}
		
	
		
		
	

}
