package shapes;

public class Parallelogram implements Shape
{
	private int length;
	private int height;
	private int width;

	public Parallelogram(int length, int height, int width) {
		this.length = length;
		this.height = height;
		this.width = width;
	}


	public double calculateArea() {
		// To be written by student
	return this.length*this.height;
	}


	public double calculatePerimeter() {
		// To be written by student
		return 2*(this.length+this.width);
	}


	public String toString() {
		return "Parallelogram height: " + height + " Length: " + length + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}

}
