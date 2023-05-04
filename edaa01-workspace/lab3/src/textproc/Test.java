package textproc;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Test {
  public static void main(String[] args) throws FileNotFoundException {

    Scanner s1 = new Scanner(new File("./lab3/nilsholg.txt"));
    s1.findWithinHorizon("\uFEFF", 1);
    s1.useDelimiter("(\\s|,|\\.|:|;|!|\\?|'|\\\")+"); // se handledning

    Scanner s2 = new Scanner(new File("./lab3/undantagsord.txt"));
    Set<String> stopwords = new HashSet<String>();
    while(s2.hasNext()){
        stopwords.add(s2.next().toLowerCase());
    }
    TextProcessor gwc = new GeneralWordCounter(stopwords);

    while (s1.hasNext()) {
        String word = s1.next().toLowerCase();
        gwc.process(word);
    }

    JFrame frame = new JFrame();
    JTextArea textArea = new JTextArea();
    frame.getContentPane().add(textArea, BorderLayout.CENTER);

    List<Map.Entry<String, Integer>> list = gwc.getWordList();// Your list here
    System.out.println(list.size());

    StringBuilder sb = new StringBuilder();
    for (Map.Entry<String, Integer> entry : list) {
      sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
    }

    textArea.setText(sb.toString());

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}