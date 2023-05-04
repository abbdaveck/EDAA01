package examples;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class ListExample {

	public ListExample() {
		SwingUtilities.invokeLater(() -> createWindow());
	}

	private void createWindow() {
		JFrame frame = new JFrame("A window with a list");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container pane = frame.getContentPane();
		
		JLabel label = new JLabel(" ");
		label.setBorder(new EmptyBorder(5,10,5,10));

		List<Integer> nbrs = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			nbrs.add(i * 10);
		}
		
		DefaultListModel<Integer> listModel = new DefaultListModel<>();
		listModel.addAll(nbrs);
		
		JList<Integer> listView = new JList<>(listModel);
		listView.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listView.addListSelectionListener(event -> {
			label.setText(Integer.toString(listView.getSelectedIndex()) + ": "
					+ Integer.toString(listView.getSelectedValue()));
		});
		
		JScrollPane scrollPane = new JScrollPane(listView);
		scrollPane.setPreferredSize(new Dimension(200, 100));
		scrollPane.setBorder(new EmptyBorder(5,10,5,10));
				
		pane.add(scrollPane, BorderLayout.CENTER);
		pane.add(label, BorderLayout.SOUTH);
		
		
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new ListExample();
	}
}
