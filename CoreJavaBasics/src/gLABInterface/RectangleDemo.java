package gLABInterface;

public class RectangleDemo extends ShapeDemo implements Movable{
	
	private int x, y; // x and y coordinates of the point
	
	public RectangleDemo(int x, int y, double width, double height) {
		this.x = x;
		this.y = y;
		super.width=width;
		super.height=height;
		
	}
	
	public double getArea() { // calculate the area using the formula specific to Rectangle
		return width * height;
	}
	
	@Override
	public void displayshapName() {
		System.out.println("I am a Rectangle");
	}

	/** return the details of rectangle */
	@Override
	public String toString() {
		return "Rectangle[height=" + height + ",width=" + width + "," + super.toString() + "]";
	}
	
	// since Rectangle implements Movable it needs to give an implementation to all
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
