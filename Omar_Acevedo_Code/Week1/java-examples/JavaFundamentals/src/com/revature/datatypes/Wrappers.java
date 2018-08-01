package com.revature.datatypes;
import com.revature.helpers.HelperFunctions;

public class Wrappers extends HelperFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print(Integer.MAX_VALUE);
		print(Long.MAX_VALUE);
		
		Integer i = new Integer(80);
		int eighty = i; // unboxing
		
		int x = 10;
		Integer wrapped = x; // autoboxing
		
			
	}

}
