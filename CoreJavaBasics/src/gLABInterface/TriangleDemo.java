package gLABInterface;

public class TriangleDemo extends ShapeDemo implements Movable{

	
	private int x, y; // x and y coordinates of the point
	
	public TriangleDemo(int x, int y, double base, double height) {
		this.x = x;
		this.y = y;
		super.base=base;
		super.height=height;
		
	}
	
	public double getArea() { // calculate the area using the formula specific to Triangle
		return 0.5 * base * height;
	}
	
	@Override
	public void displayshapName() {
		System.out.println("I am a Triangle");
	}

	/** return the details of rectangle */
	@Override
	public String toString() {
		return "Triangle[base=" + base + ",height=" + height + "," + super.toString() + "]";
	}
	
	// since Triangle implements Movable it needs to give an implementation to all
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
