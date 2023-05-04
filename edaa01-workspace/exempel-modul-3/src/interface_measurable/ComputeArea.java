package interface_measurable;

public class ComputeArea {
	
	public static double sumAreas(Measurable[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i].area();
		} 
		return sum;
	}
	
	public static void main(String[] args) {
		Measurable[] theShapes = new Measurable[5];
		theShapes[0] = new Square(100);
		theShapes[1] = new Square(100);
		theShapes[2] = new Circle(50);
		theShapes[3] = new Square(50);
		theShapes[4] = new Square(35);
		System.out.println(sumAreas(theShapes));		
	}
}
