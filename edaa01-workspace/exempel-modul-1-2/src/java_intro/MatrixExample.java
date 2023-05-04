package java_intro;
public class MatrixExample {
	public static void main(String[] args) {	
		// Skapa en 3 x 5-matris med förutbestämda värden.
		int[][] matrix = { { 7, 9, 123, 41, 1 }, { 22, -18, 12, 43, -2 }, { 11, 16, -4, 0, 1 } };
		System.out.println(sum(matrix));	
	}
	
	/** Summera alla talen i matrisen */
	public static int sum(int[][]m) {
		int sum = 0;
		for (int i = 0; i < m.length ; i++) {
			for (int k = 0; k < m[i].length; k++) {
				sum += m[i][k];
			}
		}
		return sum;
	}
}
