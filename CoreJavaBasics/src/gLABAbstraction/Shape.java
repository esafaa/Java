package gLABAbstraction;

public abstract class Shape {
	protected String color;

	protected double area = 1.0;
	protected double base = 1.0;
	protected double width = 1.0;
	protected double height = 1.0;


	

	// Creation of accessors and mutators
	public void setColor(String color) {
		this.color = color;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// Overriding the toString method
	@Override
	public String toString() {
		return "Shape[color=" + color + "]";
	}

	
	// The getArea method is abstract
	// It must be overridden in a subclass.
	/** All shapes must provide a method called getArea() */
	public abstract double getArea() ;

		

	public void displayshapName() {
		System.out.println("I am a Shape.");
	}
}
