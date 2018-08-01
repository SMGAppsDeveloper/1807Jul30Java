package oopPillers;

public class Automobile {
	private int Year;
	private String Model;
	private String Make;
	private String Price;
	
	public Automobile() {
		
	}
	public void drive() {
		System.out.println("I am driving automobile.");
	}
	public Automobile(int year, String model, String make, String price) {
		super();
		Year = year;
		Model = model;
		Make = make;
		Price = price;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	
	
}
