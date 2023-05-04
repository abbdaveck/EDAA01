package generic_methods;
import java.util.Arrays;

public class Utilities {
	/* Fyller alla platser i a med elementet x */
	public static <T> void fill(T[] a, T x) {
		for (int i = 0; i < a.length; i++) {
			a[i] = x;
		} 
	}

	public static void main(String[] args) {
		Integer[] nbrs = new Integer[10];
		Utilities.fill(nbrs, -1);
		System.out.println(Arrays.toString(nbrs));

		String[] strings = new String[5];
		Utilities.fill(strings, "abc");
		System.out.println(Arrays.toString(strings));
	}
}