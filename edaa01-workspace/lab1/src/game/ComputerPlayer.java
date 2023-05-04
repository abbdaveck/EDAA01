package game;

public class ComputerPlayer extends Player {
    
    String userId;
    Board b;

    public ComputerPlayer(String userId, Board b){
        super(userId, b);
    }

    int computerRemove(int pinsLeft){
        if (pinsLeft == 1){
            takePins(1);
            return 1;
        }
        else{
            int num = (int)Math.round(Math.random()) + 1;
            takePins(num);
            return num;
        }
    }
}
