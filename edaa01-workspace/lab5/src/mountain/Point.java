package mountain;

public class Point {
	private int x, y;

	/** Constructs and initializes a point at the specified (x,y) location. */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/** 
	 * Returns the x coordinate. 
	 * @return the x coordinate
	 */
	public int getX() {
		return x;
	}

	/** 
	 * Returns the y coordinate. 
	 * @return the y coordinate
	 */
	public int getY() {
		return y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point p = (Point) obj;
			return x == p.x && y == p.y;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
	    return  31 * x + y;
	}
	
	public Point getMiddle(Point secondPoint, double dev){		//Räkar ut koordinaten mellan this och den andra punkten som vi skickar in som en parameter
		int midX = (getX() + secondPoint.getX())/2;
		int midY = (getY() + secondPoint.getY())/2 + (int)RandomUtilities.randFunc(dev);
		return new Point(midX, midY);
	}


}
