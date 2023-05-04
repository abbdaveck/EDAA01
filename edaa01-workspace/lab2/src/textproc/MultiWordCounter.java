package textproc;

import java.util.*;

public class MultiWordCounter implements TextProcessor{
    
    Map<String, Integer> m = new TreeMap<String, Integer>();



    public MultiWordCounter(String[] words){
        for (int i = 0; i < words.length; i++) {
            m.put(words[i], 0);
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

    public void report() {
        for (String key : m.keySet()){
            System.out.println(key + ": " + m.get(key));
        }
    }
}
