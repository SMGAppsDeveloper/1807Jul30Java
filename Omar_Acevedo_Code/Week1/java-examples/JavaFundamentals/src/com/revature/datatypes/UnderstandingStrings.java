package com.revature.datatypes;
import com.revature.helpers.HelperFunctions;

public class UnderstandingStrings extends HelperFunctions {
	public static void main(String[] args) {
		String a = "hello";
		String b = new String("hello");
		String c = new String();
		String d = "";
		
		print( a == b );
		print( c == null );
		print( d == "" );
		print( d.equals(""));
		print( c.equals(new String("")) );
		
		String conc = a + b;
		conc = conc + 100;
		print(conc);
		
		conc = conc.concat("more things");
		print(conc);
		
		StringBuilder sbuild = new StringBuilder("hello");
		sbuild.append(" world");
		print(sbuild);
		
		sbuild.reverse();
		print(sbuild);
		
		StringBuffer sbuff = new StringBuffer(conc);
		print(sbuff);
		
//		StringBuffer a = "hola";  // not possible .. not valid; throws error
		
	}
}