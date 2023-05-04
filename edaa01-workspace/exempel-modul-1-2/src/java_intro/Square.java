package java_intro;
public class Square {
	private int x; 
	private int y; 
	private int side;

	public Square(int x, int y, int side) { 
		this.x = x;
		this.y = y;
		this.side = side; 
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void move(int dx, int dy) { 
		x += dx;
		y += dy; 
	}

	public void setSide(int side) {
		this.side = side;
	}
	
	public int getSide() {
		return side;
	}

	public int area() {
		return side * side; 
	}
	
	public boolean biggerThan(Square other) {	
		return side > other.side;
	}
}
