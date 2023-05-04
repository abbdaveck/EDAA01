package interface_complexnumber;

public class MainComplexNumbers {

	public static void main(String[] args) {
		ComplexNumber c1 = new RectangularComplexNumber(1,2);
		ComplexNumber c2 =  new RectangularComplexNumber(2,3);
		ComplexNumber c3 = c2.add(c1);
		System.out.println(c3);
	}
}
