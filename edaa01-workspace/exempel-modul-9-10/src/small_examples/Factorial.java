package small_examples;
public class Factorial {
		
	/** Beräknar n! */
	public static long factorial(int n) {
		if (n == 0) {	
			return 1;
		} else {
			return n * factorial(n - 1);	
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Resultat: " + Factorial.factorial(3));	
	}
}
