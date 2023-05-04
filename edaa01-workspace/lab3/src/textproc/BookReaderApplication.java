package textproc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BookReaderApplication {
    
    public static void main(String[] args) throws FileNotFoundException{

        Scanner s1 = new Scanner(new File("./lab3/nilsholg.txt"));
        s1.findWithinHorizon("\uFEFF", 1);
        s1.useDelimiter("(\\s|,|\\.|:|;|!|\\?|'|\\\")+"); // se handledning

        Scanner s2 = new Scanner(new File("./lab3/undantagsord.txt"));
        Set<String> stopwords = new HashSet<String>();
        while(s2.hasNext()){
            stopwords.add(s2.next().toLowerCase());
        }
        GeneralWordCounter gwc = new GeneralWordCounter(stopwords);

        while (s1.hasNext()) {
            String word = s1.next().toLowerCase();
            if (!Character.isDigit(word.charAt(0))){
                gwc.process(word);
            }
        }

        BookReaderController brc = new BookReaderController(gwc);
    }
}

