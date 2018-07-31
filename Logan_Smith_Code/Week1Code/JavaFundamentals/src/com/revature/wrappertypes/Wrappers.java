package com.revature.wrappertypes;

public class Wrappers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		* -Integer
		* -Boolean
		* -Byte
		* -Char
		* -Double
		* -Long
		* -Float
		* -Short
		* -String
		* 
		* 
		*/
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		int five = Integer.parseInt("5");
		
		Integer i = new Integer(80);
		int eighty = i; //unboxing
		
		int x = 0;
		Integer wrapped = x; //autoboxing
		
	}

}
