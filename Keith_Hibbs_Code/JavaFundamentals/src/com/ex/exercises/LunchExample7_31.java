package com.ex.exercises;

public class LunchExample7_31 {

	public static void main(String[] args) {
		String num = args[0];
		int n = Integer.parseInt(num);
		String mon;
		//for loop with if/elseif/else
		for (int i = 1; i<n+1 ;i++) {
			if (i%15 == 0) System.out.println("FizzBuzz");
			else if (i%5 == 0) System.out.println("Buzz");
			else if (i%3 == 0) System.out.println("Fizz");
			else System.out.println(i);}
		int x = n;
//		while example if/else
		while (n >2) {n = n/2;}
			if (n==2) {
				System.out.println("Even");
			} else System.out.println("Odd");
	// do while and switch example		
do {switch (x) {
	case 1: mon = "Jan";
	break;
	case 2: mon = "Feb";
	break;
	case 3: mon = "Mar";
	break;
	case 4: mon = "Apr";
	break;
	case 5: mon = "May";
	break;
	case 6: mon = "Jun";
	break;
	case 7: mon = "Jul";
	break;
	case 8: mon = "Aug";
	break;
	case 9: mon = "Sep";
	break;
	case 10: mon = "Oct";
	break;
	case 11: mon = "Nov";
	break;
	case 12: mon = "Dec";
	break;
	default: mon = "error";
}System.out.println(mon);
x=(x-1);
}while (x >=1);

String days[] = new String[7];
days[0] = "Sunday";
days[1] = "Monday";
days[2] = "Tuesdayday";
days[3] = "Wednesday";
days[4] = "Thursday";
days[5] = "Friday";
days[6] = "Saturday";
//Enhanced for loop
for (String d :days ) {
	System.out.print(d);
}
	
}
}

