public class FizzBuzz{
	public static void main(String[] args){
		String phrase = "";
		final int n = (args.length == 0)? 100 : Integer.parseInt(args[0]);
		for(int i = 1; i <= n; i++){
			if(i % 3 == 0) phrase += "Fizz";
			if(i % 5 == 0) phrase += "Buzz";
			System.out.println(phrase.isEmpty()? Integer.toString(i) : phrase);
			phrase = "";
		}
	}
}