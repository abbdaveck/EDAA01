package eight_queens;
public class Solver {
	private Board board;

	/**
	 * Skapar ett objekt som kan lösa problemet att placera 8 damer på schackbrädet 
	 * board utan att de hotar varandra.
	 */
	public Solver(Board board) {
		this.board = board;
	}

	/**
	 * Försöker placera ut damer på bräddet, en på varje rad utan att de hotar
	 * varandra. Returnerar true ifall det finns en lösning, i annat fall false.
	 **/
	public boolean solve() {
		board.clear();
		return solve(0);
	}
	
	/*
	 * Försöker placera ut damer på brädet, en på varje rad, med början på rad row.
	 * Returnerar true ifall det finns en lösning, i annat fall false.
	 */
	private boolean solve (int row) {
		if (row == board.size()) {
			return true;
		}
		for (int col = 0; col < board.size(); col++) {
			if (board.tryAddQueen(row, col)) {
				if (solve(row + 1)) {
					return true;
				}
				board.removeQueen(row, col);
			}
		}
		return false;
	}

	/**
	 * Beräknar antal lösningar på problemet att placera ut 8 damer.
	 */
	public int nbrSolutions() {
		board.clear();
		return nbrSolutions(0);
	}
	
	/*
	 * Placerar ut damer på brädet, en på varje rad, med början på rad row.
	 * Returnerar antalet lösningar.
	 */
	private int nbrSolutions(int row) {
		if (row == board.size()) {
			return 1;
		}
		int solutions = 0;
		for (int col = 0; col < board.size(); col++) {
			if (board.tryAddQueen(row, col)) {
				solutions += nbrSolutions(row + 1);
				board.removeQueen(row, col);
			}
		}
		return solutions;
	}

	public static void main(String[] args) {
		Board b = new Board();
		Solver s = new Solver(b);
		boolean solutionExist = s.solve();
		System.out.println(solutionExist);
		System.out.println(b);
		
		int solutions = s.nbrSolutions();
		System.out.println(solutions);
	}

}
