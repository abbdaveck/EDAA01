package small_examples;
public class FactorialWithPrinting {
		
	/** Beräknar n! */
	public static int factorial(int n) {
		if (n == 0) {	
			System.out.println("Basfall. Anrop där n har värdet " + n + ". Returnerar 1");
			return 1;
		} else {
			System.out.println("Anrop där n har värdet " + n);
			int res = n * factorial(n - 1);
			System.out.println("Tillbaka till anrop där n har värdet " + n + ". Returnerar " + res);
			return res;
		}
	}		
	
	public static void main(String[] args) {
		System.out.println("Resultat: " + FactorialWithPrinting.factorial(3));	
	}	
}
