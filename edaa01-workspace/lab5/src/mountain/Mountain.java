package mountain;

import java.util.HashMap;
import java.util.Map;

import fractal.*;

public class Mountain extends Fractal {
	private int length;
    private Map <Side, Point> hm = new HashMap<Side,Point>();


	public Mountain(int length) {
		super();
		this.length = length;
	}

	public String getTitle() {
		return "Mountain";
	}

	public void draw(TurtleGraphics turtle) {
		turtle.moveTo(turtle.getWidth() / 2.0 - length, 
			turtle.getHeight() / 2.0 + Math.sqrt(3.0) * length / 4.0);
		Point p1 = new Point((int)turtle.getX(), (int)turtle.getY());			//Skapar tre punkter och ritar ut en triangel mellan dem
		Point p2 = new Point((int)turtle.getX() + 500, (int)turtle.getY());
		Point p3 = new Point((int)turtle.getX() + 200, (int)turtle.getY() - 330);
		
		fractalTriangle(turtle, order, p1, p2, p3, 30);
	}

	public Point middleFunc(Point p1, Point p2, double dev) {
		Side side = hm.keySet().stream()
			.filter(s -> s.equals(new Side(p1, p2)))
			.findFirst()
			.orElse(null);
			
			// Skapar ett set av nycklar från HasMapen hm, gör sedan om dem till sen stream och utför en sortering med en 
			// lambdafunktion och kollar om det finns en Side med Pointsen p1 och p2. Om det finns tar jag det första elementet och 
			// sätter varabeln side till det. Om det inte finns sätter jag side till null

		if (side != null){
			return hm.get(side);
		}
		Point newPoint = p1.getMiddle(p2, dev);
		hm.put(new Side(p1, p2), newPoint);		//Sparar mittpunkten med en nyckel av de två ursprungspunkterna
		return newPoint;
	}

	private void fractalTriangle(TurtleGraphics turtle, int order, Point p1, Point p2, Point p3, double dev) {
		if (order == 0){	//Ritar triangeln genom de tre punkter jag fått
			turtle.moveTo(p1.getX(), p1.getY());
			turtle.forwardTo(p2.getX(), p2.getY());
			turtle.forwardTo(p3.getX(), p3.getY());
			turtle.forwardTo(p1.getX(), p1.getY());
		}
		else {				//Rekrusivet anrop om ordern är störe än 0, skapar 4 trianglar med "hörnen" på samma ställe som triangelns i ordern ovanför, mittpunkterna generas
			fractalTriangle(turtle, order-1, p1, middleFunc(p1, p2, dev), middleFunc(p3, p1, dev), dev/2);
			fractalTriangle(turtle, order-1, middleFunc(p1, p2, dev), p2, middleFunc(p2, p3, dev), dev/2);
			fractalTriangle(turtle, order-1, middleFunc(p3, p1, dev), middleFunc(p2, p3, dev), p3, dev/2);
			fractalTriangle(turtle, order-1, middleFunc(p1, p2, dev), middleFunc(p2, p3, dev), middleFunc(p3, p1, dev), dev/2);
		}
	}

}
