package compare;
import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		Person[] persons = new Person[4];
		persons[0] = new Person("Kili", 1);
		persons[1] = new Person("Balin", 2);
		persons[2] = new Person("Dori", 4);
		persons[3] = new Person("Fili", 3);
		
		// Sortera efter id-nummer.
		Arrays.sort(persons);
		System.out.println(Arrays.toString(persons));
		
		// Sortera efter namn
		Arrays.sort(persons, (p1, p2)-> p1.getName().compareTo(p2.getName()));
		System.out.println(Arrays.toString(persons));
		
		// Sortera efter avtagande id-nummer
		Arrays.sort(persons, (p1, p2) ->  p2.getId() - p1.getId());  
		System.out.println(Arrays.toString(persons));

	}
}
