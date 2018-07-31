package com.revature.classbasics;

public class Scopes {
	/* Scopes
	 * lifetime of a variable
	 * 4 different scopes
	 * class/static
	 * 		accessible from outside of class without an instance
	 * 		Class.x
	 * 		Class.method();
	 * 		shared throughout all instances of the class
	 * 		Class c = new Class();
	 * 		Class c2 = new Class();
	 * 		c.x == c2.x //true
	 * 
	 * object/instance -- object's fields/states
	 *		accessible by an instance of the object they belong to
	 *		Class c = new Class();
	 *		c.x or c.y 		
	 * method
	 * 		exists for the lifetime of a method
	 * loop/block
	 * 		
	 */
	
	int age;
	String name;
	
	static Integer integer;
	static double d;
	static int count;
	static boolean b;
	static short s; 
	public static void main(String[] args) {

	}
	

}
