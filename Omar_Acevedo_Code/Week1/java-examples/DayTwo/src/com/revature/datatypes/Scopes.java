package com.revature.datatypes;
import com.revature.helpers.HelperFunctions;

public class Scopes extends HelperFunctions {

	/**
	 * Scopes
	 * The lifetime of a variable
	 * There are four different scopes in java
	 * Class/Static = This is what we usually mean bye global
	 * 	Static entities(vars, methods, nested classes) are
	 * 	accessible from outside of the class WITHOUT and instance
	 * 	ie. Class.x or Class.method();
	 * 	Re static variables, these variables are SHARED throughout
	 * 	all instances of the class.
	 *	Class c = new Class();
	 *	Class c2 = new Class();
	 *	c.x == c2.x // true
	 * 
	 * Object/Instance = the object's fields/state
	 * 	Entities in this scope can only be accessed b an instance
	 * 	of the object they belong to.
	 * 	ie. Class c = new Class();
	 * 		c.x or c.method()
	 * 		NOT Class.method(); . this would be a static method
	 * 
	 * Method = mostly parameters and any variables defined at the method level
	 * 	Variables in this scope exist for the lifetime of a method
	 * 
	 * Loop/Block = any variables defined within curly braces
	 * 
	 * @param args
	 */
	
	int age;
	String name;
	static int count = 0;
	
	public Scopes() {
		count++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	static void doThings() {
		main(new String[0]);
	}

}
