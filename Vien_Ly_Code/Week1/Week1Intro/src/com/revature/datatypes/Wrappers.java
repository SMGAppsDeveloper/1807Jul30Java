package com.revature.datatypes;

public class Wrappers {
	public static void main(String[] args) {
		/* Primitives and their Wrappers
		 * int - 4 bytes - Integer
		 * char - 2 - Character
		 * boolean - 1 bit - Boolean
		 * double - 8 - Double
		 * long - 8 - Long
		 * float - 4 - Float
		 * short - 2 - Short
		 * byte - 1 - Byte
		 */
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		int five = Integer.parseInt("5");
		System.out.println(five);
		
		Integer i = new Integer(10);
		int ten = i; // unboxing
		Integer wrappedTen = ten; // autoboxing
		System.out.println(i);
		System.out.println(ten);
	}
}
