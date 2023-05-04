/**package textproc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Holgersson {

	public static final String[] REGIONS = { "blekinge", "bohuslän", "dalarna", "dalsland", "gotland", "gästrikland",
			"halland", "hälsingland", "härjedalen", "jämtland", "lappland", "medelpad", "närke", "skåne", "småland",
			"södermanland", "uppland", "värmland", "västerbotten", "västergötland", "västmanland", "ångermanland",
			"öland", "östergötland" };

	public static void main(String[] args) throws FileNotFoundException {		//Räkna län
		long t0 = System.nanoTime();

		TextProcessor r = new MultiWordCounter(REGIONS);
		ArrayList<TextProcessor> tp = new ArrayList<TextProcessor>();
		tp.add(new SingleWordCounter("nils"));
		tp.add(new SingleWordCounter("norge"));

		Scanner s1 = new Scanner(new File("./lab2/nilsholg.txt"));
		s1.findWithinHorizon("\uFEFF", 1);
		s1.useDelimiter("(\\s|,|\\.|:|;|!|\\?|'|\\\")+"); // se handledning

		Scanner s2 = new Scanner(new File("./lab2/undantagsord.txt"));
		Set<String> stopwords = new HashSet<String>();
		while(s2.hasNext()){
			stopwords.add(s2.next().toLowerCase());
		}
		TextProcessor gwc = new GeneralWordCounter(stopwords);

		while (s1.hasNext()) {
			String word = s1.next().toLowerCase();
			r.process(word);
			tp.get(0).process(word);
			tp.get(1).process(word);
			gwc.process(word);
		}
		r.report();
		System.out.println("\n");
		tp.get(0).report();
		System.out.println("\n");
		tp.get(1).report();
		System.out.println("\n");
		gwc.report();
		System.out.println("\n");
		long t1 = System.nanoTime();
		System.out.println("tid: " + (t1 - t0) / 1000000.0 + " ms");
		s1.close();

	}
}

//Medianvärde HashMap: 1074.7366 ms
//Medianvärde TreeMap: 859.7453 ms*/