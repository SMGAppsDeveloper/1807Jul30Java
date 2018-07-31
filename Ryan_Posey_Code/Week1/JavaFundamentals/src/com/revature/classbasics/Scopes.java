package com.revature.classbasics;

public class Scopes {
	/* Scopes
	 * The lifetime of a variable
	 * Class/Static = This is what we usually mean by global
	 * 		Static entities(vars, methods, nested classes) are
	 * 		accessible from outside of the class WITHOUT an instance
	 * 		ie. Class.X or Class.main()
	 * 		Re: static variables, these variables are SHARED throughout
	 * 		all instances of the class
	 * 		Class c = new Class();
	 * 		Class c2 = new Class();
	 * 		c.x == c2.x // true
	 * 
	 * Object/Instance = the object's fields/state
	 * 		Entities in this scope can only be accessed by an instance
	 * 		of the object they belong to.
	 * 		ie. Class C = new Class();
	 * 			c.x or c.method()
	 * 			NOT Class.method(); . This will be a static method
	 * 
	 * Method = mostly parameters and any variables defined at the method
	 * 		Variables in this scope exist for the lifetime of a method
	 * 
	 * Loop/Block = any variables defined within curly braces
	 * 
	 * 
	 * 
	 * 
	 * We CAN access static variables and methods from an instance
	 * of an object
	 * We CANNOT access instance variables and methods from class alone
	 * 
	 * class A {
	 * 	static int count;
	 * 	int age;
	 * }
	 * 
	 * class B {
	 * 	main {
	 * 		A.count; //valid because count is static;
	 * 		A a = new A; //create INSTANCE of A aka INSTANTIATE A
	 * 		a.age; //valid because age is instance variable
	 * 		a.count; //valid because a is an instance of class A to which count belongs
	 * 		A.age; // NOT VALID NO DONT DO THIS WILL NOT COMPILE
	 * 	}
	 * }
	 */
	
	int age;
	String name;
	
	static Integer integer;
	static boolean b;
	static short s;
	static char ch;
	static long l;
	static float f;
	static byte by;
	
	public static void main(String[] args) {
		System.out.println("Integer default: " + integer);
		System.out.println("boolean: " + b);	
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
