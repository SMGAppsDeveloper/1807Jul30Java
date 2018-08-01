package oopPillers;

public class Honda extends Automobile{

	public Honda() {
		
	}

	public void drive() {
		System.out.println("I am driving honda");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * This is the properties and methods of class Automobile 
		 * inherited to Honda class
		 */
		Automobile honda = new Honda();
		honda.setMake("Honda");
		honda.setModel("Accord");
		honda.setYear(2018);
		honda.setPrice("$25,000");
		System.out.println("Make: " + honda.getMake() + "\n" +
							"Model: " + honda.getModel() + "\n" +
							"Year: " + honda.getYear() + "\n" + 
							"Price: " + honda.getPrice());
		honda.drive();
	}

}
