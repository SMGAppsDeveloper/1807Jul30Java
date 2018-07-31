package com.revature.fourpillarsofoop;

public class Child extends Human implements FirstWorldPeople {

	public Child(String name, int age) {
		this.Name = name;
		this.Age = age;
	}

	public static void eat(String a) {
		System.out.println("Child Eats " + a);
	}

	public static void eat(String a, String b) {
		System.out.println("Child Eats " + a + "and + b");
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public void dothings() {

		System.out.println(this.Name + " did things like a Child");


	}

	@Override
	public void useIPhone() {
		System.out.println(this.Name + " used child phone");

	}

}
