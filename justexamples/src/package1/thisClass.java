package package1;

public class thisClass {

	public static void main(String[] args) {
		tuesdayexamples ex = new tuesdayexamples();
		
		//This one will work:
		System.out.println(ex.visibleString);
		
		//This one will work with a getter
		System.out.println(ex.getInvisibleString());

	}

}
