package game;

public class Player {
    String userId;
    Board b;

    public Player(String userId, Board b){
        this.userId = userId;
        this.b = b;
    }

    String getUserId(){
        return userId;
    }

    void takePins(int pins){
        b.changePins(-pins);
    }
    
}
