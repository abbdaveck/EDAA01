package arv;
import se.lth.cs.pt.window.SimpleWindow;

public class Circle extends Shape {
	private int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius(){
		return radius;
	}

	public void draw(SimpleWindow w) {
		w.moveTo(x + radius, y);
		for (int i = 1; i <= 180; i++) {
		w.lineTo(x +( int) (radius * Math.cos(2 * i  *Math.PI/180)),
		         y + (int) (radius * Math.sin(2 * i * Math.PI/180))); 
		}   
	}
}


