package oopPillers;

public class ImplimentAreaCalculation {

	public static void main(String[] args) {
		CalculateArea ca = new CalculateArea();
		
		int circleArea = ca.CalculateCirlceArea(15);
		System.out.println("The Area of a circle = " + circleArea);
		
		int rectagleArea = ca.CalculateRectangleArea(25, 5);
		System.out.println("The Area of a rectangle = " + rectagleArea);
	}
}
