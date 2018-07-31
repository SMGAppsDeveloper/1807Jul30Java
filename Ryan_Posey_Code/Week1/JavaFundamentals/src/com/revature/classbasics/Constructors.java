package com.revature.classbasics;

public class Constructors {
	/* 
	 * -A constructor is a special method in java
	 * used to construct or create a new instance
	 * of the class it is found in.
	 * -It must have the same name as the class.
	 * -It does not have a return type.
	 * -It can be overloaded.
	 * -The first line, whether implicitly or explicitly
	 * is always a call to another constructor -- either
	 * this() (calling another constructor of the same class)
	 * or super() (calls its superclass's constructor.
	 * If there is no class that said class extends
	 * explicitly, it is calling the Object class's constructor.)
	 * -If you do not explicitly call either this() or super(),
	 * JVM interprets the first line as super() implicitly
	 * regardless of if you explicitly create a constructor or
	 * not, there is always a constructor in every concrete class.
	 * It is called the default constructor, and looks like the 
	 * "no-args" constructor, but disappears as soon as a 
	 * constructor is explicitly created.
	 */
	
	//dummy instance vars:
	String name;
	int age;
	String email;
	String hairColor;
	
	// no args constructor
	public Constructors() {
		this("testUser", 0, "dummy@email.com", "color");
	}
	
	public Constructors(String name){
		this(name,20,"test@gmail.com", "brown");
	}
	
	public Constructors(String name, int age, String email, String hairColor) {
		// super not explicitly necessary, but must be called first if it is
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.hairColor = hairColor;
	}
	
	//Constructors c = new Constructors();
}
