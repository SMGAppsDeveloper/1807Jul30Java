package com.revature.datatypes;

public class Wrappers {
	
	public static void main(String[] args) {
		
		/* Primitives and their Wrappers
		 * int - 4 bytes - Integer
		 * char - 2 bytes - Character
		 * boolean
		 * double
		 * long
		 * float
		 * short
		 * byte
		 */
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		int five = Integer.parseInt("5");
		
		Integer i = new Integer(80); //boxing
		int eighty = i; //unboxing 
		
		int x = 10;
		Integer wrapped = x; //autoboxing
	}
}
