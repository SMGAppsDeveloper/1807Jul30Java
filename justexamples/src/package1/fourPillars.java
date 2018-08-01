package package1;

public class fourPillars {
	
public void polyOverload(int i) {
	System.out.println(i);
}
	
public void polyOverload(char c) {
	System.out.println(c);
}
	

	
public static void main(String[] args) {
	
	fourPillars fp = new fourPillars();
	
	int thing1 = 13;
	char thing2 = 'q';
	
	fp.polyOverload(thing2);
	
	
}

}
