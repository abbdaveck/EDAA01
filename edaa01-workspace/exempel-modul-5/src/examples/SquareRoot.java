package examples;

import javax.swing.JOptionPane;

public class SquareRoot {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Please enter a number: ");
		if (s != null) {
			try {
				double n = Double.valueOf(s);
				double sqrRoot = Math.sqrt(n);
				JOptionPane.showMessageDialog(null, sqrRoot, "Compute square root",
						JOptionPane.PLAIN_MESSAGE);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Wrong input, not a number","", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}