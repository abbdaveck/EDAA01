package textproc;

import java.awt.Container;
import java.util.*;

import javax.swing.*;

public class GeneralWordCounter implements TextProcessor {

    Map<String, Integer> m = new TreeMap<String, Integer>();
    Set<String> stopwords;

    public GeneralWordCounter(Set<String> stopwords){
        for (String word : stopwords){
            m.put(word, 0);
        }
        this.stopwords = stopwords;
        
    }

    public void process(String w) {
        if(stopwords.contains(w)){

        } else if (m.containsKey(w)){

            int n = m.get(w);
            m.put(w, n + 1);
        }
        else{
            m.put(w, 1);
        }
        // for (String key : m.keySet()){
        //     if(!m.contains(w)){
        //        int n = m.get(key);
        //        m.put(key, n + 1);
        //     }
        // }        
    }

    public List<Map.Entry<String, Integer>> getWordList(){
        
        Set<Map.Entry<String, Integer>> wordSet = m.entrySet();
        List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordSet);
        return wordList;
    }

    public class BookReaderController {
        public BookReaderController(GeneralWordCounter counter) {
        SwingUtilities.invokeLater(() -> createWindow(counter, "BookReader", 100, 300));
        }
        private void createWindow(GeneralWordCounter counter, String title,
        int width, int height) {
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane = frame.getContentPane();
        // pane är en behållarkomponent till vilken de övriga komponenterna
        //(listvy, knappar etc.) ska läggas till.
        frame.pack();
        frame.setVisible(true);
        }
        }



    public void report() {
        Set<Map.Entry<String, Integer>> wordSet = m.entrySet();
        List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordSet);

        wordList.sort((j1,j2) -> {
            int rest = j2.getValue() - j1.getValue();
            if (rest !=0){
                return rest;
            }
            else {
                return j1.getKey().compareTo(j2.getKey());
            }
            });
            
        for (int i = 0; i < 5; i++) {
            System.out.println(wordList.get(i));
        }
        // for (String key : m.keySet()){
        //     System.out.println(key + ": " + m.get(key));
        // }            
    }
}
