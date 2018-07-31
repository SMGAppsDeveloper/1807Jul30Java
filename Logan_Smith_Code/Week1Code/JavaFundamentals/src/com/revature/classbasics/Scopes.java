package com.revature.classbasics;

public class Scopes {

	/*
	 * Scopes:
	 * Class/Static: Static entity. Does not need to be instanced. Accessible anywhere. Shared through all of class.
	 * Object/Instance: the object's fields/state. Accessible by instance.
	 * Method: Exists within method
	 * Loop/Block: Exists within loop or block
	 * 
	 * 
	 */
	
	int age;
	String name;
	static int count = 0;
	
	public Scopes() {
		count++;
	}
	
	public static void main (String args[]) {
		Scopes s = new Scopes();
		s.doNothing();
	}
	
	static void doNothing() {
		//test();
	}
	
	void test() {
		doNothing();
	}
	
	
}
