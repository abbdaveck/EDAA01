package fractal;

import koch.Koch;
import mountain.Mountain;

public class FractalApplication {
	public static void main(String[] args) {
		Fractal[] fractals = new Fractal[2];
		fractals[1] = new Koch(400);
		fractals[0] = new Mountain(100);
	    new FractalView(fractals, "Fraktaler", 600, 600);
	}
}


// Antag att följande anrop görs: fractalLine(4, 810, 0);
// a) Hur många gånger nås basfallet, dvs. hur många linjer ritas? Svar:
// 4^4 = 256
// b) Hur långa är linjerna? Svar:
// // 810/3^4
