package shapes;

public class Pentagon implements Shape{
	
	private int apothem;
	private int side;
	
	public Pentagon(int apothem, int side)
	{
		this.apothem = apothem;
		this.side = side;
	}
	
	public double calculateArea() {
		return (this.apothem * this.side)*2.5;
	}
	
	
	public double calculatePerimeter() {
		return this.side * 5;
	}
	public String toString() {
		return "Pentaogn apothem : " + apothem " Pentagon side: " + side " Pentagon area: " +calculateArea() "Pentagon perimeter: " + calculatePerimeter();
	}
}
