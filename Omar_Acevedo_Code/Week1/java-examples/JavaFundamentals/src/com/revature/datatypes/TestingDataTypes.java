package com.revature.datatypes;
import com.revature.helpers.HelperFunctions;

public class TestingDataTypes extends HelperFunctions {
	public static void main(String[] args) {
		
		char charAsNum = 100;
		print("charAsNum is -> " + charAsNum);
		
		int toChar = 80;
		char c = (char)toChar;
		print("The character is -> " + c);
		
		short isShort = 10;
		int shortAsInt = isShort;
		
		int notShort = 10_000_000;
		short sh = (short) notShort;
		print("Casted int 10,000,000 to short -> " + sh);
	
		// non decimal number representations
		
		// Decimal - base 10
		int decimal = 10;
		
		// Binary - base 2
		int binary = 1001010110;
		print("binary -> " + binary);
		
		int binary_withAB = 0B001010110;
		print("binary with a B -> " + binary_withAB);
		
		// Octal - base 8 / 0-7
		int octal = 107624;
		print("octal -> " + octal);

		// Octal - base 8 / 0-7
		int hex = 0xa388db;
		print("hex -> " + hex);
		
	}
	
}
