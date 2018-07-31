package com.revature.fourpillarsofoop;

import java.util.ArrayList;

public class Parent extends Human implements FirstWorldPeople {

	private int SSN = 100;

	public Parent(String name, int age) {
		this.Name = name;
		this.Age = age;
	}

	public static void eat(String a) {
		System.out.println("Parent eats " + a);
	}

	public void dothings() {
		System.out.println(this.Name + " did things like a Parent");
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	public void useIPhone() {
		System.out.println(this.Name + " used phone");
	}

	public static void main(String[] args) {

		Parent p1 = new Parent("Bill", 40);
		Parent p2 = new Parent("Pete", 30);
		Parent p3 = new Parent("John", 25);
		Child c1 = new Child("Timmy", 5);
		

		ArrayList<Parent> Parents = new ArrayList<>();
		Parents.add(p1);
		Parents.add(p2);
		Parents.add(p3);
		
		c1.dothings();
		p1.dothings();
		c1.sayName();
		c1.sayAge();
		p1.sayName();
		p1.sayAge();
		p1.useIPhone();
		c1.useIPhone();

		
		
	}
}
