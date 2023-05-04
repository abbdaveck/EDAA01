package compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMultipleFields {
	public static void main(String[] args) {
		Person[] persons = new Person[5];
		persons[0] = new Person("Kili", 1);
		persons[1] = new Person("Balin", 5);
		persons[2] = new Person("Balin", 2);
		persons[3] = new Person("Dori", 4);
		persons[4] = new Person("Fili", 3);

		// Alt 1: Sortera efter namn i första hand och efter id-nummer i andra hand
		Arrays.sort(persons, (p1, p2) -> {
			int nameResult = p1.getName().compareTo(p2.getName());
			if (nameResult != 0) {
				return nameResult;

			} else {
				return p1.getId() - p2.getId();
			}
		});
		
		// Alt 2: Kortare version
		Arrays.sort(persons, Comparator.comparing(Person::getName)
				.thenComparing(Comparator.comparingInt(Person::getId)));
		// Har man ännu fler attribut som ska vara med så kan man lägga till fler
		// anrop av thenComparing
		
		System.out.println(Arrays.toString(persons));	
	}
}
