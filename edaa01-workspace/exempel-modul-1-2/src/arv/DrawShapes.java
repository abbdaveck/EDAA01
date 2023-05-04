package arv;
import se.lth.cs.pt.window.SimpleWindow;

public class DrawShapes {
	public static void main(String[] args) {
		Shape[] theShapes = new Shape[5];
		theShapes[0] = new Square(100, 300, 100);
		theShapes[1] = new Square(400, 200, 100);
		theShapes[2] = new Circle(400, 400, 50);
		theShapes[3] = new Square(450, 450, 50);
		theShapes[4] = new Square(200, 200, 35);
		SimpleWindow w = new SimpleWindow(600, 600, "Kvadrater och cirklar");
		
		for (int i = 0; i < theShapes.length; i++) {
			theShapes[i].move(10, 10);
		}
		
		for (int i = 0; i < theShapes.length; i++) {
			theShapes[i].draw(w);
		}
	}
}
