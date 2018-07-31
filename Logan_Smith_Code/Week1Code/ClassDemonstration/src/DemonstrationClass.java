
public class DemonstrationClass {

	public static void main(String args[]) {
		
		// Loop demonstration!
		int looper = 0;
		int[] loopers = new int[10];
		
		// The For Loop. All values are declared in loop!
		
		for (int i = 0; i < 10; i++) {
			System.out.println("This is i right now: " + i);
		}
		
		// The Foreach Loop. Loops over an array! (All 0 because it is not defined)
		
		for (int i: loopers) {
			System.out.println("This is i right now: " + i);
		}
		
		// The While Loop (my favorite). Continues as long as the condition is true!
		
		while (looper < 10) {
			System.out.println("This is i right now: " + looper);
			looper++;
		}
		looper = 0;
		
		// Do-While. Similar to while loop, but just in a different order.
		
		do {
			System.out.println("This is i right now: " + looper);
			looper++;
		} while (looper < 10);
		
		// If statement. Do something if this condition is true.
		
		if (looper == 10) {
			System.out.println("It's 10!");
		}
		
		// The else statement. Do something if something else is not true.
		
		if (looper == 0) {
			System.out.println("Wow! This is wrong!");
		}
		else {
			System.out.println("Wow! This is right!");
		}
		
		// The else if statement. Do something if this condition is right and it hasn't caught an above condition.
		
		if (looper == 0) {
			System.out.println("Wow! This is wrong!");
		}
		else if (looper == 10) {
			System.out.println("Wow! This is right!");
		}
		else {
			System.out.println("Wow! This is wrong!");
		}
		
		// The switch statement. Evaluates each case base on one value!
		
		switch (looper) {
		
		case 0: System.out.println("Wow! This is wrong!");
			break;
		case 5: System.out.println("Wow! This is wrong!");
			break;
		case 10: System.out.println("Wow! This is right!");
			break;
		default: System.out.println("Wow! This is wrong!");
			break;
		}
		
		// This is a break and a continue! The break ends the loop, while the continue moves to the top of the loop!
		
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue;
			}
			else if (i == 8) {
				break;
			}
			System.out.println("This is i right now: " + i);
		}
		
	}
	
}
