import java.util.Scanner;

public class FizzBuzzProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.out.println("Please enter a number:");
		
		Scanner scanner = new Scanner(System.in);
		
		int lastNumber = scanner.nextInt();*/
		
		String scanner = args[0];
		
		int lastNumber = Integer.parseInt(scanner);
		
		for (int i = 1; i <= lastNumber; i++) {
			if (i%3 == 0 && i%5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if (i%3 == 0) {
				System.out.println("Fizz");
			}
			else if (i%5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}

	}

}
