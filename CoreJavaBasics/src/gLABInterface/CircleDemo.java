package gLABInterface;

public class CircleDemo extends ShapeDemo implements Movable {
	protected double radius;
	private int x, y; // x and y coordinates of the point
	private final double PI = Math.PI;

	public CircleDemo(int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public CircleDemo(double radius) {
		this.radius = radius;
	}

	public CircleDemo(double radius, double height) {
		this.radius = radius;
		super.height = height;
	}

	@Override
	public double getArea() {
		double area = PI * Math.pow(radius, 2);
		return area;
	}

	@Override
	public void displayshapName() {
		System.out.println("Drawing a Circle of radius " + this.radius);
	}

	@Override
	public String toString() {
		return "Circle[ radius = " + radius + super.toString() + "] ";
	}

	// since Circle implements Movable it needs to give an implementation to all
	// it's abstract methods

	@Override
	public String getCoordinate() {
		return "(" + x + "," + y + ")";
	}

	@Override
	public void moveUp() {
		y--;
	}

	@Override
	public void moveDown() {
		y++;
	}

	@Override
	public void moveLeft() {
		x--;
	}

	@Override
	public void moveRight() {
		x++;
	}

}
