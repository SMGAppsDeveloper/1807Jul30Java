package com.revature.datatypes;

public class Primitives {

	public static void main(String[] args) {
		int var; //declaring variable
		var = 5; //initializing variable
		var = 10; //reasigning variable
		
		int x = 10; // declaring and initializing var
				x = 100;  //cannot declare the same var twice in the same scope
				
				char ch = 'a';
				
				int num = 0;
				int $dolla = 50;
				
				boolean namingConventionIsCamelCase = true;
				
				double riches = 10_141_400.99;
						int million = 1_000_000;
				//number literals are interpreted as ints. must specify L or l 
						long longNum = 100000000000000L;
				

						// Casting
						// - to change the reference type of an entirty
	
						//decimal is base 10
						int decimal = 10;
						//binary base 2
						int binary = 0B01001100;
						System.out.println(binary);
						
						//octal base 8 /0-7
						int octal = 0107624;
						System.out.println(octal);
	
	//Hexadecimal -base 16 / 0-9,af
						int hex = 0xa3f19d2b;
						System.out.println(hex);
	}}