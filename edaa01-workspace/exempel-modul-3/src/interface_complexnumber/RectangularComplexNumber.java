package interface_complexnumber;

public class RectangularComplexNumber implements ComplexNumber {
	private double re;
	private double im;
	
	/** Creates an complex number with real part re and imaginary part im */
	public RectangularComplexNumber(double re, double im) {
		this.re = re;
		this.im = im;
	}
	
	/** Returns imaginary part */
	public double getRe() {
		return re;
	}
	
	/** Returns imaginary part */
	public double getIm() {
		return im;
	}
	
	/** Adds this number and rhs and returns result as a new complex number */
	public ComplexNumber add(ComplexNumber rhs) {
		return new RectangularComplexNumber(getRe() + rhs.getRe(), 
				                   getIm() + rhs.getIm());
	}
	
	/** Returns a string representation of this complex number */
	public String toString() {
		return re + " i" + im;
	}

}
