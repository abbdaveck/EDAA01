package game;

public class HumanPlayer extends Player {
    String userId;
    Board b;

    public HumanPlayer(String userId, Board b){
        super(userId, b);
    }
}
