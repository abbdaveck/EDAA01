package game;

public class Board {

	int pins;
	String boardName;

	public Board(int pins, String boardName){
		this.pins = pins;
		this.boardName = boardName;
	}

	void changePins(int diff){
		pins += diff;
	}

	public int getPins(){
		return pins;
	}

}
