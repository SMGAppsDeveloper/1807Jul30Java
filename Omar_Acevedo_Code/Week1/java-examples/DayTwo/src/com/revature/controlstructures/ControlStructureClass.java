package com.revature.controlstructures;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.revature.helpers.HelperFunctions;

public class ControlStructureClass extends HelperFunctions {

	private static Map<String, Integer> myMap = new HashMap<>();
	private static String myString;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int howManyTimes = 10;
		
		populateList(howManyTimes);
		showList();
		
	}

	private static void populateList(int count) {
		int justAnInt = 1;
		for ( int i = 0; i < count; i++ ) {	
			myString = convertValueStr(i);
			justAnInt *= 2;
			myMap.put(myString, justAnInt);
		}
		
		
		int x = 0;	// declare and init x with 0
		for (;x<10;) {
			if ( x % 2 == 0) x++;
			else x += 2;
			print(x);
		}
		
		print("----------------");
		
		String[] words = {"Hello", "there", "you"};
		
		for (int i = 0; i < words.length; i++) {
			print(words[i]);
		}
		
		print("----------------");
		
		for (String word : words) {
			print(words + ": " + word);
		}
		
		print("----------------");
		
		while ( count <= 30 ) {
			print("while count (" + count + " <= " + count + " is true");
			count++;
		}
		
		print("----------------");
		
		switch (count) {
			case 1:
				print("Number in switch is -> " + count);
				break;
			case 10:
				print("Number in switch is -> " + count);
				break;
			case 20:
				print("Number in switch is -> " + count);
				break;
			case 30:
				print("Number in switch is -> " + count);
				break;
			default:
				print("sooo... -> " + count);
				break;
		}
		
		print("----------------");
		
	}
	
	private static void showList() {
		for (Map.Entry<String, Integer> myMap : myMap.entrySet()) {
			print(myMap.getKey() + " -> " + myMap.getValue());
		}
	}
	
	private static String convertValueStr(int p_count) {
		String myString = "index_" + p_count;
		return myString;
	}

}
