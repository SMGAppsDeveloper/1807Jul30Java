package com.revature.datatypes;

public class Primitives {

	
	/**
	 * Primitive Data Types
	 * -int
	 * -boolean
	 * -byte
	 * -char
	 * -double
	 * -long
	 * -float
	 * -short
	 * 
	 * When a number/string/array is written, it is called a literal
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a; //declaring
		a = 5; //initializing
		a = 10; //reassigning
		
		int convertable = 25;
		
		double converted = (int) convertable;
		
		short converteded = (short) converted;
		
		long convertededed = (long) converteded;
		
		float convertedededed = (float) convertededed;
		
		System.out.println(convertedededed);
		
		char mander = 'a';
		
		int meleon = (int) mander;
		
		int safety = 100_100_100;
		
		long tooLong = 10000000000l;
		
		int binary = 0B101001;
		
		// Octal: 0-7
		
		int octal = 0107264;
		
		//Hexadecimal: 0-f
		
		int hex = 0xa3f82;
		
		System.out.println(meleon);

	}

}
