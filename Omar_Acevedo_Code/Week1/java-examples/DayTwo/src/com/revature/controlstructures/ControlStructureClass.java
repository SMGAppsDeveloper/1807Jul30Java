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
