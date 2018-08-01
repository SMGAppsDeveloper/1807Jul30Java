package package1;

public class fish extends animal {
	
	public void whoAreYou(String args) {
		System.out.println("I am a fish");
	}

	public static void main(String[] args) {
		
		fish fishy = new fish();
		
		fishy.whoAreYou("abc");
		fishy.swims();

	}

}
