package package1;

public class cat extends animal {

	public void swims() {
		
		/*swims method overrides inherited swims 
		method from superclass animal*/
		System.out.println("I don't swim");
		
	}
	
	public void whoAreYou(String args) {
		System.out.println("I am a cat");
	}
	
	public static void main(String[] args) {
		
		cat catso = new cat();
		
		catso.whoAreYou("abc");
		catso.swims();

	}

}