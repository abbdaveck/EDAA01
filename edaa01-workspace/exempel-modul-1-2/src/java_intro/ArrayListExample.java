package java_intro;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// Skapa en lista som kan innehålla strängar
		ArrayList<String> words = new ArrayList<String>();
		words.add("en");
		words.add("lista");
		words.add("med");
		words.add("ord");
		System.out.println(words);
		
		// Sök i listan
		System.out.println(words.indexOf("ord"));
		System.out.println(words.contains("ord"));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(53);
		list.add(-11);
		list.add(42);
		list.add(-8);
		list.add(42);	
		
		// Iterera genom listan
		int sum = 0;
		for (int n : list) { // för varje heltal n i list
			sum = sum + n;
		}
		System.out.println(sum);		
	}
}
