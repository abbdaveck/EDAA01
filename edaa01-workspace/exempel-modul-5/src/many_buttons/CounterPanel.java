package many_buttons;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CounterPanel extends JPanel {
	private JButton button;
	private JLabel label;
	private int counter;
	
	public CounterPanel(String s) {
		button = new JButton(s);
		button.addActionListener(event -> {		
				counter++;
				label.setText(Integer.toString(counter));
		});
		label = new JLabel("0");
		add(button);
		add(label);
	}
}
