package eight_queens;
import java.util.Arrays;

public class Board {
	private int[] queens;

	/** 
	 * Skapar ett nytt bräde för åttadamerproblemet. 
	 */
	public Board() {
		this(8);
	}
	
	/** 
	 * Skapar ett nytt bräde med size * size rutor för åttadamerproblemet. 
	 */
	public Board(int size) {
		queens = new int[size];
		Arrays.fill(queens, -1);
	}
		
	/** 
	 * Returnerar brädets dimension. 
	 */
	public int size() {
		return queens.length;
	}

	/**
	 * Försöker placera en dam på rad row, kolumn c. Om det går returneras true,
	 * i annat fall false.
	 */
	public boolean tryAddQueen(int row, int col) {
		if (threatened(row,col)) {
			return false;
		} else {
			queens[row] = col;
			return true;
		}
	}

	/** 
	 * Tar bort damen från rad row. 
	 */
	public void removeQueen(int row, int col) {
		queens[row] = -1;
	}

	/** 
	 * Tömmer brädet. 
	 */
	public void clear() {
		Arrays.fill(queens, -1);
	}

	/**
	 * Returnerar true om rutan row, col innehåller en dam, i annat fall false.
	 */
	public boolean hasQueen(int row, int col) {
		return queens[row] == col;
	}

	/**
	 * Returnerar true om rutan row, col inte hotas av någon dam, i annat fall
	 * false.
	 */
	public boolean threatened(int row, int col) {
		if (queens[row] != -1) { // Det finns redan en dam på samma rad
			return true;
		}
		for (int r = 0; r < queens.length; r++) {
			if (col == queens[r]) { // samma kolumn
				return true;
			}
			if (queens[r] != -1 && Math.abs(col - queens[r]) == Math.abs(row - r)) {
				return true;  // samma diagonal
			}
		}
		return false;
	}

	/** 
	 * Returnerar en strängbeskrivning av brädet. 
	 */
	public String toString() {
		StringBuilder b = new StringBuilder();
		for (int r = 0; r < queens.length; r++) {
			for (int c = 0; c < queens.length; c++) {
				if (queens[r] == c) {
					b.append('Q');
				} else {
					b.append('*');
				}
			}
			b.append('\n');
		}
		return b.toString();
	}
}
