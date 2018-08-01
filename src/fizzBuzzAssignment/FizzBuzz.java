package fizzBuzzAssignment;

public class FizzBuzz {

	public static void main(String[] args) {
		
		FizzBuzz();		
	}
	
	public static void FizzBuzz() {
		for(int i = 0; i <= 100; i++) {
			if(i%15 == 0) {
				System.out.println("FizzBuzz\t");
				i++;
			}
			else if(i%3 == 0) {
				System.out.println("Fizz\t");
				i++;
			}
			else if(i%5 == 0) {
				System.out.println("Buzz\t");
				i++;
			}
			else {
				System.out.println(i +"\t");
				i++;
			}
		}
	}

}
