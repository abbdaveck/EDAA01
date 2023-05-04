package binarysearch;

public class SearchPersonExample {
	public static void main(String[] args) {
		
		Person[] a = new Person[4];
		a[0] = new Person("Kili", 1);
		a[1] = new Person("Balin", 2);
		a[2] = new Person("Dori", 3);
		a[3] = new Person("Fili", 4);
		// Personerna är sorterade efter idnummer.
		// Klassen Person förutsätts implementera Comparable<Person> och ha en  
		// compareTo-metod där idnummer jämförs.
		
		System.out.println(BinarySearch.indexOf(a, new Person(null, 2)) == 1);
		
		// Exempel med Comparator. 
		// Personerna är sorterade efter namn
		a[0] = new Person("Balin", 2);
		a[1] = new Person("Dori", 3);
		a[2] = new Person("Fili", 4);
		a[3] = new Person("Kili", 1);
		System.out.println(BinarySearch.indexOf(a, new Person("Kili", -1), 
		(p1, p2) ->  p1.getName().compareTo(p2.getName())) == 3);
	}
}
