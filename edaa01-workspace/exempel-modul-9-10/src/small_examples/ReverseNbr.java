package small_examples;
public class ReverseNbr {
	
	public static void printReverse(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Argument < 0");
		}
		reverse(n);
		System.out.println();
	}

	private static void reverse(int n) {
		if (n < 10) {
			System.out.print(n);
		} else {
			System.out.print(n % 10);
			reverse(n / 10);
		}
	}
	
	public static void main(String[] args) {
		ReverseNbr.printReverse(257);
	}

}
