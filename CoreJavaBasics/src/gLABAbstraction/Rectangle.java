package gLABAbstraction;

public class Rectangle extends Shape {

	// creation of different constructors
	public Rectangle(String color) {
		super.color= color;
	}

	public Rectangle() {
	}

	public Rectangle(String color, double area, double base, double width, double height) {
		super.color= color;
		super.area=area;
		super.base=base;
		super.width=width;
		super.height=height;
	}

	
	@Override
	public double getArea() { // calculate the area using the formula specific to Rectangle
		return width * height;
	}



	// Overriding method of base class with different implementation
	@Override
	public void displayshapName() {
		System.out.println("I am a Rectangle");
	}

	/** return the details of rectangle */
	@Override
	public String toString() {
		return "Rectangle[height=" + height + ",width=" + width + "," + super.toString() + "]";
	}
}
