package gLABAbstraction;

public class Triangle extends Shape {

	// no argument Constructor

	public Triangle() {

	}

	public Triangle(String color) {
		super.color = color;
	}


	@Override
	public double getArea() { // Overriding the method getArea of shape
		return 0.5 * base * height;
	}

	// Overriding method of base class with different implementation
	@Override
	public void displayshapName() {
		System.out.println("I am a TriAngle");
	}

	/** Returns a self-descriptive string */
	@Override
	public String toString() {
		return "Triangle[base=" + base + ",height=" + height + "," + super.toString() + "]";
	}
}
