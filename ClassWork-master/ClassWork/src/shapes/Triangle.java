package shapes;

public class Triangle implements Shape{
	
	private int height;
	private int base;
	
	public Triangle(int height, int base) {
		this.height = height;
		this.base = base;
	}

	public double calculateArea() {
		return (this.height * this.base) / 2;
	}

	public double calculatePerimeter() {
		return this.base * 3;
	}
	
	public String toString() {
		// To be written by student
		return "Equalateral Triangle height: " + height + " Equalateral Triangle base: " + base + " Equalateral Triangle area: " + calculateArea() + " Equalateral Triangle perimeter: " + calculatePerimeter();
	}

}
