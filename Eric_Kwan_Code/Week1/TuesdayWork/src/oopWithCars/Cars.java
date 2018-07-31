package oopWithCars;

public abstract class Cars {
	String engine;
	String owner;
	String color;
	
	public abstract String getEngine();
	
	public abstract void setEngine(String newEngine);
	
	public abstract String getColor();
	
	public abstract void setColor(String newColor);
	
	public abstract String getOwner();
	
	public abstract void setOwner(String newOwner);
	
	public int getAcceleration() {
		return 10;
	}
	
	}
