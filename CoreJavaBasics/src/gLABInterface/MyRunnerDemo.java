package gLABInterface;

public class MyRunnerDemo {

	public static void main(String[] args) {
		CircleDemo c1 = new CircleDemo(1, 2, 2);
		System.out.println("Area of Circle " + c1.getArea());
		System.out.println("Coordinates are " + c1.getCoordinate());

		c1.moveDown();
		System.out.println("After move Down, Coordinates are " + c1.getCoordinate());

		c1.moveRight();
		System.out.println("After move right, Coordinates are " + c1.getCoordinate());

		c1.moveUp();
		System.out.println("After move Up, Coordinates are " + c1.getCoordinate());

		c1.moveLeft();
		System.out.println("After move left, Coordinates are " + c1.getCoordinate());

		System.out.println("--------Test Polymorphism-------");
		// We can also upcast subclass instances to the Movable interface via
		// Polymorphism, similar to an abstract class.
		Movable c2 = new CircleDemo(5, 10, 200);
		c2.moveUp();
		System.out.println("After move up , Coordinates are " + c2.getCoordinate());
		c2.moveLeft();
		System.out.println("After move Left , Coordinates are " + c2.getCoordinate());
		
		
		System.out.println("******************");
		System.out.println(" New Shape: Rectangle ");
		RectangleDemo r1 = new RectangleDemo(2, 9, 15,20);
		System.out.println("Area of Rectangle is " + r1.getArea());
		System.out.println("Coordinates are " + r1.getCoordinate());

		r1.moveDown();
		System.out.println("After move Down, Coordinates are " + r1.getCoordinate());

		r1.moveRight();
		System.out.println("After move right, Coordinates are " + r1.getCoordinate());

		r1.moveUp();
		System.out.println("After move Up, Coordinates are " + r1.getCoordinate());

		r1.moveLeft();
		System.out.println("After move left, Coordinates are " + r1.getCoordinate());
		
		
		
		
		System.out.println("******************");
		System.out.println(" New Shape: Triangle ");
		TriangleDemo t1 = new TriangleDemo(3, 1, 3,5);
		System.out.println("Area of Triangle is " + t1.getArea());
		System.out.println("Coordinates are " + t1.getCoordinate());

		t1.moveDown();
		System.out.println("After move Down, Coordinates are " + t1.getCoordinate());

		t1.moveRight();
		System.out.println("After move right, Coordinates are " + t1.getCoordinate());

		t1.moveUp();
		System.out.println("After move Up, Coordinates are " + t1.getCoordinate());

		t1.moveLeft();
		System.out.println("After move left, Coordinates are " + t1.getCoordinate());
		
		

	}
}