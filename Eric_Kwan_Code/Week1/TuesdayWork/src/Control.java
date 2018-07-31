
/*
 * for(;;){
 * }
 * 
 *Switch statements can only take in String, int, short, byte, char and their wrapped classes.
 *No objects, long, lists, etc.
 *Do while always runs through once then checks condition even when condition is false. 
 *While checks condition first so may not run at all.
 *
 */

public class Control {
	public static void main(String[] args) {
		int num = 10;
		System.out.println("Stored number is initially: " + num);
		if(num == 0){
			System.out.println("stored number is zero");
		}else {	
			int[] numArr = {0,1,2,3,4};
			int[] Arr = {12,34,23,14,54};
			for(int i:numArr) {
				Arr[i] = Arr[i] + 2;
			}
			for(int i = 0; i<Arr.length; i++){
				 System.out.print(Arr[i] + " ");;
			}
			if(Arr[0]%2 == 0 && Arr[4] % 2 == 0) {
				System.out.println("\nThe first and the last elements in the array are even");
			}else if(Arr[0]%2 == 0) {
				System.out.println("\nThe first element in the array is even and the last is not");
			}else if(Arr[4] % 2 == 0) {
				System.out.println("\nThe last element in the array is even and the first is not");
			}else {
				System.out.println("\nThe first and the last elements in the array are odd");
			}
			System.out.println(num);
			while(num > 0){
				num--;
			}
			do {
				num++;
			}while(num<2);
			switch(num) {
			case 1: System.out.println("Stored number is now: " + num + " after running through while and do-while loops");
				break;

			case 2: System.out.println("Stored number is now: " + num + " after running through while and do-while loops");
				break;

			case 3: System.out.println("Stored number is now: " + num + " after running through while and do-while loops");
				break;
			}
		}
		}
}