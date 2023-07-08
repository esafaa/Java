package gLABInterface;
// Interface defines a list of public abstract methods to be implemented by the subclasses
public interface Movable {
	
	void moveUp();
	void moveDown();
	void moveLeft();
	void moveRight();
	String getCoordinate();

}
