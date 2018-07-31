package examples.ex.primitives;

public class TestingDataTypes {
	public static void main(String[] args) {
		
		char charAsNum = 100;
		System.out.println("charAsNum is -> " + charAsNum);
		
		int toChar = 80;
		char c = (char)toChar;
		System.out.println("The character is -> " + c);
		
		short isShort = 10;
		int shortAsInt = isShort;
		
		int notShort = 10_000_000;
		short sh = (short) notShort;
		System.out.println("Casted int 10,000,000 to short -> " + sh);
	
		// non decimal number representations
		
		
	}
}
