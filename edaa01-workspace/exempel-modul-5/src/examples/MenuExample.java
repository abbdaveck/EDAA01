package examples;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class MenuExample {

	public MenuExample() {
		SwingUtilities.invokeLater(() -> createWindow());
	}

	private void createWindow() {
		JFrame frame = new JFrame("A window with a menu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container pane = frame.getContentPane();

		JLabel label = new JLabel("");

		JMenuItem miOpen = new JMenuItem("Open");
		miOpen.addActionListener((event) -> label.setText("Open file"));
		JMenuItem miSave = new JMenuItem("Save");
		miSave.addActionListener((event) -> label.setText("Save file"));
		JMenu fileMenu = new JMenu("File");
		fileMenu.add(miOpen);
		fileMenu.add(miSave);
		
		JMenu aboutMenu = new JMenu("About");
		
		JMenuBar mb = new JMenuBar();
		mb.add(fileMenu);
		mb.add(aboutMenu);
		
		pane.add(mb, BorderLayout.NORTH);
		pane.add(label, BorderLayout.SOUTH);			
		pane.setPreferredSize(new Dimension(250, 100));

		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new MenuExample();
	}
}
