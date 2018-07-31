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
	 */
	
	int age;
	String name;
	static int count = 0;
	
	public Scopes() {
		//constructor.. will discuss later
		count++;
	}
	
	public static void main(String[] args) {
		Integer num = new Integer(5);
		Integer x = new Integer(159109);
		System.out.println(num.MAX_VALUE == x.MAX_VALUE);
		
		Scopes s = new Scopes();
		s.age = 16;
		s.doThings();
	}
	
	static void doThings() {
		
	}
}
