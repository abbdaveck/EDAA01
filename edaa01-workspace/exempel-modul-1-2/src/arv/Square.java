package arv;
import se.lth.cs.pt.window.SimpleWindow;

public class Square extends Shape {
	private int side;

	public Square(int x, int y, int side) {
		super(x, y);
		this.side = side;
	}

	public int getSide(){
		return side;
	}

	public void draw(SimpleWindow w) {
		w.moveTo(x, y);
		w.lineTo(x + side, y);
		w.lineTo(x + side, y + side);
		w.lineTo(x, y+side);
		w.lineTo(x, y);
	}
}


