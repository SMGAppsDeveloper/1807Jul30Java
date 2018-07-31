public class FizzBuzz {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        */
        String input = args[0];
        int n = Integer.parseInt(input);
        
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}