package loopsAssignment;

public class WhileAndDoWhileLoops {
	 public static void main(String[] args) {
		 int customerID = 1001;
		 while(customerID <= 1001) {
			 System.out.println(customerID);
			 customerID++;
		 }
		 
		 do{
			 System.out.println("I run at list at once int this loop: " + customerID);
			 customerID++;
		 }while(customerID <= 1002);
	 }
}
