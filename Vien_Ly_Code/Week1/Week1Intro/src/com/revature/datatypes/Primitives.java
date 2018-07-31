package com.revature.datatypes;

public class Primitives {
/*
 * Java has 8 primitive datatypes, which represent raw data
 * in an organized form. 
 * int, boolean, byte, char, short, double, long, float
 * 
 * When a number/string/array/etc is actually written out, 
 * it is called a literal
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var; //declaring variable
		var = 5; //intializing variable 
		var = 10; // reassigning variable 
		
		
		int x = 10; // declaring AND initializing var
		x = 100; //cannot declare the same var twice in the same scope
		
		char ch = 'a';
		
		char charAsNum = 100;
		//System.out.println(charAsNum);
		
		int toChar = 80;
		char c = (char) toChar;
		
		//System.out.println(c);
		

		//non decimal number representation
		//binary
		int binary = 0b011101;
		System.out.println(binary);
		
		//hex
		int hex = 0x2F02A;
		System.out.println(hex);
		
		//octal
		int oct = 01020316;
		System.out.println(oct);
		
		//WRAPPER CLASS
	}

}