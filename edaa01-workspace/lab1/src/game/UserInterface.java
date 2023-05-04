package game;

public class UserInterface {

    public int askForInt(String msg) {
        try {
            int intMsg = Integer.parseInt(msg);
            if (intMsg == 1 || intMsg == 2){
                return(intMsg);
            }
            else {
                return -3;
            }

        } catch (Exception e) {
            System.out.println(msg);
            if (msg == null){
                return -2;
            }
            return 0;
        }
    }
}
