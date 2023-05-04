package game;

import javax.swing.JOptionPane;

public class TakePinsGame {

	public static void main(String[] args) {
		int sticks;
		int pins = 8;
		int re = 0;
		boolean run = true;

		Board b = new Board(pins, "Spelbräde");
		UserInterface ui = new UserInterface();
		ComputerPlayer cp = new ComputerPlayer("Beep bop", b);
		HumanPlayer hp = new HumanPlayer("David", b);
		
		Object message = "Ths is the game of sticks, make sure that you are the one who takes the last stick.\nBut you can only take up to two sticks at a time and you have to at least take one";
		JOptionPane.showMessageDialog(null, message);

		while (run){
			hp.takePins(re);
			sticks = b.getPins();

			message = "Number of sticks left: " + Integer.toString(sticks);

			re = ui.askForInt(JOptionPane.showInputDialog(message));
			if (re == -2){
				break;
			}
			else if(re == -3 || (sticks == 1 && re > 1)){
				re = 0;
				message = "Inut a correct number";
			}
			else if(re == b.getPins()){
				message = "You won, congratulations!";
				run = false;
			}
			else
			{
				int cpRem = cp.computerRemove(b.getPins() - re);
				message = "The computer took " + Integer.toString(cpRem) + " sticks.";
			}
			JOptionPane.showMessageDialog(null, message);

			if (b.getPins() - re == 0 && run){
				JOptionPane.showMessageDialog(null, "You lost, try again :(");
				run = false;
			}
		}
	}
}
