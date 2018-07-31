package com.revature.datatypes;

public class StringExamples {

	public static void main(String[] args) {
		String a = new String();
		System.out.println(a == null); //false
		System.out.println(a == ""); //false
		System.out.println(a.equals(new String(""))); //true
		
		String b = "hello";
		String c = " world";
		
		String conc = b + c;
		conc.concat("more stuff");
		System.out.println(conc);
		
		StringBuffer sbuff = new StringBuffer("asdasd");
		System.out.println(sbuff);
	}

}
