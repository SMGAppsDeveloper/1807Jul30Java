package oopPillers;

public class CalculateArea {
	private int Lenght;
	private int Width;
	private int Radious;
	
	public CalculateArea() {
		
	}
	
	public int getLenght() {
		return Lenght;
	}

	public void setLenght(int lenght) {
		Lenght = lenght;
	}

	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	}

	public int getRadious() {
		return Radious;
	}

	public void setRadious(int radious) {
		Radious = radious;
	}

	public CalculateArea(int lenght, int width, int radious) {
		super();
		Lenght = lenght;
		Width = width;
		Radious = radious;
	}

	public int CalculateRectangleArea(int len, int width) {
		int Area = 0;
		Area = len * width;
		return Area;
	}
	
	public int CalculateCirlceArea(int radious) {
		int Area = 0; 
		Area = (int)Math.PI * (radious * radious);
		
		return Area;
	}
	
	
}
