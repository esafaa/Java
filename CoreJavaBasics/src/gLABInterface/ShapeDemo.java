package gLABInterface;

public abstract class ShapeDemo  {
	protected String color;


	protected double base ;
	protected double width  ;
	protected double height ;


	

	// Creation of accessors and mutators
	public void setColor(String color) {
		this.color = color;
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
