package textproc;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

public class BookReaderController {

	int counter = 0;

	public BookReaderController(GeneralWordCounter counter) {
		SwingUtilities.invokeLater(() -> createWindow(counter, "BookReader", 100, 300));
	}

	private void createWindow(GeneralWordCounter counter, String title,
		int width, int height) {
		JFrame frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container pane = frame.getContentPane();
		// pane är en behållarkomponent till vilken de övriga komponenterna(listvy, knappar etc.) ska läggas till.
		
		SortedListModel<Map.Entry<String, Integer>> slm = new SortedListModel<>(counter.getWordList());
		// slm.removeIf()
	
		JList<Map.Entry<String, Integer>> list = new JList<>(slm);
		JScrollPane scroll = new JScrollPane(list);
		pane.add(scroll, BorderLayout.NORTH);
		scroll.setPreferredSize(new Dimension(width, height));

		JPanel jp = new JPanel();
		JRadioButton alphButton = new JRadioButton("Alphabetic");
		JRadioButton freqButton = new JRadioButton("Frequency");
		JButton schButton = new JButton("Search");
		JTextField text = new JTextField("");
		text.setPreferredSize(new Dimension(60, 30));
		ButtonGroup bg = new ButtonGroup();
		bg.add(alphButton);
		bg.add(freqButton);
		jp.add(alphButton, BorderLayout.SOUTH);
		jp.add(freqButton, BorderLayout.SOUTH);
		jp.add(schButton, BorderLayout.SOUTH);
		jp.add(text, BorderLayout.NORTH);

		alphButton.addActionListener(event -> { slm.sort((j1, j2) -> j1.getKey().compareTo(j2.getKey())); });
		freqButton.addActionListener(event -> { slm.sort((j1, j2) -> j2.getValue() - j1.getValue()); });
		schButton.addActionListener(event -> {
			String tempText = text.getText().toLowerCase().trim();
			int index = -1;
			for (int i = 0; i < slm.getSize(); i++) {
				if(tempText.equals(slm.getElementAt(i).getKey().toLowerCase().trim())){
					index = i;
					break;
				}
			}
			if(index != -1){
				list.setSelectedIndex(index);
				list.ensureIndexIsVisible(index);
			}
			else{
				JOptionPane.showMessageDialog(null, null, "Ordet finns inte", JOptionPane.PLAIN_MESSAGE);
			}
		});

		pane.add(jp, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}

}