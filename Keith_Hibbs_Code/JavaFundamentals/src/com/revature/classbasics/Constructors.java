package com.revature.classbasics;

public class Constructors {

	
	String name;
	int age;
	String email;
	String hairColor;
	
	public Constructors() {}
	
	public Constructors(String name) {
		this(name, 20, "tst@gmail.com","brown");
	}
	
	public Constructors(String name, int age, String email, String hairColor) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.hairColor = hairColor;
	}

	public static void main(String[] args) {

	
		
//		public Constructors(String nae, int age, String email, String hairColor) {
			
//		}
		
	}

}
