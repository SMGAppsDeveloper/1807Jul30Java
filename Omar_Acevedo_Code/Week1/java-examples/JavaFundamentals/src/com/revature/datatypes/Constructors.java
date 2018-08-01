package com.revature.datatypes;

public class Constructors {
	/*
	 *	A constructor is a special method in java
	 *	used to CONSTRUCT or create a new instance
	 *	of the class it is found in
	 *	it must have the same name as the class
	 *	it does not have a return type
	 *	it can be overloaded
	 *	the first line, whether implicitly or explicitly,
	 *	is ALWAYS a call to another constructor -- either
	 *	this() (calling another constructor of the same class) or 
	 *	super() (calls its superclass's constructor
	 *	. if there is no class that said class extends
	 *	...
	 */
	
	String name;
	int age;
	String email;
	String hairColor;
	
	// no args constructor
//	public Constructors() {}
	
	// no args constructor
	public Constructors() {
		this("testUser", 0, "dummy@email.com", "color");
	}
	
	public Constructors(String name) {
		this(name, 20, "test@mail.com", "brown");
	}
	
	public Constructors(String name, int age, String email, String hairColor) {
//		super();	// Not really needed (implicitly created), but 
					// but if written, then it NEEDS to be the first line.
		this.name = name;
		this.age = age;
		this.email = email;
		this.hairColor = hairColor;
	}
	
//	 Constructors c = new Constructors();
	
}
