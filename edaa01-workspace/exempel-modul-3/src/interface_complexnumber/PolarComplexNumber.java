package interface_complexnumber;

public class PolarComplexNumber implements ComplexNumber {
	private double r;
	private double theta;
	
	public PolarComplexNumber(double re, double im) {
		r = Math.sqrt(re * re + im * im);
		theta = Math.atan2(im, re);
	}

	/** returns real part */
	public double getRe() {
		return r * Math.cos(theta);
	}
	
	/** returns imaginary part */
	public double getIm() {
		return r * Math.sin(theta);
	}
	
	/** adds this number and rhs and returns result as a new complex number */
	public ComplexNumber add(ComplexNumber rhs) {
		return new PolarComplexNumber(getRe() + rhs.getRe(), 
				                      getIm() + rhs.getIm());
	}

	/** returns a string representation of this complex number */
	public String toString() {
		return getRe() + " + i" + getIm();
	}
}
