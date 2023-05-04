package textproc;

import java.awt.Container;
import java.util.*;

import javax.swing.*;

public class GeneralWordCounter implements TextProcessor {

    Map<String, Integer> m = new TreeMap<String, Integer>();

    public GeneralWordCounter(Set<String> stopwords){
        for (String word : stopwords){
            m.put(word, 0);
        }
        
    }

    public void process(String w) {
        for (String key : m.keySet()){
            if(key.equals(w)){
               int n = m.get(key);
               m.put(key, n + 1);
            }
        }        
    }

    public List<Map.Entry<String, Integer>> getWordList(){
        
        Set<Map.Entry<String, Integer>> wordSet = m.entrySet();
        List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordSet);
        return wordList;
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
