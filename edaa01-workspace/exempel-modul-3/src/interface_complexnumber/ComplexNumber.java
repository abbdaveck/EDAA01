package interface_complexnumber;

public interface ComplexNumber {
	/** returns real part */
	double getRe();

	/** returns imaginary part */
	double getIm();

	/** adds this number and rhs and returns result as a new complex number */
	ComplexNumber add(ComplexNumber rhs);

}
