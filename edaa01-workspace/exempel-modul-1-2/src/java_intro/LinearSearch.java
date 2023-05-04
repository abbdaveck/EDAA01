package java_intro;
public class LinearSearch {
	public static void main(String[] args) {
		int[] v = {10, 25, -10, 42, 100};
		System.out.println(LinearSearch.indexOf(v, 41));
		System.out.println(LinearSearch.indexOf(v, 42));
	}
	
	/** Söker efter talet nbr i vektorn a. Om nbr finns
	returneras positionen för nbr, annars -1 */
	public static int indexOf(int[] a, int nbr) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == nbr) {
				return i;
			}
		}
		return -1;
	}
}
	
	